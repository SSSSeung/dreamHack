package androidx.recyclerview.widget;

import a2.m;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.appcompat.widget.v3;
import java.util.WeakHashMap;
import p1.b1;
import p1.o0;
import p1.p0;
import p1.q;
import p1.t;
import p1.v;
import p1.v0;
import p1.x;
import x0.d0;
import x0.u0;
import y0.n;
import y0.o;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public final v3 K = new v3(1);
    public final Rect L = new Rect();

    public GridLayoutManager(int i3) {
        super(1);
        k1(i3);
    }

    public final void A0(b1 b1Var, x xVar, q qVar) {
        int i3 = this.F;
        int i6 = 0;
        while (i6 < this.F) {
            int i7 = xVar.f4704d;
            if ((i7 >= 0 && i7 < b1Var.b()) && i3 > 0) {
                qVar.a(xVar.f4704d, Math.max(0, xVar.f4707g));
                this.K.getClass();
                i3--;
                xVar.f4704d += xVar.f4705e;
                i6++;
            } else {
                return;
            }
        }
    }

    public final int H(v0 v0Var, b1 b1Var) {
        if (this.f1411p == 0) {
            return this.F;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return g1(b1Var.b() - 1, v0Var, b1Var) + 1;
    }

    public final View N0(v0 v0Var, b1 b1Var, boolean z5, boolean z6) {
        int i3;
        int i6;
        int v5 = v();
        int i7 = 1;
        if (z6) {
            i6 = v() - 1;
            i3 = -1;
            i7 = -1;
        } else {
            i3 = v5;
            i6 = 0;
        }
        int b6 = b1Var.b();
        F0();
        int h6 = this.f1413r.h();
        int f6 = this.f1413r.f();
        View view = null;
        View view2 = null;
        while (i6 != i3) {
            View u3 = u(i6);
            int F2 = o0.F(u3);
            if (F2 >= 0 && F2 < b6 && h1(F2, v0Var, b1Var) == 0) {
                if (((p0) u3.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else if (this.f1413r.d(u3) < f6 && this.f1413r.b(u3) >= h6) {
                    return u3;
                } else {
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i6 += i7;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == (r2 > r15)) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010f, code lost:
        if (r13 == (r2 > r9)) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View Q(android.view.View r23, int r24, p1.v0 r25, p1.b1 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f4596b
            r4 = 0
            r5 = r23
            if (r3 != 0) goto L_0x000f
        L_0x000d:
            r3 = r4
            goto L_0x001f
        L_0x000f:
            android.view.View r3 = r3.D(r5)
            if (r3 != 0) goto L_0x0016
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            p1.d r6 = r0.f4595a
            boolean r6 = r6.j(r3)
            if (r6 == 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r4
        L_0x0022:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            p1.t r6 = (p1.t) r6
            int r7 = r6.f4666e
            int r6 = r6.f4667f
            int r6 = r6 + r7
            android.view.View r5 = super.Q(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0034
            return r4
        L_0x0034:
            r5 = r24
            int r5 = r0.E0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x003f
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            boolean r10 = r0.f1416u
            if (r5 == r10) goto L_0x0046
            r5 = r8
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r10 = -1
            if (r5 == 0) goto L_0x0052
            int r5 = r22.v()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x0059
        L_0x0052:
            int r5 = r22.v()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x0059:
            int r13 = r0.f1411p
            if (r13 != r8) goto L_0x0065
            boolean r13 = r22.S0()
            if (r13 == 0) goto L_0x0065
            r13 = r8
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            int r14 = r0.g1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0072:
            if (r10 == r11) goto L_0x0153
            r17 = r11
            int r11 = r0.g1(r10, r1, r2)
            android.view.View r1 = r0.u(r10)
            if (r1 != r3) goto L_0x0082
            goto L_0x0153
        L_0x0082:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r11 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0143
        L_0x0098:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            p1.t r11 = (p1.t) r11
            int r2 = r11.f4666e
            r18 = r3
            int r3 = r11.f4667f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00c0:
            r21 = r5
            goto L_0x00e1
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e7
            if (r5 <= r8) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            if (r5 != r8) goto L_0x0114
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0114
        L_0x00e1:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x0119
        L_0x00e7:
            if (r4 != 0) goto L_0x0114
            r19 = r8
            p1.r1 r8 = r0.f4597c
            boolean r8 = r8.h(r1)
            if (r8 == 0) goto L_0x00fd
            p1.r1 r8 = r0.f4598d
            boolean r8 = r8.h(r1)
            if (r8 == 0) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0118
            if (r5 <= r12) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            if (r5 != r12) goto L_0x0118
            if (r2 <= r9) goto L_0x010e
            r5 = r20
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            if (r13 != r5) goto L_0x0118
        L_0x0111:
            r5 = r20
            goto L_0x0119
        L_0x0114:
            r19 = r8
            r20 = 1
        L_0x0118:
            r5 = 0
        L_0x0119:
            if (r5 == 0) goto L_0x0143
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0132
            int r4 = r11.f4666e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0147
        L_0x0132:
            int r5 = r11.f4666e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0147
        L_0x0143:
            r8 = r19
            r5 = r21
        L_0x0147:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0072
        L_0x0153:
            r21 = r5
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = r21
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, p1.v0, p1.b1):android.view.View");
    }

    public final void S(v0 v0Var, b1 b1Var, o oVar) {
        super.S(v0Var, b1Var, oVar);
        oVar.f5796a.setClassName(GridView.class.getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T0(p1.v0 r19, p1.b1 r20, p1.x r21, p1.w r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            p1.a0 r5 = r0.f1413r
            int r6 = r5.f4429d
            p1.o0 r5 = r5.f4435a
            switch(r6) {
                case 0: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0017
        L_0x0014:
            int r5 = r5.f4607m
            goto L_0x0019
        L_0x0017:
            int r5 = r5.f4606l
        L_0x0019:
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            if (r5 == r7) goto L_0x0020
            r9 = r8
            goto L_0x0021
        L_0x0020:
            r9 = 0
        L_0x0021:
            int r10 = r18.v()
            if (r10 <= 0) goto L_0x002e
            int[] r10 = r0.G
            int r11 = r0.F
            r10 = r10[r11]
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            if (r9 == 0) goto L_0x0034
            r18.l1()
        L_0x0034:
            int r11 = r3.f4705e
            if (r11 != r8) goto L_0x003a
            r11 = r8
            goto L_0x003b
        L_0x003a:
            r11 = 0
        L_0x003b:
            int r12 = r0.F
            if (r11 != 0) goto L_0x004c
            int r12 = r3.f4704d
            int r12 = r0.h1(r12, r1, r2)
            int r13 = r3.f4704d
            int r13 = r0.i1(r13, r1, r2)
            int r12 = r12 + r13
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.F
            if (r13 >= r14) goto L_0x00ab
            int r14 = r3.f4704d
            if (r14 < 0) goto L_0x005d
            int r15 = r20.b()
            if (r14 >= r15) goto L_0x005d
            r14 = r8
            goto L_0x005e
        L_0x005d:
            r14 = 0
        L_0x005e:
            if (r14 == 0) goto L_0x00ab
            if (r12 <= 0) goto L_0x00ab
            int r14 = r3.f4704d
            int r15 = r0.i1(r14, r1, r2)
            int r7 = r0.F
            if (r15 > r7) goto L_0x0080
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x0070
            goto L_0x00ab
        L_0x0070:
            android.view.View r7 = r3.b(r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x00ab
        L_0x0077:
            android.view.View[] r14 = r0.H
            r14[r13] = r7
            int r13 = r13 + 1
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x004d
        L_0x0080:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Item at position "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r3 = " requires "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " spans but GridLayoutManager has only "
            r2.append(r3)
            int r3 = r0.F
            r2.append(r3)
            java.lang.String r3 = " spans."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ab:
            if (r13 != 0) goto L_0x00b0
            r4.f4698b = r8
            return
        L_0x00b0:
            r7 = -1
            if (r11 == 0) goto L_0x00b8
            r16 = r8
            r14 = r13
            r12 = 0
            goto L_0x00bd
        L_0x00b8:
            int r12 = r13 + -1
            r14 = r7
            r16 = r14
        L_0x00bd:
            r15 = 0
        L_0x00be:
            if (r12 == r14) goto L_0x00dd
            android.view.View[] r8 = r0.H
            r8 = r8[r12]
            android.view.ViewGroup$LayoutParams r17 = r8.getLayoutParams()
            r6 = r17
            p1.t r6 = (p1.t) r6
            int r8 = p1.o0.F(r8)
            int r8 = r0.i1(r8, r1, r2)
            r6.f4667f = r8
            r6.f4666e = r15
            int r15 = r15 + r8
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00be
        L_0x00dd:
            r1 = 0
            r2 = 0
            r6 = 0
        L_0x00e0:
            if (r2 >= r13) goto L_0x013b
            android.view.View[] r8 = r0.H
            r8 = r8[r2]
            java.util.List r12 = r3.f4711k
            if (r12 != 0) goto L_0x00f6
            if (r11 == 0) goto L_0x00f1
            r12 = 0
            r0.b(r8, r7, r12)
            goto L_0x0102
        L_0x00f1:
            r12 = 0
            r0.b(r8, r12, r12)
            goto L_0x0102
        L_0x00f6:
            r12 = 0
            if (r11 == 0) goto L_0x00fe
            r14 = 1
            r0.b(r8, r7, r14)
            goto L_0x0102
        L_0x00fe:
            r14 = 1
            r0.b(r8, r12, r14)
        L_0x0102:
            androidx.recyclerview.widget.RecyclerView r14 = r0.f4596b
            android.graphics.Rect r15 = r0.L
            if (r14 != 0) goto L_0x010c
            r15.set(r12, r12, r12, r12)
            goto L_0x0113
        L_0x010c:
            android.graphics.Rect r14 = r14.M(r8)
            r15.set(r14)
        L_0x0113:
            r0.j1(r8, r5, r12)
            p1.a0 r12 = r0.f1413r
            int r12 = r12.c(r8)
            if (r12 <= r6) goto L_0x011f
            r6 = r12
        L_0x011f:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            p1.t r12 = (p1.t) r12
            p1.a0 r14 = r0.f1413r
            int r8 = r14.m(r8)
            float r8 = (float) r8
            r14 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r14
            int r12 = r12.f4667f
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x0138
            r1 = r8
        L_0x0138:
            int r2 = r2 + 1
            goto L_0x00e0
        L_0x013b:
            if (r9 == 0) goto L_0x0166
            int r2 = r0.F
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.max(r1, r10)
            r0.e1(r1)
            r6 = 0
            r12 = 0
        L_0x014e:
            if (r12 >= r13) goto L_0x0166
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r0.j1(r1, r2, r5)
            p1.a0 r2 = r0.f1413r
            int r1 = r2.c(r1)
            if (r1 <= r6) goto L_0x0163
            r6 = r1
        L_0x0163:
            int r12 = r12 + 1
            goto L_0x014e
        L_0x0166:
            r12 = 0
        L_0x0167:
            if (r12 >= r13) goto L_0x01d6
            android.view.View[] r1 = r0.H
            r1 = r1[r12]
            p1.a0 r2 = r0.f1413r
            int r2 = r2.c(r1)
            if (r2 == r6) goto L_0x01d0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            p1.t r2 = (p1.t) r2
            android.graphics.Rect r5 = r2.f4641b
            int r8 = r5.top
            int r9 = r5.bottom
            int r8 = r8 + r9
            int r9 = r2.topMargin
            int r8 = r8 + r9
            int r9 = r2.bottomMargin
            int r8 = r8 + r9
            int r9 = r5.left
            int r5 = r5.right
            int r9 = r9 + r5
            int r5 = r2.leftMargin
            int r9 = r9 + r5
            int r5 = r2.rightMargin
            int r9 = r9 + r5
            int r5 = r2.f4666e
            int r10 = r2.f4667f
            int r5 = r0.f1(r5, r10)
            int r10 = r0.f1411p
            r11 = 1
            if (r10 != r11) goto L_0x01b0
            int r2 = r2.width
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
            int r2 = p1.o0.w(r5, r11, r9, r2, r10)
            int r5 = r6 - r8
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x01c0
        L_0x01b0:
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = r6 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r2 = r2.height
            int r5 = p1.o0.w(r5, r11, r8, r2, r10)
            r2 = r9
        L_0x01c0:
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            p1.p0 r8 = (p1.p0) r8
            boolean r8 = r0.v0(r1, r2, r5, r8)
            if (r8 == 0) goto L_0x01d3
            r1.measure(r2, r5)
            goto L_0x01d3
        L_0x01d0:
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x01d3:
            int r12 = r12 + 1
            goto L_0x0167
        L_0x01d6:
            r10 = 0
            r4.f4697a = r6
            int r1 = r0.f1411p
            r2 = 1
            if (r1 != r2) goto L_0x01f2
            int r1 = r3.f4706f
            if (r1 != r7) goto L_0x01e8
            int r1 = r3.f4702b
            int r2 = r1 - r6
            r12 = r2
            goto L_0x01ed
        L_0x01e8:
            int r1 = r3.f4702b
            int r6 = r6 + r1
            r12 = r1
            r1 = r6
        L_0x01ed:
            r2 = r10
            r3 = r12
            r12 = r1
            r1 = r2
            goto L_0x0204
        L_0x01f2:
            int r1 = r3.f4706f
            if (r1 != r7) goto L_0x01fc
            int r1 = r3.f4702b
            int r2 = r1 - r6
            r12 = r2
            goto L_0x0201
        L_0x01fc:
            int r1 = r3.f4702b
            int r6 = r6 + r1
            r12 = r1
            r1 = r6
        L_0x0201:
            r3 = r10
            r2 = r12
            r12 = r3
        L_0x0204:
            r6 = r10
        L_0x0205:
            if (r6 >= r13) goto L_0x027a
            android.view.View[] r5 = r0.H
            r5 = r5[r6]
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            p1.t r7 = (p1.t) r7
            int r8 = r0.f1411p
            r9 = 1
            if (r8 != r9) goto L_0x0246
            boolean r1 = r18.S0()
            if (r1 == 0) goto L_0x0233
            int r1 = r18.C()
            int[] r2 = r0.G
            int r8 = r0.F
            int r9 = r7.f4666e
            int r8 = r8 - r9
            r2 = r2[r8]
            int r1 = r1 + r2
            p1.a0 r2 = r0.f1413r
            int r2 = r2.m(r5)
            int r2 = r1 - r2
            goto L_0x0259
        L_0x0233:
            int r1 = r18.C()
            int[] r2 = r0.G
            int r8 = r7.f4666e
            r2 = r2[r8]
            int r2 = r2 + r1
            p1.a0 r1 = r0.f1413r
            int r1 = r1.m(r5)
            int r1 = r1 + r2
            goto L_0x0259
        L_0x0246:
            int r3 = r18.E()
            int[] r8 = r0.G
            int r9 = r7.f4666e
            r8 = r8[r9]
            int r3 = r3 + r8
            p1.a0 r8 = r0.f1413r
            int r8 = r8.m(r5)
            int r8 = r8 + r3
            r12 = r8
        L_0x0259:
            p1.o0.L(r5, r2, r3, r1, r12)
            boolean r8 = r7.c()
            if (r8 != 0) goto L_0x026b
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0269
            goto L_0x026b
        L_0x0269:
            r7 = 1
            goto L_0x026e
        L_0x026b:
            r7 = 1
            r4.f4699c = r7
        L_0x026e:
            boolean r8 = r4.f4700d
            boolean r5 = r5.hasFocusable()
            r5 = r5 | r8
            r4.f4700d = r5
            int r6 = r6 + 1
            goto L_0x0205
        L_0x027a:
            android.view.View[] r1 = r0.H
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T0(p1.v0, p1.b1, p1.x, p1.w):void");
    }

    public final void U(v0 v0Var, b1 b1Var, View view, o oVar) {
        int i3;
        int i6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof t)) {
            T(view, oVar);
            return;
        }
        t tVar = (t) layoutParams;
        int g12 = g1(tVar.a(), v0Var, b1Var);
        int i7 = 1;
        if (this.f1411p == 0) {
            i3 = g12;
            g12 = tVar.f4666e;
            int i8 = tVar.f4667f;
            i6 = 1;
            i7 = i8;
        } else {
            i3 = tVar.f4666e;
            i6 = tVar.f4667f;
        }
        oVar.h(n.a(g12, i7, i3, i6, false));
    }

    public final void U0(v0 v0Var, b1 b1Var, v vVar, int i3) {
        l1();
        if (b1Var.b() > 0 && !b1Var.f4444g) {
            boolean z5 = i3 == 1;
            int h12 = h1(vVar.f4685b, v0Var, b1Var);
            if (z5) {
                while (h12 > 0) {
                    int i6 = vVar.f4685b;
                    if (i6 <= 0) {
                        break;
                    }
                    int i7 = i6 - 1;
                    vVar.f4685b = i7;
                    h12 = h1(i7, v0Var, b1Var);
                }
            } else {
                int b6 = b1Var.b() - 1;
                int i8 = vVar.f4685b;
                while (i8 < b6) {
                    int i9 = i8 + 1;
                    int h13 = h1(i9, v0Var, b1Var);
                    if (h13 <= h12) {
                        break;
                    }
                    i8 = i9;
                    h12 = h13;
                }
                vVar.f4685b = i8;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final void V(int i3, int i6) {
        v3 v3Var = this.K;
        v3Var.d();
        ((SparseIntArray) v3Var.f817d).clear();
    }

    public final void W() {
        v3 v3Var = this.K;
        v3Var.d();
        ((SparseIntArray) v3Var.f817d).clear();
    }

    public final void X(int i3, int i6) {
        v3 v3Var = this.K;
        v3Var.d();
        ((SparseIntArray) v3Var.f817d).clear();
    }

    public final void Y(int i3, int i6) {
        v3 v3Var = this.K;
        v3Var.d();
        ((SparseIntArray) v3Var.f817d).clear();
    }

    public final void Z(int i3, int i6) {
        v3 v3Var = this.K;
        v3Var.d();
        ((SparseIntArray) v3Var.f817d).clear();
    }

    public final void a0(v0 v0Var, b1 b1Var) {
        boolean z5 = b1Var.f4444g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z5) {
            int v5 = v();
            for (int i3 = 0; i3 < v5; i3++) {
                t tVar = (t) u(i3).getLayoutParams();
                int a6 = tVar.a();
                sparseIntArray2.put(a6, tVar.f4667f);
                sparseIntArray.put(a6, tVar.f4666e);
            }
        }
        super.a0(v0Var, b1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void a1(boolean z5) {
        if (!z5) {
            super.a1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void b0(b1 b1Var) {
        super.b0(b1Var);
        this.E = false;
    }

    public final void e1(int i3) {
        int i6;
        int[] iArr = this.G;
        int i7 = this.F;
        if (!(iArr != null && iArr.length == i7 + 1 && iArr[iArr.length - 1] == i3)) {
            iArr = new int[(i7 + 1)];
        }
        int i8 = 0;
        iArr[0] = 0;
        int i9 = i3 / i7;
        int i10 = i3 % i7;
        int i11 = 0;
        for (int i12 = 1; i12 <= i7; i12++) {
            i8 += i10;
            if (i8 <= 0 || i7 - i8 >= i10) {
                i6 = i9;
            } else {
                i6 = i9 + 1;
                i8 -= i7;
            }
            i11 += i6;
            iArr[i12] = i11;
        }
        this.G = iArr;
    }

    public final boolean f(p0 p0Var) {
        return p0Var instanceof t;
    }

    public final int f1(int i3, int i6) {
        if (this.f1411p != 1 || !S0()) {
            int[] iArr = this.G;
            return iArr[i6 + i3] - iArr[i3];
        }
        int[] iArr2 = this.G;
        int i7 = this.F;
        return iArr2[i7 - i3] - iArr2[(i7 - i3) - i6];
    }

    public final int g1(int i3, v0 v0Var, b1 b1Var) {
        boolean z5 = b1Var.f4444g;
        v3 v3Var = this.K;
        if (!z5) {
            return v3Var.a(i3, this.F);
        }
        int b6 = v0Var.b(i3);
        if (b6 != -1) {
            return v3Var.a(b6, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    public final int h1(int i3, v0 v0Var, b1 b1Var) {
        boolean z5 = b1Var.f4444g;
        v3 v3Var = this.K;
        if (!z5) {
            return v3Var.b(i3, this.F);
        }
        int i6 = this.J.get(i3, -1);
        if (i6 != -1) {
            return i6;
        }
        int b6 = v0Var.b(i3);
        if (b6 != -1) {
            return v3Var.b(b6, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    public final int i1(int i3, v0 v0Var, b1 b1Var) {
        boolean z5 = b1Var.f4444g;
        v3 v3Var = this.K;
        if (!z5) {
            v3Var.getClass();
            return 1;
        }
        int i6 = this.I.get(i3, -1);
        if (i6 != -1) {
            return i6;
        }
        if (v0Var.b(i3) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
            return 1;
        }
        v3Var.getClass();
        return 1;
    }

    public final void j1(View view, int i3, boolean z5) {
        int i6;
        int i7;
        t tVar = (t) view.getLayoutParams();
        Rect rect = tVar.f4641b;
        int i8 = rect.top + rect.bottom + tVar.topMargin + tVar.bottomMargin;
        int i9 = rect.left + rect.right + tVar.leftMargin + tVar.rightMargin;
        int f12 = f1(tVar.f4666e, tVar.f4667f);
        if (this.f1411p == 1) {
            i6 = o0.w(f12, i3, i9, tVar.width, false);
            i7 = o0.w(this.f1413r.i(), this.f4607m, i8, tVar.height, true);
        } else {
            int w = o0.w(f12, i3, i8, tVar.height, false);
            int w5 = o0.w(this.f1413r.i(), this.f4606l, i9, tVar.width, true);
            i7 = w;
            i6 = w5;
        }
        p0 p0Var = (p0) view.getLayoutParams();
        if (z5 ? v0(view, i6, i7, p0Var) : t0(view, i6, i7, p0Var)) {
            view.measure(i6, i7);
        }
    }

    public final int k(b1 b1Var) {
        return C0(b1Var);
    }

    public final void k1(int i3) {
        if (i3 != this.F) {
            this.E = true;
            if (i3 >= 1) {
                this.F = i3;
                this.K.d();
                k0();
                return;
            }
            throw new IllegalArgumentException(m.g("Span count should be at least 1. Provided ", i3));
        }
    }

    public final int l(b1 b1Var) {
        return D0(b1Var);
    }

    public final int l0(int i3, v0 v0Var, b1 b1Var) {
        l1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.l0(i3, v0Var, b1Var);
    }

    public final void l1() {
        int i3;
        int i6;
        if (this.f1411p == 1) {
            i6 = this.f4608n - D();
            i3 = C();
        } else {
            i6 = this.f4609o - B();
            i3 = E();
        }
        e1(i6 - i3);
    }

    public final int n(b1 b1Var) {
        return C0(b1Var);
    }

    public final int n0(int i3, v0 v0Var, b1 b1Var) {
        l1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.n0(i3, v0Var, b1Var);
    }

    public final int o(b1 b1Var) {
        return D0(b1Var);
    }

    public final void q0(Rect rect, int i3, int i6) {
        int i7;
        int i8;
        if (this.G == null) {
            super.q0(rect, i3, i6);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.f1411p == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f4596b;
            WeakHashMap weakHashMap = u0.f5622a;
            i8 = o0.g(i6, height, d0.d(recyclerView));
            int[] iArr = this.G;
            i7 = o0.g(i3, iArr[iArr.length - 1] + D, d0.e(this.f4596b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f4596b;
            WeakHashMap weakHashMap2 = u0.f5622a;
            i7 = o0.g(i3, width, d0.e(recyclerView2));
            int[] iArr2 = this.G;
            i8 = o0.g(i6, iArr2[iArr2.length - 1] + B, d0.d(this.f4596b));
        }
        this.f4596b.setMeasuredDimension(i7, i8);
    }

    public final p0 r() {
        return this.f1411p == 0 ? new t(-2, -1) : new t(-1, -2);
    }

    public final p0 s(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public final p0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    public final int x(v0 v0Var, b1 b1Var) {
        if (this.f1411p == 1) {
            return this.F;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return g1(b1Var.b() - 1, v0Var, b1Var) + 1;
    }

    public final boolean y0() {
        return this.f1420z == null && !this.E;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i6) {
        super(context, attributeSet, i3, i6);
        k1(o0.G(context, attributeSet, i3, i6).f4585b);
    }
}
