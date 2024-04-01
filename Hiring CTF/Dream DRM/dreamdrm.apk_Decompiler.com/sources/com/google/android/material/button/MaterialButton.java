package com.google.android.material.button;

import a2.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.s;
import b1.o;
import b1.q;
import com.theori.dreamdrm.R;
import d3.a;
import d3.c;
import e2.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p3.j;
import p3.k;
import p3.v;
import r0.b;
import w4.p;
import x0.e0;
import x0.u0;

public class MaterialButton extends s implements Checkable, v {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f1862u = {16842911};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f1863v = {16842912};

    /* renamed from: g  reason: collision with root package name */
    public final c f1864g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet f1865h = new LinkedHashSet();

    /* renamed from: i  reason: collision with root package name */
    public a f1866i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f1867j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f1868k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f1869l;

    /* renamed from: m  reason: collision with root package name */
    public String f1870m;

    /* renamed from: n  reason: collision with root package name */
    public int f1871n;

    /* renamed from: o  reason: collision with root package name */
    public int f1872o;

    /* renamed from: p  reason: collision with root package name */
    public int f1873p;

    /* renamed from: q  reason: collision with root package name */
    public int f1874q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1875r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1876s;

    /* renamed from: t  reason: collision with root package name */
    public int f1877t;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(o.c0(context, attributeSet, R.attr.materialButtonStyle, 2131756026), attributeSet, R.attr.materialButtonStyle);
        boolean z5 = false;
        this.f1875r = false;
        this.f1876s = false;
        Context context2 = getContext();
        TypedArray G = b1.v.G(context2, attributeSet, y2.a.f5828i, R.attr.materialButtonStyle, 2131756026, new int[0]);
        this.f1874q = G.getDimensionPixelSize(12, 0);
        this.f1867j = o.K(G.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f1868k = o.u(getContext(), G, 14);
        this.f1869l = o.w(getContext(), G, 10);
        this.f1877t = G.getInteger(11, 1);
        this.f1871n = G.getDimensionPixelSize(13, 0);
        c cVar = new c(this, new k(k.b(context2, attributeSet, R.attr.materialButtonStyle, 2131756026)));
        this.f1864g = cVar;
        cVar.f2157c = G.getDimensionPixelOffset(1, 0);
        cVar.f2158d = G.getDimensionPixelOffset(2, 0);
        cVar.f2159e = G.getDimensionPixelOffset(3, 0);
        cVar.f2160f = G.getDimensionPixelOffset(4, 0);
        if (G.hasValue(8)) {
            int dimensionPixelSize = G.getDimensionPixelSize(8, -1);
            cVar.f2161g = dimensionPixelSize;
            k kVar = cVar.f2156b;
            float f6 = (float) dimensionPixelSize;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f4793e = new p3.a(f6);
            jVar.f4794f = new p3.a(f6);
            jVar.f4795g = new p3.a(f6);
            jVar.f4796h = new p3.a(f6);
            cVar.c(new k(jVar));
            cVar.f2170p = true;
        }
        cVar.f2162h = G.getDimensionPixelSize(20, 0);
        cVar.f2163i = o.K(G.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        cVar.f2164j = o.u(getContext(), G, 6);
        cVar.f2165k = o.u(getContext(), G, 19);
        cVar.f2166l = o.u(getContext(), G, 16);
        cVar.f2171q = G.getBoolean(5, false);
        cVar.f2174t = G.getDimensionPixelSize(9, 0);
        cVar.f2172r = G.getBoolean(21, true);
        WeakHashMap weakHashMap = u0.f5622a;
        int f7 = e0.f(this);
        int paddingTop = getPaddingTop();
        int e6 = e0.e(this);
        int paddingBottom = getPaddingBottom();
        if (G.hasValue(0)) {
            cVar.f2169o = true;
            setSupportBackgroundTintList(cVar.f2164j);
            setSupportBackgroundTintMode(cVar.f2163i);
        } else {
            cVar.e();
        }
        e0.k(this, f7 + cVar.f2157c, paddingTop + cVar.f2159e, e6 + cVar.f2158d, paddingBottom + cVar.f2160f);
        G.recycle();
        setCompoundDrawablePadding(this.f1874q);
        c(this.f1869l != null ? true : z5);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil((double) f6);
    }

    public final boolean a() {
        c cVar = this.f1864g;
        return cVar != null && !cVar.f2169o;
    }

    public final void b() {
        int i3 = this.f1877t;
        boolean z5 = false;
        if (i3 == 1 || i3 == 2) {
            q.e(this, this.f1869l, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i3 == 3 || i3 == 4) {
            q.e(this, (Drawable) null, (Drawable) null, this.f1869l, (Drawable) null);
            return;
        }
        if (i3 == 16 || i3 == 32) {
            z5 = true;
        }
        if (z5) {
            q.e(this, (Drawable) null, this.f1869l, (Drawable) null, (Drawable) null);
        }
    }

    public final void c(boolean z5) {
        Drawable drawable = this.f1869l;
        boolean z6 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1869l = mutate;
            b.h(mutate, this.f1868k);
            PorterDuff.Mode mode = this.f1867j;
            if (mode != null) {
                b.i(this.f1869l, mode);
            }
            int i3 = this.f1871n;
            if (i3 == 0) {
                i3 = this.f1869l.getIntrinsicWidth();
            }
            int i6 = this.f1871n;
            if (i6 == 0) {
                i6 = this.f1869l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1869l;
            int i7 = this.f1872o;
            int i8 = this.f1873p;
            drawable2.setBounds(i7, i8, i3 + i7, i6 + i8);
            this.f1869l.setVisible(true, z5);
        }
        if (z5) {
            b();
            return;
        }
        Drawable[] a6 = q.a(this);
        Drawable drawable3 = a6[0];
        Drawable drawable4 = a6[1];
        Drawable drawable5 = a6[2];
        int i9 = this.f1877t;
        if (!(i9 == 1 || i9 == 2) || drawable3 == this.f1869l) {
            if (!(i9 == 3 || i9 == 4) || drawable5 == this.f1869l) {
                if (!(i9 == 16 || i9 == 32) || drawable4 == this.f1869l) {
                    z6 = false;
                }
            }
        }
        if (z6) {
            b();
        }
    }

    public final void d(int i3, int i6) {
        if (this.f1869l != null && getLayout() != null) {
            int i7 = this.f1877t;
            boolean z5 = true;
            if (!(i7 == 1 || i7 == 2)) {
                if (!(i7 == 3 || i7 == 4)) {
                    if (!(i7 == 16 || i7 == 32)) {
                        z5 = false;
                    }
                    if (z5) {
                        this.f1872o = 0;
                        if (i7 == 16) {
                            this.f1873p = 0;
                            c(false);
                            return;
                        }
                        int i8 = this.f1871n;
                        if (i8 == 0) {
                            i8 = this.f1869l.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i6 - getTextHeight()) - getPaddingTop()) - i8) - this.f1874q) - getPaddingBottom()) / 2);
                        if (this.f1873p != max) {
                            this.f1873p = max;
                            c(false);
                        }
                        return;
                    }
                    return;
                }
            }
            this.f1873p = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i9 = this.f1877t;
            if (i9 == 1 || i9 == 3 || ((i9 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i9 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.f1872o = 0;
                c(false);
                return;
            }
            int i10 = this.f1871n;
            if (i10 == 0) {
                i10 = this.f1869l.getIntrinsicWidth();
            }
            int textLayoutWidth = i3 - getTextLayoutWidth();
            WeakHashMap weakHashMap = u0.f5622a;
            int e6 = (((textLayoutWidth - e0.e(this)) - i10) - this.f1874q) - e0.f(this);
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                e6 /= 2;
            }
            boolean z6 = e0.d(this) == 1;
            if (this.f1877t != 4) {
                z5 = false;
            }
            if (z6 != z5) {
                e6 = -e6;
            }
            if (this.f1872o != e6) {
                this.f1872o = e6;
                c(false);
            }
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1870m)) {
            return this.f1870m;
        }
        c cVar = this.f1864g;
        return (cVar != null && cVar.f2171q ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f1864g.f2161g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1869l;
    }

    public int getIconGravity() {
        return this.f1877t;
    }

    public int getIconPadding() {
        return this.f1874q;
    }

    public int getIconSize() {
        return this.f1871n;
    }

    public ColorStateList getIconTint() {
        return this.f1868k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1867j;
    }

    public int getInsetBottom() {
        return this.f1864g.f2160f;
    }

    public int getInsetTop() {
        return this.f1864g.f2159e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f1864g.f2166l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f1864g.f2156b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f1864g.f2165k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f1864g.f2162h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f1864g.f2164j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f1864g.f2163i : super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f1875r;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            com.bumptech.glide.c.F(this, this.f1864g.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        c cVar = this.f1864g;
        if (cVar != null && cVar.f2171q) {
            View.mergeDrawableStates(onCreateDrawableState, f1862u);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1863v);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f1864g;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f2171q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d3.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d3.b bVar = (d3.b) parcelable;
        super.onRestoreInstanceState(bVar.f2483d);
        setChecked(bVar.f2154f);
    }

    public final Parcelable onSaveInstanceState() {
        d3.b bVar = new d3.b(super.onSaveInstanceState());
        bVar.f2154f = this.f1875r;
        return bVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i6, int i7) {
        super.onTextChanged(charSequence, i3, i6, i7);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f1864g.f2172r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1869l != null) {
            if (this.f1869l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1870m = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i3) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i3);
                return;
            }
            return;
        }
        super.setBackgroundColor(i3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f1864g;
                cVar.f2169o = true;
                ColorStateList colorStateList = cVar.f2164j;
                MaterialButton materialButton = cVar.f2155a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f2163i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? p.n(getContext(), i3) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (a()) {
            this.f1864g.f2171q = z5;
        }
    }

    public void setChecked(boolean z5) {
        c cVar = this.f1864g;
        if ((cVar != null && cVar.f2171q) && isEnabled() && this.f1875r != z5) {
            this.f1875r = z5;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z6 = this.f1875r;
                if (!materialButtonToggleGroup.f1884i) {
                    materialButtonToggleGroup.b(getId(), z6);
                }
            }
            if (!this.f1876s) {
                this.f1876s = true;
                Iterator it = this.f1865h.iterator();
                if (!it.hasNext()) {
                    this.f1876s = false;
                } else {
                    m.o(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i3) {
        if (a()) {
            c cVar = this.f1864g;
            if (!cVar.f2170p || cVar.f2161g != i3) {
                cVar.f2161g = i3;
                cVar.f2170p = true;
                k kVar = cVar.f2156b;
                float f6 = (float) i3;
                kVar.getClass();
                j jVar = new j(kVar);
                jVar.f4793e = new p3.a(f6);
                jVar.f4794f = new p3.a(f6);
                jVar.f4795g = new p3.a(f6);
                jVar.f4796h = new p3.a(f6);
                cVar.c(new k(jVar));
            }
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        if (a()) {
            this.f1864g.b(false).i(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1869l != drawable) {
            this.f1869l = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f1877t != i3) {
            this.f1877t = i3;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f1874q != i3) {
            this.f1874q = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? p.n(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1871n != i3) {
            this.f1871n = i3;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1868k != colorStateList) {
            this.f1868k = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1867j != mode) {
            this.f1867j = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(n0.b.a(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        c cVar = this.f1864g;
        cVar.d(cVar.f2159e, i3);
    }

    public void setInsetTop(int i3) {
        c cVar = this.f1864g;
        cVar.d(i3, cVar.f2160f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1866i = aVar;
    }

    public void setPressed(boolean z5) {
        a aVar = this.f1866i;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((f) aVar).f2505e).invalidate();
        }
        super.setPressed(z5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.f2166l != colorStateList) {
                cVar.f2166l = colorStateList;
                MaterialButton materialButton = cVar.f2155a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(n3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i3) {
        if (a()) {
            setRippleColor(n0.b.a(getContext(), i3));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (a()) {
            this.f1864g.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (a()) {
            c cVar = this.f1864g;
            cVar.f2168n = z5;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.f2165k != colorStateList) {
                cVar.f2165k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i3) {
        if (a()) {
            setStrokeColor(n0.b.a(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.f2162h != i3) {
                cVar.f2162h = i3;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.f2164j != colorStateList) {
                cVar.f2164j = colorStateList;
                if (cVar.b(false) != null) {
                    b.h(cVar.b(false), cVar.f2164j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f1864g;
            if (cVar.f2163i != mode) {
                cVar.f2163i = mode;
                if (cVar.b(false) != null && cVar.f2163i != null) {
                    b.i(cVar.b(false), cVar.f2163i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f1864g.f2172r = z5;
    }

    public final void toggle() {
        setChecked(!this.f1875r);
    }
}
