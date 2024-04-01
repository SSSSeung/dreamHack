package com.google.android.material.internal;

import a3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.f2;
import androidx.appcompat.widget.f4;
import com.theori.dreamdrm.R;
import h.d0;
import h.q;
import java.util.WeakHashMap;
import k3.d;
import p0.i;
import p0.p;
import r0.b;
import x0.u0;

public class NavigationMenuItemView extends d implements d0 {
    public static final int[] J = {16842912};
    public boolean A;
    public final boolean B = true;
    public final CheckedTextView C;
    public FrameLayout D;
    public q E;
    public ColorStateList F;
    public boolean G;
    public Drawable H;
    public final a I;

    /* renamed from: y  reason: collision with root package name */
    public int f1991y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1992z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(3, this);
        this.I = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u0.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    public final void d(q qVar) {
        f2 f2Var;
        int i3;
        StateListDrawable stateListDrawable;
        this.E = qVar;
        int i6 = qVar.f3196a;
        if (i6 > 0) {
            setId(i6);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        boolean z5 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = u0.f5622a;
            x0.d0.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f3200e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f3212q);
        f4.a(this, qVar.f3213r);
        q qVar2 = this.E;
        if (!(qVar2.f3200e == null && qVar2.getIcon() == null && this.E.getActionView() != null)) {
            z5 = false;
        }
        CheckedTextView checkedTextView = this.C;
        if (z5) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                f2Var = (f2) frameLayout.getLayoutParams();
                i3 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.D;
            if (frameLayout2 != null) {
                f2Var = (f2) frameLayout2.getLayoutParams();
                i3 = -2;
            } else {
                return;
            }
        }
        f2Var.width = i3;
        this.D.setLayoutParams(f2Var);
    }

    public q getItemData() {
        return this.E;
    }

    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        q qVar = this.E;
        if (qVar != null && qVar.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.A != z5) {
            this.A = z5;
            this.I.h(this.C, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.C;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z5 || !this.B) ? 0 : 1);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.F);
            }
            int i3 = this.f1991y;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f1992z) {
            if (this.H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = p.f4411a;
                Drawable a6 = i.a(resources, R.drawable.navigation_empty_icon, theme);
                this.H = a6;
                if (a6 != null) {
                    int i6 = this.f1991y;
                    a6.setBounds(0, 0, i6, i6);
                }
            }
            drawable = this.H;
        }
        b1.q.e(this.C, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i3) {
        this.C.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f1991y = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        q qVar = this.E;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.C.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.f1992z = z5;
    }

    public void setTextAppearance(int i3) {
        this.C.setTextAppearance(i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }
}
