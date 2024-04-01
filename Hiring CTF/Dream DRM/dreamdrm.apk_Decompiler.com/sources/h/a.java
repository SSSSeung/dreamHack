package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import s0.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3069a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3070b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f3071c;

    /* renamed from: d  reason: collision with root package name */
    public char f3072d;

    /* renamed from: e  reason: collision with root package name */
    public int f3073e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f3074f;

    /* renamed from: g  reason: collision with root package name */
    public int f3075g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3076h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f3077i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3078j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3079k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3080l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3081m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3082n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3083o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f3084p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f3077i = context;
        this.f3069a = charSequence;
    }

    public final r a() {
        return null;
    }

    public final b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f3076h;
        if (drawable == null) {
            return;
        }
        if (this.f3082n || this.f3083o) {
            this.f3076h = drawable;
            Drawable mutate = drawable.mutate();
            this.f3076h = mutate;
            if (this.f3082n) {
                r0.b.h(mutate, this.f3080l);
            }
            if (this.f3083o) {
                r0.b.i(this.f3076h, this.f3081m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f3075g;
    }

    public final char getAlphabeticShortcut() {
        return this.f3074f;
    }

    public final CharSequence getContentDescription() {
        return this.f3078j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f3076h;
    }

    public final ColorStateList getIconTintList() {
        return this.f3080l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3081m;
    }

    public final Intent getIntent() {
        return this.f3071c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f3073e;
    }

    public final char getNumericShortcut() {
        return this.f3072d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f3069a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3070b;
        return charSequence != null ? charSequence : this.f3069a;
    }

    public final CharSequence getTooltipText() {
        return this.f3079k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f3084p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f3084p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f3084p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f3084p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f3074f = Character.toLowerCase(c6);
        return this;
    }

    public final MenuItem setCheckable(boolean z5) {
        this.f3084p = z5 | (this.f3084p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z5) {
        this.f3084p = (z5 ? 2 : 0) | (this.f3084p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3078j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z5) {
        this.f3084p = (z5 ? 16 : 0) | (this.f3084p & -17);
        return this;
    }

    public final MenuItem setIcon(int i3) {
        Object obj = n0.b.f4213a;
        this.f3076h = o0.b.b(this.f3077i, i3);
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3080l = colorStateList;
        this.f3082n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3081m = mode;
        this.f3083o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3071c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c6) {
        this.f3072d = c6;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7) {
        this.f3072d = c6;
        this.f3074f = Character.toLowerCase(c7);
        return this;
    }

    public final void setShowAsAction(int i3) {
    }

    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }

    public final MenuItem setTitle(int i3) {
        this.f3069a = this.f3077i.getResources().getString(i3);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3070b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3079k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z5) {
        int i3 = 8;
        int i6 = this.f3084p & 8;
        if (z5) {
            i3 = 0;
        }
        this.f3084p = i6 | i3;
        return this;
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c6, int i3) {
        this.f3074f = Character.toLowerCase(c6);
        this.f3075g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m9setContentDescription(CharSequence charSequence) {
        this.f3078j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c6, int i3) {
        this.f3072d = c6;
        this.f3073e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7, int i3, int i6) {
        this.f3072d = c6;
        this.f3073e = KeyEvent.normalizeMetaState(i3);
        this.f3074f = Character.toLowerCase(c7);
        this.f3075g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3069a = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m10setTooltipText(CharSequence charSequence) {
        this.f3079k = charSequence;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3076h = drawable;
        c();
        return this;
    }
}
