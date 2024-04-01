package p1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.a;
import x0.d0;
import x0.e0;
import x0.u0;
import y0.o;

public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public d f4595a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f4596b;

    /* renamed from: c  reason: collision with root package name */
    public final r1 f4597c;

    /* renamed from: d  reason: collision with root package name */
    public final r1 f4598d;

    /* renamed from: e  reason: collision with root package name */
    public z f4599e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4600f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4601g = false;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4602h = true;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4603i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f4604j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4605k;

    /* renamed from: l  reason: collision with root package name */
    public int f4606l;

    /* renamed from: m  reason: collision with root package name */
    public int f4607m;

    /* renamed from: n  reason: collision with root package name */
    public int f4608n;

    /* renamed from: o  reason: collision with root package name */
    public int f4609o;

    public o0() {
        l lVar = new l(0, this);
        l lVar2 = new l(1, this);
        this.f4597c = new r1(lVar);
        this.f4598d = new r1(lVar2);
    }

    public static int F(View view) {
        return ((p0) view.getLayoutParams()).a();
    }

    public static n0 G(Context context, AttributeSet attributeSet, int i3, int i6) {
        n0 n0Var = new n0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4326a, i3, i6);
        n0Var.f4584a = obtainStyledAttributes.getInt(0, 1);
        n0Var.f4585b = obtainStyledAttributes.getInt(10, 1);
        n0Var.f4586c = obtainStyledAttributes.getBoolean(9, false);
        n0Var.f4587d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return n0Var;
    }

    public static boolean K(int i3, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (i7 > 0 && i3 != i7) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    public static void L(View view, int i3, int i6, int i7, int i8) {
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect = p0Var.f4641b;
        view.layout(i3 + rect.left + p0Var.leftMargin, i6 + rect.top + p0Var.topMargin, (i7 - rect.right) - p0Var.rightMargin, (i8 - rect.bottom) - p0Var.bottomMargin);
    }

    public static int g(int i3, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i6, i7) : size : Math.min(size, Math.max(i6, i7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r5 == 1073741824) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001a
            if (r7 < 0) goto L_0x0011
            goto L_0x001c
        L_0x0011:
            if (r7 != r1) goto L_0x002f
            if (r5 == r2) goto L_0x0020
            if (r5 == 0) goto L_0x002f
            if (r5 == r3) goto L_0x0020
            goto L_0x002f
        L_0x001a:
            if (r7 < 0) goto L_0x001e
        L_0x001c:
            r5 = r3
            goto L_0x0031
        L_0x001e:
            if (r7 != r1) goto L_0x0022
        L_0x0020:
            r7 = r4
            goto L_0x0031
        L_0x0022:
            if (r7 != r0) goto L_0x002f
            if (r5 == r2) goto L_0x002c
            if (r5 != r3) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r7 = r4
            r5 = r6
            goto L_0x0031
        L_0x002c:
            r7 = r4
            r5 = r2
            goto L_0x0031
        L_0x002f:
            r5 = r6
            r7 = r5
        L_0x0031:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.w(int, int, int, int, boolean):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f4596b;
        WeakHashMap weakHashMap = u0.f5622a;
        return e0.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(v0 v0Var, b1 b1Var) {
        return -1;
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((p0) view.getLayoutParams()).f4641b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.f4596b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.f4596b.f1443n;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i3) {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            int e6 = recyclerView.f1433i.e();
            for (int i6 = 0; i6 < e6; i6++) {
                recyclerView.f1433i.d(i6).offsetLeftAndRight(i3);
            }
        }
    }

    public void N(int i3) {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            int e6 = recyclerView.f1433i.e();
            for (int i6 = 0; i6 < e6; i6++) {
                recyclerView.f1433i.d(i6).offsetTopAndBottom(i3);
            }
        }
    }

    public void O() {
    }

    public void P(RecyclerView recyclerView) {
    }

    public View Q(View view, int i3, v0 v0Var, b1 b1Var) {
        return null;
    }

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4596b;
        v0 v0Var = recyclerView.f1428f;
        b1 b1Var = recyclerView.f1432h0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z5 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4596b.canScrollVertically(-1) && !this.f4596b.canScrollHorizontally(-1) && !this.f4596b.canScrollHorizontally(1)) {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            g0 g0Var = this.f4596b.f1445o;
            if (g0Var != null) {
                accessibilityEvent.setItemCount(g0Var.a());
            }
        }
    }

    public void S(v0 v0Var, b1 b1Var, o oVar) {
        boolean canScrollVertically = this.f4596b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        if (canScrollVertically || this.f4596b.canScrollHorizontally(-1)) {
            oVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f4596b.canScrollVertically(1) || this.f4596b.canScrollHorizontally(1)) {
            oVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(v0Var, b1Var), x(v0Var, b1Var), false, 0));
    }

    public final void T(View view, o oVar) {
        f1 L = RecyclerView.L(view);
        if (L != null && !L.i() && !this.f4595a.j(L.f4483a)) {
            RecyclerView recyclerView = this.f4596b;
            U(recyclerView.f1428f, recyclerView.f1432h0, view, oVar);
        }
    }

    public void U(v0 v0Var, b1 b1Var, View view, o oVar) {
    }

    public void V(int i3, int i6) {
    }

    public void W() {
    }

    public void X(int i3, int i6) {
    }

    public void Y(int i3, int i6) {
    }

    public void Z(int i3, int i6) {
    }

    public abstract void a0(v0 v0Var, b1 b1Var);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r8, int r9, boolean r10) {
        /*
            r7 = this;
            p1.f1 r0 = androidx.recyclerview.widget.RecyclerView.L(r8)
            if (r10 != 0) goto L_0x0015
            boolean r10 = r0.i()
            if (r10 == 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            androidx.recyclerview.widget.RecyclerView r10 = r7.f4596b
            p1.r1 r10 = r10.f1435j
            r10.l(r0)
            goto L_0x001c
        L_0x0015:
            androidx.recyclerview.widget.RecyclerView r10 = r7.f4596b
            p1.r1 r10 = r10.f1435j
            r10.a(r0)
        L_0x001c:
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            p1.p0 r10 = (p1.p0) r10
            boolean r1 = r0.p()
            java.lang.String r2 = "RecyclerView"
            r3 = 0
            if (r1 != 0) goto L_0x0108
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x0033
            goto L_0x0108
        L_0x0033:
            android.view.ViewParent r1 = r8.getParent()
            androidx.recyclerview.widget.RecyclerView r4 = r7.f4596b
            r5 = -1
            if (r1 != r4) goto L_0x00d9
            p1.d r1 = r7.f4595a
            p1.f0 r4 = r1.f4456a
            androidx.recyclerview.widget.RecyclerView r4 = r4.f4481a
            int r4 = r4.indexOfChild(r8)
            if (r4 != r5) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            p1.c r1 = r1.f4457b
            boolean r6 = r1.d(r4)
            if (r6 == 0) goto L_0x0053
        L_0x0051:
            r4 = r5
            goto L_0x0058
        L_0x0053:
            int r1 = r1.b(r4)
            int r4 = r4 - r1
        L_0x0058:
            if (r9 != r5) goto L_0x0060
            p1.d r9 = r7.f4595a
            int r9 = r9.e()
        L_0x0060:
            if (r4 == r5) goto L_0x00bd
            if (r4 == r9) goto L_0x0123
            androidx.recyclerview.widget.RecyclerView r8 = r7.f4596b
            p1.o0 r8 = r8.f1447p
            android.view.View r1 = r8.u(r4)
            if (r1 == 0) goto L_0x00a0
            r8.u(r4)
            p1.d r5 = r8.f4595a
            r5.c(r4)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            p1.p0 r4 = (p1.p0) r4
            p1.f1 r5 = androidx.recyclerview.widget.RecyclerView.L(r1)
            boolean r6 = r5.i()
            if (r6 == 0) goto L_0x008e
            androidx.recyclerview.widget.RecyclerView r6 = r8.f4596b
            p1.r1 r6 = r6.f1435j
            r6.a(r5)
            goto L_0x0095
        L_0x008e:
            androidx.recyclerview.widget.RecyclerView r6 = r8.f4596b
            p1.r1 r6 = r6.f1435j
            r6.l(r5)
        L_0x0095:
            p1.d r8 = r8.f4595a
            boolean r5 = r5.i()
            r8.b(r1, r9, r4, r5)
            goto L_0x0123
        L_0x00a0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot move a child from non-existing index:"
            r10.<init>(r0)
            r10.append(r4)
            androidx.recyclerview.widget.RecyclerView r8 = r8.f4596b
            java.lang.String r8 = r8.toString()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x00bd:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r10.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.f4596b
            int r8 = r0.indexOfChild(r8)
            r10.append(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r7.f4596b
            java.lang.String r8 = a2.m.f(r8, r10)
            r9.<init>(r8)
            throw r9
        L_0x00d9:
            p1.d r1 = r7.f4595a
            r1.a(r8, r9, r3)
            r9 = 1
            r10.f4642c = r9
            p1.z r9 = r7.f4599e
            if (r9 == 0) goto L_0x0123
            boolean r1 = r9.f4722e
            if (r1 == 0) goto L_0x0123
            androidx.recyclerview.widget.RecyclerView r1 = r9.f4719b
            r1.getClass()
            p1.f1 r1 = androidx.recyclerview.widget.RecyclerView.L(r8)
            if (r1 == 0) goto L_0x00f8
            int r5 = r1.c()
        L_0x00f8:
            int r1 = r9.f4718a
            if (r5 != r1) goto L_0x0123
            r9.f4723f = r8
            boolean r8 = androidx.recyclerview.widget.RecyclerView.B0
            if (r8 == 0) goto L_0x0123
            java.lang.String r8 = "smooth scroll target view has been attached"
            android.util.Log.d(r2, r8)
            goto L_0x0123
        L_0x0108:
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x0114
            p1.v0 r1 = r0.f4496n
            r1.m(r0)
            goto L_0x011a
        L_0x0114:
            int r1 = r0.f4492j
            r1 = r1 & -33
            r0.f4492j = r1
        L_0x011a:
            p1.d r1 = r7.f4595a
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            r1.b(r8, r9, r4, r3)
        L_0x0123:
            boolean r8 = r10.f4643d
            if (r8 == 0) goto L_0x0145
            boolean r8 = androidx.recyclerview.widget.RecyclerView.B0
            if (r8 == 0) goto L_0x013e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "consuming pending invalidate on child "
            r8.<init>(r9)
            p1.f1 r9 = r10.f4640a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L_0x013e:
            android.view.View r8 = r0.f4483a
            r8.invalidate()
            r10.f4643d = r3
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.b(android.view.View, int, boolean):void");
    }

    public abstract void b0(b1 b1Var);

    public void c(String str) {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(Parcelable parcelable) {
    }

    public abstract boolean d();

    public Parcelable d0() {
        return null;
    }

    public abstract boolean e();

    public void e0(int i3) {
    }

    public boolean f(p0 p0Var) {
        return p0Var != null;
    }

    public final void f0(v0 v0Var) {
        int v5 = v();
        while (true) {
            v5--;
            if (v5 < 0) {
                return;
            }
            if (!RecyclerView.L(u(v5)).o()) {
                View u3 = u(v5);
                i0(v5);
                v0Var.i(u3);
            }
        }
    }

    public final void g0(v0 v0Var) {
        ArrayList arrayList;
        int size = v0Var.f4689a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = v0Var.f4689a;
            if (i3 < 0) {
                break;
            }
            View view = ((f1) arrayList.get(i3)).f4483a;
            f1 L = RecyclerView.L(view);
            if (!L.o()) {
                L.n(false);
                if (L.k()) {
                    this.f4596b.removeDetachedView(view, false);
                }
                l0 l0Var = this.f4596b.M;
                if (l0Var != null) {
                    l0Var.d(L);
                }
                L.n(true);
                f1 L2 = RecyclerView.L(view);
                L2.f4496n = null;
                L2.f4497o = false;
                L2.f4492j &= -33;
                v0Var.j(L2);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = v0Var.f4690b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f4596b.invalidate();
        }
    }

    public void h(int i3, int i6, b1 b1Var, q qVar) {
    }

    /* JADX INFO: finally extract failed */
    public final void h0(View view, v0 v0Var) {
        d dVar = this.f4595a;
        f0 f0Var = dVar.f4456a;
        int i3 = dVar.f4459d;
        if (i3 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i3 != 2) {
            try {
                dVar.f4459d = 1;
                dVar.f4460e = view;
                int indexOfChild = f0Var.f4481a.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (dVar.f4457b.f(indexOfChild)) {
                        dVar.k(view);
                    }
                    f0Var.g(indexOfChild);
                }
                dVar.f4459d = 0;
                dVar.f4460e = null;
                v0Var.i(view);
            } catch (Throwable th) {
                dVar.f4459d = 0;
                dVar.f4460e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public void i(int i3, q qVar) {
    }

    public final void i0(int i3) {
        if (u(i3) != null) {
            d dVar = this.f4595a;
            f0 f0Var = dVar.f4456a;
            int i6 = dVar.f4459d;
            if (i6 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            } else if (i6 != 2) {
                try {
                    int f6 = dVar.f(i3);
                    View childAt = f0Var.f4481a.getChildAt(f6);
                    if (childAt != null) {
                        dVar.f4459d = 1;
                        dVar.f4460e = childAt;
                        if (dVar.f4457b.f(f6)) {
                            dVar.k(childAt);
                        }
                        f0Var.g(f6);
                    }
                } finally {
                    dVar.f4459d = 0;
                    dVar.f4460e = null;
                }
            } else {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
        }
    }

    public abstract int j(b1 b1Var);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (r10 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.f4608n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.f4609o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L_0x005c
            if (r2 == 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            int r2 = java.lang.Math.max(r6, r10)
            goto L_0x0064
        L_0x005c:
            if (r6 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            int r6 = java.lang.Math.min(r4, r2)
        L_0x0063:
            r2 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r1 = java.lang.Math.min(r5, r11)
        L_0x006b:
            if (r13 == 0) goto L_0x00ab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L_0x0074
            goto L_0x00a8
        L_0x0074:
            int r11 = r8.C()
            int r13 = r8.E()
            int r3 = r8.f4608n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.f4609o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f4596b
            android.graphics.Rect r5 = r5.f1439l
            r8.y(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto L_0x00a8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto L_0x00a8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto L_0x00a8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r10 = r7
            goto L_0x00a9
        L_0x00a8:
            r10 = r0
        L_0x00a9:
            if (r10 == 0) goto L_0x00b0
        L_0x00ab:
            if (r2 != 0) goto L_0x00b1
            if (r1 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            return r0
        L_0x00b1:
            if (r12 == 0) goto L_0x00b7
            r9.scrollBy(r2, r1)
            goto L_0x00ba
        L_0x00b7:
            r9.g0(r2, r1, r0)
        L_0x00ba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(b1 b1Var);

    public final void k0() {
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(b1 b1Var);

    public abstract int l0(int i3, v0 v0Var, b1 b1Var);

    public abstract int m(b1 b1Var);

    public abstract void m0(int i3);

    public abstract int n(b1 b1Var);

    public abstract int n0(int i3, v0 v0Var, b1 b1Var);

    public abstract int o(b1 b1Var);

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void p(v0 v0Var) {
        int v5 = v();
        while (true) {
            v5--;
            if (v5 >= 0) {
                View u3 = u(v5);
                f1 L = RecyclerView.L(u3);
                if (L.o()) {
                    if (RecyclerView.B0) {
                        Log.d("RecyclerView", "ignoring view " + L);
                    }
                } else if (!L.g() || L.i() || this.f4596b.f1445o.f4509b) {
                    u(v5);
                    this.f4595a.c(v5);
                    v0Var.k(u3);
                    this.f4596b.f1435j.l(L);
                } else {
                    i0(v5);
                    v0Var.j(L);
                }
            } else {
                return;
            }
        }
    }

    public final void p0(int i3, int i6) {
        this.f4608n = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f4606l = mode;
        if (mode == 0 && !RecyclerView.E0) {
            this.f4608n = 0;
        }
        this.f4609o = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        this.f4607m = mode2;
        if (mode2 == 0 && !RecyclerView.E0) {
            this.f4609o = 0;
        }
    }

    public View q(int i3) {
        int v5 = v();
        for (int i6 = 0; i6 < v5; i6++) {
            View u3 = u(i6);
            f1 L = RecyclerView.L(u3);
            if (L != null && L.c() == i3 && !L.o() && (this.f4596b.f1432h0.f4444g || !L.i())) {
                return u3;
            }
        }
        return null;
    }

    public void q0(Rect rect, int i3, int i6) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.f4596b;
        WeakHashMap weakHashMap = u0.f5622a;
        this.f4596b.setMeasuredDimension(g(i3, D, d0.e(recyclerView)), g(i6, B, d0.d(this.f4596b)));
    }

    public abstract p0 r();

    public final void r0(int i3, int i6) {
        int v5 = v();
        if (v5 == 0) {
            this.f4596b.q(i3, i6);
            return;
        }
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < v5; i11++) {
            View u3 = u(i11);
            Rect rect = this.f4596b.f1439l;
            y(u3, rect);
            int i12 = rect.left;
            if (i12 < i10) {
                i10 = i12;
            }
            int i13 = rect.right;
            if (i13 > i7) {
                i7 = i13;
            }
            int i14 = rect.top;
            if (i14 < i8) {
                i8 = i14;
            }
            int i15 = rect.bottom;
            if (i15 > i9) {
                i9 = i15;
            }
        }
        this.f4596b.f1439l.set(i10, i8, i7, i9);
        q0(this.f4596b.f1439l, i3, i6);
    }

    public p0 s(Context context, AttributeSet attributeSet) {
        return new p0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        int i3;
        if (recyclerView == null) {
            this.f4596b = null;
            this.f4595a = null;
            i3 = 0;
            this.f4608n = 0;
        } else {
            this.f4596b = recyclerView;
            this.f4595a = recyclerView.f1433i;
            this.f4608n = recyclerView.getWidth();
            i3 = recyclerView.getHeight();
        }
        this.f4609o = i3;
        this.f4606l = 1073741824;
        this.f4607m = 1073741824;
    }

    public p0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p0 ? new p0((p0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p0((ViewGroup.MarginLayoutParams) layoutParams) : new p0(layoutParams);
    }

    public final boolean t0(View view, int i3, int i6, p0 p0Var) {
        return view.isLayoutRequested() || !this.f4602h || !K(view.getWidth(), i3, p0Var.width) || !K(view.getHeight(), i6, p0Var.height);
    }

    public final View u(int i3) {
        d dVar = this.f4595a;
        if (dVar != null) {
            return dVar.d(i3);
        }
        return null;
    }

    public boolean u0() {
        return false;
    }

    public final int v() {
        d dVar = this.f4595a;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public final boolean v0(View view, int i3, int i6, p0 p0Var) {
        return !this.f4602h || !K(view.getMeasuredWidth(), i3, p0Var.width) || !K(view.getMeasuredHeight(), i6, p0Var.height);
    }

    public abstract void w0(RecyclerView recyclerView, int i3);

    public int x(v0 v0Var, b1 b1Var) {
        return -1;
    }

    public final void x0(z zVar) {
        z zVar2 = this.f4599e;
        if (!(zVar2 == null || zVar == zVar2 || !zVar2.f4722e)) {
            zVar2.i();
        }
        this.f4599e = zVar;
        RecyclerView recyclerView = this.f4596b;
        e1 e1Var = recyclerView.f1427e0;
        e1Var.f4475j.removeCallbacks(e1Var);
        e1Var.f4471f.abortAnimation();
        if (zVar.f4725h) {
            Log.w("RecyclerView", "An instance of " + zVar.getClass().getSimpleName() + " was started more than once. Each instance of" + zVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        zVar.f4719b = recyclerView;
        zVar.f4720c = this;
        int i3 = zVar.f4718a;
        if (i3 != -1) {
            recyclerView.f1432h0.f4438a = i3;
            zVar.f4722e = true;
            zVar.f4721d = true;
            zVar.f4723f = recyclerView.f1447p.q(i3);
            zVar.f4719b.f1427e0.b();
            zVar.f4725h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void y(View view, Rect rect) {
        boolean z5 = RecyclerView.A0;
        p0 p0Var = (p0) view.getLayoutParams();
        Rect rect2 = p0Var.f4641b;
        rect.set((view.getLeft() - rect2.left) - p0Var.leftMargin, (view.getTop() - rect2.top) - p0Var.topMargin, view.getRight() + rect2.right + p0Var.rightMargin, view.getBottom() + rect2.bottom + p0Var.bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final int z() {
        RecyclerView recyclerView = this.f4596b;
        g0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }
}
