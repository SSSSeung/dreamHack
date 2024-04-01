package h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import e.d;
import e.h;
import e.i;

public final class k implements c0, AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public Context f3157d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f3158e;

    /* renamed from: f  reason: collision with root package name */
    public o f3159f;

    /* renamed from: g  reason: collision with root package name */
    public ExpandedMenuView f3160g;

    /* renamed from: h  reason: collision with root package name */
    public b0 f3161h;

    /* renamed from: i  reason: collision with root package name */
    public j f3162i;

    public k(Context context) {
        this.f3157d = context;
        this.f3158e = LayoutInflater.from(context);
    }

    public final void b(o oVar, boolean z5) {
        b0 b0Var = this.f3161h;
        if (b0Var != null) {
            b0Var.b(oVar, z5);
        }
    }

    public final void c(b0 b0Var) {
        this.f3161h = b0Var;
    }

    public final void d(Context context, o oVar) {
        if (this.f3157d != null) {
            this.f3157d = context;
            if (this.f3158e == null) {
                this.f3158e = LayoutInflater.from(context);
            }
        }
        this.f3159f = oVar;
        j jVar = this.f3162i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(q qVar) {
        return false;
    }

    public final void h() {
        j jVar = this.f3162i;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    public final boolean i(q qVar) {
        return false;
    }

    public final boolean k(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p(i0Var);
        Context context = i0Var.f3170a;
        h hVar = new h(context);
        Object obj = hVar.f2376e;
        d dVar = (d) obj;
        k kVar = new k(dVar.f2286a);
        pVar.f3195f = kVar;
        kVar.f3161h = pVar;
        i0Var.b(kVar, context);
        k kVar2 = pVar.f3195f;
        if (kVar2.f3162i == null) {
            kVar2.f3162i = new j(kVar2);
        }
        dVar.f2296k = kVar2.f3162i;
        dVar.f2297l = pVar;
        View view = i0Var.f3184o;
        if (view != null) {
            dVar.f2290e = view;
        } else {
            dVar.f2288c = i0Var.f3183n;
            ((d) obj).f2289d = i0Var.f3182m;
        }
        dVar.f2295j = pVar;
        i a6 = hVar.a();
        pVar.f3194e = a6;
        a6.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f3194e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f3194e.show();
        b0 b0Var = this.f3161h;
        if (b0Var == null) {
            return true;
        }
        b0Var.i(i0Var);
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        this.f3159f.q(this.f3162i.getItem(i3), this, 0);
    }
}
