package k;

import h.d;
import java.util.Collection;
import java.util.Iterator;

public final class i implements Collection {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3888d;

    public i(d dVar) {
        this.f3888d = dVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f3888d.c();
    }

    public final boolean contains(Object obj) {
        return this.f3888d.h(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f3888d.f() == 0;
    }

    public final Iterator iterator() {
        return new f(this.f3888d, 1);
    }

    public final boolean remove(Object obj) {
        d dVar = this.f3888d;
        int h6 = dVar.h(obj);
        if (h6 < 0) {
            return false;
        }
        dVar.j(h6);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        d dVar = this.f3888d;
        int f6 = dVar.f();
        int i3 = 0;
        boolean z5 = false;
        while (i3 < f6) {
            if (collection.contains(dVar.d(i3, 1))) {
                dVar.j(i3);
                i3--;
                f6--;
                z5 = true;
            }
            i3++;
        }
        return z5;
    }

    public final boolean retainAll(Collection collection) {
        d dVar = this.f3888d;
        int f6 = dVar.f();
        int i3 = 0;
        boolean z5 = false;
        while (i3 < f6) {
            if (!collection.contains(dVar.d(i3, 1))) {
                dVar.j(i3);
                i3--;
                f6--;
                z5 = true;
            }
            i3++;
        }
        return z5;
    }

    public final int size() {
        return this.f3888d.f();
    }

    public final Object[] toArray() {
        d dVar = this.f3888d;
        int f6 = dVar.f();
        Object[] objArr = new Object[f6];
        for (int i3 = 0; i3 < f6; i3++) {
            objArr[i3] = dVar.d(i3, 1);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f3888d.o(1, objArr);
    }
}
