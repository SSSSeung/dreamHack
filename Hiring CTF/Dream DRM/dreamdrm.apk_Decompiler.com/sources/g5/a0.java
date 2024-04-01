package g5;

import a5.c;
import b1.o;
import d5.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import z4.r;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public long f2909a;

    /* renamed from: b  reason: collision with root package name */
    public long f2910b;

    /* renamed from: c  reason: collision with root package name */
    public long f2911c;

    /* renamed from: d  reason: collision with root package name */
    public long f2912d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f2913e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2914f;

    /* renamed from: g  reason: collision with root package name */
    public final z f2915g;

    /* renamed from: h  reason: collision with root package name */
    public final y f2916h;

    /* renamed from: i  reason: collision with root package name */
    public final i f2917i = new i(1, this);

    /* renamed from: j  reason: collision with root package name */
    public final i f2918j = new i(1, this);

    /* renamed from: k  reason: collision with root package name */
    public b f2919k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f2920l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2921m;

    /* renamed from: n  reason: collision with root package name */
    public final u f2922n;

    public a0(int i3, u uVar, boolean z5, boolean z6, r rVar) {
        o.m(uVar, "connection");
        this.f2921m = i3;
        this.f2922n = uVar;
        this.f2912d = (long) uVar.f3036v.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2913e = arrayDeque;
        this.f2915g = new z(this, (long) uVar.f3035u.a(), z6);
        this.f2916h = new y(this, z5);
        if (rVar != null) {
            if (!g()) {
                arrayDeque.add(rVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!g()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z5;
        boolean h6;
        byte[] bArr = c.f212a;
        synchronized (this) {
            z zVar = this.f2915g;
            if (!zVar.f3067h && zVar.f3065f) {
                y yVar = this.f2916h;
                if (yVar.f3061f || yVar.f3060e) {
                    z5 = true;
                    h6 = h();
                }
            }
            z5 = false;
            h6 = h();
        }
        if (z5) {
            c(b.f2928j, (IOException) null);
        } else if (!h6) {
            this.f2922n.l(this.f2921m);
        }
    }

    public final void b() {
        y yVar = this.f2916h;
        if (yVar.f3060e) {
            throw new IOException("stream closed");
        } else if (yVar.f3061f) {
            throw new IOException("stream finished");
        } else if (this.f2919k != null) {
            Throwable th = this.f2920l;
            if (th == null) {
                b bVar = this.f2919k;
                o.k(bVar);
                th = new g0(bVar);
            }
            throw th;
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            u uVar = this.f2922n;
            uVar.getClass();
            uVar.B.p(this.f2921m, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = c.f212a;
        synchronized (this) {
            if (this.f2919k != null) {
                return false;
            }
            if (this.f2915g.f3067h && this.f2916h.f3061f) {
                return false;
            }
            this.f2919k = bVar;
            this.f2920l = iOException;
            notifyAll();
            this.f2922n.l(this.f2921m);
            return true;
        }
    }

    public final void e(b bVar) {
        if (d(bVar, (IOException) null)) {
            this.f2922n.C(this.f2921m, bVar);
        }
    }

    public final y f() {
        synchronized (this) {
            if (!(this.f2914f || g())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f2916h;
    }

    public final boolean g() {
        return this.f2922n.f3018d == ((this.f2921m & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean h() {
        /*
            r3 = this;
            monitor-enter(r3)
            g5.b r0 = r3.f2919k     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            g5.z r0 = r3.f2915g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f3067h     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f3065f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            g5.y r0 = r3.f2916h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f3061f     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f3060e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f2914f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a0.h():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(z4.r r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            b1.o.m(r3, r0)
            byte[] r0 = a5.c.f212a
            monitor-enter(r2)
            boolean r0 = r2.f2914f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            g5.z r3 = r2.f2915g     // Catch:{ all -> 0x0035 }
            r3.getClass()     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f2914f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque r0 = r2.f2913e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            g5.z r3 = r2.f2915g     // Catch:{ all -> 0x0035 }
            r3.f3067h = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.h()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            g5.u r3 = r2.f2922n
            int r4 = r2.f2921m
            r3.l(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a0.i(z4.r, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
