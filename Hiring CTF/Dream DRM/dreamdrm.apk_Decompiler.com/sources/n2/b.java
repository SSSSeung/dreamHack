package n2;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4285a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4286b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4287c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4288d;

    /* renamed from: e  reason: collision with root package name */
    public int f4289e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4290f = 3;

    public b(Object obj, d dVar) {
        this.f4285a = obj;
        this.f4286b = dVar;
    }

    public final boolean a() {
        boolean z5;
        synchronized (this.f4285a) {
            if (!this.f4287c.a()) {
                if (!this.f4288d.a()) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        return z5;
    }

    public final d b() {
        d b6;
        synchronized (this.f4285a) {
            d dVar = this.f4286b;
            b6 = dVar != null ? dVar.b() : this;
        }
        return b6;
    }

    public final boolean c(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4285a) {
            d dVar = this.f4286b;
            z5 = false;
            if (dVar != null) {
                if (!dVar.c(this)) {
                    z6 = false;
                    if (z6 && m(cVar)) {
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
        synchronized (this.f4285a) {
            this.f4289e = 3;
            this.f4287c.clear();
            if (this.f4290f != 3) {
                this.f4290f = 3;
                this.f4288d.clear();
            }
        }
    }

    public final void d() {
        synchronized (this.f4285a) {
            if (this.f4289e == 1) {
                this.f4289e = 2;
                this.f4287c.d();
            }
            if (this.f4290f == 1) {
                this.f4290f = 2;
                this.f4288d.d();
            }
        }
    }

    public final void e() {
        synchronized (this.f4285a) {
            if (this.f4289e != 1) {
                this.f4289e = 1;
                this.f4287c.e();
            }
        }
    }

    public final void f(c cVar) {
        synchronized (this.f4285a) {
            if (cVar.equals(this.f4287c)) {
                this.f4289e = 4;
            } else if (cVar.equals(this.f4288d)) {
                this.f4290f = 4;
            }
            d dVar = this.f4286b;
            if (dVar != null) {
                dVar.f(this);
            }
        }
    }

    public final boolean g(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4285a) {
            d dVar = this.f4286b;
            z5 = false;
            if (dVar != null) {
                if (!dVar.g(this)) {
                    z6 = false;
                    if (z6 && m(cVar)) {
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
        synchronized (this.f4285a) {
            if (this.f4289e != 4) {
                if (this.f4290f != 4) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        return z5;
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f4285a) {
            z5 = this.f4289e == 3 && this.f4290f == 3;
        }
        return z5;
    }

    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f4285a) {
            z5 = true;
            if (this.f4289e != 1) {
                if (this.f4290f != 1) {
                    z5 = false;
                }
            }
        }
        return z5;
    }

    public final boolean j(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f4287c.j(bVar.f4287c) && this.f4288d.j(bVar.f4288d);
    }

    public final boolean k(c cVar) {
        boolean z5;
        boolean z6;
        synchronized (this.f4285a) {
            d dVar = this.f4286b;
            z5 = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z6 = false;
                    if (z6 && m(cVar)) {
                        z5 = true;
                    }
                }
            }
            z6 = true;
            z5 = true;
        }
        return z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(n2.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4285a
            monitor-enter(r0)
            n2.c r1 = r2.f4288d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.f4289e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f4290f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f4290f = r1     // Catch:{ all -> 0x0027 }
            n2.c r3 = r2.f4288d     // Catch:{ all -> 0x0027 }
            r3.e()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f4290f = r1     // Catch:{ all -> 0x0027 }
            n2.d r3 = r2.f4286b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.l(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b.l(n2.c):void");
    }

    public final boolean m(c cVar) {
        return cVar.equals(this.f4287c) || (this.f4289e == 5 && cVar.equals(this.f4288d));
    }
}
