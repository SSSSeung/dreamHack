package i5;

import android.net.http.X509TrustManagerExtensions;
import b1.o;
import com.bumptech.glide.e;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public final class b extends e {

    /* renamed from: d  reason: collision with root package name */
    public final X509TrustManager f3607d;

    /* renamed from: e  reason: collision with root package name */
    public final X509TrustManagerExtensions f3608e;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3607d = x509TrustManager;
        this.f3608e = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f3607d == this.f3607d;
    }

    public final List h(String str, List list) {
        o.m(list, "chain");
        o.m(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f3608e.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                o.l(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e6) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
                sSLPeerUnverifiedException.initCause(e6);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3607d);
    }
}
