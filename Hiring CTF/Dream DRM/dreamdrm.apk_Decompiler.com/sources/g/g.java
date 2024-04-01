package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h.m;
import h.o;
import java.lang.ref.WeakReference;

public final class g extends c implements m {

    /* renamed from: f  reason: collision with root package name */
    public final Context f2718f;

    /* renamed from: g  reason: collision with root package name */
    public final ActionBarContextView f2719g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2720h;

    /* renamed from: i  reason: collision with root package name */
    public WeakReference f2721i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2722j;

    /* renamed from: k  reason: collision with root package name */
    public final o f2723k;

    public g(Context context, ActionBarContextView actionBarContextView, b bVar) {
        this.f2718f = context;
        this.f2719g = actionBarContextView;
        this.f2720h = bVar;
        o oVar = new o(actionBarContextView.getContext());
        oVar.f3181l = 1;
        this.f2723k = oVar;
        oVar.f3174e = this;
    }

    public final void a() {
        if (!this.f2722j) {
            this.f2722j = true;
            this.f2720h.b(this);
        }
    }

    public final View b() {
        WeakReference weakReference = this.f2721i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void c(o oVar) {
        i();
        androidx.appcompat.widget.m mVar = this.f2719g.f394g;
        if (mVar != null) {
            mVar.l();
        }
    }

    public final boolean d(o oVar, MenuItem menuItem) {
        return this.f2720h.e(this, menuItem);
    }

    public final o e() {
        return this.f2723k;
    }

    public final MenuInflater f() {
        return new l(this.f2719g.getContext());
    }

    public final CharSequence g() {
        return this.f2719g.getSubtitle();
    }

    public final CharSequence h() {
        return this.f2719g.getTitle();
    }

    public final void i() {
        this.f2720h.a(this, this.f2723k);
    }

    public final boolean j() {
        return this.f2719g.f409v;
    }

    public final void k(View view) {
        this.f2719g.setCustomView(view);
        this.f2721i = view != null ? new WeakReference(view) : null;
    }

    public final void l(int i3) {
        m(this.f2718f.getString(i3));
    }

    public final void m(CharSequence charSequence) {
        this.f2719g.setSubtitle(charSequence);
    }

    public final void n(int i3) {
        o(this.f2718f.getString(i3));
    }

    public final void o(CharSequence charSequence) {
        this.f2719g.setTitle(charSequence);
    }

    public final void p(boolean z5) {
        this.f2711e = z5;
        this.f2719g.setTitleOptional(z5);
    }
}
