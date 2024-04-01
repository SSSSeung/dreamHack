package h5;

import androidx.compose.ui.platform.e;
import b1.o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j extends n {

    /* renamed from: c  reason: collision with root package name */
    public final Method f3479c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3480d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f3481e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f3482f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f3483g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3479c = method;
        this.f3480d = method2;
        this.f3481e = method3;
        this.f3482f = cls;
        this.f3483g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f3481e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
        ArrayList l6 = e.l(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f3482f, this.f3483g}, new i(l6));
            this.f3479c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f3480d.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                i iVar = (i) invocationHandler;
                boolean z5 = iVar.f3476a;
                if (!z5 && iVar.f3477b == null) {
                    n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, (Throwable) null);
                    return null;
                } else if (z5) {
                    return null;
                } else {
                    return iVar.f3477b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}
