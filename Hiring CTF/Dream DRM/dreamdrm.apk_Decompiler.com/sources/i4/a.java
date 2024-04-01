package i4;

import b1.o;
import b1.v;
import o4.e;

public abstract class a implements f {

    /* renamed from: d  reason: collision with root package name */
    public final g f3601d;

    public a(g gVar) {
        this.f3601d = gVar;
    }

    public h e(g gVar) {
        return o.J(this, gVar);
    }

    public final g getKey() {
        return this.f3601d;
    }

    public f l(g gVar) {
        return o.s(this, gVar);
    }

    public final h p(h hVar) {
        o.m(hVar, "context");
        return v.K(this, hVar);
    }

    public final Object q(Object obj, e eVar) {
        return eVar.h(obj, this);
    }
}
