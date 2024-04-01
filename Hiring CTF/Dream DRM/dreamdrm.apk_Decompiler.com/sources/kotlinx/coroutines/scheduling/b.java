package kotlinx.coroutines.scheduling;

import a2.m;
import androidx.fragment.app.n0;
import b1.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.internal.r;
import y.d;

public final class b implements Executor, Closeable {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4015k;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4016l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4017m;

    /* renamed from: n  reason: collision with root package name */
    public static final r f4018n = new r("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final int f4019d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4020e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4021f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4022g;

    /* renamed from: h  reason: collision with root package name */
    public final e f4023h;

    /* renamed from: i  reason: collision with root package name */
    public final e f4024i;

    /* renamed from: j  reason: collision with root package name */
    public final p f4025j;
    private volatile /* synthetic */ long parkedWorkersStack;

    static {
        Class<b> cls = b.class;
        f4015k = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f4016l = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f4017m = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public b(int i3, int i6, long j6, String str) {
        this.f4019d = i3;
        this.f4020e = i6;
        this.f4021f = j6;
        this.f4022g = str;
        boolean z5 = true;
        if (i3 >= 1) {
            if (i6 >= i3) {
                if (i6 <= 2097150) {
                    if (j6 <= 0 ? false : z5) {
                        this.f4023h = new e();
                        this.f4024i = new e();
                        this.parkedWorkersStack = 0;
                        this.f4025j = new p(i3 + 1);
                        this.controlState = ((long) i3) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i6 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i6 + " should be greater than or equals to core pool size " + i3).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
    }

    public final int b() {
        synchronized (this.f4025j) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j6 = this.controlState;
            int i3 = (int) (j6 & 2097151);
            int i6 = i3 - ((int) ((j6 & 4398044413952L) >> 21));
            boolean z5 = false;
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 >= this.f4019d) {
                return 0;
            }
            if (i3 >= this.f4020e) {
                return 0;
            }
            int i7 = ((int) (this.controlState & 2097151)) + 1;
            if (i7 > 0 && this.f4025j.b(i7) == null) {
                a aVar = new a(this, i7);
                this.f4025j.c(i7, aVar);
                if (i7 == ((int) (2097151 & f4016l.incrementAndGet(this)))) {
                    z5 = true;
                }
                if (z5) {
                    aVar.start();
                    int i8 = i6 + 1;
                    return i8;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4017m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00a8
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.a
            r4 = 0
            if (r3 == 0) goto L_0x0018
            kotlinx.coroutines.scheduling.a r0 = (kotlinx.coroutines.scheduling.a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            kotlinx.coroutines.scheduling.b r3 = r0.f4014j
            boolean r3 = b1.o.c(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            kotlinx.coroutines.internal.p r3 = r9.f4025j
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch:{ all -> 0x00ba }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L_0x0076
            r3 = r2
        L_0x0033:
            kotlinx.coroutines.internal.p r6 = r9.f4025j
            java.lang.Object r6 = r6.b(r3)
            b1.o.k(r6)
            kotlinx.coroutines.scheduling.a r6 = (kotlinx.coroutines.scheduling.a) r6
            if (r6 == r0) goto L_0x0071
        L_0x0040:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L_0x004f
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L_0x0040
        L_0x004f:
            kotlinx.coroutines.scheduling.l r6 = r6.f4008d
            kotlinx.coroutines.scheduling.e r7 = r9.f4024i
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.scheduling.l.f4042b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            kotlinx.coroutines.scheduling.h r8 = (kotlinx.coroutines.scheduling.h) r8
            if (r8 == 0) goto L_0x0063
            r7.a(r8)
        L_0x0063:
            kotlinx.coroutines.scheduling.h r8 = r6.d()
            if (r8 != 0) goto L_0x006b
            r8 = r1
            goto L_0x006f
        L_0x006b:
            r7.a(r8)
            r8 = r2
        L_0x006f:
            if (r8 != 0) goto L_0x0063
        L_0x0071:
            if (r3 == r5) goto L_0x0076
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0076:
            kotlinx.coroutines.scheduling.e r1 = r9.f4024i
            r1.b()
            kotlinx.coroutines.scheduling.e r1 = r9.f4023h
            r1.b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            kotlinx.coroutines.scheduling.h r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00a9
        L_0x0088:
            kotlinx.coroutines.scheduling.e r1 = r9.f4023h
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.h r1 = (kotlinx.coroutines.scheduling.h) r1
            if (r1 != 0) goto L_0x00a9
            kotlinx.coroutines.scheduling.e r1 = r9.f4024i
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.h r1 = (kotlinx.coroutines.scheduling.h) r1
            if (r1 != 0) goto L_0x00a9
            if (r0 == 0) goto L_0x00a2
            r1 = 5
            r0.h(r1)
        L_0x00a2:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x00a8:
            return
        L_0x00a9:
            r1.run()     // Catch:{ all -> 0x00ad }
            goto L_0x0080
        L_0x00ad:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0080
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.b.close():void");
    }

    public final void e(Runnable runnable, n0 n0Var, boolean z5) {
        h hVar;
        h hVar2;
        int i3;
        j.f4038e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            hVar = (h) runnable;
            hVar.f4031d = nanoTime;
            hVar.f4032e = n0Var;
        } else {
            hVar = new i(runnable, nanoTime, n0Var);
        }
        Thread currentThread = Thread.currentThread();
        a aVar = null;
        a aVar2 = currentThread instanceof a ? (a) currentThread : null;
        if (aVar2 != null && o.c(aVar2.f4014j, this)) {
            aVar = aVar2;
        }
        boolean z6 = true;
        if (aVar == null || (i3 = aVar.f4009e) == 5 || (hVar.f4032e.f1217d == 0 && i3 == 2)) {
            hVar2 = hVar;
        } else {
            aVar.f4013i = true;
            hVar2 = aVar.f4008d.a(hVar, z5);
        }
        if (hVar2 != null) {
            if (!(hVar2.f4032e.f1217d == 1 ? this.f4024i : this.f4023h).a(hVar2)) {
                throw new RejectedExecutionException(m.j(new StringBuilder(), this.f4022g, " was terminated"));
            }
        }
        if (!z5 || aVar == null) {
            z6 = false;
        }
        if (hVar.f4032e.f1217d != 0) {
            long addAndGet = f4016l.addAndGet(this, 2097152);
            if (!z6 && !p() && !n(addAndGet)) {
                p();
            }
        } else if (!z6 && !p() && !n(this.controlState)) {
            p();
        }
    }

    public final void execute(Runnable runnable) {
        e(runnable, j.f4039f, false);
    }

    public final void i(a aVar) {
        long j6;
        long j7;
        if (aVar.c() == f4018n) {
            do {
                j6 = this.parkedWorkersStack;
                int b6 = aVar.b();
                aVar.g(this.f4025j.b((int) (2097151 & j6)));
                j7 = (long) b6;
            } while (!f4015k.compareAndSet(this, j6, j7 | ((2097152 + j6) & -2097152)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void l(a aVar, int i3, int i6) {
        while (true) {
            long j6 = this.parkedWorkersStack;
            int i7 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & -2097152;
            if (i7 == i3) {
                if (i6 == 0) {
                    a aVar2 = aVar;
                    while (true) {
                        Object c6 = aVar2.c();
                        if (c6 != f4018n) {
                            if (c6 != null) {
                                aVar2 = (a) c6;
                                int b6 = aVar2.b();
                                if (b6 != 0) {
                                    i7 = b6;
                                    break;
                                }
                            } else {
                                i7 = 0;
                                break;
                            }
                        } else {
                            i7 = -1;
                            break;
                        }
                    }
                } else {
                    i7 = i6;
                }
            }
            if (i7 >= 0) {
                if (f4015k.compareAndSet(this, j6, j7 | ((long) i7))) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j6) {
        int i3 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i6 = this.f4019d;
        if (i3 < i6) {
            int b6 = b();
            if (b6 == 1 && i6 > 1) {
                b();
            }
            if (b6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        r rVar;
        int i3;
        while (true) {
            long j6 = this.parkedWorkersStack;
            a aVar = (a) this.f4025j.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j6) & -2097152;
                a aVar2 = aVar;
                while (true) {
                    Object c6 = aVar2.c();
                    rVar = f4018n;
                    if (c6 != rVar) {
                        if (c6 != null) {
                            aVar2 = (a) c6;
                            i3 = aVar2.b();
                            if (i3 != 0) {
                                break;
                            }
                        } else {
                            i3 = 0;
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (f4015k.compareAndSet(this, j6, ((long) i3) | j7)) {
                        aVar.g(rVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f4007k.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        char c6;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a6 = this.f4025j.a();
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a6; i10++) {
            a aVar = (a) this.f4025j.b(i10);
            if (aVar != null) {
                int c7 = aVar.f4008d.c();
                int b6 = d.b(aVar.f4009e);
                if (b6 == 0) {
                    i3++;
                    sb = new StringBuilder();
                    sb.append(c7);
                    c6 = 'c';
                } else if (b6 == 1) {
                    i6++;
                    sb = new StringBuilder();
                    sb.append(c7);
                    c6 = 'b';
                } else if (b6 == 2) {
                    i7++;
                } else if (b6 == 3) {
                    i8++;
                    if (c7 > 0) {
                        sb = new StringBuilder();
                        sb.append(c7);
                        c6 = 'd';
                    }
                } else if (b6 == 4) {
                    i9++;
                }
                sb.append(c6);
                arrayList.add(sb.toString());
            }
        }
        long j6 = this.controlState;
        return this.f4022g + '@' + w4.p.p(this) + "[Pool Size {core = " + this.f4019d + ", max = " + this.f4020e + "}, Worker States {CPU = " + i3 + ", blocking = " + i6 + ", parked = " + i7 + ", dormant = " + i8 + ", terminated = " + i9 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4023h.c() + ", global blocking queue size = " + this.f4024i.c() + ", Control State {created workers= " + ((int) (2097151 & j6)) + ", blocking tasks = " + ((int) ((4398044413952L & j6) >> 21)) + ", CPUs acquired = " + (this.f4019d - ((int) ((9223367638808264704L & j6) >> 42))) + "}]";
    }
}
