package f3;

import a2.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.m3;
import androidx.appcompat.widget.t;
import b1.b;
import b1.o;
import b1.v;
import com.theori.dreamdrm.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.i;
import p0.p;
import u1.d;
import y2.a;

public final class c extends t {
    public static final int[] B = {R.attr.state_indeterminate};
    public static final int[] C = {R.attr.state_error};
    public static final int[][] D = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public static final int E = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final a A;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet f2658h = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashSet f2659i = new LinkedHashSet();

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2660j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2661k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2662l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2663m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f2664n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f2665o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f2666p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2667q;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f2668r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f2669s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f2670t;

    /* renamed from: u  reason: collision with root package name */
    public int f2671u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f2672v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f2673x;

    /* renamed from: y  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2674y;

    /* renamed from: z  reason: collision with root package name */
    public final d f2675z;

    public c(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.checkboxStyle, 2131756050), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        d dVar = new d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = p.f4411a;
        Drawable a6 = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f5273d = a6;
        a6.setCallback(dVar.f5272i);
        new u1.c(dVar.f5273d.getConstantState());
        this.f2675z = dVar;
        this.A = new a(this);
        Context context3 = getContext();
        this.f2665o = b1.c.a(this);
        this.f2668r = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        int[] iArr = a.f5832m;
        v.f(context3, attributeSet, R.attr.checkboxStyle, 2131756050);
        v.j(context3, attributeSet, iArr, R.attr.checkboxStyle, 2131756050, new int[0]);
        m3 m3Var = new m3(context3, context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2131756050));
        this.f2666p = m3Var.e(2);
        if (this.f2665o != null && v.M(context3, R.attr.isMaterial3Theme, false)) {
            if (m3Var.i(0, 0) == E && m3Var.i(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f2665o = w4.p.n(context3, R.drawable.mtrl_checkbox_button);
                this.f2667q = true;
                if (this.f2666p == null) {
                    this.f2666p = w4.p.n(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f2669s = o.v(context3, m3Var, 3);
        this.f2670t = o.K(m3Var.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2661k = m3Var.a(10, false);
        this.f2662l = m3Var.a(6, true);
        this.f2663m = m3Var.a(9, false);
        this.f2664n = m3Var.k(8);
        if (m3Var.l(7)) {
            setCheckedState(m3Var.h(7, 0));
        }
        m3Var.o();
        a();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i3;
        int i6 = this.f2671u;
        if (i6 == 1) {
            resources = getResources();
            i3 = R.string.mtrl_checkbox_state_description_checked;
        } else if (i6 == 0) {
            resources = getResources();
            i3 = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i3 = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i3);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2660j == null) {
            int u3 = v.u(this, R.attr.colorControlActivated);
            int u5 = v.u(this, R.attr.colorError);
            int u6 = v.u(this, R.attr.colorSurface);
            int u7 = v.u(this, R.attr.colorOnSurface);
            this.f2660j = new ColorStateList(D, new int[]{v.C(u6, u5, 1.0f), v.C(u6, u3, 1.0f), v.C(u6, u7, 0.54f), v.C(u6, u7, 0.38f), v.C(u6, u7, 0.38f)});
        }
        return this.f2660j;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f2668r;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        androidx.appcompat.widget.d dVar;
        Drawable drawable = this.f2665o;
        ColorStateList colorStateList3 = this.f2668r;
        PorterDuff.Mode b6 = b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b6 != null) {
                r0.b.i(drawable, b6);
            }
        }
        this.f2665o = drawable;
        Drawable drawable2 = this.f2666p;
        ColorStateList colorStateList4 = this.f2669s;
        PorterDuff.Mode mode = this.f2670t;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                r0.b.i(drawable2, mode);
            }
        }
        this.f2666p = drawable2;
        if (this.f2667q) {
            d dVar2 = this.f2675z;
            if (dVar2 != null) {
                Drawable drawable3 = dVar2.f5273d;
                a aVar = this.A;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f2655a == null) {
                        aVar.f2655a = new u1.a(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f2655a);
                }
                ArrayList arrayList = dVar2.f5271h;
                u1.b bVar = dVar2.f5268e;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (dVar2.f5271h.size() == 0 && (dVar = dVar2.f5270g) != null) {
                        bVar.f5264b.removeListener(dVar);
                        dVar2.f5270g = null;
                    }
                }
                Drawable drawable4 = dVar2.f5273d;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f2655a == null) {
                        aVar.f2655a = new u1.a(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f2655a);
                } else if (aVar != null) {
                    if (dVar2.f5271h == null) {
                        dVar2.f5271h = new ArrayList();
                    }
                    if (!dVar2.f5271h.contains(aVar)) {
                        dVar2.f5271h.add(aVar);
                        if (dVar2.f5270g == null) {
                            dVar2.f5270g = new androidx.appcompat.widget.d(2, dVar2);
                        }
                        bVar.f5264b.addListener(dVar2.f5270g);
                    }
                }
            }
            Drawable drawable5 = this.f2665o;
            if ((drawable5 instanceof AnimatedStateListDrawable) && dVar2 != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar2, false);
                ((AnimatedStateListDrawable) this.f2665o).addTransition(R.id.indeterminate, R.id.unchecked, dVar2, false);
            }
        }
        Drawable drawable6 = this.f2665o;
        if (!(drawable6 == null || (colorStateList2 = this.f2668r) == null)) {
            r0.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f2666p;
        if (!(drawable7 == null || (colorStateList = this.f2669s) == null)) {
            r0.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f2665o;
        Drawable drawable9 = this.f2666p;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f6 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f6 >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f2665o;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2666p;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2669s;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2670t;
    }

    public ColorStateList getButtonTintList() {
        return this.f2668r;
    }

    public int getCheckedState() {
        return this.f2671u;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2664n;
    }

    public final boolean isChecked() {
        return this.f2671u == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2661k && this.f2668r == null && this.f2669s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i3) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, B);
        }
        if (this.f2663m) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        int i6 = 0;
        while (true) {
            if (i6 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i7 = onCreateDrawableState[i6];
            if (i7 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i7 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i6] = 16842912;
                break;
            } else {
                i6++;
            }
        }
        this.f2672v = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a6;
        if (!this.f2662l || !TextUtils.isEmpty(getText()) || (a6 = b1.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a6.getIntrinsicWidth()) / 2) * (o.F(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a6.getBounds();
            r0.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f2663m) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f2664n);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f2657d);
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f2657d = getCheckedState();
        return bVar;
    }

    public void setButtonDrawable(int i3) {
        setButtonDrawable(w4.p.n(getContext(), i3));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f2666p = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i3) {
        setButtonIconDrawable(w4.p.n(getContext(), i3));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f2669s != colorStateList) {
            this.f2669s = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f2670t != mode) {
            this.f2670t = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f2668r != colorStateList) {
            this.f2668r = colorStateList;
            a();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.f2662l = z5;
    }

    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i3) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f2671u != i3) {
            this.f2671u = i3;
            super.setChecked(i3 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f2673x == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.w) {
                this.w = true;
                LinkedHashSet linkedHashSet = this.f2659i;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        m.o(it.next());
                        throw null;
                    }
                }
                if (!(this.f2671u == 2 || (onCheckedChangeListener = this.f2674y) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.w = false;
            }
        }
    }

    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f2664n = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i3) {
        setErrorAccessibilityLabel(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.f2663m != z5) {
            this.f2663m = z5;
            refreshDrawableState();
            Iterator it = this.f2658h.iterator();
            if (it.hasNext()) {
                m.o(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2674y = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f2673x = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f2661k = z5;
        b.c(this, z5 ? getMaterialThemeColorsTintList() : null);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f2665o = drawable;
        this.f2667q = false;
        a();
    }
}
