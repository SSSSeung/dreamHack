package g5;

import a5.c;
import b1.o;
import l5.g;
import l5.u;
import l5.x;

public final class y implements u {

    /* renamed from: d  reason: collision with root package name */
    public final g f3059d = new g();

    /* renamed from: e  reason: collision with root package name */
    public boolean f3060e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3061f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f3062g;

    public y(a0 a0Var, boolean z5) {
        this.f3062g = a0Var;
        this.f3061f = z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r12.f3062g.f2918j.l();
        r12.f3062g.b();
        r1 = r12.f3062g;
        r10 = java.lang.Math.min(r1.f2912d - r1.f2911c, r12.f3059d.f4128e);
        r1 = r12.f3062g;
        r1.f2911c += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r13 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r10 != r12.f3059d.f4128e) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13 = r1.f2919k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r13 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.f3062g.f2918j.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0091, code lost:
        throw r13;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r13) {
        /*
            r12 = this;
            g5.a0 r0 = r12.f3062g
            monitor-enter(r0)
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            d5.i r1 = r1.f2918j     // Catch:{ all -> 0x0092 }
            r1.h()     // Catch:{ all -> 0x0092 }
        L_0x000a:
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x002b }
            long r2 = r1.f2911c     // Catch:{ all -> 0x002b }
            long r4 = r1.f2912d     // Catch:{ all -> 0x002b }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x002d
            boolean r2 = r12.f3061f     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x002d
            boolean r2 = r12.f3060e     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x002d
            monitor-enter(r1)     // Catch:{ all -> 0x002b }
            g5.b r2 = r1.f2919k     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x002d
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x002b }
            r1.j()     // Catch:{ all -> 0x002b }
            goto L_0x000a
        L_0x0028:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r13     // Catch:{ all -> 0x002b }
        L_0x002b:
            r13 = move-exception
            goto L_0x008a
        L_0x002d:
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            d5.i r1 = r1.f2918j     // Catch:{ all -> 0x0092 }
            r1.l()     // Catch:{ all -> 0x0092 }
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            r1.b()     // Catch:{ all -> 0x0092 }
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            long r2 = r1.f2912d     // Catch:{ all -> 0x0092 }
            long r4 = r1.f2911c     // Catch:{ all -> 0x0092 }
            long r2 = r2 - r4
            l5.g r1 = r12.f3059d     // Catch:{ all -> 0x0092 }
            long r4 = r1.f4128e     // Catch:{ all -> 0x0092 }
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0092 }
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            long r2 = r1.f2911c     // Catch:{ all -> 0x0092 }
            long r2 = r2 + r10
            r1.f2911c = r2     // Catch:{ all -> 0x0092 }
            if (r13 == 0) goto L_0x0064
            l5.g r13 = r12.f3059d     // Catch:{ all -> 0x0092 }
            long r2 = r13.f4128e     // Catch:{ all -> 0x0092 }
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0064
            monitor-enter(r1)     // Catch:{ all -> 0x0092 }
            g5.b r13 = r1.f2919k     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            if (r13 != 0) goto L_0x0064
            r13 = 1
            goto L_0x0065
        L_0x0061:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r13     // Catch:{ all -> 0x0092 }
        L_0x0064:
            r13 = 0
        L_0x0065:
            r8 = r13
            monitor-exit(r0)
            g5.a0 r13 = r12.f3062g
            d5.i r13 = r13.f2918j
            r13.h()
            g5.a0 r13 = r12.f3062g     // Catch:{ all -> 0x0081 }
            g5.u r6 = r13.f2922n     // Catch:{ all -> 0x0081 }
            int r7 = r13.f2921m     // Catch:{ all -> 0x0081 }
            l5.g r9 = r12.f3059d     // Catch:{ all -> 0x0081 }
            r6.q(r7, r8, r9, r10)     // Catch:{ all -> 0x0081 }
            g5.a0 r13 = r12.f3062g
            d5.i r13 = r13.f2918j
            r13.l()
            return
        L_0x0081:
            r13 = move-exception
            g5.a0 r0 = r12.f3062g
            d5.i r0 = r0.f2918j
            r0.l()
            throw r13
        L_0x008a:
            g5.a0 r1 = r12.f3062g     // Catch:{ all -> 0x0092 }
            d5.i r1 = r1.f2918j     // Catch:{ all -> 0x0092 }
            r1.l()     // Catch:{ all -> 0x0092 }
            throw r13     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.b(boolean):void");
    }

    public final x c() {
        return this.f3062g.f2918j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0019, code lost:
        r0 = r14.f3062g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001f, code lost:
        if (r0.f2916h.f3061f != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        if (r14.f3059d.f4128e <= 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002c, code lost:
        if (r1 == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        if (r14.f3059d.f4128e <= 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r2 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        r0.f2922n.q(r0.f2921m, true, (l5.g) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        r0 = r14.f3062g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r14.f3060e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        r14.f3062g.f2922n.flush();
        r14.f3062g.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r14 = this;
            g5.a0 r0 = r14.f3062g
            byte[] r1 = a5.c.f212a
            monitor-enter(r0)
            boolean r1 = r14.f3060e     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            g5.a0 r1 = r14.f3062g     // Catch:{ all -> 0x0060 }
            monitor-enter(r1)     // Catch:{ all -> 0x0060 }
            g5.b r2 = r1.f2919k     // Catch:{ all -> 0x005d }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            r1 = 0
            r3 = 1
            if (r2 != 0) goto L_0x0017
            r2 = r3
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            monitor-exit(r0)
            g5.a0 r0 = r14.f3062g
            g5.y r4 = r0.f2916h
            boolean r4 = r4.f3061f
            if (r4 != 0) goto L_0x0047
            l5.g r4 = r14.f3059d
            long r4 = r4.f4128e
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x002c
            r1 = r3
        L_0x002c:
            if (r1 == 0) goto L_0x003a
        L_0x002e:
            l5.g r0 = r14.f3059d
            long r0 = r0.f4128e
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            r14.b(r3)
            goto L_0x002e
        L_0x003a:
            if (r2 == 0) goto L_0x0047
            g5.u r8 = r0.f2922n
            int r9 = r0.f2921m
            r10 = 1
            r11 = 0
            r12 = 0
            r8.q(r9, r10, r11, r12)
        L_0x0047:
            g5.a0 r0 = r14.f3062g
            monitor-enter(r0)
            r14.f3060e = r3     // Catch:{ all -> 0x005a }
            monitor-exit(r0)
            g5.a0 r0 = r14.f3062g
            g5.u r0 = r0.f2922n
            r0.flush()
            g5.a0 r0 = r14.f3062g
            r0.a()
            return
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x005d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r2     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.y.close():void");
    }

    public final void flush() {
        a0 a0Var = this.f3062g;
        byte[] bArr = c.f212a;
        synchronized (a0Var) {
            this.f3062g.b();
        }
        while (this.f3059d.f4128e > 0) {
            b(false);
            this.f3062g.f2922n.flush();
        }
    }

    public final void t(g gVar, long j6) {
        o.m(gVar, "source");
        byte[] bArr = c.f212a;
        g gVar2 = this.f3059d;
        gVar2.t(gVar, j6);
        while (gVar2.f4128e >= 16384) {
            b(false);
        }
    }
}
