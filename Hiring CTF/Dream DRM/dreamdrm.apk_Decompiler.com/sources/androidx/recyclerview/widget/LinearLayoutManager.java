package androidx.recyclerview.widget;

import a2.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p1.a0;
import p1.a1;
import p1.b0;
import p1.b1;
import p1.n0;
import p1.o0;
import p1.p0;
import p1.q;
import p1.v;
import p1.v0;
import p1.w;
import p1.x;
import p1.y;
import p1.z;

public class LinearLayoutManager extends o0 implements a1 {
    public final v A = new v();
    public final w B = new w();
    public final int C = 2;
    public final int[] D = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f1411p = 1;

    /* renamed from: q  reason: collision with root package name */
    public x f1412q;

    /* renamed from: r  reason: collision with root package name */
    public a0 f1413r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1414s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1415t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1416u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1417v = false;
    public final boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f1418x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f1419y = Integer.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public y f1420z = null;

    public LinearLayoutManager(int i3) {
        Z0(i3);
        c((String) null);
        if (this.f1415t) {
            this.f1415t = false;
            k0();
        }
    }

    public void A0(b1 b1Var, x xVar, q qVar) {
        int i3 = xVar.f4704d;
        if (i3 >= 0 && i3 < b1Var.b()) {
            qVar.a(i3, Math.max(0, xVar.f4707g));
        }
    }

