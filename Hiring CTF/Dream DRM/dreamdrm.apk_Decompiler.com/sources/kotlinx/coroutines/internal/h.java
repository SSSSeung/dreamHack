package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w4.p;

public class h {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3989d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3990e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3991f;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    static {
        Class<h> cls = h.class;
        Class<Object> cls2 = Object.class;
        f3989d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f3990e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f3991f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f3989d;
        r4 = ((kotlinx.coroutines.internal.o) r4).f4002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.h g() {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9._prev
            kotlinx.coroutines.internal.h r0 = (kotlinx.coroutines.internal.h) r0
            r1 = r0
        L_0x0005:
            r2 = 0
            r3 = r2
        L_0x0007:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L_0x0024
            if (r0 != r1) goto L_0x0010
            return r1
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f3990e
        L_0x0012:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r1
        L_0x0024:
            boolean r7 = r9.n()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r1
        L_0x002e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.n
            if (r7 == 0) goto L_0x0038
            kotlinx.coroutines.internal.n r4 = (kotlinx.coroutines.internal.n) r4
            r4.a(r1)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.o
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f3989d
            kotlinx.coroutines.internal.o r4 = (kotlinx.coroutines.internal.o) r4
            kotlinx.coroutines.internal.h r4 = r4.f4002a
        L_0x0044:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r1 = r3
            goto L_0x0005
        L_0x0057:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.internal.h r1 = (kotlinx.coroutines.internal.h) r1
            goto L_0x0007
        L_0x005c:
            r3 = r4
            kotlinx.coroutines.internal.h r3 = (kotlinx.coroutines.internal.h) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.h.g():kotlinx.coroutines.internal.h");
    }

    public final void j(h hVar) {
        boolean z5;
        do {
            h hVar2 = (h) hVar._prev;
            if (k() == hVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3990e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != hVar2) {
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
            } else {
                return;
            }
        } while (!z5);
        if (n()) {
            hVar.g();
        }
    }

    public final Object k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final h l() {
        h hVar;
        Object k6 = k();
        o oVar = k6 instanceof o ? (o) k6 : null;
        return (oVar == null || (hVar = oVar.f4002a) == null) ? (h) k6 : hVar;
    }

    public final h m() {
        h g6 = g();
        if (g6 == null) {
            Object obj = this._prev;
            while (true) {
                g6 = (h) obj;
                if (!g6.n()) {
                    break;
                }
                obj = g6._prev;
            }
        }
        return g6;
    }

    public boolean n() {
        return k() instanceof o;
    }

    public boolean o() {
        return p() == null;
    }

    public final h p() {
        h hVar;
        boolean z5;
        do {
            Object k6 = k();
            if (!(k6 instanceof o)) {
                if (k6 != this) {
                    hVar = (h) k6;
                    o oVar = (o) hVar._removedRef;
                    if (oVar == null) {
                        oVar = new o(hVar);
                        f3991f.lazySet(hVar, oVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3989d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, k6, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != k6) {
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
                } else {
                    return (h) k6;
                }
            } else {
                return ((o) k6).f4002a;
            }
        } while (!z5);
        hVar.g();
        return null;
    }

    public final int q(h hVar, h hVar2, f fVar) {
        boolean z5;
        f3990e.lazySet(hVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3989d;
        atomicReferenceFieldUpdater.lazySet(hVar, hVar2);
        fVar.f3988c = hVar2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, hVar2, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != hVar2) {
                    z5 = false;
                    break;
                }
            } else {
                z5 = true;
                break;
            }
        }
        if (!z5) {
            return 0;
        }
        return fVar.a(this) == null ? 1 : 2;
    }

    public String toString() {
        return new g(this) + '@' + p.p(this);
    }
}
