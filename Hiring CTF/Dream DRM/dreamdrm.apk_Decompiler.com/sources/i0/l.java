package i0;

import h0.e;
import java.util.ArrayList;
import y.d;

public final class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public final f f3543k;

    /* renamed from: l  reason: collision with root package name */
    public a f3544l = null;

    public l(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f3543k = fVar;
        this.f3552h.f3531e = 6;
        this.f3553i.f3531e = 7;
        fVar.f3531e = 8;
        this.f3550f = 1;
    }

    public final void a(d dVar) {
        int i3;
        float f6;
        if (d.b(this.f3554j) != 3) {
            g gVar = this.f3549e;
            if (gVar.f3529c && !gVar.f3536j && this.f3548d == 3) {
                e eVar = this.f3546b;
                int i6 = eVar.f3281k;
                if (i6 == 2) {
                    e eVar2 = eVar.I;
                    if (eVar2 != null) {
                        g gVar2 = eVar2.f3275e.f3549e;
                        if (gVar2.f3536j) {
                            f6 = ((float) gVar2.f3533g) * eVar.f3288r;
                        }
                    }
                } else if (i6 == 3) {
                    g gVar3 = eVar.f3274d.f3549e;
                    if (gVar3.f3536j) {
                        int i7 = eVar.M;
                        if (i7 != -1) {
                            if (i7 == 0) {
                                f6 = ((float) gVar3.f3533g) * eVar.L;
                            } else if (i7 != 1) {
                                i3 = 0;
                                gVar.d(i3);
                            }
                        }
                        f6 = ((float) gVar3.f3533g) / eVar.L;
                    }
                }
                i3 = (int) (f6 + 0.5f);
                gVar.d(i3);
            }
            f fVar = this.f3552h;
            if (fVar.f3529c) {
                f fVar2 = this.f3553i;
                if (fVar2.f3529c) {
                    if (!fVar.f3536j || !fVar2.f3536j || !gVar.f3536j) {
                        boolean z5 = gVar.f3536j;
                        ArrayList arrayList = fVar.f3538l;
                        ArrayList arrayList2 = fVar2.f3538l;
                        if (!z5 && this.f3548d == 3) {
                            e eVar3 = this.f3546b;
                            if (eVar3.f3280j == 0 && !eVar3.r()) {
                                int i8 = ((f) arrayList.get(0)).f3533g + fVar.f3532f;
                                int i9 = ((f) arrayList2.get(0)).f3533g + fVar2.f3532f;
                                fVar.d(i8);
                                fVar2.d(i9);
                                gVar.d(i9 - i8);
                                return;
                            }
                        }
                        if (!gVar.f3536j && this.f3548d == 3 && this.f3545a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i10 = (((f) arrayList2.get(0)).f3533g + fVar2.f3532f) - (((f) arrayList.get(0)).f3533g + fVar.f3532f);
                            int i11 = gVar.f3539m;
                            if (i10 < i11) {
                                gVar.d(i10);
                            } else {
                                gVar.d(i11);
                            }
                        }
                        if (gVar.f3536j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i12 = fVar3.f3533g;
                            int i13 = fVar.f3532f + i12;
                            int i14 = fVar4.f3533g;
                            int i15 = fVar2.f3532f + i14;
                            float f7 = this.f3546b.T;
                            if (fVar3 == fVar4) {
                                f7 = 0.5f;
                            } else {
                                i12 = i13;
                                i14 = i15;
                            }
                            fVar.d((int) ((((float) ((i14 - i12) - gVar.f3533g)) * f7) + ((float) i12) + 0.5f));
                            fVar2.d(fVar.f3533g + gVar.f3533g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar4 = this.f3546b;
        l(eVar4.f3294y, eVar4.A, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028a, code lost:
        if (r0.f3548d == 3) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b0, code lost:
        if (r15.f3546b.w != false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0301, code lost:
        if (r0.f3548d == 3) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r0 = r15.f3546b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0253, code lost:
        if (r15.f3546b.w != false) goto L_0x02b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r15 = this;
            h0.e r0 = r15.f3546b
            boolean r1 = r0.f3268a
            i0.g r2 = r15.f3549e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.j()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f3536j
            i0.f r1 = r15.f3553i
            i0.f r3 = r15.f3552h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0082
            h0.e r0 = r15.f3546b
            int[] r7 = r0.f3273c0
            r7 = r7[r5]
            r15.f3548d = r7
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x002d
            i0.a r0 = new i0.a
            r0.<init>(r15)
            r15.f3544l = r0
        L_0x002d:
            int r0 = r15.f3548d
            if (r0 == r4) goto L_0x00ae
            if (r0 != r6) goto L_0x0076
            h0.e r7 = r15.f3546b
            h0.e r7 = r7.I
            if (r7 == 0) goto L_0x0076
            int[] r8 = r7.f3273c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0076
            int r0 = r7.j()
            h0.e r4 = r15.f3546b
            h0.d r4 = r4.f3294y
            int r4 = r4.c()
            int r0 = r0 - r4
            h0.e r4 = r15.f3546b
            h0.d r4 = r4.A
            int r4 = r4.c()
            int r0 = r0 - r4
            i0.l r4 = r7.f3275e
            i0.f r5 = r4.f3552h
            h0.e r6 = r15.f3546b
            h0.d r6 = r6.f3294y
            int r6 = r6.c()
            i0.m.b(r3, r5, r6)
            i0.f r3 = r4.f3553i
            h0.e r4 = r15.f3546b
            h0.d r4 = r4.A
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0076:
            if (r0 != r5) goto L_0x00ae
            h0.e r0 = r15.f3546b
            int r0 = r0.j()
            r2.d(r0)
            goto L_0x00ae
        L_0x0082:
            int r0 = r15.f3548d
            if (r0 != r6) goto L_0x00ae
            h0.e r0 = r15.f3546b
            h0.e r7 = r0.I
            if (r7 == 0) goto L_0x00ae
            int[] r8 = r7.f3273c0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00ae
            i0.l r2 = r7.f3275e
            i0.f r4 = r2.f3552h
            h0.d r0 = r0.f3294y
            int r0 = r0.c()
            i0.m.b(r3, r4, r0)
            i0.f r0 = r2.f3553i
            h0.e r2 = r15.f3546b
            h0.d r2 = r2.A
            int r2 = r2.c()
            int r2 = -r2
            i0.m.b(r1, r0, r2)
            return
        L_0x00ae:
            boolean r0 = r2.f3536j
            i0.f r7 = r15.f3543k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01c3
            h0.e r10 = r15.f3546b
            boolean r11 = r10.f3268a
            if (r11 == 0) goto L_0x01c3
            h0.d[] r0 = r10.F
            r11 = r0[r9]
            h0.d r12 = r11.f3264d
            if (r12 == 0) goto L_0x0129
            r13 = r0[r4]
            h0.d r13 = r13.f3264d
            if (r13 == 0) goto L_0x0129
            boolean r0 = r10.r()
            if (r0 == 0) goto L_0x00ea
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f3532f = r0
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f3532f = r0
            goto L_0x0121
        L_0x00ea:
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r9]
            i0.f r0 = i0.m.h(r0)
            if (r0 == 0) goto L_0x0103
            h0.e r2 = r15.f3546b
            h0.d[] r2 = r2.F
            r2 = r2[r9]
            int r2 = r2.c()
            i0.m.b(r3, r0, r2)
        L_0x0103:
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
            i0.f r0 = i0.m.h(r0)
            if (r0 == 0) goto L_0x011d
            h0.e r2 = r15.f3546b
            h0.d[] r2 = r2.F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            i0.m.b(r1, r0, r2)
        L_0x011d:
            r3.f3528b = r5
            r1.f3528b = r5
        L_0x0121:
            h0.e r0 = r15.f3546b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x031d
            goto L_0x01bc
        L_0x0129:
            if (r12 == 0) goto L_0x014b
            i0.f r0 = i0.m.h(r11)
            if (r0 == 0) goto L_0x031d
            h0.e r4 = r15.f3546b
            h0.d[] r4 = r4.F
            r4 = r4[r9]
            int r4 = r4.c()
            i0.m.b(r3, r0, r4)
            int r0 = r2.f3533g
            i0.m.b(r1, r3, r0)
            h0.e r0 = r15.f3546b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x031d
            goto L_0x01bc
        L_0x014b:
            r5 = r0[r4]
            h0.d r9 = r5.f3264d
            if (r9 == 0) goto L_0x0172
            i0.f r0 = i0.m.h(r5)
            if (r0 == 0) goto L_0x016b
            h0.e r5 = r15.f3546b
            h0.d[] r5 = r5.F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r0, r4)
            int r0 = r2.f3533g
            int r0 = -r0
            i0.m.b(r3, r1, r0)
        L_0x016b:
            h0.e r0 = r15.f3546b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x031d
            goto L_0x01bc
        L_0x0172:
            r0 = r0[r6]
            h0.d r4 = r0.f3264d
            if (r4 == 0) goto L_0x0190
            i0.f r0 = i0.m.h(r0)
            if (r0 == 0) goto L_0x031d
            i0.m.b(r7, r0, r8)
            h0.e r0 = r15.f3546b
            int r0 = r0.P
            int r0 = -r0
            i0.m.b(r3, r7, r0)
            int r0 = r2.f3533g
            i0.m.b(r1, r3, r0)
            goto L_0x031d
        L_0x0190:
            boolean r0 = r10 instanceof h0.j
            if (r0 != 0) goto L_0x031d
            h0.e r0 = r10.I
            if (r0 == 0) goto L_0x031d
            h0.c r0 = h0.c.f3257i
            h0.d r0 = r10.h(r0)
            h0.d r0 = r0.f3264d
            if (r0 != 0) goto L_0x031d
            h0.e r0 = r15.f3546b
            h0.e r4 = r0.I
            i0.l r4 = r4.f3275e
            i0.f r4 = r4.f3552h
            int r0 = r0.n()
            i0.m.b(r3, r4, r0)
            int r0 = r2.f3533g
            i0.m.b(r1, r3, r0)
            h0.e r0 = r15.f3546b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x031d
        L_0x01bc:
            int r0 = r0.P
            i0.m.b(r7, r3, r0)
            goto L_0x031d
        L_0x01c3:
            java.util.ArrayList r10 = r2.f3538l
            if (r0 != 0) goto L_0x0200
            int r0 = r15.f3548d
            if (r0 != r4) goto L_0x0200
            h0.e r0 = r15.f3546b
            int r11 = r0.f3281k
            if (r11 == r9) goto L_0x01e4
            if (r11 == r4) goto L_0x01d4
            goto L_0x0203
        L_0x01d4:
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0203
            h0.e r0 = r15.f3546b
            int r11 = r0.f3280j
            if (r11 != r4) goto L_0x01e1
            goto L_0x0203
        L_0x01e1:
            i0.j r0 = r0.f3274d
            goto L_0x01eb
        L_0x01e4:
            h0.e r0 = r0.I
            if (r0 != 0) goto L_0x01e9
            goto L_0x0203
        L_0x01e9:
            i0.l r0 = r0.f3275e
        L_0x01eb:
            i0.g r0 = r0.f3549e
            r10.add(r0)
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            r2.f3528b = r5
            java.util.ArrayList r0 = r2.f3537k
            r0.add(r3)
            r0.add(r1)
            goto L_0x0203
        L_0x0200:
            r2.b(r15)
        L_0x0203:
            h0.e r0 = r15.f3546b
            h0.d[] r11 = r0.F
            r12 = r11[r9]
            h0.d r13 = r12.f3264d
            if (r13 == 0) goto L_0x0256
            r14 = r11[r4]
            h0.d r14 = r14.f3264d
            if (r14 == 0) goto L_0x0256
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0233
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r9]
            int r0 = r0.c()
            r3.f3532f = r0
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f3532f = r0
            goto L_0x024f
        L_0x0233:
            h0.e r0 = r15.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r9]
            i0.f r0 = i0.m.h(r0)
            h0.e r1 = r15.f3546b
            h0.d[] r1 = r1.F
            r1 = r1[r4]
            i0.f r1 = i0.m.h(r1)
            r0.b(r15)
            r1.b(r15)
            r15.f3554j = r6
        L_0x024f:
            h0.e r0 = r15.f3546b
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x0315
            goto L_0x02b2
        L_0x0256:
            r14 = 0
            if (r13 == 0) goto L_0x028e
            i0.f r0 = i0.m.h(r12)
            if (r0 == 0) goto L_0x0315
            h0.e r6 = r15.f3546b
            h0.d[] r6 = r6.F
            r6 = r6[r9]
            int r6 = r6.c()
            i0.m.b(r3, r0, r6)
            r15.c(r1, r3, r5, r2)
            h0.e r0 = r15.f3546b
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x027a
            i0.a r0 = r15.f3544l
            r15.c(r7, r3, r5, r0)
        L_0x027a:
            int r0 = r15.f3548d
            if (r0 != r4) goto L_0x0315
            h0.e r0 = r15.f3546b
            float r1 = r0.L
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0315
            i0.j r0 = r0.f3274d
            int r1 = r0.f3548d
            if (r1 != r4) goto L_0x0315
            goto L_0x0303
        L_0x028e:
            r9 = r11[r4]
            h0.d r12 = r9.f3264d
            r13 = -1
            if (r12 == 0) goto L_0x02b8
            i0.f r0 = i0.m.h(r9)
            if (r0 == 0) goto L_0x0315
            h0.e r6 = r15.f3546b
            h0.d[] r6 = r6.F
            r4 = r6[r4]
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r0, r4)
            r15.c(r3, r1, r13, r2)
            h0.e r0 = r15.f3546b
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x0315
        L_0x02b2:
            i0.a r0 = r15.f3544l
            r15.c(r7, r3, r5, r0)
            goto L_0x0315
        L_0x02b8:
            r6 = r11[r6]
            h0.d r9 = r6.f3264d
            if (r9 == 0) goto L_0x02d0
            i0.f r0 = i0.m.h(r6)
            if (r0 == 0) goto L_0x0315
            i0.m.b(r7, r0, r8)
            i0.a r0 = r15.f3544l
            r15.c(r3, r7, r13, r0)
            r15.c(r1, r3, r5, r2)
            goto L_0x0315
        L_0x02d0:
            boolean r6 = r0 instanceof h0.j
            if (r6 != 0) goto L_0x0315
            h0.e r6 = r0.I
            if (r6 == 0) goto L_0x0315
            i0.l r6 = r6.f3275e
            i0.f r6 = r6.f3552h
            int r0 = r0.n()
            i0.m.b(r3, r6, r0)
            r15.c(r1, r3, r5, r2)
            h0.e r0 = r15.f3546b
            boolean r0 = r0.w
            if (r0 == 0) goto L_0x02f1
            i0.a r0 = r15.f3544l
            r15.c(r7, r3, r5, r0)
        L_0x02f1:
            int r0 = r15.f3548d
            if (r0 != r4) goto L_0x0315
            h0.e r0 = r15.f3546b
            float r1 = r0.L
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0315
            i0.j r0 = r0.f3274d
            int r1 = r0.f3548d
            if (r1 != r4) goto L_0x0315
        L_0x0303:
            i0.g r0 = r0.f3549e
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            h0.e r0 = r15.f3546b
            i0.j r0 = r0.f3274d
            i0.g r0 = r0.f3549e
            r10.add(r0)
            r2.f3527a = r15
        L_0x0315:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x031d
            r2.f3529c = r5
        L_0x031d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.d():void");
    }

    public final void e() {
        f fVar = this.f3552h;
        if (fVar.f3536j) {
            this.f3546b.O = fVar.f3533g;
        }
    }

    public final void f() {
        this.f3547c = null;
        this.f3552h.c();
        this.f3553i.c();
        this.f3543k.c();
        this.f3549e.c();
        this.f3551g = false;
    }

    public final boolean k() {
        return this.f3548d != 3 || this.f3546b.f3281k == 0;
    }

    public final void m() {
        this.f3551g = false;
        f fVar = this.f3552h;
        fVar.c();
        fVar.f3536j = false;
        f fVar2 = this.f3553i;
        fVar2.c();
        fVar2.f3536j = false;
        f fVar3 = this.f3543k;
        fVar3.c();
        fVar3.f3536j = false;
        this.f3549e.f3536j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3546b.W;
    }
}
