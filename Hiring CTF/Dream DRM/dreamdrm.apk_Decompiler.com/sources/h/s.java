package h;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import e.n0;

public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: c  reason: collision with root package name */
    public n0 f3223c;

    public s(w wVar, ActionProvider actionProvider) {
        super(wVar, actionProvider);
    }

    public final boolean a() {
        return this.f3221a.isVisible();
    }

    public final View b(MenuItem menuItem) {
        return this.f3221a.onCreateActionView(menuItem);
    }

    public final boolean c() {
        return this.f3221a.overridesItemVisibility();
    }

    public final void d(n0 n0Var) {
        this.f3223c = n0Var;
        this.f3221a.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z5) {
        n0 n0Var = this.f3223c;
        if (n0Var != null) {
            o oVar = ((q) n0Var.f2403e).f3209n;
            oVar.f3177h = true;
            oVar.p(true);
        }
    }
}
