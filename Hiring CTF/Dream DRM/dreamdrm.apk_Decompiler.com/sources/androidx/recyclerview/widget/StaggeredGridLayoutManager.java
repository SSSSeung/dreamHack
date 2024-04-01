package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b1.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import p1.a1;
import p1.b0;
import p1.b1;
import p1.j1;
import p1.k1;
import p1.l;
import p1.m1;
import p1.n0;
import p1.n1;
import p1.o0;
import p1.p0;
import p1.q;
import p1.r1;
import p1.u;
import p1.v0;
import p1.z;
import x0.d0;
import x0.u0;

public class StaggeredGridLayoutManager extends o0 implements a1 {
    public int A;
    public final r1 B;
    public final int C;
    public boolean D;
    public boolean E;
    public m1 F;
    public final Rect G;
    public final j1 H;
    public final boolean I;
    public int[] J;
    public final l K;

    /* renamed from: p  reason: collision with root package name */
    public int f1468p = -1;

    /* renamed from: q  reason: collision with root package name */
    public n1[] f1469q;

    /* renamed from: r  reason: collision with root package name */
    public b0 f1470r;

    /* renamed from: s  reason: collision with root package name */
    public b0 f1471s;

    /* renamed from: t  reason: collision with root package name */
    public int f1472t;

    /* renamed from: u  reason: collision with root package name */
    public int f1473u;

    /* renamed from: v  reason: collision with root package name */
    public final u f1474v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1475x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f1476y;

