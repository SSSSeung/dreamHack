package w4;

import h1.b;
import h5.d;
import i4.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.r;

public abstract class c0 extends d0 implements s {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5475i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5476j;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    static {
        Class<c0> cls = c0.class;
        Class<Object> cls2 = Object.class;
        f5475i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f5476j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    public final void C(h hVar, Runnable runnable) {
        L(runnable);
    }

    public void L(Runnable runnable) {
        if (M(runnable)) {
            Thread G = G();
            if (Thread.currentThread() != G) {
                LockSupport.unpark(G);
                return;
            }
            return;
        }
        q.f5521k.L(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f5475i
        L_0x000d:
            r0 = 0
            boolean r0 = r3.compareAndSet(r6, r0, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000d
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.k
            if (r3 == 0) goto L_0x0048
            r3 = r0
            kotlinx.coroutines.internal.k r3 = (kotlinx.coroutines.internal.k) r3
            int r4 = r3.a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f5475i
            kotlinx.coroutines.internal.k r3 = r3.e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            kotlinx.coroutines.internal.r r3 = h5.d.f3470f
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            kotlinx.coroutines.internal.k r3 = new kotlinx.coroutines.internal.k
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5475i
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c0.M(java.lang.Runnable):boolean");
    }

    public final boolean N() {
        b bVar = this.f5479h;
        if (!(bVar == null || bVar.f3356a == bVar.f3357b)) {
            return false;
        }
        b0 b0Var = (b0) this._delayed;
        if (b0Var != null && !b0Var.a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof k) {
                return ((k) obj).d();
            }
            if (obj != d.f3470f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[LOOP:1: B:23:0x0042->B:26:0x004d, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long O() {
        /*
            r9 = this;
            boolean r0 = r9.J()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            w4.b0 r0 = (w4.b0) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0024
            boolean r6 = r0.a()
            if (r6 != 0) goto L_0x0024
            java.lang.System.nanoTime()
            monitor-enter(r0)
            r0.getClass()     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)
            goto L_0x0024
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0024:
            java.lang.Object r0 = r9._queue
            if (r0 != 0) goto L_0x0029
            goto L_0x006b
        L_0x0029:
            boolean r6 = r0 instanceof kotlinx.coroutines.internal.k
            if (r6 == 0) goto L_0x0050
            r6 = r0
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.k) r6
            java.lang.Object r7 = r6.f()
            kotlinx.coroutines.internal.r r8 = kotlinx.coroutines.internal.k.f3996g
            if (r7 == r8) goto L_0x003c
            r4 = r7
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x006b
        L_0x003c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f5475i
            kotlinx.coroutines.internal.k r6 = r6.e()
        L_0x0042:
            boolean r8 = r7.compareAndSet(r9, r0, r6)
            if (r8 == 0) goto L_0x0049
            goto L_0x0024
        L_0x0049:
            java.lang.Object r8 = r7.get(r9)
            if (r8 == r0) goto L_0x0042
            goto L_0x0024
        L_0x0050:
            kotlinx.coroutines.internal.r r6 = h5.d.f3470f
            if (r0 != r6) goto L_0x0055
            goto L_0x006b
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f5475i
        L_0x0057:
            boolean r7 = r6.compareAndSet(r9, r0, r4)
            if (r7 == 0) goto L_0x005f
            r6 = r3
            goto L_0x0066
        L_0x005f:
            java.lang.Object r7 = r6.get(r9)
            if (r7 == r0) goto L_0x0057
            r6 = r5
        L_0x0066:
            if (r6 == 0) goto L_0x0024
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x006b:
            if (r4 == 0) goto L_0x0071
            r4.run()
            return r1
        L_0x0071:
            h1.b r0 = r9.f5479h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            int r4 = r0.f3356a
            int r0 = r0.f3357b
            if (r4 != r0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r3 = r5
        L_0x0083:
            if (r3 == 0) goto L_0x0087
        L_0x0085:
            r3 = r6
            goto L_0x0088
        L_0x0087:
            r3 = r1
        L_0x0088:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008d
            goto L_0x00b3
        L_0x008d:
            java.lang.Object r0 = r9._queue
            if (r0 == 0) goto L_0x00a3
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.k
            if (r3 == 0) goto L_0x009e
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.k) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00a3
            goto L_0x00b3
        L_0x009e:
            kotlinx.coroutines.internal.r r3 = h5.d.f3470f
            if (r0 != r3) goto L_0x00b3
            goto L_0x00b2
        L_0x00a3:
            java.lang.Object r0 = r9._delayed
            w4.b0 r0 = (w4.b0) r0
            if (r0 == 0) goto L_0x00b2
            monitor-enter(r0)
            r0.getClass()     // Catch:{ all -> 0x00af }
            monitor-exit(r0)
            goto L_0x00b2
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00b2:
            r1 = r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c0.O():long");
    }

    public final void P() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[LOOP:0: B:6:0x0015->B:9:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q(long r6, w4.a0 r8) {
        /*
            r5 = this;
            int r0 = r5._isCompleted
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x002d
        L_0x0008:
            java.lang.Object r0 = r5._delayed
            w4.b0 r0 = (w4.b0) r0
            if (r0 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f5476j
            w4.b0 r4 = new w4.b0
            r4.<init>(r6)
        L_0x0015:
            boolean r0 = r3.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            java.lang.Object r0 = r3.get(r5)
            if (r0 == 0) goto L_0x0015
        L_0x0022:
            java.lang.Object r0 = r5._delayed
            b1.o.k(r0)
            w4.b0 r0 = (w4.b0) r0
        L_0x0029:
            int r0 = r8.a(r6, r0, r5)
        L_0x002d:
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x0041
            r6 = 2
            if (r0 != r6) goto L_0x0035
            goto L_0x0068
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0041:
            r5.K(r6, r8)
            goto L_0x0068
        L_0x0045:
            java.lang.Object r6 = r5._delayed
            w4.b0 r6 = (w4.b0) r6
            r7 = 0
            if (r6 == 0) goto L_0x0055
            monitor-enter(r6)
            r6.getClass()     // Catch:{ all -> 0x0052 }
            monitor-exit(r6)
            goto L_0x0055
        L_0x0052:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0055:
            if (r8 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r2 = r7
        L_0x0059:
            if (r2 == 0) goto L_0x0068
            java.lang.Thread r6 = r5.G()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L_0x0068
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c0.Q(long, w4.a0):void");
    }

    public void shutdown() {
        a0 c6;
        ThreadLocal threadLocal = z0.f5534a;
        z0.f5534a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            r rVar = d.f3470f;
            boolean z5 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5475i;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z5 = true;
                        break;
                    }
                }
                if (z5) {
                    break;
                }
            } else if (obj instanceof k) {
                ((k) obj).b();
                break;
            } else if (obj == rVar) {
                break;
            } else {
                k kVar = new k(8, true);
                kVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5475i;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z5 = true;
                        break;
                    }
                }
                if (z5) {
                    break;
                }
            }
        }
        do {
        } while (O() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b0 b0Var = (b0) this._delayed;
            if (b0Var != null && (c6 = b0Var.c()) != null) {
                K(nanoTime, c6);
            } else {
                return;
            }
        }
    }
}
