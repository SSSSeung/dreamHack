package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.theori.dreamdrm.R;
import d.a;
import h.o;
import x0.g1;
import x0.u0;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: d  reason: collision with root package name */
    public final a f391d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public final Context f392e;

    /* renamed from: f  reason: collision with root package name */
    public ActionMenuView f393f;

    /* renamed from: g  reason: collision with root package name */
    public m f394g;

    /* renamed from: h  reason: collision with root package name */
    public int f395h;

    /* renamed from: i  reason: collision with root package name */
    public g1 f396i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f397j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f398k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f399l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f400m;

    /* renamed from: n  reason: collision with root package name */
    public View f401n;

    /* renamed from: o  reason: collision with root package name */
    public View f402o;

    /* renamed from: p  reason: collision with root package name */
    public View f403p;

    /* renamed from: q  reason: collision with root package name */
    public LinearLayout f404q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f405r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f406s;

    /* renamed from: t  reason: collision with root package name */
    public final int f407t;

    /* renamed from: u  reason: collision with root package name */
    public final int f408u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f409v;
    public final int w;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        r0 = r7.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 2130903068(0x7f03001c, float:1.7412944E38)
            r5.<init>(r6, r7, r0)
            androidx.appcompat.widget.a r1 = new androidx.appcompat.widget.a
            r1.<init>(r5)
            r5.f391d = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 2130903042(0x7f030002, float:1.741289E38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L_0x002e
            int r2 = r1.resourceId
            if (r2 == 0) goto L_0x002e
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.f392e = r2
            goto L_0x0030
        L_0x002e:
            r5.f392e = r6
        L_0x0030:
            int[] r1 = d.a.f2116d
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto L_0x0048
            int r0 = r7.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = w4.p.n(r6, r0)
            goto L_0x004c
        L_0x0048:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r2)
        L_0x004c:
            java.util.WeakHashMap r0 = x0.u0.f5622a
            x0.d0.q(r5, r6)
            r6 = 5
            int r6 = r7.getResourceId(r6, r2)
            r5.f407t = r6
            r6 = 4
            int r6 = r7.getResourceId(r6, r2)
            r5.f408u = r6
            r6 = 3
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.f395h = r6
            r6 = 2
            r0 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r6 = r7.getResourceId(r6, r0)
            r5.w = r6
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static int f(View view, int i3, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i6);
        return Math.max(0, (i3 - view.getMeasuredWidth()) - 0);
    }

    public static int j(View view, int i3, int i6, int i7, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = ((i7 - measuredHeight) / 2) + i6;
        if (z5) {
            view.layout(i3 - measuredWidth, i8, i3, measuredHeight + i8);
        } else {
            view.layout(i3, i8, i3 + measuredWidth, measuredHeight + i8);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(g.c r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f401n
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.w
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f401n = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r5.f401n
        L_0x001e:
            r5.addView(r0)
        L_0x0021:
            android.view.View r0 = r5.f401n
            r2 = 2131230784(0x7f080040, float:1.807763E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.f402o = r0
            androidx.appcompat.widget.c r2 = new androidx.appcompat.widget.c
            r2.<init>(r5, r6)
            r0.setOnClickListener(r2)
            h.o r6 = r6.e()
            androidx.appcompat.widget.m r0 = r5.f394g
            if (r0 == 0) goto L_0x004e
            r0.f()
            androidx.appcompat.widget.h r0 = r0.w
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x004e
            h.x r0 = r0.f3094j
            r0.dismiss()
        L_0x004e:
            androidx.appcompat.widget.m r0 = new androidx.appcompat.widget.m
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f394g = r0
            r2 = 1
            r0.f667o = r2
            r0.f668p = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.m r2 = r5.f394g
            android.content.Context r3 = r5.f392e
            r6.b(r2, r3)
            androidx.appcompat.widget.m r6 = r5.f394g
            h.e0 r2 = r6.f663k
            if (r2 != 0) goto L_0x0086
            android.view.LayoutInflater r3 = r6.f659g
            int r4 = r6.f661i
            android.view.View r1 = r3.inflate(r4, r5, r1)
            h.e0 r1 = (h.e0) r1
            r6.f663k = r1
            h.o r3 = r6.f658f
            r1.a(r3)
            r6.h()
        L_0x0086:
            h.e0 r1 = r6.f663k
            if (r2 == r1) goto L_0x0090
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L_0x0090:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f393f = r1
            java.util.WeakHashMap r6 = x0.u0.f5622a
            r6 = 0
            x0.d0.q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f393f
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.c(g.c):void");
    }

    public final void d() {
        if (this.f404q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f404q = linearLayout;
            this.f405r = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f406s = (TextView) this.f404q.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f407t;
            if (i3 != 0) {
                this.f405r.setTextAppearance(getContext(), i3);
            }
            int i6 = this.f408u;
            if (i6 != 0) {
                this.f406s.setTextAppearance(getContext(), i6);
            }
        }
        this.f405r.setText(this.f399l);
        this.f406s.setText(this.f400m);
        boolean z5 = !TextUtils.isEmpty(this.f399l);
        boolean z6 = !TextUtils.isEmpty(this.f400m);
        int i7 = 0;
        this.f406s.setVisibility(z6 ? 0 : 8);
        LinearLayout linearLayout2 = this.f404q;
        if (!z5 && !z6) {
            i7 = 8;
        }
        linearLayout2.setVisibility(i7);
        if (this.f404q.getParent() == null) {
            addView(this.f404q);
        }
    }

    public final void e() {
        removeAllViews();
        this.f403p = null;
        this.f393f = null;
        this.f394g = null;
        View view = this.f402o;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: g */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.f2113a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        m mVar = this.f394g;
        if (mVar != null) {
            Configuration configuration2 = mVar.f657e.getResources().getConfiguration();
            int i3 = configuration2.screenWidthDp;
            int i6 = configuration2.screenHeightDp;
            mVar.f671s = (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || (i3 > 960 && i6 > 720) || (i3 > 720 && i6 > 960)) ? 5 : (i3 >= 500 || (i3 > 640 && i6 > 480) || (i3 > 480 && i6 > 640)) ? 4 : i3 >= 360 ? 3 : 2;
            o oVar = mVar.f658f;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f396i != null ? this.f391d.f500b : getVisibility();
    }

    public int getContentHeight() {
        return this.f395h;
    }

    public CharSequence getSubtitle() {
        return this.f400m;
    }

    public CharSequence getTitle() {
        return this.f399l;
    }

    /* renamed from: h */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f398k = false;
        }
        if (!this.f398k) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f398k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f398k = false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f397j = false;
        }
        if (!this.f397j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f397j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f397j = false;
        }
        return true;
    }

    /* renamed from: k */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            g1 g1Var = this.f396i;
            if (g1Var != null) {
                g1Var.b();
            }
            super.setVisibility(i3);
        }
    }

    public final g1 l(long j6, int i3) {
        g1 g1Var = this.f396i;
        if (g1Var != null) {
            g1Var.b();
        }
        a aVar = this.f391d;
        if (i3 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            g1 a6 = u0.a(this);
            a6.a(1.0f);
            a6.c(j6);
            aVar.f501c.f396i = a6;
            aVar.f500b = i3;
            a6.d(aVar);
            return a6;
        }
        g1 a7 = u0.a(this);
        a7.a(0.0f);
        a7.c(j6);
        aVar.f501c.f396i = a7;
        aVar.f500b = i3;
        a7.d(aVar);
        return a7;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f394g;
        if (mVar != null) {
            mVar.f();
            h hVar = this.f394g.w;
            if (hVar != null && hVar.b()) {
                hVar.f3094j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        boolean a6 = j4.a(this);
        int paddingRight = a6 ? (i7 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.f401n;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f401n.getLayoutParams();
            int i9 = a6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = a6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i11 = a6 ? paddingRight - i9 : paddingRight + i9;
            int j6 = j(this.f401n, i11, paddingTop, paddingTop2, a6) + i11;
            paddingRight = a6 ? j6 - i10 : j6 + i10;
        }
        LinearLayout linearLayout = this.f404q;
        if (!(linearLayout == null || this.f403p != null || linearLayout.getVisibility() == 8)) {
            paddingRight += j(this.f404q, paddingRight, paddingTop, paddingTop2, a6);
        }
        View view2 = this.f403p;
        if (view2 != null) {
            j(view2, paddingRight, paddingTop, paddingTop2, a6);
        }
        int paddingLeft = a6 ? getPaddingLeft() : (i7 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f393f;
        if (actionMenuView != null) {
            j(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a6);
        }
    }

    public final void onMeasure(int i3, int i6) {
        int i7 = 1073741824;
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i6) != 0) {
            int size = View.MeasureSpec.getSize(i3);
            int i8 = this.f395h;
            if (i8 <= 0) {
                i8 = View.MeasureSpec.getSize(i6);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i9 = i8 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
            View view = this.f401n;
            if (view != null) {
                int f6 = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f401n.getLayoutParams();
                paddingLeft = f6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f393f;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.f393f, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f404q;
            if (linearLayout != null && this.f403p == null) {
                if (this.f409v) {
                    this.f404q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f404q.getMeasuredWidth();
                    boolean z5 = measuredWidth <= paddingLeft;
                    if (z5) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f404q.setVisibility(z5 ? 0 : 8);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f403p;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i10 = layoutParams.width;
                int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i10 >= 0) {
                    paddingLeft = Math.min(i10, paddingLeft);
                }
                int i12 = layoutParams.height;
                if (i12 == -2) {
                    i7 = Integer.MIN_VALUE;
                }
                if (i12 >= 0) {
                    i9 = Math.min(i12, i9);
                }
                this.f403p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i7));
            }
            if (this.f395h <= 0) {
                int childCount = getChildCount();
                i8 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i8);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public void setContentHeight(int i3) {
        this.f395h = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f403p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f403p = view;
        if (!(view == null || (linearLayout = this.f404q) == null)) {
            removeView(linearLayout);
            this.f404q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f400m = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f399l = charSequence;
        d();
        u0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f409v) {
            requestLayout();
        }
        this.f409v = z5;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
