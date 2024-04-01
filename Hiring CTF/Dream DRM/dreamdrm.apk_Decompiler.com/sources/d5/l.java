package d5;

import a2.m;
import androidx.compose.ui.platform.e;
import b1.o;
import b1.v;
import com.bumptech.glide.c;
import e2.f;
import e5.d;
import f5.h;
import g5.a0;
import g5.b;
import g5.b0;
import g5.f0;
import g5.g;
import g5.i;
import g5.k;
import g5.u;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l5.q;
import z4.a;
import z4.d0;
import z4.n;
import z4.p;
import z4.r;
import z4.t;
import z4.w;
import z4.x;
import z4.y;
import z4.z;

public final class l extends k {

    /* renamed from: b  reason: collision with root package name */
    public Socket f2243b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f2244c;

    /* renamed from: d  reason: collision with root package name */
    public p f2245d;

    /* renamed from: e  reason: collision with root package name */
    public x f2246e;

    /* renamed from: f  reason: collision with root package name */
    public u f2247f;

    /* renamed from: g  reason: collision with root package name */
    public q f2248g;

    /* renamed from: h  reason: collision with root package name */
    public l5.p f2249h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2250i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2251j;

    /* renamed from: k  reason: collision with root package name */
    public int f2252k;

    /* renamed from: l  reason: collision with root package name */
    public int f2253l;

    /* renamed from: m  reason: collision with root package name */
    public int f2254m;

    /* renamed from: n  reason: collision with root package name */
    public int f2255n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f2256o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public long f2257p = Long.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f2258q;

    public l(n nVar, d0 d0Var) {
        o.m(nVar, "connectionPool");
        o.m(d0Var, "route");
        this.f2258q = d0Var;
    }

    public static void d(w wVar, d0 d0Var, IOException iOException) {
        o.m(wVar, "client");
        o.m(d0Var, "failedRoute");
        o.m(iOException, "failure");
        if (d0Var.f5989b.type() != Proxy.Type.DIRECT) {
            a aVar = d0Var.f5988a;
            aVar.f5955k.connectFailed(aVar.f5945a.g(), d0Var.f5989b.address(), iOException);
        }
        f fVar = wVar.B;
        synchronized (fVar) {
            ((Set) fVar.f2505e).add(d0Var);
        }
    }

    public final synchronized void a(u uVar, f0 f0Var) {
        o.m(uVar, "connection");
        o.m(f0Var, "settings");
        this.f2255n = (f0Var.f2973a & 16) != 0 ? f0Var.f2974b[4] : Integer.MAX_VALUE;
    }

