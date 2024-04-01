package k;

import h.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public final int f3877d;

    /* renamed from: e  reason: collision with root package name */
    public int f3878e;

    /* renamed from: f  reason: collision with root package name */
    public int f3879f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3880g = false;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f3881h;

    public f(d dVar, int i3) {
        this.f3881h = dVar;
        this.f3877d = i3;
        this.f3878e = dVar.f();
    }

    public final boolean hasNext() {
        return this.f3879f < this.f3878e;
    }

    public final Object next() {
        if (hasNext()) {
            Object d6 = this.f3881h.d(this.f3879f, this.f3877d);
            this.f3879f++;
            this.f3880g = true;
            return d6;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3880g) {
            int i3 = this.f3879f - 1;
            this.f3879f = i3;
            this.f3878e--;
            this.f3880g = false;
            this.f3881h.j(i3);
            return;
        }
        throw new IllegalStateException();
    }
}
