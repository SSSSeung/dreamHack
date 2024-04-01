package kotlinx.coroutines.scheduling;

import b1.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q4.e;

public final class a extends Thread {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4007k = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: d  reason: collision with root package name */
    public final l f4008d = new l();

    /* renamed from: e  reason: collision with root package name */
    public int f4009e = 4;

    /* renamed from: f  reason: collision with root package name */
    public long f4010f;

    /* renamed from: g  reason: collision with root package name */
    public long f4011g;

    /* renamed from: h  reason: collision with root package name */
    public int f4012h = e.f4910d.a();

    /* renamed from: i  reason: collision with root package name */
    public boolean f4013i;
    private volatile int indexInArray;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f4014j;
    private volatile Object nextParkedWorker = b.f4018n;
    volatile /* synthetic */ int workerCtl = 0;

    public a(b bVar, int i3) {
        this.f4014j = bVar;
        setDaemon(true);
        f(i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.scheduling.h} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r0 == null) goto L_0x0091;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.scheduling.h a(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.f4009e
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0007
            goto L_0x002e
        L_0x0007:
            kotlinx.coroutines.scheduling.b r0 = r9.f4014j
        L_0x0009:
            long r5 = r0.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r7 = 42
            long r3 = r3 >> r7
            int r3 = (int) r3
            if (r3 != 0) goto L_0x0019
            r0 = r2
            goto L_0x002a
        L_0x0019:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.b.f4016l
            r4 = r0
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L_0x0009
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x0030
            r9.f4009e = r1
        L_0x002e:
            r0 = r1
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            r3 = 0
            if (r0 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x006e
            kotlinx.coroutines.scheduling.b r10 = r9.f4014j
            int r10 = r10.f4019d
            int r10 = r10 * 2
            int r10 = r9.d(r10)
            if (r10 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            if (r1 == 0) goto L_0x004d
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 == 0) goto L_0x004d
            goto L_0x0079
        L_0x004d:
            kotlinx.coroutines.scheduling.l r10 = r9.f4008d
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.l.f4042b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
            if (r0 != 0) goto L_0x0061
            kotlinx.coroutines.scheduling.h r10 = r10.d()
            goto L_0x0062
        L_0x0061:
            r10 = r0
        L_0x0062:
            if (r10 == 0) goto L_0x0065
            goto L_0x0079
        L_0x0065:
            if (r1 != 0) goto L_0x0075
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 == 0) goto L_0x0075
            goto L_0x0079
        L_0x006e:
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            kotlinx.coroutines.scheduling.h r10 = r9.i(r2)
        L_0x0079:
            return r10
        L_0x007a:
            if (r10 == 0) goto L_0x0091
            kotlinx.coroutines.scheduling.l r10 = r9.f4008d
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.l.f4042b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
            if (r0 != 0) goto L_0x008f
            kotlinx.coroutines.scheduling.h r0 = r10.d()
        L_0x008f:
            if (r0 != 0) goto L_0x009c
        L_0x0091:
            kotlinx.coroutines.scheduling.b r10 = r9.f4014j
            kotlinx.coroutines.scheduling.e r10 = r10.f4024i
            java.lang.Object r10 = r10.d()
            r0 = r10
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
        L_0x009c:
            if (r0 != 0) goto L_0x00a2
            kotlinx.coroutines.scheduling.h r0 = r9.i(r1)
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.a(boolean):kotlinx.coroutines.scheduling.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i6 = this.f4012h;
        int i7 = i6 ^ (i6 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f4012h = i9;
        int i10 = i3 - 1;
        return (i10 & i3) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        e eVar;
        int d6 = d(2);
        b bVar = this.f4014j;
        if (d6 == 0) {
            h hVar = (h) bVar.f4023h.d();
            if (hVar != null) {
                return hVar;
            }
            eVar = bVar.f4024i;
        } else {
            h hVar2 = (h) bVar.f4024i.d();
            if (hVar2 != null) {
                return hVar2;
            }
            eVar = bVar.f4023h;
        }
        return (h) eVar.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4014j.f4022g);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i6 = this.f4009e;
        boolean z5 = true;
        if (i6 != 1) {
            z5 = false;
        }
        if (z5) {
            b.f4016l.addAndGet(this.f4014j, 4398046511104L);
        }
        if (i6 != i3) {
            this.f4009e = i3;
        }
        return z5;
    }