    public final int B0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        a0 a0Var = this.f1413r;
        boolean z5 = !this.w;
        return b1.v.m(b1Var, a0Var, I0(z5), H0(z5), this, this.w);
    }

    public final int C0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        a0 a0Var = this.f1413r;
        boolean z5 = !this.w;
        return b1.v.n(b1Var, a0Var, I0(z5), H0(z5), this, this.w, this.f1416u);
    }

    public final int D0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        a0 a0Var = this.f1413r;
        boolean z5 = !this.w;
        return b1.v.o(b1Var, a0Var, I0(z5), H0(z5), this, this.w);
    }

    public final int E0(int i3) {
        if (i3 == 1) {
            return (this.f1411p != 1 && S0()) ? 1 : -1;
        }
        if (i3 == 2) {
            return (this.f1411p != 1 && S0()) ? -1 : 1;
        }
        if (i3 == 17) {
            return this.f1411p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 == 33) {
            return this.f1411p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 == 66) {
            return this.f1411p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i3 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f1411p == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final void F0() {
        if (this.f1412q == null) {
            this.f1412q = new x();
        }
    }

    public final int G0(v0 v0Var, x xVar, b1 b1Var, boolean z5) {
        int i3 = xVar.f4703c;
        int i6 = xVar.f4707g;
        if (i6 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                xVar.f4707g = i6 + i3;
            }
            V0(v0Var, xVar);
        }
        int i7 = xVar.f4703c + xVar.f4708h;
        while (true) {
            if (!xVar.f4712l && i7 <= 0) {
                break;
            }
            int i8 = xVar.f4704d;
            if (!(i8 >= 0 && i8 < b1Var.b())) {
                break;
            }
            w wVar = this.B;
            wVar.f4697a = 0;
            wVar.f4698b = false;
            wVar.f4699c = false;
            wVar.f4700d = false;
            T0(v0Var, b1Var, xVar, wVar);
            if (!wVar.f4698b) {
                int i9 = xVar.f4702b;
                int i10 = wVar.f4697a;
                xVar.f4702b = (xVar.f4706f * i10) + i9;
                if (!wVar.f4699c || xVar.f4711k != null || !b1Var.f4444g) {
                    xVar.f4703c -= i10;
                    i7 -= i10;
                }
                int i11 = xVar.f4707g;
                if (i11 != Integer.MIN_VALUE) {
                    int i12 = i11 + i10;
                    xVar.f4707g = i12;
                    int i13 = xVar.f4703c;
                    if (i13 < 0) {
                        xVar.f4707g = i12 + i13;
                    }
                    V0(v0Var, xVar);
                }
                if (z5 && wVar.f4700d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - xVar.f4703c;
    }

    public final View H0(boolean z5) {
        int i3;
        int i6;
        if (this.f1416u) {
            i6 = v();
            i3 = 0;
        } else {
            i3 = v() - 1;
            i6 = -1;
        }
        return M0(i3, i6, z5);
    }

    public final View I0(boolean z5) {
        int i3;
        int i6;
        if (this.f1416u) {
            i3 = -1;
            i6 = v() - 1;
        } else {
            i3 = v();
            i6 = 0;
        }
        return M0(i6, i3, z5);
    }

    public final boolean J() {
        return true;
    }

    public final int J0() {
        View M0 = M0(0, v(), false);
        if (M0 == null) {
            return -1;
        }
        return o0.F(M0);
    }

    public final int K0() {
        View M0 = M0(v() - 1, -1, false);
        if (M0 == null) {
            return -1;
        }
        return o0.F(M0);
    }

    public final View L0(int i3, int i6) {
        int i7;
        int i8;
        F0();
        if ((i6 > i3 ? 1 : i6 < i3 ? (char) 65535 : 0) == 0) {
            return u(i3);
        }
        if (this.f1413r.d(u(i3)) < this.f1413r.h()) {
            i8 = 16644;
            i7 = 16388;
        } else {
            i8 = 4161;
            i7 = 4097;
        }
        return (this.f1411p == 0 ? this.f4597c : this.f4598d).f(i3, i6, i8, i7);
    }

    public final View M0(int i3, int i6, boolean z5) {
        F0();
        return (this.f1411p == 0 ? this.f4597c : this.f4598d).f(i3, i6, z5 ? 24579 : 320, 320);
    }

    public View N0(v0 v0Var, b1 b1Var, boolean z5, boolean z6) {
        int i3;
        int i6;
        int i7;
        F0();
        int v5 = v();
        if (z6) {
            i7 = v() - 1;
            i6 = -1;
            i3 = -1;
        } else {
            i6 = v5;
            i7 = 0;
            i3 = 1;
        }
        int b6 = b1Var.b();
        int h6 = this.f1413r.h();
        int f6 = this.f1413r.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i7 != i6) {
            View u3 = u(i7);
            int F = o0.F(u3);
            int d6 = this.f1413r.d(u3);
            int b7 = this.f1413r.b(u3);
            if (F >= 0 && F < b6) {
                if (!((p0) u3.getLayoutParams()).c()) {
                    boolean z7 = b7 <= h6 && d6 < h6;
                    boolean z8 = d6 >= f6 && b7 > f6;
                    if (!z7 && !z8) {
                        return u3;
                    }
                    if (z5) {
                        if (!z8) {
                            if (view != null) {
                            }
                            view = u3;
                        }
                    } else if (!z7) {
                        if (view != null) {
                        }
                        view = u3;
                    }
                    view2 = u3;
                } else if (view3 == null) {
                    view3 = u3;
                }
            }
            i7 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int O0(int i3, v0 v0Var, b1 b1Var, boolean z5) {
        int f6;
        int f7 = this.f1413r.f() - i3;
        if (f7 <= 0) {
            return 0;
        }
        int i6 = -Y0(-f7, v0Var, b1Var);
        int i7 = i3 + i6;
        if (!z5 || (f6 = this.f1413r.f() - i7) <= 0) {
            return i6;
        }
        this.f1413r.l(f6);
        return f6 + i6;
    }

    public final void P(RecyclerView recyclerView) {
    }

    public final int P0(int i3, v0 v0Var, b1 b1Var, boolean z5) {
        int h6;
        int h7 = i3 - this.f1413r.h();
        if (h7 <= 0) {
            return 0;
        }
        int i6 = -Y0(h7, v0Var, b1Var);
        int i7 = i3 + i6;
        if (!z5 || (h6 = i7 - this.f1413r.h()) <= 0) {
            return i6;
        }
        this.f1413r.l(-h6);
        return i6 - h6;
    }

    public View Q(View view, int i3, v0 v0Var, b1 b1Var) {
        int E0;
        X0();
        if (v() == 0 || (E0 = E0(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        F0();
        b1(E0, (int) (((float) this.f1413r.i()) * 0.33333334f), false, b1Var);
        x xVar = this.f1412q;
        xVar.f4707g = Integer.MIN_VALUE;
        xVar.f4701a = false;
        G0(v0Var, xVar, b1Var, true);
        View L0 = E0 == -1 ? this.f1416u ? L0(v() - 1, -1) : L0(0, v()) : this.f1416u ? L0(0, v()) : L0(v() - 1, -1);
        View R0 = E0 == -1 ? R0() : Q0();
        if (!R0.hasFocusable()) {
            return L0;
        }
        if (L0 == null) {
            return null;
        }
        return R0;
    }

    public final View Q0() {
        return u(this.f1416u ? 0 : v() - 1);
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(J0());
            accessibilityEvent.setToIndex(K0());
        }
    }

    public final View R0() {
        return u(this.f1416u ? v() - 1 : 0);
    }

    public final boolean S0() {
        return A() == 1;
    }

    public void T0(v0 v0Var, b1 b1Var, x xVar, w wVar) {
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        View b6 = xVar.b(v0Var);
        if (b6 == null) {
            wVar.f4698b = true;
            return;
        }
        p0 p0Var = (p0) b6.getLayoutParams();
        if (xVar.f4711k == null) {
            if (this.f1416u == (xVar.f4706f == -1)) {
                b(b6, -1, false);
            } else {
                b(b6, 0, false);
            }
        } else {
            if (this.f1416u == (xVar.f4706f == -1)) {
                b(b6, -1, true);
            } else {
                b(b6, 0, true);
            }
        }
        p0 p0Var2 = (p0) b6.getLayoutParams();
        Rect M = this.f4596b.M(b6);
        int w5 = o0.w(this.f4608n, this.f4606l, D() + C() + p0Var2.leftMargin + p0Var2.rightMargin + M.left + M.right + 0, p0Var2.width, d());
        int w6 = o0.w(this.f4609o, this.f4607m, B() + E() + p0Var2.topMargin + p0Var2.bottomMargin + M.top + M.bottom + 0, p0Var2.height, e());
        if (t0(b6, w5, w6, p0Var2)) {
            b6.measure(w5, w6);
        }
        wVar.f4697a = this.f1413r.c(b6);
        if (this.f1411p == 1) {
            if (S0()) {
                i8 = this.f4608n - D();
                i9 = i8 - this.f1413r.m(b6);
            } else {
                i9 = C();
                i8 = this.f1413r.m(b6) + i9;
            }
            int i10 = xVar.f4706f;
            i3 = xVar.f4702b;
            if (i10 == -1) {
                int i11 = i9;
                i7 = i3;
                i3 -= wVar.f4697a;
                i6 = i11;
            } else {
                i6 = i9;
                i7 = wVar.f4697a + i3;
            }
        } else {
            int E = E();
            i7 = this.f1413r.m(b6) + E;
            int i12 = xVar.f4706f;
            int i13 = xVar.f4702b;
            if (i12 == -1) {
                i6 = i13 - wVar.f4697a;
                int i14 = E;
                i8 = i13;
                i3 = i14;
            } else {
                int i15 = wVar.f4697a + i13;
                i6 = i13;
                i3 = E;
                i8 = i15;
            }
        }
        o0.L(b6, i6, i3, i8, i7);
        if (p0Var.c() || p0Var.b()) {
            wVar.f4699c = true;
        }
        wVar.f4700d = b6.hasFocusable();
    }

    public void U0(v0 v0Var, b1 b1Var, v vVar, int i3) {
    }

    public final void V0(v0 v0Var, x xVar) {
        if (xVar.f4701a && !xVar.f4712l) {
            int i3 = xVar.f4707g;
            int i6 = xVar.f4709i;
            if (xVar.f4706f == -1) {
                int v5 = v();
                if (i3 >= 0) {
                    int e6 = (this.f1413r.e() - i3) + i6;
                    if (this.f1416u) {
                        for (int i7 = 0; i7 < v5; i7++) {
                            View u3 = u(i7);
                            if (this.f1413r.d(u3) < e6 || this.f1413r.k(u3) < e6) {
                                W0(v0Var, 0, i7);
                                return;
                            }
                        }
                        return;
                    }
                    int i8 = v5 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View u5 = u(i9);
                        if (this.f1413r.d(u5) < e6 || this.f1413r.k(u5) < e6) {
                            W0(v0Var, i8, i9);
                            return;
                        }
                    }
                }
            } else if (i3 >= 0) {
                int i10 = i3 - i6;
                int v6 = v();
                if (this.f1416u) {
                    int i11 = v6 - 1;
                    for (int i12 = i11; i12 >= 0; i12--) {
                        View u6 = u(i12);
                        if (this.f1413r.b(u6) > i10 || this.f1413r.j(u6) > i10) {
                            W0(v0Var, i11, i12);
                            return;
                        }
                    }
                    return;
                }
                for (int i13 = 0; i13 < v6; i13++) {
                    View u7 = u(i13);
                    if (this.f1413r.b(u7) > i10 || this.f1413r.j(u7) > i10) {
                        W0(v0Var, 0, i13);
                        return;
                    }
                }
            }
        }
    }

    public final void W0(v0 v0Var, int i3, int i6) {
        if (i3 != i6) {
            if (i6 > i3) {
                while (true) {
                    i6--;
                    if (i6 >= i3) {
                        View u3 = u(i6);
                        i0(i6);
                        v0Var.i(u3);
                    } else {
                        return;
                    }
                }
            } else {
                while (i3 > i6) {
                    View u5 = u(i3);
                    i0(i3);
                    v0Var.i(u5);
                    i3--;
                }
            }
        }
    }

    public final void X0() {
        this.f1416u = (this.f1411p == 1 || !S0()) ? this.f1415t : !this.f1415t;
    }

    public final int Y0(int i3, v0 v0Var, b1 b1Var) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        F0();
        this.f1412q.f4701a = true;
        int i6 = i3 > 0 ? 1 : -1;
        int abs = Math.abs(i3);
        b1(i6, abs, true, b1Var);
        x xVar = this.f1412q;
        int G0 = G0(v0Var, xVar, b1Var, false) + xVar.f4707g;
        if (G0 < 0) {
            return 0;
        }
        if (abs > G0) {
            i3 = i6 * G0;
        }
        this.f1413r.l(-i3);
        this.f1412q.f4710j = i3;
        return i3;
    }

    public final void Z0(int i3) {
        if (i3 == 0 || i3 == 1) {
            c((String) null);
            if (i3 != this.f1411p || this.f1413r == null) {
                a0 a6 = b0.a(this, i3);
                this.f1413r = a6;
                this.A.f4684a = a6;
                this.f1411p = i3;
                k0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(m.g("invalid orientation:", i3));
    }

    public final PointF a(int i3) {
        if (v() == 0) {
            return null;
        }
        boolean z5 = false;
        int i6 = 1;
        if (i3 < o0.F(u(0))) {
            z5 = true;
        }
        if (z5 != this.f1416u) {
            i6 = -1;
        }
        return this.f1411p == 0 ? new PointF((float) i6, 0.0f) : new PointF(0.0f, (float) i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0(p1.v0 r18, p1.b1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            p1.y r3 = r0.f1420z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f1418x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r19.b()
            if (r3 != 0) goto L_0x0019
            r17.f0(r18)
            return
        L_0x0019:
            p1.y r3 = r0.f1420z
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002a
            int r3 = r3.f4714d
            if (r3 < 0) goto L_0x0025
            r7 = r5
            goto L_0x0026
        L_0x0025:
            r7 = r6
        L_0x0026:
            if (r7 == 0) goto L_0x002a
            r0.f1418x = r3
        L_0x002a:
            r17.F0()
            p1.x r3 = r0.f1412q
            r3.f4701a = r6
            r17.X0()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f4596b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            p1.d r8 = r0.f4595a
            boolean r8 = r8.j(r3)
            if (r8 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            p1.v r8 = r0.A
            boolean r9 = r8.f4688e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0081
            int r9 = r0.f1418x
            if (r9 != r4) goto L_0x0081
            p1.y r9 = r0.f1420z
            if (r9 == 0) goto L_0x005a
            goto L_0x0081
        L_0x005a:
            if (r3 == 0) goto L_0x025b
            p1.a0 r9 = r0.f1413r
            int r9 = r9.d(r3)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.f()
            if (r9 >= r11) goto L_0x0078
            p1.a0 r9 = r0.f1413r
            int r9 = r9.b(r3)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.h()
            if (r9 > r11) goto L_0x025b
        L_0x0078:
            int r9 = p1.o0.F(r3)
            r8.b(r3, r9)
            goto L_0x025b
        L_0x0081:
            r8.c()
            boolean r3 = r0.f1416u
            boolean r9 = r0.f1417v
            r3 = r3 ^ r9
            r8.f4687d = r3
            boolean r3 = r2.f4444g
            if (r3 != 0) goto L_0x0195
            int r3 = r0.f1418x
            if (r3 != r4) goto L_0x0095
            goto L_0x0195
        L_0x0095:
            if (r3 < 0) goto L_0x0191
            int r9 = r19.b()
            if (r3 < r9) goto L_0x009f
            goto L_0x0191
        L_0x009f:
            int r3 = r0.f1418x
            r8.f4685b = r3
            p1.y r9 = r0.f1420z
            if (r9 == 0) goto L_0x00ce
            int r11 = r9.f4714d
            if (r11 < 0) goto L_0x00ad
            r11 = r5
            goto L_0x00ae
        L_0x00ad:
            r11 = r6
        L_0x00ae:
            if (r11 == 0) goto L_0x00ce
            boolean r3 = r9.f4716f
            r8.f4687d = r3
            if (r3 == 0) goto L_0x00c2
            p1.a0 r3 = r0.f1413r
            int r3 = r3.f()
            p1.y r9 = r0.f1420z
            int r9 = r9.f4715e
            goto L_0x0182
        L_0x00c2:
            p1.a0 r3 = r0.f1413r
            int r3 = r3.h()
            p1.y r9 = r0.f1420z
            int r9 = r9.f4715e
            goto L_0x018c
        L_0x00ce:
            int r9 = r0.f1419y
            if (r9 != r10) goto L_0x0174
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x0142
            p1.a0 r9 = r0.f1413r
            int r9 = r9.c(r3)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.i()
            if (r9 <= r11) goto L_0x00e8
            goto L_0x0160
        L_0x00e8:
            p1.a0 r9 = r0.f1413r
            int r9 = r9.d(r3)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.h()
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x0103
            p1.a0 r3 = r0.f1413r
            int r3 = r3.h()
            r8.f4686c = r3
            r8.f4687d = r6
            goto L_0x018f
        L_0x0103:
            p1.a0 r9 = r0.f1413r
            int r9 = r9.f()
            p1.a0 r11 = r0.f1413r
            int r11 = r11.b(r3)
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x011e
            p1.a0 r3 = r0.f1413r
            int r3 = r3.f()
            r8.f4686c = r3
            r8.f4687d = r5
            goto L_0x018f
        L_0x011e:
            boolean r9 = r8.f4687d
            if (r9 == 0) goto L_0x0139
            p1.a0 r9 = r0.f1413r
            int r3 = r9.b(r3)
            p1.a0 r9 = r0.f1413r
            int r11 = r9.f4436b
            if (r10 != r11) goto L_0x0130
            r11 = r6
            goto L_0x0137
        L_0x0130:
            int r11 = r9.i()
            int r9 = r9.f4436b
            int r11 = r11 - r9
        L_0x0137:
            int r11 = r11 + r3
            goto L_0x013f
        L_0x0139:
            p1.a0 r9 = r0.f1413r
            int r11 = r9.d(r3)
        L_0x013f:
            r8.f4686c = r11
            goto L_0x018f
        L_0x0142:
            int r3 = r17.v()
            if (r3 <= 0) goto L_0x0160
            android.view.View r3 = r0.u(r6)
            int r3 = p1.o0.F(r3)
            int r9 = r0.f1418x
            if (r9 >= r3) goto L_0x0156
            r3 = r5
            goto L_0x0157
        L_0x0156:
            r3 = r6
        L_0x0157:
            boolean r9 = r0.f1416u
            if (r3 != r9) goto L_0x015d
            r3 = r5
            goto L_0x015e
        L_0x015d:
            r3 = r6
        L_0x015e:
            r8.f4687d = r3
        L_0x0160:
            boolean r3 = r8.f4687d
            if (r3 == 0) goto L_0x016b
            p1.a0 r3 = r8.f4684a
            int r3 = r3.f()
            goto L_0x0171
        L_0x016b:
            p1.a0 r3 = r8.f4684a
            int r3 = r3.h()
        L_0x0171:
            r8.f4686c = r3
            goto L_0x018f
        L_0x0174:
            boolean r3 = r0.f1416u
            r8.f4687d = r3
            if (r3 == 0) goto L_0x0184
            p1.a0 r3 = r0.f1413r
            int r3 = r3.f()
            int r9 = r0.f1419y
        L_0x0182:
            int r3 = r3 - r9
            goto L_0x018d
        L_0x0184:
            p1.a0 r3 = r0.f1413r
            int r3 = r3.h()
            int r9 = r0.f1419y
        L_0x018c:
            int r3 = r3 + r9
        L_0x018d:
            r8.f4686c = r3
        L_0x018f:
            r3 = r5
            goto L_0x0196
        L_0x0191:
            r0.f1418x = r4
            r0.f1419y = r10
        L_0x0195:
            r3 = r6
        L_0x0196:
            if (r3 == 0) goto L_0x019a
            goto L_0x0259
        L_0x019a:
            int r3 = r17.v()
            if (r3 != 0) goto L_0x01a2
            goto L_0x0235
        L_0x01a2:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f4596b
            if (r3 != 0) goto L_0x01a8
        L_0x01a6:
            r3 = 0
            goto L_0x01b7
        L_0x01a8:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x01a6
            p1.d r9 = r0.f4595a
            boolean r9 = r9.j(r3)
            if (r9 == 0) goto L_0x01b7
            goto L_0x01a6
        L_0x01b7:
            if (r3 == 0) goto L_0x01e2
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            p1.p0 r9 = (p1.p0) r9
            boolean r11 = r9.c()
            if (r11 != 0) goto L_0x01d7
            int r11 = r9.a()
            if (r11 < 0) goto L_0x01d7
            int r9 = r9.a()
            int r11 = r19.b()
            if (r9 >= r11) goto L_0x01d7
            r9 = r5
            goto L_0x01d8
        L_0x01d7:
            r9 = r6
        L_0x01d8:
            if (r9 == 0) goto L_0x01e2
            int r9 = p1.o0.F(r3)
            r8.b(r3, r9)
            goto L_0x0233
        L_0x01e2:
            boolean r3 = r0.f1414s
            boolean r9 = r0.f1417v
            if (r3 == r9) goto L_0x01e9
            goto L_0x0235
        L_0x01e9:
            boolean r3 = r8.f4687d
            android.view.View r3 = r0.N0(r1, r2, r3, r9)
            if (r3 == 0) goto L_0x0235
            int r9 = p1.o0.F(r3)
            r8.a(r3, r9)
            boolean r9 = r2.f4444g
            if (r9 != 0) goto L_0x0233
            boolean r9 = r17.y0()
            if (r9 == 0) goto L_0x0233
            p1.a0 r9 = r0.f1413r
            int r9 = r9.d(r3)
            p1.a0 r11 = r0.f1413r
            int r3 = r11.b(r3)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.h()
            p1.a0 r12 = r0.f1413r
            int r12 = r12.f()
            if (r3 > r11) goto L_0x0220
            if (r9 >= r11) goto L_0x0220
            r13 = r5
            goto L_0x0221
        L_0x0220:
            r13 = r6
        L_0x0221:
            if (r9 < r12) goto L_0x0227
            if (r3 <= r12) goto L_0x0227
            r3 = r5
            goto L_0x0228
        L_0x0227:
            r3 = r6
        L_0x0228:
            if (r13 != 0) goto L_0x022c
            if (r3 == 0) goto L_0x0233
        L_0x022c:
            boolean r3 = r8.f4687d
            if (r3 == 0) goto L_0x0231
            r11 = r12
        L_0x0231:
            r8.f4686c = r11
        L_0x0233:
            r3 = r5
            goto L_0x0236
        L_0x0235:
            r3 = r6
        L_0x0236:
            if (r3 == 0) goto L_0x0239
            goto L_0x0259
        L_0x0239:
            boolean r3 = r8.f4687d
            if (r3 == 0) goto L_0x0244
            p1.a0 r3 = r8.f4684a
            int r3 = r3.f()
            goto L_0x024a
        L_0x0244:
            p1.a0 r3 = r8.f4684a
            int r3 = r3.h()
        L_0x024a:
            r8.f4686c = r3
            boolean r3 = r0.f1417v
            if (r3 == 0) goto L_0x0256
            int r3 = r19.b()
            int r3 = r3 + r4
            goto L_0x0257
        L_0x0256:
            r3 = r6
        L_0x0257:
            r8.f4685b = r3
        L_0x0259:
            r8.f4688e = r5
        L_0x025b:
            p1.x r3 = r0.f1412q
            int r9 = r3.f4710j
            if (r9 < 0) goto L_0x0263
            r9 = r5
            goto L_0x0264
        L_0x0263:
            r9 = r4
        L_0x0264:
            r3.f4706f = r9
            int[] r3 = r0.D
            r3[r6] = r6
            r3[r5] = r6
            r0.z0(r2, r3)
            r9 = r3[r6]
            int r9 = java.lang.Math.max(r6, r9)
            p1.a0 r11 = r0.f1413r
            int r11 = r11.h()
            int r11 = r11 + r9
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r6, r3)
            p1.a0 r9 = r0.f1413r
            int r12 = r9.f4429d
            p1.o0 r9 = r9.f4435a
            switch(r12) {
                case 0: goto L_0x028c;
                default: goto L_0x028b;
            }
        L_0x028b:
            goto L_0x0291
        L_0x028c:
            int r9 = r9.D()
            goto L_0x0295
        L_0x0291:
            int r9 = r9.B()
        L_0x0295:
            int r9 = r9 + r3
            boolean r3 = r2.f4444g
            if (r3 == 0) goto L_0x02d1
            int r3 = r0.f1418x
            if (r3 == r4) goto L_0x02d1
            int r12 = r0.f1419y
            if (r12 == r10) goto L_0x02d1
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x02d1
            boolean r10 = r0.f1416u
            if (r10 == 0) goto L_0x02bc
            p1.a0 r10 = r0.f1413r
            int r10 = r10.f()
            p1.a0 r12 = r0.f1413r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.f1419y
            goto L_0x02cb
        L_0x02bc:
            p1.a0 r10 = r0.f1413r
            int r3 = r10.d(r3)
            p1.a0 r10 = r0.f1413r
            int r10 = r10.h()
            int r3 = r3 - r10
            int r10 = r0.f1419y
        L_0x02cb:
            int r10 = r10 - r3
            if (r10 <= 0) goto L_0x02d0
            int r11 = r11 + r10
            goto L_0x02d1
        L_0x02d0:
            int r9 = r9 - r10
        L_0x02d1:
            boolean r3 = r8.f4687d
            if (r3 == 0) goto L_0x02da
            boolean r3 = r0.f1416u
            if (r3 == 0) goto L_0x02de
            goto L_0x02e0
        L_0x02da:
            boolean r3 = r0.f1416u
            if (r3 == 0) goto L_0x02e0
        L_0x02de:
            r3 = r4
            goto L_0x02e1
        L_0x02e0:
            r3 = r5
        L_0x02e1:
            r0.U0(r1, r2, r8, r3)
            r17.p(r18)
            p1.x r3 = r0.f1412q
            p1.a0 r10 = r0.f1413r
            int r10 = r10.g()
            if (r10 != 0) goto L_0x02fb
            p1.a0 r10 = r0.f1413r
            int r10 = r10.e()
            if (r10 != 0) goto L_0x02fb
            r10 = r5
            goto L_0x02fc
        L_0x02fb:
            r10 = r6
        L_0x02fc:
            r3.f4712l = r10
            p1.x r3 = r0.f1412q
            r3.getClass()
            p1.x r3 = r0.f1412q
            r3.f4709i = r6
            boolean r3 = r8.f4687d
            if (r3 == 0) goto L_0x0350
            int r3 = r8.f4685b
            int r10 = r8.f4686c
            r0.d1(r3, r10)
            p1.x r3 = r0.f1412q
            r3.f4708h = r11
            r0.G0(r1, r3, r2, r6)
            p1.x r3 = r0.f1412q
            int r10 = r3.f4702b
            int r11 = r3.f4704d
            int r3 = r3.f4703c
            if (r3 <= 0) goto L_0x0324
            int r9 = r9 + r3
        L_0x0324:
            int r3 = r8.f4685b
            int r12 = r8.f4686c
            r0.c1(r3, r12)
            p1.x r3 = r0.f1412q
            r3.f4708h = r9
            int r9 = r3.f4704d
            int r12 = r3.f4705e
            int r9 = r9 + r12
            r3.f4704d = r9
            r0.G0(r1, r3, r2, r6)
            p1.x r3 = r0.f1412q
            int r9 = r3.f4702b
            int r3 = r3.f4703c
            if (r3 <= 0) goto L_0x0396
            r0.d1(r11, r10)
            p1.x r10 = r0.f1412q
            r10.f4708h = r3
            r0.G0(r1, r10, r2, r6)
            p1.x r3 = r0.f1412q
            int r10 = r3.f4702b
            goto L_0x0396
        L_0x0350:
            int r3 = r8.f4685b
            int r10 = r8.f4686c
            r0.c1(r3, r10)
            p1.x r3 = r0.f1412q
            r3.f4708h = r9
            r0.G0(r1, r3, r2, r6)
            p1.x r3 = r0.f1412q
            int r9 = r3.f4702b
            int r10 = r3.f4704d
            int r3 = r3.f4703c
            if (r3 <= 0) goto L_0x0369
            int r11 = r11 + r3
        L_0x0369:
            int r3 = r8.f4685b
            int r12 = r8.f4686c
            r0.d1(r3, r12)
            p1.x r3 = r0.f1412q
            r3.f4708h = r11
            int r11 = r3.f4704d
            int r12 = r3.f4705e
            int r11 = r11 + r12
            r3.f4704d = r11
            r0.G0(r1, r3, r2, r6)
            p1.x r3 = r0.f1412q
            int r11 = r3.f4702b
            int r3 = r3.f4703c
            if (r3 <= 0) goto L_0x0395
            r0.c1(r10, r9)
            p1.x r9 = r0.f1412q
            r9.f4708h = r3
            r0.G0(r1, r9, r2, r6)
            p1.x r3 = r0.f1412q
            int r3 = r3.f4702b
            r9 = r3
        L_0x0395:
            r10 = r11
        L_0x0396:
            int r3 = r17.v()
            if (r3 <= 0) goto L_0x03ba
            boolean r3 = r0.f1416u
            boolean r11 = r0.f1417v
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x03ae
            int r3 = r0.O0(r9, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.P0(r10, r1, r2, r6)
            goto L_0x03b8
        L_0x03ae:
            int r3 = r0.P0(r10, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.O0(r9, r1, r2, r6)
        L_0x03b8:
            int r10 = r10 + r3
            int r9 = r9 + r3
        L_0x03ba:
            boolean r3 = r2.f4448k
            if (r3 == 0) goto L_0x0459
            int r3 = r17.v()
            if (r3 == 0) goto L_0x0459
            boolean r3 = r2.f4444g
            if (r3 != 0) goto L_0x0459
            boolean r3 = r17.y0()
            if (r3 != 0) goto L_0x03d0
            goto L_0x0459
        L_0x03d0:
            java.util.List r3 = r1.f4692d
            int r11 = r3.size()
            android.view.View r12 = r0.u(r6)
            int r12 = p1.o0.F(r12)
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x03e1:
            if (r13 >= r11) goto L_0x0414
            java.lang.Object r16 = r3.get(r13)
            r5 = r16
            p1.f1 r5 = (p1.f1) r5
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x03f2
            goto L_0x040f
        L_0x03f2:
            int r7 = r5.c()
            if (r7 >= r12) goto L_0x03fa
            r7 = 1
            goto L_0x03fb
        L_0x03fa:
            r7 = r6
        L_0x03fb:
            boolean r6 = r0.f1416u
            if (r7 == r6) goto L_0x0401
            r6 = r4
            goto L_0x0402
        L_0x0401:
            r6 = 1
        L_0x0402:
            p1.a0 r7 = r0.f1413r
            android.view.View r5 = r5.f4483a
            int r5 = r7.c(r5)
            if (r6 != r4) goto L_0x040e
            int r14 = r14 + r5
            goto L_0x040f
        L_0x040e:
            int r15 = r15 + r5
        L_0x040f:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            goto L_0x03e1
        L_0x0414:
            p1.x r4 = r0.f1412q
            r4.f4711k = r3
            if (r14 <= 0) goto L_0x0436
            android.view.View r3 = r17.R0()
            int r3 = p1.o0.F(r3)
            r0.d1(r3, r10)
            p1.x r3 = r0.f1412q
            r3.f4708h = r14
            r4 = 0
            r3.f4703c = r4
            r5 = 0
            r3.a(r5)
            p1.x r3 = r0.f1412q
            r0.G0(r1, r3, r2, r4)
            goto L_0x0437
        L_0x0436:
            r4 = 0
        L_0x0437:
            if (r15 <= 0) goto L_0x0454
            android.view.View r3 = r17.Q0()
            int r3 = p1.o0.F(r3)
            r0.c1(r3, r9)
            p1.x r3 = r0.f1412q
            r3.f4708h = r15
            r3.f4703c = r4
            r5 = 0
            r3.a(r5)
            p1.x r3 = r0.f1412q
            r0.G0(r1, r3, r2, r4)
            goto L_0x0455
        L_0x0454:
            r5 = 0
        L_0x0455:
            p1.x r1 = r0.f1412q
            r1.f4711k = r5
        L_0x0459:
            boolean r1 = r2.f4444g
            if (r1 != 0) goto L_0x0466
            p1.a0 r1 = r0.f1413r
            int r2 = r1.i()
            r1.f4436b = r2
            goto L_0x0469
        L_0x0466:
            r8.c()
        L_0x0469:
            boolean r1 = r0.f1417v
            r0.f1414s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a0(p1.v0, p1.b1):void");
    }

    public void a1(boolean z5) {
        c((String) null);
        if (this.f1417v != z5) {
            this.f1417v = z5;
            k0();
        }
    }

    public void b0(b1 b1Var) {
        this.f1420z = null;
        this.f1418x = -1;
        this.f1419y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void b1(int i3, int i6, boolean z5, b1 b1Var) {
        int i7;
        int i8;
        int i9 = 1;
        boolean z6 = false;
        this.f1412q.f4712l = this.f1413r.g() == 0 && this.f1413r.e() == 0;
        this.f1412q.f4706f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(b1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i3 == 1) {
            z6 = true;
        }
        x xVar = this.f1412q;
        int i10 = z6 ? max2 : max;
        xVar.f4708h = i10;
        if (!z6) {
            max = max2;
        }
        xVar.f4709i = max;
        if (z6) {
            a0 a0Var = this.f1413r;
            int i11 = a0Var.f4429d;
            o0 o0Var = a0Var.f4435a;
            switch (i11) {
                case 0:
                    i8 = o0Var.D();
                    break;
                default:
                    i8 = o0Var.B();
                    break;
            }
            xVar.f4708h = i8 + i10;
            View Q0 = Q0();
            x xVar2 = this.f1412q;
            if (this.f1416u) {
                i9 = -1;
            }
            xVar2.f4705e = i9;
            int F = o0.F(Q0);
            x xVar3 = this.f1412q;
            xVar2.f4704d = F + xVar3.f4705e;
            xVar3.f4702b = this.f1413r.b(Q0);
            i7 = this.f1413r.b(Q0) - this.f1413r.f();
        } else {
            View R0 = R0();
            x xVar4 = this.f1412q;
            xVar4.f4708h = this.f1413r.h() + xVar4.f4708h;
            x xVar5 = this.f1412q;
            if (!this.f1416u) {
                i9 = -1;
            }
            xVar5.f4705e = i9;
            int F2 = o0.F(R0);
            x xVar6 = this.f1412q;
            xVar5.f4704d = F2 + xVar6.f4705e;
            xVar6.f4702b = this.f1413r.d(R0);
            i7 = (-this.f1413r.d(R0)) + this.f1413r.h();
        }
        x xVar7 = this.f1412q;
        xVar7.f4703c = i6;
        if (z5) {
            xVar7.f4703c = i6 - i7;
        }
        xVar7.f4707g = i7;
    }

    public final void c(String str) {
        if (this.f1420z == null) {
            super.c(str);
        }
    }

    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof y) {
            y yVar = (y) parcelable;
            this.f1420z = yVar;
            if (this.f1418x != -1) {
                yVar.f4714d = -1;
            }
            k0();
        }
    }

    public final void c1(int i3, int i6) {
        this.f1412q.f4703c = this.f1413r.f() - i6;
        x xVar = this.f1412q;
        xVar.f4705e = this.f1416u ? -1 : 1;
        xVar.f4704d = i3;
        xVar.f4706f = 1;
        xVar.f4702b = i6;
        xVar.f4707g = Integer.MIN_VALUE;
    }

    public final boolean d() {
        return this.f1411p == 0;
    }

    public final Parcelable d0() {
        y yVar = this.f1420z;
        if (yVar != null) {
            return new y(yVar);
        }
        y yVar2 = new y();
        if (v() > 0) {
            F0();
            boolean z5 = this.f1414s ^ this.f1416u;
            yVar2.f4716f = z5;
            if (z5) {
                View Q0 = Q0();
                yVar2.f4715e = this.f1413r.f() - this.f1413r.b(Q0);
                yVar2.f4714d = o0.F(Q0);
            } else {
                View R0 = R0();
                yVar2.f4714d = o0.F(R0);
                yVar2.f4715e = this.f1413r.d(R0) - this.f1413r.h();
            }
        } else {
            yVar2.f4714d = -1;
        }
        return yVar2;
    }

    public final void d1(int i3, int i6) {
        this.f1412q.f4703c = i6 - this.f1413r.h();
        x xVar = this.f1412q;
        xVar.f4704d = i3;
        xVar.f4705e = this.f1416u ? 1 : -1;
        xVar.f4706f = -1;
        xVar.f4702b = i6;
        xVar.f4707g = Integer.MIN_VALUE;
    }

    public final boolean e() {
        return this.f1411p == 1;
    }

    public final void h(int i3, int i6, b1 b1Var, q qVar) {
        if (this.f1411p != 0) {
            i3 = i6;
        }
        if (v() != 0 && i3 != 0) {
            F0();
            b1(i3 > 0 ? 1 : -1, Math.abs(i3), true, b1Var);
            A0(b1Var, this.f1412q, qVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r7, p1.q r8) {
        /*
            r6 = this;
            p1.y r0 = r6.f1420z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f4714d
            if (r4 < 0) goto L_0x000d
            r5 = r1
            goto L_0x000e
        L_0x000d:
            r5 = r3
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f4716f
            goto L_0x0022
        L_0x0013:
            r6.X0()
            boolean r0 = r6.f1416u
            int r4 = r6.f1418x
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            r0 = r3
        L_0x0026:
            int r2 = r6.C
            if (r0 >= r2) goto L_0x0035
            if (r4 < 0) goto L_0x0035
            if (r4 >= r7) goto L_0x0035
            r8.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, p1.q):void");
    }

    public final int j(b1 b1Var) {
        return B0(b1Var);
    }

    public int k(b1 b1Var) {
        return C0(b1Var);
    }

    public int l(b1 b1Var) {
        return D0(b1Var);
    }

    public int l0(int i3, v0 v0Var, b1 b1Var) {
        if (this.f1411p == 1) {
            return 0;
        }
        return Y0(i3, v0Var, b1Var);
    }

    public final int m(b1 b1Var) {
        return B0(b1Var);
    }

    public final void m0(int i3) {
        this.f1418x = i3;
        this.f1419y = Integer.MIN_VALUE;
        y yVar = this.f1420z;
        if (yVar != null) {
            yVar.f4714d = -1;
        }
        k0();
    }

    public int n(b1 b1Var) {
        return C0(b1Var);
    }

    public int n0(int i3, v0 v0Var, b1 b1Var) {
        if (this.f1411p == 0) {
            return 0;
        }
        return Y0(i3, v0Var, b1Var);
    }

    public int o(b1 b1Var) {
        return D0(b1Var);
    }

    public final View q(int i3) {
        int v5 = v();
        if (v5 == 0) {
            return null;
        }
        int F = i3 - o0.F(u(0));
        if (F >= 0 && F < v5) {
            View u3 = u(F);
            if (o0.F(u3) == i3) {
                return u3;
            }
        }
        return super.q(i3);
    }

    public p0 r() {
        return new p0(-2, -2);
    }

    public final boolean u0() {
        boolean z5;
        if (this.f4607m == 1073741824 || this.f4606l == 1073741824) {
            return false;
        }
        int v5 = v();
        int i3 = 0;
        while (true) {
            if (i3 >= v5) {
                z5 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = u(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z5 = true;
                break;
            }
            i3++;
        }
        return z5;
    }

    public void w0(RecyclerView recyclerView, int i3) {
        z zVar = new z(recyclerView.getContext());
        zVar.f4718a = i3;
        x0(zVar);
    }

    public boolean y0() {
        return this.f1420z == null && this.f1414s == this.f1417v;
    }

    public void z0(b1 b1Var, int[] iArr) {
        int i3;
        int i6 = b1Var.f4438a != -1 ? this.f1413r.i() : 0;
        if (this.f1412q.f4706f == -1) {
            i3 = 0;
        } else {
            i3 = i6;
            i6 = 0;
        }
        iArr[0] = i6;
        iArr[1] = i3;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i6) {
        n0 G = o0.G(context, attributeSet, i3, i6);
        Z0(G.f4584a);
        boolean z5 = G.f4586c;
        c((String) null);
        if (z5 != this.f1415t) {
            this.f1415t = z5;
            k0();
        }
        a1(G.f4587d);
    }
}
