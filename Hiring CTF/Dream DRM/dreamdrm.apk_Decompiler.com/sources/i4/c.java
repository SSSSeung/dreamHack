package i4;

import androidx.compose.ui.platform.k;
import b1.o;
import b1.v;
import java.io.Serializable;
import o4.e;

public final class c implements h, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final h f3604d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3605e;

    public c(f fVar, h hVar) {
        o.m(hVar, "left");
        o.m(fVar, "element");
        this.f3604d = hVar;
        this.f3605e = fVar;
    }

    public final h e(g gVar) {
        o.m(gVar, "key");
        f fVar = this.f3605e;
        f l6 = fVar.l(gVar);
        h hVar = this.f3604d;
        if (l6 != null) {
            return hVar;
        }
        h e6 = hVar.e(gVar);
        return e6 == hVar ? this : e6 == i.f3606d ? fVar : new c(fVar, e6);
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i3 = 2;
            c cVar2 = cVar;
            int i6 = 2;
            while (true) {
                h hVar = cVar2.f3604d;
                cVar2 = hVar instanceof c ? (c) hVar : null;
                if (cVar2 == null) {
                    break;
                }
                i6++;
            }
            c cVar3 = this;
            while (true) {
                h hVar2 = cVar3.f3604d;
                cVar3 = hVar2 instanceof c ? (c) hVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i6 != i3) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                f fVar = cVar4.f3605e;
                if (o.c(cVar.l(fVar.getKey()), fVar)) {
                    h hVar3 = cVar4.f3604d;
                    if (!(hVar3 instanceof c)) {
                        o.j(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        z5 = o.c(cVar.l(fVar2.getKey()), fVar2);
                        break;
                    }
                    cVar4 = (c) hVar3;
                } else {
                    z5 = false;
                    break;
                }
            }
            return z5;
        }
    }

    public final int hashCode() {
        return this.f3605e.hashCode() + this.f3604d.hashCode();
    }

    public final f l(g gVar) {
        o.m(gVar, "key");
        c cVar = this;
        while (true) {
            f l6 = cVar.f3605e.l(gVar);
            if (l6 != null) {
                return l6;
            }
            h hVar = cVar.f3604d;
            if (!(hVar instanceof c)) {
                return hVar.l(gVar);
            }
            cVar = (c) hVar;
        }
    }

    public final h p(h hVar) {
        return v.K(this, hVar);
    }

    public final Object q(Object obj, e eVar) {
        return eVar.h(this.f3604d.q(obj, eVar), this.f3605e);
    }

    public final String toString() {
        return "[" + ((String) q("", k.f900f)) + ']';
    }
}
