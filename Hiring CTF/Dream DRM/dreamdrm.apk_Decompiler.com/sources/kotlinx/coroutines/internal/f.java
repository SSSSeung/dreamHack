package kotlinx.coroutines.internal;

import b1.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public final h f3987b;

    /* renamed from: c  reason: collision with root package name */
    public h f3988c;

    public f(h hVar) {
        this.f3987b = hVar;
    }

    public final void b(Object obj, Object obj2) {
        h hVar = (h) obj;
        boolean z5 = true;
        boolean z6 = obj2 == null;
        h hVar2 = this.f3987b;
        h hVar3 = z6 ? hVar2 : this.f3988c;
        if (hVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f3989d;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(hVar, this, hVar3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != this) {
                        z5 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z5 && z6) {
                h hVar4 = this.f3988c;
                o.k(hVar4);
                hVar2.j(hVar4);
            }
        }
    }
}
