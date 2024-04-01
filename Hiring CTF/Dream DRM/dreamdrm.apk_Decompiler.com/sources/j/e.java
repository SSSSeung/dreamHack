package j;

import java.util.Iterator;

public abstract class e extends f implements Iterator {

    /* renamed from: d  reason: collision with root package name */
    public c f3638d;

    /* renamed from: e  reason: collision with root package name */
    public c f3639e;

    public e(c cVar, c cVar2) {
        this.f3638d = cVar2;
        this.f3639e = cVar;
    }

    public final void a(c cVar) {
        c cVar2;
        if (this.f3638d == cVar && cVar == this.f3639e) {
            this.f3639e = null;
            this.f3638d = null;
        }
        c cVar3 = this.f3638d;
        if (cVar3 == cVar) {
            switch (((b) this).f3630f) {
                case 0:
                    cVar2 = cVar3.f3634g;
                    break;
                default:
                    cVar2 = cVar3.f3633f;
                    break;
            }
            this.f3638d = cVar2;
        }
        if (this.f3639e == cVar) {
            this.f3639e = b();
        }
    }

    public final c b() {
        c cVar = this.f3639e;
        c cVar2 = this.f3638d;
        if (cVar == cVar2 || cVar2 == null) {
            return null;
        }
        switch (((b) this).f3630f) {
            case 0:
                return cVar.f3633f;
            default:
                return cVar.f3634g;
        }
    }

    public final boolean hasNext() {
        return this.f3639e != null;
    }

    public final Object next() {
        c cVar = this.f3639e;
        this.f3639e = b();
        return cVar;
    }
}
