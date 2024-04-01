package e5;

import a5.c;
import b1.o;
import d5.f;
import d5.j;
import d5.l;
import d5.p;
import e.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import z4.a0;
import z4.d0;
import z4.u;
import z4.w;

public final class g implements u {

    /* renamed from: a  reason: collision with root package name */
    public final w f2603a;

    public g(w wVar) {
        o.m(wVar, "client");
        this.f2603a = wVar;
    }

    public static int d(a0 a0Var, int i3) {
        String b6 = a0.b(a0Var, "Retry-After");
        if (b6 == null) {
            return i3;
        }
        Pattern compile = Pattern.compile("\\d+");
        o.l(compile, "compile(pattern)");
        if (!compile.matcher(b6).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b6);
        o.l(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: g4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: g4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: g4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: g4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: g4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: g4.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z4.a0 a(e5.f r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            androidx.appcompat.widget.w r0 = r2.f2599f
            d5.j r3 = r2.f2595b
            g4.n r4 = g4.n.f2906d
            r5 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r5
        L_0x0010:
            r3.getClass()
            java.lang.String r11 = "request"
            b1.o.m(r4, r11)
            d5.e r11 = r3.f2232l
            if (r11 != 0) goto L_0x001e
            r11 = r5
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            if (r11 == 0) goto L_0x01b3
            monitor-enter(r3)
            boolean r11 = r3.f2234n     // Catch:{ all -> 0x01b0 }
            r11 = r11 ^ r5
            if (r11 == 0) goto L_0x01a4
            boolean r11 = r3.f2233m     // Catch:{ all -> 0x01b0 }
            r11 = r11 ^ r5
            if (r11 == 0) goto L_0x0198
            monitor-exit(r3)
            if (r0 == 0) goto L_0x008d
            d5.f r0 = new d5.f
            d5.n r11 = r3.f2224d
            java.lang.Object r12 = r4.f820c
            z4.t r12 = (z4.t) r12
            boolean r13 = r12.f6070a
            z4.w r14 = r3.f2239s
            if (r13 == 0) goto L_0x0054
            javax.net.ssl.SSLSocketFactory r13 = r14.f6097r
            if (r13 == 0) goto L_0x004c
            k5.c r15 = r14.f6101v
            z4.g r7 = r14.w
            r23 = r7
            r21 = r13
            r22 = r15
            goto L_0x005a
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x0054:
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x005a:
            z4.a r7 = new z4.a
            java.lang.String r13 = r12.f6074e
            int r12 = r12.f6075f
            z4.n r15 = r14.f6093n
            javax.net.SocketFactory r5 = r14.f6096q
            androidx.compose.ui.platform.e r6 = r14.f6095p
            r28 = r8
            java.util.List r8 = r14.f6100u
            r29 = r9
            java.util.List r9 = r14.f6099t
            java.net.ProxySelector r14 = r14.f6094o
            r16 = r7
            r17 = r13
            r18 = r12
            r19 = r15
            r20 = r5
            r24 = r6
            r25 = r8
            r26 = r9
            r27 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            z4.n r5 = r3.f2225e
            r0.<init>(r11, r7, r3, r5)
            r3.f2229i = r0
            goto L_0x0091
        L_0x008d:
            r28 = r8
            r29 = r9
        L_0x0091:
            boolean r0 = r3.f2236p     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x018a
            z4.a0 r0 = r2.b(r4)     // Catch:{ o -> 0x0159, IOException -> 0x0125 }
            if (r10 == 0) goto L_0x00c8
            z4.z r4 = new z4.z     // Catch:{ all -> 0x0192 }
            r4.<init>(r0)     // Catch:{ all -> 0x0192 }
            z4.z r0 = new z4.z     // Catch:{ all -> 0x0192 }
            r0.<init>(r10)     // Catch:{ all -> 0x0192 }
            r5 = 0
            r0.f6123g = r5     // Catch:{ all -> 0x0192 }
            z4.a0 r0 = r0.a()     // Catch:{ all -> 0x0192 }
            z4.c0 r6 = r0.f5962j     // Catch:{ all -> 0x0192 }
            if (r6 != 0) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            if (r6 == 0) goto L_0x00bc
            r4.f6126j = r0     // Catch:{ all -> 0x0192 }
            z4.a0 r0 = r4.a()     // Catch:{ all -> 0x0192 }
            goto L_0x00c9
        L_0x00bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "priorResponse.body != null"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0192 }
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r10 = r0
            d5.e r0 = r3.f2232l     // Catch:{ all -> 0x0192 }
            androidx.appcompat.widget.w r4 = r1.b(r10, r0)     // Catch:{ all -> 0x0192 }
            if (r4 != 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r0.f2202a     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r3.f2231k     // Catch:{ all -> 0x0192 }
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00e6
            r3.f2231k = r2     // Catch:{ all -> 0x0192 }
            d5.i r0 = r3.f2226f     // Catch:{ all -> 0x0192 }
            r0.i()     // Catch:{ all -> 0x0192 }
            goto L_0x00f2
        L_0x00e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0192 }
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x00f2:
            r2 = 0
            r3.f(r2)
            return r10
        L_0x00f7:
            z4.c0 r0 = r10.f5962j     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00fe
            a5.c.b(r0)     // Catch:{ all -> 0x0192 }
        L_0x00fe:
            int r9 = r29 + 1
            r0 = 20
            if (r9 > r0) goto L_0x010e
            r6 = 1
            r3.f(r6)
            r8 = r28
            r0 = 1
            r5 = 1
            goto L_0x0010
        L_0x010e:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x0192 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r2.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r4 = "Too many follow-up requests: "
            r2.append(r4)     // Catch:{ all -> 0x0192 }
            r2.append(r9)     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0192 }
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0125:
            r0 = move-exception
            r5 = 0
            r6 = r0
            boolean r0 = r6 instanceof g5.a     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x012f
            r0 = 1
            goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            boolean r0 = r1.c(r6, r3, r4, r0)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0153
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            int r7 = r28.size()     // Catch:{ all -> 0x0192 }
            r8 = 1
            int r7 = r7 + r8
            r0.<init>(r7)     // Catch:{ all -> 0x0192 }
            r7 = r28
            r0.addAll(r7)     // Catch:{ all -> 0x0192 }
            r0.add(r6)     // Catch:{ all -> 0x0192 }
            r3.f(r8)
            r5 = r8
            r9 = r29
            r8 = r0
            r0 = 0
            goto L_0x0010
        L_0x0153:
            r7 = r28
            a5.c.x(r6, r7)     // Catch:{ all -> 0x0192 }
            throw r6     // Catch:{ all -> 0x0192 }
        L_0x0159:
            r0 = move-exception
            r7 = r28
            r5 = 0
            r6 = r0
            java.io.IOException r0 = r6.f2265d     // Catch:{ all -> 0x0192 }
            r8 = 0
            boolean r0 = r1.c(r0, r3, r4, r8)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0184
            java.io.IOException r0 = r6.f2266e     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            int r9 = r7.size()     // Catch:{ all -> 0x0192 }
            r11 = 1
            int r9 = r9 + r11
            r6.<init>(r9)     // Catch:{ all -> 0x0192 }
            r6.addAll(r7)     // Catch:{ all -> 0x0192 }
            r6.add(r0)     // Catch:{ all -> 0x0192 }
            r3.f(r11)
            r0 = r8
            r5 = r11
            r9 = r29
            r8 = r6
            goto L_0x0010
        L_0x0184:
            java.io.IOException r0 = r6.f2266e     // Catch:{ all -> 0x0192 }
            a5.c.x(r0, r7)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x018a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0192 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r2 = 1
            r3.f(r2)
            throw r0
        L_0x0198:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b0 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b0 }
            throw r2     // Catch:{ all -> 0x01b0 }
        L_0x01a4:
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b0 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b0 }
            throw r2     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01b3:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.a(e5.f):z4.a0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: b1.v} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r12.f2203b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.appcompat.widget.w b(z4.a0 r11, d5.e r12) {
        /*
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L_0x000a
            d5.l r1 = r12.f2203b
            if (r1 == 0) goto L_0x000a
            z4.d0 r1 = r1.f2258q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r11.f5959g
            androidx.appcompat.widget.w r3 = r11.f5956d
            java.io.Serializable r3 = r3.f821d
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b0
            if (r2 == r5) goto L_0x00b0
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00ab
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0082
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L_0x006c
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L_0x004f
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L_0x0035
            switch(r2) {
                case 300: goto L_0x00b0;
                case 301: goto L_0x00b0;
                case 302: goto L_0x00b0;
                case 303: goto L_0x00b0;
                default: goto L_0x0034;
            }
        L_0x0034:
            return r0
        L_0x0035:
            z4.w r1 = r10.f2603a
            boolean r1 = r1.f6088i
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            z4.a0 r1 = r11.f5965m
            if (r1 == 0) goto L_0x0045
            int r1 = r1.f5959g
            if (r1 != r12) goto L_0x0045
            return r0
        L_0x0045:
            int r12 = d(r11, r4)
            if (r12 <= 0) goto L_0x004c
            return r0
        L_0x004c:
            androidx.appcompat.widget.w r11 = r11.f5956d
            return r11
        L_0x004f:
            b1.o.k(r1)
            java.net.Proxy r11 = r1.f5989b
            java.net.Proxy$Type r11 = r11.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.HTTP
            if (r11 != r12) goto L_0x0064
            z4.w r11 = r10.f2603a
            androidx.compose.ui.platform.e r11 = r11.f6095p
        L_0x0060:
            r11.getClass()
            return r0
        L_0x0064:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L_0x006c:
            z4.a0 r1 = r11.f5965m
            if (r1 == 0) goto L_0x0075
            int r1 = r1.f5959g
            if (r1 != r12) goto L_0x0075
            return r0
        L_0x0075:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = d(r11, r12)
            if (r12 != 0) goto L_0x0081
            androidx.appcompat.widget.w r11 = r11.f5956d
            return r11
        L_0x0081:
            return r0
        L_0x0082:
            if (r12 == 0) goto L_0x00aa
            d5.f r1 = r12.f2206e
            z4.a r1 = r1.f2215h
            z4.t r1 = r1.f5945a
            java.lang.String r1 = r1.f6074e
            d5.l r2 = r12.f2203b
            z4.d0 r2 = r2.f2258q
            z4.a r2 = r2.f5988a
            z4.t r2 = r2.f5945a
            java.lang.String r2 = r2.f6074e
            boolean r1 = b1.o.c(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009e
            goto L_0x00aa
        L_0x009e:
            d5.l r12 = r12.f2203b
            monitor-enter(r12)
            r12.f2251j = r7     // Catch:{ all -> 0x00a7 }
            monitor-exit(r12)
            androidx.appcompat.widget.w r11 = r11.f5956d
            return r11
        L_0x00a7:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00aa:
            return r0
        L_0x00ab:
            z4.w r11 = r10.f2603a
            androidx.compose.ui.platform.e r11 = r11.f6089j
            goto L_0x0060
        L_0x00b0:
            z4.w r12 = r10.f2603a
            boolean r1 = r12.f6090k
            if (r1 != 0) goto L_0x00b8
            goto L_0x0150
        L_0x00b8:
            java.lang.String r1 = "Location"
            java.lang.String r1 = z4.a0.b(r11, r1)
            if (r1 == 0) goto L_0x0150
            androidx.appcompat.widget.w r2 = r11.f5956d
            java.lang.Object r8 = r2.f820c
            z4.t r8 = (z4.t) r8
            r8.getClass()
            z4.s r9 = new z4.s     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x00d2 }
            r9.d(r8, r1)     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x00d3
        L_0x00d2:
            r9 = r0
        L_0x00d3:
            if (r9 == 0) goto L_0x00da
            z4.t r1 = r9.a()
            goto L_0x00db
        L_0x00da:
            r1 = r0
        L_0x00db:
            if (r1 == 0) goto L_0x0150
            java.lang.Object r8 = r2.f820c
            z4.t r8 = (z4.t) r8
            java.lang.String r8 = r8.f6071b
            java.lang.String r9 = r1.f6071b
            boolean r8 = b1.o.c(r9, r8)
            if (r8 != 0) goto L_0x00f0
            boolean r12 = r12.f6091l
            if (r12 != 0) goto L_0x00f0
            goto L_0x0150
        L_0x00f0:
            z4.y r12 = new z4.y
            r12.<init>(r2)
            boolean r8 = b1.o.L(r3)
            if (r8 == 0) goto L_0x0139
            java.lang.String r8 = "PROPFIND"
            boolean r9 = b1.o.c(r3, r8)
            int r11 = r11.f5959g
            if (r9 != 0) goto L_0x0109
            if (r11 == r5) goto L_0x0109
            if (r11 != r6) goto L_0x010a
        L_0x0109:
            r4 = r7
        L_0x010a:
            boolean r8 = b1.o.c(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0118
            if (r11 == r5) goto L_0x0118
            if (r11 == r6) goto L_0x0118
            java.lang.String r3 = "GET"
            goto L_0x011f
        L_0x0118:
            if (r4 == 0) goto L_0x011f
            java.lang.Object r11 = r2.f823f
            r0 = r11
            b1.v r0 = (b1.v) r0
        L_0x011f:
            r12.d(r3, r0)
            if (r4 != 0) goto L_0x0139
            java.lang.String r11 = "Transfer-Encoding"
            z4.q r0 = r12.f6115c
            r0.c(r11)
            java.lang.String r11 = "Content-Length"
            z4.q r0 = r12.f6115c
            r0.c(r11)
            java.lang.String r11 = "Content-Type"
            z4.q r0 = r12.f6115c
            r0.c(r11)
        L_0x0139:
            java.lang.Object r11 = r2.f820c
            z4.t r11 = (z4.t) r11
            boolean r11 = a5.c.a(r11, r1)
            if (r11 != 0) goto L_0x014a
            java.lang.String r11 = "Authorization"
            z4.q r0 = r12.f6115c
            r0.c(r11)
        L_0x014a:
            r12.f6113a = r1
            androidx.appcompat.widget.w r0 = r12.b()
        L_0x0150:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.b(z4.a0, d5.e):androidx.appcompat.widget.w");
    }

    public final boolean c(IOException iOException, j jVar, androidx.appcompat.widget.w wVar, boolean z5) {
        boolean z6;
        p pVar;
        l lVar;
        if (!this.f2603a.f6088i) {
            return false;
        }
        if (z5 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z5))) {
            return false;
        }
        f fVar = jVar.f2229i;
        o.k(fVar);
        int i3 = fVar.f2210c;
        if (i3 == 0 && fVar.f2211d == 0 && fVar.f2212e == 0) {
            z6 = false;
        } else {
            if (fVar.f2213f == null) {
                d0 d0Var = null;
                if (i3 <= 1 && fVar.f2211d <= 1 && fVar.f2212e <= 0 && (lVar = fVar.f2216i.f2230j) != null) {
                    synchronized (lVar) {
                        if (lVar.f2252k == 0) {
                            if (c.a(lVar.f2258q.f5988a.f5945a, fVar.f2215h.f5945a)) {
                                d0Var = lVar.f2258q;
                            }
                        }
                    }
                }
                if (d0Var != null) {
                    fVar.f2213f = d0Var;
                } else {
                    h hVar = fVar.f2208a;
                    if ((hVar == null || !hVar.c()) && (pVar = fVar.f2209b) != null) {
                        z6 = pVar.a();
                    }
                }
            }
            z6 = true;
        }
        return z6;
    }
}
