package u4;

import java.util.Iterator;

public final class j implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public final Iterator f5354d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f5355e;

    public j(e eVar) {
        this.f5355e = eVar;
        this.f5354d = ((f) eVar.f5348c).iterator();
    }

    public final boolean hasNext() {
        return this.f5354d.hasNext();
    }

    public final Object next() {
        return this.f5355e.f5347b.i(this.f5354d.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
