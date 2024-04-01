package i4;

import b1.o;
import o4.c;
import p.f;

public abstract class b implements g {

    /* renamed from: d  reason: collision with root package name */
    public final c f3602d;

    /* renamed from: e  reason: collision with root package name */
    public final g f3603e;

    public b(g gVar, f fVar) {
        o.m(gVar, "baseKey");
        this.f3602d = fVar;
        this.f3603e = gVar instanceof b ? ((b) gVar).f3603e : gVar;
    }

    public final f a(f fVar) {
        o.m(fVar, "element");
        return (f) this.f3602d.i(fVar);
    }
}
