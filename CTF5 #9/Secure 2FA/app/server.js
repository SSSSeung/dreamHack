const crypto = require('crypto');
const express = require('express');
const fs = require('node:fs');
const path = require('path');
const session = require('express-session');
const { authenticator } = require('otplib');
const { createClient } = require('redis');

authenticator.options = { window: 30 };  // TOTP time window for 30 seconds

const ADMIN_PASSWORD = process.env.ADMIN_PASSWORD;
const ADMIN_SECRET = process.env.ADMIN_SECRET;

var FLAG = '';
try {
    FLAG = fs.readFileSync('/flag', 'utf8');
} catch (err) {
    console.error(err);
    return;
}

let redisClient;
(async() => {
    redisClient = createClient({ url: 'redis://redis_server' });
    redisClient.on('error', err => {
        console.log('error', err);
        return;
    });
    await redisClient.connect();
})();

const app = express();

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.use(session({
    secret: crypto.randomBytes(32).toString(),
    resave: false,
    saveUninitialized: true,
    cookie: { secure: false }
}));

app.use(express.urlencoded({ extended: true }));

var accounts = {
    'admin': {
        'password': crypto.createHash('sha256').update(ADMIN_PASSWORD).digest('hex'),
        'name': 'Carl Dream',
        'age': 0,
        'email': 'carl@example.com',
        'secret': ADMIN_SECRET
    },
    'guest': {
        'password': crypto.createHash('sha256').update('guest').digest('hex'),
        'name': 'Guest Kim',
        'age': 0,
        'email': 'guest@example.com',
        'secret': ''
    }
}

function validateAge(age) {
    const ageRegex = /^[0-9]+$/;
    return ageRegex.test(age);
}

function validateEmail(email) {
    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailRegex.test(email);
}

function getExpirationSeconds() {
    const date = new Date;
    return 30 - date.getSeconds() % 30;
}

async function getFailureCount(username) {
    const expirationSeconds = getExpirationSeconds();
    const redisKey = `TOTP_AUTH_FAILURE_COUNT:${accounts[username].email}`;
    const ret = await redisClient.multi()
        .incr(redisKey)
        .expire(redisKey, expirationSeconds, 'NX')
        .exec();
    return ret[0] - 1;
}

app.get('/admin', (req, res) => {
    if (req.session.isAdmin !== true) {
        res.status(403);
        res.send('you are not admin.');
        return;
    }
    res.render('totp');
});

app.post('/admin', async (req, res) => {
    if (req.session.isAdmin !== true) {
        res.status(403);
        res.send('you are not admin.');
        return;
    }

    const failureCount = await getFailureCount(req.session.username);
    if (failureCount >= 5) {
        res.status(403);
        res.send('too many requests.');
        return;
    }

    const token = req.body.token;
    if (!token) {
        res.status(400);
        res.send('invalid age is given.');
        return;
    }

    const account = accounts[req.session.username];
    var isValid = authenticator.check(token, account['secret']);
    if (isValid !== true) {
        res.status(401);
        res.send('TOTP authentication failed.');
        return;
    }

    res.send(FLAG);
});

app.get('/dashboard', (req, res) => {
    if (req.session.isSignedIn !== true) {
        res.status(401);
        res.send('you are not signed in.');
        return;
    }
    res.render('dashboard');
});

app.get('/mypage', (req, res) => {
    if (req.session.isSignedIn !== true) {
        res.status(403);
        res.send('you are not signed in.');
        return;
    }

    const username = req.session.username;
    account = accounts[username];

    res.render('mypage', {
        username: username,
        name: account['name'],
        age: account['age'],
        email: account['email']
    });
});

app.post('/mypage', (req, res) => {
    if (req.session.isSignedIn !== true) {
        res.status(403);
        res.send('you are not signed in.');
        return;
    }

    const new_name = req.body.name;
    const new_age = req.body.age;
    const new_email = req.body.email;
    if (!validateAge(new_age)) {
        res.status(400);
        res.send('invalid age is given.');
        return;
    }
    if (!validateEmail(new_email)) {
        res.status(400);
        res.send('invalid email is given.');
        return;
    }

    const username = req.session.username;
    account = accounts[username];
    account['name'] = new_name;
    account['age'] = Number(new_age);
    account['email'] = new_email.toLowerCase();

    res.render('mypage', {
        username: username,
        name: account['name'],
        age: account['age'],
        email: account['email']
    });
});


app.get('/signin', (req, res) => {
    if (req.session.isSignedIn === true) {
        res.status(403);
        res.send('you are already signed in.');
        return;
    }
    res.render('signin');
});

app.post('/signin', (req, res) => {
    if (req.session.isSignedIn === true) {
        res.status(403);
        res.send('you are already signed in.');
        return;
    }

    const username = req.body.username;
    const password = req.body.password;
    if (!username || !password) {
        res.status(400);
        res.send('username or password is empty.');
        return;
    }

    passwordHash = crypto.createHash('sha256').update(password).digest('hex');
    if (!(username in accounts)
            || !crypto.timingSafeEqual(Buffer.from(passwordHash),
                                       Buffer.from(accounts[username]['password']))
    ) {
        res.status(401);
        res.send('username or password is incorrect.');
        return;
    }

    req.session.username = username;
    req.session.isSignedIn = true;
    req.session.isAdmin = username === 'admin' ? true : false;
    res.redirect('/dashboard');
});

app.post('/signout', (req, res) => {
    if (req.session.isSignedIn !== true) {
        res.status(403);
        res.send('you are not signed in.');
        return;
    }
    req.session.destroy();
    res.redirect('/signin');
});

app.get('/', (req, res) => {
    if (req.session.isSignedIn === true) {
        res.redirect('/dashboard');
        return;
    }
    res.redirect('/signin');
});

app.listen(7000, '0.0.0.0');
