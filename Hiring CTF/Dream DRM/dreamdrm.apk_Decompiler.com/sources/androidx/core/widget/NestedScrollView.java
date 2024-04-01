package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.activity.result.c;
import b1.e;
import b1.i;
import b1.j;
import b1.k;
import b1.l;
import com.theori.dreamdrm.R;
import e.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.d0;
import x0.j0;
import x0.o;
import x0.q;
import x0.r;
import x0.u0;

public class NestedScrollView extends FrameLayout implements q {
    public static final float E = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final i F = new i();
    public static final int[] G = {16843130};
    public final r A;
    public final o B;
    public float C;
    public k D;

    /* renamed from: d  reason: collision with root package name */
    public final float f976d;

    /* renamed from: e  reason: collision with root package name */
    public long f977e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f978f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public OverScroller f979g;

    /* renamed from: h  reason: collision with root package name */
    public final EdgeEffect f980h;

    /* renamed from: i  reason: collision with root package name */
    public final EdgeEffect f981i;

    /* renamed from: j  reason: collision with root package name */
    public int f982j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f983k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f984l = false;

    /* renamed from: m  reason: collision with root package name */
    public View f985m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f986n = false;

    /* renamed from: o  reason: collision with root package name */
    public VelocityTracker f987o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f988p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f989q = true;

    /* renamed from: r  reason: collision with root package name */
    public int f990r;

    /* renamed from: s  reason: collision with root package name */
    public int f991s;

    /* renamed from: t  reason: collision with root package name */
    public int f992t;

    /* renamed from: u  reason: collision with root package name */
    public int f993u = -1;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f994v = new int[2];
    public final int[] w = new int[2];

    /* renamed from: x  reason: collision with root package name */
    public int f995x;

    /* renamed from: y  reason: collision with root package name */
    public int f996y;

