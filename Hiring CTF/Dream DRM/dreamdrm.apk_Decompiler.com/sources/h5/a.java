package h5;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.compose.ui.platform.e;
import b1.o;
import i5.b;
import i5.f;
import i5.h;
import i5.j;
import i5.l;
import i5.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public final class a extends n {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3458d = (e.t() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3459c;

    public a() {
        m[] mVarArr = new m[4];
        mVarArr[0] = e.t() && Build.VERSION.SDK_INT >= 29 ? new i5.a() : null;
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
        this.f3459c = arrayList;
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
        return bVar != null ? bVar : new k5.a(c(x509TrustManager));
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o.m(list, "protocols");
        Iterator it = this.f3459c.iterator();
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

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f3459c.iterator();
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

    public final boolean h(String str) {
        o.m(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
