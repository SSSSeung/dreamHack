package kotlinx.coroutines.internal;

import i4.h;
import kotlinx.coroutines.scheduling.k;
import w4.l;
import w4.r;
import w4.s;

public final class d extends l implements Runnable, s {

    /* renamed from: f  reason: collision with root package name */
    public final l f3983f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3984g;

    /* renamed from: h  reason: collision with root package name */
    public final i f3985h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3986i;
    private volatile int runningWorkers;

    public d(k kVar, int i3) {
        this.f3983f = kVar;
        this.f3984g = i3;
        if ((kVar instanceof s ? (s) kVar : null) == null) {
            s sVar = r.f5524a;
        }
        this.f3985h = new i();
        this.f3986i = new Object();
    }

    public final void C(h hVar, Runnable runnable) {
        this.f3985h.a(runnable);
        boolean z5 = true;
        if (!(this.runningWorkers >= this.f3984g)) {
            synchronized (this.f3986i) {
                if (this.runningWorkers >= this.f3984g) {
                    z5 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z5) {
                this.f3983f.C(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r3.f3986i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.f3985h.c() != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.runningWorkers++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            kotlinx.coroutines.internal.i r1 = r3.f3985h
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0029
            r1.run()     // Catch:{ all -> 0x000f }
            goto L_0x0015
        L_0x000f:
            r1 = move-exception
            i4.i r2 = i4.i.f3606d
            com.bumptech.glide.c.s(r2, r1)
        L_0x0015:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L_0x0001
            w4.l r1 = r3.f3983f
            boolean r1 = r1.D()
            if (r1 == 0) goto L_0x0001
            w4.l r0 = r3.f3983f
            r0.C(r3, r3)
            return
        L_0x0029:
            java.lang.Object r0 = r3.f3986i
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0044 }
            int r1 = r1 + -1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0044 }
            kotlinx.coroutines.internal.i r1 = r3.f3985h     // Catch:{ all -> 0x0044 }
            int r1 = r1.c()     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0044 }
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)
            goto L_0x0000
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.d.run():void");
    }
}
