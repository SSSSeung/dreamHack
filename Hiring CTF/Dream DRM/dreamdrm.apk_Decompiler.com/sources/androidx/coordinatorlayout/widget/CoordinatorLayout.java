package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.theori.dreamdrm.R;
import e.n0;
import g.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k.j;
import k0.a;
import l0.b;
import l0.c;
import l0.e;
import l0.f;
import l0.g;
import w0.d;
import x0.d0;
import x0.e0;
import x0.h0;
import x0.h2;
import x0.j0;
import x0.k;
import x0.p;
import x0.q;
import x0.r;
import x0.s;
import x0.u0;

public class CoordinatorLayout extends ViewGroup implements p, q {
    public static final d A = new d(12);
    public static final String w;

    /* renamed from: x  reason: collision with root package name */
    public static final Class[] f937x = {Context.class, AttributeSet.class};

    /* renamed from: y  reason: collision with root package name */
    public static final ThreadLocal f938y = new ThreadLocal();

    /* renamed from: z  reason: collision with root package name */
    public static final g f939z = new g(0);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f940d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final h f941e = new h(2);

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f942f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f943g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final int[] f944h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    public final int[] f945i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public boolean f946j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f947k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f948l;

    /* renamed from: m  reason: collision with root package name */
    public View f949m;

    /* renamed from: n  reason: collision with root package name */
    public View f950n;

    /* renamed from: o  reason: collision with root package name */
    public e f951o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f952p;

    /* renamed from: q  reason: collision with root package name */
    public h2 f953q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f954r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f955s;

    /* renamed from: t  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f956t;

    /* renamed from: u  reason: collision with root package name */
    public n0 f957u;

