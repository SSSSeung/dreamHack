package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import e.n0;
import h.b0;
import h.c0;
import h.e0;
import h.m;
import h.n;
import h.o;
import h.q;
import p3.e;

public class ActionMenuView extends g2 implements n, e0 {
    public int A;
    public final int B;
    public final int C;
    public p D;

    /* renamed from: s  reason: collision with root package name */
    public o f432s;

    /* renamed from: t  reason: collision with root package name */
    public Context f433t;

    /* renamed from: u  reason: collision with root package name */
    public int f434u = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f435v;
    public m w;

    /* renamed from: x  reason: collision with root package name */
    public b0 f436x;

    /* renamed from: y  reason: collision with root package name */
    public m f437y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f438z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.B = (int) (56.0f * f6);
        this.C = (int) (f6 * 4.0f);
        this.f433t = context;
    }

    public static o l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            o oVar = layoutParams instanceof o ? new o((o) layoutParams) : new o(layoutParams);
            if (oVar.gravity <= 0) {
                oVar.gravity = 16;
            }
            return oVar;
        }
        o oVar2 = new o();
        oVar2.gravity = 16;
        return oVar2;
    }

    public final void a(o oVar) {
        this.f432s = oVar;
    }

    public final boolean b(q qVar) {
        return this.f432s.q(qVar, (c0) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = new o();
        oVar.gravity = 16;
        return oVar;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f432s == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f432s = oVar;
            oVar.f3174e = new n0(5, (Object) this);
            m mVar = new m(context);
            this.w = mVar;
            mVar.f667o = true;
            mVar.f668p = true;
            b0 b0Var = this.f436x;
            if (b0Var == null) {
                b0Var = new e(4);
            }
            mVar.f660h = b0Var;
            this.f432s.b(mVar, this.f433t);
            m mVar2 = this.w;
            mVar2.f663k = this;
            this.f432s = mVar2.f658f;
        }
        return this.f432s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m mVar = this.w;
        l lVar = mVar.f664l;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (mVar.f666n) {
            return mVar.f665m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f434u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final f2 h() {
        o oVar = new o();
        oVar.gravity = 16;
        return oVar;
    }

    public final f2 i(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ f2 j(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i3) {
        boolean z5 = false;
        if (i3 == 0) {
            return false;
        }
        View childAt = getChildAt(i3 - 1);
        View childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof n)) {
            z5 = false | ((n) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof n)) ? z5 : z5 | ((n) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m mVar = this.w;
        if (mVar != null) {
            mVar.h();
            if (this.w.j()) {
                this.w.f();
                this.w.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.w;
        if (mVar != null) {
            mVar.f();
            h hVar = mVar.w;
            if (hVar != null && hVar.b()) {
                hVar.f3094j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (!this.f438z) {
            super.onLayout(z5, i3, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i7 - i3;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean a6 = j4.a(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                o oVar = (o) childAt.getLayoutParams();
                if (oVar.f690a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a6) {
                        i9 = getPaddingLeft() + oVar.leftMargin;
                        i10 = i9 + measuredWidth;
                    } else {
                        i10 = (getWidth() - getPaddingRight()) - oVar.rightMargin;
                        i9 = i10 - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i9, i16, i10, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + oVar.leftMargin) + oVar.rightMargin;
                    m(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (a6) {
            int width = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                o oVar2 = (o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oVar2.f690a) {
                    int i21 = width - oVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width = i21 - ((measuredWidth3 + oVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            o oVar3 = (o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oVar3.f690a) {
                int i24 = paddingLeft + oVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = measuredWidth4 + oVar3.rightMargin + max + i24;
            }
        }
    }

    public final void onMeasure(int i3, int i6) {
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        int i10;
        int i11;
        boolean z7;
        int i12;
        int i13;
        int i14;
        o oVar;
        boolean z8 = this.f438z;
        boolean z9 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f438z = z9;
        if (z8 != z9) {
            this.A = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (!(!this.f438z || (oVar = this.f432s) == null || size == this.A)) {
            this.A = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f438z || childCount <= 0) {
            int i15 = i6;
            for (int i16 = 0; i16 < childCount; i16++) {
                o oVar2 = (o) getChildAt(i16).getLayoutParams();
                oVar2.rightMargin = 0;
                oVar2.leftMargin = 0;
            }
            super.onMeasure(i3, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.B;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z10 = false;
        int i26 = 0;
        long j6 = 0;
        while (true) {
            i7 = this.C;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = i17;
            if (childAt.getVisibility() == 8) {
                i12 = mode;
                i13 = paddingBottom;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i29 = i23 + 1;
                if (z11) {
                    childAt.setPadding(i7, 0, i7, 0);
                }
                o oVar3 = (o) childAt.getLayoutParams();
                oVar3.f695f = false;
                oVar3.f692c = 0;
                oVar3.f691b = 0;
                oVar3.f693d = false;
                oVar3.leftMargin = 0;
                oVar3.rightMargin = 0;
                oVar3.f694e = z11 && ((ActionMenuItemView) childAt).l();
                int i30 = oVar3.f690a ? 1 : i19;
                int i31 = i29;
                o oVar4 = (o) childAt.getLayoutParams();
                i12 = mode;
                i13 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = actionMenuItemView != null && actionMenuItemView.l();
                if (i30 <= 0 || (z12 && i30 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i30 * i21, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i14++;
                    }
                    if (z12 && i14 < 2) {
                        i14 = 2;
                    }
                }
                oVar4.f693d = !oVar4.f690a && z12;
                oVar4.f691b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21 * i14, 1073741824), makeMeasureSpec);
                i24 = Math.max(i24, i14);
                if (oVar3.f693d) {
                    i26++;
                }
                if (oVar3.f690a) {
                    z10 = true;
                }
                i19 -= i14;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j6 |= (long) (1 << i25);
                }
                i23 = i31;
            }
            i25++;
            size3 = i27;
            i17 = i28;
            paddingBottom = i13;
            mode = i12;
        }
        int i32 = mode;
        int i33 = i17;
        int i34 = size3;
        boolean z13 = z10 && i23 == 2;
        boolean z14 = false;
        while (true) {
            if (i26 <= 0 || i19 <= 0) {
                z5 = z14;
            } else {
                int i35 = Integer.MAX_VALUE;
                int i36 = 0;
                int i37 = 0;
                long j7 = 0;
                while (i37 < childCount2) {
                    o oVar5 = (o) getChildAt(i37).getLayoutParams();
                    boolean z15 = z14;
                    if (oVar5.f693d) {
                        int i38 = oVar5.f691b;
                        if (i38 < i35) {
                            j7 = 1 << i37;
                            i35 = i38;
                            i36 = 1;
                        } else if (i38 == i35) {
                            j7 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    z14 = z15;
                }
                z5 = z14;
                j6 |= j7;
                if (i36 > i19) {
                    break;
                }
                int i39 = i35 + 1;
                int i40 = 0;
                while (i40 < childCount2) {
                    View childAt2 = getChildAt(i40);
                    o oVar6 = (o) childAt2.getLayoutParams();
                    int i41 = i22;
                    int i42 = childMeasureSpec;
                    int i43 = childCount2;
                    long j8 = (long) (1 << i40);
                    if ((j7 & j8) != 0) {
                        if (!z13 || !oVar6.f694e) {
                            z7 = true;
                        } else {
                            z7 = true;
                            if (i19 == 1) {
                                childAt2.setPadding(i7 + i21, 0, i7, 0);
                            }
                        }
                        oVar6.f691b += z7 ? 1 : 0;
                        oVar6.f695f = z7;
                        i19--;
                    } else if (oVar6.f691b == i39) {
                        j6 |= j8;
                    }
                    i40++;
                    childMeasureSpec = i42;
                    i22 = i41;
                    childCount2 = i43;
                }
                z14 = true;
            }
        }
        z5 = z14;
        int i44 = i22;
        int i45 = childMeasureSpec;
        int i46 = childCount2;
        boolean z16 = !z10 && i23 == 1;
        if (i19 <= 0 || j6 == 0 || (i19 >= i23 - 1 && !z16 && i24 <= 1)) {
            i8 = i46;
            z6 = z5;
        } else {
            float bitCount = (float) Long.bitCount(j6);
            if (!z16) {
                if ((j6 & 1) != 0 && !((o) getChildAt(0).getLayoutParams()).f694e) {
                    bitCount -= 0.5f;
                }
                int i47 = i46 - 1;
                if ((j6 & ((long) (1 << i47))) != 0 && !((o) getChildAt(i47).getLayoutParams()).f694e) {
                    bitCount -= 0.5f;
                }
            }
            int i48 = bitCount > 0.0f ? (int) (((float) (i19 * i21)) / bitCount) : 0;
            boolean z17 = z5;
            i8 = i46;
            for (int i49 = 0; i49 < i8; i49++) {
                if ((j6 & ((long) (1 << i49))) != 0) {
                    View childAt3 = getChildAt(i49);
                    o oVar7 = (o) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        oVar7.f692c = i48;
                        oVar7.f695f = true;
                        if (i49 == 0 && !oVar7.f694e) {
                            oVar7.leftMargin = (-i48) / 2;
                        }
                        z17 = true;
                    } else {
                        if (oVar7.f690a) {
                            oVar7.f692c = i48;
                            oVar7.f695f = true;
                            oVar7.rightMargin = (-i48) / 2;
                            z17 = true;
                        } else {
                            if (i49 != 0) {
                                oVar7.leftMargin = i48 / 2;
                            }
                            if (i49 != i8 - 1) {
                                oVar7.rightMargin = i48 / 2;
                            }
                        }
                    }
                }
            }
            z6 = z17;
        }
        if (z6) {
            int i50 = 0;
            while (i50 < i8) {
                View childAt4 = getChildAt(i50);
                o oVar8 = (o) childAt4.getLayoutParams();
                if (!oVar8.f695f) {
                    i11 = i45;
                } else {
                    i11 = i45;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((oVar8.f691b * i21) + oVar8.f692c, 1073741824), i11);
                }
                i50++;
                i45 = i11;
            }
        }
        if (i32 != 1073741824) {
            i10 = i33;
            i9 = i44;
        } else {
            i9 = i34;
            i10 = i33;
        }
        setMeasuredDimension(i10, i9);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.w.f672t = z5;
    }

    public void setOnMenuItemClickListener(p pVar) {
        this.D = pVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m mVar = this.w;
        l lVar = mVar.f664l;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
            return;
        }
        mVar.f666n = true;
        mVar.f665m = drawable;
    }

    public void setOverflowReserved(boolean z5) {
        this.f435v = z5;
    }

    public void setPopupTheme(int i3) {
        if (this.f434u != i3) {
            this.f434u = i3;
            if (i3 == 0) {
                this.f433t = getContext();
            } else {
                this.f433t = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(m mVar) {
        this.w = mVar;
        mVar.f663k = this;
        this.f432s = mVar.f658f;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }
}
