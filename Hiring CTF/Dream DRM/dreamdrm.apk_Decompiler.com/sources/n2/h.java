package n2;

import a2.m;

public final class h implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f4316a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4317b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4318c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4319d;

    /* renamed from: e  reason: collision with root package name */
    public int f4320e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4321f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4322g;

    public h(Object obj, d dVar) {
        this.f4317b = obj;
        this.f4316a = dVar;
    }

    public final boolean a() {
        boolean z5;
        synchronized (this.f4317b) {
            if (!this.f4319d.a()) {
                if (!this.f4318c.a()) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        return z5;
    }

    public final d b() {
        d b6;
        synchronized (this.f4317b) {
            d dVar = this.f4316a;
            b6 = dVar != null ? dVar.b() : this;
        }
        return b6;
    }

    public final boolean c(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4317b) {
            d dVar = this.f4316a;
            z5 = false;
            if (dVar != null) {
                if (!dVar.c(this)) {
                    z6 = false;
                    if (z6 && (cVar.equals(this.f4318c) || this.f4320e != 4)) {
                        z5 = true;
                    }
                }
            }
            z6 = true;
            z5 = true;
        }
        return z5;
    }

    public final void clear() {
        synchronized (this.f4317b) {
            this.f4322g = false;
            this.f4320e = 3;
            this.f4321f = 3;
            this.f4319d.clear();
            this.f4318c.clear();
        }
    }

    public final void d() {
        synchronized (this.f4317b) {
            if (!m.d(this.f4321f)) {
                this.f4321f = 2;
                this.f4319d.d();
            }
            if (!m.d(this.f4320e)) {
                this.f4320e = 2;
                this.f4318c.d();
            }
        }
    }

    public final void e() {
        synchronized (this.f4317b) {
            this.f4322g = true;
            try {
                if (!(this.f4320e == 4 || this.f4321f == 1)) {
                    this.f4321f = 1;
                    this.f4319d.e();
                }
                if (this.f4322g && this.f4320e != 1) {
                    this.f4320e = 1;
                    this.f4318c.e();
                }
            } finally {
                this.f4322g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(n2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4317b
            monitor-enter(r0)
            n2.c r1 = r2.f4319d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f4321f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.f4320e = r1     // Catch:{ all -> 0x0028 }
            n2.d r3 = r2.f4316a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.f(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f4321f     // Catch:{ all -> 0x0028 }
            boolean r3 = a2.m.d(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            n2.c r3 = r2.f4319d     // Catch:{ all -> 0x0028 }
            r3.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.f(n2.c):void");
    }

    public final boolean g(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4317b) {
            d dVar = this.f4316a;
            z5 = false;
            if (dVar != null) {
                if (!dVar.g(this)) {
                    z6 = false;
                    if (z6 && cVar.equals(this.f4318c) && !a()) {
                        z5 = true;
                    }
                }
            }
            z6 = true;
            z5 = true;
        }
        return z5;
    }

    public final boolean h() {
        boolean z5;
        synchronized (this.f4317b) {
            z5 = this.f4320e == 4;
        }
        return z5;
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f4317b) {
            z5 = this.f4320e == 3;
        }
        return z5;
    }

    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f4317b) {
            z5 = true;
            if (this.f4320e != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(n2.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof n2.h
            r1 = 0
            if (r0 == 0) goto L_0x002e
            n2.h r4 = (n2.h) r4
            n2.c r0 = r3.f4318c
            if (r0 != 0) goto L_0x0010
            n2.c r0 = r4.f4318c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            n2.c r0 = r3.f4318c
            n2.c r2 = r4.f4318c
            boolean r0 = r0.j(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            n2.c r0 = r3.f4319d
            if (r0 != 0) goto L_0x0023
            n2.c r4 = r4.f4319d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            n2.c r0 = r3.f4319d
            n2.c r4 = r4.f4319d
            boolean r4 = r0.j(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.j(n2.c):boolean");
    }

    public final boolean k(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4317b) {
            d dVar = this.f4316a;
            z5 = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z6 = false;
                    if (z6 && cVar.equals(this.f4318c) && this.f4320e != 2) {
                        z5 = true;
                    }
                }
            }
            z6 = true;
            z5 = true;
        }
        return z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(n2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4317b
            monitor-enter(r0)
            n2.c r1 = r2.f4318c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f4321f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.f4320e = r1     // Catch:{ all -> 0x001b }
            n2.d r3 = r2.f4316a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.l(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.l(n2.c):void");
    }
}
