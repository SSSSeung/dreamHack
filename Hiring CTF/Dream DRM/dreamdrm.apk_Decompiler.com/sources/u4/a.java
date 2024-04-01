package u4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import x0.y0;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f5340a;

    public a(y0 y0Var) {
        this.f5340a = new AtomicReference(y0Var);
    }

    public final Iterator iterator() {
        f fVar = (f) this.f5340a.getAndSet((Object) null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