    public final h i(boolean z5) {
        long j6;
        int i3 = (int) (this.f4014j.controlState & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d6 = d(i3);
        b bVar = this.f4014j;
        long j7 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < i3; i6++) {
            d6++;
            if (d6 > i3) {
                d6 = 1;
            }
            a aVar = (a) bVar.f4025j.b(d6);
            if (!(aVar == null || aVar == this)) {
                l lVar = this.f4008d;
                l lVar2 = aVar.f4008d;
                if (z5) {
                    j6 = lVar.e(lVar2);
                } else {
                    lVar.getClass();
                    h d7 = lVar2.d();
                    if (d7 != null) {
                        lVar.a(d7, false);
                        j6 = -1;
                    } else {
                        j6 = lVar.f(lVar2, false);
                    }
                }
                if (j6 == -1) {
                    l lVar3 = this.f4008d;
                    lVar3.getClass();
                    h hVar = (h) l.f4042b.getAndSet(lVar3, (Object) null);
                    return hVar == null ? lVar3.d() : hVar;
                } else if (j6 > 0) {
                    j7 = Math.min(j7, j6);
                }
            }
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = 0;
        }
        this.f4011g = j7;
        return null;
    }

    public final void run() {
        loop0:
        while (true) {
            boolean z5 = false;
            while (!this.f4014j.isTerminated() && this.f4009e != 5) {
                h a6 = a(this.f4013i);
                if (a6 == null) {
                    this.f4013i = false;
                    if (this.f4011g == 0) {
                        if (this.nextParkedWorker != b.f4018n) {
                            this.workerCtl = -1;
                            while (true) {
                                if (!(this.nextParkedWorker != b.f4018n) || this.workerCtl != -1 || this.f4014j.isTerminated() || this.f4009e == 5) {
                                    break;
                                }
                                h(3);
                                Thread.interrupted();
                                if (this.f4010f == 0) {
                                    this.f4010f = System.nanoTime() + this.f4014j.f4021f;
                                }
                                LockSupport.parkNanos(this.f4014j.f4021f);
                                if (System.nanoTime() - this.f4010f >= 0) {
                                    this.f4010f = 0;
                                    b bVar = this.f4014j;
                                    synchronized (bVar.f4025j) {
                                        if (!bVar.isTerminated()) {
                                            if (((int) (bVar.controlState & 2097151)) > bVar.f4019d) {
                                                if (f4007k.compareAndSet(this, -1, 1)) {
                                                    int i3 = this.indexInArray;
                                                    f(0);
                                                    bVar.l(this, i3, 0);
                                                    int andDecrement = (int) (b.f4016l.getAndDecrement(bVar) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object b6 = bVar.f4025j.b(andDecrement);
                                                        o.k(b6);
                                                        a aVar = (a) b6;
                                                        bVar.f4025j.c(i3, aVar);
                                                        aVar.f(i3);
                                                        bVar.l(aVar, andDecrement, i3);
                                                    }
                                                    bVar.f4025j.c(andDecrement, (a) null);
                                                    this.f4009e = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f4014j.i(this);
                        }
                    } else if (!z5) {
                        z5 = true;
                    } else {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f4011g);
                        this.f4011g = 0;
                    }
                } else {
                    this.f4011g = 0;
                    int i6 = a6.f4032e.f1217d;
                    this.f4010f = 0;
                    if (this.f4009e == 3) {
                        this.f4009e = 2;
                    }
                    b bVar2 = this.f4014j;
                    if (i6 != 0 && h(2) && !bVar2.p() && !bVar2.n(bVar2.controlState)) {
                        bVar2.p();
                    }
                    bVar2.getClass();
                    try {
                        a6.run();
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                    }
                    if (i6 != 0) {
                        b.f4016l.addAndGet(bVar2, -2097152);
                        if (this.f4009e != 5) {
                            this.f4009e = 4;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
