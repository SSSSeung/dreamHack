package h5;

import b1.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import k5.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f3461b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3460a = x509TrustManager;
        this.f3461b = method;
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3461b.invoke(this.f3460a, new Object[]{x509Certificate});
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return o.c(this.f3460a, bVar.f3460a) && o.c(this.f3461b, bVar.f3461b);
    }

    public final int hashCode() {
        int i3 = 0;
        X509TrustManager x509TrustManager = this.f3460a;
        int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.f3461b;
        if (method != null) {
            i3 = method.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3460a + ", findByIssuerAndSignatureMethod=" + this.f3461b + ")";
    }
}
