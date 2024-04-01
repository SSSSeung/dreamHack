package g4;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import x0.a1;

public final class b extends a1 implements ListIterator {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f2895g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i3) {
        super(1, dVar);
        this.f2895g = dVar;
        int a6 = dVar.a();
        if (i3 < 0 || i3 > a6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a6);
        }
        this.f5538e = i3;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        return this.f5538e > 0;
    }

    public final int nextIndex() {
        return this.f5538e;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f5538e - 1;
            this.f5538e = i3;
            return this.f2895g.get(i3);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f5538e - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
