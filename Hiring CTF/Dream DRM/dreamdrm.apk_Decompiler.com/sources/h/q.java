package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import e.n0;
import java.util.ArrayList;
import s0.b;
import w4.p;

public final class q implements b {
    public r A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f3196a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3197b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3198c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3199d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3200e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3201f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3202g;

    /* renamed from: h  reason: collision with root package name */
    public char f3203h;

    /* renamed from: i  reason: collision with root package name */
    public int f3204i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f3205j;

    /* renamed from: k  reason: collision with root package name */
    public int f3206k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3207l;

    /* renamed from: m  reason: collision with root package name */
    public int f3208m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final o f3209n;

    /* renamed from: o  reason: collision with root package name */
    public i0 f3210o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3211p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3212q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3213r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3214s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3215t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3216u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3217v = false;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f3218x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f3219y;

    /* renamed from: z  reason: collision with root package name */
    public View f3220z;

    public q(o oVar, int i3, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        this.f3209n = oVar;
        this.f3196a = i6;
        this.f3197b = i3;
        this.f3198c = i7;
        this.f3199d = i8;
        this.f3200e = charSequence;
        this.f3219y = i9;
    }

    public static void c(StringBuilder sb, int i3, int i6, String str) {
        if ((i3 & i6) == i6) {
            sb.append(str);
        }
    }

    public final r a() {
        return this.A;
    }

