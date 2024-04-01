package r3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p3.k;
import x0.h0;
import x0.u0;

public abstract class b extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final a f4941l = new a();

    /* renamed from: d  reason: collision with root package name */
    public final k f4942d;

    /* renamed from: e  reason: collision with root package name */
    public int f4943e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4944f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4945g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4946h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4947i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f4948j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f4949k;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: p3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = b1.o.c0(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = y2.a.w
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0023
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = x0.u0.f5622a
            x0.j0.s(r4, r2)
        L_0x0023:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.f4943e = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0045
        L_0x003a:
            p3.j r6 = p3.k.b(r5, r6, r0, r0)
            p3.k r2 = new p3.k
            r2.<init>(r6)
            r4.f4942d = r2
        L_0x0045:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.f4944f = r6
            r6 = 4
            android.content.res.ColorStateList r5 = b1.o.u(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = b1.o.K(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.f4945g = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.f4946h = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f4947i = r6
            r1.recycle()
            r3.a r6 = f4941l
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00db
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130903304(0x7f030108, float:1.7413422E38)
            int r6 = b1.v.u(r4, r6)
            r1 = 2130903282(0x7f0300f2, float:1.7413378E38)
            int r1 = b1.v.u(r4, r1)
            int r5 = b1.v.C(r6, r1, r5)
            p3.k r6 = r4.f4942d
            if (r6 == 0) goto L_0x00b3
            int r0 = r3.c.f4950a
            p3.g r0 = new p3.g
            r0.<init>((p3.k) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto L_0x00cf
        L_0x00b3:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = r3.c.f4950a
            r1 = 2131100393(0x7f0602e9, float:1.7813166E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00cf:
            android.content.res.ColorStateList r5 = r4.f4948j
            if (r5 == 0) goto L_0x00d6
            r0.b.h(r0, r5)
        L_0x00d6:
            java.util.WeakHashMap r5 = x0.u0.f5622a
            x0.d0.q(r4, r0)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setBaseTransientBottomBar(c cVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f4945g;
    }

    public int getAnimationMode() {
        return this.f4943e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4944f;
    }

    public int getMaxInlineActionWidth() {
        return this.f4947i;
    }

    public int getMaxWidth() {
        return this.f4946h;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        super.onLayout(z5, i3, i6, i7, i8);
    }

    public void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        int i7 = this.f4946h;
        if (i7 > 0 && getMeasuredWidth() > i7) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), i6);
        }
    }

    public void setAnimationMode(int i3) {
        this.f4943e = i3;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f4948j == null)) {
            drawable = drawable.mutate();
            r0.b.h(drawable, this.f4948j);
            r0.b.i(drawable, this.f4949k);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4948j = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            r0.b.h(mutate, colorStateList);
            r0.b.i(mutate, this.f4949k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4949k = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            r0.b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4941l);
        super.setOnClickListener(onClickListener);
    }
}
