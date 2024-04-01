package w4;

import androidx.fragment.app.q;
import b1.o;
import com.bumptech.glide.e;
import h5.l;
import i4.f;
import i4.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.n;

public class q0 implements i0, h, v0 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5523d = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public q0(boolean z5) {
        this._state = z5 ? l.f3497p : l.f3496o;
        this._parentHandle = null;
    }

    public static g J(h hVar) {
        while (hVar.n()) {
            hVar = hVar.m();
        }
        while (true) {
            hVar = hVar.l();
            if (!hVar.n()) {
                if (hVar instanceof g) {
                    return (g) hVar;
                }
                if (hVar instanceof t0) {
                    return null;
                }
            }
        }
    }

    public static String P(Object obj) {
        if (!(obj instanceof o0)) {
            return obj instanceof g0 ? ((g0) obj).b() ? "Active" : "New" : obj instanceof i ? "Cancelled" : "Completed";
        }
        o0 o0Var = (o0) obj;
        if (o0Var.d()) {
            return "Cancelling";
        }
        if (o0Var.e()) {
            return "Completing";
        }
    }

    public final f A() {
        return (f) this._parentHandle;
    }

    public final Object B() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public boolean C(Throwable th) {
        return false;
    }

    public void D(q qVar) {
        throw qVar;
    }

    public final void E(i0 i0Var) {
        int O;
        u0 u0Var = u0.f5527d;
        if (i0Var == null) {
            this._parentHandle = u0Var;
            return;
        }
        q0 q0Var = (q0) i0Var;
        do {
            O = q0Var.O(q0Var.B());
            if (O == 0) {
                break;
            }
        } while (O != 1);
        f fVar = (f) e.p(q0Var, true, new g(this), 2);
        this._parentHandle = fVar;
        if (!(B() instanceof g0)) {
            fVar.c();
            this._parentHandle = u0Var;
        }
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [w4.f0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.x F(boolean r11, boolean r12, o4.c r13) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0015
            boolean r2 = r13 instanceof w4.k0
            if (r2 == 0) goto L_0x000c
            r2 = r13
            w4.k0 r2 = (w4.k0) r2
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r2 != 0) goto L_0x0026
            w4.h0 r2 = new w4.h0
            r2.<init>(r13)
            goto L_0x0026
        L_0x0015:
            boolean r2 = r13 instanceof w4.m0
            if (r2 == 0) goto L_0x001d
            r2 = r13
            w4.m0 r2 = (w4.m0) r2
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            if (r2 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            w4.y r2 = new w4.y
            r2.<init>(r0, r13)
        L_0x0026:
            r2.f5493g = r10
        L_0x0028:
            java.lang.Object r3 = r10.B()
            boolean r4 = r3 instanceof w4.z
            r5 = 0
            if (r4 == 0) goto L_0x006b
            r4 = r3
            w4.z r4 = (w4.z) r4
            boolean r6 = r4.f5533d
            if (r6 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f5523d
        L_0x003a:
            boolean r4 = r6.compareAndSet(r10, r3, r2)
            if (r4 == 0) goto L_0x0042
            r5 = r0
            goto L_0x0048
        L_0x0042:
            java.lang.Object r4 = r6.get(r10)
            if (r4 == r3) goto L_0x003a
        L_0x0048:
            if (r5 == 0) goto L_0x0028
            return r2
        L_0x004b:
            w4.t0 r3 = new w4.t0
            r3.<init>()
            boolean r5 = r4.f5533d
            if (r5 == 0) goto L_0x0055
            goto L_0x005b
        L_0x0055:
            w4.f0 r5 = new w4.f0
            r5.<init>(r3)
            r3 = r5
        L_0x005b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5523d
            boolean r6 = r5.compareAndSet(r10, r4, r3)
            if (r6 == 0) goto L_0x0064
            goto L_0x0028
        L_0x0064:
            java.lang.Object r5 = r5.get(r10)
            if (r5 == r4) goto L_0x005b
            goto L_0x0028
        L_0x006b:
            boolean r4 = r3 instanceof w4.g0
            if (r4 == 0) goto L_0x00eb
            r4 = r3
            w4.g0 r4 = (w4.g0) r4
            w4.t0 r4 = r4.f()
            if (r4 != 0) goto L_0x0088
            if (r3 == 0) goto L_0x0080
            w4.m0 r3 = (w4.m0) r3
            r10.N(r3)
            goto L_0x0028
        L_0x0080:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r11.<init>(r12)
            throw r11
        L_0x0088:
            w4.u0 r6 = w4.u0.f5527d
            r7 = 2
            if (r11 == 0) goto L_0x00cc
            boolean r8 = r3 instanceof w4.o0
            if (r8 == 0) goto L_0x00cc
            monitor-enter(r3)
            r8 = r3
            w4.o0 r8 = (w4.o0) r8     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable r8 = r8.c()     // Catch:{ all -> 0x00c9 }
            if (r8 == 0) goto L_0x00a8
            boolean r9 = r13 instanceof w4.g     // Catch:{ all -> 0x00c9 }
            if (r9 == 0) goto L_0x00c7
            r9 = r3
            w4.o0 r9 = (w4.o0) r9     // Catch:{ all -> 0x00c9 }
            boolean r9 = r9.e()     // Catch:{ all -> 0x00c9 }
            if (r9 != 0) goto L_0x00c7
        L_0x00a8:
            w4.p0 r6 = new w4.p0     // Catch:{ all -> 0x00c9 }
            r6.<init>(r2, r10, r3)     // Catch:{ all -> 0x00c9 }
        L_0x00ad:
            kotlinx.coroutines.internal.h r9 = r4.m()     // Catch:{ all -> 0x00c9 }
            int r9 = r9.q(r2, r4, r6)     // Catch:{ all -> 0x00c9 }
            if (r9 == r0) goto L_0x00bc
            if (r9 == r7) goto L_0x00ba
            goto L_0x00ad
        L_0x00ba:
            r6 = r5
            goto L_0x00bd
        L_0x00bc:
            r6 = r0
        L_0x00bd:
            if (r6 != 0) goto L_0x00c2
            monitor-exit(r3)
            goto L_0x0028
        L_0x00c2:
            if (r8 != 0) goto L_0x00c6
            monitor-exit(r3)
            return r2
        L_0x00c6:
            r6 = r2
        L_0x00c7:
            monitor-exit(r3)
            goto L_0x00cd
        L_0x00c9:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        L_0x00cc:
            r8 = r1
        L_0x00cd:
            if (r8 == 0) goto L_0x00d5
            if (r12 == 0) goto L_0x00d4
            r13.i(r8)
        L_0x00d4:
            return r6
        L_0x00d5:
            w4.p0 r6 = new w4.p0
            r6.<init>(r2, r10, r3)
        L_0x00da:
            kotlinx.coroutines.internal.h r3 = r4.m()
            int r3 = r3.q(r2, r4, r6)
            if (r3 == r0) goto L_0x00e7
            if (r3 == r7) goto L_0x00e8
            goto L_0x00da
        L_0x00e7:
            r5 = r0
        L_0x00e8:
            if (r5 == 0) goto L_0x0028
            return r2
        L_0x00eb:
            if (r12 == 0) goto L_0x00fc
            boolean r11 = r3 instanceof w4.i
            if (r11 == 0) goto L_0x00f4
            w4.i r3 = (w4.i) r3
            goto L_0x00f5
        L_0x00f4:
            r3 = r1
        L_0x00f5:
            if (r3 == 0) goto L_0x00f9
            java.lang.Throwable r1 = r3.f5487a
        L_0x00f9:
            r13.i(r1)
        L_0x00fc:
            w4.u0 r11 = w4.u0.f5527d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.F(boolean, boolean, o4.c):w4.x");
    }

    public boolean G() {
        return this instanceof b;
    }

    public final Object H(Object obj) {
        Object Q;
        do {
            Q = Q(B(), obj);
            if (Q == l.f3491j) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                i iVar = obj instanceof i ? (i) obj : null;
                if (iVar != null) {
                    th = iVar.f5487a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (Q == l.f3493l);
        return Q;
    }

    public String I() {
        return getClass().getSimpleName();
    }

    public final void K(t0 t0Var, Throwable th) {
        q qVar = null;
        for (h hVar = (h) t0Var.k(); !o.c(hVar, t0Var); hVar = hVar.l()) {
            if (hVar instanceof k0) {
                m0 m0Var = (m0) hVar;
                try {
                    m0Var.s(th);
                } catch (Throwable th2) {
                    if (qVar != null) {
                        o.a(qVar, th2);
                    } else {
                        qVar = new q("Exception in completion handler " + m0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (qVar != null) {
            D(qVar);
        }
        m(th);
    }

    public void L(Object obj) {
    }

    public void M() {
    }

    public final void N(m0 m0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z5;
        t0 t0Var = new t0();
        m0Var.getClass();
        h.f3990e.lazySet(t0Var, m0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f3989d;
        atomicReferenceFieldUpdater2.lazySet(t0Var, m0Var);
        while (true) {
            if (m0Var.k() == m0Var) {
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(m0Var, m0Var, t0Var)) {
                        if (atomicReferenceFieldUpdater2.get(m0Var) != m0Var) {
                            z5 = false;
                            continue;
                            break;
                        }
                    } else {
                        z5 = true;
                        continue;
                        break;
                    }
                }
                if (z5) {
                    t0Var.j(m0Var);
                    break;
                }
            } else {
                break;
            }
        }
        h l6 = m0Var.l();
        do {
            atomicReferenceFieldUpdater = f5523d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m0Var, l6) || atomicReferenceFieldUpdater.get(this) != m0Var) {
            }
            atomicReferenceFieldUpdater = f5523d;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != m0Var);
    }

    public final int O(Object obj) {
        boolean z5 = obj instanceof z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5523d;
        boolean z6 = false;
        if (z5) {
            if (((z) obj).f5533d) {
                return 0;
            }
            z zVar = l.f3497p;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, zVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                return -1;
            }
            M();
            return 1;
        } else if (!(obj instanceof f0)) {
            return 0;
        } else {
            t0 t0Var = ((f0) obj).f5482d;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                return -1;
            }
            M();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b4, code lost:
        if (r5 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b6, code lost:
        K(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bb, code lost:
        if ((r8 instanceof w4.g) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bd, code lost:
        r0 = (w4.g) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c2, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c4, code lost:
        r8 = r8.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c8, code lost:
        if (r8 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ca, code lost:
        r4 = J(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cf, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d0, code lost:
        if (r4 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d6, code lost:
        if (R(r3, r4, r9) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return u(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return h5.l.f3492k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof w4.g0
            if (r0 != 0) goto L_0x0007
            kotlinx.coroutines.internal.r r8 = h5.l.f3491j
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof w4.z
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r8 instanceof w4.m0
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r8 instanceof w4.g
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9 instanceof w4.i
            if (r0 != 0) goto L_0x004c
            r0 = r8
            w4.g0 r0 = (w4.g0) r0
            boolean r8 = r9 instanceof w4.g0
            if (r8 == 0) goto L_0x002a
            b0.b r8 = new b0.b
            r3 = r9
            w4.g0 r3 = (w4.g0) r3
            r8.<init>(r3)
            r3 = r8
            goto L_0x002b
        L_0x002a:
            r3 = r9
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f5523d
            boolean r4 = r8.compareAndSet(r7, r0, r3)
            if (r4 == 0) goto L_0x0035
            r8 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r8 = r8.get(r7)
            if (r8 == r0) goto L_0x002b
            r8 = r2
        L_0x003c:
            if (r8 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r7.L(r9)
            r7.s(r0, r9)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r9
        L_0x0049:
            kotlinx.coroutines.internal.r r8 = h5.l.f3493l
            return r8
        L_0x004c:
            w4.g0 r8 = (w4.g0) r8
            w4.t0 r0 = r7.z(r8)
            if (r0 != 0) goto L_0x0058
            kotlinx.coroutines.internal.r r8 = h5.l.f3493l
            goto L_0x00df
        L_0x0058:
            boolean r3 = r8 instanceof w4.o0
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r8
            w4.o0 r3 = (w4.o0) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            w4.o0 r3 = new w4.o0
            r3.<init>(r0, r4)
        L_0x0069:
            monitor-enter(r3)
            boolean r5 = r3.e()     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x0073
            kotlinx.coroutines.internal.r r8 = h5.l.f3491j     // Catch:{ all -> 0x00e0 }
            goto L_0x008c
        L_0x0073:
            r3.i()     // Catch:{ all -> 0x00e0 }
            if (r3 == r8) goto L_0x008e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f5523d     // Catch:{ all -> 0x00e0 }
        L_0x007a:
            boolean r6 = r5.compareAndSet(r7, r8, r3)     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x0082
            r2 = r1
            goto L_0x0088
        L_0x0082:
            java.lang.Object r6 = r5.get(r7)     // Catch:{ all -> 0x00e0 }
            if (r6 == r8) goto L_0x007a
        L_0x0088:
            if (r2 != 0) goto L_0x008e
            kotlinx.coroutines.internal.r r8 = h5.l.f3493l     // Catch:{ all -> 0x00e0 }
        L_0x008c:
            monitor-exit(r3)
            goto L_0x00df
        L_0x008e:
            boolean r2 = r3.d()     // Catch:{ all -> 0x00e0 }
            boolean r5 = r9 instanceof w4.i     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x009a
            r5 = r9
            w4.i r5 = (w4.i) r5     // Catch:{ all -> 0x00e0 }
            goto L_0x009b
        L_0x009a:
            r5 = r4
        L_0x009b:
            if (r5 == 0) goto L_0x00a2
            java.lang.Throwable r5 = r5.f5487a     // Catch:{ all -> 0x00e0 }
            r3.a(r5)     // Catch:{ all -> 0x00e0 }
        L_0x00a2:
            java.lang.Throwable r5 = r3.c()     // Catch:{ all -> 0x00e0 }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00e0 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r5 = r4
        L_0x00b3:
            monitor-exit(r3)
            if (r5 == 0) goto L_0x00b9
            r7.K(r0, r5)
        L_0x00b9:
            boolean r0 = r8 instanceof w4.g
            if (r0 == 0) goto L_0x00c1
            r0 = r8
            w4.g r0 = (w4.g) r0
            goto L_0x00c2
        L_0x00c1:
            r0 = r4
        L_0x00c2:
            if (r0 != 0) goto L_0x00cf
            w4.t0 r8 = r8.f()
            if (r8 == 0) goto L_0x00d0
            w4.g r4 = J(r8)
            goto L_0x00d0
        L_0x00cf:
            r4 = r0
        L_0x00d0:
            if (r4 == 0) goto L_0x00db
            boolean r8 = r7.R(r3, r4, r9)
            if (r8 == 0) goto L_0x00db
            kotlinx.coroutines.internal.r r8 = h5.l.f3492k
            goto L_0x00df
        L_0x00db:
            java.lang.Object r8 = r7.u(r3, r9)
        L_0x00df:
            return r8
        L_0x00e0:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.Q(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean R(o0 o0Var, g gVar, Object obj) {
        do {
            if (e.p(gVar.f5483h, false, new n0(this, o0Var, gVar, obj), 1) != u0.f5527d) {
                return true;
            }
            gVar = J(gVar);
        } while (gVar != null);
        return false;
    }

    public void a(Object obj) {
    }

    public boolean b() {
        Object B = B();
        return (B instanceof g0) && ((g0) B).b();
    }

    public final i4.h e(g gVar) {
        return o.J(this, gVar);
    }

    public final g getKey() {
        return androidx.compose.ui.platform.e.f897n;
    }

    public void h(Object obj) {
        a(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x00bd A[EDGE_INSN: B:86:0x00bd->B:60:0x00bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(java.lang.Object r10) {
        /*
            r9 = this;
            kotlinx.coroutines.internal.r r0 = h5.l.f3491j
            boolean r1 = r9.y()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.B()
            boolean r1 = r0 instanceof w4.g0
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof w4.o0
            if (r1 == 0) goto L_0x0020
            r1 = r0
            w4.o0 r1 = (w4.o0) r1
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            w4.i r1 = new w4.i
            java.lang.Throwable r4 = r9.t(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.Q(r0, r1)
            kotlinx.coroutines.internal.r r1 = h5.l.f3493l
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            kotlinx.coroutines.internal.r r0 = h5.l.f3491j
        L_0x0034:
            kotlinx.coroutines.internal.r r1 = h5.l.f3492k
            if (r0 != r1) goto L_0x0039
            return r3
        L_0x0039:
            kotlinx.coroutines.internal.r r1 = h5.l.f3491j
            if (r0 != r1) goto L_0x00ee
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.B()
            boolean r5 = r4 instanceof w4.o0
            if (r5 == 0) goto L_0x0083
            monitor-enter(r4)
            r5 = r4
            w4.o0 r5 = (w4.o0) r5     // Catch:{ all -> 0x0080 }
            boolean r5 = r5.g()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0056
            kotlinx.coroutines.internal.r r10 = h5.l.f3494m     // Catch:{ all -> 0x0080 }
            monitor-exit(r4)
            goto L_0x00ed
        L_0x0056:
            r5 = r4
            w4.o0 r5 = (w4.o0) r5     // Catch:{ all -> 0x0080 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0063
            java.lang.Throwable r1 = r9.t(r10)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            r10 = r4
            w4.o0 r10 = (w4.o0) r10     // Catch:{ all -> 0x0080 }
            r10.a(r1)     // Catch:{ all -> 0x0080 }
            r10 = r4
            w4.o0 r10 = (w4.o0) r10     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r10 = r10.c()     // Catch:{ all -> 0x0080 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0075
            r0 = r10
        L_0x0075:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x00bd
            w4.o0 r4 = (w4.o0) r4
            w4.t0 r10 = r4.f5499d
            r9.K(r10, r0)
            goto L_0x00bd
        L_0x0080:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x0083:
            boolean r5 = r4 instanceof w4.g0
            if (r5 == 0) goto L_0x00eb
            if (r1 != 0) goto L_0x008d
            java.lang.Throwable r1 = r9.t(r10)
        L_0x008d:
            r5 = r4
            w4.g0 r5 = (w4.g0) r5
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x00c0
            w4.t0 r6 = r9.z(r5)
            if (r6 != 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            w4.o0 r7 = new w4.o0
            r7.<init>(r6, r1)
        L_0x00a2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f5523d
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00ac
            r4 = r3
            goto L_0x00b3
        L_0x00ac:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00a2
            r4 = r2
        L_0x00b3:
            if (r4 != 0) goto L_0x00b7
        L_0x00b5:
            r4 = r2
            goto L_0x00bb
        L_0x00b7:
            r9.K(r6, r1)
            r4 = r3
        L_0x00bb:
            if (r4 == 0) goto L_0x003f
        L_0x00bd:
            kotlinx.coroutines.internal.r r10 = h5.l.f3491j
            goto L_0x00ed
        L_0x00c0:
            w4.i r5 = new w4.i
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.Q(r4, r5)
            kotlinx.coroutines.internal.r r6 = h5.l.f3491j
            if (r5 == r6) goto L_0x00d3
            kotlinx.coroutines.internal.r r4 = h5.l.f3493l
            if (r5 == r4) goto L_0x003f
            r0 = r5
            goto L_0x00ee
        L_0x00d3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00eb:
            kotlinx.coroutines.internal.r r10 = h5.l.f3494m
        L_0x00ed:
            r0 = r10
        L_0x00ee:
            kotlinx.coroutines.internal.r r10 = h5.l.f3491j
            if (r0 != r10) goto L_0x00f3
            goto L_0x0100
        L_0x00f3:
            kotlinx.coroutines.internal.r r10 = h5.l.f3492k
            if (r0 != r10) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            kotlinx.coroutines.internal.r r10 = h5.l.f3494m
            if (r0 != r10) goto L_0x00fd
            goto L_0x0101
        L_0x00fd:
            r9.a(r0)
        L_0x0100:
            r2 = r3
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.j(java.lang.Object):boolean");
    }

    public void k(CancellationException cancellationException) {
        j(cancellationException);
    }

    public final f l(g gVar) {
        return o.s(this, gVar);
    }

    public final boolean m(Throwable th) {
        if (G()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        f fVar = (f) this._parentHandle;
        return (fVar == null || fVar == u0.f5527d) ? z5 : fVar.e(th) || z5;
    }

    public void n(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new j0(o(), (Throwable) null, this);
        }
        k(cancellationException);
    }

    public String o() {
        return "Job was cancelled";
    }

    public final i4.h p(i4.h hVar) {
        return o.N(this, hVar);
    }

    public final Object q(Object obj, o4.e eVar) {
        return eVar.h(obj, this);
    }

    public boolean r(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j(th) && x();
    }

    public final void s(g0 g0Var, Object obj) {
        f fVar = (f) this._parentHandle;
        if (fVar != null) {
            fVar.c();
            this._parentHandle = u0.f5527d;
        }
        q qVar = null;
        i iVar = obj instanceof i ? (i) obj : null;
        Throwable th = iVar != null ? iVar.f5487a : null;
        if (g0Var instanceof m0) {
            try {
                ((m0) g0Var).s(th);
            } catch (Throwable th2) {
                D(new q("Exception in completion handler " + g0Var + " for " + this, th2));
            }
        } else {
            t0 f6 = g0Var.f();
            if (f6 != null) {
                for (h hVar = (h) f6.k(); !o.c(hVar, f6); hVar = hVar.l()) {
                    if (hVar instanceof m0) {
                        m0 m0Var = (m0) hVar;
                        try {
                            m0Var.s(th);
                        } catch (Throwable th3) {
                            if (qVar != null) {
                                o.a(qVar, th3);
                            } else {
                                qVar = new q("Exception in completion handler " + m0Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (qVar != null) {
                    D(qVar);
                }
            }
        }
    }

    public final Throwable t(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q0 q0Var = (q0) ((v0) obj);
        Object B = q0Var.B();
        CancellationException cancellationException = null;
        if (B instanceof o0) {
            th = ((o0) B).c();
        } else if (B instanceof i) {
            th = ((i) B).f5487a;
        } else if (!(B instanceof g0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + B).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new j0("Parent job is ".concat(P(B)), th, q0Var);
        }
        return cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(I() + '{' + P(B()) + '}');
        sb.append('@');
        sb.append(p.p(this));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a A[LOOP:1: B:45:0x009a->B:48:0x00a5, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(w4.o0 r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof w4.i
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            w4.i r0 = (w4.i) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f5487a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x00ab }
            java.util.ArrayList r0 = r8.h(r1)     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r2 = r7.w(r8, r0)     // Catch:{ all -> 0x00ab }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00ab }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ab }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00ab }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0035
            b1.o.a(r2, r5)     // Catch:{ all -> 0x00ab }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            w4.i r9 = new w4.i
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0087
            boolean r1 = r7.m(r2)
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.C(r2)
            if (r1 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = r0
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            if (r1 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x007f
            r1 = r9
            w4.i r1 = (w4.i) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = w4.i.f5486b
            r2.compareAndSet(r1, r0, r3)
            goto L_0x0087
        L_0x007f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r8.<init>(r9)
            throw r8
        L_0x0087:
            r7.L(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f5523d
            boolean r1 = r9 instanceof w4.g0
            if (r1 == 0) goto L_0x0099
            b0.b r1 = new b0.b
            r2 = r9
            w4.g0 r2 = (w4.g0) r2
            r1.<init>(r2)
            goto L_0x009a
        L_0x0099:
            r1 = r9
        L_0x009a:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x009a
        L_0x00a7:
            r7.s(r8, r9)
            return r9
        L_0x00ab:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.u(w4.o0, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException v() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.B()
            boolean r1 = r0 instanceof w4.o0
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            w4.o0 r0 = (w4.o0) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0080
            w4.j0 r2 = new w4.j0
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.o()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0080
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof w4.g0
            if (r1 != 0) goto L_0x0081
            boolean r1 = r0 instanceof w4.i
            if (r1 == 0) goto L_0x006c
            w4.i r0 = (w4.i) r0
            java.lang.Throwable r0 = r0.f5487a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0080
            w4.j0 r1 = new w4.j0
            java.lang.String r2 = r4.o()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0080
        L_0x006c:
            w4.j0 r0 = new w4.j0
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.v():java.util.concurrent.CancellationException");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable w(w4.o0 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.d()
            if (r6 == 0) goto L_0x0017
            w4.j0 r6 = new w4.j0
            java.lang.String r7 = r5.o()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof w4.a1
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof w4.a1
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r6
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.w(w4.o0, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return false;
    }

    public final t0 z(g0 g0Var) {
        t0 f6 = g0Var.f();
        if (f6 != null) {
            return f6;
        }
        if (g0Var instanceof z) {
            return new t0();
        }
        if (g0Var instanceof m0) {
            N((m0) g0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + g0Var).toString());
    }
}
