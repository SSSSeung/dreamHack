package e0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends com.bumptech.glide.d {

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2467f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2468g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2469h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2470i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2471j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(0);
        this.f2467f = atomicReferenceFieldUpdater;
        this.f2468g = atomicReferenceFieldUpdater2;
        this.f2469h = atomicReferenceFieldUpdater3;
        this.f2470i = atomicReferenceFieldUpdater4;
        this.f2471j = atomicReferenceFieldUpdater5;
    }

    public final void A(f fVar, Thread thread) {
        this.f2467f.lazySet(fVar, thread);
    }

    public final boolean b(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f2465b;
        do {
            atomicReferenceFieldUpdater = this.f2470i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2471j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2469h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    public final void z(f fVar, f fVar2) {
        this.f2468g.lazySet(fVar, fVar2);
    }
}
