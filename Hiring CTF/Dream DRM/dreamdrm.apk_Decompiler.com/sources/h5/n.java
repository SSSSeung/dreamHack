package h5;

import b1.o;
import com.bumptech.glide.e;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k5.a;
import k5.b;
import k5.d;
import z4.w;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n f3500a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f3501b = Logger.getLogger(w.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: h5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: h5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: h5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: h5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: h5.c} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r0 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        if (r0 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        if (r0 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L_0x016f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0173  */
    static {
        /*
            androidx.compose.ui.platform.e r0 = new androidx.compose.ui.platform.e
            r0.<init>()
            boolean r0 = androidx.compose.ui.platform.e.t()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0080
            java.util.Map r0 = i5.c.f3610b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet r5 = i5.c.f3609a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = "logger"
            b1.o.l(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x004d
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x0059
        L_0x004d:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x0057
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x0059
        L_0x0057:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x0059:
            r4.setLevel(r3)
            i5.d r3 = i5.d.f3611a
            r4.addHandler(r3)
            goto L_0x0017
        L_0x0062:
            boolean r0 = h5.a.f3458d
            if (r0 == 0) goto L_0x006c
            h5.a r0 = new h5.a
            r0.<init>()
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            if (r0 == 0) goto L_0x0071
            goto L_0x0178
        L_0x0071:
            boolean r0 = h5.c.f3462e
            if (r0 == 0) goto L_0x007a
            h5.c r1 = new h5.c
            r1.<init>()
        L_0x007a:
            b1.o.k(r1)
        L_0x007d:
            r0 = r1
            goto L_0x0178
        L_0x0080:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            b1.o.l(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = b1.o.c(r4, r0)
            if (r0 == 0) goto L_0x00a6
            boolean r0 = h5.h.f3474d
            if (r0 == 0) goto L_0x00a1
            h5.h r0 = new h5.h
            r0.<init>()
            goto L_0x00a2
        L_0x00a1:
            r0 = r1
        L_0x00a2:
            if (r0 == 0) goto L_0x00a6
            goto L_0x0178
        L_0x00a6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            b1.o.l(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = b1.o.c(r4, r0)
            if (r0 == 0) goto L_0x00ca
            boolean r0 = h5.e.f3471d
            if (r0 == 0) goto L_0x00c5
            h5.e r0 = new h5.e
            r0.<init>()
            goto L_0x00c6
        L_0x00c5:
            r0 = r1
        L_0x00c6:
            if (r0 == 0) goto L_0x00ca
            goto L_0x0178
        L_0x00ca:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            b1.o.l(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = b1.o.c(r3, r0)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = h5.m.f3498d
            if (r0 == 0) goto L_0x00e9
            h5.m r0 = new h5.m
            r0.<init>()
            goto L_0x00ea
        L_0x00e9:
            r0 = r1
        L_0x00ea:
            if (r0 == 0) goto L_0x00ee
            goto L_0x0178
        L_0x00ee:
            boolean r0 = h5.k.f3484c
            if (r0 == 0) goto L_0x00f8
            h5.k r0 = new h5.k
            r0.<init>()
            goto L_0x00f9
        L_0x00f8:
            r0 = r1
        L_0x00f9:
            if (r0 == 0) goto L_0x00fd
            goto L_0x0178
        L_0x00fd:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "java.specification.version"
            java.lang.String r4 = "unknown"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.String r4 = "jvmVersion"
            b1.o.l(r3, r4)     // Catch:{ NumberFormatException -> 0x0115 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0115 }
            r4 = 9
            if (r3 < r4) goto L_0x0115
            goto L_0x016f
        L_0x0115:
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            r4 = 1
            java.lang.Class r3 = java.lang.Class.forName(r3, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r5 = java.lang.Class.forName(r5, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6, r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r7[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r7[r4] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.reflect.Method r8 = r3.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r6[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.reflect.Method r9 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r5 = "remove"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r4[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.reflect.Method r10 = r3.getMethod(r5, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            h5.j r0 = new h5.j     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r2 = "putMethod"
            b1.o.l(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r2 = "getMethod"
            b1.o.l(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r2 = "removeMethod"
            b1.o.l(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r2 = "clientProviderClass"
            b1.o.l(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            java.lang.String r2 = "serverProviderClass"
            b1.o.l(r12, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x016f }
            r1 = r0
        L_0x016f:
            if (r1 == 0) goto L_0x0173
            goto L_0x007d
        L_0x0173:
            h5.n r0 = new h5.n
            r0.<init>()
        L_0x0178:
            f3500a = r0
            java.lang.Class<z4.w> r0 = z4.w.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f3501b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.n.<clinit>():void");
    }

    public static void i(String str, int i3, Throwable th) {
        o.m(str, "message");
        f3501b.log(i3 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public e b(X509TrustManager x509TrustManager) {
        return new a(c(x509TrustManager));
    }

    public d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        o.l(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        o.m(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        o.m(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i3);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f3501b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        o.m(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        o.m(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext instance = SSLContext.getInstance("TLS");
        o.l(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k6 = k();
            k6.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = k6.getSocketFactory();
            o.l(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e6) {
            throw new AssertionError("No System TLS: " + e6, e6);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        o.k(trustManagers);
        boolean z5 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z5 = false;
        }
        if (z5) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        o.l(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
