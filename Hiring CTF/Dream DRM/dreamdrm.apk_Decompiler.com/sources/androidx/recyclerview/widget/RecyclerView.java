package androidx.recyclerview.widget;

import a2.m;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b1.v;
import com.bumptech.glide.e;
import com.theori.dreamdrm.R;
import f1.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p1.a;
import p1.b;
import p1.b1;
import p1.c1;
import p1.d;
import p1.d1;
import p1.e0;
import p1.e1;
import p1.f0;
import p1.f1;
import p1.g0;
import p1.h1;
import p1.i0;
import p1.j0;
import p1.k0;
import p1.l0;
import p1.m0;
import p1.o0;
import p1.p;
import p1.p0;
import p1.q;
import p1.q0;
import p1.q1;
import p1.r0;
import p1.r1;
import p1.s;
import p1.s0;
import p1.t0;
import p1.v0;
import p1.w0;
import p1.x0;
import p1.y0;
import p1.z;
import t0.j;
import t0.k;
import x0.a1;
import x0.d0;
import x0.o;
import x0.u0;

public class RecyclerView extends ViewGroup {
    public static boolean A0 = false;
    public static boolean B0 = false;
    public static final int[] C0 = {16843830};
    public static final float D0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final boolean E0 = true;
    public static final boolean F0 = true;
    public static final Class[] G0;
    public static final c H0 = new c(1);
    public static final c1 I0 = new c1();
    public boolean A;
    public int B;
    public final AccessibilityManager C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public j0 H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public l0 M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public q0 V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f1421a0;

    /* renamed from: b0  reason: collision with root package name */
    public final float f1422b0;

    /* renamed from: c0  reason: collision with root package name */
    public final float f1423c0;

    /* renamed from: d  reason: collision with root package name */
    public final float f1424d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1425d0;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f1426e;

    /* renamed from: e0  reason: collision with root package name */
    public final e1 f1427e0;

    /* renamed from: f  reason: collision with root package name */
    public final v0 f1428f;
    public s f0;

    /* renamed from: g  reason: collision with root package name */
    public y0 f1429g;

    /* renamed from: g0  reason: collision with root package name */
    public final q f1430g0;

    /* renamed from: h  reason: collision with root package name */
    public b f1431h;

    /* renamed from: h0  reason: collision with root package name */
    public final b1 f1432h0;

    /* renamed from: i  reason: collision with root package name */
    public d f1433i;

    /* renamed from: i0  reason: collision with root package name */
    public s0 f1434i0;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f1435j;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f1436j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1437k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1438k0;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f1439l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1440l0;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f1441m;

    /* renamed from: m0  reason: collision with root package name */
    public final f0 f1442m0;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f1443n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1444n0;

    /* renamed from: o  reason: collision with root package name */
    public g0 f1445o;

    /* renamed from: o0  reason: collision with root package name */
    public h1 f1446o0;

    /* renamed from: p  reason: collision with root package name */
    public o0 f1447p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f1448p0;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f1449q;

    /* renamed from: q0  reason: collision with root package name */
    public o f1450q0;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f1451r;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f1452r0;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f1453s;

    /* renamed from: s0  reason: collision with root package name */
    public final int[] f1454s0;

    /* renamed from: t  reason: collision with root package name */
    public r0 f1455t;

    /* renamed from: t0  reason: collision with root package name */
    public final int[] f1456t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1457u;

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f1458u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1459v;

    /* renamed from: v0  reason: collision with root package name */
    public final e0 f1460v0;
    public boolean w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1461w0;

    /* renamed from: x  reason: collision with root package name */
    public int f1462x;

    /* renamed from: x0  reason: collision with root package name */
    public int f1463x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1464y;

    /* renamed from: y0  reason: collision with root package name */
    public int f1465y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1466z;

    /* renamed from: z0  reason: collision with root package name */
    public final f0 f1467z0;

