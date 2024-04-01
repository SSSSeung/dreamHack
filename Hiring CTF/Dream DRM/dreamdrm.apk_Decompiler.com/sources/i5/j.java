package i5;

import androidx.compose.ui.platform.e;
import androidx.fragment.app.n0;
import b1.o;
import h5.h;
import h5.n;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class j implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final g f3625a = new g(1);

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f3626b = new n0(19, 0);

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        boolean z5 = h.f3474d;
        return h.f3474d;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            n nVar = n.f3500a;
            Object[] array = e.l(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
