package a2;

import b.a;
import n2.f;
import y1.c;
import y1.i;
import y1.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Object f90a;

    /* renamed from: b  reason: collision with root package name */
    public Object f91b;

    /* renamed from: c  reason: collision with root package name */
    public Object f92c;

    public k() {
    }

    public k(r rVar, f fVar, v vVar) {
        this.f92c = rVar;
        this.f91b = fVar;
        this.f90a = vVar;
    }

    public final void a(a aVar, i iVar) {
        try {
            aVar.a().f((y1.f) this.f90a, new k((c) (l) this.f91b, (Object) (e0) this.f92c, iVar));
        } finally {
            ((e0) this.f92c).e();
        }
    }

    public k(c cVar, Object obj, i iVar) {
        this.f90a = cVar;
        this.f91b = obj;
        this.f92c = iVar;
    }
}
