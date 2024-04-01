package e2;

import android.net.Uri;
import android.text.TextUtils;
import b1.o;
import java.net.URL;
import java.security.MessageDigest;
import y1.f;

public final class m implements f {

    /* renamed from: b  reason: collision with root package name */
    public final n f2522b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f2523c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2524d;

    /* renamed from: e  reason: collision with root package name */
    public String f2525e;

    /* renamed from: f  reason: collision with root package name */
    public URL f2526f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f2527g;

    /* renamed from: h  reason: collision with root package name */
    public int f2528h;

    public m(String str) {
        q qVar = n.f2529a;
        this.f2523c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f2524d = str;
            o.i(qVar);
            this.f2522b = qVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f2527g == null) {
            this.f2527g = c().getBytes(f.f5810a);
        }
        messageDigest.update(this.f2527g);
    }

    public final String c() {
        String str = this.f2524d;
        if (str != null) {
            return str;
        }
        URL url = this.f2523c;
        o.i(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f2526f == null) {
            if (TextUtils.isEmpty(this.f2525e)) {
                String str = this.f2524d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f2523c;
                    o.i(url);
                    str = url.toString();
                }
                this.f2525e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f2526f = new URL(this.f2525e);
        }
        return this.f2526f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return c().equals(mVar.c()) && this.f2522b.equals(mVar.f2522b);
    }

    public final int hashCode() {
        if (this.f2528h == 0) {
            int hashCode = c().hashCode();
            this.f2528h = hashCode;
            this.f2528h = this.f2522b.hashCode() + (hashCode * 31);
        }
        return this.f2528h;
    }

    public final String toString() {
        return c();
    }

    public m(URL url) {
        q qVar = n.f2529a;
        o.i(url);
        this.f2523c = url;
        this.f2524d = null;
        o.i(qVar);
        this.f2522b = qVar;
    }
}
