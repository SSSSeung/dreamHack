package h;

import android.view.MenuItem;

public final class u implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f3226b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3226b = wVar;
        this.f3225a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3225a.onMenuItemActionCollapse(this.f3226b.m(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3225a.onMenuItemActionExpand(this.f3226b.m(menuItem));
    }
}
