package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.i;
import androidx.activity.result.c;
import com.theori.dreamdrm.R;
import e.a;
import e.b;
import g.l;
import h.o;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import w4.p;
import x0.e0;
import x0.g0;
import x0.m;
import x0.u0;

public class Toolbar extends ViewGroup {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public ColorStateList D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final int[] I;
    public final c J;
    public ArrayList K;
    public final y3 L;
    public e4 M;
    public m N;
    public a4 O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final i T;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f473d;

    /* renamed from: e  reason: collision with root package name */
    public i1 f474e;

    /* renamed from: f  reason: collision with root package name */
    public i1 f475f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f476g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f477h;

    /* renamed from: i  reason: collision with root package name */
    public final Drawable f478i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f479j;

    /* renamed from: k  reason: collision with root package name */
    public c0 f480k;

    /* renamed from: l  reason: collision with root package name */
    public View f481l;

    /* renamed from: m  reason: collision with root package name */
    public Context f482m;

    /* renamed from: n  reason: collision with root package name */
    public int f483n;

    /* renamed from: o  reason: collision with root package name */
    public int f484o;

    /* renamed from: p  reason: collision with root package name */
    public int f485p;

    /* renamed from: q  reason: collision with root package name */
    public final int f486q;

    /* renamed from: r  reason: collision with root package name */
    public final int f487r;

    /* renamed from: s  reason: collision with root package name */
    public int f488s;

    /* renamed from: t  reason: collision with root package name */
    public int f489t;

    /* renamed from: u  reason: collision with root package name */
    public int f490u;

    /* renamed from: v  reason: collision with root package name */
    public int f491v;
    public y2 w;

    /* renamed from: x  reason: collision with root package name */
    public int f492x;

    /* renamed from: y  reason: collision with root package name */
    public int f493y;