    public final void b(a0 a0Var) {
        o.m(a0Var, "stream");
        a0Var.c(b.f2927i, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171 A[EDGE_INSN: B:99:0x0171->B:94:0x0171 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, int r18, int r19, boolean r20, d5.j r21, z4.n r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r21
            r9 = r22
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            b1.o.m(r8, r0)
            java.lang.String r0 = "eventListener"
            b1.o.m(r9, r0)
            z4.x r0 = r7.f2246e
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x017f
            z4.d0 r0 = r7.f2258q
            z4.a r0 = r0.f5988a
            java.util.List r0 = r0.f5947c
            d5.b r13 = new d5.b
            r13.<init>(r0)
            z4.d0 r1 = r7.f2258q
            z4.a r1 = r1.f5988a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5950f
            if (r2 != 0) goto L_0x006c
            z4.j r1 = z4.j.f6030f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            z4.d0 r0 = r7.f2258q
            z4.a r0 = r0.f5988a
            z4.t r0 = r0.f5945a
            java.lang.String r0 = r0.f6074e
            h5.n r1 = h5.n.f3500a
            h5.n r1 = h5.n.f3500a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x004c
            goto L_0x0076
        L_0x004c:
            d5.o r1 = new d5.o
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = a2.m.i(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005f:
            d5.o r0 = new d5.o
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.util.List r0 = r1.f5946b
            z4.x r1 = z4.x.f6109i
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0172
        L_0x0076:
            r14 = 0
            r15 = r14
        L_0x0078:
            z4.d0 r0 = r7.f2258q     // Catch:{ IOException -> 0x00f4 }
            z4.a r1 = r0.f5988a     // Catch:{ IOException -> 0x00f4 }
            javax.net.ssl.SSLSocketFactory r1 = r1.f5950f     // Catch:{ IOException -> 0x00f4 }
            if (r1 == 0) goto L_0x008c
            java.net.Proxy r0 = r0.f5989b     // Catch:{ IOException -> 0x00f4 }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00f4 }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00f4 }
            if (r0 != r1) goto L_0x008c
            r0 = r12
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x00ad
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f4 }
            java.net.Socket r0 = r7.f2243b     // Catch:{ IOException -> 0x00f4 }
            if (r0 != 0) goto L_0x00a3
            goto L_0x00c3
        L_0x00a3:
            r1 = r17
            r2 = r18
            goto L_0x00b4
        L_0x00a8:
            r1 = r17
            r2 = r18
            goto L_0x00f6
        L_0x00ad:
            r1 = r17
            r2 = r18
            r7.e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00f2 }
        L_0x00b4:
            r7.g(r13, r8, r9)     // Catch:{ IOException -> 0x00f2 }
            z4.d0 r0 = r7.f2258q     // Catch:{ IOException -> 0x00f2 }
            java.net.InetSocketAddress r3 = r0.f5990c     // Catch:{ IOException -> 0x00f2 }
            java.net.Proxy r0 = r0.f5989b     // Catch:{ IOException -> 0x00f2 }
            b1.o.m(r3, r11)     // Catch:{ IOException -> 0x00f2 }
            b1.o.m(r0, r10)     // Catch:{ IOException -> 0x00f2 }
        L_0x00c3:
            z4.d0 r0 = r7.f2258q
            z4.a r1 = r0.f5988a
            javax.net.ssl.SSLSocketFactory r1 = r1.f5950f
            if (r1 == 0) goto L_0x00d6
            java.net.Proxy r0 = r0.f5989b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            if (r12 == 0) goto L_0x00eb
            java.net.Socket r0 = r7.f2243b
            if (r0 == 0) goto L_0x00de
            goto L_0x00eb
        L_0x00de:
            d5.o r0 = new d5.o
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            long r0 = java.lang.System.nanoTime()
            r7.f2257p = r0
            return
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r0 = move-exception
            goto L_0x00a8
        L_0x00f6:
            java.net.Socket r3 = r7.f2244c
            if (r3 == 0) goto L_0x0106
            byte[] r4 = a5.c.f212a
            r3.close()     // Catch:{ AssertionError -> 0x0103, RuntimeException -> 0x0100, Exception -> 0x0106 }
            goto L_0x0106
        L_0x0100:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0103:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0106:
            java.net.Socket r3 = r7.f2243b
            if (r3 == 0) goto L_0x0116
            byte[] r4 = a5.c.f212a
            r3.close()     // Catch:{ AssertionError -> 0x0113, RuntimeException -> 0x0110, Exception -> 0x0116 }
            goto L_0x0116
        L_0x0110:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0113:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0116:
            r7.f2244c = r14
            r7.f2243b = r14
            r7.f2248g = r14
            r7.f2249h = r14
            r7.f2245d = r14
            r7.f2246e = r14
            r7.f2247f = r14
            r7.f2255n = r12
            z4.d0 r3 = r7.f2258q
            java.net.InetSocketAddress r4 = r3.f5990c
            java.net.Proxy r3 = r3.f5989b
            b1.o.m(r4, r11)
            b1.o.m(r3, r10)
            if (r15 != 0) goto L_0x013a
            d5.o r15 = new d5.o
            r15.<init>(r0)
            goto L_0x0141
        L_0x013a:
            java.io.IOException r3 = r15.f2266e
            b1.o.a(r3, r0)
            r15.f2265d = r0
        L_0x0141:
            if (r20 == 0) goto L_0x0171
            r13.f2187c = r12
            boolean r3 = r13.f2186b
            if (r3 != 0) goto L_0x014a
            goto L_0x016c
        L_0x014a:
            boolean r3 = r0 instanceof java.net.ProtocolException
            if (r3 == 0) goto L_0x014f
            goto L_0x016c
        L_0x014f:
            boolean r3 = r0 instanceof java.io.InterruptedIOException
            if (r3 == 0) goto L_0x0154
            goto L_0x016c
        L_0x0154:
            boolean r3 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0161
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 == 0) goto L_0x0161
            goto L_0x016c
        L_0x0161:
            boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0166
            goto L_0x016c
        L_0x0166:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x016c
            r0 = r12
            goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            if (r0 == 0) goto L_0x0171
            goto L_0x0078
        L_0x0171:
            throw r15
        L_0x0172:
            d5.o r0 = new d5.o
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x017f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.c(int, int, int, boolean, d5.j, z4.n):void");
    }

