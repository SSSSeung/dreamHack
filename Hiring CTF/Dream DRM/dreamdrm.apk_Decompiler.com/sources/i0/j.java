package i0;

import h0.e;

public final class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f3540k = new int[2];

    public j(e eVar) {
        super(eVar);
        this.f3552h.f3531e = 4;
        this.f3553i.f3531e = 5;
        this.f3550f = 0;
    }

    public static void m(int[] iArr, int i3, int i6, int i7, int i8, float f6, int i9) {
        int i10 = i6 - i3;
        int i11 = i8 - i7;
        if (i9 == -1) {
            int i12 = (int) ((((float) i11) * f6) + 0.5f);
            int i13 = (int) ((((float) i10) / f6) + 0.5f);
            if (i12 <= i10) {
                iArr[0] = i12;
                iArr[1] = i11;
            } else if (i13 <= i11) {
                iArr[0] = i10;
                iArr[1] = i13;
            }
        } else if (i9 == 0) {
            iArr[0] = (int) ((((float) i11) * f6) + 0.5f);
            iArr[1] = i11;
        } else if (i9 == 1) {
            iArr[0] = i10;
            iArr[1] = (int) ((((float) i10) * f6) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0226, code lost:
        if (r3 != 1) goto L_0x0273;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i0.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f3554j
            int r1 = y.d.b(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0349
            i0.g r1 = r0.f3549e
            boolean r4 = r1.f3536j
            i0.f r5 = r0.f3552h
            i0.f r6 = r0.f3553i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x0273
            int r4 = r0.f3548d
            if (r4 != r3) goto L_0x0273
            h0.e r4 = r0.f3546b
            int r9 = r4.f3280j
            r10 = 2
            if (r9 == r10) goto L_0x025c
            if (r9 == r3) goto L_0x0028
            goto L_0x0273
        L_0x0028:
            int r9 = r4.f3281k
            i0.l r10 = r4.f3275e
            r11 = -1
            if (r9 == 0) goto L_0x0054
            if (r9 != r3) goto L_0x0032
            goto L_0x0054
        L_0x0032:
            int r9 = r4.M
            if (r9 == r11) goto L_0x0045
            if (r9 == 0) goto L_0x003c
            if (r9 == r8) goto L_0x0045
            r4 = r2
            goto L_0x004f
        L_0x003c:
            i0.g r9 = r10.f3549e
            int r9 = r9.f3533g
            float r9 = (float) r9
            float r4 = r4.L
            float r9 = r9 / r4
            goto L_0x004d
        L_0x0045:
            i0.g r9 = r10.f3549e
            int r9 = r9.f3533g
            float r9 = (float) r9
            float r4 = r4.L
            float r9 = r9 * r4
        L_0x004d:
            float r9 = r9 + r7
            int r4 = (int) r9
        L_0x004f:
            r1.d(r4)
            goto L_0x0273
        L_0x0054:
            i0.f r9 = r10.f3552h
            i0.f r10 = r10.f3553i
            h0.d r12 = r4.f3293x
            h0.d r12 = r12.f3264d
            if (r12 == 0) goto L_0x0060
            r12 = r8
            goto L_0x0061
        L_0x0060:
            r12 = r2
        L_0x0061:
            h0.d r13 = r4.f3294y
            h0.d r13 = r13.f3264d
            if (r13 == 0) goto L_0x0069
            r13 = r8
            goto L_0x006a
        L_0x0069:
            r13 = r2
        L_0x006a:
            h0.d r14 = r4.f3295z
            h0.d r14 = r14.f3264d
            if (r14 == 0) goto L_0x0072
            r14 = r8
            goto L_0x0073
        L_0x0072:
            r14 = r2
        L_0x0073:
            h0.d r15 = r4.A
            h0.d r15 = r15.f3264d
            if (r15 == 0) goto L_0x007b
            r15 = r8
            goto L_0x007c
        L_0x007b:
            r15 = r2
        L_0x007c:
            int r3 = r4.M
            if (r12 == 0) goto L_0x0194
            if (r13 == 0) goto L_0x0194
            if (r14 == 0) goto L_0x0194
            if (r15 == 0) goto L_0x0194
            float r4 = r4.L
            boolean r11 = r9.f3536j
            int[] r12 = f3540k
            if (r11 == 0) goto L_0x00dd
            boolean r11 = r10.f3536j
            if (r11 == 0) goto L_0x00dd
            boolean r7 = r5.f3529c
            if (r7 == 0) goto L_0x00dc
            boolean r7 = r6.f3529c
            if (r7 != 0) goto L_0x009b
            goto L_0x00dc
        L_0x009b:
            java.util.ArrayList r7 = r5.f3538l
            java.lang.Object r7 = r7.get(r2)
            i0.f r7 = (i0.f) r7
            int r7 = r7.f3533g
            int r5 = r5.f3532f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f3538l
            java.lang.Object r5 = r5.get(r2)
            i0.f r5 = (i0.f) r5
            int r5 = r5.f3533g
            int r6 = r6.f3532f
            int r18 = r5 - r6
            int r5 = r9.f3533g
            int r6 = r9.f3532f
            int r19 = r5 + r6
            int r5 = r10.f3533g
            int r6 = r10.f3532f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            h0.e r1 = r0.f3546b
            i0.l r1 = r1.f3275e
            i0.g r1 = r1.f3549e
            r2 = r12[r8]
            r1.d(r2)
        L_0x00dc:
            return
        L_0x00dd:
            boolean r11 = r5.f3536j
            java.util.ArrayList r13 = r9.f3538l
            if (r11 == 0) goto L_0x0131
            boolean r11 = r6.f3536j
            if (r11 == 0) goto L_0x0131
            boolean r11 = r9.f3529c
            if (r11 == 0) goto L_0x0130
            boolean r11 = r10.f3529c
            if (r11 != 0) goto L_0x00f0
            goto L_0x0130
        L_0x00f0:
            int r11 = r5.f3533g
            int r14 = r5.f3532f
            int r17 = r11 + r14
            int r11 = r6.f3533g
            int r14 = r6.f3532f
            int r18 = r11 - r14
            java.lang.Object r11 = r13.get(r2)
            i0.f r11 = (i0.f) r11
            int r11 = r11.f3533g
            int r14 = r9.f3532f
            int r19 = r11 + r14
            java.util.ArrayList r11 = r10.f3538l
            java.lang.Object r11 = r11.get(r2)
            i0.f r11 = (i0.f) r11
            int r11 = r11.f3533g
            int r14 = r10.f3532f
            int r20 = r11 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r11 = r12[r2]
            r1.d(r11)
            h0.e r11 = r0.f3546b
            i0.l r11 = r11.f3275e
            i0.g r11 = r11.f3549e
            r14 = r12[r8]
            r11.d(r14)
            goto L_0x0131
        L_0x0130:
            return
        L_0x0131:
            boolean r11 = r5.f3529c
            if (r11 == 0) goto L_0x0193
            boolean r11 = r6.f3529c
            if (r11 == 0) goto L_0x0193
            boolean r11 = r9.f3529c
            if (r11 == 0) goto L_0x0193
            boolean r11 = r10.f3529c
            if (r11 != 0) goto L_0x0142
            goto L_0x0193
        L_0x0142:
            java.util.ArrayList r11 = r5.f3538l
            java.lang.Object r11 = r11.get(r2)
            i0.f r11 = (i0.f) r11
            int r11 = r11.f3533g
            int r14 = r5.f3532f
            int r17 = r11 + r14
            java.util.ArrayList r11 = r6.f3538l
            java.lang.Object r11 = r11.get(r2)
            i0.f r11 = (i0.f) r11
            int r11 = r11.f3533g
            int r14 = r6.f3532f
            int r18 = r11 - r14
            java.lang.Object r11 = r13.get(r2)
            i0.f r11 = (i0.f) r11
            int r11 = r11.f3533g
            int r9 = r9.f3532f
            int r19 = r11 + r9
            java.util.ArrayList r9 = r10.f3538l
            java.lang.Object r9 = r9.get(r2)
            i0.f r9 = (i0.f) r9
            int r9 = r9.f3533g
            int r10 = r10.f3532f
            int r20 = r9 - r10
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            h0.e r3 = r0.f3546b
            i0.l r3 = r3.f3275e
            i0.g r3 = r3.f3549e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x0273
        L_0x0193:
            return
        L_0x0194:
            if (r12 == 0) goto L_0x01f9
            if (r14 == 0) goto L_0x01f9
            boolean r9 = r5.f3529c
            if (r9 == 0) goto L_0x01f8
            boolean r9 = r6.f3529c
            if (r9 != 0) goto L_0x01a1
            goto L_0x01f8
        L_0x01a1:
            float r4 = r4.L
            java.util.ArrayList r9 = r5.f3538l
            java.lang.Object r9 = r9.get(r2)
            i0.f r9 = (i0.f) r9
            int r9 = r9.f3533g
            int r10 = r5.f3532f
            int r9 = r9 + r10
            java.util.ArrayList r10 = r6.f3538l
            java.lang.Object r10 = r10.get(r2)
            i0.f r10 = (i0.f) r10
            int r10 = r10.f3533g
            int r12 = r6.f3532f
            int r10 = r10 - r12
            if (r3 == r11) goto L_0x01d7
            if (r3 == 0) goto L_0x01d7
            if (r3 == r8) goto L_0x01c5
            goto L_0x0273
        L_0x01c5:
            int r10 = r10 - r9
            int r3 = r0.g(r10, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01ea
            float r3 = (float) r10
            float r3 = r3 * r4
            goto L_0x01e8
        L_0x01d7:
            int r10 = r10 - r9
            int r3 = r0.g(r10, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01ea
            float r3 = (float) r10
            float r3 = r3 / r4
        L_0x01e8:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01ea:
            r1.d(r3)
            h0.e r3 = r0.f3546b
            i0.l r3 = r3.f3275e
            i0.g r3 = r3.f3549e
            r3.d(r10)
            goto L_0x0273
        L_0x01f8:
            return
        L_0x01f9:
            if (r13 == 0) goto L_0x0273
            if (r15 == 0) goto L_0x0273
            boolean r12 = r9.f3529c
            if (r12 == 0) goto L_0x025b
            boolean r12 = r10.f3529c
            if (r12 != 0) goto L_0x0206
            goto L_0x025b
        L_0x0206:
            float r4 = r4.L
            java.util.ArrayList r12 = r9.f3538l
            java.lang.Object r12 = r12.get(r2)
            i0.f r12 = (i0.f) r12
            int r12 = r12.f3533g
            int r9 = r9.f3532f
            int r12 = r12 + r9
            java.util.ArrayList r9 = r10.f3538l
            java.lang.Object r9 = r9.get(r2)
            i0.f r9 = (i0.f) r9
            int r9 = r9.f3533g
            int r10 = r10.f3532f
            int r9 = r9 - r10
            if (r3 == r11) goto L_0x023b
            if (r3 == 0) goto L_0x0229
            if (r3 == r8) goto L_0x023b
            goto L_0x0273
        L_0x0229:
            int r9 = r9 - r12
            int r3 = r0.g(r9, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x024e
            float r3 = (float) r10
            float r3 = r3 / r4
            goto L_0x024c
        L_0x023b:
            int r9 = r9 - r12
            int r3 = r0.g(r9, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x024e
            float r3 = (float) r10
            float r3 = r3 * r4
        L_0x024c:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x024e:
            r1.d(r10)
            h0.e r4 = r0.f3546b
            i0.l r4 = r4.f3275e
            i0.g r4 = r4.f3549e
            r4.d(r3)
            goto L_0x0273
        L_0x025b:
            return
        L_0x025c:
            h0.e r3 = r4.I
            if (r3 == 0) goto L_0x0273
            i0.j r3 = r3.f3274d
            i0.g r3 = r3.f3549e
            boolean r9 = r3.f3536j
            if (r9 == 0) goto L_0x0273
            float r4 = r4.f3285o
            int r3 = r3.f3533g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x0273:
            boolean r3 = r5.f3529c
            if (r3 == 0) goto L_0x0348
            boolean r3 = r6.f3529c
            if (r3 != 0) goto L_0x027d
            goto L_0x0348
        L_0x027d:
            boolean r3 = r5.f3536j
            if (r3 == 0) goto L_0x028a
            boolean r3 = r6.f3536j
            if (r3 == 0) goto L_0x028a
            boolean r3 = r1.f3536j
            if (r3 == 0) goto L_0x028a
            return
        L_0x028a:
            boolean r3 = r1.f3536j
            java.util.ArrayList r4 = r5.f3538l
            java.util.ArrayList r9 = r6.f3538l
            if (r3 != 0) goto L_0x02c5
            int r3 = r0.f3548d
            r10 = 3
            if (r3 != r10) goto L_0x02c5
            h0.e r3 = r0.f3546b
            int r10 = r3.f3280j
            if (r10 != 0) goto L_0x02c5
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x02c5
            java.lang.Object r3 = r4.get(r2)
            i0.f r3 = (i0.f) r3
            java.lang.Object r2 = r9.get(r2)
            i0.f r2 = (i0.f) r2
            int r3 = r3.f3533g
            int r4 = r5.f3532f
            int r3 = r3 + r4
            int r2 = r2.f3533g
            int r4 = r6.f3532f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02c5:
            boolean r3 = r1.f3536j
            if (r3 != 0) goto L_0x030e
            int r3 = r0.f3548d
            r10 = 3
            if (r3 != r10) goto L_0x030e
            int r3 = r0.f3545a
            if (r3 != r8) goto L_0x030e
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x030e
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x030e
            java.lang.Object r3 = r4.get(r2)
            i0.f r3 = (i0.f) r3
            java.lang.Object r8 = r9.get(r2)
            i0.f r8 = (i0.f) r8
            int r3 = r3.f3533g
            int r10 = r5.f3532f
            int r3 = r3 + r10
            int r8 = r8.f3533g
            int r10 = r6.f3532f
            int r8 = r8 + r10
            int r8 = r8 - r3
            int r3 = r1.f3539m
            int r3 = java.lang.Math.min(r8, r3)
            h0.e r8 = r0.f3546b
            int r10 = r8.f3284n
            int r8 = r8.f3283m
            int r3 = java.lang.Math.max(r8, r3)
            if (r10 <= 0) goto L_0x030b
            int r3 = java.lang.Math.min(r10, r3)
        L_0x030b:
            r1.d(r3)
        L_0x030e:
            boolean r3 = r1.f3536j
            if (r3 != 0) goto L_0x0313
            return
        L_0x0313:
            java.lang.Object r3 = r4.get(r2)
            i0.f r3 = (i0.f) r3
            java.lang.Object r2 = r9.get(r2)
            i0.f r2 = (i0.f) r2
            int r4 = r3.f3533g
            int r8 = r5.f3532f
            int r8 = r8 + r4
            int r9 = r2.f3533g
            int r10 = r6.f3532f
            int r10 = r10 + r9
            h0.e r11 = r0.f3546b
            float r11 = r11.S
            if (r3 != r2) goto L_0x0331
            r11 = r7
            goto L_0x0333
        L_0x0331:
            r4 = r8
            r9 = r10
        L_0x0333:
            int r9 = r9 - r4
            int r2 = r1.f3533g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f3533g
            int r1 = r1.f3533g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0348:
            return
        L_0x0349:
            h0.e r1 = r0.f3546b
            h0.d r3 = r1.f3293x
            h0.d r1 = r1.f3295z
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.a(i0.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0 = r12.f3546b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r12 = this;
            h0.e r0 = r12.f3546b
            boolean r1 = r0.f3268a
            i0.g r2 = r12.f3549e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.l()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f3536j
            i0.f r1 = r12.f3553i
            i0.f r3 = r12.f3552h
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 0
            if (r0 != 0) goto L_0x0078
            h0.e r0 = r12.f3546b
            int[] r8 = r0.f3273c0
            r8 = r8[r7]
            r12.f3548d = r8
            if (r8 == r6) goto L_0x00ac
            if (r8 != r5) goto L_0x006e
            h0.e r9 = r0.I
            if (r9 == 0) goto L_0x0031
            int[] r10 = r9.f3273c0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0037
        L_0x0031:
            int[] r10 = r9.f3273c0
            r10 = r10[r7]
            if (r10 != r5) goto L_0x006e
        L_0x0037:
            int r0 = r9.l()
            h0.e r4 = r12.f3546b
            h0.d r4 = r4.f3293x
            int r4 = r4.c()
            int r0 = r0 - r4
            h0.e r4 = r12.f3546b
            h0.d r4 = r4.f3295z
            int r4 = r4.c()
            int r0 = r0 - r4
            i0.j r4 = r9.f3274d
            i0.f r5 = r4.f3552h
            h0.e r6 = r12.f3546b
            h0.d r6 = r6.f3293x
            int r6 = r6.c()
            i0.m.b(r3, r5, r6)
            i0.f r3 = r4.f3553i
            h0.e r4 = r12.f3546b
            h0.d r4 = r4.f3295z
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006e:
            if (r8 != r4) goto L_0x00ac
            int r0 = r0.l()
            r2.d(r0)
            goto L_0x00ac
        L_0x0078:
            int r0 = r12.f3548d
            if (r0 != r5) goto L_0x00ac
            h0.e r0 = r12.f3546b
            h0.e r8 = r0.I
            if (r8 == 0) goto L_0x0088
            int[] r9 = r8.f3273c0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x008e
        L_0x0088:
            int[] r9 = r8.f3273c0
            r9 = r9[r7]
            if (r9 != r5) goto L_0x00ac
        L_0x008e:
            i0.j r2 = r8.f3274d
            i0.f r2 = r2.f3552h
            h0.d r0 = r0.f3293x
            int r0 = r0.c()
            i0.m.b(r3, r2, r0)
            i0.j r0 = r8.f3274d
            i0.f r0 = r0.f3553i
            h0.e r2 = r12.f3546b
            h0.d r2 = r2.f3295z
            int r2 = r2.c()
            int r2 = -r2
            i0.m.b(r1, r0, r2)
            return
        L_0x00ac:
            boolean r0 = r2.f3536j
            if (r0 == 0) goto L_0x0177
            h0.e r0 = r12.f3546b
            boolean r8 = r0.f3268a
            if (r8 == 0) goto L_0x0177
            h0.d[] r5 = r0.F
            r6 = r5[r7]
            h0.d r8 = r6.f3264d
            if (r8 == 0) goto L_0x0117
            r9 = r5[r4]
            h0.d r9 = r9.f3264d
            if (r9 == 0) goto L_0x0117
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00de
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f3532f = r0
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
            goto L_0x027c
        L_0x00de:
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r7]
            i0.f r0 = i0.m.h(r0)
            if (r0 == 0) goto L_0x00f7
            h0.e r2 = r12.f3546b
            h0.d[] r2 = r2.F
            r2 = r2[r7]
            int r2 = r2.c()
            i0.m.b(r3, r0, r2)
        L_0x00f7:
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
            i0.f r0 = i0.m.h(r0)
            if (r0 == 0) goto L_0x0111
            h0.e r2 = r12.f3546b
            h0.d[] r2 = r2.F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            i0.m.b(r1, r0, r2)
        L_0x0111:
            r3.f3528b = r4
            r1.f3528b = r4
            goto L_0x02ec
        L_0x0117:
            if (r8 == 0) goto L_0x012d
            i0.f r0 = i0.m.h(r6)
            if (r0 == 0) goto L_0x02ec
            h0.e r4 = r12.f3546b
            h0.d[] r4 = r4.F
            r4 = r4[r7]
            int r4 = r4.c()
            i0.m.b(r3, r0, r4)
            goto L_0x0170
        L_0x012d:
            r5 = r5[r4]
            h0.d r6 = r5.f3264d
            if (r6 == 0) goto L_0x014f
            i0.f r0 = i0.m.h(r5)
            if (r0 == 0) goto L_0x02ec
            h0.e r5 = r12.f3546b
            h0.d[] r5 = r5.F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r0, r4)
            int r0 = r2.f3533g
            int r0 = -r0
            i0.m.b(r3, r1, r0)
            goto L_0x02ec
        L_0x014f:
            boolean r4 = r0 instanceof h0.j
            if (r4 != 0) goto L_0x02ec
            h0.e r4 = r0.I
            if (r4 == 0) goto L_0x02ec
            h0.c r4 = h0.c.f3257i
            h0.d r0 = r0.h(r4)
            h0.d r0 = r0.f3264d
            if (r0 != 0) goto L_0x02ec
            h0.e r0 = r12.f3546b
            h0.e r4 = r0.I
            i0.j r4 = r4.f3274d
            i0.f r4 = r4.f3552h
            int r0 = r0.m()
            i0.m.b(r3, r4, r0)
        L_0x0170:
            int r0 = r2.f3533g
            i0.m.b(r1, r3, r0)
            goto L_0x02ec
        L_0x0177:
            int r0 = r12.f3548d
            if (r0 != r6) goto L_0x0254
            h0.e r0 = r12.f3546b
            int r8 = r0.f3280j
            r9 = 2
            java.util.ArrayList r10 = r2.f3537k
            java.util.ArrayList r11 = r2.f3538l
            if (r8 == r9) goto L_0x023b
            if (r8 == r6) goto L_0x018a
            goto L_0x0254
        L_0x018a:
            int r8 = r0.f3281k
            i0.l r9 = r0.f3275e
            if (r8 != r6) goto L_0x0208
            r3.f3527a = r12
            r1.f3527a = r12
            i0.f r6 = r9.f3552h
            r6.f3527a = r12
            i0.f r6 = r9.f3553i
            r6.f3527a = r12
            r2.f3527a = r12
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x01e2
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            r11.add(r0)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r6 = r0.f3549e
            r6.f3527a = r12
            i0.f r0 = r0.f3552h
            r11.add(r0)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.f r0 = r0.f3553i
            r11.add(r0)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.f r0 = r0.f3552h
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.f r0 = r0.f3553i
            java.util.ArrayList r0 = r0.f3537k
            goto L_0x0237
        L_0x01e2:
            h0.e r0 = r12.f3546b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x01ff
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            java.util.ArrayList r0 = r0.f3538l
            r0.add(r2)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            r10.add(r0)
            goto L_0x0254
        L_0x01ff:
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            java.util.ArrayList r0 = r0.f3538l
            goto L_0x0237
        L_0x0208:
            i0.g r0 = r9.f3549e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.f r0 = r0.f3552h
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            h0.e r0 = r12.f3546b
            i0.l r0 = r0.f3275e
            i0.f r0 = r0.f3553i
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            r2.f3528b = r4
            r10.add(r3)
            r10.add(r1)
            java.util.ArrayList r0 = r3.f3538l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f3538l
        L_0x0237:
            r0.add(r2)
            goto L_0x0254
        L_0x023b:
            h0.e r0 = r0.I
            if (r0 != 0) goto L_0x0240
            goto L_0x0254
        L_0x0240:
            i0.l r0 = r0.f3275e
            i0.g r0 = r0.f3549e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f3537k
            r0.add(r2)
            r2.f3528b = r4
            r10.add(r3)
            r10.add(r1)
        L_0x0254:
            h0.e r0 = r12.f3546b
            h0.d[] r6 = r0.F
            r8 = r6[r7]
            h0.d r9 = r8.f3264d
            if (r9 == 0) goto L_0x02a1
            r10 = r6[r4]
            h0.d r10 = r10.f3264d
            if (r10 == 0) goto L_0x02a1
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x0284
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f3532f = r0
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r4]
        L_0x027c:
            int r0 = r0.c()
            int r0 = -r0
            r1.f3532f = r0
            goto L_0x02ec
        L_0x0284:
            h0.e r0 = r12.f3546b
            h0.d[] r0 = r0.F
            r0 = r0[r7]
            i0.f r0 = i0.m.h(r0)
            h0.e r1 = r12.f3546b
            h0.d[] r1 = r1.F
            r1 = r1[r4]
            i0.f r1 = i0.m.h(r1)
            r0.b(r12)
            r1.b(r12)
            r12.f3554j = r5
            goto L_0x02ec
        L_0x02a1:
            if (r9 == 0) goto L_0x02b7
            i0.f r0 = i0.m.h(r8)
            if (r0 == 0) goto L_0x02ec
            h0.e r5 = r12.f3546b
            h0.d[] r5 = r5.F
            r5 = r5[r7]
            int r5 = r5.c()
            i0.m.b(r3, r0, r5)
            goto L_0x02e9
        L_0x02b7:
            r5 = r6[r4]
            h0.d r6 = r5.f3264d
            if (r6 == 0) goto L_0x02d6
            i0.f r0 = i0.m.h(r5)
            if (r0 == 0) goto L_0x02ec
            h0.e r5 = r12.f3546b
            h0.d[] r5 = r5.F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            i0.m.b(r1, r0, r4)
            r0 = -1
            r12.c(r3, r1, r0, r2)
            goto L_0x02ec
        L_0x02d6:
            boolean r5 = r0 instanceof h0.j
            if (r5 != 0) goto L_0x02ec
            h0.e r5 = r0.I
            if (r5 == 0) goto L_0x02ec
            i0.j r5 = r5.f3274d
            i0.f r5 = r5.f3552h
            int r0 = r0.m()
            i0.m.b(r3, r5, r0)
        L_0x02e9:
            r12.c(r1, r3, r4, r2)
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.d():void");
    }

    public final void e() {
        f fVar = this.f3552h;
        if (fVar.f3536j) {
            this.f3546b.N = fVar.f3533g;
        }
    }

    public final void f() {
        this.f3547c = null;
        this.f3552h.c();
        this.f3553i.c();
        this.f3549e.c();
        this.f3551g = false;
    }

    public final boolean k() {
        return this.f3548d != 3 || this.f3546b.f3280j == 0;
    }

    public final void n() {
        this.f3551g = false;
        f fVar = this.f3552h;
        fVar.c();
        fVar.f3536j = false;
        f fVar2 = this.f3553i;
        fVar2.c();
        fVar2.f3536j = false;
        this.f3549e.f3536j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3546b.W;
    }
}
