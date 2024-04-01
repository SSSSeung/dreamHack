package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.theori.dreamdrm.R;
import e.s;
import e.s0;
import h.o;
import java.util.WeakHashMap;
import q0.c;
import x0.d0;
import x0.e2;
import x0.h0;
import x0.h2;
import x0.j0;
import x0.p;
import x0.q;
import x0.r;
import x0.u0;
import x0.u1;
import x0.w1;
import x0.x1;
import x0.y1;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements t1, p, q {
    public static final int[] E = {R.attr.actionBarSize, 16842841};
    public final d A;
    public final e B;
    public final e C;
    public final r D;

    /* renamed from: d  reason: collision with root package name */
    public int f410d;

    /* renamed from: e  reason: collision with root package name */
    public int f411e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ContentFrameLayout f412f;

    /* renamed from: g  reason: collision with root package name */
    public ActionBarContainer f413g;

    /* renamed from: h  reason: collision with root package name */
    public u1 f414h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f415i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f416j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f417k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f418l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f419m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f420n;

    /* renamed from: o  reason: collision with root package name */
    public int f421o;

    /* renamed from: p  reason: collision with root package name */
    public int f422p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f423q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f424r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f425s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public h2 f426t;

    /* renamed from: u  reason: collision with root package name */
    public h2 f427u;

    /* renamed from: v  reason: collision with root package name */
    public h2 f428v;
    public h2 w;

    /* renamed from: x  reason: collision with root package name */
    public f f429x;

    /* renamed from: y  reason: collision with root package name */
    public OverScroller f430y;

    /* renamed from: z  reason: collision with root package name */
    public ViewPropertyAnimator f431z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        h2 h2Var = h2.f5571b;
        this.f426t = h2Var;
        this.f427u = h2Var;
        this.f428v = h2Var;
        this.w = h2Var;
        this.A = new d(0, this);
        this.B = new e(this, 0);
        this.C = new e(this, 1);
        j(context);
        this.D = new r();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z5) {
        boolean z6;
        int i3;
        g gVar = (g) frameLayout.getLayoutParams();
        int i6 = gVar.leftMargin;
        int i7 = rect.left;
        if (i6 != i7) {
            gVar.leftMargin = i7;
            z6 = true;
        } else {
            z6 = false;
        }
        int i8 = gVar.topMargin;
        int i9 = rect.top;
        if (i8 != i9) {
            gVar.topMargin = i9;
            z6 = true;
        }
        int i10 = gVar.rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            gVar.rightMargin = i11;
            z6 = true;
        }
        if (!z5 || gVar.bottomMargin == (i3 = rect.bottom)) {
            return z6;
        }
        gVar.bottomMargin = i3;
        return true;
    }

    public final void a(View view, View view2, int i3, int i6) {
        if (i6 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    public final void b(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(View view, int i3, int i6, int[] iArr, int i7) {
        if (i7 == 0) {
            onNestedPreScroll(view, i3, i6, iArr);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    public final void d(View view, int i3, int i6, int i7, int i8, int i9, int[] iArr) {
        e(view, i3, i6, i7, i8, i9);
    }

    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f415i != null && !this.f416j) {
            if (this.f413g.getVisibility() == 0) {
                i3 = (int) (this.f413g.getTranslationY() + ((float) this.f413g.getBottom()) + 0.5f);
            } else {
                i3 = 0;
            }
            this.f415i.setBounds(0, i3, getWidth(), this.f415i.getIntrinsicHeight() + i3);
            this.f415i.draw(canvas);
        }
    }

    public final void e(View view, int i3, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            onNestedScroll(view, i3, i6, i7, i8);
        }
    }

    public final boolean f(View view, View view2, int i3, int i6) {
        return i6 == 0 && onStartNestedScroll(view, view2, i3);
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f413g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        r rVar = this.D;
        return rVar.f5607b | rVar.f5606a;
    }

    public CharSequence getTitle() {
        l();
        return ((e4) this.f414h).f562a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        ViewPropertyAnimator viewPropertyAnimator = this.f431z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean i() {
        l();
        ActionMenuView actionMenuView = ((e4) this.f414h).f562a.f473d;
        if (actionMenuView == null) {
            return false;
        }
        m mVar = actionMenuView.w;
        return mVar != null && mVar.f();
    }

    public final void j(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        boolean z5 = false;
        this.f410d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f415i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z5 = true;
        }
        this.f416j = z5;
        this.f430y = new OverScroller(context);
    }

    public final void k(int i3) {
        l();
        if (i3 == 2) {
            ((e4) this.f414h).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i3 == 5) {
            ((e4) this.f414h).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i3 == 109) {
            setOverlayMode(true);
        }
    }

    public final void l() {
        u1 u1Var;
        if (this.f412f == null) {
            this.f412f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f413g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof u1) {
                u1Var = (u1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                u1Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f414h = u1Var;
        }
    }

    public final void m(o oVar, s sVar) {
        l();
        e4 e4Var = (e4) this.f414h;
        m mVar = e4Var.f574m;
        Toolbar toolbar = e4Var.f562a;
        if (mVar == null) {
            e4Var.f574m = new m(toolbar.getContext());
        }
        m mVar2 = e4Var.f574m;
        mVar2.f660h = sVar;
        if (oVar != null || toolbar.f473d != null) {
            toolbar.e();
            o oVar2 = toolbar.f473d.f432s;
            if (oVar2 != oVar) {
                if (oVar2 != null) {
                    oVar2.r(toolbar.N);
                    oVar2.r(toolbar.O);
                }
                if (toolbar.O == null) {
                    toolbar.O = new a4(toolbar);
                }
                mVar2.f672t = true;
                if (oVar != null) {
                    oVar.b(mVar2, toolbar.f482m);
                    oVar.b(toolbar.O, toolbar.f482m);
                } else {
                    mVar2.d(toolbar.f482m, (o) null);
                    toolbar.O.d(toolbar.f482m, (o) null);
                    mVar2.h();
                    toolbar.O.h();
                }
                toolbar.f473d.setPopupTheme(toolbar.f483n);
                toolbar.f473d.setPresenter(mVar2);
                toolbar.N = mVar2;
                toolbar.s();
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l();
        h2 h6 = h2.h(this, windowInsets);
        boolean g6 = g(this.f413g, new Rect(h6.c(), h6.e(), h6.d(), h6.b()), false);
        WeakHashMap weakHashMap = u0.f5622a;
        Rect rect = this.f423q;
        j0.b(this, h6, rect);
        int i3 = rect.left;
        int i6 = rect.top;
        int i7 = rect.right;
        int i8 = rect.bottom;
        e2 e2Var = h6.f5572a;
        h2 l6 = e2Var.l(i3, i6, i7, i8);
        this.f426t = l6;
        boolean z5 = true;
        if (!this.f427u.equals(l6)) {
            this.f427u = this.f426t;
            g6 = true;
        }
        Rect rect2 = this.f424r;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z5 = g6;
        }
        if (z5) {
            requestLayout();
        }
        return e2Var.a().f5572a.c().f5572a.b().g();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = gVar.leftMargin + paddingLeft;
                int i11 = gVar.topMargin + paddingTop;
                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
            }
        }
    }

    public final void onMeasure(int i3, int i6) {
        int i7;
        h2 h2Var;
        l();
        measureChildWithMargins(this.f413g, i3, 0, i6, 0);
        g gVar = (g) this.f413g.getLayoutParams();
        int max = Math.max(0, this.f413g.getMeasuredWidth() + gVar.leftMargin + gVar.rightMargin);
        int max2 = Math.max(0, this.f413g.getMeasuredHeight() + gVar.topMargin + gVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f413g.getMeasuredState());
        WeakHashMap weakHashMap = u0.f5622a;
        boolean z5 = (d0.g(this) & 256) != 0;
        if (z5) {
            i7 = this.f410d;
            if (this.f418l && this.f413g.getTabContainer() != null) {
                i7 += this.f410d;
            }
        } else {
            i7 = this.f413g.getVisibility() != 8 ? this.f413g.getMeasuredHeight() : 0;
        }
        Rect rect = this.f423q;
        Rect rect2 = this.f425s;
        rect2.set(rect);
        h2 h2Var2 = this.f426t;
        this.f428v = h2Var2;
        if (this.f417k || z5) {
            c b6 = c.b(h2Var2.c(), this.f428v.e() + i7, this.f428v.d(), this.f428v.b() + 0);
            h2 h2Var3 = this.f428v;
            int i8 = Build.VERSION.SDK_INT;
            y1 x1Var = i8 >= 30 ? new x1(h2Var3) : i8 >= 29 ? new w1(h2Var3) : new u1(h2Var3);
            x1Var.g(b6);
            h2Var = x1Var.b();
        } else {
            rect2.top += i7;
            rect2.bottom += 0;
            h2Var = h2Var2.f5572a.l(0, i7, 0, 0);
        }
        this.f428v = h2Var;
        g(this.f412f, rect2, true);
        if (!this.w.equals(this.f428v)) {
            h2 h2Var4 = this.f428v;
            this.w = h2Var4;
            ContentFrameLayout contentFrameLayout = this.f412f;
            WindowInsets g6 = h2Var4.g();
            if (g6 != null) {
                WindowInsets a6 = h0.a(contentFrameLayout, g6);
                if (!a6.equals(g6)) {
                    h2.h(contentFrameLayout, a6);
                }
            }
        }
        measureChildWithMargins(this.f412f, i3, 0, i6, 0);
        g gVar2 = (g) this.f412f.getLayoutParams();
        int max3 = Math.max(max, this.f412f.getMeasuredWidth() + gVar2.leftMargin + gVar2.rightMargin);
        int max4 = Math.max(max2, this.f412f.getMeasuredHeight() + gVar2.topMargin + gVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f412f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i6, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        boolean z6 = false;
        if (!this.f419m || !z5) {
            return false;
        }
        this.f430y.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f430y.getFinalY() > this.f413g.getHeight()) {
            z6 = true;
        }
        if (z6) {
            h();
            this.C.run();
        } else {
            h();
            this.B.run();
        }
        this.f420n = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i3, int i6, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i3, int i6, int i7, int i8) {
        int i9 = this.f421o + i6;
        this.f421o = i9;
        setActionBarHideOffset(i9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (e.s0) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            x0.r r1 = r0.D
            r1.f5606a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f421o = r1
            r0.h()
            androidx.appcompat.widget.f r1 = r0.f429x
            if (r1 == 0) goto L_0x001d
            e.s0 r1 = (e.s0) r1
            g.n r2 = r1.f2447y
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f2447y = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f413g.getVisibility() != 0) {
            return false;
        }
        return this.f419m;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f419m && !this.f420n) {
            if (this.f421o <= this.f413g.getHeight()) {
                h();
                postDelayed(this.B, 600);
                return;
            }
            h();
            postDelayed(this.C, 600);
        }
    }

    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        l();
        int i6 = this.f422p ^ i3;
        this.f422p = i3;
        boolean z5 = (i3 & 4) == 0;
        boolean z6 = (i3 & 256) != 0;
        f fVar = this.f429x;
        if (fVar != null) {
            ((s0) fVar).f2444u = !z6;
            if (z5 || !z6) {
                s0 s0Var = (s0) fVar;
                if (s0Var.f2445v) {
                    s0Var.f2445v = false;
                    s0Var.u(true);
                }
            } else {
                s0 s0Var2 = (s0) fVar;
                if (!s0Var2.f2445v) {
                    s0Var2.f2445v = true;
                    s0Var2.u(true);
                }
            }
        }
        if ((i6 & 256) != 0 && this.f429x != null) {
            WeakHashMap weakHashMap = u0.f5622a;
            h0.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f411e = i3;
        f fVar = this.f429x;
        if (fVar != null) {
            ((s0) fVar).f2443t = i3;
        }
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f413g.setTranslationY((float) (-Math.max(0, Math.min(i3, this.f413g.getHeight()))));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.f429x = fVar;
        if (getWindowToken() != null) {
            ((s0) this.f429x).f2443t = this.f411e;
            int i3 = this.f422p;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = u0.f5622a;
                h0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f418l = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f419m) {
            this.f419m = z5;
            if (!z5) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i3) {
        l();
        e4 e4Var = (e4) this.f414h;
        e4Var.f565d = i3 != 0 ? w4.p.n(e4Var.f562a.getContext(), i3) : null;
        e4Var.b();
    }

    public void setLogo(int i3) {
        l();
        e4 e4Var = (e4) this.f414h;
        e4Var.f566e = i3 != 0 ? w4.p.n(e4Var.f562a.getContext(), i3) : null;
        e4Var.b();
    }

    public void setOverlayMode(boolean z5) {
        this.f417k = z5;
        this.f416j = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        l();
        ((e4) this.f414h).f572k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        l();
        e4 e4Var = (e4) this.f414h;
        if (!e4Var.f568g) {
            e4Var.f569h = charSequence;
            if ((e4Var.f563b & 8) != 0) {
                Toolbar toolbar = e4Var.f562a;
                toolbar.setTitle(charSequence);
                if (e4Var.f568g) {
                    u0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        l();
        e4 e4Var = (e4) this.f414h;
        e4Var.f565d = drawable;
        e4Var.b();
    }
}
