package h;

import a2.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class i0 extends o implements SubMenu {
    public final q A;

    /* renamed from: z  reason: collision with root package name */
    public final o f3154z;

    public i0(Context context, o oVar, q qVar) {
        super(context);
        this.f3154z = oVar;
        this.A = qVar;
    }

    public final boolean d(q qVar) {
        return this.f3154z.d(qVar);
    }

    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f3154z.e(oVar, menuItem);
    }

    public final boolean f(q qVar) {
        return this.f3154z.f(qVar);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String j() {
        q qVar = this.A;
        int i3 = qVar != null ? qVar.f3196a : 0;
        if (i3 == 0) {
            return null;
        }
        return m.g("android:menu:actionviewstates:", i3);
    }

    public final o k() {
        return this.f3154z.k();
    }

    public final boolean m() {
        return this.f3154z.m();
    }

    public final boolean n() {
        return this.f3154z.n();
    }

    public final boolean o() {
        return this.f3154z.o();
    }

    public final void setGroupDividerEnabled(boolean z5) {
        this.f3154z.setGroupDividerEnabled(z5);
    }

    public final SubMenu setHeaderIcon(int i3) {
        u(0, (CharSequence) null, i3, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i3) {
        u(i3, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(int i3) {
        this.A.setIcon(i3);
        return this;
    }

    public final void setQwertyMode(boolean z5) {
        this.f3154z.setQwertyMode(z5);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }
}