    public final b b(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f3220z = null;
        this.A = rVar;
        this.f3209n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.d(new n0(3, (Object) this));
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f3219y & 8) == 0) {
            return false;
        }
        if (this.f3220z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3209n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.f3216u || this.f3217v)) {
            drawable = drawable.mutate();
            if (this.f3216u) {
                r0.b.h(drawable, this.f3214s);
            }
            if (this.f3217v) {
                r0.b.i(drawable, this.f3215t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f3219y & 8) == 0) {
            return false;
        }
        if (this.f3220z == null && (rVar = this.A) != null) {
            this.f3220z = rVar.b(this);
        }
        return this.f3220z != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3209n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f3218x & 32) == 32;
    }

    public final void g(boolean z5) {
        this.f3218x = z5 ? this.f3218x | 32 : this.f3218x & -33;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f3220z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar == null) {
            return null;
        }
        View b6 = rVar.b(this);
        this.f3220z = b6;
        return b6;
    }

    public final int getAlphabeticModifiers() {
        return this.f3206k;
    }

    public final char getAlphabeticShortcut() {
        return this.f3205j;
    }

    public final CharSequence getContentDescription() {
        return this.f3212q;
    }

    public final int getGroupId() {
        return this.f3197b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f3207l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f3208m;
        if (i3 == 0) {
            return null;
        }
        Drawable n5 = p.n(this.f3209n.f3170a, i3);
        this.f3208m = 0;
        this.f3207l = n5;
        return d(n5);
    }

    public final ColorStateList getIconTintList() {
        return this.f3214s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3215t;
    }

    public final Intent getIntent() {
        return this.f3202g;
    }

    public final int getItemId() {
        return this.f3196a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f3204i;
    }

    public final char getNumericShortcut() {
        return this.f3203h;
    }

    public final int getOrder() {
        return this.f3198c;
    }

    public final SubMenu getSubMenu() {
        return this.f3210o;
    }

    public final CharSequence getTitle() {
        return this.f3200e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3201f;
        return charSequence != null ? charSequence : this.f3200e;
    }

    public final CharSequence getTooltipText() {
        return this.f3213r;
    }

    public final boolean hasSubMenu() {
        return this.f3210o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f3218x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f3218x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f3218x & 16) != 0;
    }

    public final boolean isVisible() {
        r rVar = this.A;
        return (rVar == null || !rVar.c()) ? (this.f3218x & 8) == 0 : (this.f3218x & 8) == 0 && this.A.a();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i3) {
        int i6;
        o oVar = this.f3209n;
        Context context = oVar.f3170a;
        View inflate = LayoutInflater.from(context).inflate(i3, new LinearLayout(context), false);
        this.f3220z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i6 = this.f3196a) > 0) {
            inflate.setId(i6);
        }
        oVar.f3180k = true;
        oVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f3205j == c6) {
            return this;
        }
        this.f3205j = Character.toLowerCase(c6);
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z5) {
        int i3 = this.f3218x;
        boolean z6 = z5 | (i3 & true);
        this.f3218x = z6 ? 1 : 0;
        if (i3 != z6) {
            this.f3209n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z5) {
        int i3 = this.f3218x;
        int i6 = i3 & 4;
        o oVar = this.f3209n;
        int i7 = 2;
        if (i6 != 0) {
            oVar.getClass();
            ArrayList arrayList = oVar.f3175f;
            int size = arrayList.size();
            oVar.w();
            for (int i8 = 0; i8 < size; i8++) {
                q qVar = (q) arrayList.get(i8);
                if (qVar.f3197b == this.f3197b) {
                    boolean z6 = true;
                    if (((qVar.f3218x & 4) != 0) && qVar.isCheckable()) {
                        if (qVar != this) {
                            z6 = false;
                        }
                        int i9 = qVar.f3218x;
                        int i10 = (z6 ? 2 : 0) | (i9 & -3);
                        qVar.f3218x = i10;
                        if (i9 != i10) {
                            qVar.f3209n.p(false);
                        }
                    }
                }
            }
            oVar.v();
        } else {
            int i11 = i3 & -3;
            if (!z5) {
                i7 = 0;
            }
            int i12 = i7 | i11;
            this.f3218x = i12;
            if (i3 != i12) {
                oVar.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z5) {
        this.f3218x = z5 ? this.f3218x | 16 : this.f3218x & -17;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i3) {
        this.f3207l = null;
        this.f3208m = i3;
        this.w = true;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3214s = colorStateList;
        this.f3216u = true;
        this.w = true;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3215t = mode;
        this.f3217v = true;
        this.w = true;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3202g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c6) {
        if (this.f3203h == c6) {
            return this;
        }
        this.f3203h = c6;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3211p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7) {
        this.f3203h = c6;
        this.f3205j = Character.toLowerCase(c7);
        this.f3209n.p(false);
        return this;
    }

    public final void setShowAsAction(int i3) {
        int i6 = i3 & 3;
        if (i6 == 0 || i6 == 1 || i6 == 2) {
            this.f3219y = i3;
            o oVar = this.f3209n;
            oVar.f3180k = true;
            oVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    public final MenuItem setTitle(int i3) {
        setTitle((CharSequence) this.f3209n.f3170a.getString(i3));
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3201f = charSequence;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z5) {
        int i3 = this.f3218x;
        boolean z6 = false;
        int i6 = (z5 ? 0 : 8) | (i3 & -9);
        this.f3218x = i6;
        if (i3 != i6) {
            z6 = true;
        }
        if (z6) {
            o oVar = this.f3209n;
            oVar.f3177h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3200e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setAlphabeticShortcut(char c6, int i3) {
        if (this.f3205j == c6 && this.f3206k == i3) {
            return this;
        }
        this.f3205j = Character.toLowerCase(c6);
        this.f3206k = KeyEvent.normalizeMetaState(i3);
        this.f3209n.p(false);
        return this;
    }

    public final b setContentDescription(CharSequence charSequence) {
        this.f3212q = charSequence;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3208m = 0;
        this.f3207l = drawable;
        this.w = true;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c6, int i3) {
        if (this.f3203h == c6 && this.f3204i == i3) {
            return this;
        }
        this.f3203h = c6;
        this.f3204i = KeyEvent.normalizeMetaState(i3);
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7, int i3, int i6) {
        this.f3203h = c6;
        this.f3204i = KeyEvent.normalizeMetaState(i3);
        this.f3205j = Character.toLowerCase(c7);
        this.f3206k = KeyEvent.normalizeMetaState(i6);
        this.f3209n.p(false);
        return this;
    }

    public final b setTooltipText(CharSequence charSequence) {
        this.f3213r = charSequence;
        this.f3209n.p(false);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3200e = charSequence;
        this.f3209n.p(false);
        i0 i0Var = this.f3210o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        int i3;
        this.f3220z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f3196a) > 0) {
            view.setId(i3);
        }
        o oVar = this.f3209n;
        oVar.f3180k = true;
        oVar.p(true);
        return this;
    }
}
