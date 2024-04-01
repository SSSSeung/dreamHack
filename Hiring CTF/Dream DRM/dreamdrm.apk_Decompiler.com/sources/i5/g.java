package i5;

import h5.d;
import h5.e;
import h5.f;
import h5.h;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;
import org.conscrypt.Conscrypt;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3619a;

    public /* synthetic */ g(int i3) {
        this.f3619a = i3;
    }

    private static boolean c(SSLSocket sSLSocket) {
        boolean z5 = e.f3471d;
        return d.g() && (sSLSocket instanceof BCSSLSocket);
    }

    private static boolean d(SSLSocket sSLSocket) {
        boolean z5 = h.f3474d;
        return f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    public final boolean a(SSLSocket sSLSocket) {
        switch (this.f3619a) {
            case 0:
                return c(sSLSocket);
            default:
                return d(sSLSocket);
        }
    }

    public final m b(SSLSocket sSLSocket) {
        switch (this.f3619a) {
            case 0:
                return new h();
            default:
                return new j();
        }
    }
}
