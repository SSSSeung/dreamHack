package k;

import h.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g implements Set {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3882d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f3883e;

    public /* synthetic */ g(d dVar, int i3) {
        this.f3882d = i3;
        this.f3883e = dVar;
    }

    public final boolean add(Object obj) {
        switch (this.f3882d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f3882d) {
            case 0:
                d dVar = this.f3883e;
                int f6 = dVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    dVar.i(entry.getKey(), entry.getValue());
                }
                return f6 != dVar.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        int i3 = this.f3882d;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                dVar.c();
                return;
            default:
                dVar.c();
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i3 = this.f3882d;
        boolean z5 = true;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g6 = dVar.g(entry.getKey());
                if (g6 < 0) {
                    return false;
                }
                Object d6 = dVar.d(g6, 1);
                Object value = entry.getValue();
                if (d6 != value && (d6 == null || !d6.equals(value))) {
                    z5 = false;
                }
                return z5;
            default:
                return dVar.g(obj) >= 0;
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.f3882d) {
            case 0:
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                b e6 = this.f3883e.e();
                for (Object containsKey : collection) {
                    if (!e6.containsKey(containsKey)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f3882d) {
            case 0:
                return d.l(this, obj);
            default:
                return d.l(this, obj);
        }
    }

    public final int hashCode() {
        int i3 = this.f3882d;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                int i6 = 0;
                for (int f6 = dVar.f() - 1; f6 >= 0; f6--) {
                    Object d6 = dVar.d(f6, 0);
                    Object d7 = dVar.d(f6, 1);
                    i6 += (d6 == null ? 0 : d6.hashCode()) ^ (d7 == null ? 0 : d7.hashCode());
                }
                return i6;
            default:
                int i7 = 0;
                for (int f7 = dVar.f() - 1; f7 >= 0; f7--) {
                    Object d8 = dVar.d(f7, 0);
                    i7 += d8 == null ? 0 : d8.hashCode();
                }
                return i7;
        }
    }

    public final boolean isEmpty() {
        int i3 = this.f3882d;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                return dVar.f() == 0;
            default:
                return dVar.f() == 0;
        }
    }

    public final Iterator iterator() {
        int i3 = this.f3882d;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                return new h(dVar);
            default:
                return new f(dVar, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f3882d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                d dVar = this.f3883e;
                int g6 = dVar.g(obj);
                if (g6 < 0) {
                    return false;
                }
                dVar.j(g6);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f3882d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                b e6 = this.f3883e.e();
                int i3 = e6.f3895f;
                for (Object remove : collection) {
                    e6.remove(remove);
                }
                return i3 != e6.f3895f;
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f3882d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return d.n(this.f3883e.e(), collection);
        }
    }

    public final int size() {
        int i3 = this.f3882d;
        d dVar = this.f3883e;
        switch (i3) {
            case 0:
                return dVar.f();
            default:
                return dVar.f();
        }
    }

    public final Object[] toArray() {
        switch (this.f3882d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                d dVar = this.f3883e;
                int f6 = dVar.f();
                Object[] objArr = new Object[f6];
                for (int i3 = 0; i3 < f6; i3++) {
                    objArr[i3] = dVar.d(i3, 0);
                }
                return objArr;
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f3882d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3883e.o(0, objArr);
        }
    }
}
