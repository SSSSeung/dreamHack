package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import g.b;
import g.c;
import g.l;
import h.m;
import h.o;
import java.lang.ref.WeakReference;

public final class r0 extends c implements m {

    /* renamed from: f  reason: collision with root package name */
    public final Context f2423f;

    /* renamed from: g  reason: collision with root package name */
    public final o f2424g;

    /* renamed from: h  reason: collision with root package name */
    public b f2425h;

    /* renamed from: i  reason: collision with root package name */
    public WeakReference f2426i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s0 f2427j;

    public r0(s0 s0Var, Context context, u uVar) {
        this.f2427j = s0Var;
        this.f2423f = context;
        this.f2425h = uVar;
        o oVar = new o(context);
        oVar.f3181l = 1;
        this.f2424g = oVar;
        oVar.f3174e = this;
    }

    public final void a() {
        s0 s0Var = this.f2427j;
        if (s0Var.f2438o == this) {
            if (!(!s0Var.f2445v)) {
                s0Var.f2439p = this;
                s0Var.f2440q = this.f2425h;
            } else {
                this.f2425h.b(this);
            }
            this.f2425h = null;
            s0Var.o(false);
            ActionBarContextView actionBarContextView = s0Var.f2435l;
            if (actionBarContextView.f401n == null) {
                actionBarContextView.e();
            }
            s0Var.f2432i.setHideOnContentScrollEnabled(s0Var.A);
            s0Var.f2438o = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.f2426i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void c(o oVar) {
        if (this.f2425h != null) {
            i();
            androidx.appcompat.widget.m mVar = this.f2427j.f2435l.f394g;
            if (mVar != null) {
                mVar.l();
            }
        }
    }

    public final boolean d(o oVar, MenuItem menuItem) {
        b bVar = this.f2425h;
        if (bVar != null) {
            return bVar.e(this, menuItem);
        }
        return false;
    }

    public final o e() {
        return this.f2424g;
    }

    public final MenuInflater f() {
        return new l(this.f2423f);
    }

    public final CharSequence g() {
        return this.f2427j.f2435l.getSubtitle();
    }

    public final CharSequence h() {
        return this.f2427j.f2435l.getTitle();
    }

    public final void i() {
        if (this.f2427j.f2438o == this) {
            o oVar = this.f2424g;
            oVar.w();
            try {
                this.f2425h.a(this, oVar);
            } finally {
                oVar.v();
            }
        }
    }

    public final boolean j() {
        return this.f2427j.f2435l.f409v;
    }

    public final void k(View view) {
        this.f2427j.f2435l.setCustomView(view);
        this.f2426i = new WeakReference(view);
    }

    public final void l(int i3) {
        m(this.f2427j.f2430g.getResources().getString(i3));
    }

    public final void m(CharSequence charSequence) {
        this.f2427j.f2435l.setSubtitle(charSequence);
    }

    public final void n(int i3) {
        o(this.f2427j.f2430g.getResources().getString(i3));
    }

    public final void o(CharSequence charSequence) {
        this.f2427j.f2435l.setTitle(charSequence);
    }

    public final void p(boolean z5) {
        this.f2711e = z5;
        this.f2427j.f2435l.setTitleOptional(z5);
    }
}