    /* renamed from: z  reason: collision with root package name */
    public l f997z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        int i3 = Build.VERSION.SDK_INT;
        this.f980h = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f981i = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f976d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f979g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f990r = viewConfiguration.getScaledTouchSlop();
        this.f991s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f992t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A = new r();
        this.B = new o(this);
        setNestedScrollingEnabled(true);
        u0.l(this, F);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.C;
    }

    public static boolean m(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, view2);
    }

    public final void a(View view, View view2, int i3, int i6) {
        r rVar = this.A;
        if (i6 == 1) {
            rVar.f5607b = i3;
        } else {
            rVar.f5606a = i3;
        }
        w(2, i6);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, int i3) {
        r rVar = this.A;
        if (i3 == 1) {
            rVar.f5607b = 0;
        } else {
            rVar.f5606a = 0;
        }
        y(i3);
    }

    public final void c(View view, int i3, int i6, int[] iArr, int i7) {
        this.B.c(i3, i6, i7, iArr, (int[]) null);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r15 = this;
            android.widget.OverScroller r0 = r15.f979g
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r15.f979g
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r15.f979g
            int r0 = r0.getCurrY()
            int r1 = r15.f996y
            int r1 = r0 - r1
            int r2 = r15.getHeight()
            android.widget.EdgeEffect r3 = r15.f981i
            android.widget.EdgeEffect r4 = r15.f980h
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0046
            float r8 = com.bumptech.glide.c.o(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = com.bumptech.glide.c.y(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0063
            r4.finish()
            goto L_0x0063
        L_0x0046:
            if (r1 >= 0) goto L_0x0064
            float r8 = com.bumptech.glide.c.o(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = com.bumptech.glide.c.y(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0063
            r3.finish()
        L_0x0063:
            int r1 = r1 - r2
        L_0x0064:
            r15.f996y = r0
            int[] r0 = r15.w
            r2 = 1
            r13 = 0
            r0[r2] = r13
            r6 = 0
            r10 = 0
            r8 = 1
            x0.o r5 = r15.B
            r7 = r1
            r9 = r0
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r14 = r15.getScrollRange()
            if (r1 == 0) goto L_0x00a2
            int r5 = r15.getScrollY()
            int r6 = r15.getScrollX()
            r15.q(r1, r6, r5, r14)
            int r6 = r15.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r13
            int[] r10 = r15.f994v
            r11 = 1
            r6 = 0
            r8 = 0
            x0.o r5 = r15.B
            r9 = r1
            r12 = r0
            r5.e(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a2:
            if (r1 == 0) goto L_0x00dc
            int r0 = r15.getOverScrollMode()
            if (r0 == 0) goto L_0x00ae
            if (r0 != r2) goto L_0x00af
            if (r14 <= 0) goto L_0x00af
        L_0x00ae:
            r13 = r2
        L_0x00af:
            if (r13 == 0) goto L_0x00d4
            if (r1 >= 0) goto L_0x00c4
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d4
            android.widget.OverScroller r0 = r15.f979g
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d4
        L_0x00c4:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d4
            android.widget.OverScroller r0 = r15.f979g
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d4:
            android.widget.OverScroller r0 = r15.f979g
            r0.abortAnimation()
            r15.y(r2)
        L_0x00dc:
            android.widget.OverScroller r0 = r15.f979g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00ea
            java.util.WeakHashMap r0 = x0.u0.f5622a
            x0.d0.k(r15)
            goto L_0x00ed
        L_0x00ea:
            r15.y(r2)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d(View view, int i3, int i6, int i7, int i8, int i9, int[] iArr) {
        o(i8, i9, iArr);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return this.B.a(f6, f7, z5);
    }

    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return this.B.b(f6, f7);
    }

    public final boolean dispatchNestedPreScroll(int i3, int i6, int[] iArr, int[] iArr2) {
        return this.B.c(i3, i6, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i3, int i6, int i7, int i8, int[] iArr) {
        return this.B.e(i3, i6, i7, i8, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f980h;
        int i6 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft() + 0;
            } else {
                i3 = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i3, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = u0.f5622a;
                d0.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f981i;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (j.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i6 = 0 + getPaddingLeft();
            }
            if (j.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i6 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = u0.f5622a;
                d0.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i3, int i6, int i7, int i8, int i9) {
        o(i8, i9, (int[]) null);
    }

    public final boolean f(View view, View view2, int i3, int i6) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f978f;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (findFocus != null && findFocus.isFocused() && (!n(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        r rVar = this.A;
        return rVar.f5607b | rVar.f5606a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i6 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i7 = rect.bottom;
        if (i7 > i6 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i6) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i7 >= i6) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i6 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.B.f(0) != null;
    }

    public final void i() {
        this.f993u = -1;
        this.f986n = false;
        VelocityTracker velocityTracker = this.f987o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f987o = null;
        }
        y(0);
        this.f980h.onRelease();
        this.f981i.onRelease();
    }

    public final boolean isNestedScrollingEnabled() {
        return this.B.f5596d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f978f
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L_0x0061
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L_0x0061
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L_0x004c
            r6 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L_0x005f
            if (r6 == r5) goto L_0x005f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x00b9
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto L_0x00aa
            r1 = 20
            if (r0 == r1) goto L_0x009a
            r1 = 62
            if (r0 == r1) goto L_0x008f
            r6 = 92
            if (r0 == r6) goto L_0x00b0
            r6 = 93
            if (r0 == r6) goto L_0x00a0
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L_0x008b
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L_0x0096
            goto L_0x00b9
        L_0x008b:
            r5.r(r4)
            goto L_0x00b9
        L_0x008f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L_0x0096
            r3 = r4
        L_0x0096:
            r5.r(r3)
            goto L_0x00b9
        L_0x009a:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L_0x00a5
        L_0x00a0:
            boolean r2 = r5.l(r3)
            goto L_0x00b9
        L_0x00a5:
            boolean r2 = r5.g(r3)
            goto L_0x00b9
        L_0x00aa:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L_0x00b5
        L_0x00b0:
            boolean r2 = r5.l(r4)
            goto L_0x00b9
        L_0x00b5:
            boolean r2 = r5.g(r4)
        L_0x00b9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i3) {
        if (getChildCount() > 0) {
            this.f979g.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f996y = getScrollY();
            WeakHashMap weakHashMap = u0.f5622a;
            d0.k(this);
        }
    }

    public final boolean l(int i3) {
        int childCount;
        boolean z5 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f978f;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return s(i3, rect.top, rect.bottom);
    }

    public final void measureChild(View view, int i3, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i3, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i3, int i6) {
        Rect rect = this.f978f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i6;
    }

    public final void o(int i3, int i6, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.d(scrollY2, i3 - scrollY2, i6, iArr);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f984l = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        float f6;
        boolean z5 = false;
        if (motionEvent.getAction() != 8 || this.f986n) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            f6 = motionEvent.getAxisValue(9);
            i3 = (int) motionEvent.getX();
        } else {
            if ((motionEvent.getSource() & 4194304) == 4194304) {
                f6 = motionEvent.getAxisValue(26);
                i3 = getWidth() / 2;
            } else {
                i3 = 0;
                f6 = 0.0f;
            }
        }
        if (f6 == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (f6 * getVerticalScrollFactorCompat());
        if ((motionEvent.getSource() & 8194) == 8194) {
            z5 = true;
        }
        t(-verticalScrollFactorCompat, i3, 1, z5);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.f986n
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            r5 = -1
            if (r0 == r1) goto L_0x0083
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0083
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0139
        L_0x0020:
            r12.p(r13)
            goto L_0x0139
        L_0x0025:
            int r0 = r12.f993u
            if (r0 != r5) goto L_0x002b
            goto L_0x0139
        L_0x002b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L_0x004b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0139
        L_0x004b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.f982j
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f990r
            if (r3 <= r5) goto L_0x0139
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0139
            r12.f986n = r1
            r12.f982j = r0
            android.view.VelocityTracker r0 = r12.f987o
            if (r0 != 0) goto L_0x0071
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f987o = r0
        L_0x0071:
            android.view.VelocityTracker r0 = r12.f987o
            r0.addMovement(r13)
            r12.f995x = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0139
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0139
        L_0x0083:
            r12.f986n = r4
            r12.f993u = r5
            android.view.VelocityTracker r13 = r12.f987o
            if (r13 == 0) goto L_0x0090
            r13.recycle()
            r12.f987o = r3
        L_0x0090:
            android.widget.OverScroller r5 = r12.f979g
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00ac
            java.util.WeakHashMap r13 = x0.u0.f5622a
            x0.d0.k(r12)
        L_0x00ac:
            r12.y(r4)
            goto L_0x0139
        L_0x00b1:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e5
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e5
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e5
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e5
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e5
            r5 = r1
            goto L_0x00e6
        L_0x00e5:
            r5 = r4
        L_0x00e6:
            if (r5 != 0) goto L_0x0104
            boolean r13 = r12.x(r13)
            if (r13 != 0) goto L_0x00f8
            android.widget.OverScroller r13 = r12.f979g
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r1 = r4
        L_0x00f8:
            r12.f986n = r1
            android.view.VelocityTracker r13 = r12.f987o
            if (r13 == 0) goto L_0x0139
            r13.recycle()
            r12.f987o = r3
            goto L_0x0139
        L_0x0104:
            r12.f982j = r0
            int r0 = r13.getPointerId(r4)
            r12.f993u = r0
            android.view.VelocityTracker r0 = r12.f987o
            if (r0 != 0) goto L_0x0117
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f987o = r0
            goto L_0x011a
        L_0x0117:
            r0.clear()
        L_0x011a:
            android.view.VelocityTracker r0 = r12.f987o
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f979g
            r0.computeScrollOffset()
            boolean r13 = r12.x(r13)
            if (r13 != 0) goto L_0x0134
            android.widget.OverScroller r13 = r12.f979g
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r1 = r4
        L_0x0134:
            r12.f986n = r1
            r12.w(r2, r4)
        L_0x0139:
            boolean r13 = r12.f986n
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int i9;
        super.onLayout(z5, i3, i6, i7, i8);
        int i10 = 0;
        this.f983k = false;
        View view = this.f985m;
        if (view != null && m(view, this)) {
            View view2 = this.f985m;
            Rect rect = this.f978f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h6 = h(rect);
            if (h6 != 0) {
                scrollBy(0, h6);
            }
        }
        this.f985m = null;
        if (!this.f984l) {
            if (this.f997z != null) {
                scrollTo(getScrollX(), this.f997z.f1513d);
                this.f997z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i9 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i9 = 0;
            }
            int paddingTop = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i9 && scrollY >= 0) {
                i10 = paddingTop + scrollY > i9 ? i9 - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f984l = true;
    }

    public final void onMeasure(int i3, int i6) {
        super.onMeasure(i3, i6);
        if (this.f988p && View.MeasureSpec.getMode(i6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        k((int) f7);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    public final void onNestedPreScroll(View view, int i3, int i6, int[] iArr) {
        c(view, i3, i6, iArr, 0);
    }

    public final void onNestedScroll(View view, int i3, int i6, int i7, int i8) {
        o(i8, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    public final void onOverScrolled(int i3, int i6, boolean z5, boolean z6) {
        super.scrollTo(i3, i6);
    }

    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i3) : instance.findNextFocusFromRect(this, rect, i3);
        if (findNextFocus != null && !(true ^ n(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f997z = lVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f1513d = getScrollY();
        return lVar;
    }

    public final void onScrollChanged(int i3, int i6, int i7, int i8) {
        super.onScrollChanged(i3, i6, i7, i8);
        k kVar = this.D;
        if (kVar != null) {
            c cVar = (c) kVar;
            g.b(this, (View) cVar.f327e, (View) cVar.f328f);
        }
    }

    public final void onSizeChanged(int i3, int i6, int i7, int i8) {
        super.onSizeChanged(i3, i6, i7, i8);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && n(findFocus, 0, i8)) {
            Rect rect = this.f978f;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h6 = h(rect);
            if (h6 == 0) {
                return;
            }
            if (this.f989q) {
                v(0, h6, false);
            } else {
                scrollBy(0, h6);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        if (com.bumptech.glide.c.o(r6) == 0.0f) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0172, code lost:
        if (u(r6, r0) != false) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            android.view.VelocityTracker r0 = r13.f987o
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.f987o = r0
        L_0x000a:
            int r0 = r14.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x0013
            r13.f995x = r1
        L_0x0013:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r14)
            int r3 = r13.f995x
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 1
            r5 = 2
            if (r0 == 0) goto L_0x01ad
            android.widget.EdgeEffect r6 = r13.f981i
            android.widget.EdgeEffect r7 = r13.f980h
            if (r0 == r3) goto L_0x0139
            if (r0 == r5) goto L_0x007f
            r1 = 3
            if (r0 == r1) goto L_0x005a
            r1 = 5
            if (r0 == r1) goto L_0x0047
            r1 = 6
            if (r0 == r1) goto L_0x0035
            goto L_0x01e1
        L_0x0035:
            r13.p(r14)
            int r0 = r13.f993u
            int r0 = r14.findPointerIndex(r0)
            float r14 = r14.getY(r0)
            int r14 = (int) r14
            r13.f982j = r14
            goto L_0x01e1
        L_0x0047:
            int r0 = r14.getActionIndex()
            float r1 = r14.getY(r0)
            int r1 = (int) r1
            r13.f982j = r1
            int r14 = r14.getPointerId(r0)
            r13.f993u = r14
            goto L_0x01e1
        L_0x005a:
            boolean r14 = r13.f986n
            if (r14 == 0) goto L_0x01a9
            int r14 = r13.getChildCount()
            if (r14 <= 0) goto L_0x01a9
            android.widget.OverScroller r4 = r13.f979g
            int r5 = r13.getScrollX()
            int r6 = r13.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r13.getScrollRange()
            boolean r14 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r14 == 0) goto L_0x01a9
            java.util.WeakHashMap r14 = x0.u0.f5622a
            goto L_0x01a6
        L_0x007f:
            int r0 = r13.f993u
            int r0 = r14.findPointerIndex(r0)
            r5 = -1
            if (r0 != r5) goto L_0x00a4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid pointerId="
            r14.<init>(r0)
            int r0 = r13.f993u
            r14.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r14)
            goto L_0x01e1
        L_0x00a4:
            float r5 = r14.getY(r0)
            int r5 = (int) r5
            int r8 = r13.f982j
            int r8 = r8 - r5
            float r9 = r14.getX(r0)
            int r10 = r13.getWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            float r10 = (float) r8
            int r11 = r13.getHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            float r11 = com.bumptech.glide.c.o(r7)
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00d9
            float r6 = -r10
            float r6 = com.bumptech.glide.c.y(r7, r6, r9)
            float r6 = -r6
            float r9 = com.bumptech.glide.c.o(r7)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00d7
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x00f0
        L_0x00d7:
            r4 = r6
            goto L_0x00f4
        L_0x00d9:
            float r7 = com.bumptech.glide.c.o(r6)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00f4
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r9
            float r7 = com.bumptech.glide.c.y(r6, r10, r7)
            float r9 = com.bumptech.glide.c.o(r6)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00f3
        L_0x00f0:
            r6.onRelease()
        L_0x00f3:
            r4 = r7
        L_0x00f4:
            int r6 = r13.getHeight()
            float r6 = (float) r6
            float r4 = r4 * r6
            int r4 = java.lang.Math.round(r4)
            if (r4 == 0) goto L_0x0103
            r13.invalidate()
        L_0x0103:
            int r8 = r8 - r4
            boolean r4 = r13.f986n
            if (r4 != 0) goto L_0x0122
            int r4 = java.lang.Math.abs(r8)
            int r6 = r13.f990r
            if (r4 <= r6) goto L_0x0122
            android.view.ViewParent r4 = r13.getParent()
            if (r4 == 0) goto L_0x0119
            r4.requestDisallowInterceptTouchEvent(r3)
        L_0x0119:
            r13.f986n = r3
            int r4 = r13.f990r
            if (r8 <= 0) goto L_0x0121
            int r8 = r8 - r4
            goto L_0x0122
        L_0x0121:
            int r8 = r8 + r4
        L_0x0122:
            boolean r4 = r13.f986n
            if (r4 == 0) goto L_0x01e1
            float r14 = r14.getX(r0)
            int r14 = (int) r14
            int r14 = r13.t(r8, r14, r1, r1)
            int r5 = r5 - r14
            r13.f982j = r5
            int r0 = r13.f995x
            int r0 = r0 + r14
            r13.f995x = r0
            goto L_0x01e1
        L_0x0139:
            android.view.VelocityTracker r14 = r13.f987o
            int r0 = r13.f992t
            float r0 = (float) r0
            r5 = 1000(0x3e8, float:1.401E-42)
            r14.computeCurrentVelocity(r5, r0)
            int r0 = r13.f993u
            float r14 = r14.getYVelocity(r0)
            int r14 = (int) r14
            int r0 = java.lang.Math.abs(r14)
            int r5 = r13.f991s
            if (r0 < r5) goto L_0x018d
            float r0 = com.bumptech.glide.c.o(r7)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0165
            boolean r0 = r13.u(r7, r14)
            if (r0 == 0) goto L_0x0163
            r0 = r14
            r6 = r7
            goto L_0x0174
        L_0x0163:
            int r0 = -r14
            goto L_0x0178
        L_0x0165:
            float r0 = com.bumptech.glide.c.o(r6)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x017c
            int r0 = -r14
            boolean r1 = r13.u(r6, r0)
            if (r1 == 0) goto L_0x0178
        L_0x0174:
            r6.onAbsorb(r0)
            goto L_0x017b
        L_0x0178:
            r13.k(r0)
        L_0x017b:
            r1 = r3
        L_0x017c:
            if (r1 != 0) goto L_0x01a9
            int r14 = -r14
            float r0 = (float) r14
            boolean r1 = r13.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L_0x01a9
            r13.dispatchNestedFling(r4, r0, r3)
            r13.k(r14)
            goto L_0x01a9
        L_0x018d:
            android.widget.OverScroller r5 = r13.f979g
            int r6 = r13.getScrollX()
            int r7 = r13.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r13.getScrollRange()
            boolean r14 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r14 == 0) goto L_0x01a9
            java.util.WeakHashMap r14 = x0.u0.f5622a
        L_0x01a6:
            x0.d0.k(r13)
        L_0x01a9:
            r13.i()
            goto L_0x01e1
        L_0x01ad:
            int r0 = r13.getChildCount()
            if (r0 != 0) goto L_0x01b4
            return r1
        L_0x01b4:
            boolean r0 = r13.f986n
            if (r0 == 0) goto L_0x01c1
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x01c1
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x01c1:
            android.widget.OverScroller r0 = r13.f979g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d1
            android.widget.OverScroller r0 = r13.f979g
            r0.abortAnimation()
            r13.y(r3)
        L_0x01d1:
            float r0 = r14.getY()
            int r0 = (int) r0
            int r14 = r14.getPointerId(r1)
            r13.f982j = r0
            r13.f993u = r14
            r13.w(r5, r1)
        L_0x01e1:
            android.view.VelocityTracker r14 = r13.f987o
            if (r14 == 0) goto L_0x01e8
            r14.addMovement(r2)
        L_0x01e8:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f993u) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f982j = (int) motionEvent.getY(i3);
            this.f993u = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f987o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            x0.o r2 = r9.B
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f979g
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.q(int, int, int, int):boolean");
    }

    public final void r(int i3) {
        boolean z5 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f978f;
        if (z5) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i6 = rect.top;
        int i7 = height + i6;
        rect.bottom = i7;
        s(i3, i6, i7);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f983k) {
            Rect rect = this.f978f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h6 = h(rect);
            if (h6 != 0) {
                scrollBy(0, h6);
            }
        } else {
            this.f985m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h6 = h(rect);
        boolean z6 = h6 != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, h6);
            } else {
                v(0, h6, false);
            }
        }
        return z6;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f987o) != null) {
            velocityTracker.recycle();
            this.f987o = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public final void requestLayout() {
        this.f983k = true;
        super.requestLayout();
    }

    public final boolean s(int i3, int i6, int i7) {
        boolean z5;
        int i8 = i3;
        int i9 = i6;
        int i10 = i7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z6 = i8 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i9 < bottom && top < i10) {
                boolean z8 = i9 < top && bottom < i10;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8) {
                            if (!z9) {
                            }
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else if (!z9) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i9 < scrollY || i10 > i11) {
            t(z6 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z5 = true;
        } else {
            z5 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i8);
        }
        return z5;
    }

    public final void scrollTo(int i3, int i6) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i6 < 0) {
                i6 = 0;
            } else if (height + i6 > height2) {
                i6 = height2 - height;
            }
            if (i3 != getScrollX() || i6 != getScrollY()) {
                super.scrollTo(i3, i6);
            }
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f988p) {
            this.f988p = z5;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z5) {
        o oVar = this.B;
        if (oVar.f5596d) {
            WeakHashMap weakHashMap = u0.f5622a;
            j0.z(oVar.f5595c);
        }
        oVar.f5596d = z5;
    }

    public void setOnScrollChangeListener(k kVar) {
        this.D = kVar;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f989q = z5;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i3) {
        return w(i3, 0);
    }

    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t(int r21, int r22, int r23, boolean r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r10 = r23
            r11 = 1
            if (r10 != r11) goto L_0x000d
            r2 = 2
            r0.w(r2, r10)
        L_0x000d:
            r3 = 0
            int[] r6 = r0.w
            int[] r7 = r0.f994v
            x0.o r2 = r0.B
            r4 = r21
            r5 = r23
            boolean r2 = r2.c(r3, r4, r5, r6, r7)
            int[] r12 = r0.w
            r13 = 0
            int[] r14 = r0.f994v
            if (r2 == 0) goto L_0x002e
            r2 = r12[r11]
            int r2 = r21 - r2
            r3 = r14[r11]
            int r3 = r3 + r13
            r15 = r2
            r16 = r3
            goto L_0x0032
        L_0x002e:
            r15 = r21
            r16 = r13
        L_0x0032:
            int r9 = r20.getScrollY()
            int r8 = r20.getScrollRange()
            int r2 = r20.getOverScrollMode()
            if (r2 == 0) goto L_0x004b
            if (r2 != r11) goto L_0x0049
            int r2 = r20.getScrollRange()
            if (r2 <= 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = r13
            goto L_0x004c
        L_0x004b:
            r2 = r11
        L_0x004c:
            if (r2 == 0) goto L_0x0053
            if (r24 != 0) goto L_0x0053
            r17 = r11
            goto L_0x0055
        L_0x0053:
            r17 = r13
        L_0x0055:
            boolean r2 = r0.q(r15, r13, r9, r8)
            if (r2 == 0) goto L_0x006b
            x0.o r2 = r0.B
            android.view.ViewParent r2 = r2.f(r10)
            if (r2 == 0) goto L_0x0065
            r2 = r11
            goto L_0x0066
        L_0x0065:
            r2 = r13
        L_0x0066:
            if (r2 != 0) goto L_0x006b
            r18 = r11
            goto L_0x006d
        L_0x006b:
            r18 = r13
        L_0x006d:
            int r2 = r20.getScrollY()
            int r4 = r2 - r9
            int r6 = r15 - r4
            r12[r11] = r13
            int[] r7 = r0.f994v
            r3 = 0
            r5 = 0
            x0.o r2 = r0.B
            r13 = r8
            r8 = r23
            r19 = r9
            r9 = r12
            r2.e(r3, r4, r5, r6, r7, r8, r9)
            r2 = r14[r11]
            int r16 = r16 + r2
            r2 = r12[r11]
            int r15 = r15 - r2
            int r9 = r19 + r15
            android.widget.EdgeEffect r2 = r0.f981i
            android.widget.EdgeEffect r3 = r0.f980h
            if (r9 >= 0) goto L_0x00b3
            if (r17 == 0) goto L_0x00d4
            int r4 = -r15
            float r4 = (float) r4
            int r5 = r20.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r20.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            com.bumptech.glide.c.y(r3, r4, r1)
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto L_0x00d4
            r2.onRelease()
            goto L_0x00d4
        L_0x00b3:
            if (r9 <= r13) goto L_0x00d4
            if (r17 == 0) goto L_0x00d4
            float r4 = (float) r15
            int r5 = r20.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r20.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r1
            com.bumptech.glide.c.y(r2, r4, r5)
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto L_0x00d4
            r3.onRelease()
        L_0x00d4:
            boolean r1 = r3.isFinished()
            if (r1 == 0) goto L_0x00e4
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            r13 = r18
            goto L_0x00ea
        L_0x00e4:
            java.util.WeakHashMap r1 = x0.u0.f5622a
            x0.d0.k(r20)
            r13 = 0
        L_0x00ea:
            if (r13 == 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00f3
            android.view.VelocityTracker r1 = r0.f987o
            r1.clear()
        L_0x00f3:
            if (r10 != r11) goto L_0x00fe
            r0.y(r10)
            r3.onRelease()
            r2.onRelease()
        L_0x00fe:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.t(int, int, int, boolean):int");
    }

    public final boolean u(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float o5 = com.bumptech.glide.c.o(edgeEffect) * ((float) getHeight());
        float f6 = this.f976d * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i3)) * 0.35f) / f6));
        double d6 = (double) E;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * log) * ((double) f6))) < o5;
    }

    public final void v(int i3, int i6, boolean z5) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f977e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f979g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i6 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                if (z5) {
                    w(2, 1);
                } else {
                    y(1);
                }
                this.f996y = getScrollY();
                WeakHashMap weakHashMap = u0.f5622a;
                d0.k(this);
            } else {
                if (!this.f979g.isFinished()) {
                    this.f979g.abortAnimation();
                    y(1);
                }
                scrollBy(i3, i6);
            }
            this.f977e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean w(int i3, int i6) {
        return this.B.g(i3, i6);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f980h;
        if (com.bumptech.glide.c.o(edgeEffect) != 0.0f) {
            com.bumptech.glide.c.y(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f981i;
        if (com.bumptech.glide.c.o(edgeEffect2) == 0.0f) {
            return z5;
        }
        com.bumptech.glide.c.y(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void y(int i3) {
        this.B.h(i3);
    }

    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
