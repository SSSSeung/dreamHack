package u4;

import b1.o;
import com.bumptech.glide.c;
import f4.h;
import i4.d;
import i4.i;
import j4.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x0.y0;

public final class g implements Iterator, d {

    /* renamed from: d  reason: collision with root package name */
    public int f5349d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5350e;

    /* renamed from: f  reason: collision with root package name */
    public Iterator f5351f;

    /* renamed from: g  reason: collision with root package name */
    public d f5352g;

    public final RuntimeException a() {
        int i3 = this.f5349d;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f5349d);
    }

    public final void b(Object obj, d dVar) {
        this.f5350e = obj;
        this.f5349d = 3;
        this.f5352g = dVar;
        o.m(dVar, "frame");
    }

    public final Object c(y0 y0Var, d dVar) {
        a aVar;
        Iterator it = y0Var.iterator();
        boolean hasNext = it.hasNext();
        h hVar = h.f2682a;
        a aVar2 = a.f3845d;
        if (!hasNext) {
            aVar = hVar;
        } else {
            this.f5351f = it;
            this.f5349d = 2;
            this.f5352g = dVar;
            o.m(dVar, "frame");
            aVar = aVar2;
        }
        return aVar == aVar2 ? aVar : hVar;
    }

    public final i4.h f() {
        return i.f3606d;
    }

    public final void g(Object obj) {
        c.M(obj);
        this.f5349d = 4;
    }

    public final boolean hasNext() {
        while (true) {
            int i3 = this.f5349d;
            if (i3 != 0) {
                if (i3 == 1) {
                    Iterator it = this.f5351f;
                    o.k(it);
                    if (it.hasNext()) {
                        this.f5349d = 2;
                        return true;
                    }
                    this.f5351f = null;
                } else if (i3 == 2 || i3 == 3) {
                    return true;
                } else {
                    if (i3 == 4) {
                        return false;
                    }
                    throw a();
                }
            }
            this.f5349d = 5;
            d dVar = this.f5352g;
            o.k(dVar);
            this.f5352g = null;
            dVar.g(h.f2682a);
        }
    }

    public final Object next() {
        int i3 = this.f5349d;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i3 == 2) {
            this.f5349d = 1;
            Iterator it = this.f5351f;
            o.k(it);
            return it.next();
        } else if (i3 == 3) {
            this.f5349d = 0;
            Object obj = this.f5350e;
            this.f5350e = null;
            return obj;
        } else {
            throw a();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
