package i5;

import android.net.ssl.SSLSockets;
import android.os.Build;
import androidx.compose.ui.platform.e;
import b1.o;
import h5.n;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class a implements m {
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        String l6 = sSLSocket.getApplicationProtocol();
        if (l6 != null && (l6.hashCode() != 0 || !l6.equals(""))) {
            return l6;
        }
        return null;
    }

    public final boolean c() {
        n nVar = n.f3500a;
        return e.t() && Build.VERSION.SDK_INT >= 29;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            o.l(sSLParameters, "sslParameters");
            n nVar = n.f3500a;
            Object[] array = e.l(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }
}
