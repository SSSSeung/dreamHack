package j;

import java.util.Iterator;

public final class d extends f implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public c f3635d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3636e = true;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f3637f;

    public d(g gVar) {
        this.f3637f = gVar;
    }

    public final void a(c cVar) {
        c cVar2 = this.f3635d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f3634g;
            this.f3635d = cVar3;
            this.f3636e = cVar3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.f3636e) {
            return this.f3637f.f3640d != null;
        }
        c cVar = this.f3635d;
        return (cVar == null || cVar.f3633f == null) ? false : true;
    }

    public final Object next() {
        c cVar;
        if (this.f3636e) {
            this.f3636e = false;
            cVar = this.f3637f.f3640d;
        } else {
            c cVar2 = this.f3635d;
            cVar = cVar2 != null ? cVar2.f3633f : null;
        }
        this.f3635d = cVar;
        return cVar;
    }
}
