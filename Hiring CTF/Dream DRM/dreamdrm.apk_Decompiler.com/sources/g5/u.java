package g5;

import androidx.compose.ui.platform.e;
import b1.o;
import c5.c;
import c5.f;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l5.h;
import l5.i;

public final class u implements Closeable {
    public static final f0 E;
    public final Socket A;
    public final b0 B;
    public final p C;
    public final LinkedHashSet D;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3018d;

    /* renamed from: e  reason: collision with root package name */
    public final k f3019e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f3020f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final String f3021g;

    /* renamed from: h  reason: collision with root package name */
    public int f3022h;

    /* renamed from: i  reason: collision with root package name */
    public int f3023i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3024j;

    /* renamed from: k  reason: collision with root package name */
    public final f f3025k;

    /* renamed from: l  reason: collision with root package name */
    public final c f3026l;

    /* renamed from: m  reason: collision with root package name */
    public final c f3027m;

    /* renamed from: n  reason: collision with root package name */
    public final c f3028n;

    /* renamed from: o  reason: collision with root package name */
    public final e f3029o;

    /* renamed from: p  reason: collision with root package name */
    public long f3030p;

    /* renamed from: q  reason: collision with root package name */
    public long f3031q;

    /* renamed from: r  reason: collision with root package name */
    public long f3032r;

    /* renamed from: s  reason: collision with root package name */
    public long f3033s;

    /* renamed from: t  reason: collision with root package name */
    public long f3034t;

    /* renamed from: u  reason: collision with root package name */
    public final f0 f3035u;

    /* renamed from: v  reason: collision with root package name */
    public f0 f3036v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public long f3037x;

    /* renamed from: y  reason: collision with root package name */
    public long f3038y;

    /* renamed from: z  reason: collision with root package name */
    public long f3039z;

    static {
        f0 f0Var = new f0();
        f0Var.b(7, 65535);
        f0Var.b(5, 16384);
        E = f0Var;
    }

    public u(i iVar) {
        boolean z5 = iVar.f2989h;
        this.f3018d = z5;
        this.f3019e = iVar.f2986e;
        String str = iVar.f2983b;
        if (str != null) {
            this.f3021g = str;
            this.f3023i = z5 ? 3 : 2;
            f fVar = iVar.f2990i;
            this.f3025k = fVar;
            c f6 = fVar.f();
            this.f3026l = f6;
            this.f3027m = fVar.f();
            this.f3028n = fVar.f();
            this.f3029o = iVar.f2987f;
            f0 f0Var = new f0();
            if (z5) {
                f0Var.b(7, 16777216);
            }
            this.f3035u = f0Var;
            f0 f0Var2 = E;
            this.f3036v = f0Var2;
            this.f3039z = (long) f0Var2.a();
            Socket socket = iVar.f2982a;
            if (socket != null) {
                this.A = socket;
                h hVar = iVar.f2985d;
                if (hVar != null) {
                    this.B = new b0(hVar, z5);
                    i iVar2 = iVar.f2984c;
                    if (iVar2 != null) {
                        this.C = new p(this, new x(iVar2, z5));
                        this.D = new LinkedHashSet();
                        int i3 = iVar.f2988g;
                        if (i3 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i3);
                            f6.c(new h(str.concat(" ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    o.Y("source");
                    throw null;
                }
                o.Y("sink");
                throw null;
            }
            o.Y("socket");
            throw null;
        }
        o.Y("connectionName");
        throw null;
    }

    public final void C(int i3, b bVar) {
        this.f3026l.c(new s(this.f3021g + '[' + i3 + "] writeSynReset", this, i3, bVar, 1), 0);
    }

    public final void D(long j6, int i3) {
        this.f3026l.c(new t(this.f3021g + '[' + i3 + "] windowUpdate", this, i3, j6), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|5|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(g5.b r4, g5.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = a5.c.f212a
            r3.n(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.f3020f     // Catch:{ all -> 0x0058 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0058 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x002f
            java.util.LinkedHashMap r4 = r3.f3020f     // Catch:{ all -> 0x0058 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0058 }
            g5.a0[] r1 = new g5.a0[r0]     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0027
            g5.a0[] r4 = (g5.a0[]) r4     // Catch:{ all -> 0x0058 }
            java.util.LinkedHashMap r1 = r3.f3020f     // Catch:{ all -> 0x0058 }
            r1.clear()     // Catch:{ all -> 0x0058 }
            goto L_0x0030
        L_0x0027:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0058 }
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x002f:
            r4 = 0
        L_0x0030:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x003e
            int r1 = r4.length
        L_0x0034:
            if (r0 >= r1) goto L_0x003e
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            int r0 = r0 + 1
            goto L_0x0034
        L_0x003e:
            g5.b0 r4 = r3.B     // Catch:{ IOException -> 0x0043 }
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            java.net.Socket r4 = r3.A     // Catch:{ IOException -> 0x0048 }
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            c5.c r4 = r3.f3026l
            r4.e()
            c5.c r4 = r3.f3027m
            r4.e()
            c5.c r4 = r3.f3028n
            r4.e()
            return
        L_0x0058:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.u.b(g5.b, g5.b, java.io.IOException):void");
    }

    public final void close() {
        b(b.f2923e, b.f2928j, (IOException) null);
    }

    public final void e(IOException iOException) {
        b bVar = b.f2924f;
        b(bVar, bVar, iOException);
    }

    public final void flush() {
        b0 b0Var = this.B;
        synchronized (b0Var) {
            if (!b0Var.f2934f) {
                b0Var.f2936h.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized a0 i(int i3) {
        return (a0) this.f3020f.get(Integer.valueOf(i3));
    }

    public final synchronized a0 l(int i3) {
        a0 a0Var;
        a0Var = (a0) this.f3020f.remove(Integer.valueOf(i3));
        notifyAll();
        return a0Var;
    }

    public final void n(b bVar) {
        synchronized (this.B) {
            synchronized (this) {
                if (!this.f3024j) {
                    this.f3024j = true;
                    int i3 = this.f3022h;
                    this.B.l(i3, bVar, a5.c.f212a);
                }
            }
        }
    }

    public final synchronized void p(long j6) {
        long j7 = this.w + j6;
        this.w = j7;
        long j8 = j7 - this.f3037x;
        if (j8 >= ((long) (this.f3035u.a() / 2))) {
            D(j8, 0);
            this.f3037x += j8;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.f2933e);
        r6 = (long) r2;
        r8.f3038y += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r9, boolean r10, l5.g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            g5.b0 r12 = r8.B
            r12.e(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f3038y     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.f3039z     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f3020f     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            g5.b0 r4 = r8.B     // Catch:{ all -> 0x0057 }
            int r4 = r4.f2933e     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.f3038y     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.f3038y = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            g5.b0 r4 = r8.B
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.e(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.u.q(int, boolean, l5.g, long):void");
    }
}
