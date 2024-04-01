package s3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.h3;
import androidx.appcompat.widget.o2;
import androidx.appcompat.widget.q;
import b1.o;
import b1.v;
import com.google.android.material.textfield.TextInputLayout;
import com.theori.dreamdrm.R;
import java.util.Locale;
import p3.g;
import y2.a;

public final class t extends q {

    /* renamed from: h  reason: collision with root package name */
    public final o2 f5049h;

    /* renamed from: i  reason: collision with root package name */
    public final AccessibilityManager f5050i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f5051j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    public final int f5052k;

    /* renamed from: l  reason: collision with root package name */
    public final float f5053l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f5054m;

    /* renamed from: n  reason: collision with root package name */
    public int f5055n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f5056o;

    public t(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        Context context2 = getContext();
        TypedArray G = v.G(context2, attributeSet, a.f5827h, R.attr.autoCompleteTextViewStyle, 2131755766, new int[0]);
        if (G.hasValue(0) && G.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f5052k = G.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f5053l = (float) G.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (G.hasValue(2)) {
            this.f5054m = ColorStateList.valueOf(G.getColor(2, 0));
        }
        this.f5055n = G.getColor(4, 0);
        this.f5056o = o.u(context2, G, 5);
        this.f5050i = (AccessibilityManager) context2.getSystemService("accessibility");
        o2 o2Var = new o2(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f5049h = o2Var;
        o2Var.B = true;
        g0 g0Var = o2Var.C;
        g0Var.setFocusable(true);
        o2Var.f710r = this;
        g0Var.setInputMethodMode(2);
        o2Var.o(getAdapter());
        o2Var.f711s = new h3(this, 1);
        if (G.hasValue(6)) {
            setSimpleItems(G.getResourceId(6, 0));
        }
        G.recycle();
    }

    public static void a(t tVar, Object obj) {
        tVar.setText(tVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f5050i;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f5049h.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f5054m;
    }

    public CharSequence getHint() {
        TextInputLayout b6 = b();
        return (b6 == null || !b6.H) ? super.getHint() : b6.getHint();
    }

    public float getPopupElevation() {
        return this.f5053l;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5055n;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5056o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b6 = b();
        if (b6 != null && b6.H && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5049h.dismiss();
    }

    public final void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b6 = b();
            int i7 = 0;
            if (!(adapter == null || b6 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                o2 o2Var = this.f5049h;
                int min = Math.min(adapter.getCount(), Math.max(0, !o2Var.a() ? -1 : o2Var.f698f.getSelectedItemPosition()) + 15);
                View view = null;
                int i8 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i7) {
                        view = null;
                        i7 = itemViewType;
                    }
                    view = adapter.getView(max, view, b6);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i8 = Math.max(i8, view.getMeasuredWidth());
                }
                Drawable h6 = o2Var.h();
                if (h6 != null) {
                    Rect rect = this.f5051j;
                    h6.getPadding(rect);
                    i8 += rect.left + rect.right;
                }
                i7 = b6.getEndIconView().getMeasuredWidth() + i8;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i7), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z5) {
        AccessibilityManager accessibilityManager = this.f5050i;
        if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
            super.onWindowFocusChanged(z5);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f5049h.o(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o2 o2Var = this.f5049h;
        if (o2Var != null) {
            o2Var.l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i3) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i3));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f5054m = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).j(this.f5054m);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5049h.f712t = getOnItemSelectedListener();
    }

    public void setRawInputType(int i3) {
        super.setRawInputType(i3);
        TextInputLayout b6 = b();
        if (b6 != null) {
            b6.r();
        }
    }

    public void setSimpleItemSelectedColor(int i3) {
        this.f5055n = i3;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5056o = colorStateList;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i3) {
        setSimpleItems(getResources().getStringArray(i3));
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f5050i;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f5049h.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new s(this, getContext(), this.f5052k, strArr));
    }
}