    public final void e(int i3, int i6, j jVar, n nVar) {
        Socket socket;
        int i7;
        d0 d0Var = this.f2258q;
        Proxy proxy = d0Var.f5989b;
        a aVar = d0Var.f5988a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i7 = k.f2242a[type.ordinal()]) == 1 || i7 == 2)) {
            socket = aVar.f5949e.createSocket();
            o.k(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f2243b = socket;
        InetSocketAddress inetSocketAddress = this.f2258q.f5990c;
        nVar.getClass();
        o.m(jVar, "call");
        o.m(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i6);
        try {
            h5.n nVar2 = h5.n.f3500a;
            h5.n.f3500a.e(socket, this.f2258q.f5990c, i3);
            try {
                this.f2248g = new q(c.L(socket));
                this.f2249h = new l5.p(c.J(socket));
            } catch (NullPointerException e6) {
                if (o.c(e6.getMessage(), "throw with null exception")) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f2258q.f5990c);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void f(int i3, int i6, int i7, j jVar, n nVar) {
        int i8 = i6;
        y yVar = new y();
        d0 d0Var = this.f2258q;
        t tVar = d0Var.f5988a.f5945a;
        o.m(tVar, "url");
        yVar.f6113a = tVar;
        yVar.d("CONNECT", (v) null);
        a aVar = d0Var.f5988a;
        yVar.c("Host", a5.c.t(aVar.f5945a, true));
        yVar.c("Proxy-Connection", "Keep-Alive");
        yVar.c("User-Agent", "okhttp/4.9.0");
        androidx.appcompat.widget.w b6 = yVar.b();
        z zVar = new z();
        zVar.f6117a = b6;
        zVar.f6118b = x.f6106f;
        zVar.f6119c = 407;
        zVar.f6120d = "Preemptive Authenticate";
        zVar.f6123g = a5.c.f214c;
        zVar.f6127k = -1;
        zVar.f6128l = -1;
        z4.q qVar = zVar.f6122f;
        qVar.getClass();
        w4.p.e("Proxy-Authenticate");
        w4.p.h("OkHttp-Preemptive", "Proxy-Authenticate");
        qVar.c("Proxy-Authenticate");
        qVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        zVar.a();
        ((e) aVar.f5953i).getClass();
        int i9 = i3;
        e(i3, i8, jVar, nVar);
        q qVar2 = this.f2248g;
        o.k(qVar2);
        l5.p pVar = this.f2249h;
        o.k(pVar);
        h hVar = new h((w) null, this, qVar2, pVar);
        l5.x c6 = qVar2.c();
        long j6 = (long) i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6.g(j6, timeUnit);
        pVar.c().g((long) i7, timeUnit);
        hVar.j((r) b6.f822e, "CONNECT " + a5.c.t((t) b6.f820c, true) + " HTTP/1.1");
        hVar.d();
        z f6 = hVar.f(false);
        o.k(f6);
        f6.f6117a = b6;
        z4.a0 a6 = f6.a();
        long i10 = a5.c.i(a6);
        if (i10 != -1) {
            f5.e i11 = hVar.i(i10);
            a5.c.r(i11, Integer.MAX_VALUE, timeUnit);
            i11.close();
        }
        int i12 = a6.f5959g;
        if (i12 != 200) {
            if (i12 == 407) {
                ((e) aVar.f5953i).getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(m.g("Unexpected response code for CONNECT: ", i12));
        } else if (!qVar2.f4149d.x() || !pVar.f4146d.x()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(d5.b r11, d5.j r12, z4.n r13) {
        /*
            r10 = this;
            java.lang.String r0 = "sha256/"
            z4.d0 r1 = r10.f2258q
            z4.a r1 = r1.f5988a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5950f
            z4.x r3 = z4.x.f6106f
            if (r2 != 0) goto L_0x0027
            java.util.List r11 = r1.f5946b
            z4.x r12 = z4.x.f6109i
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x0020
            java.net.Socket r11 = r10.f2243b
            r10.f2244c = r11
            r10.f2246e = r12
            r10.l()
            return
        L_0x0020:
            java.net.Socket r11 = r10.f2243b
            r10.f2244c = r11
            r10.f2246e = r3
            return
        L_0x0027:
            r13.getClass()
            java.lang.String r13 = "call"
            b1.o.m(r12, r13)
            java.lang.String r12 = "\n              |Hostname "
            java.lang.String r13 = "Hostname "
            z4.d0 r1 = r10.f2258q
            z4.a r1 = r1.f5988a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5950f
            r4 = 0
            b1.o.k(r2)     // Catch:{ all -> 0x01cf }
            java.net.Socket r5 = r10.f2243b     // Catch:{ all -> 0x01cf }
            z4.t r6 = r1.f5945a     // Catch:{ all -> 0x01cf }
            java.lang.String r7 = r6.f6074e     // Catch:{ all -> 0x01cf }
            int r6 = r6.f6075f     // Catch:{ all -> 0x01cf }
            r8 = 1
            java.net.Socket r2 = r2.createSocket(r5, r7, r6, r8)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x01c7
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch:{ all -> 0x01cf }
            z4.j r11 = r11.a(r2)     // Catch:{ all -> 0x01c4 }
            boolean r5 = r11.f6032b     // Catch:{ all -> 0x01c4 }
            if (r5 == 0) goto L_0x0063
            h5.n r5 = h5.n.f3500a     // Catch:{ all -> 0x01c4 }
            h5.n r5 = h5.n.f3500a     // Catch:{ all -> 0x01c4 }
            z4.t r6 = r1.f5945a     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = r6.f6074e     // Catch:{ all -> 0x01c4 }
            java.util.List r7 = r1.f5946b     // Catch:{ all -> 0x01c4 }
            r5.d(r2, r6, r7)     // Catch:{ all -> 0x01c4 }
        L_0x0063:
            r2.startHandshake()     // Catch:{ all -> 0x01c4 }
            javax.net.ssl.SSLSession r5 = r2.getSession()     // Catch:{ all -> 0x01c4 }
            java.lang.String r6 = "sslSocketSession"
            b1.o.l(r5, r6)     // Catch:{ all -> 0x01c4 }
            z4.p r6 = h5.l.f(r5)     // Catch:{ all -> 0x01c4 }
            javax.net.ssl.HostnameVerifier r7 = r1.f5951g     // Catch:{ all -> 0x01c4 }
            b1.o.k(r7)     // Catch:{ all -> 0x01c4 }
            z4.t r9 = r1.f5945a     // Catch:{ all -> 0x01c4 }
            java.lang.String r9 = r9.f6074e     // Catch:{ all -> 0x01c4 }
            boolean r5 = r7.verify(r9, r5)     // Catch:{ all -> 0x01c4 }
            if (r5 != 0) goto L_0x0153
            java.util.List r11 = r6.a()     // Catch:{ all -> 0x01c4 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x01c4 }
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0138
            r13 = 0
            java.lang.Object r11 = r11.get(r13)     // Catch:{ all -> 0x01c4 }
            if (r11 != 0) goto L_0x009c
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r12)     // Catch:{ all -> 0x01c4 }
            throw r11     // Catch:{ all -> 0x01c4 }
        L_0x009c:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x01c4 }
            javax.net.ssl.SSLPeerUnverifiedException r13 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r3.<init>(r12)     // Catch:{ all -> 0x01c4 }
            z4.t r12 = r1.f5945a     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r12.f6074e     // Catch:{ all -> 0x01c4 }
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = " not verified:\n              |    certificate: "
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            z4.g r12 = z4.g.f6002c     // Catch:{ all -> 0x01c4 }
            l5.j r12 = l5.j.f4129g     // Catch:{ all -> 0x01c4 }
            java.security.PublicKey r12 = r11.getPublicKey()     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = "publicKey"
            b1.o.l(r12, r1)     // Catch:{ all -> 0x01c4 }
            byte[] r12 = r12.getEncoded()     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = "publicKey.encoded"
            b1.o.l(r12, r1)     // Catch:{ all -> 0x01c4 }
            l5.j r12 = androidx.fragment.app.n0.u(r12)     // Catch:{ all -> 0x01c4 }
            l5.j r1 = new l5.j     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ all -> 0x01c4 }
            byte[] r12 = r12.f4132f     // Catch:{ all -> 0x01c4 }
            byte[] r12 = r4.digest(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = "MessageDigest.getInstance(algorithm).digest(data)"
            b1.o.l(r12, r4)     // Catch:{ all -> 0x01c4 }
            r1.<init>(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r1.a()     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r0.concat(r12)     // Catch:{ all -> 0x01c4 }
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = "\n              |    DN: "
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            java.security.Principal r12 = r11.getSubjectDN()     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "cert.subjectDN"
            b1.o.l(r12, r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r12.getName()     // Catch:{ all -> 0x01c4 }
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = "\n              |    subjectAltNames: "
            r3.append(r12)     // Catch:{ all -> 0x01c4 }
            r12 = 7
            java.util.List r12 = k5.c.a(r11, r12)     // Catch:{ all -> 0x01c4 }
            r0 = 2
            java.util.List r11 = k5.c.a(r11, r0)     // Catch:{ all -> 0x01c4 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01c4 }
            int r1 = r12.size()     // Catch:{ all -> 0x01c4 }
            int r4 = r11.size()     // Catch:{ all -> 0x01c4 }
            int r4 = r4 + r1
            r0.<init>(r4)     // Catch:{ all -> 0x01c4 }
            r0.addAll(r12)     // Catch:{ all -> 0x01c4 }
            r0.addAll(r11)     // Catch:{ all -> 0x01c4 }
            r3.append(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = "\n              "
            r3.append(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = com.bumptech.glide.c.P(r11)     // Catch:{ all -> 0x01c4 }
            r13.<init>(r11)     // Catch:{ all -> 0x01c4 }
            throw r13     // Catch:{ all -> 0x01c4 }
        L_0x0138:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r12.<init>(r13)     // Catch:{ all -> 0x01c4 }
            z4.t r13 = r1.f5945a     // Catch:{ all -> 0x01c4 }
            java.lang.String r13 = r13.f6074e     // Catch:{ all -> 0x01c4 }
            r12.append(r13)     // Catch:{ all -> 0x01c4 }
            java.lang.String r13 = " not verified (no certificates)"
            r12.append(r13)     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01c4 }
            r11.<init>(r12)     // Catch:{ all -> 0x01c4 }
            throw r11     // Catch:{ all -> 0x01c4 }
        L_0x0153:
            z4.g r12 = r1.f5952h     // Catch:{ all -> 0x01c4 }
            b1.o.k(r12)     // Catch:{ all -> 0x01c4 }
            z4.p r13 = new z4.p     // Catch:{ all -> 0x01c4 }
            z4.e0 r0 = r6.f6056b     // Catch:{ all -> 0x01c4 }
            z4.h r5 = r6.f6057c     // Catch:{ all -> 0x01c4 }
            java.util.List r7 = r6.f6058d     // Catch:{ all -> 0x01c4 }
            z4.f r9 = new z4.f     // Catch:{ all -> 0x01c4 }
            r9.<init>(r12, r6, r1, r8)     // Catch:{ all -> 0x01c4 }
            r13.<init>(r0, r5, r7, r9)     // Catch:{ all -> 0x01c4 }
            r10.f2245d = r13     // Catch:{ all -> 0x01c4 }
            z4.t r13 = r1.f5945a     // Catch:{ all -> 0x01c4 }
            java.lang.String r13 = r13.f6074e     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "hostname"
            b1.o.m(r13, r0)     // Catch:{ all -> 0x01c4 }
            java.util.Set r12 = r12.f6003a     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x01c4 }
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r13 != 0) goto L_0x01bc
            boolean r11 = r11.f6032b     // Catch:{ all -> 0x01c4 }
            if (r11 == 0) goto L_0x018b
            h5.n r11 = h5.n.f3500a     // Catch:{ all -> 0x01c4 }
            h5.n r11 = h5.n.f3500a     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = r11.f(r2)     // Catch:{ all -> 0x01c4 }
        L_0x018b:
            r10.f2244c = r2     // Catch:{ all -> 0x01c4 }
            l5.d r11 = com.bumptech.glide.c.L(r2)     // Catch:{ all -> 0x01c4 }
            l5.q r12 = new l5.q     // Catch:{ all -> 0x01c4 }
            r12.<init>(r11)     // Catch:{ all -> 0x01c4 }
            r10.f2248g = r12     // Catch:{ all -> 0x01c4 }
            l5.c r11 = com.bumptech.glide.c.J(r2)     // Catch:{ all -> 0x01c4 }
            l5.p r12 = new l5.p     // Catch:{ all -> 0x01c4 }
            r12.<init>(r11)     // Catch:{ all -> 0x01c4 }
            r10.f2249h = r12     // Catch:{ all -> 0x01c4 }
            if (r4 == 0) goto L_0x01a9
            z4.x r3 = x3.d.c(r4)     // Catch:{ all -> 0x01c4 }
        L_0x01a9:
            r10.f2246e = r3     // Catch:{ all -> 0x01c4 }
            h5.n r11 = h5.n.f3500a
            h5.n r11 = h5.n.f3500a
            r11.a(r2)
            z4.x r11 = r10.f2246e
            z4.x r12 = z4.x.f6108h
            if (r11 != r12) goto L_0x01bb
            r10.l()
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x01c4 }
            a2.m.o(r11)     // Catch:{ all -> 0x01c4 }
            throw r4     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r11 = move-exception
            r4 = r2
            goto L_0x01d0
        L_0x01c7:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x01cf }
            java.lang.String r12 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r12)     // Catch:{ all -> 0x01cf }
            throw r11     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r11 = move-exception
        L_0x01d0:
            if (r4 == 0) goto L_0x01d9
            h5.n r12 = h5.n.f3500a
            h5.n r12 = h5.n.f3500a
            r12.a(r4)
        L_0x01d9:
            if (r4 == 0) goto L_0x01e5
            byte[] r12 = a5.c.f212a
            r4.close()     // Catch:{ AssertionError -> 0x01e3, RuntimeException -> 0x01e1, Exception -> 0x01e5 }
            goto L_0x01e5
        L_0x01e1:
            r11 = move-exception
            throw r11
        L_0x01e3:
            r11 = move-exception
            throw r11
        L_0x01e5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.g(d5.b, d5.j, z4.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        if (r11 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d0 A[SYNTHETIC, Splitter:B:57:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(z4.a r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = "hostname"
            java.lang.String r1 = "address"
            b1.o.m(r10, r1)
            byte[] r1 = a5.c.f212a
            java.util.ArrayList r1 = r9.f2256o
            int r1 = r1.size()
            int r2 = r9.f2255n
            r3 = 0
            if (r1 >= r2) goto L_0x00fc
            boolean r1 = r9.f2250i
            if (r1 == 0) goto L_0x001a
            goto L_0x00fc
        L_0x001a:
            z4.d0 r1 = r9.f2258q
            z4.a r2 = r1.f5988a
            boolean r2 = r2.a(r10)
            if (r2 != 0) goto L_0x0025
            return r3
        L_0x0025:
            z4.t r2 = r10.f5945a
            java.lang.String r4 = r2.f6074e
            z4.a r5 = r1.f5988a
            z4.t r6 = r5.f5945a
            java.lang.String r6 = r6.f6074e
            boolean r4 = b1.o.c(r4, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0037
            return r6
        L_0x0037:
            g5.u r4 = r9.f2247f
            if (r4 != 0) goto L_0x003c
            return r3
        L_0x003c:
            if (r11 == 0) goto L_0x00fc
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L_0x0045
            goto L_0x007a
        L_0x0045:
            java.util.Iterator r11 = r11.iterator()
        L_0x0049:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r11.next()
            z4.d0 r4 = (z4.d0) r4
            java.net.Proxy r7 = r4.f5989b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L_0x0075
            java.net.Proxy r7 = r1.f5989b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L_0x0075
            java.net.InetSocketAddress r7 = r1.f5990c
            java.net.InetSocketAddress r4 = r4.f5990c
            boolean r4 = b1.o.c(r7, r4)
            if (r4 == 0) goto L_0x0075
            r4 = r6
            goto L_0x0076
        L_0x0075:
            r4 = r3
        L_0x0076:
            if (r4 == 0) goto L_0x0049
            r11 = r6
            goto L_0x007b
        L_0x007a:
            r11 = r3
        L_0x007b:
            if (r11 != 0) goto L_0x007f
            goto L_0x00fc
        L_0x007f:
            k5.c r11 = k5.c.f3976a
            javax.net.ssl.HostnameVerifier r1 = r10.f5951g
            if (r1 == r11) goto L_0x0086
            return r3
        L_0x0086:
            byte[] r11 = a5.c.f212a
            z4.t r11 = r5.f5945a
            int r1 = r11.f6075f
            java.lang.String r4 = r2.f6074e
            int r2 = r2.f6075f
            if (r2 == r1) goto L_0x0093
            goto L_0x00cc
        L_0x0093:
            java.lang.String r11 = r11.f6074e
            boolean r11 = b1.o.c(r4, r11)
            if (r11 == 0) goto L_0x009c
            goto L_0x00ca
        L_0x009c:
            boolean r11 = r9.f2251j
            if (r11 != 0) goto L_0x00cc
            z4.p r11 = r9.f2245d
            if (r11 == 0) goto L_0x00cc
            java.util.List r11 = r11.a()
            boolean r1 = r11.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r11 = r11.get(r3)
            if (r11 == 0) goto L_0x00bf
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = k5.c.b(r4, r11)
            if (r11 == 0) goto L_0x00c7
            r11 = r6
            goto L_0x00c8
        L_0x00bf:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        L_0x00c7:
            r11 = r3
        L_0x00c8:
            if (r11 == 0) goto L_0x00cc
        L_0x00ca:
            r11 = r6
            goto L_0x00cd
        L_0x00cc:
            r11 = r3
        L_0x00cd:
            if (r11 != 0) goto L_0x00d0
            return r3
        L_0x00d0:
            z4.g r10 = r10.f5952h     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            b1.o.k(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            z4.p r11 = r9.f2245d     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            b1.o.k(r11)     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            java.util.List r11 = r11.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            b1.o.m(r4, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            java.lang.String r0 = "peerCertificates"
            b1.o.m(r11, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            java.util.Set r10 = r10.f6003a     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            boolean r11 = r10.hasNext()     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            if (r11 != 0) goto L_0x00f3
            return r6
        L_0x00f3:
            java.lang.Object r10 = r10.next()     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            a2.m.o(r10)     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
            r10 = 0
            throw r10     // Catch:{ SSLPeerUnverifiedException -> 0x00fc }
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.h(z4.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = a5.c.f212a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f2243b
            b1.o.k(r2)
            java.net.Socket r3 = r9.f2244c
            b1.o.k(r3)
            l5.q r4 = r9.f2248g
            b1.o.k(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007c
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007c
        L_0x002f:
            g5.u r2 = r9.f2247f
            r6 = 1
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            boolean r10 = r2.f3024j     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            long r3 = r2.f3033s     // Catch:{ all -> 0x004d }
            long r7 = r2.f3032r     // Catch:{ all -> 0x004d }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            long r3 = r2.f3034t     // Catch:{ all -> 0x004d }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
        L_0x0048:
            monitor-exit(r2)
            goto L_0x004c
        L_0x004a:
            monitor-exit(r2)
            r5 = r6
        L_0x004c:
            return r5
        L_0x004d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0050:
            monitor-enter(r9)
            long r7 = r9.f2257p     // Catch:{ all -> 0x0079 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            if (r10 == 0) goto L_0x0078
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0071 }
            boolean r0 = r4.x()     // Catch:{ all -> 0x0071 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            r5 = r0
            goto L_0x0077
        L_0x0071:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0076, IOException -> 0x0077 }
        L_0x0076:
            r5 = r6
        L_0x0077:
            return r5
        L_0x0078:
            return r6
        L_0x0079:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.i(boolean):boolean");
    }

    public final d j(w wVar, e5.f fVar) {
        Socket socket = this.f2244c;
        o.k(socket);
        q qVar = this.f2248g;
        o.k(qVar);
        l5.p pVar = this.f2249h;
        o.k(pVar);
        u uVar = this.f2247f;
        if (uVar != null) {
            return new g5.v(wVar, this, fVar, uVar);
        }
        int i3 = fVar.f2601h;
        socket.setSoTimeout(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.c().g((long) i3, timeUnit);
        pVar.c().g((long) fVar.f2602i, timeUnit);
        return new h(wVar, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f2250i = true;
    }

    public final void l() {
        String str;
        Socket socket = this.f2244c;
        o.k(socket);
        q qVar = this.f2248g;
        o.k(qVar);
        l5.p pVar = this.f2249h;
        o.k(pVar);
        socket.setSoTimeout(0);
        c5.f fVar = c5.f.f1678h;
        i iVar = new i(fVar);
        String str2 = this.f2258q.f5988a.f5945a.f6074e;
        o.m(str2, "peerName");
        iVar.f2982a = socket;
        if (iVar.f2989h) {
            str = a5.c.f218g + ' ' + str2;
        } else {
            str = "MockWebServer ".concat(str2);
        }
        iVar.f2983b = str;
        iVar.f2984c = qVar;
        iVar.f2985d = pVar;
        iVar.f2986e = this;
        iVar.f2988g = 0;
        u uVar = new u(iVar);
        this.f2247f = uVar;
        f0 f0Var = u.E;
        this.f2255n = (f0Var.f2973a & 16) != 0 ? f0Var.f2974b[4] : Integer.MAX_VALUE;
        b0 b0Var = uVar.B;
        synchronized (b0Var) {
            if (b0Var.f2934f) {
                throw new IOException("closed");
            } else if (b0Var.f2937i) {
                Logger logger = b0.f2931j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(a5.c.g(">> CONNECTION " + g.f2975a.c(), new Object[0]));
                }
                b0Var.f2936h.j(g.f2975a);
                b0Var.f2936h.flush();
            }
        }
        b0 b0Var2 = uVar.B;
        f0 f0Var2 = uVar.f3035u;
        synchronized (b0Var2) {
            o.m(f0Var2, "settings");
            if (!b0Var2.f2934f) {
                b0Var2.i(0, Integer.bitCount(f0Var2.f2973a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z5 = true;
                    if (((1 << i3) & f0Var2.f2973a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        b0Var2.f2936h.k(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                        b0Var2.f2936h.m(f0Var2.f2974b[i3]);
                    }
                    i3++;
                }
                b0Var2.f2936h.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a6 = uVar.f3035u.a();
        if (a6 != 65535) {
            uVar.B.q((long) (a6 - 65535), 0);
        }
        fVar.f().c(new c5.b(uVar.C, uVar.f3021g), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        d0 d0Var = this.f2258q;
        sb.append(d0Var.f5988a.f5945a.f6074e);
        sb.append(':');
        sb.append(d0Var.f5988a.f5945a.f6075f);
        sb.append(", proxy=");
        sb.append(d0Var.f5989b);
        sb.append(" hostAddress=");
        sb.append(d0Var.f5990c);
        sb.append(" cipherSuite=");
        p pVar = this.f2245d;
        if (pVar == null || (obj = pVar.f6057c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2246e);
        sb.append('}');
        return sb.toString();
    }
}
