package g4;

import b1.o;
import com.bumptech.glide.c;
import java.util.Collection;

public abstract class a implements Collection {
    public abstract int a();

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object c6 : this) {
            if (o.c(c6, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        o.m(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return a() == 0;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final Object[] toArray() {
        return c.N(this);
    }

    public final String toString() {
        return l.b0(this, ", ", "[", "]", new p.a(5, this), 24);
    }

    public final Object[] toArray(Object[] objArr) {
        o.m(objArr, "array");
        return c.O(this, objArr);
    }
}
