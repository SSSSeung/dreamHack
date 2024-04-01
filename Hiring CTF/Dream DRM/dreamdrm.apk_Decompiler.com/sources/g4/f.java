package g4;

import b1.o;
import com.bumptech.glide.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import x0.a1;

public final class f implements Collection {

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f2899d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2900e;

    public f(Object[] objArr, boolean z5) {
        o.m(objArr, "values");
        this.f2899d = objArr;
        this.f2900e = z5;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i3;
        Object[] objArr = this.f2899d;
        o.m(objArr, "<this>");
        if (obj != null) {
            int length = objArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                } else if (o.c(obj, objArr[i6])) {
                    i3 = i6;
                    break;
                } else {
                    i6++;
                }
            }
        } else {
            int length2 = objArr.length;
            i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                } else if (objArr[i3] == null) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        i3 = -1;
        return i3 >= 0;
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
        return this.f2899d.length == 0;
    }

    public final Iterator iterator() {
        Object[] objArr = this.f2899d;
        o.m(objArr, "array");
        return new a1(objArr);
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

    public final int size() {
        return this.f2899d.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f2899d;
        o.m(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (this.f2900e && o.c(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        o.l(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        o.m(objArr, "array");
        return c.O(this, objArr);
    }
}
