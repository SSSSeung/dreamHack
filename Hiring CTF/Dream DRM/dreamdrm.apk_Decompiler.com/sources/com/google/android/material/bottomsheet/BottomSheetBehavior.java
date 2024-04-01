package com.google.android.material.bottomsheet;

import a2.m;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.o;
import c3.b;
import c3.d;
import com.theori.dreamdrm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l0.a;
import p3.f;
import p3.g;
import p3.k;
import x0.c;
import x0.j0;
import x0.u0;
import y0.h;

public class BottomSheetBehavior<V extends View> extends a {
    public final d A = new d(this, 0);
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F = 0.5f;
    public int G;
    public final float H = -1.0f;
    public boolean I;
    public boolean J;
    public boolean K = true;
    public int L = 4;
    public f1.d M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q = 0.1f;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W = new ArrayList();
    public VelocityTracker X;
    public int Y;
    public int Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f1833a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1834a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1835b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f1836b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f1837c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f1838c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public int f1839d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f1840d0 = new b(this);

    /* renamed from: e  reason: collision with root package name */
    public int f1841e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1842f;

    /* renamed from: g  reason: collision with root package name */
    public int f1843g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1844h;

    /* renamed from: i  reason: collision with root package name */
    public g f1845i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f1846j;

    /* renamed from: k  reason: collision with root package name */
    public int f1847k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f1848l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f1849m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1850n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1851o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1852p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1853q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f1854r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f1855s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1856t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f1857u;

    /* renamed from: v  reason: collision with root package name */
    public int f1858v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1859x;

    /* renamed from: y  reason: collision with root package name */
    public final k f1860y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1861z;

