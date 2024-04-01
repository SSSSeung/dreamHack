package g4;

import b1.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x0.a1;

public abstract class d extends a implements List {
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        o.m(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object c6 : this) {
                if (!o.c(c6, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = (i3 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        int i3 = 0;
        for (Object c6 : this) {
            if (o.c(c6, obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final Iterator iterator() {
        return new a1(1, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new b(this, 0);
    }

    public final Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i3, int i6) {
        return new c(this, i3, i6);
    }

    public final ListIterator listIterator(int i3) {
        return new b(this, i3);
    }
}