    static {
        Class cls = Integer.TYPE;
        G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView G2 = G(viewGroup.getChildAt(i3));
            if (G2 != null) {
                return G2;
            }
        }
        return null;
    }

    public static f1 L(View view) {
        if (view == null) {
            return null;
        }
        return ((p0) view.getLayoutParams()).f4640a;
    }

    private int Z(int i3, float f6) {
        float y5;
        EdgeEffect edgeEffect;
        float width = f6 / ((float) getWidth());
        float height = ((float) i3) / ((float) getHeight());
        EdgeEffect edgeEffect2 = this.J;
        float f7 = 0.0f;
        if (edgeEffect2 == null || com.bumptech.glide.c.o(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.L;
            if (!(edgeEffect3 == null || com.bumptech.glide.c.o(edgeEffect3) == 0.0f)) {
                if (canScrollVertically(1)) {
                    edgeEffect = this.L;
                } else {
                    y5 = com.bumptech.glide.c.y(this.L, height, 1.0f - width);
                    if (com.bumptech.glide.c.o(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f7 = y5;
                    invalidate();
                }
            }
            return Math.round(f7 * ((float) getHeight()));
        } else if (canScrollVertically(-1)) {
            edgeEffect = this.J;
        } else {
            y5 = -com.bumptech.glide.c.y(this.J, -height, width);
            if (com.bumptech.glide.c.o(this.J) == 0.0f) {
                this.J.onRelease();
            }
            f7 = y5;
            invalidate();
            return Math.round(f7 * ((float) getHeight()));
        }
        edgeEffect.onRelease();
        invalidate();
        return Math.round(f7 * ((float) getHeight()));
    }

    private o getScrollingChildHelper() {
        if (this.f1450q0 == null) {
            this.f1450q0 = new o(this);
        }
        return this.f1450q0;
    }

    public static void l(f1 f1Var) {
        WeakReference weakReference = f1Var.f4484b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        f1Var.f4484b = null;
                        return;
                    } else if (view != f1Var.f4483a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static int o(int i3, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i6) {
        if (i3 > 0 && edgeEffect != null && com.bumptech.glide.c.o(edgeEffect) != 0.0f) {
            int round = Math.round(com.bumptech.glide.c.y(edgeEffect, (((float) (-i3)) * 4.0f) / ((float) i6), 0.5f) * (((float) (-i6)) / 4.0f));
            if (round != i3) {
                edgeEffect.finish();
            }
            return i3 - round;
        } else if (i3 >= 0 || edgeEffect2 == null || com.bumptech.glide.c.o(edgeEffect2) == 0.0f) {
            return i3;
        } else {
            float f6 = (float) i6;
            int round2 = Math.round(com.bumptech.glide.c.y(edgeEffect2, (((float) i3) * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
            if (round2 != i3) {
                edgeEffect2.finish();
            }
            return i3 - round2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z5) {
        A0 = z5;
    }

    public static void setVerboseLoggingEnabled(boolean z5) {
        B0 = z5;
    }

    public final void A() {
        int i3;
        int i6;
        if (this.J == null) {
            ((c1) this.H).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.J = edgeEffect;
            if (this.f1437k) {
                i6 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i6 = getMeasuredWidth();
                i3 = getMeasuredHeight();
            }
            edgeEffect.setSize(i6, i3);
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1445o + ", layout:" + this.f1447p + ", context:" + getContext();
    }

    public final void C(b1 b1Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1427e0.f4471f;
            overScroller.getFinalX();
            overScroller.getCurrX();
            b1Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        b1Var.getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View D(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (r7 == 2) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[LOOP:0: B:1:0x000c->B:21:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.f1453s
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x006c
            java.lang.Object r5 = r1.get(r4)
            p1.r0 r5 = (p1.r0) r5
            r6 = r5
            p1.p r6 = (p1.p) r6
            int r7 = r6.f4636v
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L_0x005c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.d(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.c(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L_0x0060
            if (r7 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x0060
        L_0x003f:
            if (r10 == 0) goto L_0x004c
            r6.w = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f4630p = r7
            goto L_0x0058
        L_0x004c:
            if (r7 == 0) goto L_0x0058
            r6.w = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f4627m = r7
        L_0x0058:
            r6.f(r9)
            goto L_0x005e
        L_0x005c:
            if (r7 != r9) goto L_0x0060
        L_0x005e:
            r6 = r8
            goto L_0x0061
        L_0x0060:
            r6 = r3
        L_0x0061:
            if (r6 == 0) goto L_0x0069
            r6 = 3
            if (r0 == r6) goto L_0x0069
            r12.f1455t = r5
            return r8
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.MotionEvent):boolean");
    }

    public final void F(int[] iArr) {
        int e6 = this.f1433i.e();
        if (e6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < e6; i7++) {
            f1 L2 = L(this.f1433i.d(i7));
            if (!L2.o()) {
                int c6 = L2.c();
                if (c6 < i3) {
                    i3 = c6;
                }
                if (c6 > i6) {
                    i6 = c6;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i6;
    }

    public final f1 H(int i3) {
        f1 f1Var = null;
        if (this.D) {
            return null;
        }
        int h6 = this.f1433i.h();
        for (int i6 = 0; i6 < h6; i6++) {
            f1 L2 = L(this.f1433i.g(i6));
            if (L2 != null && !L2.i() && I(L2) == i3) {
                if (!this.f1433i.j(L2.f4483a)) {
                    return L2;
                }
                f1Var = L2;
            }
        }
        return f1Var;
    }

    public final int I(f1 f1Var) {
        if (!((f1Var.f4492j & 524) != 0) && f1Var.f()) {
            b bVar = this.f1431h;
            int i3 = f1Var.f4485c;
            ArrayList arrayList = bVar.f4431b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = (a) arrayList.get(i6);
                int i7 = aVar.f4425a;
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i8 = aVar.f4426b;
                        if (i8 <= i3) {
                            int i9 = aVar.f4428d;
                            if (i8 + i9 <= i3) {
                                i3 -= i9;
                            }
                        } else {
                            continue;
                        }
                    } else if (i7 == 8) {
                        int i10 = aVar.f4426b;
                        if (i10 == i3) {
                            i3 = aVar.f4428d;
                        } else {
                            if (i10 < i3) {
                                i3--;
                            }
                            if (aVar.f4428d <= i3) {
                                i3++;
                            }
                        }
                    }
                } else if (aVar.f4426b <= i3) {
                    i3 += aVar.f4428d;
                }
            }
            return i3;
        }
        return -1;
    }

    public final long J(f1 f1Var) {
        return this.f1445o.f4509b ? f1Var.f4487e : (long) f1Var.f4485c;
    }

    public final f1 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        p0 p0Var = (p0) view.getLayoutParams();
        boolean z5 = p0Var.f4642c;
        Rect rect = p0Var.f4641b;
        if (!z5) {
            return rect;
        }
        if (this.f1432h0.f4444g && (p0Var.b() || p0Var.f4640a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1451r;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Rect rect2 = this.f1439l;
            rect2.set(0, 0, 0, 0);
            ((m0) arrayList.get(i3)).getClass();
            ((p0) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        p0Var.f4642c = false;
        return rect;
    }

    public final boolean N() {
        return this.F > 0;
    }

    public final void O(int i3) {
        if (this.f1447p != null) {
            setScrollState(2);
            this.f1447p.m0(i3);
            awakenScrollBars();
        }
    }

    public final void P() {
        int h6 = this.f1433i.h();
        for (int i3 = 0; i3 < h6; i3++) {
            ((p0) this.f1433i.g(i3).getLayoutParams()).f4642c = true;
        }
        ArrayList arrayList = this.f1428f.f4691c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            p0 p0Var = (p0) ((f1) arrayList.get(i6)).f4483a.getLayoutParams();
            if (p0Var != null) {
                p0Var.f4642c = true;
            }
        }
    }

    public final void Q(int i3, int i6, boolean z5) {
        int i7 = i3 + i6;
        int h6 = this.f1433i.h();
        for (int i8 = 0; i8 < h6; i8++) {
            f1 L2 = L(this.f1433i.g(i8));
            if (L2 != null && !L2.o()) {
                int i9 = L2.f4485c;
                if (i9 >= i7) {
                    if (B0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i8 + " holder " + L2 + " now at position " + (L2.f4485c - i6));
                    }
                    L2.l(-i6, z5);
                } else if (i9 >= i3) {
                    if (B0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i8 + " holder " + L2 + " now REMOVED");
                    }
                    L2.b(8);
                    L2.l(-i6, z5);
                    L2.f4485c = i3 - 1;
                }
                this.f1432h0.f4443f = true;
            }
        }
        v0 v0Var = this.f1428f;
        ArrayList arrayList = v0Var.f4691c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                f1 f1Var = (f1) arrayList.get(size);
                if (f1Var != null) {
                    int i10 = f1Var.f4485c;
                    if (i10 >= i7) {
                        if (B0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f1Var + " now at position " + (f1Var.f4485c - i6));
                        }
                        f1Var.l(-i6, z5);
                    } else if (i10 >= i3) {
                        f1Var.b(8);
                        v0Var.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.F++;
    }

    public final void S(boolean z5) {
        int i3;
        boolean z6 = true;
        int i6 = this.F - 1;
        this.F = i6;
        if (i6 >= 1) {
            return;
        }
        if (!A0 || i6 >= 0) {
            this.F = 0;
            if (z5) {
                int i7 = this.B;
                this.B = 0;
                if (i7 != 0) {
                    AccessibilityManager accessibilityManager = this.C;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z6 = false;
                    }
                    if (z6) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        y0.b.b(obtain, i7);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f1458u0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f1 f1Var = (f1) arrayList.get(size);
                    if (f1Var.f4483a.getParent() == this && !f1Var.o() && (i3 = f1Var.f4499q) != -1) {
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.s(f1Var.f4483a, i3);
                        f1Var.f4499q = -1;
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException(m.f(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    public final void T(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i3);
            int x5 = (int) (motionEvent.getX(i3) + 0.5f);
            this.S = x5;
            this.Q = x5;
            int y5 = (int) (motionEvent.getY(i3) + 0.5f);
            this.T = y5;
            this.R = y5;
        }
    }

    public final void U() {
        if (!this.f1444n0 && this.f1457u) {
            WeakHashMap weakHashMap = u0.f5622a;
            d0.m(this, this.f1460v0);
            this.f1444n0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r5.M != null && r5.f1447p.y0()) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V() {
        /*
            r5 = this;
            boolean r0 = r5.D
            if (r0 == 0) goto L_0x0019
            p1.b r0 = r5.f1431h
            java.util.ArrayList r1 = r0.f4431b
            r0.l(r1)
            java.util.ArrayList r1 = r0.f4432c
            r0.l(r1)
            boolean r0 = r5.E
            if (r0 == 0) goto L_0x0019
            p1.o0 r0 = r5.f1447p
            r0.W()
        L_0x0019:
            p1.l0 r0 = r5.M
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            p1.o0 r0 = r5.f1447p
            boolean r0 = r0.y0()
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            p1.b r0 = r5.f1431h
            r0.j()
            goto L_0x0037
        L_0x0032:
            p1.b r0 = r5.f1431h
            r0.c()
        L_0x0037:
            boolean r0 = r5.f1438k0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r5.f1440l0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            boolean r3 = r5.w
            if (r3 == 0) goto L_0x0061
            p1.l0 r3 = r5.M
            if (r3 == 0) goto L_0x0061
            boolean r3 = r5.D
            if (r3 != 0) goto L_0x0057
            if (r0 != 0) goto L_0x0057
            p1.o0 r4 = r5.f1447p
            boolean r4 = r4.f4600f
            if (r4 == 0) goto L_0x0061
        L_0x0057:
            if (r3 == 0) goto L_0x005f
            p1.g0 r3 = r5.f1445o
            boolean r3 = r3.f4509b
            if (r3 == 0) goto L_0x0061
        L_0x005f:
            r3 = r1
            goto L_0x0062
        L_0x0061:
            r3 = r2
        L_0x0062:
            p1.b1 r4 = r5.f1432h0
            r4.f4447j = r3
            if (r3 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r5.D
            if (r0 != 0) goto L_0x0080
            p1.l0 r0 = r5.M
            if (r0 == 0) goto L_0x007c
            p1.o0 r0 = r5.f1447p
            boolean r0 = r0.y0()
            if (r0 == 0) goto L_0x007c
            r0 = r1
            goto L_0x007d
        L_0x007c:
            r0 = r2
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r4.f4448k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.V():void");
    }

    public final void W(boolean z5) {
        this.E = z5 | this.E;
        this.D = true;
        int h6 = this.f1433i.h();
        for (int i3 = 0; i3 < h6; i3++) {
            f1 L2 = L(this.f1433i.g(i3));
            if (L2 != null && !L2.o()) {
                L2.b(6);
            }
        }
        P();
        v0 v0Var = this.f1428f;
        ArrayList arrayList = v0Var.f4691c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            f1 f1Var = (f1) arrayList.get(i6);
            if (f1Var != null) {
                f1Var.b(6);
                f1Var.a((Object) null);
            }
        }
        g0 g0Var = v0Var.f4696h.f1445o;
        if (g0Var == null || !g0Var.f4509b) {
            v0Var.g();
        }
    }

    public final void X(f1 f1Var, k0 k0Var) {
        boolean z5 = false;
        int i3 = (f1Var.f4492j & -8193) | 0;
        f1Var.f4492j = i3;
        boolean z6 = this.f1432h0.f4445h;
        r1 r1Var = this.f1435j;
        if (z6) {
            if ((i3 & 2) != 0) {
                z5 = true;
            }
            if (z5 && !f1Var.i() && !f1Var.o()) {
                ((k.d) r1Var.f4659c).e(J(f1Var), f1Var);
            }
        }
        r1Var.c(f1Var, k0Var);
    }

    public final int Y(int i3, float f6) {
        float y5;
        EdgeEffect edgeEffect;
        float height = f6 / ((float) getHeight());
        float width = ((float) i3) / ((float) getWidth());
        EdgeEffect edgeEffect2 = this.I;
        float f7 = 0.0f;
        if (edgeEffect2 == null || com.bumptech.glide.c.o(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.K;
            if (!(edgeEffect3 == null || com.bumptech.glide.c.o(edgeEffect3) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    edgeEffect = this.K;
                } else {
                    y5 = com.bumptech.glide.c.y(this.K, width, height);
                    if (com.bumptech.glide.c.o(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f7 = y5;
                    invalidate();
                }
            }
            return Math.round(f7 * ((float) getWidth()));
        } else if (canScrollHorizontally(-1)) {
            edgeEffect = this.I;
        } else {
            y5 = -com.bumptech.glide.c.y(this.I, -width, 1.0f - height);
            if (com.bumptech.glide.c.o(this.I) == 0.0f) {
                this.I.onRelease();
            }
            f7 = y5;
            invalidate();
            return Math.round(f7 * ((float) getWidth()));
        }
        edgeEffect.onRelease();
        invalidate();
        return Math.round(f7 * ((float) getWidth()));
    }

    public final void a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1439l;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p0) {
            p0 p0Var = (p0) layoutParams;
            if (!p0Var.f4642c) {
                int i3 = rect.left;
                Rect rect2 = p0Var.f4641b;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1447p.j0(this, view, this.f1439l, !this.w, view2 == null);
    }

    public final void addFocusables(ArrayList arrayList, int i3, int i6) {
        o0 o0Var = this.f1447p;
        if (o0Var != null) {
            o0Var.getClass();
        }
        super.addFocusables(arrayList, i3, i6);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z5 = false;
        j0(0);
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.L.isFinished();
        }
        if (z5) {
            WeakHashMap weakHashMap = u0.f5622a;
            d0.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.p()
            p1.g0 r0 = r8.f1445o
            int[] r11 = r8.f1456t0
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.d0(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList r0 = r8.f1451r
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.f1452r0
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r7 = r11
            r0.v(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r0 = r12
        L_0x005c:
            int r2 = r8.S
            int[] r4 = r8.f1452r0
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.S = r2
            int r2 = r8.T
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.T = r2
            int[] r2 = r8.f1454s0
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0118
            if (r21 == 0) goto L_0x0115
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008c
            r2 = r12
            goto L_0x008d
        L_0x008c:
            r2 = r13
        L_0x008d:
            if (r2 != 0) goto L_0x0115
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b5
            r18.y()
            android.widget.EdgeEffect r6 = r8.I
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            goto L_0x00cb
        L_0x00b5:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r18.z()
            android.widget.EdgeEffect r6 = r8.K
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
        L_0x00cb:
            com.bumptech.glide.c.y(r6, r11, r4)
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = r13
        L_0x00d1:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            r18.A()
            android.widget.EdgeEffect r4 = r8.J
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            com.bumptech.glide.c.y(r4, r6, r2)
            goto L_0x0105
        L_0x00eb:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0106
            r18.x()
            android.widget.EdgeEffect r4 = r8.L
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            com.bumptech.glide.c.y(r4, r6, r7)
        L_0x0105:
            r4 = 1
        L_0x0106:
            if (r4 != 0) goto L_0x0110
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0110
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
        L_0x0110:
            java.util.WeakHashMap r1 = x0.u0.f5622a
            x0.d0.k(r18)
        L_0x0115:
            r18.n(r19, r20)
        L_0x0118:
            if (r14 != 0) goto L_0x011c
            if (r15 == 0) goto L_0x011f
        L_0x011c:
            r8.w(r14, r15)
        L_0x011f:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0128
            r18.invalidate()
        L_0x0128:
            if (r0 != 0) goto L_0x0131
            if (r14 != 0) goto L_0x0131
            if (r15 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r12 = r13
            goto L_0x0132
        L_0x0131:
            r12 = 1
        L_0x0132:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p0) && this.f1447p.f((p0) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.d()) {
            return this.f1447p.j(this.f1432h0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.d()) {
            return this.f1447p.k(this.f1432h0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.d()) {
            return this.f1447p.l(this.f1432h0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.e()) {
            return this.f1447p.m(this.f1432h0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.e()) {
            return this.f1447p.n(this.f1432h0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        o0 o0Var = this.f1447p;
        if (o0Var != null && o0Var.e()) {
            return this.f1447p.o(this.f1432h0);
        }
        return 0;
    }

    public final void d0(int i3, int i6, int[] iArr) {
        f1 f1Var;
        h0();
        R();
        int i7 = k.f5089a;
        j.a("RV Scroll");
        b1 b1Var = this.f1432h0;
        C(b1Var);
        v0 v0Var = this.f1428f;
        int l02 = i3 != 0 ? this.f1447p.l0(i3, v0Var, b1Var) : 0;
        int n02 = i6 != 0 ? this.f1447p.n0(i6, v0Var, b1Var) : 0;
        j.b();
        int e6 = this.f1433i.e();
        for (int i8 = 0; i8 < e6; i8++) {
            View d6 = this.f1433i.d(i8);
            f1 K2 = K(d6);
            if (!(K2 == null || (f1Var = K2.f4491i) == null)) {
                int left = d6.getLeft();
                int top = d6.getTop();
                View view = f1Var.f4483a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S(true);
        i0(false);
        if (iArr != null) {
            iArr[0] = l02;
            iArr[1] = n02;
        }
    }

    public final boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return getScrollingChildHelper().a(f6, f7, z5);
    }

    public final boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    public final boolean dispatchNestedPreScroll(int i3, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i6, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i3, int i6, int i7, int i8, int[] iArr) {
        return getScrollingChildHelper().e(i3, i6, i7, i8, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z5;
        float f6;
        float f7;
        super.draw(canvas);
        ArrayList arrayList = this.f1451r;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((m0) arrayList.get(i3)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        boolean z7 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1437k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1437k) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1437k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.K;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1437k) {
                f7 = (float) (getPaddingRight() + (-getWidth()));
                f6 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f7 = (float) (-getWidth());
                f6 = (float) (-getHeight());
            }
            canvas.translate(f7, f6);
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z5 || this.M == null || arrayList.size() <= 0 || !this.M.f()) {
            z7 = z5;
        }
        if (z7) {
            WeakHashMap weakHashMap = u0.f5622a;
            d0.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public final void e0(int i3) {
        z zVar;
        if (!this.f1466z) {
            setScrollState(0);
            e1 e1Var = this.f1427e0;
            e1Var.f4475j.removeCallbacks(e1Var);
            e1Var.f4471f.abortAnimation();
            o0 o0Var = this.f1447p;
            if (!(o0Var == null || (zVar = o0Var.f4599e) == null)) {
                zVar.i();
            }
            o0 o0Var2 = this.f1447p;
            if (o0Var2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            o0Var2.m0(i3);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i3, int i6) {
        if (i3 > 0) {
            return true;
        }
        float o5 = com.bumptech.glide.c.o(edgeEffect) * ((float) i6);
        float f6 = this.f1424d * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i3)) * 0.35f) / f6));
        double d6 = (double) D0;
        return ((float) (Math.exp((d6 / (d6 - 1.0d)) * log) * ((double) f6))) < o5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x015a, code lost:
        if (r4 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0171, code lost:
        if (r3 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0174, code lost:
        if (r4 < 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0177, code lost:
        if (r3 < 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x017f, code lost:
        if ((r3 * r2) <= 0) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0187, code lost:
        if ((r3 * r2) >= 0) goto L_0x018a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            p1.o0 r0 = r13.f1447p
            r0.getClass()
            p1.g0 r0 = r13.f1445o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            p1.o0 r0 = r13.f1447p
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.N()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.f1466z
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            p1.b1 r4 = r13.f1432h0
            p1.v0 r5 = r13.f1428f
            r6 = 33
            r7 = 17
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r9) goto L_0x0030
            if (r15 != r1) goto L_0x008d
        L_0x0030:
            p1.o0 r0 = r13.f1447p
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0046
            if (r15 != r9) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003e
        L_0x003d:
            r0 = r6
        L_0x003e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x0071
            p1.o0 r10 = r13.f1447p
            boolean r10 = r10.d()
            if (r10 == 0) goto L_0x0071
            p1.o0 r0 = r13.f1447p
            int r0 = r0.A()
            if (r0 != r1) goto L_0x005b
            r0 = r1
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r15 != r9) goto L_0x0060
            r10 = r1
            goto L_0x0061
        L_0x0060:
            r10 = r2
        L_0x0061:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0067
            r0 = 66
            goto L_0x0068
        L_0x0067:
            r0 = r7
        L_0x0068:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 == 0) goto L_0x0088
            r13.p()
            android.view.View r0 = r13.D(r14)
            if (r0 != 0) goto L_0x007d
            return r8
        L_0x007d:
            r13.h0()
            p1.o0 r0 = r13.f1447p
            r0.Q(r14, r15, r5, r4)
            r13.i0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00ad
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00ac
            if (r0 == 0) goto L_0x00ac
            r13.p()
            android.view.View r0 = r13.D(r14)
            if (r0 != 0) goto L_0x009f
            return r8
        L_0x009f:
            r13.h0()
            p1.o0 r0 = r13.f1447p
            android.view.View r0 = r0.Q(r14, r15, r5, r4)
            r13.i0(r2)
            goto L_0x00ad
        L_0x00ac:
            r0 = r3
        L_0x00ad:
            if (r0 == 0) goto L_0x00c4
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c4
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c0
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c0:
            r13.a0(r0, r8)
            return r14
        L_0x00c4:
            if (r0 == 0) goto L_0x018a
            if (r0 == r13) goto L_0x018a
            if (r0 != r14) goto L_0x00cc
            goto L_0x018a
        L_0x00cc:
            android.view.View r3 = r13.D(r0)
            if (r3 != 0) goto L_0x00d5
            r1 = r2
            goto L_0x018b
        L_0x00d5:
            if (r14 != 0) goto L_0x00d9
            goto L_0x018b
        L_0x00d9:
            android.view.View r3 = r13.D(r14)
            if (r3 != 0) goto L_0x00e1
            goto L_0x018b
        L_0x00e1:
            int r3 = r14.getWidth()
            int r4 = r14.getHeight()
            android.graphics.Rect r5 = r13.f1439l
            r5.set(r2, r2, r3, r4)
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            android.graphics.Rect r8 = r13.f1441m
            r8.set(r2, r2, r3, r4)
            r13.offsetDescendantRectToMyCoords(r14, r5)
            r13.offsetDescendantRectToMyCoords(r0, r8)
            p1.o0 r2 = r13.f1447p
            int r2 = r2.A()
            if (r2 != r1) goto L_0x010b
            r2 = -1
            goto L_0x010c
        L_0x010b:
            r2 = r1
        L_0x010c:
            int r3 = r5.left
            int r4 = r8.left
            if (r3 < r4) goto L_0x0116
            int r10 = r5.right
            if (r10 > r4) goto L_0x011e
        L_0x0116:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x011e
            r3 = r1
            goto L_0x012b
        L_0x011e:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0126
            if (r3 < r11) goto L_0x012a
        L_0x0126:
            if (r3 <= r4) goto L_0x012a
            r3 = -1
            goto L_0x012b
        L_0x012a:
            r3 = 0
        L_0x012b:
            int r4 = r5.top
            int r10 = r8.top
            if (r4 < r10) goto L_0x0135
            int r11 = r5.bottom
            if (r11 > r10) goto L_0x013d
        L_0x0135:
            int r11 = r5.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x013d
            r4 = r1
            goto L_0x014a
        L_0x013d:
            int r5 = r5.bottom
            int r8 = r8.bottom
            if (r5 > r8) goto L_0x0145
            if (r4 < r8) goto L_0x0149
        L_0x0145:
            if (r4 <= r10) goto L_0x0149
            r4 = -1
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r15 == r1) goto L_0x0182
            if (r15 == r9) goto L_0x017a
            if (r15 == r7) goto L_0x0177
            if (r15 == r6) goto L_0x0174
            r2 = 66
            if (r15 == r2) goto L_0x0171
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x015d
            if (r4 <= 0) goto L_0x018a
            goto L_0x018b
        L_0x015d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = a2.m.f(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0171:
            if (r3 <= 0) goto L_0x018a
            goto L_0x018b
        L_0x0174:
            if (r4 >= 0) goto L_0x018a
            goto L_0x018b
        L_0x0177:
            if (r3 >= 0) goto L_0x018a
            goto L_0x018b
        L_0x017a:
            if (r4 > 0) goto L_0x018b
            if (r4 != 0) goto L_0x018a
            int r3 = r3 * r2
            if (r3 <= 0) goto L_0x018a
            goto L_0x018b
        L_0x0182:
            if (r4 < 0) goto L_0x018b
            if (r4 != 0) goto L_0x018a
            int r3 = r3 * r2
            if (r3 >= 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r1 = 0
        L_0x018b:
            if (r1 == 0) goto L_0x018e
            goto L_0x0192
        L_0x018e:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x0192:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i3, int i6, boolean z5) {
        o0 o0Var = this.f1447p;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1466z) {
            int i7 = 0;
            if (!o0Var.d()) {
                i3 = 0;
            }
            if (!this.f1447p.e()) {
                i6 = 0;
            }
            if (i3 != 0 || i6 != 0) {
                if (z5) {
                    if (i3 != 0) {
                        i7 = 1;
                    }
                    if (i6 != 0) {
                        i7 |= 2;
                    }
                    getScrollingChildHelper().g(i7, 1);
                }
                this.f1427e0.c(i3, i6, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o0 o0Var = this.f1447p;
        if (o0Var != null) {
            return o0Var.r();
        }
        throw new IllegalStateException(m.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o0 o0Var = this.f1447p;
        if (o0Var != null) {
            return o0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(m.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g0 getAdapter() {
        return this.f1445o;
    }

    public int getBaseline() {
        o0 o0Var = this.f1447p;
        if (o0Var == null) {
            return super.getBaseline();
        }
        o0Var.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i3, int i6) {
        return super.getChildDrawingOrder(i3, i6);
    }

    public boolean getClipToPadding() {
        return this.f1437k;
    }

    public h1 getCompatAccessibilityDelegate() {
        return this.f1446o0;
    }

    public j0 getEdgeEffectFactory() {
        return this.H;
    }

    public l0 getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.f1451r.size();
    }

    public o0 getLayoutManager() {
        return this.f1447p;
    }

    public int getMaxFlingVelocity() {
        return this.f1421a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        if (F0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q0 getOnFlingListener() {
        return this.V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1425d0;
    }

    public p1.u0 getRecycledViewPool() {
        return this.f1428f.c();
    }

    public int getScrollState() {
        return this.N;
    }

    public final void h(f1 f1Var) {
        View view = f1Var.f4483a;
        boolean z5 = view.getParent() == this;
        this.f1428f.m(K(view));
        if (f1Var.k()) {
            this.f1433i.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        d dVar = this.f1433i;
        if (!z5) {
            dVar.a(view, -1, true);
            return;
        }
        int indexOfChild = dVar.f4456a.f4481a.indexOfChild(view);
        if (indexOfChild >= 0) {
            dVar.f4457b.h(indexOfChild);
            dVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void h0() {
        int i3 = this.f1462x + 1;
        this.f1462x = i3;
        if (i3 == 1 && !this.f1466z) {
            this.f1464y = false;
        }
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final void i(m0 m0Var) {
        o0 o0Var = this.f1447p;
        if (o0Var != null) {
            o0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1451r;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m0Var);
        P();
        requestLayout();
    }

    public final void i0(boolean z5) {
        if (this.f1462x < 1) {
            if (!A0) {
                this.f1462x = 1;
            } else {
                throw new IllegalStateException(m.f(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z5 && !this.f1466z) {
            this.f1464y = false;
        }
        if (this.f1462x == 1) {
            if (z5 && this.f1464y && !this.f1466z && this.f1447p != null && this.f1445o != null) {
                r();
            }
            if (!this.f1466z) {
                this.f1464y = false;
            }
        }
        this.f1462x--;
    }

    public final boolean isAttachedToWindow() {
        return this.f1457u;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1466z;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5596d;
    }

    public final void j(s0 s0Var) {
        if (this.f1436j0 == null) {
            this.f1436j0 = new ArrayList();
        }
        this.f1436j0.add(s0Var);
    }

    public final void j0(int i3) {
        getScrollingChildHelper().h(i3);
    }

    public final void k(String str) {
        if (N()) {
            if (str == null) {
                throw new IllegalStateException(m.f(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m.f(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h6 = this.f1433i.h();
        for (int i3 = 0; i3 < h6; i3++) {
            f1 L2 = L(this.f1433i.g(i3));
            if (!L2.o()) {
                L2.f4486d = -1;
                L2.f4489g = -1;
            }
        }
        v0 v0Var = this.f1428f;
        ArrayList arrayList = v0Var.f4691c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            f1 f1Var = (f1) arrayList.get(i6);
            f1Var.f4486d = -1;
            f1Var.f4489g = -1;
        }
        ArrayList arrayList2 = v0Var.f4689a;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            f1 f1Var2 = (f1) arrayList2.get(i7);
            f1Var2.f4486d = -1;
            f1Var2.f4489g = -1;
        }
        ArrayList arrayList3 = v0Var.f4690b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                f1 f1Var3 = (f1) v0Var.f4690b.get(i8);
                f1Var3.f4486d = -1;
                f1Var3.f4489g = -1;
            }
        }
    }

    public final void n(int i3, int i6) {
        boolean z5;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z5 = false;
        } else {
            this.I.onRelease();
            z5 = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.K.onRelease();
            z5 |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i6 > 0) {
            this.J.onRelease();
            z5 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i6 < 0) {
            this.L.onRelease();
            z5 |= this.L.isFinished();
        }
        if (z5) {
            WeakHashMap weakHashMap = u0.f5622a;
            d0.k(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r1 >= 30.0f) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.f1457u = r1
            boolean r2 = r5.w
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.w = r2
            p1.v0 r2 = r5.f1428f
            r2.e()
            p1.o0 r2 = r5.f1447p
            if (r2 == 0) goto L_0x0023
            r2.f4601g = r1
        L_0x0023:
            r5.f1444n0 = r0
            boolean r0 = F0
            if (r0 == 0) goto L_0x0080
            java.lang.ThreadLocal r0 = p1.s.f4660h
            java.lang.Object r1 = r0.get()
            p1.s r1 = (p1.s) r1
            r5.f0 = r1
            if (r1 != 0) goto L_0x0063
            p1.s r1 = new p1.s
            r1.<init>()
            r5.f0 = r1
            java.util.WeakHashMap r1 = x0.u0.f5622a
            android.view.Display r1 = x0.e0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0057:
            p1.s r2 = r5.f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4664f = r3
            r0.set(r2)
        L_0x0063:
            p1.s r0 = r5.f0
            r0.getClass()
            boolean r1 = A0
            java.util.ArrayList r0 = r0.f4662d
            if (r1 == 0) goto L_0x007d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L_0x007d:
            r0.add(r5)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        v0 v0Var;
        s sVar;
        z zVar;
        super.onDetachedFromWindow();
        l0 l0Var = this.M;
        if (l0Var != null) {
            l0Var.e();
        }
        setScrollState(0);
        e1 e1Var = this.f1427e0;
        e1Var.f4475j.removeCallbacks(e1Var);
        e1Var.f4471f.abortAnimation();
        o0 o0Var = this.f1447p;
        if (!(o0Var == null || (zVar = o0Var.f4599e) == null)) {
            zVar.i();
        }
        this.f1457u = false;
        o0 o0Var2 = this.f1447p;
        if (o0Var2 != null) {
            o0Var2.f4601g = false;
            o0Var2.P(this);
        }
        this.f1458u0.clear();
        removeCallbacks(this.f1460v0);
        this.f1435j.getClass();
        do {
        } while (q1.f4648d.b() != null);
        int i3 = 0;
        while (true) {
            v0Var = this.f1428f;
            ArrayList arrayList = v0Var.f4691c;
            if (i3 >= arrayList.size()) {
                break;
            }
            e.e(((f1) arrayList.get(i3)).f4483a);
            i3++;
        }
        v0Var.f(v0Var.f4696h.f1445o, false);
        a1 a1Var = new a1(0, this);
        while (a1Var.hasNext()) {
            View view = (View) a1Var.next();
            d1.a aVar = (d1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new d1.a();
                view.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f2145a;
            int v5 = v.v(arrayList2);
            if (-1 < v5) {
                m.o(arrayList2.get(v5));
                throw null;
            }
        }
        if (F0 && (sVar = this.f0) != null) {
            boolean remove = sVar.f4662d.remove(this);
            if (!A0 || remove) {
                this.f0 = null;
                return;
            }
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1451r;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((m0) arrayList.get(i3)).a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            p1.o0 r0 = r6.f1447p
            r8 = 0
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            boolean r0 = r6.f1466z
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            int r0 = r16.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00f1
            int r0 = r16.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x003f
            p1.o0 r0 = r6.f1447p
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            p1.o0 r2 = r6.f1447p
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0057
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0065
        L_0x003f:
            int r0 = r16.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0063
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            p1.o0 r0 = r6.f1447p
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0059
            float r0 = -r2
        L_0x0057:
            r2 = r1
            goto L_0x0065
        L_0x0059:
            p1.o0 r0 = r6.f1447p
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0063
            r0 = r1
            goto L_0x0065
        L_0x0063:
            r0 = r1
            r2 = r0
        L_0x0065:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00f1
        L_0x006d:
            float r1 = r6.f1422b0
            float r2 = r2 * r1
            int r1 = (int) r2
            float r2 = r6.f1423c0
            float r0 = r0 * r2
            int r0 = (int) r0
            p1.o0 r2 = r6.f1447p
            if (r2 != 0) goto L_0x0082
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L_0x00f1
        L_0x0082:
            boolean r3 = r6.f1466z
            if (r3 == 0) goto L_0x0088
            goto L_0x00f1
        L_0x0088:
            int[] r9 = r6.f1456t0
            r9[r8] = r8
            r10 = 1
            r9[r10] = r8
            boolean r11 = r2.d()
            p1.o0 r2 = r6.f1447p
            boolean r12 = r2.e()
            if (r12 == 0) goto L_0x009e
            r2 = r11 | 2
            goto L_0x009f
        L_0x009e:
            r2 = r11
        L_0x009f:
            float r3 = r16.getY()
            float r4 = r16.getX()
            int r3 = r15.Y(r1, r3)
            int r13 = r1 - r3
            int r1 = r15.Z(r0, r4)
            int r14 = r0 - r1
            x0.o r0 = r15.getScrollingChildHelper()
            r0.g(r2, r10)
            if (r11 == 0) goto L_0x00be
            r1 = r13
            goto L_0x00bf
        L_0x00be:
            r1 = r8
        L_0x00bf:
            if (r12 == 0) goto L_0x00c3
            r2 = r14
            goto L_0x00c4
        L_0x00c3:
            r2 = r8
        L_0x00c4:
            int[] r4 = r6.f1456t0
            int[] r5 = r6.f1452r0
            r3 = 1
            r0 = r15
            boolean r0 = r0.u(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d6
            r0 = r9[r8]
            int r13 = r13 - r0
            r0 = r9[r10]
            int r14 = r14 - r0
        L_0x00d6:
            if (r11 == 0) goto L_0x00da
            r0 = r13
            goto L_0x00db
        L_0x00da:
            r0 = r8
        L_0x00db:
            if (r12 == 0) goto L_0x00df
            r1 = r14
            goto L_0x00e0
        L_0x00df:
            r1 = r8
        L_0x00e0:
            r15.c0(r0, r1, r7, r10)
            p1.s r0 = r6.f0
            if (r0 == 0) goto L_0x00ee
            if (r13 != 0) goto L_0x00eb
            if (r14 == 0) goto L_0x00ee
        L_0x00eb:
            r0.a(r15, r13, r14)
        L_0x00ee:
            r15.j0(r10)
        L_0x00f1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        if (this.f1466z) {
            return false;
        }
        this.f1455t = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        o0 o0Var = this.f1447p;
        if (o0Var == null) {
            return false;
        }
        boolean d6 = o0Var.d();
        boolean e6 = this.f1447p.e();
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.O = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.S = x5;
            this.Q = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.T = y5;
            this.R = y5;
            EdgeEffect edgeEffect = this.I;
            if (edgeEffect == null || com.bumptech.glide.c.o(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z5 = false;
            } else {
                com.bumptech.glide.c.y(this.I, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z5 = true;
            }
            EdgeEffect edgeEffect2 = this.K;
            if (!(edgeEffect2 == null || com.bumptech.glide.c.o(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
                com.bumptech.glide.c.y(this.K, 0.0f, motionEvent.getY() / ((float) getHeight()));
                z5 = true;
            }
            EdgeEffect edgeEffect3 = this.J;
            if (!(edgeEffect3 == null || com.bumptech.glide.c.o(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
                com.bumptech.glide.c.y(this.J, 0.0f, motionEvent.getX() / ((float) getWidth()));
                z5 = true;
            }
            EdgeEffect edgeEffect4 = this.L;
            if (!(edgeEffect4 == null || com.bumptech.glide.c.o(edgeEffect4) == 0.0f || canScrollVertically(1))) {
                com.bumptech.glide.c.y(this.L, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z5 = true;
            }
            if (z5 || this.N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.f1454s0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e6) {
                d6 |= true;
            }
            getScrollingChildHelper().g(d6 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.P.clear();
            j0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.O);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.N != 1) {
                int i3 = x6 - this.Q;
                int i6 = y6 - this.R;
                if (!d6 || Math.abs(i3) <= this.U) {
                    z6 = false;
                } else {
                    this.S = x6;
                    z6 = true;
                }
                if (e6 && Math.abs(i6) > this.U) {
                    this.T = y6;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            b0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.O = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.S = x7;
            this.Q = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.T = y7;
            this.R = y7;
        } else if (actionMasked == 6) {
            T(motionEvent);
        }
        return this.N == 1;
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        int i9 = k.f5089a;
        j.a("RV OnLayout");
        r();
        j.b();
        this.w = true;
    }

    public final void onMeasure(int i3, int i6) {
        o0 o0Var = this.f1447p;
        if (o0Var == null) {
            q(i3, i6);
            return;
        }
        boolean J2 = o0Var.J();
        boolean z5 = false;
        b1 b1Var = this.f1432h0;
        if (J2) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i6);
            this.f1447p.f4596b.q(i3, i6);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.f1461w0 = z5;
            if (!z5 && this.f1445o != null) {
                if (b1Var.f4441d == 1) {
                    s();
                }
                this.f1447p.p0(i3, i6);
                b1Var.f4446i = true;
                t();
                this.f1447p.r0(i3, i6);
                if (this.f1447p.u0()) {
                    this.f1447p.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    b1Var.f4446i = true;
                    t();
                    this.f1447p.r0(i3, i6);
                }
                this.f1463x0 = getMeasuredWidth();
                this.f1465y0 = getMeasuredHeight();
            }
        } else if (this.f1459v) {
            this.f1447p.f4596b.q(i3, i6);
        } else if (b1Var.f4448k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            g0 g0Var = this.f1445o;
            if (g0Var != null) {
                b1Var.f4442e = g0Var.a();
            } else {
                b1Var.f4442e = 0;
            }
            h0();
            this.f1447p.f4596b.q(i3, i6);
            i0(false);
            b1Var.f4444g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y0 y0Var = (y0) parcelable;
        this.f1429g = y0Var;
        super.onRestoreInstanceState(y0Var.f2483d);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        y0 y0Var = new y0(super.onSaveInstanceState());
        y0 y0Var2 = this.f1429g;
        if (y0Var2 != null) {
            y0Var.f4717f = y0Var2.f4717f;
        } else {
            o0 o0Var = this.f1447p;
            y0Var.f4717f = o0Var != null ? o0Var.d0() : null;
        }
        return y0Var;
    }

    public final void onSizeChanged(int i3, int i6, int i7, int i8) {
        super.onSizeChanged(i3, i6, i7, i8);
        if (i3 != i7 || i6 != i8) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0516, code lost:
        if (r8 != false) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        if (r15 >= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0139, code lost:
        if (r12 >= 0) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x058b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            r24 = this;
            r6 = r24
            r7 = r25
            boolean r0 = r6.f1466z
            r8 = 0
            if (r0 != 0) goto L_0x0592
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x000f
            goto L_0x0592
        L_0x000f:
            p1.r0 r0 = r6.f1455t
            r1 = 2
            r2 = 0
            r3 = 0
            r9 = 1
            r4 = 3
            if (r0 != 0) goto L_0x0027
            int r0 = r25.getAction()
            if (r0 != 0) goto L_0x0021
            r0 = r8
            goto L_0x014f
        L_0x0021:
            boolean r0 = r24.E(r25)
            goto L_0x014f
        L_0x0027:
            p1.p r0 = (p1.p) r0
            int r5 = r0.f4636v
            if (r5 != 0) goto L_0x002f
            goto L_0x0144
        L_0x002f:
            int r5 = r25.getAction()
            if (r5 != 0) goto L_0x006f
            float r5 = r25.getX()
            float r10 = r25.getY()
            boolean r5 = r0.d(r5, r10)
            float r10 = r25.getX()
            float r11 = r25.getY()
            boolean r10 = r0.c(r10, r11)
            if (r5 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0144
        L_0x0051:
            if (r10 == 0) goto L_0x005e
            r0.w = r9
            float r5 = r25.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f4630p = r5
            goto L_0x006a
        L_0x005e:
            if (r5 == 0) goto L_0x006a
            r0.w = r1
            float r5 = r25.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f4627m = r5
        L_0x006a:
            r0.f(r1)
            goto L_0x0144
        L_0x006f:
            int r5 = r25.getAction()
            if (r5 != r9) goto L_0x0084
            int r5 = r0.f4636v
            if (r5 != r1) goto L_0x0084
            r0.f4627m = r3
            r0.f4630p = r3
            r0.f(r9)
            r0.w = r8
            goto L_0x0144
        L_0x0084:
            int r5 = r25.getAction()
            if (r5 != r1) goto L_0x0144
            int r5 = r0.f4636v
            if (r5 != r1) goto L_0x0144
            r0.g()
            int r5 = r0.w
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.f4616b
            if (r5 != r9) goto L_0x00ed
            float r5 = r25.getX()
            int[] r12 = r0.f4638y
            r12[r8] = r11
            int r13 = r0.f4631q
            int r13 = r13 - r11
            r12[r9] = r13
            float r14 = (float) r11
            float r13 = (float) r13
            float r5 = java.lang.Math.min(r13, r5)
            float r5 = java.lang.Math.max(r14, r5)
            int r13 = r0.f4629o
            float r13 = (float) r13
            float r13 = r13 - r5
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00bd
            goto L_0x00ed
        L_0x00bd:
            float r13 = r0.f4630p
            androidx.recyclerview.widget.RecyclerView r14 = r0.f4633s
            int r14 = r14.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r15 = r0.f4633s
            int r15 = r15.computeHorizontalScrollOffset()
            int r3 = r0.f4631q
            r17 = r12[r9]
            r12 = r12[r8]
            int r12 = r17 - r12
            if (r12 != 0) goto L_0x00d7
        L_0x00d5:
            r3 = r8
            goto L_0x00e4
        L_0x00d7:
            float r13 = r5 - r13
            float r12 = (float) r12
            float r13 = r13 / r12
            int r14 = r14 - r3
            float r3 = (float) r14
            float r13 = r13 * r3
            int r3 = (int) r13
            int r15 = r15 + r3
            if (r15 >= r14) goto L_0x00d5
            if (r15 < 0) goto L_0x00d5
        L_0x00e4:
            if (r3 == 0) goto L_0x00eb
            androidx.recyclerview.widget.RecyclerView r12 = r0.f4633s
            r12.scrollBy(r3, r8)
        L_0x00eb:
            r0.f4630p = r5
        L_0x00ed:
            int r3 = r0.w
            if (r3 != r1) goto L_0x0144
            float r3 = r25.getY()
            int[] r5 = r0.f4637x
            r5[r8] = r11
            int r12 = r0.f4632r
            int r12 = r12 - r11
            r5[r9] = r12
            float r11 = (float) r11
            float r12 = (float) r12
            float r3 = java.lang.Math.min(r12, r3)
            float r3 = java.lang.Math.max(r11, r3)
            int r11 = r0.f4626l
            float r11 = (float) r11
            float r11 = r11 - r3
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0115
            goto L_0x0144
        L_0x0115:
            float r10 = r0.f4627m
            androidx.recyclerview.widget.RecyclerView r11 = r0.f4633s
            int r11 = r11.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f4633s
            int r12 = r12.computeVerticalScrollOffset()
            int r13 = r0.f4632r
            r14 = r5[r9]
            r5 = r5[r8]
            int r14 = r14 - r5
            if (r14 != 0) goto L_0x012e
        L_0x012c:
            r5 = r8
            goto L_0x013b
        L_0x012e:
            float r5 = r3 - r10
            float r10 = (float) r14
            float r5 = r5 / r10
            int r11 = r11 - r13
            float r10 = (float) r11
            float r5 = r5 * r10
            int r5 = (int) r5
            int r12 = r12 + r5
            if (r12 >= r11) goto L_0x012c
            if (r12 < 0) goto L_0x012c
        L_0x013b:
            if (r5 == 0) goto L_0x0142
            androidx.recyclerview.widget.RecyclerView r10 = r0.f4633s
            r10.scrollBy(r8, r5)
        L_0x0142:
            r0.f4627m = r3
        L_0x0144:
            int r0 = r25.getAction()
            if (r0 == r4) goto L_0x014c
            if (r0 != r9) goto L_0x014e
        L_0x014c:
            r6.f1455t = r2
        L_0x014e:
            r0 = r9
        L_0x014f:
            if (r0 == 0) goto L_0x0158
            r24.b0()
            r6.setScrollState(r8)
            return r9
        L_0x0158:
            p1.o0 r0 = r6.f1447p
            if (r0 != 0) goto L_0x015d
            return r8
        L_0x015d:
            boolean r10 = r0.d()
            p1.o0 r0 = r6.f1447p
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.P
            if (r0 != 0) goto L_0x0171
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.P = r0
        L_0x0171:
            int r0 = r25.getActionMasked()
            int r3 = r25.getActionIndex()
            int[] r12 = r6.f1454s0
            if (r0 != 0) goto L_0x0181
            r12[r9] = r8
            r12[r8] = r8
        L_0x0181:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r25)
            r5 = r12[r8]
            float r5 = (float) r5
            r14 = r12[r9]
            float r14 = (float) r14
            r13.offsetLocation(r5, r14)
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0556
            java.lang.String r14 = "RecyclerView"
            if (r0 == r9) goto L_0x02c5
            if (r0 == r1) goto L_0x01cb
            if (r0 == r4) goto L_0x01c3
            r1 = 5
            if (r0 == r1) goto L_0x01a7
            r1 = 6
            if (r0 == r1) goto L_0x01a2
            goto L_0x02c0
        L_0x01a2:
            r24.T(r25)
            goto L_0x02c0
        L_0x01a7:
            int r0 = r7.getPointerId(r3)
            r6.O = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r5
            int r0 = (int) r0
            r6.S = r0
            r6.Q = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r5
            int r0 = (int) r0
            r6.T = r0
            r6.R = r0
            goto L_0x02c0
        L_0x01c3:
            r24.b0()
            r6.setScrollState(r8)
            goto L_0x02c0
        L_0x01cb:
            int r0 = r6.O
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x01ec
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.O
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r14, r0)
            return r8
        L_0x01ec:
            float r1 = r7.getX(r0)
            float r1 = r1 + r5
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r5
            int r15 = (int) r0
            int r0 = r6.S
            int r0 = r0 - r14
            int r1 = r6.T
            int r1 = r1 - r15
            int r2 = r6.N
            if (r2 == r9) goto L_0x0231
            if (r10 == 0) goto L_0x0217
            int r2 = r6.U
            if (r0 <= 0) goto L_0x020e
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x0213
        L_0x020e:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x0213:
            if (r0 == 0) goto L_0x0217
            r2 = r9
            goto L_0x0218
        L_0x0217:
            r2 = r8
        L_0x0218:
            if (r11 == 0) goto L_0x022c
            int r3 = r6.U
            if (r1 <= 0) goto L_0x0224
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x0229
        L_0x0224:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x0229:
            if (r1 == 0) goto L_0x022c
            r2 = r9
        L_0x022c:
            if (r2 == 0) goto L_0x0231
            r6.setScrollState(r9)
        L_0x0231:
            int r2 = r6.N
            if (r2 != r9) goto L_0x02c0
            int[] r5 = r6.f1456t0
            r5[r8] = r8
            r5[r9] = r8
            float r2 = r25.getY()
            int r2 = r6.Y(r0, r2)
            int r16 = r0 - r2
            float r0 = r25.getX()
            int r0 = r6.Z(r1, r0)
            int r17 = r1 - r0
            if (r10 == 0) goto L_0x0254
            r1 = r16
            goto L_0x0255
        L_0x0254:
            r1 = r8
        L_0x0255:
            if (r11 == 0) goto L_0x025a
            r2 = r17
            goto L_0x025b
        L_0x025a:
            r2 = r8
        L_0x025b:
            int[] r4 = r6.f1456t0
            int[] r3 = r6.f1452r0
            r18 = 0
            r0 = r24
            r19 = r3
            r3 = r18
            r18 = r5
            r5 = r19
            boolean r0 = r0.u(r1, r2, r3, r4, r5)
            int[] r1 = r6.f1452r0
            if (r0 == 0) goto L_0x0290
            r0 = r18[r8]
            int r16 = r16 - r0
            r0 = r18[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r24.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0290:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.S = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.T = r15
            if (r10 == 0) goto L_0x02a2
            r1 = r0
            goto L_0x02a3
        L_0x02a2:
            r1 = r8
        L_0x02a3:
            if (r11 == 0) goto L_0x02a7
            r3 = r2
            goto L_0x02a8
        L_0x02a7:
            r3 = r8
        L_0x02a8:
            boolean r1 = r6.c0(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x02b5
            android.view.ViewParent r1 = r24.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x02b5:
            p1.s r1 = r6.f0
            if (r1 == 0) goto L_0x02c0
            if (r0 != 0) goto L_0x02bd
            if (r2 == 0) goto L_0x02c0
        L_0x02bd:
            r1.a(r6, r0, r2)
        L_0x02c0:
            r0 = r6
            r21 = r13
            goto L_0x0580
        L_0x02c5:
            android.view.VelocityTracker r0 = r6.P
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.P
            int r1 = r6.f1421a0
            float r3 = (float) r1
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4, r3)
            if (r10 == 0) goto L_0x02e0
            android.view.VelocityTracker r0 = r6.P
            int r3 = r6.O
            float r0 = r0.getXVelocity(r3)
            float r0 = -r0
            goto L_0x02e1
        L_0x02e0:
            r0 = 0
        L_0x02e1:
            if (r11 == 0) goto L_0x02ed
            android.view.VelocityTracker r3 = r6.P
            int r4 = r6.O
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L_0x02ee
        L_0x02ed:
            r3 = 0
        L_0x02ee:
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x02fe
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x02f8
            goto L_0x02fe
        L_0x02f8:
            r0 = r6
            r1 = r8
            r21 = r13
            goto L_0x054b
        L_0x02fe:
            int r0 = (int) r0
            int r3 = (int) r3
            p1.o0 r4 = r6.f1447p
            if (r4 != 0) goto L_0x030a
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r14, r0)
            goto L_0x0331
        L_0x030a:
            boolean r5 = r6.f1466z
            if (r5 == 0) goto L_0x030f
            goto L_0x0331
        L_0x030f:
            boolean r4 = r4.d()
            p1.o0 r5 = r6.f1447p
            boolean r5 = r5.e()
            int r7 = r6.W
            if (r4 == 0) goto L_0x0323
            int r10 = java.lang.Math.abs(r0)
            if (r10 >= r7) goto L_0x0324
        L_0x0323:
            r0 = r8
        L_0x0324:
            if (r5 == 0) goto L_0x032c
            int r10 = java.lang.Math.abs(r3)
            if (r10 >= r7) goto L_0x032d
        L_0x032c:
            r3 = r8
        L_0x032d:
            if (r0 != 0) goto L_0x0334
            if (r3 != 0) goto L_0x0334
        L_0x0331:
            r0 = r8
            goto L_0x03e1
        L_0x0334:
            if (r0 == 0) goto L_0x0378
            android.widget.EdgeEffect r7 = r6.I
            if (r7 == 0) goto L_0x0356
            float r7 = com.bumptech.glide.c.o(r7)
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0356
            android.widget.EdgeEffect r7 = r6.I
            int r10 = -r0
            int r11 = r24.getWidth()
            boolean r7 = r6.f0(r7, r10, r11)
            if (r7 == 0) goto L_0x0375
            android.widget.EdgeEffect r0 = r6.I
            r0.onAbsorb(r10)
            goto L_0x0374
        L_0x0356:
            android.widget.EdgeEffect r7 = r6.K
            if (r7 == 0) goto L_0x0378
            float r7 = com.bumptech.glide.c.o(r7)
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0378
            android.widget.EdgeEffect r7 = r6.K
            int r10 = r24.getWidth()
            boolean r7 = r6.f0(r7, r0, r10)
            if (r7 == 0) goto L_0x0375
            android.widget.EdgeEffect r7 = r6.K
            r7.onAbsorb(r0)
        L_0x0374:
            r0 = r8
        L_0x0375:
            r7 = r0
            r0 = r8
            goto L_0x0379
        L_0x0378:
            r7 = r8
        L_0x0379:
            if (r3 == 0) goto L_0x03bc
            android.widget.EdgeEffect r10 = r6.J
            if (r10 == 0) goto L_0x039b
            float r10 = com.bumptech.glide.c.o(r10)
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x039b
            android.widget.EdgeEffect r10 = r6.J
            int r11 = -r3
            int r12 = r24.getHeight()
            boolean r10 = r6.f0(r10, r11, r12)
            if (r10 == 0) goto L_0x03ba
            android.widget.EdgeEffect r3 = r6.J
            r3.onAbsorb(r11)
            goto L_0x03b9
        L_0x039b:
            android.widget.EdgeEffect r10 = r6.L
            if (r10 == 0) goto L_0x03bc
            float r10 = com.bumptech.glide.c.o(r10)
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x03bc
            android.widget.EdgeEffect r10 = r6.L
            int r11 = r24.getHeight()
            boolean r10 = r6.f0(r10, r3, r11)
            if (r10 == 0) goto L_0x03ba
            android.widget.EdgeEffect r10 = r6.L
            r10.onAbsorb(r3)
        L_0x03b9:
            r3 = r8
        L_0x03ba:
            r10 = r8
            goto L_0x03be
        L_0x03bc:
            r10 = r3
            r3 = r8
        L_0x03be:
            p1.e1 r11 = r6.f1427e0
            if (r7 != 0) goto L_0x03c4
            if (r3 == 0) goto L_0x03d8
        L_0x03c4:
            int r12 = -r1
            int r7 = java.lang.Math.min(r7, r1)
            int r7 = java.lang.Math.max(r12, r7)
            int r3 = java.lang.Math.min(r3, r1)
            int r3 = java.lang.Math.max(r12, r3)
            r11.a(r7, r3)
        L_0x03d8:
            if (r0 != 0) goto L_0x03e5
            if (r10 != 0) goto L_0x03e5
            if (r7 != 0) goto L_0x03e0
            if (r3 == 0) goto L_0x0331
        L_0x03e0:
            r0 = r9
        L_0x03e1:
            r21 = r13
            goto L_0x0546
        L_0x03e5:
            float r3 = (float) r0
            float r7 = (float) r10
            boolean r12 = r6.dispatchNestedPreFling(r3, r7)
            if (r12 != 0) goto L_0x0543
            if (r4 != 0) goto L_0x03f4
            if (r5 == 0) goto L_0x03f2
            goto L_0x03f4
        L_0x03f2:
            r12 = r8
            goto L_0x03f5
        L_0x03f4:
            r12 = r9
        L_0x03f5:
            r6.dispatchNestedFling(r3, r7, r12)
            p1.q0 r3 = r6.V
            if (r3 == 0) goto L_0x0519
            p1.d0 r3 = (p1.d0) r3
            androidx.recyclerview.widget.RecyclerView r7 = r3.f4461a
            p1.o0 r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0407
            goto L_0x040f
        L_0x0407:
            androidx.recyclerview.widget.RecyclerView r14 = r3.f4461a
            p1.g0 r14 = r14.getAdapter()
            if (r14 != 0) goto L_0x0415
        L_0x040f:
            r23 = r11
            r21 = r13
            goto L_0x0516
        L_0x0415:
            androidx.recyclerview.widget.RecyclerView r14 = r3.f4461a
            int r14 = r14.getMinFlingVelocity()
            int r15 = java.lang.Math.abs(r10)
            if (r15 > r14) goto L_0x042e
            int r15 = java.lang.Math.abs(r0)
            if (r15 <= r14) goto L_0x0428
            goto L_0x042e
        L_0x0428:
            r23 = r11
            r21 = r13
            goto L_0x0515
        L_0x042e:
            boolean r14 = r7 instanceof p1.a1
            if (r14 != 0) goto L_0x0433
            goto L_0x0444
        L_0x0433:
            if (r14 != 0) goto L_0x0437
            r15 = r2
            goto L_0x0442
        L_0x0437:
            p1.c0 r15 = new p1.c0
            androidx.recyclerview.widget.RecyclerView r2 = r3.f4461a
            android.content.Context r2 = r2.getContext()
            r15.<init>(r3, r2, r8)
        L_0x0442:
            if (r15 != 0) goto L_0x044a
        L_0x0444:
            r23 = r11
            r21 = r13
            goto L_0x0509
        L_0x044a:
            int r2 = r7.z()
            if (r2 != 0) goto L_0x0451
            goto L_0x046a
        L_0x0451:
            boolean r19 = r7.e()
            if (r19 == 0) goto L_0x045c
            p1.b0 r3 = r3.d(r7)
            goto L_0x0468
        L_0x045c:
            boolean r19 = r7.d()
            if (r19 == 0) goto L_0x0467
            p1.b0 r3 = r3.c(r7)
            goto L_0x0468
        L_0x0467:
            r3 = 0
        L_0x0468:
            if (r3 != 0) goto L_0x0470
        L_0x046a:
            r23 = r11
            r21 = r13
            goto L_0x0505
        L_0x0470:
            int r8 = r7.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r13
            r13 = r19
            r6 = r20
            r9 = 0
            r17 = 0
            r19 = 0
        L_0x0484:
            if (r9 >= r8) goto L_0x04aa
            r22 = r8
            android.view.View r8 = r7.u(r9)
            r23 = r11
            if (r8 != 0) goto L_0x0491
            goto L_0x04a3
        L_0x0491:
            int r11 = p1.d0.b(r8, r3)
            if (r11 > 0) goto L_0x049c
            if (r11 <= r13) goto L_0x049c
            r19 = r8
            r13 = r11
        L_0x049c:
            if (r11 < 0) goto L_0x04a3
            if (r11 >= r6) goto L_0x04a3
            r17 = r8
            r6 = r11
        L_0x04a3:
            int r9 = r9 + 1
            r8 = r22
            r11 = r23
            goto L_0x0484
        L_0x04aa:
            r23 = r11
            boolean r3 = r7.d()
            if (r3 == 0) goto L_0x04b5
            if (r0 <= 0) goto L_0x04b9
            goto L_0x04b7
        L_0x04b5:
            if (r10 <= 0) goto L_0x04b9
        L_0x04b7:
            r3 = 1
            goto L_0x04ba
        L_0x04b9:
            r3 = 0
        L_0x04ba:
            if (r3 == 0) goto L_0x04c3
            if (r17 == 0) goto L_0x04c3
            int r2 = p1.o0.F(r17)
            goto L_0x0506
        L_0x04c3:
            if (r3 != 0) goto L_0x04cc
            if (r19 == 0) goto L_0x04cc
            int r2 = p1.o0.F(r19)
            goto L_0x0506
        L_0x04cc:
            if (r3 == 0) goto L_0x04d0
            r17 = r19
        L_0x04d0:
            if (r17 != 0) goto L_0x04d3
            goto L_0x0505
        L_0x04d3:
            int r6 = p1.o0.F(r17)
            int r8 = r7.z()
            if (r14 == 0) goto L_0x04f7
            r9 = r7
            p1.a1 r9 = (p1.a1) r9
            r11 = 1
            int r8 = r8 - r11
            android.graphics.PointF r8 = r9.a(r8)
            if (r8 == 0) goto L_0x04f7
            float r9 = r8.x
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x04f5
            float r8 = r8.y
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x04f7
        L_0x04f5:
            r8 = 1
            goto L_0x04f8
        L_0x04f7:
            r8 = 0
        L_0x04f8:
            if (r8 != r3) goto L_0x04fc
            r3 = -1
            goto L_0x04fd
        L_0x04fc:
            r3 = 1
        L_0x04fd:
            int r3 = r3 + r6
            if (r3 < 0) goto L_0x0505
            if (r3 < r2) goto L_0x0503
            goto L_0x0505
        L_0x0503:
            r2 = r3
            goto L_0x0506
        L_0x0505:
            r2 = -1
        L_0x0506:
            r3 = -1
            if (r2 != r3) goto L_0x050b
        L_0x0509:
            r2 = 0
            goto L_0x0511
        L_0x050b:
            r15.f4718a = r2
            r7.x0(r15)
            r2 = 1
        L_0x0511:
            if (r2 == 0) goto L_0x0515
            r8 = 1
            goto L_0x0516
        L_0x0515:
            r8 = 0
        L_0x0516:
            if (r8 == 0) goto L_0x051d
            goto L_0x0541
        L_0x0519:
            r23 = r11
            r21 = r13
        L_0x051d:
            if (r12 == 0) goto L_0x0545
            if (r5 == 0) goto L_0x0523
            r4 = r4 | 2
        L_0x0523:
            x0.o r2 = r24.getScrollingChildHelper()
            r3 = 1
            r2.g(r4, r3)
            int r2 = -r1
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = java.lang.Math.min(r10, r1)
            int r1 = java.lang.Math.max(r2, r1)
            r2 = r23
            r2.a(r0, r1)
        L_0x0541:
            r0 = 1
            goto L_0x0546
        L_0x0543:
            r21 = r13
        L_0x0545:
            r0 = 0
        L_0x0546:
            if (r0 != 0) goto L_0x054f
            r1 = 0
            r0 = r24
        L_0x054b:
            r0.setScrollState(r1)
            goto L_0x0551
        L_0x054f:
            r0 = r24
        L_0x0551:
            r24.b0()
            r8 = 1
            goto L_0x0581
        L_0x0556:
            r0 = r6
            r1 = r8
            r21 = r13
            int r2 = r7.getPointerId(r1)
            r0.O = r2
            float r1 = r25.getX()
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.S = r1
            r0.Q = r1
            float r1 = r25.getY()
            float r1 = r1 + r5
            int r1 = (int) r1
            r0.T = r1
            r0.R = r1
            if (r11 == 0) goto L_0x0578
            r10 = r10 | 2
        L_0x0578:
            x0.o r1 = r24.getScrollingChildHelper()
            r2 = 0
            r1.g(r10, r2)
        L_0x0580:
            r8 = 0
        L_0x0581:
            if (r8 != 0) goto L_0x058b
            android.view.VelocityTracker r1 = r0.P
            r2 = r21
            r1.addMovement(r2)
            goto L_0x058d
        L_0x058b:
            r2 = r21
        L_0x058d:
            r2.recycle()
            r1 = 1
            return r1
        L_0x0592:
            r0 = r6
            r1 = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (!this.w || this.D) {
            int i3 = k.f5089a;
            j.a("RV FullInvalidate");
            r();
            j.b();
        } else if (this.f1431h.g()) {
            this.f1431h.getClass();
            if (this.f1431h.g()) {
                int i6 = k.f5089a;
                j.a("RV FullInvalidate");
                r();
                j.b();
            }
        }
    }

    public final void q(int i3, int i6) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = u0.f5622a;
        setMeasuredDimension(o0.g(i3, paddingRight, d0.e(this)), o0.g(i6, getPaddingBottom() + getPaddingTop(), d0.d(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: p1.f1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: p1.f1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: p1.f1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: p1.f1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: p1.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: p1.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: p1.k0} */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x038e, code lost:
        if (r0.f1433i.j(getFocusedChild()) == false) goto L_0x0444;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x02f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r17 = this;
            r0 = r17
            p1.g0 r1 = r0.f1445o
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        L_0x000e:
            p1.o0 r1 = r0.f1447p
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            p1.b1 r1 = r0.f1432h0
            r3 = 0
            r1.f4446i = r3
            boolean r4 = r0.f1461w0
            r5 = 1
            if (r4 == 0) goto L_0x0034
            int r4 = r0.f1463x0
            int r6 = r17.getWidth()
            if (r4 != r6) goto L_0x0032
            int r4 = r0.f1465y0
            int r6 = r17.getHeight()
            if (r4 == r6) goto L_0x0034
        L_0x0032:
            r4 = r5
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            r0.f1463x0 = r3
            r0.f1465y0 = r3
            r0.f1461w0 = r3
            int r6 = r1.f4441d
            if (r6 != r5) goto L_0x0043
            r17.s()
            goto L_0x0077
        L_0x0043:
            p1.b r6 = r0.f1431h
            java.util.ArrayList r7 = r6.f4432c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0057
            java.util.ArrayList r6 = r6.f4431b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0057
            r6 = r5
            goto L_0x0058
        L_0x0057:
            r6 = r3
        L_0x0058:
            if (r6 != 0) goto L_0x0077
            if (r4 != 0) goto L_0x0077
            p1.o0 r4 = r0.f1447p
            int r4 = r4.f4608n
            int r6 = r17.getWidth()
            if (r4 != r6) goto L_0x0077
            p1.o0 r4 = r0.f1447p
            int r4 = r4.f4609o
            int r6 = r17.getHeight()
            if (r4 == r6) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            p1.o0 r4 = r0.f1447p
            r4.o0(r0)
            goto L_0x007f
        L_0x0077:
            p1.o0 r4 = r0.f1447p
            r4.o0(r0)
            r17.t()
        L_0x007f:
            r4 = 4
            r1.a(r4)
            r17.h0()
            r17.R()
            r1.f4441d = r5
            boolean r6 = r1.f4447j
            r7 = 0
            p1.v0 r8 = r0.f1428f
            p1.r1 r9 = r0.f1435j
            if (r6 == 0) goto L_0x0305
            p1.d r6 = r0.f1433i
            int r6 = r6.e()
            int r6 = r6 - r5
        L_0x009b:
            if (r6 < 0) goto L_0x01bf
            p1.d r10 = r0.f1433i
            android.view.View r10 = r10.d(r6)
            p1.f1 r10 = L(r10)
            boolean r11 = r10.o()
            if (r11 == 0) goto L_0x00af
            goto L_0x01b9
        L_0x00af:
            long r11 = r0.J(r10)
            p1.l0 r13 = r0.M
            r13.getClass()
            p1.k0 r13 = new p1.k0
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.f4659c
            k.d r14 = (k.d) r14
            java.lang.Object r14 = r14.d(r11, r7)
            p1.f1 r14 = (p1.f1) r14
            if (r14 == 0) goto L_0x01b6
            boolean r15 = r14.o()
            if (r15 != 0) goto L_0x01b6
            java.lang.Object r15 = r9.f4658b
            k.j r15 = (k.j) r15
            java.lang.Object r15 = r15.getOrDefault(r14, r7)
            p1.q1 r15 = (p1.q1) r15
            if (r15 == 0) goto L_0x00e4
            int r15 = r15.f4649a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00e4
            r3 = r5
        L_0x00e4:
            java.lang.Object r15 = r9.f4658b
            k.j r15 = (k.j) r15
            java.lang.Object r15 = r15.getOrDefault(r10, r7)
            p1.q1 r15 = (p1.q1) r15
            if (r15 == 0) goto L_0x00f6
            int r15 = r15.f4649a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r3 == 0) goto L_0x00fd
            if (r14 != r10) goto L_0x00fd
            goto L_0x01b6
        L_0x00fd:
            p1.k0 r15 = r9.k(r14, r4)
            r9.b(r10, r13)
            r13 = 8
            p1.k0 r13 = r9.k(r10, r13)
            if (r15 != 0) goto L_0x018c
            p1.d r3 = r0.f1433i
            int r3 = r3.e()
            r5 = 0
        L_0x0113:
            if (r5 >= r3) goto L_0x016b
            p1.d r13 = r0.f1433i
            android.view.View r13 = r13.d(r5)
            p1.f1 r13 = L(r13)
            if (r13 != r10) goto L_0x0122
            goto L_0x0168
        L_0x0122:
            long r15 = r0.J(r13)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0168
            p1.g0 r1 = r0.f1445o
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x014e
            boolean r1 = r1.f4509b
            if (r1 == 0) goto L_0x014e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = a2.m.f(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x014e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = a2.m.f(r0, r3)
            r1.<init>(r2)
            throw r1
        L_0x0168:
            int r5 = r5 + 1
            goto L_0x0113
        L_0x016b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r3.<init>(r5)
            r3.append(r14)
            java.lang.String r5 = " cannot be found but it is necessary for "
            r3.append(r5)
            r3.append(r10)
            java.lang.String r5 = r17.B()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L_0x01b9
        L_0x018c:
            r11 = 0
            r14.n(r11)
            if (r3 == 0) goto L_0x0195
            r0.h(r14)
        L_0x0195:
            if (r14 == r10) goto L_0x01aa
            if (r5 == 0) goto L_0x019c
            r0.h(r10)
        L_0x019c:
            r14.f4490h = r10
            r0.h(r14)
            r8.m(r14)
            r3 = 0
            r10.n(r3)
            r10.f4491i = r14
        L_0x01aa:
            p1.l0 r3 = r0.M
            boolean r3 = r3.a(r14, r10, r15, r13)
            if (r3 == 0) goto L_0x01b9
            r17.U()
            goto L_0x01b9
        L_0x01b6:
            r9.b(r10, r13)
        L_0x01b9:
            int r6 = r6 + -1
            r3 = 0
            r5 = 1
            goto L_0x009b
        L_0x01bf:
            java.lang.Object r2 = r9.f4658b
            k.j r2 = (k.j) r2
            int r2 = r2.f3895f
        L_0x01c5:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0305
            java.lang.Object r3 = r9.f4658b
            k.j r3 = (k.j) r3
            java.lang.Object r3 = r3.h(r2)
            r11 = r3
            p1.f1 r11 = (p1.f1) r11
            java.lang.Object r3 = r9.f4658b
            k.j r3 = (k.j) r3
            java.lang.Object r3 = r3.j(r2)
            p1.q1 r3 = (p1.q1) r3
            int r4 = r3.f4649a
            r5 = r4 & 3
            r6 = 3
            p1.f0 r10 = r0.f1467z0
            if (r5 != r6) goto L_0x01e8
            goto L_0x01f0
        L_0x01e8:
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0200
            p1.k0 r4 = r3.f4650b
            if (r4 != 0) goto L_0x01fd
        L_0x01f0:
            androidx.recyclerview.widget.RecyclerView r4 = r10.f4481a
            p1.o0 r5 = r4.f1447p
            android.view.View r6 = r11.f4483a
            p1.v0 r4 = r4.f1428f
            r5.h0(r6, r4)
            goto L_0x02f6
        L_0x01fd:
            p1.k0 r7 = r3.f4651c
            goto L_0x0257
        L_0x0200:
            r5 = r4 & 14
            r6 = 14
            if (r5 != r6) goto L_0x0208
            goto L_0x02b6
        L_0x0208:
            r5 = r4 & 12
            r6 = 12
            if (r5 != r6) goto L_0x0251
            p1.k0 r4 = r3.f4650b
            p1.k0 r5 = r3.f4651c
            r10.getClass()
            r6 = 0
            r11.n(r6)
            androidx.recyclerview.widget.RecyclerView r6 = r10.f4481a
            boolean r7 = r6.D
            if (r7 == 0) goto L_0x0228
            p1.l0 r7 = r6.M
            boolean r4 = r7.a(r11, r11, r4, r5)
            if (r4 == 0) goto L_0x02f6
            goto L_0x024c
        L_0x0228:
            p1.l0 r7 = r6.M
            r10 = r7
            p1.k r10 = (p1.k) r10
            r10.getClass()
            int r12 = r4.f4553a
            int r14 = r5.f4553a
            if (r12 != r14) goto L_0x0242
            int r7 = r4.f4554b
            int r13 = r5.f4554b
            if (r7 == r13) goto L_0x023d
            goto L_0x0242
        L_0x023d:
            r10.c(r11)
            r4 = 0
            goto L_0x024a
        L_0x0242:
            int r13 = r4.f4554b
            int r15 = r5.f4554b
            boolean r4 = r10.g(r11, r12, r13, r14, r15)
        L_0x024a:
            if (r4 == 0) goto L_0x02f6
        L_0x024c:
            r6.U()
            goto L_0x02f6
        L_0x0251:
            r5 = r4 & 4
            if (r5 == 0) goto L_0x02b2
            p1.k0 r4 = r3.f4650b
        L_0x0257:
            androidx.recyclerview.widget.RecyclerView r5 = r10.f4481a
            p1.v0 r6 = r5.f1428f
            r6.m(r11)
            r5.h(r11)
            r6 = 0
            r11.n(r6)
            p1.l0 r6 = r5.M
            r10 = r6
            p1.k r10 = (p1.k) r10
            r10.getClass()
            int r12 = r4.f4553a
            int r13 = r4.f4554b
            android.view.View r4 = r11.f4483a
            if (r7 != 0) goto L_0x027a
            int r6 = r4.getLeft()
            goto L_0x027c
        L_0x027a:
            int r6 = r7.f4553a
        L_0x027c:
            r14 = r6
            if (r7 != 0) goto L_0x0284
            int r6 = r4.getTop()
            goto L_0x0286
        L_0x0284:
            int r6 = r7.f4554b
        L_0x0286:
            r15 = r6
            boolean r6 = r11.i()
            if (r6 != 0) goto L_0x02a3
            if (r12 != r14) goto L_0x0291
            if (r13 == r15) goto L_0x02a3
        L_0x0291:
            int r6 = r4.getWidth()
            int r6 = r6 + r14
            int r7 = r4.getHeight()
            int r7 = r7 + r15
            r4.layout(r14, r15, r6, r7)
            boolean r4 = r10.g(r11, r12, r13, r14, r15)
            goto L_0x02ac
        L_0x02a3:
            r10.l(r11)
            java.util.ArrayList r4 = r10.f4542h
            r4.add(r11)
            r4 = 1
        L_0x02ac:
            if (r4 == 0) goto L_0x02f6
            r5.U()
            goto L_0x02f6
        L_0x02b2:
            r4 = r4 & 8
            if (r4 == 0) goto L_0x02f6
        L_0x02b6:
            p1.k0 r4 = r3.f4650b
            p1.k0 r5 = r3.f4651c
            androidx.recyclerview.widget.RecyclerView r6 = r10.f4481a
            r6.getClass()
            r7 = 0
            r11.n(r7)
            p1.l0 r7 = r6.M
            r10 = r7
            p1.k r10 = (p1.k) r10
            if (r4 == 0) goto L_0x02e2
            r10.getClass()
            int r12 = r4.f4553a
            int r14 = r5.f4553a
            if (r12 != r14) goto L_0x02d9
            int r7 = r4.f4554b
            int r13 = r5.f4554b
            if (r7 == r13) goto L_0x02e2
        L_0x02d9:
            int r13 = r4.f4554b
            int r15 = r5.f4554b
            boolean r4 = r10.g(r11, r12, r13, r14, r15)
            goto L_0x02f1
        L_0x02e2:
            r10.l(r11)
            android.view.View r4 = r11.f4483a
            r5 = 0
            r4.setAlpha(r5)
            java.util.ArrayList r4 = r10.f4543i
            r4.add(r11)
            r4 = 1
        L_0x02f1:
            if (r4 == 0) goto L_0x02f6
            r6.U()
        L_0x02f6:
            r4 = 0
            r3.f4649a = r4
            r7 = 0
            r3.f4650b = r7
            r3.f4651c = r7
            g0.f r4 = p1.q1.f4648d
            r4.a(r3)
            goto L_0x01c5
        L_0x0305:
            p1.o0 r2 = r0.f1447p
            r2.g0(r8)
            int r2 = r1.f4442e
            r1.f4439b = r2
            r2 = 0
            r0.D = r2
            r0.E = r2
            r1.f4447j = r2
            r1.f4448k = r2
            p1.o0 r3 = r0.f1447p
            r3.f4600f = r2
            java.util.ArrayList r3 = r8.f4690b
            if (r3 == 0) goto L_0x0322
            r3.clear()
        L_0x0322:
            p1.o0 r3 = r0.f1447p
            boolean r4 = r3.f4605k
            if (r4 == 0) goto L_0x032f
            r3.f4604j = r2
            r3.f4605k = r2
            r8.n()
        L_0x032f:
            p1.o0 r3 = r0.f1447p
            r3.b0(r1)
            r3 = 1
            r0.S(r3)
            r0.i0(r2)
            r9.d()
            int[] r4 = r0.f1448p0
            r5 = r4[r2]
            r6 = r4[r3]
            r0.F(r4)
            r8 = r4[r2]
            if (r8 != r5) goto L_0x0351
            r4 = r4[r3]
            if (r4 == r6) goto L_0x0350
            goto L_0x0351
        L_0x0350:
            r3 = r2
        L_0x0351:
            if (r3 == 0) goto L_0x0356
            r0.w(r2, r2)
        L_0x0356:
            boolean r3 = r0.f1425d0
            r4 = -1
            if (r3 == 0) goto L_0x0444
            p1.g0 r3 = r0.f1445o
            if (r3 == 0) goto L_0x0444
            boolean r3 = r17.hasFocus()
            if (r3 == 0) goto L_0x0444
            int r3 = r17.getDescendantFocusability()
            r6 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r6) goto L_0x0444
            int r3 = r17.getDescendantFocusability()
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r6) goto L_0x037e
            boolean r3 = r17.isFocused()
            if (r3 == 0) goto L_0x037e
            goto L_0x0444
        L_0x037e:
            boolean r3 = r17.isFocused()
            if (r3 != 0) goto L_0x0392
            android.view.View r3 = r17.getFocusedChild()
            p1.d r6 = r0.f1433i
            boolean r3 = r6.j(r3)
            if (r3 != 0) goto L_0x0392
            goto L_0x0444
        L_0x0392:
            long r8 = r1.f4450m
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x03d4
            p1.g0 r3 = r0.f1445o
            boolean r3 = r3.f4509b
            if (r3 == 0) goto L_0x03d4
            if (r3 != 0) goto L_0x03a2
            r10 = r7
            goto L_0x03d2
        L_0x03a2:
            p1.d r3 = r0.f1433i
            int r3 = r3.h()
            r6 = r2
            r10 = r7
        L_0x03aa:
            if (r6 >= r3) goto L_0x03d2
            p1.d r11 = r0.f1433i
            android.view.View r11 = r11.g(r6)
            p1.f1 r11 = L(r11)
            if (r11 == 0) goto L_0x03cf
            boolean r12 = r11.i()
            if (r12 != 0) goto L_0x03cf
            long r12 = r11.f4487e
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x03cf
            p1.d r10 = r0.f1433i
            android.view.View r12 = r11.f4483a
            boolean r10 = r10.j(r12)
            if (r10 == 0) goto L_0x03d5
            r10 = r11
        L_0x03cf:
            int r6 = r6 + 1
            goto L_0x03aa
        L_0x03d2:
            r11 = r10
            goto L_0x03d5
        L_0x03d4:
            r11 = r7
        L_0x03d5:
            if (r11 == 0) goto L_0x03ea
            p1.d r3 = r0.f1433i
            android.view.View r6 = r11.f4483a
            boolean r3 = r3.j(r6)
            if (r3 != 0) goto L_0x03ea
            boolean r3 = r6.hasFocusable()
            if (r3 != 0) goto L_0x03e8
            goto L_0x03ea
        L_0x03e8:
            r7 = r6
            goto L_0x042b
        L_0x03ea:
            p1.d r3 = r0.f1433i
            int r3 = r3.e()
            if (r3 <= 0) goto L_0x042b
            int r3 = r1.f4449l
            r6 = -1
            if (r3 == r6) goto L_0x03f8
            r2 = r3
        L_0x03f8:
            int r3 = r1.b()
            r6 = r2
        L_0x03fd:
            if (r6 >= r3) goto L_0x0413
            p1.f1 r8 = r0.H(r6)
            if (r8 != 0) goto L_0x0406
            goto L_0x0413
        L_0x0406:
            android.view.View r8 = r8.f4483a
            boolean r9 = r8.hasFocusable()
            if (r9 == 0) goto L_0x0410
            r7 = r8
            goto L_0x042b
        L_0x0410:
            int r6 = r6 + 1
            goto L_0x03fd
        L_0x0413:
            int r2 = java.lang.Math.min(r3, r2)
        L_0x0417:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x042b
            p1.f1 r3 = r0.H(r2)
            if (r3 != 0) goto L_0x0422
            goto L_0x042b
        L_0x0422:
            android.view.View r3 = r3.f4483a
            boolean r6 = r3.hasFocusable()
            if (r6 == 0) goto L_0x0417
            r7 = r3
        L_0x042b:
            if (r7 == 0) goto L_0x0444
            int r2 = r1.f4451n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0441
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x0441
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L_0x0441
            r7 = r2
        L_0x0441:
            r7.requestFocus()
        L_0x0444:
            r1.f4450m = r4
            r2 = -1
            r1.f4449l = r2
            r1.f4451n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    public final void removeDetachedView(View view, boolean z5) {
        f1 L2 = L(view);
        if (L2 != null) {
            if (L2.k()) {
                L2.f4492j &= -257;
            } else if (!L2.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(m.f(this, sb));
            }
        } else if (A0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(m.f(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z5);
    }

    public final void requestChildFocus(View view, View view2) {
        z zVar = this.f1447p.f4599e;
        boolean z5 = true;
        if (!(zVar != null && zVar.f4722e) && !N()) {
            z5 = false;
        }
        if (!z5 && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.f1447p.j0(this, view, rect, z5, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        ArrayList arrayList = this.f1453s;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((r0) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public final void requestLayout() {
        if (this.f1462x != 0 || this.f1466z) {
            this.f1464y = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[EDGE_INSN: B:114:0x0091->B:38:0x0091 ?: BREAK  
    EDGE_INSN: B:115:0x0091->B:38:0x0091 ?: BREAK  
    EDGE_INSN: B:116:0x0091->B:38:0x0091 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r13 = this;
            p1.b1 r0 = r13.f1432h0
            r1 = 1
            r0.a(r1)
            r13.C(r0)
            r2 = 0
            r0.f4446i = r2
            r13.h0()
            p1.r1 r3 = r13.f1435j
            r3.d()
            r13.R()
            r13.V()
            boolean r4 = r13.f1425d0
            r5 = 0
            if (r4 == 0) goto L_0x002e
            boolean r4 = r13.hasFocus()
            if (r4 == 0) goto L_0x002e
            p1.g0 r4 = r13.f1445o
            if (r4 == 0) goto L_0x002e
            android.view.View r4 = r13.getFocusedChild()
            goto L_0x002f
        L_0x002e:
            r4 = r5
        L_0x002f:
            if (r4 != 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            android.view.View r4 = r13.D(r4)
            if (r4 != 0) goto L_0x003a
        L_0x0038:
            r4 = r5
            goto L_0x003e
        L_0x003a:
            p1.f1 r4 = r13.K(r4)
        L_0x003e:
            r6 = -1
            r8 = -1
            if (r4 != 0) goto L_0x004a
            r0.f4450m = r6
            r0.f4449l = r8
            r0.f4451n = r8
            goto L_0x0093
        L_0x004a:
            p1.g0 r9 = r13.f1445o
            boolean r9 = r9.f4509b
            if (r9 == 0) goto L_0x0052
            long r6 = r4.f4487e
        L_0x0052:
            r0.f4450m = r6
            boolean r6 = r13.D
            if (r6 == 0) goto L_0x0059
            goto L_0x0066
        L_0x0059:
            boolean r6 = r4.i()
            if (r6 == 0) goto L_0x0062
            int r6 = r4.f4486d
            goto L_0x006c
        L_0x0062:
            androidx.recyclerview.widget.RecyclerView r6 = r4.f4500r
            if (r6 != 0) goto L_0x0068
        L_0x0066:
            r6 = r8
            goto L_0x006c
        L_0x0068:
            int r6 = r6.I(r4)
        L_0x006c:
            r0.f4449l = r6
            android.view.View r4 = r4.f4483a
        L_0x0070:
            int r6 = r4.getId()
        L_0x0074:
            boolean r7 = r4.isFocused()
            if (r7 != 0) goto L_0x0091
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0091
            boolean r7 = r4.hasFocus()
            if (r7 == 0) goto L_0x0091
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r7 = r4.getId()
            if (r7 == r8) goto L_0x0074
            goto L_0x0070
        L_0x0091:
            r0.f4451n = r6
        L_0x0093:
            boolean r4 = r0.f4447j
            if (r4 == 0) goto L_0x009d
            boolean r4 = r13.f1440l0
            if (r4 == 0) goto L_0x009d
            r4 = r1
            goto L_0x009e
        L_0x009d:
            r4 = r2
        L_0x009e:
            r0.f4445h = r4
            r13.f1440l0 = r2
            r13.f1438k0 = r2
            boolean r4 = r0.f4448k
            r0.f4444g = r4
            p1.g0 r4 = r13.f1445o
            int r4 = r4.a()
            r0.f4442e = r4
            int[] r4 = r13.f1448p0
            r13.F(r4)
            boolean r4 = r0.f4447j
            r6 = 2
            if (r4 == 0) goto L_0x0124
            p1.d r4 = r13.f1433i
            int r4 = r4.e()
            r7 = r2
        L_0x00c1:
            if (r7 >= r4) goto L_0x0124
            p1.d r9 = r13.f1433i
            android.view.View r9 = r9.d(r7)
            p1.f1 r9 = L(r9)
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0121
            boolean r10 = r9.g()
            if (r10 == 0) goto L_0x00e0
            p1.g0 r10 = r13.f1445o
            boolean r10 = r10.f4509b
            if (r10 != 0) goto L_0x00e0
            goto L_0x0121
        L_0x00e0:
            p1.l0 r10 = r13.M
            p1.l0.b(r9)
            r9.d()
            r10.getClass()
            p1.k0 r10 = new p1.k0
            r10.<init>()
            r10.a(r9)
            r3.c(r9, r10)
            boolean r10 = r0.f4445h
            if (r10 == 0) goto L_0x0121
            int r10 = r9.f4492j
            r10 = r10 & r6
            if (r10 == 0) goto L_0x0101
            r10 = r1
            goto L_0x0102
        L_0x0101:
            r10 = r2
        L_0x0102:
            if (r10 == 0) goto L_0x0121
            boolean r10 = r9.i()
            if (r10 != 0) goto L_0x0121
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0121
            boolean r10 = r9.g()
            if (r10 != 0) goto L_0x0121
            long r10 = r13.J(r9)
            java.lang.Object r12 = r3.f4659c
            k.d r12 = (k.d) r12
            r12.e(r10, r9)
        L_0x0121:
            int r7 = r7 + 1
            goto L_0x00c1
        L_0x0124:
            boolean r4 = r0.f4448k
            if (r4 == 0) goto L_0x01ed
            p1.d r4 = r13.f1433i
            int r4 = r4.h()
            r7 = r2
        L_0x012f:
            if (r7 >= r4) goto L_0x016c
            p1.d r9 = r13.f1433i
            android.view.View r9 = r9.g(r7)
            p1.f1 r9 = L(r9)
            boolean r10 = A0
            if (r10 == 0) goto L_0x015b
            int r10 = r9.f4485c
            if (r10 != r8) goto L_0x015b
            boolean r10 = r9.i()
            if (r10 == 0) goto L_0x014a
            goto L_0x015b
        L_0x014a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "view holder cannot have position -1 unless it is removed"
            r1.<init>(r2)
            java.lang.String r1 = a2.m.f(r13, r1)
            r0.<init>(r1)
            throw r0
        L_0x015b:
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0169
            int r10 = r9.f4486d
            if (r10 != r8) goto L_0x0169
            int r10 = r9.f4485c
            r9.f4486d = r10
        L_0x0169:
            int r7 = r7 + 1
            goto L_0x012f
        L_0x016c:
            boolean r4 = r0.f4443f
            r0.f4443f = r2
            p1.o0 r7 = r13.f1447p
            p1.v0 r8 = r13.f1428f
            r7.a0(r8, r0)
            r0.f4443f = r4
            r4 = r2
        L_0x017a:
            p1.d r7 = r13.f1433i
            int r7 = r7.e()
            if (r4 >= r7) goto L_0x01ed
            p1.d r7 = r13.f1433i
            android.view.View r7 = r7.d(r4)
            p1.f1 r7 = L(r7)
            boolean r8 = r7.o()
            if (r8 == 0) goto L_0x0193
            goto L_0x01ea
        L_0x0193:
            java.lang.Object r8 = r3.f4658b
            k.j r8 = (k.j) r8
            java.lang.Object r8 = r8.getOrDefault(r7, r5)
            p1.q1 r8 = (p1.q1) r8
            if (r8 == 0) goto L_0x01a7
            int r8 = r8.f4649a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x01a7
            r8 = r1
            goto L_0x01a8
        L_0x01a7:
            r8 = r2
        L_0x01a8:
            if (r8 != 0) goto L_0x01ea
            p1.l0.b(r7)
            int r8 = r7.f4492j
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01b5
            r8 = r1
            goto L_0x01b6
        L_0x01b5:
            r8 = r2
        L_0x01b6:
            p1.l0 r9 = r13.M
            r7.d()
            r9.getClass()
            p1.k0 r9 = new p1.k0
            r9.<init>()
            r9.a(r7)
            if (r8 == 0) goto L_0x01cc
            r13.X(r7, r9)
            goto L_0x01ea
        L_0x01cc:
            java.lang.Object r8 = r3.f4658b
            k.j r8 = (k.j) r8
            java.lang.Object r8 = r8.getOrDefault(r7, r5)
            p1.q1 r8 = (p1.q1) r8
            if (r8 != 0) goto L_0x01e3
            p1.q1 r8 = p1.q1.a()
            java.lang.Object r10 = r3.f4658b
            k.j r10 = (k.j) r10
            r10.put(r7, r8)
        L_0x01e3:
            int r7 = r8.f4649a
            r7 = r7 | r6
            r8.f4649a = r7
            r8.f4650b = r9
        L_0x01ea:
            int r4 = r4 + 1
            goto L_0x017a
        L_0x01ed:
            r13.m()
            r13.S(r1)
            r13.i0(r2)
            r0.f4441d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    public final void scrollBy(int i3, int i6) {
        o0 o0Var = this.f1447p;
        if (o0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1466z) {
            boolean d6 = o0Var.d();
            boolean e6 = this.f1447p.e();
            if (d6 || e6) {
                if (!d6) {
                    i3 = 0;
                }
                if (!e6) {
                    i6 = 0;
                }
                c0(i3, i6, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i3, int i6) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i3 = 0;
        if (N()) {
            int a6 = accessibilityEvent != null ? y0.b.a(accessibilityEvent) : 0;
            if (a6 != 0) {
                i3 = a6;
            }
            this.B |= i3;
            i3 = 1;
        }
        if (i3 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(h1 h1Var) {
        this.f1446o0 = h1Var;
        u0.l(this, h1Var);
    }

    public void setAdapter(g0 g0Var) {
        setLayoutFrozen(false);
        g0 g0Var2 = this.f1445o;
        x0 x0Var = this.f1426e;
        if (g0Var2 != null) {
            g0Var2.f4508a.unregisterObserver(x0Var);
            this.f1445o.getClass();
        }
        l0 l0Var = this.M;
        if (l0Var != null) {
            l0Var.e();
        }
        o0 o0Var = this.f1447p;
        v0 v0Var = this.f1428f;
        if (o0Var != null) {
            o0Var.f0(v0Var);
            this.f1447p.g0(v0Var);
        }
        v0Var.f4689a.clear();
        v0Var.g();
        b bVar = this.f1431h;
        bVar.l(bVar.f4431b);
        bVar.l(bVar.f4432c);
        g0 g0Var3 = this.f1445o;
        this.f1445o = g0Var;
        if (g0Var != null) {
            g0Var.f4508a.registerObserver(x0Var);
        }
        o0 o0Var2 = this.f1447p;
        if (o0Var2 != null) {
            o0Var2.O();
        }
        g0 g0Var4 = this.f1445o;
        v0Var.f4689a.clear();
        v0Var.g();
        v0Var.f(g0Var3, true);
        p1.u0 c6 = v0Var.c();
        if (g0Var3 != null) {
            c6.f4682b--;
        }
        if (c6.f4682b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = c6.f4681a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                t0 t0Var = (t0) sparseArray.valueAt(i3);
                Iterator it = t0Var.f4668a.iterator();
                while (it.hasNext()) {
                    e.e(((f1) it.next()).f4483a);
                }
                t0Var.f4668a.clear();
                i3++;
            }
        }
        if (g0Var4 != null) {
            c6.f4682b++;
        }
        v0Var.e();
        this.f1432h0.f4443f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i0 i0Var) {
        if (i0Var != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z5) {
        if (z5 != this.f1437k) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.f1437k = z5;
        super.setClipToPadding(z5);
        if (this.w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j0 j0Var) {
        j0Var.getClass();
        this.H = j0Var;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z5) {
        this.f1459v = z5;
    }

    public void setItemAnimator(l0 l0Var) {
        l0 l0Var2 = this.M;
        if (l0Var2 != null) {
            l0Var2.e();
            this.M.f4560a = null;
        }
        this.M = l0Var;
        if (l0Var != null) {
            l0Var.f4560a = this.f1442m0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        v0 v0Var = this.f1428f;
        v0Var.f4693e = i3;
        v0Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(o0 o0Var) {
        f0 f0Var;
        RecyclerView recyclerView;
        z zVar;
        if (o0Var != this.f1447p) {
            int i3 = 0;
            setScrollState(0);
            e1 e1Var = this.f1427e0;
            e1Var.f4475j.removeCallbacks(e1Var);
            e1Var.f4471f.abortAnimation();
            o0 o0Var2 = this.f1447p;
            if (!(o0Var2 == null || (zVar = o0Var2.f4599e) == null)) {
                zVar.i();
            }
            o0 o0Var3 = this.f1447p;
            v0 v0Var = this.f1428f;
            if (o0Var3 != null) {
                l0 l0Var = this.M;
                if (l0Var != null) {
                    l0Var.e();
                }
                this.f1447p.f0(v0Var);
                this.f1447p.g0(v0Var);
                v0Var.f4689a.clear();
                v0Var.g();
                if (this.f1457u) {
                    o0 o0Var4 = this.f1447p;
                    o0Var4.f4601g = false;
                    o0Var4.P(this);
                }
                this.f1447p.s0((RecyclerView) null);
                this.f1447p = null;
            } else {
                v0Var.f4689a.clear();
                v0Var.g();
            }
            d dVar = this.f1433i;
            dVar.f4457b.g();
            ArrayList arrayList = dVar.f4458c;
            int size = arrayList.size();
            while (true) {
                size--;
                f0Var = dVar.f4456a;
                if (size < 0) {
                    break;
                }
                f0Var.getClass();
                f1 L2 = L((View) arrayList.get(size));
                if (L2 != null) {
                    int i6 = L2.f4498p;
                    RecyclerView recyclerView2 = f0Var.f4481a;
                    if (recyclerView2.N()) {
                        L2.f4499q = i6;
                        recyclerView2.f1458u0.add(L2);
                    } else {
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.s(L2.f4483a, i6);
                    }
                    L2.f4498p = 0;
                }
                arrayList.remove(size);
            }
            int c6 = f0Var.c();
            while (true) {
                recyclerView = f0Var.f4481a;
                if (i3 >= c6) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getClass();
                L(childAt);
                g0 g0Var = recyclerView.f1445o;
                childAt.clearAnimation();
                i3++;
            }
            recyclerView.removeAllViews();
            this.f1447p = o0Var;
            if (o0Var != null) {
                if (o0Var.f4596b == null) {
                    o0Var.s0(this);
                    if (this.f1457u) {
                        this.f1447p.f4601g = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(o0Var);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(m.f(o0Var.f4596b, sb));
                }
            }
            v0Var.n();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z5) {
        o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5596d) {
            WeakHashMap weakHashMap = u0.f5622a;
            x0.j0.z(scrollingChildHelper.f5595c);
        }
        scrollingChildHelper.f5596d = z5;
    }

    public void setOnFlingListener(q0 q0Var) {
        this.V = q0Var;
    }

    @Deprecated
    public void setOnScrollListener(s0 s0Var) {
        this.f1434i0 = s0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.f1425d0 = z5;
    }

    public void setRecycledViewPool(p1.u0 u0Var) {
        v0 v0Var = this.f1428f;
        RecyclerView recyclerView = v0Var.f4696h;
        v0Var.f(recyclerView.f1445o, false);
        p1.u0 u0Var2 = v0Var.f4695g;
        if (u0Var2 != null) {
            u0Var2.f4682b--;
        }
        v0Var.f4695g = u0Var;
        if (!(u0Var == null || recyclerView.getAdapter() == null)) {
            v0Var.f4695g.f4682b++;
        }
        v0Var.e();
    }

    @Deprecated
    public void setRecyclerListener(w0 w0Var) {
    }

    public void setScrollState(int i3) {
        z zVar;
        if (i3 != this.N) {
            if (B0) {
                Log.d("RecyclerView", "setting scroll state to " + i3 + " from " + this.N, new Exception());
            }
            this.N = i3;
            if (i3 != 2) {
                e1 e1Var = this.f1427e0;
                e1Var.f4475j.removeCallbacks(e1Var);
                e1Var.f4471f.abortAnimation();
                o0 o0Var = this.f1447p;
                if (!(o0Var == null || (zVar = o0Var.f4599e) == null)) {
                    zVar.i();
                }
            }
            o0 o0Var2 = this.f1447p;
            if (o0Var2 != null) {
                o0Var2.e0(i3);
            }
            s0 s0Var = this.f1434i0;
            if (s0Var != null) {
                s0Var.a(this, i3);
            }
            ArrayList arrayList = this.f1436j0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((s0) this.f1436j0.get(size)).a(this, i3);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        int i6;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
            } else {
                i6 = viewConfiguration.getScaledPagingTouchSlop();
                this.U = i6;
            }
        }
        i6 = viewConfiguration.getScaledTouchSlop();
        this.U = i6;
    }

    public void setViewCacheExtension(d1 d1Var) {
        this.f1428f.getClass();
    }

    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z5) {
        z zVar;
        if (z5 != this.f1466z) {
            k("Do not suppressLayout in layout or scroll");
            if (!z5) {
                this.f1466z = false;
                if (!(!this.f1464y || this.f1447p == null || this.f1445o == null)) {
                    requestLayout();
                }
                this.f1464y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1466z = true;
            this.A = true;
            setScrollState(0);
            e1 e1Var = this.f1427e0;
            e1Var.f4475j.removeCallbacks(e1Var);
            e1Var.f4471f.abortAnimation();
            o0 o0Var = this.f1447p;
            if (o0Var != null && (zVar = o0Var.f4599e) != null) {
                zVar.i();
            }
        }
    }

    public final void t() {
        h0();
        R();
        b1 b1Var = this.f1432h0;
        b1Var.a(6);
        this.f1431h.c();
        b1Var.f4442e = this.f1445o.a();
        b1Var.f4440c = 0;
        if (this.f1429g != null) {
            g0 g0Var = this.f1445o;
            int b6 = y.d.b(g0Var.f4510c);
            if (b6 == 1 ? g0Var.a() > 0 : b6 != 2) {
                Parcelable parcelable = this.f1429g.f4717f;
                if (parcelable != null) {
                    this.f1447p.c0(parcelable);
                }
                this.f1429g = null;
            }
        }
        b1Var.f4444g = false;
        this.f1447p.a0(this.f1428f, b1Var);
        b1Var.f4443f = false;
        b1Var.f4447j = b1Var.f4447j && this.M != null;
        b1Var.f4441d = 4;
        S(true);
        i0(false);
    }

    public final boolean u(int i3, int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i6, i7, iArr, iArr2);
    }

    public final void v(int i3, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        getScrollingChildHelper().e(i3, i6, i7, i8, iArr, i9, iArr2);
    }

    public final void w(int i3, int i6) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i6);
        s0 s0Var = this.f1434i0;
        if (s0Var != null) {
            s0Var.b(this, i3, i6);
        }
        ArrayList arrayList = this.f1436j0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((s0) this.f1436j0.get(size)).b(this, i3, i6);
            }
        }
        this.G--;
    }

    public final void x() {
        int i3;
        int i6;
        if (this.L == null) {
            ((c1) this.H).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.L = edgeEffect;
            if (this.f1437k) {
                i6 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i6 = getMeasuredWidth();
                i3 = getMeasuredHeight();
            }
            edgeEffect.setSize(i6, i3);
        }
    }

    public final void y() {
        int i3;
        int i6;
        if (this.I == null) {
            ((c1) this.H).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.I = edgeEffect;
            if (this.f1437k) {
                i6 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i6 = getMeasuredHeight();
                i3 = getMeasuredWidth();
            }
            edgeEffect.setSize(i6, i3);
        }
    }

    public final void z() {
        int i3;
        int i6;
        if (this.K == null) {
            ((c1) this.H).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.K = edgeEffect;
            if (this.f1437k) {
                i6 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i6 = getMeasuredHeight();
                i3 = getMeasuredWidth();
            }
            edgeEffect.setSize(i6, i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        StringBuilder sb;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i6 = i3;
        this.f1426e = new x0(this);
        this.f1428f = new v0(this);
        this.f1435j = new r1(0);
        this.f1439l = new Rect();
        this.f1441m = new Rect();
        this.f1443n = new RectF();
        this.f1449q = new ArrayList();
        this.f1451r = new ArrayList();
        this.f1453s = new ArrayList();
        this.f1462x = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = I0;
        this.M = new p1.k();
        this.N = 0;
        this.O = -1;
        this.f1422b0 = Float.MIN_VALUE;
        this.f1423c0 = Float.MIN_VALUE;
        this.f1425d0 = true;
        this.f1427e0 = new e1(this);
        this.f1430g0 = F0 ? new q() : null;
        this.f1432h0 = new b1();
        this.f1438k0 = false;
        this.f1440l0 = false;
        f0 f0Var = new f0(this);
        this.f1442m0 = f0Var;
        this.f1444n0 = false;
        char c6 = 2;
        this.f1448p0 = new int[2];
        this.f1452r0 = new int[2];
        this.f1454s0 = new int[2];
        this.f1456t0 = new int[2];
        this.f1458u0 = new ArrayList();
        this.f1460v0 = new e0(this);
        this.f1463x0 = 0;
        this.f1465y0 = 0;
        this.f1467z0 = new f0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        this.f1422b0 = x0.v0.a(viewConfiguration);
        this.f1423c0 = x0.v0.b(viewConfiguration);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1421a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1424d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.f4560a = f0Var;
        this.f1431h = new b(new f0(this));
        this.f1433i = new d(new f0(this));
        WeakHashMap weakHashMap = u0.f5622a;
        if (x0.l0.c(this) == 0) {
            x0.l0.m(this, 8);
        }
        if (d0.c(this) == 0) {
            d0.s(this, 1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h1(this));
        int[] iArr = o1.a.f4326a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i6, 0);
        TypedArray typedArray = obtainStyledAttributes;
        u0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i3);
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1437k = typedArray.getBoolean(1, true);
        int i7 = 4;
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(m.f(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i7 = 4;
            c6 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o0.class);
                    try {
                        constructor = asSubclass.getConstructor(G0);
                        Object[] objArr2 = new Object[i7];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c6] = Integer.valueOf(i3);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e6) {
                        noSuchMethodException = e6;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o0) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e7) {
                    e7.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                } catch (ClassNotFoundException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                }
            }
        }
        int[] iArr2 = C0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i6, 0);
        u0.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i3);
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o0 o0Var = this.f1447p;
        if (o0Var != null) {
            return o0Var.t(layoutParams);
        }
        throw new IllegalStateException(m.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