    public BottomSheetBehavior() {
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = u0.f5622a;
        if (j0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View v5 = v(viewGroup.getChildAt(i3));
                if (v5 != null) {
                    return v5;
                }
            }
        }
        return null;
    }

    public final void A(View view, h hVar, int i3) {
        u0.j(view, hVar, new e.h(i3, (Object) this));
    }

    public final void B(int i3) {
        if (i3 >= 0) {
            this.C = i3;
            I(this.L, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f1842f
            if (r4 != 0) goto L_0x001d
            r3.f1842f = r2
            goto L_0x001c
        L_0x000c:
            boolean r1 = r3.f1842f
            if (r1 != 0) goto L_0x0014
            int r1 = r3.f1841e
            if (r1 == r4) goto L_0x001d
        L_0x0014:
            r3.f1842f = r0
            int r4 = java.lang.Math.max(r0, r4)
            r3.f1841e = r4
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r3.K()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (x0.g0.b(r5) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L_0x0072
            r1 = 2
            if (r5 != r1) goto L_0x0008
            goto L_0x0072
        L_0x0008:
            boolean r1 = r4.I
            if (r1 != 0) goto L_0x0023
            r1 = 5
            if (r5 != r1) goto L_0x0023
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L_0x0023:
            r1 = 6
            r2 = 3
            if (r5 != r1) goto L_0x0035
            boolean r1 = r4.f1835b
            if (r1 == 0) goto L_0x0035
            int r1 = r4.y(r5)
            int r3 = r4.D
            if (r1 > r3) goto L_0x0035
            r1 = r2
            goto L_0x0036
        L_0x0035:
            r1 = r5
        L_0x0036:
            java.lang.ref.WeakReference r3 = r4.U
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L_0x0041
            goto L_0x006e
        L_0x0041:
            java.lang.ref.WeakReference r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            a.d r3 = new a.d
            r3.<init>(r1, r2, r4, r5)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L_0x0063
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x0063
            java.util.WeakHashMap r1 = x0.u0.f5622a
            boolean r1 = x0.g0.b(r5)
            if (r1 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x006a
            r5.post(r3)
            goto L_0x0071
        L_0x006a:
            r3.run()
            goto L_0x0071
        L_0x006e:
            r4.E(r5)
        L_0x0071:
            return
        L_0x0072:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L_0x0080
            java.lang.String r5 = "DRAGGING"
            goto L_0x0082
        L_0x0080:
            java.lang.String r5 = "SETTLING"
        L_0x0082:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = a2.m.j(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(int):void");
    }

    public final void E(int i3) {
        if (this.L != i3) {
            this.L = i3;
            WeakReference weakReference = this.U;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i3 == 3) {
                    J(true);
                } else if (i3 == 6 || i3 == 5 || i3 == 4) {
                    J(false);
                }
                I(i3, true);
                ArrayList arrayList = this.W;
                if (arrayList.size() <= 0) {
                    H();
                } else {
                    m.o(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final boolean F(View view, float f6) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f6 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r5 != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r1.q(r5.getLeft(), r0) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.y(r6)
            f1.d r1 = r4.M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0034
            if (r7 == 0) goto L_0x0017
            int r5 = r5.getLeft()
            boolean r5 = r1.q(r5, r0)
            if (r5 == 0) goto L_0x0034
            goto L_0x0033
        L_0x0017:
            int r7 = r5.getLeft()
            r1.f2634r = r5
            r5 = -1
            r1.f2619c = r5
            boolean r5 = r1.i(r7, r0, r2, r2)
            if (r5 != 0) goto L_0x0031
            int r7 = r1.f2617a
            if (r7 != 0) goto L_0x0031
            android.view.View r7 = r1.f2634r
            if (r7 == 0) goto L_0x0031
            r7 = 0
            r1.f2634r = r7
        L_0x0031:
            if (r5 == 0) goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            if (r2 == 0) goto L_0x0043
            r5 = 2
            r4.E(r5)
            r4.I(r6, r3)
            c3.d r5 = r4.A
            r5.a(r6)
            goto L_0x0046
        L_0x0043:
            r4.E(r6)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(android.view.View, int, boolean):void");
    }

    public final void H() {
        View view;
        h hVar;
        int i3;
        WeakReference weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            u0.i(view, 524288);
            u0.g(view, 0);
            u0.i(view, 262144);
            u0.g(view, 0);
            u0.i(view, 1048576);
            u0.g(view, 0);
            SparseIntArray sparseIntArray = this.f1838c0;
            int i6 = sparseIntArray.get(0, -1);
            if (i6 != -1) {
                u0.i(view, i6);
                u0.g(view, 0);
                sparseIntArray.delete(0);
            }
            int i7 = 6;
            if (!this.f1835b && this.L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                e.h hVar2 = new e.h(6, (Object) this);
                ArrayList e6 = u0.e(view);
                int i8 = 0;
                while (true) {
                    if (i8 >= e6.size()) {
                        int i9 = 0;
                        int i10 = -1;
                        while (true) {
                            int[] iArr = u0.f5625d;
                            if (i9 >= iArr.length || i10 != -1) {
                                i3 = i10;
                            } else {
                                int i11 = iArr[i9];
                                boolean z5 = true;
                                for (int i12 = 0; i12 < e6.size(); i12++) {
                                    z5 &= ((h) e6.get(i12)).a() != i11;
                                }
                                if (z5) {
                                    i10 = i11;
                                }
                                i9++;
                            }
                        }
                        i3 = i10;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((h) e6.get(i8)).f5791a).getLabel())) {
                        i3 = ((h) e6.get(i8)).a();
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i3 != -1) {
                    h hVar3 = new h((Object) null, i3, string, hVar2, (Class) null);
                    View.AccessibilityDelegate c6 = u0.c(view);
                    c cVar = c6 == null ? null : c6 instanceof x0.a ? ((x0.a) c6).f5535a : new c(c6);
                    if (cVar == null) {
                        cVar = new c();
                    }
                    u0.l(view, cVar);
                    u0.i(view, hVar3.a());
                    u0.e(view).add(hVar3);
                    u0.g(view, 0);
                }
                sparseIntArray.put(0, i3);
            }
            if (this.I && this.L != 5) {
                A(view, h.f5788j, 5);
            }
            int i13 = this.L;
            if (i13 == 3) {
                if (this.f1835b) {
                    i7 = 4;
                }
                hVar = h.f5787i;
            } else if (i13 == 4) {
                if (this.f1835b) {
                    i7 = 3;
                }
                hVar = h.f5786h;
            } else if (i13 == 6) {
                A(view, h.f5787i, 4);
                A(view, h.f5786h, 3);
                return;
            } else {
                return;
            }
            A(view, hVar, i7);
        }
    }

    public final void I(int i3, boolean z5) {
        ValueAnimator valueAnimator;
        if (i3 != 2) {
            boolean z6 = this.L == 3 && (this.f1859x || z());
            if (this.f1861z != z6 && this.f1845i != null) {
                this.f1861z = z6;
                float f6 = 1.0f;
                if (!z5 || (valueAnimator = this.B) == null) {
                    ValueAnimator valueAnimator2 = this.B;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.B.cancel();
                    }
                    g gVar = this.f1845i;
                    if (this.f1861z) {
                        f6 = s();
                    }
                    f fVar = gVar.f4767d;
                    if (fVar.f4754j != f6) {
                        fVar.f4754j = f6;
                        gVar.f4771h = true;
                        gVar.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    this.B.reverse();
                } else {
                    float f7 = this.f1845i.f4767d.f4754j;
                    if (z6) {
                        f6 = s();
                    }
                    this.B.setFloatValues(new float[]{f7, f6});
                    this.B.start();
                }
            }
        }
    }

    public final void J(boolean z5) {
        WeakReference weakReference = this.U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z5) {
                    if (this.f1836b0 == null) {
                        this.f1836b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.U.get() && z5) {
                        this.f1836b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z5) {
                    this.f1836b0 = null;
                }
            }
        }
    }

    public final void K() {
        View view;
        if (this.U != null) {
            r();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(l0.d dVar) {
        this.U = null;
        this.M = null;
    }

    public final void e() {
        this.U = null;
        this.M = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00dc
            boolean r0 = r9.K
            if (r0 != 0) goto L_0x000e
            goto L_0x00dc
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0023
            r9.Y = r4
            r9.Z = r4
            android.view.VelocityTracker r5 = r9.X
            if (r5 == 0) goto L_0x0023
            r5.recycle()
            r9.X = r3
        L_0x0023:
            android.view.VelocityTracker r5 = r9.X
            if (r5 != 0) goto L_0x002d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.X = r5
        L_0x002d:
            android.view.VelocityTracker r5 = r9.X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0046
            if (r0 == r2) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x003b
            goto L_0x0089
        L_0x003b:
            r9.f1834a0 = r1
            r9.Y = r4
            boolean r11 = r9.N
            if (r11 == 0) goto L_0x0089
            r9.N = r1
            return r1
        L_0x0046:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.Z = r7
            int r7 = r9.L
            if (r7 == r5) goto L_0x0078
            java.lang.ref.WeakReference r7 = r9.V
            if (r7 == 0) goto L_0x0061
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            if (r7 == 0) goto L_0x0078
            int r8 = r9.Z
            boolean r7 = r10.o(r7, r6, r8)
            if (r7 == 0) goto L_0x0078
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.Y = r7
            r9.f1834a0 = r2
        L_0x0078:
            int r7 = r9.Y
            if (r7 != r4) goto L_0x0086
            int r7 = r9.Z
            boolean r11 = r10.o(r11, r6, r7)
            if (r11 != 0) goto L_0x0086
            r11 = r2
            goto L_0x0087
        L_0x0086:
            r11 = r1
        L_0x0087:
            r9.N = r11
        L_0x0089:
            boolean r11 = r9.N
            if (r11 != 0) goto L_0x0098
            f1.d r11 = r9.M
            if (r11 == 0) goto L_0x0098
            boolean r11 = r11.r(r12)
            if (r11 == 0) goto L_0x0098
            return r2
        L_0x0098:
            java.lang.ref.WeakReference r11 = r9.V
            if (r11 == 0) goto L_0x00a3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a3:
            if (r0 != r5) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            boolean r11 = r9.N
            if (r11 != 0) goto L_0x00db
            int r11 = r9.L
            if (r11 == r2) goto L_0x00db
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.o(r3, r11, r0)
            if (r10 != 0) goto L_0x00db
            f1.d r10 = r9.M
            if (r10 == 0) goto L_0x00db
            int r10 = r9.Z
            if (r10 == r4) goto L_0x00db
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            f1.d r11 = r9.M
            int r11 = r11.f2618b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
            r1 = r2
        L_0x00db:
            return r1
        L_0x00dc:
            r9.N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        if (r11 == -1) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        if (r11 == -1) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = x0.u0.f5622a
            boolean r0 = x0.d0.b(r11)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = x0.d0.b(r12)
            if (r0 != 0) goto L_0x0012
            r12.setFitsSystemWindows(r1)
        L_0x0012:
            java.lang.ref.WeakReference r0 = r10.U
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 != 0) goto L_0x011d
            android.content.res.Resources r0 = r11.getResources()
            r4 = 2131099757(0x7f06006d, float:1.7811876E38)
            int r0 = r0.getDimensionPixelSize(r4)
            r10.f1843g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L_0x0036
            boolean r4 = r10.f1850n
            if (r4 != 0) goto L_0x0036
            boolean r4 = r10.f1842f
            if (r4 != 0) goto L_0x0036
            r4 = r1
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            boolean r5 = r10.f1851o
            if (r5 != 0) goto L_0x0052
            boolean r5 = r10.f1852p
            if (r5 != 0) goto L_0x0052
            boolean r5 = r10.f1853q
            if (r5 != 0) goto L_0x0052
            boolean r5 = r10.f1855s
            if (r5 != 0) goto L_0x0052
            boolean r5 = r10.f1856t
            if (r5 != 0) goto L_0x0052
            boolean r5 = r10.f1857u
            if (r5 != 0) goto L_0x0052
            if (r4 != 0) goto L_0x0052
            goto L_0x0088
        L_0x0052:
            a2.j0 r5 = new a2.j0
            r5.<init>(r10, r4)
            p1.k0 r4 = new p1.k0
            int r6 = x0.e0.f(r12)
            int r7 = r12.getPaddingTop()
            int r8 = x0.e0.e(r12)
            int r9 = r12.getPaddingBottom()
            r4.<init>(r6, r7, r8, r9)
            androidx.appcompat.widget.a0 r6 = new androidx.appcompat.widget.a0
            r7 = 25
            r6.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r4)
            x0.j0.u(r12, r6)
            boolean r4 = x0.g0.b(r12)
            if (r4 == 0) goto L_0x0080
            x0.h0.c(r12)
            goto L_0x0088
        L_0x0080:
            k3.l r4 = new k3.l
            r4.<init>()
            r12.addOnAttachStateChangeListener(r4)
        L_0x0088:
            c3.e r4 = new c3.e
            r4.<init>(r12)
            r5 = 30
            if (r0 < r5) goto L_0x009a
            x0.p1 r0 = new x0.p1
            r0.<init>(r4)
            r12.setWindowInsetsAnimationCallback(r0)
            goto L_0x00b3
        L_0x009a:
            android.view.animation.PathInterpolator r0 = x0.o1.f5598e
            r0 = 2131231129(0x7f080199, float:1.807833E38)
            java.lang.Object r0 = r12.getTag(r0)
            x0.n1 r5 = new x0.n1
            r5.<init>(r12, r4)
            r4 = 2131231137(0x7f0801a1, float:1.8078347E38)
            r12.setTag(r4, r5)
            if (r0 != 0) goto L_0x00b3
            r12.setOnApplyWindowInsetsListener(r5)
        L_0x00b3:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            r10.U = r0
            android.content.Context r0 = r12.getContext()
            r4 = 0
            android.view.animation.Interpolator r4 = z0.a.b(r4, r4, r4, r2)
            r5 = 2130903819(0x7f03030b, float:1.7414467E38)
            com.bumptech.glide.c.E(r0, r5, r4)
            r4 = 2130903802(0x7f0302fa, float:1.7414432E38)
            r5 = 300(0x12c, float:4.2E-43)
            com.bumptech.glide.c.D(r0, r4, r5)
            r4 = 2130903807(0x7f0302ff, float:1.7414442E38)
            r5 = 150(0x96, float:2.1E-43)
            com.bumptech.glide.c.D(r0, r4, r5)
            r4 = 2130903806(0x7f0302fe, float:1.741444E38)
            r5 = 100
            com.bumptech.glide.c.D(r0, r4, r5)
            android.content.res.Resources r0 = r12.getResources()
            r4 = 2131099820(0x7f0600ac, float:1.7812004E38)
            r0.getDimension(r4)
            r4 = 2131099821(0x7f0600ad, float:1.7812006E38)
            r0.getDimension(r4)
            p3.g r0 = r10.f1845i
            if (r0 == 0) goto L_0x010a
            x0.d0.q(r12, r0)
            p3.g r0 = r10.f1845i
            float r4 = r10.H
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0106
            float r4 = x0.j0.i(r12)
        L_0x0106:
            r0.i(r4)
            goto L_0x0111
        L_0x010a:
            android.content.res.ColorStateList r0 = r10.f1846j
            if (r0 == 0) goto L_0x0111
            x0.j0.q(r12, r0)
        L_0x0111:
            r10.H()
            int r0 = x0.d0.c(r12)
            if (r0 != 0) goto L_0x011d
            x0.d0.s(r12, r1)
        L_0x011d:
            f1.d r0 = r10.M
            if (r0 != 0) goto L_0x012e
            f1.d r0 = new f1.d
            android.content.Context r4 = r11.getContext()
            c3.b r5 = r10.f1840d0
            r0.<init>(r4, r11, r5)
            r10.M = r0
        L_0x012e:
            int r0 = r12.getTop()
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.S = r13
            int r11 = r11.getHeight()
            r10.T = r11
            int r11 = r12.getHeight()
            r10.R = r11
            int r13 = r10.T
            int r11 = r13 - r11
            int r4 = r10.w
            if (r11 >= r4) goto L_0x0165
            boolean r11 = r10.f1854r
            r5 = -1
            if (r11 == 0) goto L_0x0159
            int r11 = r10.f1848l
            if (r11 != r5) goto L_0x015f
            goto L_0x0163
        L_0x0159:
            int r13 = r13 - r4
            int r11 = r10.f1848l
            if (r11 != r5) goto L_0x015f
            goto L_0x0163
        L_0x015f:
            int r13 = java.lang.Math.min(r13, r11)
        L_0x0163:
            r10.R = r13
        L_0x0165:
            int r11 = r10.T
            int r13 = r10.R
            int r11 = r11 - r13
            int r11 = java.lang.Math.max(r3, r11)
            r10.D = r11
            int r11 = r10.T
            float r11 = (float) r11
            float r13 = r10.F
            float r2 = r2 - r13
            float r2 = r2 * r11
            int r11 = (int) r2
            r10.E = r11
            r10.r()
            int r11 = r10.L
            r13 = 3
            if (r11 != r13) goto L_0x0187
            int r11 = r10.x()
            goto L_0x019c
        L_0x0187:
            r13 = 6
            if (r11 != r13) goto L_0x018d
            int r11 = r10.E
            goto L_0x019c
        L_0x018d:
            boolean r13 = r10.I
            if (r13 == 0) goto L_0x0197
            r13 = 5
            if (r11 != r13) goto L_0x0197
            int r11 = r10.T
            goto L_0x019c
        L_0x0197:
            r13 = 4
            if (r11 != r13) goto L_0x01a0
            int r11 = r10.G
        L_0x019c:
            r12.offsetTopAndBottom(r11)
            goto L_0x01ad
        L_0x01a0:
            if (r11 == r1) goto L_0x01a5
            r13 = 2
            if (r11 != r13) goto L_0x01ad
        L_0x01a5:
            int r11 = r12.getTop()
            int r0 = r0 - r11
            r12.offsetTopAndBottom(r0)
        L_0x01ad:
            int r11 = r10.L
            r10.I(r11, r3)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.view.View r12 = v(r12)
            r11.<init>(r12)
            r10.V = r11
            java.util.ArrayList r11 = r10.W
            int r12 = r11.size()
            if (r12 > 0) goto L_0x01c6
            return r1
        L_0x01c6:
            java.lang.Object r11 = r11.get(r3)
            a2.m.o(r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, this.f1847k, marginLayoutParams.width), w(i7, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f1848l, marginLayoutParams.height));
        return true;
    }

    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    public final void j(View view, View view2, int i3, int[] iArr, int i6) {
        int i7;
        if (i6 != 1) {
            WeakReference weakReference = this.V;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = view.getTop();
                int i8 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view2.canScrollVertically(-1)) {
                        int i9 = this.G;
                        if (i8 > i9 && !this.I) {
                            int i10 = top - i9;
                            iArr[1] = i10;
                            WeakHashMap weakHashMap = u0.f5622a;
                            view.offsetTopAndBottom(-i10);
                            i7 = 4;
                            E(i7);
                        } else if (this.K) {
                            iArr[1] = i3;
                        } else {
                            return;
                        }
                    }
                    u(view.getTop());
                    this.O = i3;
                    this.P = true;
                } else if (i8 < x()) {
                    int x5 = top - x();
                    iArr[1] = x5;
                    WeakHashMap weakHashMap2 = u0.f5622a;
                    view.offsetTopAndBottom(-x5);
                    i7 = 3;
                    E(i7);
                    u(view.getTop());
                    this.O = i3;
                    this.P = true;
                } else if (this.K) {
                    iArr[1] = i3;
                } else {
                    return;
                }
                int i11 = -i3;
                WeakHashMap weakHashMap3 = u0.f5622a;
                view.offsetTopAndBottom(i11);
                E(1);
                u(view.getTop());
                this.O = i3;
                this.P = true;
            }
        }
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7, int[] iArr) {
    }

    public final void m(View view, Parcelable parcelable) {
        c3.c cVar = (c3.c) parcelable;
        int i3 = this.f1833a;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.f1841e = cVar.f1626g;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f1835b = cVar.f1627h;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.I = cVar.f1628i;
            }
            if (i3 == -1 || (i3 & 8) == 8) {
                this.J = cVar.f1629j;
            }
        }
        int i6 = cVar.f1625f;
        if (i6 == 1 || i6 == 2) {
            this.L = 4;
        } else {
            this.L = i6;
        }
    }

    public final Parcelable n(View view) {
        return new c3.c(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean o(View view, int i3, int i6) {
        this.O = 0;
        this.P = false;
        return (i3 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3.getTop() <= r2.E) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (java.lang.Math.abs(r4 - r2.D) < java.lang.Math.abs(r4 - r2.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r4 < java.lang.Math.abs(r4 - r2.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (java.lang.Math.abs(r4 - r5) < java.lang.Math.abs(r4 - r2.G)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (java.lang.Math.abs(r4 - r2.E) < java.lang.Math.abs(r4 - r2.G)) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            int r5 = r3.getTop()
            int r0 = r2.x()
            r1 = 3
            if (r5 != r0) goto L_0x000f
            r2.E(r1)
            return
        L_0x000f:
            java.lang.ref.WeakReference r5 = r2.V
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto L_0x00b4
            boolean r4 = r2.P
            if (r4 != 0) goto L_0x001f
            goto L_0x00b4
        L_0x001f:
            int r4 = r2.O
            if (r4 <= 0) goto L_0x0033
            boolean r4 = r2.f1835b
            if (r4 == 0) goto L_0x0029
            goto L_0x00ae
        L_0x0029:
            int r4 = r3.getTop()
            int r5 = r2.E
            if (r4 <= r5) goto L_0x00ae
            goto L_0x00ab
        L_0x0033:
            boolean r4 = r2.I
            if (r4 == 0) goto L_0x0054
            android.view.VelocityTracker r4 = r2.X
            if (r4 != 0) goto L_0x003d
            r4 = 0
            goto L_0x004c
        L_0x003d:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r0 = r2.f1837c
            r4.computeCurrentVelocity(r5, r0)
            android.view.VelocityTracker r4 = r2.X
            int r5 = r2.Y
            float r4 = r4.getYVelocity(r5)
        L_0x004c:
            boolean r4 = r2.F(r3, r4)
            if (r4 == 0) goto L_0x0054
            r1 = 5
            goto L_0x00ae
        L_0x0054:
            int r4 = r2.O
            if (r4 != 0) goto L_0x0091
            int r4 = r3.getTop()
            boolean r5 = r2.f1835b
            if (r5 == 0) goto L_0x0072
            int r5 = r2.D
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L_0x00ad
            goto L_0x00ae
        L_0x0072:
            int r5 = r2.E
            if (r4 >= r5) goto L_0x0081
            int r5 = r2.G
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto L_0x00ab
            goto L_0x00ae
        L_0x0081:
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L_0x00ad
            goto L_0x00ab
        L_0x0091:
            boolean r4 = r2.f1835b
            if (r4 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            int r4 = r3.getTop()
            int r5 = r2.E
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L_0x00ad
        L_0x00ab:
            r1 = 6
            goto L_0x00ae
        L_0x00ad:
            r1 = 4
        L_0x00ae:
            r4 = 0
            r2.G(r3, r1, r4)
            r2.P = r4
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        boolean z5 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.L;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        f1.d dVar = this.M;
        if (dVar != null && (this.K || i3 == 1)) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z5 = true;
        }
        if (z5 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(((float) this.Z) - motionEvent.getY());
            f1.d dVar2 = this.M;
            if (abs > ((float) dVar2.f2618b)) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int t5 = t();
        if (this.f1835b) {
            this.G = Math.max(this.T - t5, this.D);
        } else {
            this.G = this.T - t5;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float s() {
        /*
            r5 = this;
            p3.g r0 = r5.f1845i
            r1 = 0
            if (r0 == 0) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0079
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0079
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L_0x0079
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0079
            p3.g r2 = r5.f1845i
            p3.f r3 = r2.f4767d
            p3.k r3 = r3.f4745a
            p3.c r3 = r3.f4805e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = r0.getRoundedCorner(0)
            if (r3 == 0) goto L_0x004e
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x004e
            float r3 = r3 / r2
            goto L_0x004f
        L_0x004e:
            r3 = r1
        L_0x004f:
            p3.g r2 = r5.f1845i
            p3.f r4 = r2.f4767d
            p3.k r4 = r4.f4745a
            p3.c r4 = r4.f4806f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = r0.getRoundedCorner(1)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            float r1 = r0 / r2
        L_0x0074:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f1849m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.f1842f
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f1843g
            int r1 = r3.T
            int r2 = r3.S
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.R
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f1858v
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f1850n
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f1851o
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f1849m
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f1841e
            int r2 = r3.f1844h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f1841e
            int r1 = r3.f1858v
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public final void u(int i3) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i6 = this.G;
                if (i3 <= i6 && i6 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    m.o(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int w(int i3, int i6, int i7, int i8) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i6, i8);
        if (i7 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i7), 1073741824);
        }
        if (size != 0) {
            i7 = Math.min(size, i7);
        }
        return View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
    }

    public final int x() {
        if (this.f1835b) {
            return this.D;
        }
        return Math.max(this.C, this.f1854r ? 0 : this.w);
    }

    public final int y(int i3) {
        if (i3 == 3) {
            return x();
        }
        if (i3 == 4) {
            return this.G;
        }
        if (i3 == 5) {
            return this.T;
        }
        if (i3 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(m.g("Invalid state to get top offset: ", i3));
    }

    public final boolean z() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i3;
        this.f1844h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.f5820a);
        int i6 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1846j = o.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1860y = new k(k.b(context, attributeSet, R.attr.bottomSheetStyle, 2131755833));
        }
        k kVar = this.f1860y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1845i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1846j;
            if (colorStateList != null) {
                this.f1845i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1845i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.B = ofFloat;
        ofFloat.setDuration(500);
        this.B.addUpdateListener(new c3.a(0, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1847k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1848l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i3 = peekValue.data) != -1) {
            C(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            C(i3);
        }
        boolean z5 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z5) {
            this.I = z5;
            if (!z5 && this.L == 5) {
                D(4);
            }
            H();
        }
        this.f1850n = obtainStyledAttributes.getBoolean(13, false);
        boolean z6 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1835b != z6) {
            this.f1835b = z6;
            if (this.U != null) {
                r();
            }
            E((!this.f1835b || this.L != 6) ? this.L : i6);
            I(this.L, true);
            H();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f1833a = obtainStyledAttributes.getInt(10, 0);
        float f6 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f6;
        if (this.U != null) {
            this.E = (int) ((1.0f - f6) * ((float) this.T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        B((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(5, 0) : peekValue2.data);
        this.f1839d = obtainStyledAttributes.getInt(11, 500);
        this.f1851o = obtainStyledAttributes.getBoolean(17, false);
        this.f1852p = obtainStyledAttributes.getBoolean(18, false);
        this.f1853q = obtainStyledAttributes.getBoolean(19, false);
        this.f1854r = obtainStyledAttributes.getBoolean(20, true);
        this.f1855s = obtainStyledAttributes.getBoolean(14, false);
        this.f1856t = obtainStyledAttributes.getBoolean(15, false);
        this.f1857u = obtainStyledAttributes.getBoolean(16, false);
        this.f1859x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f1837c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