    /* renamed from: z  reason: collision with root package name */
    public int f1477z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i6) {
        this.w = false;
        this.f1475x = false;
        this.f1477z = -1;
        this.A = Integer.MIN_VALUE;
        r1 r1Var = new r1(1);
        this.B = r1Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new j1(this);
        this.I = true;
        this.K = new l(1, this);
        n0 G2 = o0.G(context, attributeSet, i3, i6);
        int i7 = G2.f4584a;
        if (i7 == 0 || i7 == 1) {
            c((String) null);
            if (i7 != this.f1472t) {
                this.f1472t = i7;
                b0 b0Var = this.f1470r;
                this.f1470r = this.f1471s;
                this.f1471s = b0Var;
                k0();
            }
            int i8 = G2.f4585b;
            c((String) null);
            if (i8 != this.f1468p) {
                r1Var.d();
                k0();
                this.f1468p = i8;
                this.f1476y = new BitSet(this.f1468p);
                this.f1469q = new n1[this.f1468p];
                for (int i9 = 0; i9 < this.f1468p; i9++) {
                    this.f1469q[i9] = new n1(this, i9);
                }
                k0();
            }
            boolean z5 = G2.f4586c;
            c((String) null);
            m1 m1Var = this.F;
            if (!(m1Var == null || m1Var.f4578k == z5)) {
                m1Var.f4578k = z5;
            }
            this.w = z5;
            k0();
            this.f1474v = new u();
            this.f1470r = b0.a(this, this.f1472t);
            this.f1471s = b0.a(this, 1 - this.f1472t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int b1(int i3, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return i3;
        }
        int mode = View.MeasureSpec.getMode(i3);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i6) - i7), mode) : i3;
    }

    public final boolean A0() {
        int i3;
        if (!(v() == 0 || this.C == 0 || !this.f4601g)) {
            if (this.f1475x) {
                i3 = K0();
                J0();
            } else {
                i3 = J0();
                K0();
            }
            if (i3 == 0 && O0() != null) {
                this.B.d();
                this.f4600f = true;
                k0();
                return true;
            }
        }
        return false;
    }

    public final int B0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        b0 b0Var = this.f1470r;
        boolean z5 = this.I;
        return v.m(b1Var, b0Var, G0(!z5), F0(!z5), this, this.I);
    }

    public final int C0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        b0 b0Var = this.f1470r;
        boolean z5 = this.I;
        return v.n(b1Var, b0Var, G0(!z5), F0(!z5), this, this.I, this.f1475x);
    }

    public final int D0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        b0 b0Var = this.f1470r;
        boolean z5 = this.I;
        return v.o(b1Var, b0Var, G0(!z5), F0(!z5), this, this.I);
    }

    public final int E0(v0 v0Var, u uVar, b1 b1Var) {
        n1 n1Var;
        boolean z5;
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        v0 v0Var2 = v0Var;
        u uVar2 = uVar;
        int i16 = 0;
        int i17 = 1;
        this.f1476y.set(0, this.f1468p, true);
        u uVar3 = this.f1474v;
        int i18 = uVar3.f4680i ? uVar2.f4676e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : uVar2.f4676e == 1 ? uVar2.f4678g + uVar2.f4673b : uVar2.f4677f - uVar2.f4673b;
        int i19 = uVar2.f4676e;
        for (int i20 = 0; i20 < this.f1468p; i20++) {
            if (!this.f1469q[i20].f4588a.isEmpty()) {
                a1(this.f1469q[i20], i19, i18);
            }
        }
        int f6 = this.f1475x ? this.f1470r.f() : this.f1470r.h();
        boolean z6 = false;
        while (true) {
            int i21 = uVar2.f4674c;
            if (((i21 < 0 || i21 >= b1Var.b()) ? i16 : i17) == 0 || (!uVar3.f4680i && this.f1476y.isEmpty())) {
                int i22 = i16;
            } else {
                View d6 = v0Var2.d(uVar2.f4674c);
                uVar2.f4674c += uVar2.f4675d;
                k1 k1Var = (k1) d6.getLayoutParams();
                int a6 = k1Var.a();
                r1 r1Var = this.B;
                int[] iArr = (int[]) r1Var.f4658b;
                int i23 = (iArr == null || a6 >= iArr.length) ? -1 : iArr[a6];
                if ((i23 == -1 ? i17 : i16) != 0) {
                    if (R0(uVar2.f4676e)) {
                        i15 = this.f1468p - i17;
                        i14 = -1;
                        i13 = -1;
                    } else {
                        i13 = i17;
                        i14 = this.f1468p;
                        i15 = i16;
                    }
                    n1 n1Var2 = null;
                    if (uVar2.f4676e == i17) {
                        int h6 = this.f1470r.h();
                        int i24 = Integer.MAX_VALUE;
                        while (i15 != i14) {
                            n1 n1Var3 = this.f1469q[i15];
                            int f7 = n1Var3.f(h6);
                            if (f7 < i24) {
                                i24 = f7;
                                n1Var2 = n1Var3;
                            }
                            i15 += i13;
                        }
                    } else {
                        int f8 = this.f1470r.f();
                        int i25 = Integer.MIN_VALUE;
                        while (i15 != i14) {
                            n1 n1Var4 = this.f1469q[i15];
                            int i26 = n1Var4.i(f8);
                            if (i26 > i25) {
                                n1Var2 = n1Var4;
                                i25 = i26;
                            }
                            i15 += i13;
                        }
                    }
                    n1Var = n1Var2;
                    r1Var.e(a6);
                    ((int[]) r1Var.f4658b)[a6] = n1Var.f4592e;
                } else {
                    n1Var = this.f1469q[i23];
                }
                k1Var.f4557e = n1Var;
                if (uVar2.f4676e == 1) {
                    z5 = false;
                    b(d6, -1, false);
                } else {
                    z5 = false;
                    b(d6, 0, false);
                }
                if (this.f1472t == 1) {
                    i7 = o0.w(this.f1473u, this.f4606l, z5 ? 1 : 0, k1Var.width, z5);
                    i6 = o0.w(this.f4609o, this.f4607m, B() + E(), k1Var.height, true);
                    i3 = 0;
                } else {
                    i7 = o0.w(this.f4608n, this.f4606l, D() + C(), k1Var.width, true);
                    i3 = 0;
                    i6 = o0.w(this.f1473u, this.f4607m, 0, k1Var.height, false);
                }
                RecyclerView recyclerView = this.f4596b;
                Rect rect = this.G;
                if (recyclerView == null) {
                    rect.set(i3, i3, i3, i3);
                } else {
                    rect.set(recyclerView.M(d6));
                }
                k1 k1Var2 = (k1) d6.getLayoutParams();
                int b12 = b1(i7, k1Var2.leftMargin + rect.left, k1Var2.rightMargin + rect.right);
                int b13 = b1(i6, k1Var2.topMargin + rect.top, k1Var2.bottomMargin + rect.bottom);
                if (t0(d6, b12, b13, k1Var2)) {
                    d6.measure(b12, b13);
                }
                if (uVar2.f4676e == 1) {
                    i9 = n1Var.f(f6);
                    i8 = this.f1470r.c(d6) + i9;
                } else {
                    i8 = n1Var.i(f6);
                    i9 = i8 - this.f1470r.c(d6);
                }
                int i27 = uVar2.f4676e;
                n1 n1Var5 = k1Var.f4557e;
                n1Var5.getClass();
                if (i27 == 1) {
                    k1 k1Var3 = (k1) d6.getLayoutParams();
                    k1Var3.f4557e = n1Var5;
                    ArrayList arrayList = n1Var5.f4588a;
                    arrayList.add(d6);
                    n1Var5.f4590c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        n1Var5.f4589b = Integer.MIN_VALUE;
                    }
                    if (k1Var3.c() || k1Var3.b()) {
                        n1Var5.f4591d = n1Var5.f4593f.f1470r.c(d6) + n1Var5.f4591d;
                    }
                } else {
                    k1 k1Var4 = (k1) d6.getLayoutParams();
                    k1Var4.f4557e = n1Var5;
                    ArrayList arrayList2 = n1Var5.f4588a;
                    arrayList2.add(0, d6);
                    n1Var5.f4589b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        n1Var5.f4590c = Integer.MIN_VALUE;
                    }
                    if (k1Var4.c() || k1Var4.b()) {
                        n1Var5.f4591d = n1Var5.f4593f.f1470r.c(d6) + n1Var5.f4591d;
                    }
                }
                if (!P0() || this.f1472t != 1) {
                    i10 = this.f1471s.h() + (n1Var.f4592e * this.f1473u);
                    i11 = this.f1471s.c(d6) + i10;
                } else {
                    i11 = this.f1471s.f() - (((this.f1468p - 1) - n1Var.f4592e) * this.f1473u);
                    i10 = i11 - this.f1471s.c(d6);
                }
                if (this.f1472t == 1) {
                    int i28 = i10;
                    i10 = i9;
                    i9 = i28;
                    int i29 = i11;
                    i11 = i8;
                    i8 = i29;
                }
                o0.L(d6, i9, i10, i8, i11);
                a1(n1Var, uVar3.f4676e, i18);
                T0(v0Var2, uVar3);
                if (!uVar3.f4679h || !d6.hasFocusable()) {
                    i12 = 0;
                } else {
                    i12 = 0;
                    this.f1476y.set(n1Var.f4592e, false);
                }
                i16 = i12;
                i17 = 1;
                z6 = true;
            }
        }
        int i222 = i16;
        if (!z6) {
            T0(v0Var2, uVar3);
        }
        int h7 = uVar3.f4676e == -1 ? this.f1470r.h() - M0(this.f1470r.h()) : L0(this.f1470r.f()) - this.f1470r.f();
        return h7 > 0 ? Math.min(uVar2.f4673b, h7) : i222;
    }

    public final View F0(boolean z5) {
        int h6 = this.f1470r.h();
        int f6 = this.f1470r.f();
        View view = null;
        for (int v5 = v() - 1; v5 >= 0; v5--) {
            View u3 = u(v5);
            int d6 = this.f1470r.d(u3);
            int b6 = this.f1470r.b(u3);
            if (b6 > h6 && d6 < f6) {
                if (b6 <= f6 || !z5) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z5) {
        int h6 = this.f1470r.h();
        int f6 = this.f1470r.f();
        int v5 = v();
        View view = null;
        for (int i3 = 0; i3 < v5; i3++) {
            View u3 = u(i3);
            int d6 = this.f1470r.d(u3);
            if (this.f1470r.b(u3) > h6 && d6 < f6) {
                if (d6 >= h6 || !z5) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final void H0(v0 v0Var, b1 b1Var, boolean z5) {
        int f6;
        int L0 = L0(Integer.MIN_VALUE);
        if (L0 != Integer.MIN_VALUE && (f6 = this.f1470r.f() - L0) > 0) {
            int i3 = f6 - (-X0(-f6, v0Var, b1Var));
            if (z5 && i3 > 0) {
                this.f1470r.l(i3);
            }
        }
    }

    public final void I0(v0 v0Var, b1 b1Var, boolean z5) {
        int h6;
        int M0 = M0(Integer.MAX_VALUE);
        if (M0 != Integer.MAX_VALUE && (h6 = M0 - this.f1470r.h()) > 0) {
            int X0 = h6 - X0(h6, v0Var, b1Var);
            if (z5 && X0 > 0) {
                this.f1470r.l(-X0);
            }
        }
    }

    public final boolean J() {
        return this.C != 0;
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return o0.F(u(0));
    }

    public final int K0() {
        int v5 = v();
        if (v5 == 0) {
            return 0;
        }
        return o0.F(u(v5 - 1));
    }

    public final int L0(int i3) {
        int f6 = this.f1469q[0].f(i3);
        for (int i6 = 1; i6 < this.f1468p; i6++) {
            int f7 = this.f1469q[i6].f(i3);
            if (f7 > f6) {
                f6 = f7;
            }
        }
        return f6;
    }

    public final void M(int i3) {
        super.M(i3);
        for (int i6 = 0; i6 < this.f1468p; i6++) {
            n1 n1Var = this.f1469q[i6];
            int i7 = n1Var.f4589b;
            if (i7 != Integer.MIN_VALUE) {
                n1Var.f4589b = i7 + i3;
            }
            int i8 = n1Var.f4590c;
            if (i8 != Integer.MIN_VALUE) {
                n1Var.f4590c = i8 + i3;
            }
        }
    }

    public final int M0(int i3) {
        int i6 = this.f1469q[0].i(i3);
        for (int i7 = 1; i7 < this.f1468p; i7++) {
            int i8 = this.f1469q[i7].i(i3);
            if (i8 < i6) {
                i6 = i8;
            }
        }
        return i6;
    }

    public final void N(int i3) {
        super.N(i3);
        for (int i6 = 0; i6 < this.f1468p; i6++) {
            n1 n1Var = this.f1469q[i6];
            int i7 = n1Var.f4589b;
            if (i7 != Integer.MIN_VALUE) {
                n1Var.f4589b = i7 + i3;
            }
            int i8 = n1Var.f4590c;
            if (i8 != Integer.MIN_VALUE) {
                n1Var.f4590c = i8 + i3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1475x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.K0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.J0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001a
            if (r8 >= r9) goto L_0x0016
            int r2 = r9 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001d
        L_0x001a:
            int r2 = r8 + r9
        L_0x001c:
            r3 = r8
        L_0x001d:
            p1.r1 r4 = r7.B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0036
            r6 = 2
            if (r10 == r6) goto L_0x0032
            if (r10 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            r4.j(r8, r5)
            r4.i(r9, r5)
            goto L_0x0039
        L_0x0032:
            r4.j(r8, r9)
            goto L_0x0039
        L_0x0036:
            r4.i(r8, r9)
        L_0x0039:
            if (r2 > r0) goto L_0x003c
            return
        L_0x003c:
            boolean r8 = r7.f1475x
            if (r8 == 0) goto L_0x0045
            int r8 = r7.J0()
            goto L_0x0049
        L_0x0045:
            int r8 = r7.K0()
        L_0x0049:
            if (r3 > r8) goto L_0x004e
            r7.k0()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(int, int, int):void");
    }

    public final void O() {
        this.B.d();
        for (int i3 = 0; i3 < this.f1468p; i3++) {
            this.f1469q[i3].b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View O0() {
        /*
            r13 = this;
            int r0 = r13.v()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f1468p
            r2.<init>(r3)
            int r3 = r13.f1468p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f1472t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.P0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f1475x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0100
            android.view.View r7 = r13.u(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            p1.k1 r8 = (p1.k1) r8
            p1.n1 r9 = r8.f4557e
            int r9 = r9.f4592e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b1
            p1.n1 r9 = r8.f4557e
            boolean r10 = r13.f1475x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f4590c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f4590c
        L_0x0056:
            p1.b0 r11 = r13.f1470r
            int r11 = r11.f()
            if (r10 >= r11) goto L_0x00a6
            java.util.ArrayList r10 = r9.f4588a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0098
        L_0x006a:
            int r10 = r9.f4589b
            if (r10 == r11) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            java.util.ArrayList r10 = r9.f4588a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            p1.k1 r11 = p1.n1.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = r9.f4593f
            p1.b0 r12 = r12.f1470r
            int r10 = r12.d(r10)
            r9.f4589b = r10
            r11.getClass()
            int r10 = r9.f4589b
        L_0x008a:
            p1.b0 r11 = r13.f1470r
            int r11 = r11.h()
            if (r10 <= r11) goto L_0x00a6
            java.util.ArrayList r10 = r9.f4588a
            java.lang.Object r10 = r10.get(r4)
        L_0x0098:
            android.view.View r10 = (android.view.View) r10
            r9.getClass()
            p1.k1 r9 = p1.n1.h(r10)
            r9.getClass()
            r9 = r1
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
            return r7
        L_0x00aa:
            p1.n1 r9 = r8.f4557e
            int r9 = r9.f4592e
            r2.clear(r9)
        L_0x00b1:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.u(r0)
            boolean r10 = r13.f1475x
            if (r10 == 0) goto L_0x00ce
            p1.b0 r10 = r13.f1470r
            int r10 = r10.b(r7)
            p1.b0 r11 = r13.f1470r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00cb
            return r7
        L_0x00cb:
            if (r10 != r11) goto L_0x00e1
            goto L_0x00df
        L_0x00ce:
            p1.b0 r10 = r13.f1470r
            int r10 = r10.d(r7)
            p1.b0 r11 = r13.f1470r
            int r11 = r11.d(r9)
            if (r10 <= r11) goto L_0x00dd
            return r7
        L_0x00dd:
            if (r10 != r11) goto L_0x00e1
        L_0x00df:
            r10 = r1
            goto L_0x00e2
        L_0x00e1:
            r10 = r4
        L_0x00e2:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            p1.k1 r9 = (p1.k1) r9
            p1.n1 r8 = r8.f4557e
            int r8 = r8.f4592e
            p1.n1 r9 = r9.f4557e
            int r9 = r9.f4592e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00f7
            r8 = r1
            goto L_0x00f8
        L_0x00f7:
            r8 = r4
        L_0x00f8:
            if (r3 >= 0) goto L_0x00fc
            r9 = r1
            goto L_0x00fd
        L_0x00fc:
            r9 = r4
        L_0x00fd:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0100:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0():android.view.View");
    }

    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4596b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i3 = 0; i3 < this.f1468p; i3++) {
            this.f1469q[i3].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean P0() {
        return A() == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.f1472t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.f1472t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (P0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (P0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Q(android.view.View r9, int r10, p1.v0 r11, p1.b1 r12) {
        /*
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f4596b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.D(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            p1.d r0 = r8.f4595a
            boolean r0 = r0.j(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.W0()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.f1472t
            if (r10 != r0) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.f1472t
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.f1472t
            if (r10 != r0) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.f1472t
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r3
            goto L_0x006e
        L_0x0054:
            int r10 = r8.f1472t
            if (r10 != r0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.P0()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.f1472t
            if (r10 != r0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.P0()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r0
            goto L_0x006e
        L_0x006d:
            r10 = r2
        L_0x006e:
            if (r10 != r3) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            p1.k1 r3 = (p1.k1) r3
            r3.getClass()
            p1.n1 r3 = r3.f4557e
            if (r10 != r0) goto L_0x0083
            int r4 = r8.K0()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.J0()
        L_0x0087:
            r8.Z0(r4, r12)
            r8.Y0(r10)
            p1.u r5 = r8.f1474v
            int r6 = r5.f4675d
            int r6 = r6 + r4
            r5.f4674c = r6
            p1.b0 r6 = r8.f1470r
            int r6 = r6.i()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f4673b = r6
            r5.f4679h = r0
            r6 = 0
            r5.f4672a = r6
            r8.E0(r11, r5, r12)
            boolean r11 = r8.f1475x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00b7
            if (r11 == r9) goto L_0x00b7
            return r11
        L_0x00b7:
            boolean r11 = r8.R0(r10)
            if (r11 == 0) goto L_0x00d2
            int r11 = r8.f1468p
            int r11 = r11 - r0
        L_0x00c0:
            if (r11 < 0) goto L_0x00e7
            p1.n1[] r12 = r8.f1469q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00cf
            if (r12 == r9) goto L_0x00cf
            return r12
        L_0x00cf:
            int r11 = r11 + -1
            goto L_0x00c0
        L_0x00d2:
            r11 = r6
        L_0x00d3:
            int r12 = r8.f1468p
            if (r11 >= r12) goto L_0x00e7
            p1.n1[] r12 = r8.f1469q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e4
            if (r12 == r9) goto L_0x00e4
            return r12
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e7:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ee
            r12 = r0
            goto L_0x00ef
        L_0x00ee:
            r12 = r6
        L_0x00ef:
            if (r11 != r12) goto L_0x00f3
            r11 = r0
            goto L_0x00f4
        L_0x00f3:
            r11 = r6
        L_0x00f4:
            if (r11 == 0) goto L_0x00fb
            int r12 = r3.c()
            goto L_0x00ff
        L_0x00fb:
            int r12 = r3.d()
        L_0x00ff:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0108
            if (r12 == r9) goto L_0x0108
            return r12
        L_0x0108:
            boolean r10 = r8.R0(r10)
            if (r10 == 0) goto L_0x0135
            int r10 = r8.f1468p
            int r10 = r10 - r0
        L_0x0111:
            if (r10 < 0) goto L_0x0156
            int r12 = r3.f4592e
            if (r10 != r12) goto L_0x0118
            goto L_0x0132
        L_0x0118:
            p1.n1[] r12 = r8.f1469q
            if (r11 == 0) goto L_0x0123
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x0129
        L_0x0123:
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x0129:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0132
            if (r12 == r9) goto L_0x0132
            return r12
        L_0x0132:
            int r10 = r10 + -1
            goto L_0x0111
        L_0x0135:
            int r10 = r8.f1468p
            if (r6 >= r10) goto L_0x0156
            p1.n1[] r10 = r8.f1469q
            if (r11 == 0) goto L_0x0144
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014a
        L_0x0144:
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014a:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x0153
            if (r10 == r9) goto L_0x0153
            return r10
        L_0x0153:
            int r6 = r6 + 1
            goto L_0x0135
        L_0x0156:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, p1.v0, p1.b1):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03eb, code lost:
        if (A0() != false) goto L_0x03ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q0(p1.v0 r17, p1.b1 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            p1.m1 r3 = r0.F
            r4 = -1
            p1.j1 r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f1477z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.f0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.f4537e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f1477z
            if (r3 != r4) goto L_0x002f
            p1.m1 r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = r5.f4539g
            p1.r1 r9 = r0.B
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x01f9
            r5.a()
            p1.m1 r11 = r0.F
            if (r11 == 0) goto L_0x00c0
            int r12 = r11.f4573f
            r13 = 0
            if (r12 <= 0) goto L_0x0087
            int r14 = r0.f1468p
            if (r12 != r14) goto L_0x0079
            r11 = r6
        L_0x0049:
            int r12 = r0.f1468p
            if (r11 >= r12) goto L_0x0087
            p1.n1[] r12 = r0.f1469q
            r12 = r12[r11]
            r12.b()
            p1.m1 r12 = r0.F
            int[] r14 = r12.f4574g
            r14 = r14[r11]
            if (r14 == r10) goto L_0x006e
            boolean r12 = r12.f4579l
            if (r12 == 0) goto L_0x0067
            p1.b0 r12 = r0.f1470r
            int r12 = r12.f()
            goto L_0x006d
        L_0x0067:
            p1.b0 r12 = r0.f1470r
            int r12 = r12.h()
        L_0x006d:
            int r14 = r14 + r12
        L_0x006e:
            p1.n1[] r12 = r0.f1469q
            r12 = r12[r11]
            r12.f4589b = r14
            r12.f4590c = r14
            int r11 = r11 + 1
            goto L_0x0049
        L_0x0079:
            r11.f4574g = r13
            r11.f4573f = r6
            r11.f4575h = r6
            r11.f4576i = r13
            r11.f4577j = r13
            int r12 = r11.f4572e
            r11.f4571d = r12
        L_0x0087:
            p1.m1 r11 = r0.F
            boolean r12 = r11.f4580m
            r0.E = r12
            boolean r11 = r11.f4578k
            r0.c(r13)
            p1.m1 r12 = r0.F
            if (r12 == 0) goto L_0x009c
            boolean r13 = r12.f4578k
            if (r13 == r11) goto L_0x009c
            r12.f4578k = r11
        L_0x009c:
            r0.w = r11
            r16.k0()
            r16.W0()
            p1.m1 r11 = r0.F
            int r12 = r11.f4571d
            if (r12 == r4) goto L_0x00af
            r0.f1477z = r12
            boolean r12 = r11.f4579l
            goto L_0x00b1
        L_0x00af:
            boolean r12 = r0.f1475x
        L_0x00b1:
            r5.f4535c = r12
            int r12 = r11.f4575h
            if (r12 <= r7) goto L_0x00c7
            int[] r12 = r11.f4576i
            r9.f4658b = r12
            java.util.List r11 = r11.f4577j
            r9.f4659c = r11
            goto L_0x00c7
        L_0x00c0:
            r16.W0()
            boolean r11 = r0.f1475x
            r5.f4535c = r11
        L_0x00c7:
            boolean r11 = r2.f4444g
            if (r11 != 0) goto L_0x01ba
            int r11 = r0.f1477z
            if (r11 != r4) goto L_0x00d1
            goto L_0x01ba
        L_0x00d1:
            if (r11 < 0) goto L_0x01b6
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00db
            goto L_0x01b6
        L_0x00db:
            p1.m1 r11 = r0.F
            if (r11 == 0) goto L_0x00f0
            int r12 = r11.f4571d
            if (r12 == r4) goto L_0x00f0
            int r11 = r11.f4573f
            if (r11 >= r7) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            r5.f4534b = r10
            int r11 = r0.f1477z
            r5.f4533a = r11
            goto L_0x01b4
        L_0x00f0:
            int r11 = r0.f1477z
            android.view.View r11 = r0.q(r11)
            if (r11 == 0) goto L_0x0178
            boolean r12 = r0.f1475x
            if (r12 == 0) goto L_0x0101
            int r12 = r16.K0()
            goto L_0x0105
        L_0x0101:
            int r12 = r16.J0()
        L_0x0105:
            r5.f4533a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x0130
            boolean r12 = r5.f4535c
            if (r12 == 0) goto L_0x011f
            p1.b0 r12 = r0.f1470r
            int r12 = r12.f()
            int r13 = r0.A
            int r12 = r12 - r13
            p1.b0 r13 = r0.f1470r
            int r11 = r13.b(r11)
            goto L_0x012e
        L_0x011f:
            p1.b0 r12 = r0.f1470r
            int r12 = r12.h()
            int r13 = r0.A
            int r12 = r12 + r13
            p1.b0 r13 = r0.f1470r
            int r11 = r13.d(r11)
        L_0x012e:
            int r12 = r12 - r11
            goto L_0x0172
        L_0x0130:
            p1.b0 r12 = r0.f1470r
            int r12 = r12.c(r11)
            p1.b0 r13 = r0.f1470r
            int r13 = r13.i()
            if (r12 <= r13) goto L_0x0150
            boolean r11 = r5.f4535c
            if (r11 == 0) goto L_0x0149
            p1.b0 r11 = r0.f1470r
            int r11 = r11.f()
            goto L_0x0160
        L_0x0149:
            p1.b0 r11 = r0.f1470r
            int r11 = r11.h()
            goto L_0x0160
        L_0x0150:
            p1.b0 r12 = r0.f1470r
            int r12 = r12.d(r11)
            p1.b0 r13 = r0.f1470r
            int r13 = r13.h()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0163
            int r11 = -r12
        L_0x0160:
            r5.f4534b = r11
            goto L_0x01b4
        L_0x0163:
            p1.b0 r12 = r0.f1470r
            int r12 = r12.f()
            p1.b0 r13 = r0.f1470r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0175
        L_0x0172:
            r5.f4534b = r12
            goto L_0x01b4
        L_0x0175:
            r5.f4534b = r10
            goto L_0x01b4
        L_0x0178:
            int r11 = r0.f1477z
            r5.f4533a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x019d
            int r11 = r0.z0(r11)
            if (r11 != r7) goto L_0x0188
            r11 = r7
            goto L_0x0189
        L_0x0188:
            r11 = r6
        L_0x0189:
            r5.f4535c = r11
            if (r11 == 0) goto L_0x0194
            p1.b0 r11 = r8.f1470r
            int r11 = r11.f()
            goto L_0x019a
        L_0x0194:
            p1.b0 r11 = r8.f1470r
            int r11 = r11.h()
        L_0x019a:
            r5.f4534b = r11
            goto L_0x01b2
        L_0x019d:
            boolean r11 = r5.f4535c
            if (r11 == 0) goto L_0x01a9
            p1.b0 r11 = r8.f1470r
            int r11 = r11.f()
            int r11 = r11 - r12
            goto L_0x01b0
        L_0x01a9:
            p1.b0 r11 = r8.f1470r
            int r11 = r11.h()
            int r11 = r11 + r12
        L_0x01b0:
            r5.f4534b = r11
        L_0x01b2:
            r5.f4536d = r7
        L_0x01b4:
            r11 = r7
            goto L_0x01bb
        L_0x01b6:
            r0.f1477z = r4
            r0.A = r10
        L_0x01ba:
            r11 = r6
        L_0x01bb:
            if (r11 == 0) goto L_0x01be
            goto L_0x01f7
        L_0x01be:
            boolean r11 = r0.D
            int r12 = r18.b()
            if (r11 == 0) goto L_0x01da
            int r11 = r16.v()
        L_0x01ca:
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x01f2
            android.view.View r13 = r0.u(r11)
            int r13 = p1.o0.F(r13)
            if (r13 < 0) goto L_0x01ca
            if (r13 >= r12) goto L_0x01ca
            goto L_0x01f3
        L_0x01da:
            int r11 = r16.v()
            r13 = r6
        L_0x01df:
            if (r13 >= r11) goto L_0x01f2
            android.view.View r14 = r0.u(r13)
            int r14 = p1.o0.F(r14)
            if (r14 < 0) goto L_0x01ef
            if (r14 >= r12) goto L_0x01ef
            r13 = r14
            goto L_0x01f3
        L_0x01ef:
            int r13 = r13 + 1
            goto L_0x01df
        L_0x01f2:
            r13 = r6
        L_0x01f3:
            r5.f4533a = r13
            r5.f4534b = r10
        L_0x01f7:
            r5.f4537e = r7
        L_0x01f9:
            p1.m1 r11 = r0.F
            if (r11 != 0) goto L_0x0214
            int r11 = r0.f1477z
            if (r11 != r4) goto L_0x0214
            boolean r11 = r5.f4535c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x020f
            boolean r11 = r16.P0()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x0214
        L_0x020f:
            r9.d()
            r5.f4536d = r7
        L_0x0214:
            int r9 = r16.v()
            if (r9 <= 0) goto L_0x02bf
            p1.m1 r9 = r0.F
            if (r9 == 0) goto L_0x0222
            int r9 = r9.f4573f
            if (r9 >= r7) goto L_0x02bf
        L_0x0222:
            boolean r9 = r5.f4536d
            if (r9 == 0) goto L_0x0241
            r3 = r6
        L_0x0227:
            int r8 = r0.f1468p
            if (r3 >= r8) goto L_0x02bf
            p1.n1[] r8 = r0.f1469q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f4534b
            if (r8 == r10) goto L_0x023e
            p1.n1[] r9 = r0.f1469q
            r9 = r9[r3]
            r9.f4589b = r8
            r9.f4590c = r8
        L_0x023e:
            int r3 = r3 + 1
            goto L_0x0227
        L_0x0241:
            if (r3 != 0) goto L_0x025f
            int[] r3 = r5.f4538f
            if (r3 != 0) goto L_0x0248
            goto L_0x025f
        L_0x0248:
            r3 = r6
        L_0x0249:
            int r8 = r0.f1468p
            if (r3 >= r8) goto L_0x02bf
            p1.n1[] r8 = r0.f1469q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f4538f
            r9 = r9[r3]
            r8.f4589b = r9
            r8.f4590c = r9
            int r3 = r3 + 1
            goto L_0x0249
        L_0x025f:
            r3 = r6
        L_0x0260:
            int r9 = r0.f1468p
            if (r3 >= r9) goto L_0x029e
            p1.n1[] r9 = r0.f1469q
            r9 = r9[r3]
            boolean r11 = r0.f1475x
            int r12 = r5.f4534b
            if (r11 == 0) goto L_0x0273
            int r13 = r9.f(r10)
            goto L_0x0277
        L_0x0273:
            int r13 = r9.i(r10)
        L_0x0277:
            r9.b()
            if (r13 != r10) goto L_0x027d
            goto L_0x029b
        L_0x027d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = r9.f4593f
            if (r11 == 0) goto L_0x0289
            p1.b0 r15 = r14.f1470r
            int r15 = r15.f()
            if (r13 < r15) goto L_0x029b
        L_0x0289:
            if (r11 != 0) goto L_0x0294
            p1.b0 r11 = r14.f1470r
            int r11 = r11.h()
            if (r13 <= r11) goto L_0x0294
            goto L_0x029b
        L_0x0294:
            if (r12 == r10) goto L_0x0297
            int r13 = r13 + r12
        L_0x0297:
            r9.f4590c = r13
            r9.f4589b = r13
        L_0x029b:
            int r3 = r3 + 1
            goto L_0x0260
        L_0x029e:
            p1.n1[] r3 = r0.f1469q
            int r9 = r3.length
            int[] r11 = r5.f4538f
            if (r11 == 0) goto L_0x02a8
            int r11 = r11.length
            if (r11 >= r9) goto L_0x02af
        L_0x02a8:
            p1.n1[] r8 = r8.f1469q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r5.f4538f = r8
        L_0x02af:
            r8 = r6
        L_0x02b0:
            if (r8 >= r9) goto L_0x02bf
            int[] r11 = r5.f4538f
            r12 = r3[r8]
            int r12 = r12.i(r10)
            r11[r8] = r12
            int r8 = r8 + 1
            goto L_0x02b0
        L_0x02bf:
            r16.p(r17)
            p1.u r3 = r0.f1474v
            r3.f4672a = r6
            p1.b0 r8 = r0.f1471s
            int r8 = r8.i()
            int r9 = r0.f1468p
            int r9 = r8 / r9
            r0.f1473u = r9
            p1.b0 r9 = r0.f1471s
            int r9 = r9.g()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f4533a
            r0.Z0(r8, r2)
            boolean r8 = r5.f4535c
            if (r8 == 0) goto L_0x02ee
            r0.Y0(r4)
            r0.E0(r1, r3, r2)
            r0.Y0(r7)
            goto L_0x02f7
        L_0x02ee:
            r0.Y0(r7)
            r0.E0(r1, r3, r2)
            r0.Y0(r4)
        L_0x02f7:
            int r4 = r5.f4533a
            int r8 = r3.f4675d
            int r4 = r4 + r8
            r3.f4674c = r4
            r0.E0(r1, r3, r2)
            p1.b0 r3 = r0.f1471s
            int r3 = r3.g()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x030d
            goto L_0x03ac
        L_0x030d:
            int r3 = r16.v()
            r4 = 0
            r8 = r6
        L_0x0313:
            if (r8 >= r3) goto L_0x0335
            android.view.View r9 = r0.u(r8)
            p1.b0 r11 = r0.f1471s
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0325
            goto L_0x0332
        L_0x0325:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            p1.k1 r9 = (p1.k1) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x0332:
            int r8 = r8 + 1
            goto L_0x0313
        L_0x0335:
            int r8 = r0.f1473u
            int r9 = r0.f1468p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            p1.b0 r9 = r0.f1471s
            int r9 = r9.g()
            if (r9 != r10) goto L_0x0351
            p1.b0 r9 = r0.f1471s
            int r9 = r9.i()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x0351:
            int r9 = r0.f1468p
            int r9 = r4 / r9
            r0.f1473u = r9
            p1.b0 r9 = r0.f1471s
            int r9 = r9.g()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f1473u
            if (r4 != r8) goto L_0x0365
            goto L_0x03ac
        L_0x0365:
            r4 = r6
        L_0x0366:
            if (r4 >= r3) goto L_0x03ac
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            p1.k1 r10 = (p1.k1) r10
            r10.getClass()
            boolean r11 = r16.P0()
            if (r11 == 0) goto L_0x0395
            int r11 = r0.f1472t
            if (r11 != r7) goto L_0x0395
            int r11 = r0.f1468p
            int r12 = r11 + -1
            p1.n1 r10 = r10.f4557e
            int r10 = r10.f4592e
            int r12 = r12 - r10
            int r12 = -r12
            int r13 = r0.f1473u
            int r12 = r12 * r13
            int r11 = r11 - r7
            int r11 = r11 - r10
            int r10 = -r11
            int r10 = r10 * r8
            int r12 = r12 - r10
            r9.offsetLeftAndRight(r12)
            goto L_0x03a9
        L_0x0395:
            p1.n1 r10 = r10.f4557e
            int r10 = r10.f4592e
            int r11 = r0.f1473u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f1472t
            int r11 = r11 - r10
            if (r12 != r7) goto L_0x03a6
            r9.offsetLeftAndRight(r11)
            goto L_0x03a9
        L_0x03a6:
            r9.offsetTopAndBottom(r11)
        L_0x03a9:
            int r4 = r4 + 1
            goto L_0x0366
        L_0x03ac:
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x03c3
            boolean r3 = r0.f1475x
            if (r3 == 0) goto L_0x03bd
            r0.H0(r1, r2, r7)
            r0.I0(r1, r2, r6)
            goto L_0x03c3
        L_0x03bd:
            r0.I0(r1, r2, r7)
            r0.H0(r1, r2, r6)
        L_0x03c3:
            if (r19 == 0) goto L_0x03ee
            boolean r3 = r2.f4444g
            if (r3 != 0) goto L_0x03ee
            int r3 = r0.C
            if (r3 == 0) goto L_0x03db
            int r3 = r16.v()
            if (r3 <= 0) goto L_0x03db
            android.view.View r3 = r16.O0()
            if (r3 == 0) goto L_0x03db
            r3 = r7
            goto L_0x03dc
        L_0x03db:
            r3 = r6
        L_0x03dc:
            if (r3 == 0) goto L_0x03ee
            androidx.recyclerview.widget.RecyclerView r3 = r0.f4596b
            if (r3 == 0) goto L_0x03e7
            p1.l r4 = r0.K
            r3.removeCallbacks(r4)
        L_0x03e7:
            boolean r3 = r16.A0()
            if (r3 == 0) goto L_0x03ee
            goto L_0x03ef
        L_0x03ee:
            r7 = r6
        L_0x03ef:
            boolean r3 = r2.f4444g
            if (r3 == 0) goto L_0x03f6
            r5.a()
        L_0x03f6:
            boolean r3 = r5.f4535c
            r0.D = r3
            boolean r3 = r16.P0()
            r0.E = r3
            if (r7 == 0) goto L_0x0408
            r5.a()
            r0.Q0(r1, r2, r6)
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(p1.v0, p1.b1, boolean):void");
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View G0 = G0(false);
            View F0 = F0(false);
            if (G0 != null && F0 != null) {
                int F2 = o0.F(G0);
                int F3 = o0.F(F0);
                if (F2 < F3) {
                    accessibilityEvent.setFromIndex(F2);
                    accessibilityEvent.setToIndex(F3);
                    return;
                }
                accessibilityEvent.setFromIndex(F3);
                accessibilityEvent.setToIndex(F2);
            }
        }
    }

    public final boolean R0(int i3) {
        if (this.f1472t == 0) {
            return (i3 == -1) != this.f1475x;
        }
        return ((i3 == -1) == this.f1475x) == P0();
    }

    public final void S0(int i3, b1 b1Var) {
        int i6;
        int i7;
        if (i3 > 0) {
            i7 = K0();
            i6 = 1;
        } else {
            i7 = J0();
            i6 = -1;
        }
        u uVar = this.f1474v;
        uVar.f4672a = true;
        Z0(i7, b1Var);
        Y0(i6);
        uVar.f4674c = i7 + uVar.f4675d;
        uVar.f4673b = Math.abs(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f4676e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T0(p1.v0 r5, p1.u r6) {
        /*
            r4 = this;
            boolean r0 = r6.f4672a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f4680i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f4673b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f4676e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f4678g
        L_0x0015:
            r4.U0(r6, r5)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f4677f
        L_0x001b:
            r4.V0(r6, r5)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f4676e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f4677f
            p1.n1[] r1 = r4.f1469q
            r1 = r1[r2]
            int r1 = r1.i(r0)
        L_0x002f:
            int r2 = r4.f1468p
            if (r3 >= r2) goto L_0x0041
            p1.n1[] r2 = r4.f1469q
            r2 = r2[r3]
            int r2 = r2.i(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f4678g
            int r6 = r6.f4673b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f4678g
            p1.n1[] r1 = r4.f1469q
            r1 = r1[r2]
            int r1 = r1.f(r0)
        L_0x005a:
            int r2 = r4.f1468p
            if (r3 >= r2) goto L_0x006c
            p1.n1[] r2 = r4.f1469q
            r2 = r2[r3]
            int r2 = r2.f(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f4678g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f4677f
            int r6 = r6.f4673b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(p1.v0, p1.u):void");
    }

    public final void U0(int i3, v0 v0Var) {
        int v5 = v() - 1;
        while (v5 >= 0) {
            View u3 = u(v5);
            if (this.f1470r.d(u3) >= i3 && this.f1470r.k(u3) >= i3) {
                k1 k1Var = (k1) u3.getLayoutParams();
                k1Var.getClass();
                if (k1Var.f4557e.f4588a.size() != 1) {
                    n1 n1Var = k1Var.f4557e;
                    ArrayList arrayList = n1Var.f4588a;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    k1 h6 = n1.h(view);
                    h6.f4557e = null;
                    if (h6.c() || h6.b()) {
                        n1Var.f4591d -= n1Var.f4593f.f1470r.c(view);
                    }
                    if (size == 1) {
                        n1Var.f4589b = Integer.MIN_VALUE;
                    }
                    n1Var.f4590c = Integer.MIN_VALUE;
                    h0(u3, v0Var);
                    v5--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void V(int i3, int i6) {
        N0(i3, i6, 1);
    }

    public final void V0(int i3, v0 v0Var) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f1470r.b(u3) <= i3 && this.f1470r.j(u3) <= i3) {
                k1 k1Var = (k1) u3.getLayoutParams();
                k1Var.getClass();
                if (k1Var.f4557e.f4588a.size() != 1) {
                    n1 n1Var = k1Var.f4557e;
                    ArrayList arrayList = n1Var.f4588a;
                    View view = (View) arrayList.remove(0);
                    k1 h6 = n1.h(view);
                    h6.f4557e = null;
                    if (arrayList.size() == 0) {
                        n1Var.f4590c = Integer.MIN_VALUE;
                    }
                    if (h6.c() || h6.b()) {
                        n1Var.f4591d -= n1Var.f4593f.f1470r.c(view);
                    }
                    n1Var.f4589b = Integer.MIN_VALUE;
                    h0(u3, v0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W() {
        this.B.d();
        k0();
    }

    public final void W0() {
        this.f1475x = (this.f1472t == 1 || !P0()) ? this.w : !this.w;
    }

    public final void X(int i3, int i6) {
        N0(i3, i6, 8);
    }

    public final int X0(int i3, v0 v0Var, b1 b1Var) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        S0(i3, b1Var);
        u uVar = this.f1474v;
        int E0 = E0(v0Var, uVar, b1Var);
        if (uVar.f4673b >= E0) {
            i3 = i3 < 0 ? -E0 : E0;
        }
        this.f1470r.l(-i3);
        this.D = this.f1475x;
        uVar.f4673b = 0;
        T0(v0Var, uVar);
        return i3;
    }

    public final void Y(int i3, int i6) {
        N0(i3, i6, 2);
    }

    public final void Y0(int i3) {
        u uVar = this.f1474v;
        uVar.f4676e = i3;
        int i6 = 1;
        if (this.f1475x != (i3 == -1)) {
            i6 = -1;
        }
        uVar.f4675d = i6;
    }

    public final void Z(int i3, int i6) {
        N0(i3, i6, 4);
    }

    public final void Z0(int i3, b1 b1Var) {
        int i6;
        int i7;
        int i8;
        u uVar = this.f1474v;
        boolean z5 = false;
        uVar.f4673b = 0;
        uVar.f4674c = i3;
        z zVar = this.f4599e;
        if (!(zVar != null && zVar.f4722e) || (i8 = b1Var.f4438a) == -1) {
            i7 = 0;
            i6 = 0;
        } else {
            if (this.f1475x == (i8 < i3)) {
                i7 = this.f1470r.i();
                i6 = 0;
            } else {
                i6 = this.f1470r.i();
                i7 = 0;
            }
        }
        RecyclerView recyclerView = this.f4596b;
        if (recyclerView != null && recyclerView.f1437k) {
            uVar.f4677f = this.f1470r.h() - i6;
            uVar.f4678g = this.f1470r.f() + i7;
        } else {
            uVar.f4678g = this.f1470r.e() + i7;
            uVar.f4677f = -i6;
        }
        uVar.f4679h = false;
        uVar.f4672a = true;
        if (this.f1470r.g() == 0 && this.f1470r.e() == 0) {
            z5 = true;
        }
        uVar.f4680i = z5;
    }

    public final PointF a(int i3) {
        int z02 = z0(i3);
        PointF pointF = new PointF();
        if (z02 == 0) {
            return null;
        }
        if (this.f1472t == 0) {
            pointF.x = (float) z02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) z02;
        }
        return pointF;
    }

    public final void a0(v0 v0Var, b1 b1Var) {
        Q0(v0Var, b1Var, true);
    }

    public final void a1(n1 n1Var, int i3, int i6) {
        int i7 = n1Var.f4591d;
        if (i3 == -1) {
            int i8 = n1Var.f4589b;
            if (i8 == Integer.MIN_VALUE) {
                View view = (View) n1Var.f4588a.get(0);
                k1 h6 = n1.h(view);
                n1Var.f4589b = n1Var.f4593f.f1470r.d(view);
                h6.getClass();
                i8 = n1Var.f4589b;
            }
            if (i8 + i7 > i6) {
                return;
            }
        } else {
            int i9 = n1Var.f4590c;
            if (i9 == Integer.MIN_VALUE) {
                n1Var.a();
                i9 = n1Var.f4590c;
            }
            if (i9 - i7 < i6) {
                return;
            }
        }
        this.f1476y.set(n1Var.f4592e, false);
    }

    public final void b0(b1 b1Var) {
        this.f1477z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof m1) {
            m1 m1Var = (m1) parcelable;
            this.F = m1Var;
            if (this.f1477z != -1) {
                m1Var.f4574g = null;
                m1Var.f4573f = 0;
                m1Var.f4571d = -1;
                m1Var.f4572e = -1;
                m1Var.f4574g = null;
                m1Var.f4573f = 0;
                m1Var.f4575h = 0;
                m1Var.f4576i = null;
                m1Var.f4577j = null;
            }
            k0();
        }
    }

    public final boolean d() {
        return this.f1472t == 0;
    }

    public final Parcelable d0() {
        int i3;
        int i6;
        int[] iArr;
        m1 m1Var = this.F;
        if (m1Var != null) {
            return new m1(m1Var);
        }
        m1 m1Var2 = new m1();
        m1Var2.f4578k = this.w;
        m1Var2.f4579l = this.D;
        m1Var2.f4580m = this.E;
        r1 r1Var = this.B;
        if (r1Var == null || (iArr = (int[]) r1Var.f4658b) == null) {
            m1Var2.f4575h = 0;
        } else {
            m1Var2.f4576i = iArr;
            m1Var2.f4575h = iArr.length;
            m1Var2.f4577j = (List) r1Var.f4659c;
        }
        int i7 = -1;
        if (v() > 0) {
            m1Var2.f4571d = this.D ? K0() : J0();
            View F0 = this.f1475x ? F0(true) : G0(true);
            if (F0 != null) {
                i7 = o0.F(F0);
            }
            m1Var2.f4572e = i7;
            int i8 = this.f1468p;
            m1Var2.f4573f = i8;
            m1Var2.f4574g = new int[i8];
            for (int i9 = 0; i9 < this.f1468p; i9++) {
                if (this.D) {
                    i3 = this.f1469q[i9].f(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        i6 = this.f1470r.f();
                    } else {
                        m1Var2.f4574g[i9] = i3;
                    }
                } else {
                    i3 = this.f1469q[i9].i(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        i6 = this.f1470r.h();
                    } else {
                        m1Var2.f4574g[i9] = i3;
                    }
                }
                i3 -= i6;
                m1Var2.f4574g[i9] = i3;
            }
        } else {
            m1Var2.f4571d = -1;
            m1Var2.f4572e = -1;
            m1Var2.f4573f = 0;
        }
        return m1Var2;
    }

    public final boolean e() {
        return this.f1472t == 1;
    }

    public final void e0(int i3) {
        if (i3 == 0) {
            A0();
        }
    }

    public final boolean f(p0 p0Var) {
        return p0Var instanceof k1;
    }

    public final void h(int i3, int i6, b1 b1Var, q qVar) {
        u uVar;
        int i7;
        int i8;
        if (this.f1472t != 0) {
            i3 = i6;
        }
        if (v() != 0 && i3 != 0) {
            S0(i3, b1Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1468p) {
                this.J = new int[this.f1468p];
            }
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.f1468p;
                uVar = this.f1474v;
                if (i9 >= i11) {
                    break;
                }
                if (uVar.f4675d == -1) {
                    i8 = uVar.f4677f;
                    i7 = this.f1469q[i9].i(i8);
                } else {
                    i8 = this.f1469q[i9].f(uVar.f4678g);
                    i7 = uVar.f4678g;
                }
                int i12 = i8 - i7;
                if (i12 >= 0) {
                    this.J[i10] = i12;
                    i10++;
                }
                i9++;
            }
            Arrays.sort(this.J, 0, i10);
            int i13 = 0;
            while (i13 < i10) {
                int i14 = uVar.f4674c;
                if (i14 >= 0 && i14 < b1Var.b()) {
                    qVar.a(uVar.f4674c, this.J[i13]);
                    uVar.f4674c += uVar.f4675d;
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final int j(b1 b1Var) {
        return B0(b1Var);
    }

    public final int k(b1 b1Var) {
        return C0(b1Var);
    }

    public final int l(b1 b1Var) {
        return D0(b1Var);
    }

    public final int l0(int i3, v0 v0Var, b1 b1Var) {
        return X0(i3, v0Var, b1Var);
    }

    public final int m(b1 b1Var) {
        return B0(b1Var);
    }

    public final void m0(int i3) {
        m1 m1Var = this.F;
        if (!(m1Var == null || m1Var.f4571d == i3)) {
            m1Var.f4574g = null;
            m1Var.f4573f = 0;
            m1Var.f4571d = -1;
            m1Var.f4572e = -1;
        }
        this.f1477z = i3;
        this.A = Integer.MIN_VALUE;
        k0();
    }

    public final int n(b1 b1Var) {
        return C0(b1Var);
    }

    public final int n0(int i3, v0 v0Var, b1 b1Var) {
        return X0(i3, v0Var, b1Var);
    }

    public final int o(b1 b1Var) {
        return D0(b1Var);
    }

    public final void q0(Rect rect, int i3, int i6) {
        int i7;
        int i8;
        int D2 = D() + C();
        int B2 = B() + E();
        if (this.f1472t == 1) {
            int height = rect.height() + B2;
            RecyclerView recyclerView = this.f4596b;
            WeakHashMap weakHashMap = u0.f5622a;
            i8 = o0.g(i6, height, d0.d(recyclerView));
            i7 = o0.g(i3, (this.f1473u * this.f1468p) + D2, d0.e(this.f4596b));
        } else {
            int width = rect.width() + D2;
            RecyclerView recyclerView2 = this.f4596b;
            WeakHashMap weakHashMap2 = u0.f5622a;
            i7 = o0.g(i3, width, d0.e(recyclerView2));
            i8 = o0.g(i6, (this.f1473u * this.f1468p) + B2, d0.d(this.f4596b));
        }
        this.f4596b.setMeasuredDimension(i7, i8);
    }

    public final p0 r() {
        return this.f1472t == 0 ? new k1(-2, -1) : new k1(-1, -2);
    }

    public final p0 s(Context context, AttributeSet attributeSet) {
        return new k1(context, attributeSet);
    }

    public final p0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k1((ViewGroup.MarginLayoutParams) layoutParams) : new k1(layoutParams);
    }

    public final void w0(RecyclerView recyclerView, int i3) {
        z zVar = new z(recyclerView.getContext());
        zVar.f4718a = i3;
        x0(zVar);
    }

    public final boolean y0() {
        return this.F == null;
    }

    public final int z0(int i3) {
        if (v() == 0) {
            return this.f1475x ? 1 : -1;
        }
        return (i3 < J0()) != this.f1475x ? -1 : 1;
    }
}