    /* renamed from: z  reason: collision with root package name */
    public final int f494z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static b4 g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b4 ? new b4((b4) layoutParams) : layoutParams instanceof a ? new b4((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new b4((ViewGroup.MarginLayoutParams) layoutParams) : new b4(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new l(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return m.b(marginLayoutParams) + m.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        WeakHashMap weakHashMap = u0.f5622a;
        boolean z5 = e0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, e0.d(this));
        arrayList.clear();
        if (z5) {
            for (int i6 = childCount - 1; i6 >= 0; i6--) {
                View childAt = getChildAt(i6);
                b4 b4Var = (b4) childAt.getLayoutParams();
                if (b4Var.f528b == 0 && r(childAt)) {
                    int i7 = b4Var.f2275a;
                    WeakHashMap weakHashMap2 = u0.f5622a;
                    int d6 = e0.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, d6) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d6 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            b4 b4Var2 = (b4) childAt2.getLayoutParams();
            if (b4Var2.f528b == 0 && r(childAt2)) {
                int i9 = b4Var2.f2275a;
                WeakHashMap weakHashMap3 = u0.f5622a;
                int d7 = e0.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i9, d7) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d7 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b4 b4Var = layoutParams == null ? new b4() : !checkLayoutParams(layoutParams) ? g(layoutParams) : (b4) layoutParams;
        b4Var.f528b = 1;
        if (!z5 || this.f481l == null) {
            addView(view, b4Var);
            return;
        }
        view.setLayoutParams(b4Var);
        this.H.add(view);
    }

    public final void c() {
        if (this.f480k == null) {
            c0 c0Var = new c0(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f480k = c0Var;
            c0Var.setImageDrawable(this.f478i);
            this.f480k.setContentDescription(this.f479j);
            b4 b4Var = new b4();
            b4Var.f2275a = (this.f486q & 112) | 8388611;
            b4Var.f528b = 2;
            this.f480k.setLayoutParams(b4Var);
            this.f480k.setOnClickListener(new b(1, this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b4);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f473d;
        if (actionMenuView.f432s == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.O == null) {
                this.O = new a4(this);
            }
            this.f473d.setExpandedActionViewsExclusive(true);
            oVar.b(this.O, this.f482m);
            s();
        }
    }

    public final void e() {
        if (this.f473d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f473d = actionMenuView;
            actionMenuView.setPopupTheme(this.f483n);
            this.f473d.setOnMenuItemClickListener(this.L);
            ActionMenuView actionMenuView2 = this.f473d;
            y3 y3Var = new y3(this);
            actionMenuView2.f436x = null;
            actionMenuView2.f437y = y3Var;
            b4 b4Var = new b4();
            b4Var.f2275a = (this.f486q & 112) | 8388613;
            this.f473d.setLayoutParams(b4Var);
            b(this.f473d, false);
        }
    }

    public final void f() {
        if (this.f476g == null) {
            this.f476g = new c0(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            b4 b4Var = new b4();
            b4Var.f2275a = (this.f486q & 112) | 8388611;
            this.f476g.setLayoutParams(b4Var);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b4();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b4(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        c0 c0Var = this.f480k;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        c0 c0Var = this.f480k;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        y2 y2Var = this.w;
        if (y2Var != null) {
            return y2Var.f862g ? y2Var.f856a : y2Var.f857b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f493y;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        y2 y2Var = this.w;
        if (y2Var != null) {
            return y2Var.f856a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        y2 y2Var = this.w;
        if (y2Var != null) {
            return y2Var.f857b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        y2 y2Var = this.w;
        if (y2Var != null) {
            return y2Var.f862g ? y2Var.f857b : y2Var.f856a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f492x;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f432s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f473d
            r1 = 0
            if (r0 == 0) goto L_0x0011
            h.o r0 = r0.f432s
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f493y
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f492x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        e0 e0Var = this.f477h;
        if (e0Var != null) {
            return e0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        e0 e0Var = this.f477h;
        if (e0Var != null) {
            return e0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f473d.getMenu();
    }

    public View getNavButtonView() {
        return this.f476g;
    }

    public CharSequence getNavigationContentDescription() {
        c0 c0Var = this.f476g;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        c0 c0Var = this.f476g;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public m getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f473d.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f482m;
    }

    public int getPopupTheme() {
        return this.f483n;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public final TextView getSubtitleTextView() {
        return this.f475f;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.f491v;
    }

    public int getTitleMarginEnd() {
        return this.f489t;
    }

    public int getTitleMarginStart() {
        return this.f488s;
    }

    public int getTitleMarginTop() {
        return this.f490u;
    }

    public final TextView getTitleTextView() {
        return this.f474e;
    }

    public u1 getWrapper() {
        if (this.M == null) {
            this.M = new e4(this);
        }
        return this.M;
    }

    public final int h(View view, int i3) {
        b4 b4Var = (b4) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i7 = b4Var.f2275a & 112;
        if (!(i7 == 16 || i7 == 48 || i7 == 80)) {
            i7 = this.f494z & 112;
        }
        if (i7 == 48) {
            return getPaddingTop() - i6;
        }
        if (i7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - b4Var.bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i8 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = b4Var.topMargin;
        if (i8 < i9) {
            i8 = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i8) - paddingTop;
            int i11 = b4Var.bottomMargin;
            if (i10 < i11) {
                i8 = Math.max(0, i8 - (i11 - i10));
            }
        }
        return paddingTop + i8;
    }

    public void k(int i3) {
        getMenuInflater().inflate(i3, getMenu());
    }

    public final void l() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.J.f328f).iterator();
        if (!it2.hasNext()) {
            ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
            currentMenuItems2.removeAll(currentMenuItems);
            this.K = currentMenuItems2;
            return;
        }
        a2.m.o(it2.next());
        throw null;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    public final int n(View view, int i3, int i6, int[] iArr) {
        b4 b4Var = (b4) view.getLayoutParams();
        int i7 = b4Var.leftMargin - iArr[0];
        int max = Math.max(0, i7) + i3;
        iArr[0] = Math.max(0, -i7);
        int h6 = h(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h6, max + measuredWidth, view.getMeasuredHeight() + h6);
        return measuredWidth + b4Var.rightMargin + max;
    }

    public final int o(View view, int i3, int i6, int[] iArr) {
        b4 b4Var = (b4) view.getLayoutParams();
        int i7 = b4Var.rightMargin - iArr[1];
        int max = i3 - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int h6 = h(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h6, max, view.getMeasuredHeight() + h6);
        return max - (measuredWidth + b4Var.leftMargin);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        s();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288 A[LOOP:0: B:104:0x0286->B:105:0x0288, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a4 A[LOOP:1: B:107:0x02a2->B:108:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c3 A[LOOP:2: B:110:0x02c1->B:111:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0311 A[LOOP:3: B:118:0x030f->B:119:0x0311, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap r1 = x0.u0.f5622a
            int r1 = x0.e0.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.I
            r11[r2] = r3
            r11[r3] = r3
            int r12 = x0.d0.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.c0 r13 = r0.f476g
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x0055
            androidx.appcompat.widget.c0 r13 = r0.f476g
            if (r1 == 0) goto L_0x0050
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.n(r13, r6, r12, r11)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            androidx.appcompat.widget.c0 r15 = r0.f480k
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x006c
            androidx.appcompat.widget.c0 r15 = r0.f480k
            if (r1 == 0) goto L_0x0068
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f473d
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f473d
            if (r1 == 0) goto L_0x007d
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0081:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f481l
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f481l
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00bc:
            androidx.appcompat.widget.e0 r13 = r0.f477h
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00d1
            androidx.appcompat.widget.e0 r13 = r0.f477h
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00d1:
            androidx.appcompat.widget.i1 r13 = r0.f474e
            boolean r13 = r0.r(r13)
            androidx.appcompat.widget.i1 r14 = r0.f475f
            boolean r14 = r0.r(r14)
            if (r13 == 0) goto L_0x00f8
            androidx.appcompat.widget.i1 r15 = r0.f474e
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.b4 r15 = (androidx.appcompat.widget.b4) r15
            int r3 = r15.topMargin
            r23 = r7
            androidx.appcompat.widget.i1 r7 = r0.f474e
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r23 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            androidx.appcompat.widget.i1 r3 = r0.f475f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.b4 r3 = (androidx.appcompat.widget.b4) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.i1 r4 = r0.f475f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r22 = r12
            goto L_0x027a
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            androidx.appcompat.widget.i1 r3 = r0.f474e
            goto L_0x0129
        L_0x0127:
            androidx.appcompat.widget.i1 r3 = r0.f475f
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            androidx.appcompat.widget.i1 r4 = r0.f475f
            goto L_0x0130
        L_0x012e:
            androidx.appcompat.widget.i1 r4 = r0.f474e
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.b4 r3 = (androidx.appcompat.widget.b4) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.b4 r4 = (androidx.appcompat.widget.b4) r4
            if (r13 == 0) goto L_0x0146
            androidx.appcompat.widget.i1 r15 = r0.f474e
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            androidx.appcompat.widget.i1 r15 = r0.f475f
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.f494z
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x0197
            r6 = 80
            if (r15 == r6) goto L_0x018b
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f490u
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x0174
            r6 = r15
            goto L_0x0189
        L_0x0174:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.f491v
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0189
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0189:
            int r8 = r8 + r6
            goto L_0x01a4
        L_0x018b:
            r22 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f491v
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01a4
        L_0x0197:
            r22 = r12
            int r4 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.f490u
            int r8 = r4 + r3
        L_0x01a4:
            if (r1 == 0) goto L_0x0213
            if (r17 == 0) goto L_0x01ab
            int r1 = r0.f488s
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01e3
            androidx.appcompat.widget.i1 r1 = r0.f474e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.b4 r1 = (androidx.appcompat.widget.b4) r1
            androidx.appcompat.widget.i1 r3 = r0.f474e
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.i1 r4 = r0.f474e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i1 r5 = r0.f474e
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.f489t
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01e4
        L_0x01e3:
            r3 = r10
        L_0x01e4:
            if (r14 == 0) goto L_0x020a
            androidx.appcompat.widget.i1 r1 = r0.f475f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.b4 r1 = (androidx.appcompat.widget.b4) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.i1 r1 = r0.f475f
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.i1 r4 = r0.f475f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i1 r5 = r0.f475f
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.f489t
            int r1 = r10 - r1
            goto L_0x020b
        L_0x020a:
            r1 = r10
        L_0x020b:
            if (r17 == 0) goto L_0x027a
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x027a
        L_0x0213:
            if (r17 == 0) goto L_0x0218
            int r1 = r0.f488s
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x024e
            androidx.appcompat.widget.i1 r1 = r0.f474e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.b4 r1 = (androidx.appcompat.widget.b4) r1
            androidx.appcompat.widget.i1 r3 = r0.f474e
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.i1 r4 = r0.f474e
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i1 r5 = r0.f474e
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f489t
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x024f
        L_0x024e:
            r3 = r2
        L_0x024f:
            if (r14 == 0) goto L_0x0273
            androidx.appcompat.widget.i1 r1 = r0.f475f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.b4 r1 = (androidx.appcompat.widget.b4) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.i1 r1 = r0.f475f
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.i1 r4 = r0.f475f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.i1 r5 = r0.f475f
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.f489t
            int r1 = r1 + r4
            goto L_0x0274
        L_0x0273:
            r1 = r2
        L_0x0274:
            if (r17 == 0) goto L_0x027a
            int r2 = java.lang.Math.max(r3, r1)
        L_0x027a:
            java.util.ArrayList r1 = r0.G
            r3 = 3
            r0.a(r3, r1)
            int r3 = r1.size()
            r4 = r2
            r2 = 0
        L_0x0286:
            if (r2 >= r3) goto L_0x0297
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x0286
        L_0x0297:
            r12 = r22
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02a2:
            if (r3 >= r2) goto L_0x02b1
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.o(r5, r10, r12, r11)
            int r3 = r3 + 1
            goto L_0x02a2
        L_0x02b1:
            r3 = 1
            r0.a(r3, r1)
            r2 = 0
            r5 = r11[r2]
            r2 = r11[r3]
            int r3 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02c1:
            if (r5 >= r3) goto L_0x02f4
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.b4 r9 = (androidx.appcompat.widget.b4) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02c1
        L_0x02f4:
            r2 = 0
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r3 = r3 + r18
            int r5 = r6 / 2
            int r3 = r3 - r5
            int r6 = r6 + r3
            if (r3 >= r4) goto L_0x0304
            goto L_0x030b
        L_0x0304:
            if (r6 <= r10) goto L_0x030a
            int r6 = r6 - r10
            int r4 = r3 - r6
            goto L_0x030b
        L_0x030a:
            r4 = r3
        L_0x030b:
            int r3 = r1.size()
        L_0x030f:
            if (r2 >= r3) goto L_0x031e
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x030f
        L_0x031e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i3, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        char a6 = j4.a(this);
        char c6 = a6 ^ 1;
        int i14 = 0;
        if (r(this.f476g)) {
            q(this.f476g, i3, 0, i6, this.f487r);
            i9 = i(this.f476g) + this.f476g.getMeasuredWidth();
            i8 = Math.max(0, j(this.f476g) + this.f476g.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f476g.getMeasuredState());
        } else {
            i9 = 0;
            i8 = 0;
            i7 = 0;
        }
        if (r(this.f480k)) {
            q(this.f480k, i3, 0, i6, this.f487r);
            i9 = i(this.f480k) + this.f480k.getMeasuredWidth();
            i8 = Math.max(i8, j(this.f480k) + this.f480k.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f480k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9) + 0;
        int max2 = Math.max(0, currentContentInsetStart - i9);
        int[] iArr = this.I;
        iArr[a6] = max2;
        if (r(this.f473d)) {
            q(this.f473d, i3, max, i6, this.f487r);
            i10 = i(this.f473d) + this.f473d.getMeasuredWidth();
            i8 = Math.max(i8, j(this.f473d) + this.f473d.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f473d.getMeasuredState());
        } else {
            i10 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i10);
        iArr[c6] = Math.max(0, currentContentInsetEnd - i10);
        if (r(this.f481l)) {
            max3 += p(this.f481l, i3, max3, i6, 0, iArr);
            i8 = Math.max(i8, j(this.f481l) + this.f481l.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f481l.getMeasuredState());
        }
        if (r(this.f477h)) {
            max3 += p(this.f477h, i3, max3, i6, 0, iArr);
            i8 = Math.max(i8, j(this.f477h) + this.f477h.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f477h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((b4) childAt.getLayoutParams()).f528b == 0 && r(childAt)) {
                max3 += p(childAt, i3, max3, i6, 0, iArr);
                i8 = Math.max(i8, j(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        int i16 = this.f490u + this.f491v;
        int i17 = this.f488s + this.f489t;
        if (r(this.f474e)) {
            p(this.f474e, i3, max3 + i17, i6, i16, iArr);
            int i18 = i(this.f474e) + this.f474e.getMeasuredWidth();
            i11 = j(this.f474e) + this.f474e.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i7, this.f474e.getMeasuredState());
            i12 = i18;
        } else {
            i11 = 0;
            i13 = i7;
            i12 = 0;
        }
        if (r(this.f475f)) {
            i12 = Math.max(i12, p(this.f475f, i3, max3 + i17, i6, i11 + i16, iArr));
            i11 += j(this.f475f) + this.f475f.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, this.f475f.getMeasuredState());
        } else {
            int i19 = i13;
        }
        int max4 = Math.max(i8, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i12, getSuggestedMinimumWidth()), i3, -16777216 & i13);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, i13 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            int i20 = 0;
            while (true) {
                if (i20 >= childCount2) {
                    z5 = true;
                    break;
                }
                View childAt2 = getChildAt(i20);
                if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i20++;
            }
        }
        z5 = false;
        if (!z5) {
            i14 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof d4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d4 d4Var = (d4) parcelable;
        super.onRestoreInstanceState(d4Var.f2483d);
        ActionMenuView actionMenuView = this.f473d;
        o oVar = actionMenuView != null ? actionMenuView.f432s : null;
        int i3 = d4Var.f545f;
        if (!(i3 == 0 || this.O == null || oVar == null || (findItem = oVar.findItem(i3)) == null)) {
            findItem.expandActionView();
        }
        if (d4Var.f546g) {
            i iVar = this.T;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.y2 r0 = r2.w
            if (r0 != 0) goto L_0x000e
            androidx.appcompat.widget.y2 r0 = new androidx.appcompat.widget.y2
            r0.<init>()
            r2.w = r0
        L_0x000e:
            androidx.appcompat.widget.y2 r0 = r2.w
            r1 = 1
            if (r3 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r3 = r0.f862g
            if (r1 != r3) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r0.f862g = r1
            boolean r3 = r0.f863h
            if (r3 == 0) goto L_0x0040
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0032
            int r1 = r0.f859d
            if (r1 == r3) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            int r1 = r0.f860e
        L_0x002b:
            r0.f856a = r1
            int r1 = r0.f858c
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0032:
            int r1 = r0.f858c
            if (r1 == r3) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            int r1 = r0.f860e
        L_0x0039:
            r0.f856a = r1
            int r1 = r0.f859d
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0040:
            int r3 = r0.f860e
            r0.f856a = r3
        L_0x0044:
            int r1 = r0.f861f
        L_0x0046:
            r0.f857b = r1
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public final Parcelable onSaveInstanceState() {
        q qVar;
        d4 d4Var = new d4(super.onSaveInstanceState());
        a4 a4Var = this.O;
        if (!(a4Var == null || (qVar = a4Var.f509e) == null)) {
            d4Var.f545f = qVar.f3196a;
        }
        ActionMenuView actionMenuView = this.f473d;
        boolean z5 = false;
        if (actionMenuView != null) {
            m mVar = actionMenuView.w;
            if (mVar != null && mVar.j()) {
                z5 = true;
            }
        }
        d4Var.f546g = z5;
        return d4Var;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i6, int i7, int i8, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i9 = marginLayoutParams.leftMargin - iArr[0];
        int i10 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        iArr[1] = Math.max(0, -i10);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i3, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a6 = z3.a(this);
            a4 a4Var = this.O;
            boolean z5 = false;
            if (((a4Var == null || a4Var.f509e == null) ? false : true) && a6 != null) {
                WeakHashMap weakHashMap = u0.f5622a;
                if (g0.b(this) && this.S) {
                    z5 = true;
                }
            }
            if (z5 && this.R == null) {
                if (this.Q == null) {
                    this.Q = z3.b(new x3(this, 1));
                }
                z3.c(a6, this.Q);
            } else if (!z5 && (onBackInvokedDispatcher = this.R) != null) {
                z3.d(onBackInvokedDispatcher, this.Q);
                a6 = null;
            } else {
                return;
            }
            this.R = a6;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.S != z5) {
            this.S = z5;
            s();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(p.n(getContext(), i3));
    }

    public void setCollapsible(boolean z5) {
        this.P = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f493y) {
            this.f493y = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f492x) {
            this.f492x = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(p.n(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(p.n(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f476g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(c4 c4Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f473d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f483n != i3) {
            this.f483n = i3;
            if (i3 == 0) {
                this.f482m = getContext();
            } else {
                this.f482m = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f491v = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f489t = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f488s = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f490u = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f494z = 8388627;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new int[2];
        this.J = new c((Runnable) new x3(this, 0));
        this.K = new ArrayList();
        this.L = new y3(this);
        this.T = new i(3, this);
        Context context2 = getContext();
        int[] iArr = d.a.f2135x;
        m3 m6 = m3.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = m6.f686b;
        u0.k(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle);
        this.f484o = m6.i(28, 0);
        this.f485p = m6.i(19, 0);
        this.f494z = ((TypedArray) obj).getInteger(0, 8388627);
        this.f486q = ((TypedArray) obj).getInteger(2, 48);
        int c6 = m6.c(22, 0);
        c6 = m6.l(27) ? m6.c(27, c6) : c6;
        this.f491v = c6;
        this.f490u = c6;
        this.f489t = c6;
        this.f488s = c6;
        int c7 = m6.c(25, -1);
        if (c7 >= 0) {
            this.f488s = c7;
        }
        int c8 = m6.c(24, -1);
        if (c8 >= 0) {
            this.f489t = c8;
        }
        int c9 = m6.c(26, -1);
        if (c9 >= 0) {
            this.f490u = c9;
        }
        int c10 = m6.c(23, -1);
        if (c10 >= 0) {
            this.f491v = c10;
        }
        this.f487r = m6.d(13, -1);
        int c11 = m6.c(9, Integer.MIN_VALUE);
        int c12 = m6.c(5, Integer.MIN_VALUE);
        int d6 = m6.d(7, 0);
        int d7 = m6.d(8, 0);
        if (this.w == null) {
            this.w = new y2();
        }
        y2 y2Var = this.w;
        y2Var.f863h = false;
        if (d6 != Integer.MIN_VALUE) {
            y2Var.f860e = d6;
            y2Var.f856a = d6;
        }
        if (d7 != Integer.MIN_VALUE) {
            y2Var.f861f = d7;
            y2Var.f857b = d7;
        }
        if (!(c11 == Integer.MIN_VALUE && c12 == Integer.MIN_VALUE)) {
            y2Var.a(c11, c12);
        }
        this.f492x = m6.c(10, Integer.MIN_VALUE);
        this.f493y = m6.c(6, Integer.MIN_VALUE);
        this.f478i = m6.e(4);
        this.f479j = m6.k(3);
        CharSequence k6 = m6.k(21);
        if (!TextUtils.isEmpty(k6)) {
            setTitle(k6);
        }
        CharSequence k7 = m6.k(18);
        if (!TextUtils.isEmpty(k7)) {
            setSubtitle(k7);
        }
        this.f482m = getContext();
        setPopupTheme(m6.i(17, 0));
        Drawable e6 = m6.e(16);
        if (e6 != null) {
            setNavigationIcon(e6);
        }
        CharSequence k8 = m6.k(15);
        if (!TextUtils.isEmpty(k8)) {
            setNavigationContentDescription(k8);
        }
        Drawable e7 = m6.e(11);
        if (e7 != null) {
            setLogo(e7);
        }
        CharSequence k9 = m6.k(12);
        if (!TextUtils.isEmpty(k9)) {
            setLogoDescription(k9);
        }
        if (m6.l(29)) {
            setTitleTextColor(m6.b(29));
        }
        if (m6.l(20)) {
            setSubtitleTextColor(m6.b(20));
        }
        if (m6.l(14)) {
            k(m6.i(14, 0));
        }
        m6.o();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        c0 c0Var = this.f480k;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f480k.setImageDrawable(drawable);
            return;
        }
        c0 c0Var = this.f480k;
        if (c0Var != null) {
            c0Var.setImageDrawable(this.f478i);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f477h == null) {
                this.f477h = new e0(getContext(), (AttributeSet) null, 0);
            }
            if (!m(this.f477h)) {
                b(this.f477h, true);
            }
        } else {
            e0 e0Var = this.f477h;
            if (e0Var != null && m(e0Var)) {
                removeView(this.f477h);
                this.H.remove(this.f477h);
            }
        }
        e0 e0Var2 = this.f477h;
        if (e0Var2 != null) {
            e0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f477h == null) {
            this.f477h = new e0(getContext(), (AttributeSet) null, 0);
        }
        e0 e0Var = this.f477h;
        if (e0Var != null) {
            e0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        c0 c0Var = this.f476g;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
            f4.a(this.f476g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f476g)) {
                b(this.f476g, true);
            }
        } else {
            c0 c0Var = this.f476g;
            if (c0Var != null && m(c0Var)) {
                removeView(this.f476g);
                this.H.remove(this.f476g);
            }
        }
        c0 c0Var2 = this.f476g;
        if (c0Var2 != null) {
            c0Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f475f == null) {
                Context context = getContext();
                i1 i1Var = new i1(context, (AttributeSet) null);
                this.f475f = i1Var;
                i1Var.setSingleLine();
                this.f475f.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f485p;
                if (i3 != 0) {
                    this.f475f.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f475f.setTextColor(colorStateList);
                }
            }
            if (!m(this.f475f)) {
                b(this.f475f, true);
            }
        } else {
            i1 i1Var2 = this.f475f;
            if (i1Var2 != null && m(i1Var2)) {
                removeView(this.f475f);
                this.H.remove(this.f475f);
            }
        }
        i1 i1Var3 = this.f475f;
        if (i1Var3 != null) {
            i1Var3.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        i1 i1Var = this.f475f;
        if (i1Var != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f474e == null) {
                Context context = getContext();
                i1 i1Var = new i1(context, (AttributeSet) null);
                this.f474e = i1Var;
                i1Var.setSingleLine();
                this.f474e.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f484o;
                if (i3 != 0) {
                    this.f474e.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.f474e.setTextColor(colorStateList);
                }
            }
            if (!m(this.f474e)) {
                b(this.f474e, true);
            }
        } else {
            i1 i1Var2 = this.f474e;
            if (i1Var2 != null && m(i1Var2)) {
                removeView(this.f474e);
                this.H.remove(this.f474e);
            }
        }
        i1 i1Var3 = this.f474e;
        if (i1Var3 != null) {
            i1Var3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        i1 i1Var = this.f474e;
        if (i1Var != null) {
            i1Var.setTextColor(colorStateList);
        }
    }
}
