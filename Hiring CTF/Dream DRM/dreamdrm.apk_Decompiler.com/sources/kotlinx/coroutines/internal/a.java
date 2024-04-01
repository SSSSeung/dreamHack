package kotlinx.coroutines.internal;

import h5.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3977a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = d.f3466b;

    public final Object a(Object obj) {
        boolean z5;
        Object obj2 = this._consensus;
        r rVar = d.f3466b;
        if (obj2 == rVar) {
            r c6 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3977a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            z5 = false;
                            break;
                        }
                    } else {
                        z5 = true;
                        break;
                    }
                }
                obj2 = z5 ? c6 : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract r c(Object obj);
}
