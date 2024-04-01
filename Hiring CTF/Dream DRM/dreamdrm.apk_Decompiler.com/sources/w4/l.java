package w4;

import b1.o;
import i4.a;
import i4.b;
import i4.e;
import i4.f;
import i4.g;
import i4.h;
import i4.i;

public abstract class l extends a implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final k f5491e = new k(0);

    public l() {
        super(androidx.compose.ui.platform.e.f892i);
    }

    public abstract void C(h hVar, Runnable runnable);

    public boolean D() {
        return !(this instanceof b1);
    }

    public final h e(g gVar) {
        o.m(gVar, "key");
        boolean z5 = gVar instanceof b;
        i iVar = i.f3606d;
        if (z5) {
            b bVar = (b) gVar;
            g gVar2 = this.f3601d;
            o.m(gVar2, "key");
            if ((gVar2 == bVar || bVar.f3603e == gVar2) && bVar.a(this) != null) {
                return iVar;
            }
        } else if (androidx.compose.ui.platform.e.f892i == gVar) {
            return iVar;
        }
        return this;
    }

    public final f l(g gVar) {
        o.m(gVar, "key");
        if (gVar instanceof b) {
            b bVar = (b) gVar;
            g gVar2 = this.f3601d;
            o.m(gVar2, "key");
            if (gVar2 == bVar || bVar.f3603e == gVar2) {
                f a6 = bVar.a(this);
                if (a6 instanceof f) {
                    return a6;
                }
            }
        } else if (androidx.compose.ui.platform.e.f892i == gVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + p.p(this);
    }
}
