package i5;

import b1.o;
import javax.net.ssl.SSLSocket;
import v4.i;

public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3612a = "com.google.android.gms.org.conscrypt";

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return i.k0(name, this.f3612a + '.', false);
    }

    public final m b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!o.c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
