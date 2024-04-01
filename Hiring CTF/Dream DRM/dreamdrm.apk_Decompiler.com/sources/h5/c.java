package h5;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.compose.ui.platform.e;
import b1.o;
import i5.b;
import i5.f;
import i5.h;
import i5.i;
import i5.j;
import i5.l;
import i5.m;
import i5.n;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k5.a;
import k5.d;

public final class c extends n {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f3462e = (e.t() && Build.VERSION.SDK_INT < 30);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3463c;

    /* renamed from: d  reason: collision with root package name */
    public final i f3464d;

    public c() {
        n nVar;
        Method method;
        Method method2;
        m[] mVarArr = new m[4];
        Method method3 = null;
        try {
            nVar = new n(Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl")), Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl")), Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl")));
        } catch (Exception e6) {
            n.f3500a.getClass();
            n.i("unable to load android socket classes", 5, e6);
            nVar = null;
        }
        mVarArr[0] = nVar;
        mVarArr[1] = new l(f.f3613f);
        mVarArr[2] = new l(j.f3626b.p());
        mVarArr[3] = new l(h.f3621b.p());
        ArrayList d02 = g4.h.d0(mVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = d02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f3463c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f3464d = new i(method3, method, method2);
    }

    public final com.bumptech.glide.e b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : new a(c(x509TrustManager));
    }

    public final d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            o.l(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o.m(list, "protocols");
        Iterator it = this.f3463c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        o.m(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i3);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e6);
            }
            throw e6;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3463c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    public final Object g() {
        i iVar = this.f3464d;
        iVar.getClass();
        Method method = iVar.f3622a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = iVar.f3623b;
            o.k(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        o.m(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void j(Object obj, String str) {
        o.m(str, "message");
        i iVar = this.f3464d;
        iVar.getClass();
        boolean z5 = false;
        if (obj != null) {
            try {
                Method method = iVar.f3624c;
                o.k(method);
                method.invoke(obj, new Object[0]);
                z5 = true;
            } catch (Exception unused) {
            }
        }
        if (!z5) {
            n.i(str, 5, (Throwable) null);
        }
    }
}
