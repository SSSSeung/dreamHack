package e;

import android.view.MenuItem;
import android.view.ViewGroup;
import g.b;
import g.c;
import g.h;
import h.o;
import java.util.WeakHashMap;
import x0.g1;
import x0.h0;
import x0.u0;

public final class u implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b f2451a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f2452b;

    public u(e0 e0Var, h hVar) {
        this.f2452b = e0Var;
        this.f2451a = hVar;
    }

    public final boolean a(c cVar, o oVar) {
        ViewGroup viewGroup = this.f2452b.E;
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(viewGroup);
        return this.f2451a.a(cVar, oVar);
    }

    public final void b(c cVar) {
        this.f2451a.b(cVar);
        e0 e0Var = this.f2452b;
        if (e0Var.f2344z != null) {
            e0Var.f2334o.getDecorView().removeCallbacks(e0Var.A);
        }
        if (e0Var.f2343y != null) {
            g1 g1Var = e0Var.B;
            if (g1Var != null) {
                g1Var.b();
            }
            g1 a6 = u0.a(e0Var.f2343y);
            a6.a(0.0f);
            e0Var.B = a6;
            a6.d(new t(2, this));
        }
        m mVar = e0Var.f2336q;
        if (mVar != null) {
            mVar.g();
        }
        e0Var.f2342x = null;
        ViewGroup viewGroup = e0Var.E;
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(viewGroup);
        e0Var.J();
    }

    public final boolean c(c cVar, o oVar) {
        return this.f2451a.c(cVar, oVar);
    }

    public final boolean e(c cVar, MenuItem menuItem) {
        return this.f2451a.e(cVar, menuItem);
    }
}
