package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import s0.b;

public final class w extends d implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final b f3229d;

    /* renamed from: e  reason: collision with root package name */
    public Method f3230e;

    public w(Context context, b bVar) {
        super(context);
        if (bVar != null) {
            this.f3229d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f3229d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f3229d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        r a6 = this.f3229d.a();
        if (a6 instanceof r) {
            return a6.f3221a;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f3229d.getActionView();
        return actionView instanceof t ? (View) ((t) actionView).f3224d : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f3229d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f3229d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f3229d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f3229d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f3229d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f3229d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3229d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f3229d.getIntent();
    }

    public final int getItemId() {
        return this.f3229d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3229d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f3229d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f3229d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f3229d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.f3229d.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.f3229d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f3229d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f3229d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f3229d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f3229d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f3229d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f3229d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f3229d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f3229d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        s sVar = new s(this, actionProvider);
        if (actionProvider == null) {
            sVar = null;
        }
        this.f3229d.b(sVar);
        return this;
    }

    public final MenuItem setActionView(int i3) {
        b bVar = this.f3229d;
        bVar.setActionView(i3);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new t(actionView));
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f3229d.setAlphabeticShortcut(c6);
        return this;
    }

    public final MenuItem setCheckable(boolean z5) {
        this.f3229d.setCheckable(z5);
        return this;
    }

    public final MenuItem setChecked(boolean z5) {
        this.f3229d.setChecked(z5);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3229d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z5) {
        this.f3229d.setEnabled(z5);
        return this;
    }

    public final MenuItem setIcon(int i3) {
        this.f3229d.setIcon(i3);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3229d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3229d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3229d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c6) {
        this.f3229d.setNumericShortcut(c6);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3229d.setOnActionExpandListener(onActionExpandListener != null ? new u(this, onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3229d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new v(this, onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7) {
        this.f3229d.setShortcut(c6, c7);
        return this;
    }

    public final void setShowAsAction(int i3) {
        this.f3229d.setShowAsAction(i3);
    }

    public final MenuItem setShowAsActionFlags(int i3) {
        this.f3229d.setShowAsActionFlags(i3);
        return this;
    }

    public final MenuItem setTitle(int i3) {
        this.f3229d.setTitle(i3);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3229d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3229d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z5) {
        return this.f3229d.setVisible(z5);
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new t(view);
        }
        this.f3229d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c6, int i3) {
        this.f3229d.setAlphabeticShortcut(c6, i3);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3229d.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c6, int i3) {
        this.f3229d.setNumericShortcut(c6, i3);
        return this;
    }

    public final MenuItem setShortcut(char c6, char c7, int i3, int i6) {
        this.f3229d.setShortcut(c6, c7, i3, i6);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3229d.setTitle(charSequence);
        return this;
    }
}