    /* renamed from: v  reason: collision with root package name */
    public final r f958v = new r();

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        w = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = a.f3900a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f948l = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr2 = this.f948l;
                iArr2[i3] = (int) (((float) iArr2[i3]) * f6);
            }
        }
        this.f955s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        WeakHashMap weakHashMap = u0.f5622a;
        if (d0.c(this) == 0) {
            d0.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) A.b();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i3, Rect rect, Rect rect2, l0.d dVar, int i6, int i7) {
        int i8 = dVar.f4055c;
        if (i8 == 0) {
            i8 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i3);
        int i9 = dVar.f4056d;
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        if ((i9 & 112) == 0) {
            i9 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, i3);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int i12 = absoluteGravity2 & 7;
        int i13 = absoluteGravity2 & 112;
        int width = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            width -= i6 / 2;
        } else if (i10 != 5) {
            width -= i6;
        }
        if (i11 == 16) {
            height -= i7 / 2;
        } else if (i11 != 80) {
            height -= i7;
        }
        rect2.set(width, height, i6 + width, i7 + height);
    }

    public static l0.d n(View view) {
        l0.d dVar = (l0.d) view.getLayoutParams();
        if (!dVar.f4054b) {
            b bVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    l0.a aVar = (l0.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    l0.a aVar2 = dVar.f4053a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f4053a = aVar;
                        dVar.f4054b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            dVar.f4054b = true;
        }
        return dVar;
    }

    public static void u(View view, int i3) {
        l0.d dVar = (l0.d) view.getLayoutParams();
        int i6 = dVar.f4061i;
        if (i6 != i3) {
            WeakHashMap weakHashMap = u0.f5622a;
            view.offsetLeftAndRight(i3 - i6);
            dVar.f4061i = i3;
        }
    }

    public static void v(View view, int i3) {
        l0.d dVar = (l0.d) view.getLayoutParams();
        int i6 = dVar.f4062j;
        if (i6 != i3) {
            WeakHashMap weakHashMap = u0.f5622a;
            view.offsetTopAndBottom(i3 - i6);
            dVar.f4062j = i3;
        }
    }

    public final void a(View view, View view2, int i3, int i6) {
        r rVar = this.f958v;
        if (i6 == 1) {
            rVar.f5607b = i3;
        } else {
            rVar.f5606a = i3;
        }
        this.f950n = view2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((l0.d) getChildAt(i7).getLayoutParams()).getClass();
        }
    }

    public final void b(View view, int i3) {
        r rVar = this.f958v;
        if (i3 == 1) {
            rVar.f5607b = 0;
        } else {
            rVar.f5606a = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            l0.d dVar = (l0.d) childAt.getLayoutParams();
            if (dVar.a(i3)) {
                l0.a aVar = dVar.f4053a;
                if (aVar != null) {
                    aVar.p(childAt, view, i3);
                }
                if (i3 == 0) {
                    dVar.f4066n = false;
                } else if (i3 == 1) {
                    dVar.f4067o = false;
                }
                dVar.getClass();
            }
        }
        this.f950n = null;
    }

    public final void c(View view, int i3, int i6, int[] iArr, int i7) {
        l0.a aVar;
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        boolean z5 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                int i11 = i7;
            } else {
                l0.d dVar = (l0.d) childAt.getLayoutParams();
                if (dVar.a(i7) && (aVar = dVar.f4053a) != null) {
                    int[] iArr2 = this.f944h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(childAt, view, i6, iArr2, i7);
                    i8 = i3 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
        if (z5) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof l0.d) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, int i3, int i6, int i7, int i8, int i9, int[] iArr) {
        l0.a aVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                int i13 = i9;
            } else {
                l0.d dVar = (l0.d) childAt.getLayoutParams();
                if (dVar.a(i9) && (aVar = dVar.f4053a) != null) {
                    int[] iArr2 = this.f944h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i6, i7, i8, iArr2);
                    i10 = i7 > 0 ? Math.max(i10, iArr2[0]) : Math.min(i10, iArr2[0]);
                    i11 = i8 > 0 ? Math.max(i11, iArr2[1]) : Math.min(i11, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (z5) {
            p(1);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        l0.a aVar = ((l0.d) view.getLayoutParams()).f4053a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f955s;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    public final void e(View view, int i3, int i6, int i7, int i8, int i9) {
        d(view, i3, i6, i7, i8, 0, this.f945i);
    }

    public final boolean f(View view, View view2, int i3, int i6) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                l0.d dVar = (l0.d) childAt.getLayoutParams();
                l0.a aVar = dVar.f4053a;
                if (aVar != null) {
                    boolean o5 = aVar.o(childAt, i3, i6);
                    z5 |= o5;
                    if (i6 == 0) {
                        dVar.f4066n = o5;
                    } else if (i6 == 1) {
                        dVar.f4067o = o5;
                    }
                } else if (i6 == 0) {
                    dVar.f4066n = false;
                } else if (i6 == 1) {
                    dVar.f4067o = false;
                }
            }
        }
        return z5;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new l0.d();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l0.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f940d);
    }

    public final h2 getLastWindowInsets() {
        return this.f953q;
    }

    public int getNestedScrollAxes() {
        r rVar = this.f958v;
        return rVar.f5607b | rVar.f5606a;
    }

    public Drawable getStatusBarBackground() {
        return this.f955s;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(l0.d dVar, Rect rect, int i3, int i6) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - dVar.bottomMargin));
        rect.set(max, max2, i3 + max, i6 + max2);
    }

    public final void i(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        h hVar = this.f941e;
        int i3 = ((j) hVar.f2728d).f3895f;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < i3; i6++) {
            ArrayList arrayList2 = (ArrayList) ((j) hVar.f2728d).l(i6);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((j) hVar.f2728d).h(i6));
            }
        }
        ArrayList arrayList3 = this.f943g;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = l0.h.f4073a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l0.h.f4073a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l0.h.a(this, view, matrix);
        ThreadLocal threadLocal3 = l0.h.f4074b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i3) {
        StringBuilder sb;
        int[] iArr = this.f948l;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i3);
        } else if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i3);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i3, int i6) {
        d dVar = A;
        Rect g6 = g();
        k(view, g6);
        try {
            return g6.contains(i3, i6);
        } finally {
            g6.setEmpty();
            dVar.a(g6);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f952p) {
            if (this.f951o == null) {
                this.f951o = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f951o);
        }
        if (this.f953q == null) {
            WeakHashMap weakHashMap = u0.f5622a;
            if (d0.b(this)) {
                h0.c(this);
            }
        }
        this.f947k = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f952p && this.f951o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f951o);
        }
        View view = this.f950n;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f947k = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f954r && this.f955s != null) {
            h2 h2Var = this.f953q;
            int e6 = h2Var != null ? h2Var.e() : 0;
            if (e6 > 0) {
                this.f955s.setBounds(0, 0, getWidth(), e6);
                this.f955s.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r5 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r5;
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        l0.a aVar;
        WeakHashMap weakHashMap = u0.f5622a;
        int d6 = e0.d(this);
        ArrayList arrayList = this.f940d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            if (view.getVisibility() != 8 && ((aVar = ((l0.d) view.getLayoutParams()).f4053a) == null || !aVar.g(this, view, d6))) {
                q(view, d6);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0197, code lost:
        if (r0.h(r32, r19, r25, r20, r26) == false) goto L_0x01b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r32.s()
            int r0 = r32.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r6.getChildAt(r1)
            g.h r4 = r6.f941e
            java.lang.Object r5 = r4.f2728d
            k.j r5 = (k.j) r5
            int r5 = r5.f3895f
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0034
            java.lang.Object r9 = r4.f2728d
            k.j r9 = (k.j) r9
            java.lang.Object r9 = r9.l(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = r2
            goto L_0x0035
        L_0x0031:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0034:
            r3 = r7
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = r2
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = r7
        L_0x003d:
            boolean r1 = r6.f952p
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6.f947k
            if (r0 == 0) goto L_0x005b
            l0.e r0 = r6.f951o
            if (r0 != 0) goto L_0x0052
            l0.e r0 = new l0.e
            r0.<init>((androidx.coordinatorlayout.widget.CoordinatorLayout) r6)
            r6.f951o = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            l0.e r1 = r6.f951o
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r6.f952p = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r6.f947k
            if (r0 == 0) goto L_0x006f
            l0.e r0 = r6.f951o
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            l0.e r1 = r6.f951o
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r6.f952p = r7
        L_0x0071:
            int r8 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r9 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap r3 = x0.u0.f5622a
            int r10 = x0.e0.d(r32)
            if (r10 != r2) goto L_0x008b
            r11 = r2
            goto L_0x008c
        L_0x008b:
            r11 = r7
        L_0x008c:
            int r12 = android.view.View.MeasureSpec.getMode(r33)
            int r13 = android.view.View.MeasureSpec.getSize(r33)
            int r14 = android.view.View.MeasureSpec.getMode(r34)
            int r15 = android.view.View.MeasureSpec.getSize(r34)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            x0.h2 r3 = r6.f953q
            if (r3 == 0) goto L_0x00b5
            boolean r3 = x0.d0.b(r32)
            if (r3 == 0) goto L_0x00b5
            r18 = r2
            goto L_0x00b7
        L_0x00b5:
            r18 = r7
        L_0x00b7:
            java.util.ArrayList r5 = r6.f940d
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r7
            r1 = r0
        L_0x00c1:
            if (r1 >= r4) goto L_0x01fa
            java.lang.Object r19 = r5.get(r1)
            android.view.View r19 = (android.view.View) r19
            int r7 = r19.getVisibility()
            r21 = r0
            r0 = 8
            if (r7 != r0) goto L_0x00e5
            r28 = r4
            r29 = r5
            r22 = r8
            r23 = r9
            r27 = r10
            r0 = r21
            r24 = 0
            r21 = r1
            goto L_0x01ea
        L_0x00e5:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            l0.d r7 = (l0.d) r7
            int r0 = r7.f4057e
            if (r0 < 0) goto L_0x0131
            if (r12 == 0) goto L_0x0131
            int r0 = r6.m(r0)
            r22 = r1
            int r1 = r7.f4055c
            if (r1 != 0) goto L_0x00ff
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00ff:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto L_0x010c
            if (r11 == 0) goto L_0x0111
        L_0x010c:
            r2 = 5
            if (r1 != r2) goto L_0x011d
            if (r11 == 0) goto L_0x011d
        L_0x0111:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0138
        L_0x011d:
            if (r1 != r2) goto L_0x0121
            if (r11 == 0) goto L_0x0126
        L_0x0121:
            r2 = 3
            if (r1 != r2) goto L_0x012f
            if (r11 == 0) goto L_0x012f
        L_0x0126:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0138
        L_0x012f:
            r2 = 0
            goto L_0x0136
        L_0x0131:
            r22 = r1
            r23 = r2
            goto L_0x012f
        L_0x0136:
            r20 = r2
        L_0x0138:
            if (r18 == 0) goto L_0x016b
            boolean r0 = x0.d0.b(r19)
            if (r0 != 0) goto L_0x016b
            x0.h2 r0 = r6.f953q
            int r0 = r0.c()
            x0.h2 r1 = r6.f953q
            int r1 = r1.d()
            int r1 = r1 + r0
            x0.h2 r0 = r6.f953q
            int r0 = r0.e()
            x0.h2 r2 = r6.f953q
            int r2 = r2.b()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r25 = r0
            r26 = r1
            goto L_0x016f
        L_0x016b:
            r25 = r33
            r26 = r34
        L_0x016f:
            l0.a r0 = r7.f4053a
            if (r0 == 0) goto L_0x019a
            r2 = r21
            r21 = r22
            r1 = r32
            r22 = r8
            r24 = 0
            r8 = r2
            r30 = r23
            r23 = r9
            r9 = r30
            r2 = r19
            r27 = r10
            r10 = r3
            r3 = r25
            r28 = r4
            r4 = r20
            r29 = r5
            r5 = r26
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01b1
        L_0x019a:
            r28 = r4
            r29 = r5
            r27 = r10
            r24 = 0
            r10 = r3
            r30 = r22
            r22 = r8
            r8 = r21
            r21 = r30
            r31 = r23
            r23 = r9
            r9 = r31
        L_0x01b1:
            r5 = 0
            r0 = r32
            r1 = r19
            r2 = r25
            r3 = r20
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01bf:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r3 = r0
            r0 = r2
            r2 = r1
        L_0x01ea:
            int r1 = r21 + 1
            r8 = r22
            r9 = r23
            r7 = r24
            r10 = r27
            r4 = r28
            r5 = r29
            goto L_0x00c1
        L_0x01fa:
            r8 = r0
            r9 = r2
            r10 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                l0.d dVar = (l0.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    l0.a aVar = dVar.f4053a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f6, float f7) {
        l0.a aVar;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                l0.d dVar = (l0.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f4053a) != null) {
                    z5 |= aVar.i(view);
                }
            }
        }
        return z5;
    }

    public final void onNestedPreScroll(View view, int i3, int i6, int[] iArr) {
        c(view, i3, i6, iArr, 0);
    }

    public final void onNestedScroll(View view, int i3, int i6, int i7, int i8) {
        e(view, i3, i6, i7, i8, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f2483d);
        SparseArray sparseArray = fVar.f4071f;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            l0.a aVar = n(childAt).f4053a;
            if (!(id == -1 || aVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable n5;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            l0.a aVar = ((l0.d) childAt.getLayoutParams()).f4053a;
            if (!(id == -1 || aVar == null || (n5 = aVar.n(childAt)) == null)) {
                sparseArray.append(id, n5);
            }
        }
        fVar.f4071f = sparseArray;
        return fVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f949m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f949m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            l0.d r6 = (l0.d) r6
            l0.a r6 = r6.f4053a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f949m
            boolean r6 = r6.q(r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f949m
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.t(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02c1 A[EDGE_INSN: B:122:0x02c1->B:111:0x02c1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r25) {
        /*
            r24 = this;
            r0 = r24
            java.util.WeakHashMap r1 = x0.u0.f5622a
            int r1 = x0.e0.d(r24)
            java.util.ArrayList r8 = r0.f940d
            int r9 = r8.size()
            android.graphics.Rect r10 = g()
            android.graphics.Rect r11 = g()
            android.graphics.Rect r12 = g()
            r2 = r25
            r14 = 0
        L_0x001d:
            w0.d r15 = A
            if (r14 >= r9) goto L_0x02c9
            java.lang.Object r3 = r8.get(r14)
            r7 = r3
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            r6 = r3
            l0.d r6 = (l0.d) r6
            if (r2 != 0) goto L_0x0043
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L_0x0043
            r4 = r25
            r6 = r2
            r5 = r8
            r3 = r9
            r21 = r14
            r2 = 0
            goto L_0x02c2
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 >= r14) goto L_0x0101
            java.lang.Object r2 = r8.get(r5)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r6.f4064l
            if (r3 != r2) goto L_0x00e9
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            r3 = r2
            l0.d r3 = (l0.d) r3
            android.view.View r2 = r3.f4063k
            if (r2 == 0) goto L_0x00e9
            android.graphics.Rect r2 = g()
            android.graphics.Rect r13 = g()
            r16 = r8
            android.graphics.Rect r8 = g()
            android.view.View r4 = r3.f4063k
            r0.k(r4, r2)
            r4 = 0
            r0.i(r7, r13, r4)
            int r4 = r7.getMeasuredWidth()
            r18 = r9
            int r9 = r7.getMeasuredHeight()
            r19 = r2
            r2 = r1
            r20 = r3
            r3 = r19
            r17 = r4
            r21 = r14
            r14 = 1
            r4 = r8
            r22 = r5
            r5 = r20
            r23 = r6
            r6 = r17
            r14 = r7
            r7 = r9
            l(r2, r3, r4, r5, r6, r7)
            int r2 = r8.left
            int r3 = r13.left
            if (r2 != r3) goto L_0x00a9
            int r2 = r8.top
            int r3 = r13.top
            if (r2 == r3) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            r3 = r17
            r2 = r20
            r4 = 0
            goto L_0x00ae
        L_0x00a9:
            r3 = r17
            r2 = r20
            r4 = 1
        L_0x00ae:
            r0.h(r2, r8, r3, r9)
            int r3 = r8.left
            int r5 = r13.left
            int r3 = r3 - r5
            int r5 = r8.top
            int r6 = r13.top
            int r5 = r5 - r6
            if (r3 == 0) goto L_0x00c2
            java.util.WeakHashMap r6 = x0.u0.f5622a
            r14.offsetLeftAndRight(r3)
        L_0x00c2:
            if (r5 == 0) goto L_0x00c9
            java.util.WeakHashMap r3 = x0.u0.f5622a
            r14.offsetTopAndBottom(r5)
        L_0x00c9:
            if (r4 == 0) goto L_0x00d4
            l0.a r3 = r2.f4053a
            if (r3 == 0) goto L_0x00d4
            android.view.View r2 = r2.f4063k
            r3.d(r0, r14, r2)
        L_0x00d4:
            r19.setEmpty()
            r2 = r19
            r15.a(r2)
            r13.setEmpty()
            r15.a(r13)
            r8.setEmpty()
            r15.a(r8)
            goto L_0x00f4
        L_0x00e9:
            r22 = r5
            r23 = r6
            r16 = r8
            r18 = r9
            r21 = r14
            r14 = r7
        L_0x00f4:
            int r5 = r22 + 1
            r7 = r14
            r8 = r16
            r9 = r18
            r14 = r21
            r6 = r23
            goto L_0x0044
        L_0x0101:
            r23 = r6
            r16 = r8
            r18 = r9
            r21 = r14
            r2 = 1
            r14 = r7
            r0.i(r14, r11, r2)
            r3 = r23
            int r4 = r3.f4059g
            r5 = 48
            r6 = 80
            r7 = 3
            r8 = 5
            if (r4 == 0) goto L_0x0168
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L_0x0168
            int r4 = r3.f4059g
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r1)
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 == r5) goto L_0x013d
            if (r9 == r6) goto L_0x012d
            goto L_0x0147
        L_0x012d:
            int r9 = r10.bottom
            int r13 = r24.getHeight()
            int r2 = r11.top
            int r13 = r13 - r2
            int r2 = java.lang.Math.max(r9, r13)
            r10.bottom = r2
            goto L_0x0147
        L_0x013d:
            int r2 = r10.top
            int r9 = r11.bottom
            int r2 = java.lang.Math.max(r2, r9)
            r10.top = r2
        L_0x0147:
            r2 = r4 & 7
            if (r2 == r7) goto L_0x015e
            if (r2 == r8) goto L_0x014e
            goto L_0x0168
        L_0x014e:
            int r2 = r10.right
            int r4 = r24.getWidth()
            int r9 = r11.left
            int r4 = r4 - r9
            int r2 = java.lang.Math.max(r2, r4)
            r10.right = r2
            goto L_0x0168
        L_0x015e:
            int r2 = r10.left
            int r4 = r11.right
            int r2 = java.lang.Math.max(r2, r4)
            r10.left = r2
        L_0x0168:
            int r2 = r3.f4060h
            if (r2 == 0) goto L_0x027a
            int r2 = r14.getVisibility()
            if (r2 != 0) goto L_0x027a
            java.util.WeakHashMap r2 = x0.u0.f5622a
            boolean r2 = x0.g0.c(r14)
            if (r2 != 0) goto L_0x017c
            goto L_0x027a
        L_0x017c:
            int r2 = r14.getWidth()
            if (r2 <= 0) goto L_0x027a
            int r2 = r14.getHeight()
            if (r2 > 0) goto L_0x018a
            goto L_0x027a
        L_0x018a:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            l0.d r2 = (l0.d) r2
            l0.a r3 = r2.f4053a
            android.graphics.Rect r4 = g()
            android.graphics.Rect r9 = g()
            int r13 = r14.getLeft()
            int r8 = r14.getTop()
            int r7 = r14.getRight()
            int r6 = r14.getBottom()
            r9.set(r13, r8, r7, r6)
            if (r3 == 0) goto L_0x01e0
            boolean r3 = r3.a(r14)
            if (r3 == 0) goto L_0x01e0
            boolean r3 = r9.contains(r4)
            if (r3 == 0) goto L_0x01bc
            goto L_0x01e3
        L_0x01bc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r4.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01e0:
            r4.set(r9)
        L_0x01e3:
            r9.setEmpty()
            r15.a(r9)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x01f7
            r4.setEmpty()
            r15.a(r4)
            goto L_0x027a
        L_0x01f7:
            int r3 = r2.f4060h
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r1)
            r6 = r3 & 48
            if (r6 != r5) goto L_0x0213
            int r5 = r4.top
            int r6 = r2.topMargin
            int r5 = r5 - r6
            int r6 = r2.f4062j
            int r5 = r5 - r6
            int r6 = r10.top
            if (r5 >= r6) goto L_0x0213
            int r6 = r6 - r5
            v(r14, r6)
            r5 = 1
            goto L_0x0214
        L_0x0213:
            r5 = 0
        L_0x0214:
            r6 = r3 & 80
            r7 = 80
            if (r6 != r7) goto L_0x0230
            int r6 = r24.getHeight()
            int r7 = r4.bottom
            int r6 = r6 - r7
            int r7 = r2.bottomMargin
            int r6 = r6 - r7
            int r7 = r2.f4062j
            int r6 = r6 + r7
            int r7 = r10.bottom
            if (r6 >= r7) goto L_0x0230
            int r6 = r6 - r7
            v(r14, r6)
            r5 = 1
        L_0x0230:
            if (r5 != 0) goto L_0x0236
            r5 = 0
            v(r14, r5)
        L_0x0236:
            r5 = r3 & 3
            r6 = 3
            if (r5 != r6) goto L_0x024d
            int r5 = r4.left
            int r6 = r2.leftMargin
            int r5 = r5 - r6
            int r6 = r2.f4061i
            int r5 = r5 - r6
            int r6 = r10.left
            if (r5 >= r6) goto L_0x024d
            int r6 = r6 - r5
            u(r14, r6)
            r5 = 1
            goto L_0x024e
        L_0x024d:
            r5 = 0
        L_0x024e:
            r3 = r3 & 5
            r6 = 5
            if (r3 != r6) goto L_0x026b
            int r3 = r24.getWidth()
            int r6 = r4.right
            int r3 = r3 - r6
            int r6 = r2.rightMargin
            int r3 = r3 - r6
            int r2 = r2.f4061i
            int r3 = r3 + r2
            int r2 = r10.right
            if (r3 >= r2) goto L_0x026b
            int r3 = r3 - r2
            u(r14, r3)
            r17 = 1
            goto L_0x026d
        L_0x026b:
            r17 = r5
        L_0x026d:
            r2 = 0
            if (r17 != 0) goto L_0x0273
            u(r14, r2)
        L_0x0273:
            r4.setEmpty()
            r15.a(r4)
            goto L_0x027b
        L_0x027a:
            r2 = 0
        L_0x027b:
            r3 = 2
            r4 = r25
            if (r4 == r3) goto L_0x02a1
            android.view.ViewGroup$LayoutParams r3 = r14.getLayoutParams()
            l0.d r3 = (l0.d) r3
            android.graphics.Rect r3 = r3.f4068p
            r12.set(r3)
            boolean r3 = r12.equals(r11)
            if (r3 == 0) goto L_0x0296
            r5 = r16
            r3 = r18
            goto L_0x02c1
        L_0x0296:
            android.view.ViewGroup$LayoutParams r3 = r14.getLayoutParams()
            l0.d r3 = (l0.d) r3
            android.graphics.Rect r3 = r3.f4068p
            r3.set(r11)
        L_0x02a1:
            int r14 = r21 + 1
            r3 = r18
        L_0x02a5:
            r5 = r16
            if (r14 >= r3) goto L_0x02c1
            java.lang.Object r6 = r5.get(r14)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            l0.d r7 = (l0.d) r7
            l0.a r7 = r7.f4053a
            if (r7 == 0) goto L_0x02bc
            r7.b(r6)
        L_0x02bc:
            int r14 = r14 + 1
            r16 = r5
            goto L_0x02a5
        L_0x02c1:
            r6 = r4
        L_0x02c2:
            int r14 = r21 + 1
            r9 = r3
            r8 = r5
            r2 = r6
            goto L_0x001d
        L_0x02c9:
            r10.setEmpty()
            r15.a(r10)
            r11.setEmpty()
            r15.a(r11)
            r12.setEmpty()
            r15.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i3) {
        l0.d dVar = (l0.d) view.getLayoutParams();
        View view2 = dVar.f4063k;
        int i6 = 0;
        if (!(view2 == null && dVar.f4058f != -1)) {
            d dVar2 = A;
            if (view2 != null) {
                Rect g6 = g();
                Rect g7 = g();
                try {
                    k(view2, g6);
                    l0.d dVar3 = (l0.d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i3, g6, g7, dVar3, measuredWidth, measuredHeight);
                    h(dVar3, g7, measuredWidth, measuredHeight);
                    view.layout(g7.left, g7.top, g7.right, g7.bottom);
                } finally {
                    g6.setEmpty();
                    dVar2.a(g6);
                    g7.setEmpty();
                    dVar2.a(g7);
                }
            } else {
                int i7 = dVar.f4057e;
                if (i7 >= 0) {
                    l0.d dVar4 = (l0.d) view.getLayoutParams();
                    int i8 = dVar4.f4055c;
                    if (i8 == 0) {
                        i8 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i8, i3);
                    int i9 = absoluteGravity & 7;
                    int i10 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i3 == 1) {
                        i7 = width - i7;
                    }
                    int m6 = m(i7) - measuredWidth2;
                    if (i9 == 1) {
                        m6 += measuredWidth2 / 2;
                    } else if (i9 == 5) {
                        m6 += measuredWidth2;
                    }
                    if (i10 == 16) {
                        i6 = 0 + (measuredHeight2 / 2);
                    } else if (i10 == 80) {
                        i6 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + dVar4.leftMargin, Math.min(m6, ((width - getPaddingRight()) - measuredWidth2) - dVar4.rightMargin));
                    int max2 = Math.max(getPaddingTop() + dVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - dVar4.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                l0.d dVar5 = (l0.d) view.getLayoutParams();
                Rect g8 = g();
                g8.set(getPaddingLeft() + dVar5.leftMargin, getPaddingTop() + dVar5.topMargin, (getWidth() - getPaddingRight()) - dVar5.rightMargin, (getHeight() - getPaddingBottom()) - dVar5.bottomMargin);
                if (this.f953q != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    if (d0.b(this) && !d0.b(view)) {
                        g8.left = this.f953q.c() + g8.left;
                        g8.top = this.f953q.e() + g8.top;
                        g8.right -= this.f953q.d();
                        g8.bottom -= this.f953q.b();
                    }
                }
                Rect g9 = g();
                int i11 = dVar5.f4055c;
                if ((i11 & 7) == 0) {
                    i11 |= 8388611;
                }
                if ((i11 & 112) == 0) {
                    i11 |= 48;
                }
                k.b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), g8, g9, i3);
                view.layout(g9.left, g9.top, g9.right, g9.bottom);
                g8.setEmpty();
                dVar2.a(g8);
                g9.setEmpty();
                dVar2.a(g9);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean r(MotionEvent motionEvent, int i3) {
        boolean z5;
        MotionEvent motionEvent2 = motionEvent;
        int i6 = i3;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f942f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        g gVar = f939z;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z6 = false;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            l0.d dVar = (l0.d) view.getLayoutParams();
            l0.a aVar = dVar.f4053a;
            if ((!z6 && !z7) || actionMasked == 0) {
                if (!z6 && aVar != null) {
                    if (i6 == 0) {
                        z6 = aVar.f(this, view, motionEvent2);
                    } else if (i6 == 1) {
                        z6 = aVar.q(view, motionEvent2);
                    }
                    if (z6) {
                        this.f949m = view;
                    }
                }
                if (dVar.f4053a == null) {
                    dVar.f4065m = false;
                }
                boolean z8 = dVar.f4065m;
                if (z8) {
                    z5 = true;
                } else {
                    z5 = z8 | false;
                    dVar.f4065m = z5;
                }
                z7 = z5 && !z8;
                if (z5 && !z7) {
                    break;
                }
            } else if (aVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i6 == 0) {
                    aVar.f(this, view, motionEvent3);
                } else if (i6 == 1) {
                    aVar.q(view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z6;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        l0.a aVar = ((l0.d) view.getLayoutParams()).f4053a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z5);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (z5 && !this.f946j) {
            t(false);
            this.f946j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r10 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0173 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r15 = this;
            java.util.ArrayList r0 = r15.f940d
            r0.clear()
            g.h r1 = r15.f941e
            java.lang.Object r2 = r1.f2728d
            k.j r2 = (k.j) r2
            int r2 = r2.f3895f
            r3 = 0
            r4 = r3
        L_0x000f:
            java.lang.Object r5 = r1.f2725a
            if (r4 >= r2) goto L_0x002a
            java.lang.Object r6 = r1.f2728d
            k.j r6 = (k.j) r6
            java.lang.Object r6 = r6.l(r4)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 == 0) goto L_0x0027
            r6.clear()
            w0.c r5 = (w0.c) r5
            r5.a(r6)
        L_0x0027:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002a:
            java.lang.Object r2 = r1.f2728d
            k.j r2 = (k.j) r2
            r2.clear()
            int r2 = r15.getChildCount()
            r4 = r3
        L_0x0036:
            if (r4 >= r2) goto L_0x019f
            android.view.View r6 = r15.getChildAt(r4)
            l0.d r7 = n(r6)
            r8 = 0
            r9 = 1
            r10 = -1
            int r11 = r7.f4058f
            if (r11 != r10) goto L_0x004d
            r7.f4064l = r8
            r7.f4063k = r8
            goto L_0x00c7
        L_0x004d:
            android.view.View r10 = r7.f4063k
            if (r10 == 0) goto L_0x007c
            int r10 = r10.getId()
            if (r10 == r11) goto L_0x0058
            goto L_0x0075
        L_0x0058:
            android.view.View r10 = r7.f4063k
            android.view.ViewParent r12 = r10.getParent()
        L_0x005e:
            if (r12 == r15) goto L_0x0077
            if (r12 == 0) goto L_0x0071
            if (r12 != r6) goto L_0x0065
            goto L_0x0071
        L_0x0065:
            boolean r13 = r12 instanceof android.view.View
            if (r13 == 0) goto L_0x006c
            r10 = r12
            android.view.View r10 = (android.view.View) r10
        L_0x006c:
            android.view.ViewParent r12 = r12.getParent()
            goto L_0x005e
        L_0x0071:
            r7.f4064l = r8
            r7.f4063k = r8
        L_0x0075:
            r10 = r3
            goto L_0x007a
        L_0x0077:
            r7.f4064l = r10
            r10 = r9
        L_0x007a:
            if (r10 != 0) goto L_0x00c7
        L_0x007c:
            android.view.View r10 = r15.findViewById(r11)
            r7.f4063k = r10
            if (r10 == 0) goto L_0x00bd
            if (r10 != r15) goto L_0x0095
            boolean r10 = r15.isInEditMode()
            if (r10 == 0) goto L_0x008d
            goto L_0x00c3
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            android.view.ViewParent r11 = r10.getParent()
        L_0x0099:
            if (r11 == r15) goto L_0x00ba
            if (r11 == 0) goto L_0x00ba
            if (r11 != r6) goto L_0x00ae
            boolean r10 = r15.isInEditMode()
            if (r10 == 0) goto L_0x00a6
            goto L_0x00c3
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L_0x00b5
            r10 = r11
            android.view.View r10 = (android.view.View) r10
        L_0x00b5:
            android.view.ViewParent r11 = r11.getParent()
            goto L_0x0099
        L_0x00ba:
            r7.f4064l = r10
            goto L_0x00c7
        L_0x00bd:
            boolean r10 = r15.isInEditMode()
            if (r10 == 0) goto L_0x017b
        L_0x00c3:
            r7.f4064l = r8
            r7.f4063k = r8
        L_0x00c7:
            java.lang.Object r10 = r1.f2728d
            k.j r10 = (k.j) r10
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x00d8
            java.lang.Object r10 = r1.f2728d
            k.j r10 = (k.j) r10
            r10.put(r6, r8)
        L_0x00d8:
            r10 = r3
        L_0x00d9:
            if (r10 >= r2) goto L_0x0177
            if (r10 != r4) goto L_0x00df
            goto L_0x0173
        L_0x00df:
            android.view.View r11 = r15.getChildAt(r10)
            android.view.View r12 = r7.f4064l
            if (r11 == r12) goto L_0x0112
            java.util.WeakHashMap r12 = x0.u0.f5622a
            int r12 = x0.e0.d(r15)
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            l0.d r13 = (l0.d) r13
            int r13 = r13.f4059g
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r12)
            if (r13 == 0) goto L_0x0106
            int r14 = r7.f4060h
            int r12 = android.view.Gravity.getAbsoluteGravity(r14, r12)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x0106
            r12 = r9
            goto L_0x0107
        L_0x0106:
            r12 = r3
        L_0x0107:
            if (r12 != 0) goto L_0x0112
            l0.a r12 = r7.f4053a
            if (r12 == 0) goto L_0x0110
            r12.b(r6)
        L_0x0110:
            r12 = r3
            goto L_0x0113
        L_0x0112:
            r12 = r9
        L_0x0113:
            if (r12 == 0) goto L_0x0173
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            boolean r12 = r12.containsKey(r11)
            if (r12 != 0) goto L_0x0130
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            boolean r12 = r12.containsKey(r11)
            if (r12 != 0) goto L_0x0130
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            r12.put(r11, r8)
        L_0x0130:
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x016b
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            boolean r12 = r12.containsKey(r6)
            if (r12 == 0) goto L_0x016b
            java.lang.Object r12 = r1.f2728d
            k.j r12 = (k.j) r12
            java.lang.Object r12 = r12.getOrDefault(r11, r8)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0167
            r12 = r5
            w0.c r12 = (w0.c) r12
            java.lang.Object r12 = r12.b()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0160
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0160:
            java.lang.Object r13 = r1.f2728d
            k.j r13 = (k.j) r13
            r13.put(r11, r12)
        L_0x0167:
            r12.add(r6)
            goto L_0x0173
        L_0x016b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0173:
            int r10 = r10 + 1
            goto L_0x00d9
        L_0x0177:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x017b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r15.getResources()
            java.lang.String r2 = r2.getResourceName(r11)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019f:
            java.lang.Object r2 = r1.f2727c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.lang.Object r4 = r1.f2726b
            java.util.HashSet r4 = (java.util.HashSet) r4
            r4.clear()
            java.lang.Object r5 = r1.f2728d
            k.j r5 = (k.j) r5
            int r5 = r5.f3895f
        L_0x01b3:
            if (r3 >= r5) goto L_0x01c3
            java.lang.Object r6 = r1.f2728d
            k.j r6 = (k.j) r6
            java.lang.Object r6 = r6.h(r3)
            r1.f(r6, r2, r4)
            int r3 = r3 + 1
            goto L_0x01b3
        L_0x01c3:
            r0.addAll(r2)
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        w();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f956t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f955s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f955s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f955s.setState(getDrawableState());
                }
                Drawable drawable4 = this.f955s;
                WeakHashMap weakHashMap = u0.f5622a;
                r0.c.b(drawable4, e0.d(this));
                this.f955s.setVisible(getVisibility() == 0, false);
                this.f955s.setCallback(this);
            }
            WeakHashMap weakHashMap2 = u0.f5622a;
            d0.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        Drawable drawable;
        if (i3 != 0) {
            Context context = getContext();
            Object obj = n0.b.f4213a;
            drawable = o0.b.b(context, i3);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z5 = i3 == 0;
        Drawable drawable = this.f955s;
        if (drawable != null && drawable.isVisible() != z5) {
            this.f955s.setVisible(z5, false);
        }
    }

    public final void t(boolean z5) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            l0.a aVar = ((l0.d) childAt.getLayoutParams()).f4053a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            ((l0.d) getChildAt(i6).getLayoutParams()).f4065m = false;
        }
        this.f949m = null;
        this.f946j = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f955s;
    }

    public final void w() {
        WeakHashMap weakHashMap = u0.f5622a;
        if (d0.b(this)) {
            if (this.f957u == null) {
                this.f957u = new n0(8, (Object) this);
            }
            j0.u(this, this.f957u);
            setSystemUiVisibility(1280);
            return;
        }
        j0.u(this, (s) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof l0.d) {
            return new l0.d((l0.d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new l0.d((ViewGroup.MarginLayoutParams) layoutParams) : new l0.d(layoutParams);
    }
}
