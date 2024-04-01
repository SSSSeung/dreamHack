package h;

import android.view.MenuItem;

public final class v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f3228b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3228b = wVar;
        this.f3227a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3227a.onMenuItemClick(this.f3228b.m(menuItem));
    }
}
