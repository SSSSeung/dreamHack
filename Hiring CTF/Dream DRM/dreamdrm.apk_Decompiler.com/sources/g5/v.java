package g5;

import a5.c;
import b1.o;
import d5.l;
import e5.d;
import e5.e;
import e5.f;
import java.util.List;
import l5.u;
import z4.a0;
import z4.w;
import z4.x;

public final class v implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final List f3040g = c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List f3041h = c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public volatile a0 f3042a;

    /* renamed from: b  reason: collision with root package name */
    public final x f3043b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f3044c;

    /* renamed from: d  reason: collision with root package name */
    public final l f3045d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3046e;

    /* renamed from: f  reason: collision with root package name */
    public final u f3047f;

    public v(w wVar, l lVar, f fVar, u uVar) {
        o.m(lVar, "connection");
        this.f3045d = lVar;
        this.f3046e = fVar;
        this.f3047f = uVar;
        x xVar = x.f6109i;
        this.f3043b = !wVar.f6100u.contains(xVar) ? x.f6108h : xVar;
    }

    public final l5.v a(a0 a0Var) {
        a0 a0Var2 = this.f3042a;
        o.k(a0Var2);
        return a0Var2.f2915g;
    }

    public final u b(androidx.appcompat.widget.w wVar, long j6) {
        a0 a0Var = this.f3042a;
        o.k(a0Var);
        return a0Var.f();
    }

    public final long c(a0 a0Var) {
        if (!e.a(a0Var)) {
            return 0;
        }
        return c.i(a0Var);
    }

    public final void cancel() {
        this.f3044c = true;
        a0 a0Var = this.f3042a;
        if (a0Var != null) {
            a0Var.e(b.f2928j);
        }
    }

    public final void d() {
        a0 a0Var = this.f3042a;
        o.k(a0Var);
        a0Var.f().close();
    }

    public final void e() {
        this.f3047f.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r0.f2917i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z4.z f(boolean r12) {
        /*
            r11 = this;
            g5.a0 r0 = r11.f3042a
            b1.o.k(r0)
            monitor-enter(r0)
            d5.i r1 = r0.f2917i     // Catch:{ all -> 0x00fe }
            r1.h()     // Catch:{ all -> 0x00fe }
        L_0x000b:
            java.util.ArrayDeque r1 = r0.f2913e     // Catch:{ all -> 0x00f7 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x001b
            g5.b r1 = r0.f2919k     // Catch:{ all -> 0x00f7 }
            if (r1 != 0) goto L_0x001b
            r0.j()     // Catch:{ all -> 0x00f7 }
            goto L_0x000b
        L_0x001b:
            d5.i r1 = r0.f2917i     // Catch:{ all -> 0x00fe }
            r1.l()     // Catch:{ all -> 0x00fe }
            java.util.ArrayDeque r1 = r0.f2913e     // Catch:{ all -> 0x00fe }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00fe }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00e7
            java.util.ArrayDeque r1 = r0.f2913e     // Catch:{ all -> 0x00fe }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "headersQueue.removeFirst()"
            b1.o.l(r1, r2)     // Catch:{ all -> 0x00fe }
            z4.r r1 = (z4.r) r1     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)
            z4.x r0 = r11.f3043b
            java.lang.String r2 = "protocol"
            b1.o.m(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.lang.String[] r3 = r1.f6060d
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r7 = r4
            r6 = r5
        L_0x004f:
            if (r6 >= r3) goto L_0x0097
            java.lang.String r8 = r1.b(r6)
            java.lang.String r9 = r1.d(r6)
            java.lang.String r10 = ":status"
            boolean r10 = b1.o.c(r8, r10)
            if (r10 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "HTTP/1.1 "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            e5.h r7 = androidx.fragment.app.n0.v(r7)
            goto L_0x0094
        L_0x0074:
            java.util.List r10 = f3041h
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x0094
            java.lang.String r10 = "name"
            b1.o.m(r8, r10)
            java.lang.String r10 = "value"
            b1.o.m(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = v4.i.n0(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x0094:
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0097:
            if (r7 == 0) goto L_0x00df
            z4.z r1 = new z4.z
            r1.<init>()
            r1.f6118b = r0
            int r0 = r7.f2605b
            r1.f6119c = r0
            java.lang.String r0 = r7.f2606c
            java.lang.String r3 = "message"
            b1.o.m(r0, r3)
            r1.f6120d = r0
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r2.toArray(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.String[] r0 = (java.lang.String[]) r0
            z4.q r2 = new z4.q
            r2.<init>()
            java.util.ArrayList r3 = r2.f6059a
            java.lang.String r5 = "<this>"
            b1.o.m(r3, r5)
            java.util.List r0 = g4.h.W(r0)
            r3.addAll(r0)
            r1.f6122f = r2
            if (r12 == 0) goto L_0x00d5
            int r12 = r1.f6119c
            r0 = 100
            if (r12 != r0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r4 = r1
        L_0x00d6:
            return r4
        L_0x00d7:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r12.<init>(r0)
            throw r12
        L_0x00df:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00e7:
            java.io.IOException r12 = r0.f2920l     // Catch:{ all -> 0x00fe }
            if (r12 == 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            g5.g0 r12 = new g5.g0     // Catch:{ all -> 0x00fe }
            g5.b r1 = r0.f2919k     // Catch:{ all -> 0x00fe }
            b1.o.k(r1)     // Catch:{ all -> 0x00fe }
            r12.<init>(r1)     // Catch:{ all -> 0x00fe }
        L_0x00f6:
            throw r12     // Catch:{ all -> 0x00fe }
        L_0x00f7:
            r12 = move-exception
            d5.i r1 = r0.f2917i     // Catch:{ all -> 0x00fe }
            r1.l()     // Catch:{ all -> 0x00fe }
            throw r12     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.v.f(boolean):z4.z");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.appcompat.widget.w r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            g5.a0 r2 = r1.f3042a
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r2 = r0.f823f
            b1.v r2 = (b1.v) r2
            r4 = 1
            if (r2 == 0) goto L_0x0012
            r2 = r4
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.lang.Object r5 = r0.f822e
            z4.r r5 = (z4.r) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.String[] r7 = r5.f6060d
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            g5.c r7 = new g5.c
            l5.j r9 = g5.c.f2940f
            java.io.Serializable r10 = r0.f821d
            java.lang.String r10 = (java.lang.String) r10
            r7.<init>((l5.j) r9, (java.lang.String) r10)
            r6.add(r7)
            g5.c r7 = new g5.c
            l5.j r9 = g5.c.f2941g
            java.lang.Object r10 = r0.f820c
            z4.t r10 = (z4.t) r10
            java.lang.String r11 = "url"
            b1.o.m(r10, r11)
            java.lang.String r11 = r10.b()
            java.lang.String r12 = r10.d()
            if (r12 == 0) goto L_0x005c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r11 = 63
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
        L_0x005c:
            r7.<init>((l5.j) r9, (java.lang.String) r11)
            r6.add(r7)
            java.lang.String r7 = "Host"
            java.lang.Object r0 = r0.f822e
            z4.r r0 = (z4.r) r0
            java.lang.String r0 = r0.a(r7)
            if (r0 == 0) goto L_0x0078
            g5.c r7 = new g5.c
            l5.j r9 = g5.c.f2943i
            r7.<init>((l5.j) r9, (java.lang.String) r0)
            r6.add(r7)
        L_0x0078:
            g5.c r0 = new g5.c
            l5.j r7 = g5.c.f2942h
            java.lang.String r9 = r10.f6071b
            r0.<init>((l5.j) r7, (java.lang.String) r9)
            r6.add(r0)
            java.lang.String[] r0 = r5.f6060d
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = 0
        L_0x008a:
            if (r7 >= r0) goto L_0x00d5
            java.lang.String r9 = r5.b(r7)
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "Locale.US"
            b1.o.l(r10, r11)
            if (r9 == 0) goto L_0x00cd
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r10 = "(this as java.lang.String).toLowerCase(locale)"
            b1.o.l(r9, r10)
            java.util.List r10 = f3040g
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x00be
            java.lang.String r10 = "te"
            boolean r10 = b1.o.c(r9, r10)
            if (r10 == 0) goto L_0x00ca
            java.lang.String r10 = r5.d(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = b1.o.c(r10, r11)
            if (r10 == 0) goto L_0x00ca
        L_0x00be:
            g5.c r10 = new g5.c
            java.lang.String r11 = r5.d(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x00ca:
            int r7 = r7 + 1
            goto L_0x008a
        L_0x00cd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r2)
            throw r0
        L_0x00d5:
            g5.u r5 = r1.f3047f
            r5.getClass()
            r0 = r2 ^ 1
            r13 = 0
            g5.b0 r7 = r5.B
            monitor-enter(r7)
            monitor-enter(r5)     // Catch:{ all -> 0x01cc }
            int r9 = r5.f3023i     // Catch:{ all -> 0x01c9 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00ed
            g5.b r9 = g5.b.f2927i     // Catch:{ all -> 0x01c9 }
            r5.n(r9)     // Catch:{ all -> 0x01c9 }
        L_0x00ed:
            boolean r9 = r5.f3024j     // Catch:{ all -> 0x01c9 }
            if (r9 != 0) goto L_0x01c3
            int r15 = r5.f3023i     // Catch:{ all -> 0x01c9 }
            int r9 = r15 + 2
            r5.f3023i = r9     // Catch:{ all -> 0x01c9 }
            g5.a0 r14 = new g5.a0     // Catch:{ all -> 0x01c9 }
            r16 = 0
            r9 = r14
            r10 = r15
            r11 = r5
            r12 = r0
            r3 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c9 }
            if (r2 == 0) goto L_0x011a
            long r9 = r5.f3038y     // Catch:{ all -> 0x01c9 }
            long r11 = r5.f3039z     // Catch:{ all -> 0x01c9 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x011a
            long r9 = r3.f2911c     // Catch:{ all -> 0x01c9 }
            long r11 = r3.f2912d     // Catch:{ all -> 0x01c9 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r2 = 0
            goto L_0x011b
        L_0x011a:
            r2 = r4
        L_0x011b:
            boolean r9 = r3.h()     // Catch:{ all -> 0x01c9 }
            if (r9 == 0) goto L_0x012a
            java.util.LinkedHashMap r9 = r5.f3020f     // Catch:{ all -> 0x01c9 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x01c9 }
            r9.put(r10, r3)     // Catch:{ all -> 0x01c9 }
        L_0x012a:
            monitor-exit(r5)     // Catch:{ all -> 0x01cc }
            g5.b0 r9 = r5.B     // Catch:{ all -> 0x01cc }
            monitor-enter(r9)     // Catch:{ all -> 0x01cc }
            boolean r10 = r9.f2934f     // Catch:{ all -> 0x01c0 }
            if (r10 != 0) goto L_0x01b8
            g5.e r10 = r9.f2935g     // Catch:{ all -> 0x01c0 }
            r10.d(r6)     // Catch:{ all -> 0x01c0 }
            l5.g r6 = r9.f2932d     // Catch:{ all -> 0x01c0 }
            long r10 = r6.f4128e     // Catch:{ all -> 0x01c0 }
            int r6 = r9.f2933e     // Catch:{ all -> 0x01c0 }
            long r12 = (long) r6     // Catch:{ all -> 0x01c0 }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x01c0 }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0149
            r17 = r8
            goto L_0x014b
        L_0x0149:
            r17 = 0
        L_0x014b:
            if (r0 == 0) goto L_0x014f
            r17 = r17 | 1
        L_0x014f:
            r0 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x01c0 }
            r9.i(r15, r8, r4, r0)     // Catch:{ all -> 0x01c0 }
            l5.h r0 = r9.f2936h     // Catch:{ all -> 0x01c0 }
            l5.g r4 = r9.f2932d     // Catch:{ all -> 0x01c0 }
            r0.t(r4, r12)     // Catch:{ all -> 0x01c0 }
            if (r6 <= 0) goto L_0x0162
            long r10 = r10 - r12
            r9.C(r10, r15)     // Catch:{ all -> 0x01c0 }
        L_0x0162:
            monitor-exit(r9)     // Catch:{ all -> 0x01cc }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x017f
            g5.b0 r2 = r5.B
            monitor-enter(r2)
            boolean r0 = r2.f2934f     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x0174
            l5.h r0 = r2.f2936h     // Catch:{ all -> 0x017c }
            r0.flush()     // Catch:{ all -> 0x017c }
            monitor-exit(r2)
            goto L_0x017f
        L_0x0174:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x017c }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x017f:
            r1.f3042a = r3
            boolean r0 = r1.f3044c
            if (r0 != 0) goto L_0x01a6
            g5.a0 r0 = r1.f3042a
            b1.o.k(r0)
            d5.i r0 = r0.f2917i
            e5.f r2 = r1.f3046e
            int r2 = r2.f2601h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.g(r2, r4)
            g5.a0 r0 = r1.f3042a
            b1.o.k(r0)
            d5.i r0 = r0.f2918j
            e5.f r2 = r1.f3046e
            int r2 = r2.f2602i
            long r2 = (long) r2
            r0.g(r2, r4)
            return
        L_0x01a6:
            g5.a0 r0 = r1.f3042a
            b1.o.k(r0)
            g5.b r2 = g5.b.f2928j
            r0.e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x01b8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c0 }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01c3:
            g5.a r0 = new g5.a     // Catch:{ all -> 0x01c9 }
            r0.<init>()     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01cc }
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.v.g(androidx.appcompat.widget.w):void");
    }

    public final l h() {
        return this.f3045d;
    }
}
