package u4;

import b1.o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o4.a;
import o4.c;

public final class d implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public Object f5343d;

    /* renamed from: e  reason: collision with root package name */
    public int f5344e = -2;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f5345f;

    public d(e eVar) {
        this.f5345f = eVar;
    }

    public final void a() {
        Object obj;
        int i3 = this.f5344e;
        e eVar = this.f5345f;
        if (i3 == -2) {
            obj = ((a) eVar.f5348c).a();
        } else {
            c cVar = eVar.f5347b;
            Object obj2 = this.f5343d;
            o.k(obj2);
            obj = cVar.i(obj2);
        }
        this.f5343d = obj;
        this.f5344e = obj == null ? 0 : 1;
    }

    public final boolean hasNext() {
        if (this.f5344e < 0) {
            a();
        }
        return this.f5344e == 1;
    }

    public final Object next() {
        if (this.f5344e < 0) {
            a();
        }
        if (this.f5344e != 0) {
            Object obj = this.f5343d;
            o.j(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f5344e = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
