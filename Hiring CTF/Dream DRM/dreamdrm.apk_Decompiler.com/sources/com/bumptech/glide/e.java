package com.bumptech.glide;

import a2.m;
import android.graphics.Path;
import android.view.View;
import androidx.activity.result.c;
import b1.o;
import b1.v;
import com.theori.dreamdrm.R;
import d0.a;
import e2.d0;
import i4.d;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n.b;
import q0.f;
import u4.g;
import v4.i;
import w4.i0;
import w4.m0;
import w4.q0;
import w4.x;
import x0.b1;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f1705a = new boolean[3];

    /* renamed from: b  reason: collision with root package name */
    public static final b f1706b = new b(new long[0], new Object[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f1707c = new d0(19);

    public static final long a(int i3, int i6, int i7, int i8) {
        long j6;
        int i9 = 0;
        if (i6 >= i3) {
            if (i8 >= i7) {
                if (i3 >= 0 && i7 >= 0) {
                    int i10 = i8 == Integer.MAX_VALUE ? i7 : i8;
                    int m6 = androidx.compose.ui.platform.e.m(i10);
                    int i11 = i6 == Integer.MAX_VALUE ? i3 : i6;
                    int m7 = androidx.compose.ui.platform.e.m(i11);
                    if (m6 + m7 <= 31) {
                        if (m7 == 13) {
                            j6 = 3;
                        } else if (m7 == 18) {
                            j6 = 1;
                        } else if (m7 == 15) {
                            j6 = 2;
                        } else if (m7 == 16) {
                            j6 = 0;
                        } else {
                            throw new IllegalStateException("Should only have the provided constants.");
                        }
                        int i12 = i6 == Integer.MAX_VALUE ? 0 : i6 + 1;
                        if (i8 != Integer.MAX_VALUE) {
                            i9 = i8 + 1;
                        }
                        int i13 = a.f2138b[(int) j6];
                        return (((long) i12) << 33) | (((long) i3) << 2) | j6 | (((long) i7) << i13) | (((long) i9) << (i13 + 31));
                    }
                    throw new IllegalArgumentException("Can't represent a width of " + i11 + " and height of " + i10 + " in Constraints");
                }
                throw new IllegalArgumentException(("minWidth(" + i3 + ") and minHeight(" + i7 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i8 + ") must be >= than minHeight(" + i7 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i6 + ") must be >= than minWidth(" + i3 + ')').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0252, code lost:
        if (r2.f3262b == r8) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        if (r4.f3262b == r12) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x00f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x026b A[EDGE_INSN: B:416:0x026b->B:163:0x026b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(h0.f r37, g0.e r38, int r39) {
        /*
            r0 = r37
            r10 = r38
            r11 = 2
            if (r39 != 0) goto L_0x000f
            int r1 = r0.f3303l0
            h0.b[] r2 = r0.f3306o0
            r13 = r1
            r14 = r2
            r15 = 0
            goto L_0x0016
        L_0x000f:
            int r1 = r0.f3304m0
            h0.b[] r2 = r0.f3305n0
            r13 = r1
            r14 = r2
            r15 = r11
        L_0x0016:
            r9 = 0
        L_0x0017:
            if (r9 >= r13) goto L_0x070d
            r1 = r14[r9]
            boolean r2 = r1.f3251q
            r3 = 3
            r8 = 8
            r5 = 1
            h0.e r7 = r1.f3235a
            r16 = 0
            if (r2 != 0) goto L_0x0139
            int r2 = r1.f3246l
            int r6 = r2 * 2
            r12 = r7
            r18 = r12
            r17 = 0
        L_0x0030:
            if (r17 != 0) goto L_0x0103
            int r4 = r1.f3243i
            int r4 = r4 + r5
            r1.f3243i = r4
            h0.e[] r4 = r12.f3271b0
            r4[r2] = r16
            h0.e[] r4 = r12.f3269a0
            r4[r2] = r16
            int r4 = r12.V
            h0.d[] r5 = r12.F
            if (r4 == r8) goto L_0x00cf
            int r4 = r12.i(r2)
            r4 = r5[r6]
            r4.c()
            int r4 = r6 + 1
            r21 = r5[r4]
            r21.c()
            r21 = r5[r6]
            r21.c()
            r4 = r5[r4]
            r4.c()
            h0.e r4 = r1.f3236b
            if (r4 != 0) goto L_0x0065
            r1.f3236b = r12
        L_0x0065:
            r1.f3238d = r12
            int[] r4 = r12.f3273c0
            r4 = r4[r2]
            if (r4 != r3) goto L_0x00cf
            int[] r8 = r12.f3282l
            r8 = r8[r2]
            if (r8 == 0) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            if (r8 != r11) goto L_0x00cf
        L_0x0077:
            int r11 = r1.f3244j
            r20 = 1
            int r11 = r11 + 1
            r1.f3244j = r11
            float[] r11 = r12.Z
            r11 = r11[r2]
            r19 = 0
            int r22 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r22 <= 0) goto L_0x008e
            float r3 = r1.f3245k
            float r3 = r3 + r11
            r1.f3245k = r3
        L_0x008e:
            int r3 = r12.V
            r23 = r9
            r9 = 8
            if (r3 == r9) goto L_0x009f
            r3 = 3
            if (r4 != r3) goto L_0x009f
            if (r8 == 0) goto L_0x009d
            if (r8 != r3) goto L_0x009f
        L_0x009d:
            r3 = 1
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            if (r3 == 0) goto L_0x00be
            r3 = 0
            int r4 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ab
            r3 = 1
            r1.f3248n = r3
            goto L_0x00ae
        L_0x00ab:
            r3 = 1
            r1.f3249o = r3
        L_0x00ae:
            java.util.ArrayList r3 = r1.f3242h
            if (r3 != 0) goto L_0x00b9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f3242h = r3
        L_0x00b9:
            java.util.ArrayList r3 = r1.f3242h
            r3.add(r12)
        L_0x00be:
            h0.e r3 = r1.f3240f
            if (r3 != 0) goto L_0x00c4
            r1.f3240f = r12
        L_0x00c4:
            h0.e r3 = r1.f3241g
            if (r3 == 0) goto L_0x00cc
            h0.e[] r3 = r3.f3269a0
            r3[r2] = r12
        L_0x00cc:
            r1.f3241g = r12
            goto L_0x00d1
        L_0x00cf:
            r23 = r9
        L_0x00d1:
            r3 = r18
            if (r3 == r12) goto L_0x00d9
            h0.e[] r3 = r3.f3271b0
            r3[r2] = r12
        L_0x00d9:
            int r3 = r6 + 1
            r3 = r5[r3]
            h0.d r3 = r3.f3264d
            if (r3 == 0) goto L_0x00ef
            h0.e r3 = r3.f3262b
            h0.d[] r4 = r3.F
            r4 = r4[r6]
            h0.d r4 = r4.f3264d
            if (r4 == 0) goto L_0x00ef
            h0.e r4 = r4.f3262b
            if (r4 == r12) goto L_0x00f1
        L_0x00ef:
            r3 = r16
        L_0x00f1:
            if (r3 == 0) goto L_0x00f4
            goto L_0x00f7
        L_0x00f4:
            r3 = r12
            r17 = 1
        L_0x00f7:
            r18 = r12
            r9 = r23
            r5 = 1
            r8 = 8
            r11 = 2
            r12 = r3
            r3 = 3
            goto L_0x0030
        L_0x0103:
            r23 = r9
            h0.e r3 = r1.f3236b
            if (r3 == 0) goto L_0x0110
            h0.d[] r3 = r3.F
            r3 = r3[r6]
            r3.c()
        L_0x0110:
            h0.e r3 = r1.f3238d
            if (r3 == 0) goto L_0x011d
            int r6 = r6 + 1
            h0.d[] r3 = r3.F
            r3 = r3[r6]
            r3.c()
        L_0x011d:
            r1.f3237c = r12
            if (r2 != 0) goto L_0x0128
            boolean r2 = r1.f3247m
            if (r2 == 0) goto L_0x0128
            r1.f3239e = r12
            goto L_0x012a
        L_0x0128:
            r1.f3239e = r7
        L_0x012a:
            boolean r2 = r1.f3249o
            if (r2 == 0) goto L_0x0134
            boolean r2 = r1.f3248n
            if (r2 == 0) goto L_0x0134
            r2 = 1
            goto L_0x0135
        L_0x0134:
            r2 = 0
        L_0x0135:
            r1.f3250p = r2
            r2 = 1
            goto L_0x013c
        L_0x0139:
            r23 = r9
            r2 = r5
        L_0x013c:
            r1.f3251q = r2
            h0.e r11 = r1.f3237c
            h0.e r12 = r1.f3236b
            h0.e r9 = r1.f3238d
            h0.e r2 = r1.f3239e
            float r3 = r1.f3245k
            int[] r4 = r0.f3273c0
            r4 = r4[r39]
            r8 = 2
            if (r4 != r8) goto L_0x0151
            r4 = 1
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            if (r39 != 0) goto L_0x016d
            int r5 = r2.X
            r6 = 1
            if (r5 != 0) goto L_0x015c
            r20 = 1
            goto L_0x015e
        L_0x015c:
            r20 = 0
        L_0x015e:
            if (r5 != r6) goto L_0x0163
            r17 = r6
            goto L_0x0165
        L_0x0163:
            r17 = 0
        L_0x0165:
            if (r5 != r8) goto L_0x016a
            r5 = r20
            goto L_0x0182
        L_0x016a:
            r5 = r20
            goto L_0x018c
        L_0x016d:
            r6 = 1
            int r5 = r2.Y
            if (r5 != 0) goto L_0x0175
            r17 = r6
            goto L_0x0177
        L_0x0175:
            r17 = 0
        L_0x0177:
            if (r5 != r6) goto L_0x017b
            r6 = 1
            goto L_0x017c
        L_0x017b:
            r6 = 0
        L_0x017c:
            if (r5 != r8) goto L_0x0188
            r5 = r17
            r17 = r6
        L_0x0182:
            r18 = r17
            r17 = r5
            r5 = 1
            goto L_0x0191
        L_0x0188:
            r5 = r17
            r17 = r6
        L_0x018c:
            r18 = r17
            r17 = r5
            r5 = 0
        L_0x0191:
            r24 = r3
            r8 = r7
            r6 = 0
        L_0x0195:
            h0.d[] r3 = r0.F
            if (r6 != 0) goto L_0x026b
            r27 = r6
            h0.d[] r6 = r8.F
            r6 = r6[r15]
            if (r5 == 0) goto L_0x01a4
            r26 = 1
            goto L_0x01a6
        L_0x01a4:
            r26 = 4
        L_0x01a6:
            int r28 = r6.c()
            r29 = r13
            int[] r13 = r8.f3273c0
            r30 = r14
            r14 = r13[r39]
            r31 = r2
            r2 = 3
            if (r14 != r2) goto L_0x01bf
            int[] r2 = r8.f3282l
            r2 = r2[r39]
            if (r2 != 0) goto L_0x01bf
            r2 = 1
            goto L_0x01c0
        L_0x01bf:
            r2 = 0
        L_0x01c0:
            h0.d r14 = r6.f3264d
            if (r14 == 0) goto L_0x01cc
            if (r8 == r7) goto L_0x01cc
            int r14 = r14.c()
            int r28 = r14 + r28
        L_0x01cc:
            r14 = r28
            if (r5 == 0) goto L_0x01d9
            if (r8 == r7) goto L_0x01d9
            if (r8 == r12) goto L_0x01d9
            r28 = r7
            r26 = 5
            goto L_0x01db
        L_0x01d9:
            r28 = r7
        L_0x01db:
            h0.d r7 = r6.f3264d
            if (r7 == 0) goto L_0x020d
            if (r8 != r12) goto L_0x01ee
            r32 = r12
            g0.j r12 = r6.f3267g
            g0.j r7 = r7.f3267g
            r33 = r1
            r1 = 6
            r10.f(r12, r7, r14, r1)
            goto L_0x01fb
        L_0x01ee:
            r33 = r1
            r32 = r12
            g0.j r1 = r6.f3267g
            g0.j r7 = r7.f3267g
            r12 = 8
            r10.f(r1, r7, r14, r12)
        L_0x01fb:
            if (r2 == 0) goto L_0x0201
            if (r5 != 0) goto L_0x0201
            r1 = 5
            goto L_0x0203
        L_0x0201:
            r1 = r26
        L_0x0203:
            g0.j r2 = r6.f3267g
            h0.d r6 = r6.f3264d
            g0.j r6 = r6.f3267g
            r10.e(r2, r6, r14, r1)
            goto L_0x0211
        L_0x020d:
            r33 = r1
            r32 = r12
        L_0x0211:
            h0.d[] r1 = r8.F
            if (r4 == 0) goto L_0x023e
            int r2 = r8.V
            r6 = 8
            if (r2 == r6) goto L_0x0230
            r2 = r13[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0230
            int r2 = r15 + 1
            r2 = r1[r2]
            g0.j r2 = r2.f3267g
            r6 = r1[r15]
            g0.j r6 = r6.f3267g
            r7 = 5
            r12 = 0
            r10.f(r2, r6, r12, r7)
            goto L_0x0231
        L_0x0230:
            r12 = 0
        L_0x0231:
            r2 = r1[r15]
            g0.j r2 = r2.f3267g
            r3 = r3[r15]
            g0.j r3 = r3.f3267g
            r6 = 8
            r10.f(r2, r3, r12, r6)
        L_0x023e:
            int r2 = r15 + 1
            r1 = r1[r2]
            h0.d r1 = r1.f3264d
            if (r1 == 0) goto L_0x0254
            h0.e r1 = r1.f3262b
            h0.d[] r2 = r1.F
            r2 = r2[r15]
            h0.d r2 = r2.f3264d
            if (r2 == 0) goto L_0x0254
            h0.e r2 = r2.f3262b
            if (r2 == r8) goto L_0x0256
        L_0x0254:
            r1 = r16
        L_0x0256:
            if (r1 == 0) goto L_0x025c
            r8 = r1
            r6 = r27
            goto L_0x025d
        L_0x025c:
            r6 = 1
        L_0x025d:
            r7 = r28
            r13 = r29
            r14 = r30
            r2 = r31
            r12 = r32
            r1 = r33
            goto L_0x0195
        L_0x026b:
            r33 = r1
            r31 = r2
            r28 = r7
            r32 = r12
            r29 = r13
            r30 = r14
            r7 = 5
            if (r9 == 0) goto L_0x02d5
            h0.d[] r1 = r11.F
            int r2 = r15 + 1
            r1 = r1[r2]
            h0.d r1 = r1.f3264d
            if (r1 == 0) goto L_0x02d5
            h0.d[] r1 = r9.F
            r1 = r1[r2]
            int[] r6 = r9.f3273c0
            r6 = r6[r39]
            r8 = 3
            if (r6 != r8) goto L_0x0297
            int[] r6 = r9.f3282l
            r6 = r6[r39]
            if (r6 != 0) goto L_0x0297
            r6 = 1
            goto L_0x0298
        L_0x0297:
            r6 = 0
        L_0x0298:
            if (r6 == 0) goto L_0x02ad
            if (r5 != 0) goto L_0x02ad
            h0.d r6 = r1.f3264d
            h0.e r8 = r6.f3262b
            if (r8 != r0) goto L_0x02ad
            g0.j r8 = r1.f3267g
            g0.j r6 = r6.f3267g
            int r12 = r1.c()
            int r12 = -r12
            r13 = r7
            goto L_0x02bf
        L_0x02ad:
            if (r5 == 0) goto L_0x02c2
            h0.d r6 = r1.f3264d
            h0.e r8 = r6.f3262b
            if (r8 != r0) goto L_0x02c2
            g0.j r8 = r1.f3267g
            g0.j r6 = r6.f3267g
            int r12 = r1.c()
            int r12 = -r12
            r13 = 4
        L_0x02bf:
            r10.e(r8, r6, r12, r13)
        L_0x02c2:
            g0.j r6 = r1.f3267g
            h0.d[] r8 = r11.F
            r2 = r8[r2]
            h0.d r2 = r2.f3264d
            g0.j r2 = r2.f3267g
            int r1 = r1.c()
            int r1 = -r1
            r8 = 6
            r10.g(r6, r2, r1, r8)
        L_0x02d5:
            if (r4 == 0) goto L_0x02ec
            int r1 = r15 + 1
            r2 = r3[r1]
            g0.j r2 = r2.f3267g
            h0.d[] r3 = r11.F
            r1 = r3[r1]
            g0.j r3 = r1.f3267g
            int r1 = r1.c()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x02ec:
            r1 = r33
            java.util.ArrayList r2 = r1.f3242h
            if (r2 == 0) goto L_0x03ff
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x03ff
            boolean r6 = r1.f3248n
            if (r6 == 0) goto L_0x0305
            boolean r6 = r1.f3250p
            if (r6 != 0) goto L_0x0305
            int r6 = r1.f3244j
            float r6 = (float) r6
            goto L_0x0307
        L_0x0305:
            r6 = r24
        L_0x0307:
            r13 = r16
            r8 = 0
            r12 = 0
        L_0x030b:
            if (r12 >= r3) goto L_0x03ff
            java.lang.Object r14 = r2.get(r12)
            h0.e r14 = (h0.e) r14
            float[] r4 = r14.Z
            r4 = r4[r39]
            r19 = 0
            int r22 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            h0.d[] r7 = r14.F
            if (r22 >= 0) goto L_0x0337
            boolean r4 = r1.f3250p
            if (r4 == 0) goto L_0x0333
            int r4 = r15 + 1
            r4 = r7[r4]
            g0.j r4 = r4.f3267g
            r7 = r7[r15]
            g0.j r7 = r7.f3267g
            r0 = 0
            r14 = 4
        L_0x032f:
            r10.e(r4, r7, r0, r14)
            goto L_0x034c
        L_0x0333:
            r0 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0338
        L_0x0337:
            r0 = 4
        L_0x0338:
            r19 = 0
            int r22 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r22 != 0) goto L_0x0354
            int r4 = r15 + 1
            r4 = r7[r4]
            g0.j r4 = r4.f3267g
            r7 = r7[r15]
            g0.j r7 = r7.f3267g
            r0 = 0
            r14 = 8
            goto L_0x032f
        L_0x034c:
            r27 = r2
            r25 = r3
            r19 = 0
            goto L_0x03f3
        L_0x0354:
            r0 = 0
            if (r13 == 0) goto L_0x03e5
            h0.d[] r13 = r13.F
            r0 = r13[r15]
            g0.j r0 = r0.f3267g
            int r25 = r15 + 1
            r13 = r13[r25]
            g0.j r13 = r13.f3267g
            r27 = r2
            r2 = r7[r15]
            g0.j r2 = r2.f3267g
            r7 = r7[r25]
            g0.j r7 = r7.f3267g
            r25 = r3
            g0.c r3 = r38.l()
            r33 = r14
            r14 = 0
            r3.f2786b = r14
            int r19 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r19 == 0) goto L_0x03c5
            int r19 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r19 != 0) goto L_0x0383
            goto L_0x03c5
        L_0x0383:
            r19 = 0
            int r34 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r34 != 0) goto L_0x0396
            g0.b r2 = r3.f2788d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.h(r0, r7)
            g0.b r0 = r3.f2788d
            r0.h(r13, r14)
            goto L_0x03a6
        L_0x0396:
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r22 != 0) goto L_0x03a9
            g0.b r0 = r3.f2788d
            r0.h(r2, r14)
            g0.b r0 = r3.f2788d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.h(r7, r2)
        L_0x03a6:
            r22 = r4
            goto L_0x03e1
        L_0x03a9:
            float r8 = r8 / r6
            float r22 = r4 / r6
            float r8 = r8 / r22
            r22 = r4
            g0.b r4 = r3.f2788d
            r4.h(r0, r14)
            g0.b r0 = r3.f2788d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.h(r13, r4)
            g0.b r0 = r3.f2788d
            r0.h(r7, r8)
            g0.b r0 = r3.f2788d
            float r14 = -r8
            goto L_0x03de
        L_0x03c5:
            r22 = r4
            r4 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            g0.b r8 = r3.f2788d
            r8.h(r0, r14)
            g0.b r0 = r3.f2788d
            r0.h(r13, r4)
            g0.b r0 = r3.f2788d
            r0.h(r7, r14)
            g0.b r0 = r3.f2788d
            r14 = r4
        L_0x03de:
            r0.h(r2, r14)
        L_0x03e1:
            r10.c(r3)
            goto L_0x03ef
        L_0x03e5:
            r27 = r2
            r25 = r3
            r22 = r4
            r33 = r14
            r19 = 0
        L_0x03ef:
            r8 = r22
            r13 = r33
        L_0x03f3:
            int r12 = r12 + 1
            r3 = r25
            r2 = r27
            r4 = 1
            r7 = 5
            r0 = r37
            goto L_0x030b
        L_0x03ff:
            if (r32 == 0) goto L_0x046a
            r0 = r32
            if (r0 == r9) goto L_0x040f
            if (r5 == 0) goto L_0x0408
            goto L_0x040f
        L_0x0408:
            r12 = r9
            r14 = r23
            r7 = r28
            goto L_0x0471
        L_0x040f:
            r7 = r28
            h0.d[] r1 = r7.F
            r1 = r1[r15]
            h0.d[] r2 = r11.F
            int r3 = r15 + 1
            r2 = r2[r3]
            h0.d r1 = r1.f3264d
            if (r1 == 0) goto L_0x0423
            g0.j r1 = r1.f3267g
            r4 = r1
            goto L_0x0425
        L_0x0423:
            r4 = r16
        L_0x0425:
            h0.d r1 = r2.f3264d
            if (r1 == 0) goto L_0x042d
            g0.j r1 = r1.f3267g
            r6 = r1
            goto L_0x042f
        L_0x042d:
            r6 = r16
        L_0x042f:
            h0.d[] r1 = r0.F
            r1 = r1[r15]
            h0.d[] r2 = r9.F
            r2 = r2[r3]
            if (r4 == 0) goto L_0x0461
            if (r6 == 0) goto L_0x0461
            r3 = r31
            if (r39 != 0) goto L_0x0442
            float r3 = r3.S
            goto L_0x0444
        L_0x0442:
            float r3 = r3.T
        L_0x0444:
            r5 = r3
            int r7 = r1.c()
            int r8 = r2.c()
            g0.j r3 = r1.f3267g
            g0.j r12 = r2.f3267g
            r13 = 7
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r12
            r12 = 2
            r12 = r9
            r14 = r23
            r9 = r13
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0464
        L_0x0461:
            r12 = r9
            r14 = r23
        L_0x0464:
            r19 = r11
            r21 = r14
            goto L_0x06a7
        L_0x046a:
            r12 = r9
            r14 = r23
            r7 = r28
            r0 = r32
        L_0x0471:
            if (r17 == 0) goto L_0x0567
            if (r0 == 0) goto L_0x0567
            int r2 = r1.f3244j
            if (r2 <= 0) goto L_0x0480
            int r1 = r1.f3243i
            if (r1 != r2) goto L_0x0480
            r20 = 1
            goto L_0x0482
        L_0x0480:
            r20 = 0
        L_0x0482:
            r9 = r0
            r13 = r9
        L_0x0484:
            if (r13 == 0) goto L_0x0464
            h0.e[] r1 = r13.f3271b0
            r1 = r1[r39]
            r8 = r1
        L_0x048b:
            if (r8 == 0) goto L_0x0498
            int r1 = r8.V
            r6 = 8
            if (r1 != r6) goto L_0x049a
            h0.e[] r1 = r8.f3271b0
            r8 = r1[r39]
            goto L_0x048b
        L_0x0498:
            r6 = 8
        L_0x049a:
            if (r8 != 0) goto L_0x04a7
            if (r13 != r12) goto L_0x049f
            goto L_0x04a7
        L_0x049f:
            r35 = r7
            r21 = r8
            r19 = r9
            goto L_0x0557
        L_0x04a7:
            h0.d[] r1 = r13.F
            r2 = r1[r15]
            g0.j r3 = r2.f3267g
            h0.d r4 = r2.f3264d
            if (r4 == 0) goto L_0x04b4
            g0.j r4 = r4.f3267g
            goto L_0x04b6
        L_0x04b4:
            r4 = r16
        L_0x04b6:
            if (r9 == r13) goto L_0x04bf
            h0.d[] r4 = r9.F
            int r5 = r15 + 1
            r4 = r4[r5]
            goto L_0x04cb
        L_0x04bf:
            if (r13 != r0) goto L_0x04d0
            if (r9 != r13) goto L_0x04d0
            h0.d[] r4 = r7.F
            r4 = r4[r15]
            h0.d r4 = r4.f3264d
            if (r4 == 0) goto L_0x04ce
        L_0x04cb:
            g0.j r4 = r4.f3267g
            goto L_0x04d0
        L_0x04ce:
            r4 = r16
        L_0x04d0:
            int r2 = r2.c()
            int r5 = r15 + 1
            r19 = r1[r5]
            int r19 = r19.c()
            if (r8 == 0) goto L_0x04e9
            h0.d[] r6 = r8.F
            r6 = r6[r15]
            r28 = r7
            g0.j r7 = r6.f3267g
            r1 = r1[r5]
            goto L_0x04fa
        L_0x04e9:
            r28 = r7
            h0.d[] r6 = r11.F
            r6 = r6[r5]
            h0.d r6 = r6.f3264d
            if (r6 == 0) goto L_0x04f6
            g0.j r7 = r6.f3267g
            goto L_0x04f8
        L_0x04f6:
            r7 = r16
        L_0x04f8:
            r1 = r1[r5]
        L_0x04fa:
            g0.j r1 = r1.f3267g
            if (r6 == 0) goto L_0x0504
            int r6 = r6.c()
            int r19 = r6 + r19
        L_0x0504:
            if (r9 == 0) goto L_0x050f
            h0.d[] r6 = r9.F
            r6 = r6[r5]
            int r6 = r6.c()
            int r2 = r2 + r6
        L_0x050f:
            if (r3 == 0) goto L_0x0551
            if (r4 == 0) goto L_0x0551
            if (r7 == 0) goto L_0x0551
            if (r1 == 0) goto L_0x0551
            if (r13 != r0) goto L_0x0521
            h0.d[] r2 = r0.F
            r2 = r2[r15]
            int r2 = r2.c()
        L_0x0521:
            r6 = r2
            if (r13 != r12) goto L_0x052e
            h0.d[] r2 = r12.F
            r2 = r2[r5]
            int r2 = r2.c()
            r19 = r2
        L_0x052e:
            if (r20 == 0) goto L_0x0533
            r22 = 8
            goto L_0x0535
        L_0x0533:
            r22 = 5
        L_0x0535:
            r5 = 1056964608(0x3f000000, float:0.5)
            r23 = r1
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r6
            r21 = 8
            r6 = r7
            r35 = r28
            r7 = r23
            r21 = r8
            r8 = r19
            r19 = r9
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0557
        L_0x0551:
            r21 = r8
            r19 = r9
            r35 = r28
        L_0x0557:
            int r1 = r13.V
            r9 = 8
            if (r1 == r9) goto L_0x055e
            goto L_0x0560
        L_0x055e:
            r13 = r19
        L_0x0560:
            r9 = r13
            r13 = r21
            r7 = r35
            goto L_0x0484
        L_0x0567:
            r35 = r7
            r9 = 8
            if (r18 == 0) goto L_0x0464
            if (r0 == 0) goto L_0x0464
            int r2 = r1.f3244j
            if (r2 <= 0) goto L_0x057a
            int r1 = r1.f3243i
            if (r1 != r2) goto L_0x057a
            r20 = 1
            goto L_0x057c
        L_0x057a:
            r20 = 0
        L_0x057c:
            r8 = r0
            r13 = r8
        L_0x057e:
            if (r13 == 0) goto L_0x063b
            h0.e[] r1 = r13.f3271b0
            r1 = r1[r39]
        L_0x0584:
            if (r1 == 0) goto L_0x058f
            int r2 = r1.V
            if (r2 != r9) goto L_0x058f
            h0.e[] r1 = r1.f3271b0
            r1 = r1[r39]
            goto L_0x0584
        L_0x058f:
            if (r13 == r0) goto L_0x0626
            if (r13 == r12) goto L_0x0626
            if (r1 == 0) goto L_0x0626
            if (r1 != r12) goto L_0x059a
            r7 = r16
            goto L_0x059b
        L_0x059a:
            r7 = r1
        L_0x059b:
            h0.d[] r1 = r13.F
            r2 = r1[r15]
            g0.j r3 = r2.f3267g
            h0.d[] r4 = r8.F
            int r5 = r15 + 1
            r4 = r4[r5]
            g0.j r4 = r4.f3267g
            int r2 = r2.c()
            r6 = r1[r5]
            int r6 = r6.c()
            if (r7 == 0) goto L_0x05c7
            h0.d[] r1 = r7.F
            r1 = r1[r15]
            g0.j r9 = r1.f3267g
            r19 = r7
            h0.d r7 = r1.f3264d
            if (r7 == 0) goto L_0x05c4
            g0.j r7 = r7.f3267g
            goto L_0x05dd
        L_0x05c4:
            r7 = r16
            goto L_0x05dd
        L_0x05c7:
            r19 = r7
            h0.d[] r7 = r12.F
            r7 = r7[r15]
            if (r7 == 0) goto L_0x05d2
            g0.j r9 = r7.f3267g
            goto L_0x05d4
        L_0x05d2:
            r9 = r16
        L_0x05d4:
            r1 = r1[r5]
            g0.j r1 = r1.f3267g
            r36 = r7
            r7 = r1
            r1 = r36
        L_0x05dd:
            if (r1 == 0) goto L_0x05e7
            int r1 = r1.c()
            int r1 = r1 + r6
            r21 = r1
            goto L_0x05e9
        L_0x05e7:
            r21 = r6
        L_0x05e9:
            h0.d[] r1 = r8.F
            r1 = r1[r5]
            int r1 = r1.c()
            int r5 = r1 + r2
            if (r20 == 0) goto L_0x05f8
            r22 = 8
            goto L_0x05fa
        L_0x05f8:
            r22 = 4
        L_0x05fa:
            if (r3 == 0) goto L_0x061b
            if (r4 == 0) goto L_0x061b
            if (r9 == 0) goto L_0x061b
            if (r7 == 0) goto L_0x061b
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r38
            r2 = r3
            r23 = 4
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r24 = r8
            r8 = r21
            r21 = r14
            r14 = 8
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0623
        L_0x061b:
            r24 = r8
            r21 = r14
            r14 = 8
            r23 = 4
        L_0x0623:
            r1 = r19
            goto L_0x062d
        L_0x0626:
            r24 = r8
            r21 = r14
            r23 = 4
            r14 = r9
        L_0x062d:
            int r2 = r13.V
            if (r2 == r14) goto L_0x0633
            r8 = r13
            goto L_0x0635
        L_0x0633:
            r8 = r24
        L_0x0635:
            r13 = r1
            r9 = r14
            r14 = r21
            goto L_0x057e
        L_0x063b:
            r21 = r14
            h0.d[] r1 = r0.F
            r1 = r1[r15]
            r2 = r35
            h0.d[] r2 = r2.F
            r2 = r2[r15]
            h0.d r2 = r2.f3264d
            h0.d[] r3 = r12.F
            int r4 = r15 + 1
            r13 = r3[r4]
            h0.d[] r3 = r11.F
            r3 = r3[r4]
            h0.d r14 = r3.f3264d
            if (r2 == 0) goto L_0x0694
            if (r0 == r12) goto L_0x0666
            g0.j r3 = r1.f3267g
            g0.j r2 = r2.f3267g
            int r1 = r1.c()
            r9 = 5
            r10.e(r3, r2, r1, r9)
            goto L_0x0690
        L_0x0666:
            r9 = 5
            if (r14 == 0) goto L_0x0690
            g0.j r3 = r1.f3267g
            g0.j r4 = r2.f3267g
            int r5 = r1.c()
            r6 = 1056964608(0x3f000000, float:0.5)
            g0.j r7 = r13.f3267g
            g0.j r8 = r14.f3267g
            int r19 = r13.c()
            r20 = 5
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r19
            r19 = r11
            r11 = r9
            r9 = r20
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0697
        L_0x0690:
            r19 = r11
            r11 = r9
            goto L_0x0697
        L_0x0694:
            r19 = r11
            r11 = 5
        L_0x0697:
            if (r14 == 0) goto L_0x06a7
            if (r0 == r12) goto L_0x06a7
            g0.j r1 = r13.f3267g
            g0.j r2 = r14.f3267g
            int r3 = r13.c()
            int r3 = -r3
            r10.e(r1, r2, r3, r11)
        L_0x06a7:
            if (r17 != 0) goto L_0x06ab
            if (r18 == 0) goto L_0x0702
        L_0x06ab:
            if (r0 == 0) goto L_0x0702
            if (r0 == r12) goto L_0x0702
            h0.d[] r1 = r0.F
            r2 = r1[r15]
            h0.d[] r3 = r12.F
            int r4 = r15 + 1
            r3 = r3[r4]
            h0.d r5 = r2.f3264d
            if (r5 == 0) goto L_0x06c0
            g0.j r5 = r5.f3267g
            goto L_0x06c2
        L_0x06c0:
            r5 = r16
        L_0x06c2:
            h0.d r6 = r3.f3264d
            if (r6 == 0) goto L_0x06c9
            g0.j r6 = r6.f3267g
            goto L_0x06cb
        L_0x06c9:
            r6 = r16
        L_0x06cb:
            r7 = r19
            if (r7 == r12) goto L_0x06dd
            h0.d[] r6 = r7.F
            r6 = r6[r4]
            h0.d r6 = r6.f3264d
            if (r6 == 0) goto L_0x06db
            g0.j r6 = r6.f3267g
            r16 = r6
        L_0x06db:
            r6 = r16
        L_0x06dd:
            if (r0 != r12) goto L_0x06e1
            r3 = r1[r4]
        L_0x06e1:
            if (r5 == 0) goto L_0x0702
            if (r6 == 0) goto L_0x0702
            r0 = 1056964608(0x3f000000, float:0.5)
            int r7 = r2.c()
            h0.d[] r1 = r12.F
            r1 = r1[r4]
            int r8 = r1.c()
            g0.j r2 = r2.f3267g
            g0.j r9 = r3.f3267g
            r11 = 5
            r1 = r38
            r3 = r5
            r4 = r7
            r5 = r0
            r7 = r9
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0702:
            int r9 = r21 + 1
            r11 = 2
            r0 = r37
            r13 = r29
            r14 = r30
            goto L_0x0017
        L_0x070d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.b(h0.f, g0.e, int):void");
    }

    public static final boolean c(int i3, int i6, int i7, byte[] bArr, byte[] bArr2) {
        o.m(bArr, "a");
        o.m(bArr2, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i8 + i3] != bArr2[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static final int d(int[] iArr, int i3) {
        int length = iArr.length - 1;
        int i6 = 0;
        while (i6 <= length) {
            int i7 = (i6 + length) >>> 1;
            int i8 = iArr[i7];
            if (i3 > i8) {
                i6 = i7 + 1;
            } else if (i3 >= i8) {
                return i7;
            } else {
                length = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final void e(View view) {
        o.m(view, "<this>");
        b1 b1Var = new b1(view, (d) null);
        g gVar = new g();
        gVar.f5352g = v.q(gVar, gVar, b1Var);
        while (gVar.hasNext()) {
            View view2 = (View) gVar.next();
            d1.a aVar = (d1.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new d1.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f2145a;
            int v5 = v.v(arrayList);
            if (-1 < v5) {
                m.o(arrayList.get(v5));
                throw null;
            }
        }
    }

    public static boolean f(f[] fVarArr, f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            f fVar = fVarArr[i3];
            char c6 = fVar.f4874a;
            f fVar2 = fVarArr2[i3];
            if (c6 != fVar2.f4874a || fVar.f4875b.length != fVar2.f4875b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void g(long j6, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j6 || j6 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static float[] i(float[] fArr, int i3) {
        if (i3 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i6 = i3 - 0;
                int min = Math.min(i6, length - 0);
                float[] fArr2 = new float[i6];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b A[EDGE_INSN: B:27:0x004b->B:16:0x004b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.m j(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000c
            androidx.emoji2.text.d r0 = new androidx.emoji2.text.d
            r0.<init>()
            goto L_0x0011
        L_0x000c:
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r0.<init>()
        L_0x0011:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            w4.p.f(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L_0x0046
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x0046
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r7 = r3
        L_0x0047:
            if (r7 == 0) goto L_0x002a
            goto L_0x004b
        L_0x004a:
            r4 = r5
        L_0x004b:
            if (r4 != 0) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.Signature[] r0 = r0.r(r1, r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0076 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0076 }
        L_0x005c:
            if (r3 >= r6) goto L_0x006a
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0076 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0076 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0076 }
            int r3 = r3 + 1
            goto L_0x005c
        L_0x006a:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0076 }
            androidx.appcompat.widget.r r1 = new androidx.appcompat.widget.r     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x007d
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L_0x007c:
            r1 = r5
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            goto L_0x0085
        L_0x0080:
            androidx.emoji2.text.m r5 = new androidx.emoji2.text.m
            r5.<init>(r8, r1)
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.j(android.content.Context):androidx.emoji2.text.m");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static q0.f[] k(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r9 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r9 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r9 = r3 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r3] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r3 = r9
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r9 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = i(r5, r3)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = a2.m.i(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            q0.f r3 = new q0.f
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            q0.f r3 = new q0.f
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            q0.f[] r0 = new q0.f[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            q0.f[] r0 = (q0.f[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.k(java.lang.String):q0.f[]");
    }

    public static Path l(String str) {
        Path path = new Path();
        f[] k6 = k(str);
        if (k6 == null) {
            return null;
        }
        try {
            f.b(k6, path);
            return path;
        } catch (RuntimeException e6) {
            throw new RuntimeException("Error in parsing " + str, e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = -1
            r6 = r17
            r7 = r4
            r8 = r5
            r9 = r8
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = v4.i.j0(r1, r14, r6, r4)
            if (r14 == 0) goto L_0x0033
            if (r8 == r5) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = v4.i.j0(r1, r11, r6, r4)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = v4.i.j0(r1, r11, r6, r4)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r0) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r4
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r1.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r4
            r14 = r9
        L_0x0061:
            if (r14 >= r0) goto L_0x008b
            char r4 = r1.charAt(r14)
            r2 = 48
            int r16 = b1.o.o(r4, r2)
            if (r16 < 0) goto L_0x008b
            r5 = 57
            int r5 = b1.o.o(r4, r5)
            if (r5 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r4
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r0) goto L_0x00c2
            char r4 = r1.charAt(r6)
            int r4 = a5.c.o(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r13) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.m(int, int, java.lang.String):java.net.InetAddress");
    }

    public static f[] n(f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            fVarArr2[i3] = new f(fVarArr[i3]);
        }
        return fVarArr2;
    }

    public static int o(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(m.g("type needs to be >= FIRST and <= LAST, type=", i3));
    }

    public static /* synthetic */ x p(i0 i0Var, boolean z5, m0 m0Var, int i3) {
        boolean z6 = false;
        if ((i3 & 1) != 0) {
            z5 = false;
        }
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        return ((q0) i0Var).F(z5, z6, m0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z4.c q(z4.r r27) {
        /*
            r0 = r27
            java.lang.String r1 = "headers"
            b1.o.m(r0, r1)
            java.lang.String[] r1 = r0.f6060d
            int r1 = r1.length
            r2 = 2
            int r1 = r1 / r2
            r4 = 0
            r7 = r4
            r11 = r7
            r12 = r11
            r15 = r12
            r16 = r15
            r17 = r16
            r20 = r17
            r21 = r20
            r22 = r21
            r8 = 1
            r9 = 0
            r13 = -1
            r14 = -1
            r18 = -1
            r19 = -1
        L_0x0023:
            if (r7 >= r1) goto L_0x01d5
            java.lang.String r10 = r0.b(r7)
            java.lang.String r5 = r0.d(r7)
            java.lang.String r6 = "Cache-Control"
            boolean r6 = v4.i.T(r10, r6)
            if (r6 == 0) goto L_0x003a
            if (r9 == 0) goto L_0x0038
            goto L_0x0042
        L_0x0038:
            r9 = r5
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "Pragma"
            boolean r6 = v4.i.T(r10, r6)
            if (r6 == 0) goto L_0x01c6
        L_0x0042:
            r8 = r4
        L_0x0043:
            r6 = r4
        L_0x0044:
            int r10 = r5.length()
            if (r6 >= r10) goto L_0x01bd
            int r10 = r5.length()
            r3 = r6
        L_0x004f:
            if (r3 >= r10) goto L_0x006c
            char r0 = r5.charAt(r3)
            r24 = r1
            java.lang.String r1 = "=,;"
            int r0 = v4.i.X(r1, r0, r4, r4, r2)
            if (r0 < 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = r4
        L_0x0062:
            if (r0 == 0) goto L_0x0065
            goto L_0x0072
        L_0x0065:
            int r3 = r3 + 1
            r0 = r27
            r1 = r24
            goto L_0x004f
        L_0x006c:
            r24 = r1
            int r3 = r5.length()
        L_0x0072:
            java.lang.String r0 = r5.substring(r6, r3)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            b1.o.l(r0, r1)
            java.lang.CharSequence r0 = v4.i.n0(r0)
            java.lang.String r0 = r0.toString()
            int r6 = r5.length()
            if (r3 == r6) goto L_0x011c
            char r6 = r5.charAt(r3)
            r10 = 44
            if (r6 == r10) goto L_0x011c
            char r6 = r5.charAt(r3)
            r10 = 59
            if (r6 != r10) goto L_0x009b
            goto L_0x011c
        L_0x009b:
            int r3 = r3 + 1
            byte[] r6 = a5.c.f212a
            int r6 = r5.length()
        L_0x00a3:
            if (r3 >= r6) goto L_0x00b6
            char r10 = r5.charAt(r3)
            r2 = 32
            if (r10 == r2) goto L_0x00b2
            r2 = 9
            if (r10 == r2) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x00a3
        L_0x00b6:
            int r3 = r5.length()
        L_0x00ba:
            int r2 = r5.length()
            if (r3 >= r2) goto L_0x00dd
            char r2 = r5.charAt(r3)
            r6 = 34
            if (r2 != r6) goto L_0x00dd
            int r3 = r3 + 1
            r2 = 4
            int r2 = v4.i.X(r5, r6, r3, r4, r2)
            java.lang.String r3 = r5.substring(r3, r2)
            b1.o.l(r3, r1)
            r6 = 1
            int r2 = r2 + r6
            r6 = r2
            r26 = r9
            r9 = 2
            goto L_0x0123
        L_0x00dd:
            r6 = 1
            int r2 = r5.length()
            r10 = r3
        L_0x00e3:
            if (r10 >= r2) goto L_0x0104
            char r6 = r5.charAt(r10)
            r25 = r2
            java.lang.String r2 = ",;"
            r26 = r9
            r9 = 2
            int r2 = v4.i.X(r2, r6, r4, r4, r9)
            if (r2 < 0) goto L_0x00f8
            r2 = 1
            goto L_0x00f9
        L_0x00f8:
            r2 = r4
        L_0x00f9:
            if (r2 == 0) goto L_0x00fc
            goto L_0x010b
        L_0x00fc:
            int r10 = r10 + 1
            r2 = r25
            r9 = r26
            r6 = 1
            goto L_0x00e3
        L_0x0104:
            r26 = r9
            r9 = 2
            int r10 = r5.length()
        L_0x010b:
            java.lang.String r2 = r5.substring(r3, r10)
            b1.o.l(r2, r1)
            java.lang.CharSequence r1 = v4.i.n0(r2)
            java.lang.String r3 = r1.toString()
            r6 = r10
            goto L_0x0123
        L_0x011c:
            r26 = r9
            r9 = r2
            int r3 = r3 + 1
            r6 = r3
            r3 = 0
        L_0x0123:
            java.lang.String r1 = "no-cache"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x012d
            r11 = 1
            goto L_0x0183
        L_0x012d:
            java.lang.String r1 = "no-store"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0137
            r12 = 1
            goto L_0x0183
        L_0x0137:
            java.lang.String r1 = "max-age"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0146
            r1 = -1
            int r13 = a5.c.v(r1, r3)
            goto L_0x01b4
        L_0x0146:
            r1 = -1
            java.lang.String r2 = "s-maxage"
            boolean r2 = v4.i.T(r2, r0)
            if (r2 == 0) goto L_0x0154
            int r14 = a5.c.v(r1, r3)
            goto L_0x01b4
        L_0x0154:
            java.lang.String r1 = "private"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x015e
            r15 = 1
            goto L_0x0183
        L_0x015e:
            java.lang.String r1 = "public"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0169
            r16 = 1
            goto L_0x0183
        L_0x0169:
            java.lang.String r1 = "must-revalidate"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0174
            r17 = 1
            goto L_0x0183
        L_0x0174:
            java.lang.String r1 = "max-stale"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0185
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r18 = a5.c.v(r0, r3)
        L_0x0183:
            r1 = -1
            goto L_0x01b4
        L_0x0185:
            java.lang.String r1 = "min-fresh"
            boolean r1 = v4.i.T(r1, r0)
            if (r1 == 0) goto L_0x0193
            r1 = -1
            int r19 = a5.c.v(r1, r3)
            goto L_0x01b4
        L_0x0193:
            r1 = -1
            java.lang.String r2 = "only-if-cached"
            boolean r2 = v4.i.T(r2, r0)
            if (r2 == 0) goto L_0x019f
            r20 = 1
            goto L_0x01b4
        L_0x019f:
            java.lang.String r2 = "no-transform"
            boolean r2 = v4.i.T(r2, r0)
            if (r2 == 0) goto L_0x01aa
            r21 = 1
            goto L_0x01b4
        L_0x01aa:
            java.lang.String r2 = "immutable"
            boolean r0 = v4.i.T(r2, r0)
            if (r0 == 0) goto L_0x01b4
            r22 = 1
        L_0x01b4:
            r0 = r27
            r2 = r9
            r1 = r24
            r9 = r26
            goto L_0x0044
        L_0x01bd:
            r24 = r1
            r26 = r9
            r1 = -1
            r9 = r2
            r5 = r26
            goto L_0x01cb
        L_0x01c6:
            r24 = r1
            r5 = r9
            r1 = -1
            r9 = r2
        L_0x01cb:
            int r7 = r7 + 1
            r0 = r27
            r2 = r9
            r1 = r24
            r9 = r5
            goto L_0x0023
        L_0x01d5:
            r5 = r9
            if (r8 != 0) goto L_0x01db
            r23 = 0
            goto L_0x01dd
        L_0x01db:
            r23 = r5
        L_0x01dd:
            z4.c r0 = new z4.c
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.q(z4.r):z4.c");
    }

    public static g1.b r(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        androidx.emoji2.text.v vVar = new androidx.emoji2.text.v(0, duplicate);
        vVar.h(4);
        ByteBuffer byteBuffer = vVar.f1052a;
        short s5 = byteBuffer.getShort() & 65535;
        if (s5 <= 100) {
            vVar.h(6);
            int i3 = 0;
            while (true) {
                if (i3 >= s5) {
                    j6 = -1;
                    break;
                }
                int i6 = byteBuffer.getInt();
                vVar.h(4);
                j6 = vVar.g();
                vVar.h(4);
                if (1835365473 == i6) {
                    break;
                }
                i3++;
            }
            if (j6 != -1) {
                vVar.h((int) (j6 - ((long) byteBuffer.position())));
                vVar.h(12);
                long g6 = vVar.g();
                for (int i7 = 0; ((long) i7) < g6; i7++) {
                    int i8 = byteBuffer.getInt();
                    long g7 = vVar.g();
                    vVar.g();
                    if (1164798569 == i8 || 1701669481 == i8) {
                        duplicate.position((int) (g7 + j6));
                        g1.b bVar = new g1.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0080 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long s(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            int r5 = kotlinx.coroutines.internal.s.f4004a
            java.lang.String r6 = java.lang.System.getProperty(r21)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r5 = r22
            goto L_0x00a7
        L_0x0014:
            r7 = 10
            b1.v.g(r7)
            int r8 = r6.length()
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x0022
            goto L_0x0078
        L_0x0022:
            char r11 = r6.charAt(r9)
            r12 = 48
            int r12 = b1.o.o(r11, r12)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 >= 0) goto L_0x0045
            if (r8 != r10) goto L_0x0036
            goto L_0x0078
        L_0x0036:
            r12 = 45
            if (r11 != r12) goto L_0x003e
            r13 = -9223372036854775808
            r11 = r10
            goto L_0x0046
        L_0x003e:
            r12 = 43
            if (r11 != r12) goto L_0x0078
            r12 = r9
            r11 = r10
            goto L_0x0047
        L_0x0045:
            r11 = r9
        L_0x0046:
            r12 = r11
        L_0x0047:
            r15 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r17 = 0
            r9 = r17
            r17 = r15
        L_0x0052:
            if (r11 >= r8) goto L_0x0080
            char r5 = r6.charAt(r11)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x006f
            int r17 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x0078
            long r3 = (long) r7
            long r17 = r13 / r3
            int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            long r3 = (long) r7
            long r9 = r9 * r3
            long r3 = (long) r5
            long r19 = r13 + r3
            int r5 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x008c
        L_0x007a:
            long r9 = r9 - r3
            int r11 = r11 + 1
            r3 = r26
            goto L_0x0052
        L_0x0080:
            if (r12 == 0) goto L_0x0087
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            goto L_0x008c
        L_0x0087:
            long r3 = -r9
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L_0x008c:
            r3 = 39
            java.lang.String r4 = "System property '"
            if (r5 == 0) goto L_0x00d9
            long r5 = r5.longValue()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00a2
            r7 = r26
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a2:
            r7 = r26
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 == 0) goto L_0x00a8
        L_0x00a7:
            return r5
        L_0x00a8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r4)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r5)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00d9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.s(java.lang.String, long, long, long):long");
    }

    public static int t(String str, int i3, int i6, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i6 = 1;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return (int) s(str, (long) i3, (long) i6, (long) i7);
    }

    public static c u(int i3, s2.a aVar) {
        return new c(new w0.d(i3), (Object) aVar, f1707c);
    }

    public static final String v(String str) {
        o.m(str, "$this$toCanonicalHost");
        int i3 = 0;
        int i6 = -1;
        if (i.R(str, ":")) {
            InetAddress m6 = (!i.k0(str, "[", false) || !str.endsWith("]")) ? m(0, str.length(), str) : m(1, str.length() - 1, str);
            if (m6 == null) {
                return null;
            }
            byte[] address = m6.getAddress();
            if (address.length == 16) {
                int i7 = 0;
                int i8 = 0;
                while (i7 < address.length) {
                    int i9 = i7;
                    while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                        i9 += 2;
                    }
                    int i10 = i9 - i7;
                    if (i10 > i8 && i10 >= 4) {
                        i6 = i7;
                        i8 = i10;
                    }
                    i7 = i9 + 2;
                }
                l5.g gVar = new l5.g();
                while (i3 < address.length) {
                    if (i3 == i6) {
                        gVar.G(58);
                        i3 += i8;
                        if (i3 == 16) {
                            gVar.G(58);
                        }
                    } else {
                        if (i3 > 0) {
                            gVar.G(58);
                        }
                        byte b6 = address[i3];
                        byte[] bArr = a5.c.f212a;
                        gVar.H((long) (((b6 & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return gVar.p(gVar.f4128e, v4.a.f5409a);
            } else if (address.length == 4) {
                return m6.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                o.l(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                o.l(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                o.l(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i11);
                    if (o.o(charAt, 31) <= 0) {
                        break;
                    } else if (o.o(charAt, 127) >= 0) {
                        break;
                    } else if (i.X(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i11++;
                    }
                }
                i3 = 1;
                if (i3 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public abstract List h(String str, List list);
}
