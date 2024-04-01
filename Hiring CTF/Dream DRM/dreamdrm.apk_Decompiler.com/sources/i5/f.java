package i5;

import androidx.compose.ui.platform.e;
import b1.o;
import h5.c;
import h5.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class f implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final e f3613f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Method f3614a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f3615b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f3616c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3617d;

    /* renamed from: e  reason: collision with root package name */
    public final Class f3618e;

    public f(Class cls) {
        this.f3618e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        o.l(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3614a = declaredMethod;
        this.f3615b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f3616c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f3617d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f3618e.isInstance(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (!this.f3618e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3616c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            o.l(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e6) {
            if (o.c(e6.getMessage(), "ssl == null")) {
                return null;
            }
            throw e6;
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError(e8);
        }
    }

    public final boolean c() {
        boolean z5 = c.f3462e;
        return c.f3462e;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
        if (this.f3618e.isInstance(sSLSocket)) {
            try {
                this.f3614a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f3615b.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.f3617d;
                n nVar = n.f3500a;
                method.invoke(sSLSocket, new Object[]{e.n(list)});
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }
}
