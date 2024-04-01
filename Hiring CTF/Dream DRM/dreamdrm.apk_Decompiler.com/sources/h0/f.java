package h0;

import androidx.activity.result.c;
import g.h;
import g0.j;
import i0.e;
import java.util.ArrayList;
import java.util.Arrays;

public final class f extends e {

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f3296d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public final c f3297e0 = new c(this);
    public final e f0 = new e(this);

    /* renamed from: g0  reason: collision with root package name */
    public j0.e f3298g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3299h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public final g0.e f3300i0 = new g0.e();

    /* renamed from: j0  reason: collision with root package name */
    public int f3301j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3302k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3303l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3304m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public b[] f3305n0 = new b[4];

    /* renamed from: o0  reason: collision with root package name */
    public b[] f3306o0 = new b[4];

    /* renamed from: p0  reason: collision with root package name */
    public int f3307p0 = 263;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f3308q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f3309r0 = false;

    public final void B(e eVar, int i3) {
        if (i3 == 0) {
            int i6 = this.f3303l0 + 1;
            b[] bVarArr = this.f3306o0;
            if (i6 >= bVarArr.length) {
                this.f3306o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f3306o0;
            int i7 = this.f3303l0;
            bVarArr2[i7] = new b(eVar, 0, this.f3299h0);
            this.f3303l0 = i7 + 1;
        } else if (i3 == 1) {
            int i8 = this.f3304m0 + 1;
            b[] bVarArr3 = this.f3305n0;
            if (i8 >= bVarArr3.length) {
                this.f3305n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f3305n0;
            int i9 = this.f3304m0;
            bVarArr4[i9] = new b(eVar, 1, this.f3299h0);
            this.f3304m0 = i9 + 1;
        }
    }

    public final void C(g0.e eVar) {
        b(eVar);
        int size = this.f3296d0.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            e eVar2 = (e) this.f3296d0.get(i3);
            boolean[] zArr = eVar2.H;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar2 instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar3 = (e) this.f3296d0.get(i6);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    for (int i7 = 0; i7 < aVar.f3353e0; i7++) {
                        e eVar4 = aVar.f3352d0[i7];
                        int i8 = aVar.f0;
                        if (i8 == 0 || i8 == 1) {
                            eVar4.H[0] = true;
                        } else if (i8 == 2 || i8 == 3) {
                            eVar4.H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar5 = (e) this.f3296d0.get(i9);
            eVar5.getClass();
            if ((eVar5 instanceof h) || (eVar5 instanceof i)) {
                eVar5.b(eVar);
            }
        }
        for (int i10 = 0; i10 < size; i10++) {
            e eVar6 = (e) this.f3296d0.get(i10);
            if (eVar6 instanceof f) {
                int[] iArr = eVar6.f3273c0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                if (i11 == 2) {
                    eVar6.w(1);
                }
                if (i12 == 2) {
                    eVar6.x(1);
                }
                eVar6.b(eVar);
                if (i11 == 2) {
                    eVar6.w(i11);
                }
                if (i12 == 2) {
                    eVar6.x(i12);
                }
            } else {
                eVar6.f3278h = -1;
                eVar6.f3279i = -1;
                int[] iArr2 = this.f3273c0;
                int i13 = iArr2[0];
                int[] iArr3 = eVar6.f3273c0;
                if (i13 != 2 && iArr3[0] == 4) {
                    d dVar = eVar6.f3293x;
                    int i14 = dVar.f3265e;
                    int l6 = l();
                    d dVar2 = eVar6.f3295z;
                    int i15 = l6 - dVar2.f3265e;
                    dVar.f3267g = eVar.k(dVar);
                    dVar2.f3267g = eVar.k(dVar2);
                    eVar.d(dVar.f3267g, i14);
                    eVar.d(dVar2.f3267g, i15);
                    eVar6.f3278h = 2;
                    eVar6.N = i14;
                    int i16 = i15 - i14;
                    eVar6.J = i16;
                    int i17 = eVar6.Q;
                    if (i16 < i17) {
                        eVar6.J = i17;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    d dVar3 = eVar6.f3294y;
                    int i18 = dVar3.f3265e;
                    int j6 = j();
                    d dVar4 = eVar6.A;
                    int i19 = j6 - dVar4.f3265e;
                    dVar3.f3267g = eVar.k(dVar3);
                    dVar4.f3267g = eVar.k(dVar4);
                    eVar.d(dVar3.f3267g, i18);
                    eVar.d(dVar4.f3267g, i19);
                    if (eVar6.P > 0 || eVar6.V == 8) {
                        d dVar5 = eVar6.B;
                        j k6 = eVar.k(dVar5);
                        dVar5.f3267g = k6;
                        eVar.d(k6, eVar6.P + i18);
                    }
                    eVar6.f3279i = 2;
                    eVar6.O = i18;
                    int i20 = i19 - i18;
                    eVar6.K = i20;
                    int i21 = eVar6.R;
                    if (i20 < i21) {
                        eVar6.K = i21;
                    }
                }
                if (!((eVar6 instanceof h) || (eVar6 instanceof i))) {
                    eVar6.b(eVar);
                }
            }
        }
        if (this.f3303l0 > 0) {
            com.bumptech.glide.e.b(this, eVar, 0);
        }
        if (this.f3304m0 > 0) {
            com.bumptech.glide.e.b(this, eVar, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0113 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(int r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            r2 = r19 & 1
            r3 = r17
            i0.e r4 = r3.f0
            h0.f r5 = r4.f3519a
            r6 = 0
            int r7 = r5.i(r6)
            int r8 = r5.i(r1)
            int r9 = r5.m()
            int r10 = r5.n()
            java.util.ArrayList r11 = r4.f3523e
            i0.j r12 = r5.f3274d
            i0.l r13 = r5.f3275e
            if (r2 == 0) goto L_0x007b
            r14 = 2
            if (r7 == r14) goto L_0x0029
            if (r8 != r14) goto L_0x007b
        L_0x0029:
            java.util.Iterator r15 = r11.iterator()
        L_0x002d:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x004a
            java.lang.Object r16 = r15.next()
            r6 = r16
            i0.m r6 = (i0.m) r6
            int r1 = r6.f3550f
            if (r1 != r0) goto L_0x0047
            boolean r1 = r6.k()
            if (r1 != 0) goto L_0x0047
            r2 = 0
            goto L_0x004a
        L_0x0047:
            r1 = 1
            r6 = 0
            goto L_0x002d
        L_0x004a:
            if (r0 != 0) goto L_0x0063
            if (r2 == 0) goto L_0x007b
            if (r7 != r14) goto L_0x007b
            r1 = 1
            r5.w(r1)
            r2 = 0
            int r6 = r4.d(r5, r2)
            r5.y(r6)
            i0.g r2 = r12.f3549e
            int r6 = r5.l()
            goto L_0x0078
        L_0x0063:
            r1 = 1
            if (r2 == 0) goto L_0x007b
            if (r8 != r14) goto L_0x007b
            r5.x(r1)
            int r2 = r4.d(r5, r1)
            r5.v(r2)
            i0.g r2 = r13.f3549e
            int r6 = r5.j()
        L_0x0078:
            r2.d(r6)
        L_0x007b:
            r1 = 4
            int[] r2 = r5.f3273c0
            r6 = 0
            if (r0 != 0) goto L_0x009d
            r2 = r2[r6]
            r10 = 1
            if (r2 == r10) goto L_0x008b
            if (r2 != r1) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r9 = 1
            goto L_0x00a5
        L_0x008b:
            int r1 = r5.l()
            int r1 = r1 + r9
            i0.f r2 = r12.f3553i
            r2.d(r1)
            i0.g r2 = r12.f3549e
            int r1 = r1 - r9
            r2.d(r1)
            r9 = 1
            goto L_0x00b7
        L_0x009d:
            r9 = 1
            r2 = r2[r9]
            if (r2 == r9) goto L_0x00a7
            if (r2 != r1) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r1 = r6
            goto L_0x00b8
        L_0x00a7:
            int r1 = r5.j()
            int r1 = r1 + r10
            i0.f r2 = r13.f3553i
            r2.d(r1)
            i0.g r2 = r13.f3549e
            int r1 = r1 - r10
            r2.d(r1)
        L_0x00b7:
            r1 = r9
        L_0x00b8:
            r4.g()
            java.util.Iterator r2 = r11.iterator()
        L_0x00bf:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00dd
            java.lang.Object r4 = r2.next()
            i0.m r4 = (i0.m) r4
            int r10 = r4.f3550f
            if (r10 == r0) goto L_0x00d0
            goto L_0x00bf
        L_0x00d0:
            h0.e r10 = r4.f3546b
            if (r10 != r5) goto L_0x00d9
            boolean r10 = r4.f3551g
            if (r10 != 0) goto L_0x00d9
            goto L_0x00bf
        L_0x00d9:
            r4.e()
            goto L_0x00bf
        L_0x00dd:
            java.util.Iterator r2 = r11.iterator()
        L_0x00e1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r2.next()
            i0.m r4 = (i0.m) r4
            int r10 = r4.f3550f
            if (r10 == r0) goto L_0x00f2
            goto L_0x00e1
        L_0x00f2:
            if (r1 != 0) goto L_0x00f9
            h0.e r10 = r4.f3546b
            if (r10 != r5) goto L_0x00f9
            goto L_0x00e1
        L_0x00f9:
            i0.f r10 = r4.f3552h
            boolean r10 = r10.f3536j
            if (r10 != 0) goto L_0x0100
            goto L_0x0111
        L_0x0100:
            i0.f r10 = r4.f3553i
            boolean r10 = r10.f3536j
            if (r10 != 0) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            boolean r10 = r4 instanceof i0.c
            if (r10 != 0) goto L_0x00e1
            i0.g r4 = r4.f3549e
            boolean r4 = r4.f3536j
            if (r4 != 0) goto L_0x00e1
        L_0x0111:
            r1 = r6
            goto L_0x0114
        L_0x0113:
            r1 = r9
        L_0x0114:
            r5.w(r7)
            r5.x(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f.D(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v17, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v18, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r3v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0374 A[EDGE_INSN: B:207:0x0374->B:199:0x0374 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r31 = this;
            r1 = r31
            r2 = 0
            r1.N = r2
            r1.O = r2
            int r0 = r31.l()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r31.j()
            int r4 = java.lang.Math.max(r2, r0)
            r1.f3308q0 = r2
            r1.f3309r0 = r2
            int r0 = r1.f3307p0
            r5 = r0 & 64
            r6 = 1
            r7 = 64
            if (r5 != r7) goto L_0x0026
            r5 = r6
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            if (r5 != 0) goto L_0x0036
            r5 = 128(0x80, float:1.794E-43)
            r0 = r0 & r5
            if (r0 != r5) goto L_0x0030
            r0 = r6
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r0 = r2
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            g0.e r5 = r1.f3300i0
            r5.getClass()
            r5.f2797f = r2
            int r7 = r1.f3307p0
            if (r7 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0046
            r5.f2797f = r6
        L_0x0046:
            int[] r7 = r1.f3273c0
            r8 = r7[r6]
            r9 = r7[r2]
            java.util.ArrayList r10 = r1.f3296d0
            r11 = 2
            if (r9 == r11) goto L_0x0056
            if (r8 != r11) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r12 = r2
            goto L_0x0057
        L_0x0056:
            r12 = r6
        L_0x0057:
            r1.f3303l0 = r2
            r1.f3304m0 = r2
            int r13 = r10.size()
            r0 = r2
        L_0x0060:
            if (r0 >= r13) goto L_0x0076
            java.util.ArrayList r14 = r1.f3296d0
            java.lang.Object r14 = r14.get(r0)
            h0.e r14 = (h0.e) r14
            boolean r15 = r14 instanceof h0.f
            if (r15 == 0) goto L_0x0073
            h0.f r14 = (h0.f) r14
            r14.E()
        L_0x0073:
            int r0 = r0 + 1
            goto L_0x0060
        L_0x0076:
            r0 = r2
            r15 = r0
            r14 = r6
        L_0x0079:
            g.h r11 = r5.f2802k
            if (r14 == 0) goto L_0x0374
            int r2 = r0 + 1
            r5.r()     // Catch:{ Exception -> 0x0220 }
            r6 = 0
            r1.f3303l0 = r6     // Catch:{ Exception -> 0x0220 }
            r1.f3304m0 = r6     // Catch:{ Exception -> 0x0220 }
            r1.g(r5)     // Catch:{ Exception -> 0x0220 }
            r0 = 0
        L_0x008b:
            if (r0 >= r13) goto L_0x009b
            java.util.ArrayList r6 = r1.f3296d0     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0220 }
            h0.e r6 = (h0.e) r6     // Catch:{ Exception -> 0x0220 }
            r6.g(r5)     // Catch:{ Exception -> 0x0220 }
            int r0 = r0 + 1
            goto L_0x008b
        L_0x009b:
            r1.C(r5)     // Catch:{ Exception -> 0x0220 }
            g0.i r0 = r5.f2793b     // Catch:{ Exception -> 0x0211 }
            boolean r6 = r5.f2797f     // Catch:{ Exception -> 0x0211 }
            if (r6 == 0) goto L_0x00da
            r6 = 0
        L_0x00a5:
            int r14 = r5.f2800i     // Catch:{ Exception -> 0x0211 }
            if (r6 >= r14) goto L_0x00b6
            g0.c[] r14 = r5.f2796e     // Catch:{ Exception -> 0x0211 }
            r14 = r14[r6]     // Catch:{ Exception -> 0x0211 }
            boolean r14 = r14.f2789e     // Catch:{ Exception -> 0x0211 }
            if (r14 != 0) goto L_0x00b3
            r6 = 0
            goto L_0x00b7
        L_0x00b3:
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x00b6:
            r6 = 1
        L_0x00b7:
            if (r6 != 0) goto L_0x00ba
            goto L_0x00da
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            int r6 = r5.f2800i     // Catch:{ Exception -> 0x0211 }
            if (r0 >= r6) goto L_0x00cc
            g0.c[] r6 = r5.f2796e     // Catch:{ Exception -> 0x0211 }
            r6 = r6[r0]     // Catch:{ Exception -> 0x0211 }
            g0.j r11 = r6.f2785a     // Catch:{ Exception -> 0x0211 }
            float r6 = r6.f2786b     // Catch:{ Exception -> 0x0211 }
            r11.f2821e = r6     // Catch:{ Exception -> 0x0211 }
            int r0 = r0 + 1
            goto L_0x00bb
        L_0x00cc:
            r25 = r3
            r24 = r4
            r29 = r7
            r28 = r8
            r19 = r10
            r18 = r15
            goto L_0x020f
        L_0x00da:
            r6 = 0
        L_0x00db:
            int r14 = r5.f2800i     // Catch:{ Exception -> 0x0211 }
            r17 = 0
            if (r6 >= r14) goto L_0x010c
            g0.c[] r14 = r5.f2796e     // Catch:{ Exception -> 0x0105 }
            r14 = r14[r6]     // Catch:{ Exception -> 0x0105 }
            r18 = r15
            g0.j r15 = r14.f2785a     // Catch:{ Exception -> 0x0100 }
            int r15 = r15.f2828l     // Catch:{ Exception -> 0x0100 }
            r19 = r10
            r10 = 1
            if (r15 != r10) goto L_0x00f1
            goto L_0x00f9
        L_0x00f1:
            float r10 = r14.f2786b     // Catch:{ Exception -> 0x01b2 }
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x00f9
            r6 = 1
            goto L_0x0111
        L_0x00f9:
            int r6 = r6 + 1
            r15 = r18
            r10 = r19
            goto L_0x00db
        L_0x0100:
            r0 = move-exception
            r19 = r10
            goto L_0x01b3
        L_0x0105:
            r0 = move-exception
            r19 = r10
            r18 = r15
            goto L_0x01b3
        L_0x010c:
            r19 = r10
            r18 = r15
            r6 = 0
        L_0x0111:
            if (r6 == 0) goto L_0x01f2
            r6 = 0
            r10 = 0
        L_0x0115:
            if (r6 != 0) goto L_0x01f2
            r14 = 1
            int r10 = r10 + r14
            r15 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r21 = r6
            r23 = r15
            r6 = -1
            r14 = 0
            r20 = 0
            r22 = -1
        L_0x0126:
            int r15 = r5.f2800i     // Catch:{ Exception -> 0x01b2 }
            if (r14 >= r15) goto L_0x01b8
            g0.c[] r15 = r5.f2796e     // Catch:{ Exception -> 0x01b2 }
            r15 = r15[r14]     // Catch:{ Exception -> 0x01b2 }
            r24 = r4
            g0.j r4 = r15.f2785a     // Catch:{ Exception -> 0x01ae }
            int r4 = r4.f2828l     // Catch:{ Exception -> 0x01ae }
            r25 = r3
            r3 = 1
            if (r4 != r3) goto L_0x013b
        L_0x0139:
            goto L_0x019e
        L_0x013b:
            boolean r3 = r15.f2789e     // Catch:{ Exception -> 0x0195 }
            if (r3 == 0) goto L_0x0140
            goto L_0x0139
        L_0x0140:
            float r3 = r15.f2786b     // Catch:{ Exception -> 0x0195 }
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x019e
            r3 = 1
        L_0x0147:
            int r4 = r5.f2799h     // Catch:{ Exception -> 0x0195 }
            if (r3 >= r4) goto L_0x019c
            java.lang.Object r4 = r11.f2728d     // Catch:{ Exception -> 0x0195 }
            g0.j[] r4 = (g0.j[]) r4     // Catch:{ Exception -> 0x0195 }
            r4 = r4[r3]     // Catch:{ Exception -> 0x0195 }
            r26 = r6
            g0.b r6 = r15.f2788d     // Catch:{ Exception -> 0x0195 }
            float r6 = r6.c(r4)     // Catch:{ Exception -> 0x0195 }
            int r27 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            r29 = r7
            r28 = r8
            if (r27 > 0) goto L_0x0166
            r27 = r15
        L_0x0163:
            r6 = r26
            goto L_0x018c
        L_0x0166:
            r27 = r15
            r8 = r20
            r15 = 0
        L_0x016b:
            r7 = 9
            if (r15 >= r7) goto L_0x0189
            float[] r7 = r4.f2823g     // Catch:{ Exception -> 0x0186 }
            r7 = r7[r15]     // Catch:{ Exception -> 0x0186 }
            float r7 = r7 / r6
            int r20 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r20 >= 0) goto L_0x017a
            if (r15 == r8) goto L_0x017c
        L_0x017a:
            if (r15 <= r8) goto L_0x0183
        L_0x017c:
            r22 = r3
            r23 = r7
            r26 = r14
            r8 = r15
        L_0x0183:
            int r15 = r15 + 1
            goto L_0x016b
        L_0x0186:
            r0 = move-exception
            goto L_0x021e
        L_0x0189:
            r20 = r8
            goto L_0x0163
        L_0x018c:
            int r3 = r3 + 1
            r15 = r27
            r8 = r28
            r7 = r29
            goto L_0x0147
        L_0x0195:
            r0 = move-exception
        L_0x0196:
            r29 = r7
            r28 = r8
            goto L_0x021e
        L_0x019c:
            r26 = r6
        L_0x019e:
            r29 = r7
            r28 = r8
            int r14 = r14 + 1
            r4 = r24
            r3 = r25
            r8 = r28
            r7 = r29
            goto L_0x0126
        L_0x01ae:
            r0 = move-exception
            r25 = r3
            goto L_0x0196
        L_0x01b2:
            r0 = move-exception
        L_0x01b3:
            r25 = r3
            r24 = r4
            goto L_0x0196
        L_0x01b8:
            r25 = r3
            r24 = r4
            r29 = r7
            r28 = r8
            r3 = -1
            if (r6 == r3) goto L_0x01dc
            g0.c[] r4 = r5.f2796e     // Catch:{ Exception -> 0x0186 }
            r4 = r4[r6]     // Catch:{ Exception -> 0x0186 }
            g0.j r7 = r4.f2785a     // Catch:{ Exception -> 0x0186 }
            r7.f2819c = r3     // Catch:{ Exception -> 0x0186 }
            java.lang.Object r3 = r11.f2728d     // Catch:{ Exception -> 0x0186 }
            g0.j[] r3 = (g0.j[]) r3     // Catch:{ Exception -> 0x0186 }
            r3 = r3[r22]     // Catch:{ Exception -> 0x0186 }
            r4.f(r3)     // Catch:{ Exception -> 0x0186 }
            g0.j r3 = r4.f2785a     // Catch:{ Exception -> 0x0186 }
            r3.f2819c = r6     // Catch:{ Exception -> 0x0186 }
            r3.d(r4)     // Catch:{ Exception -> 0x0186 }
            goto L_0x01de
        L_0x01dc:
            r21 = 1
        L_0x01de:
            int r3 = r5.f2799h     // Catch:{ Exception -> 0x0186 }
            r4 = 2
            int r3 = r3 / r4
            if (r10 <= r3) goto L_0x01e6
            r6 = 1
            goto L_0x01e8
        L_0x01e6:
            r6 = r21
        L_0x01e8:
            r4 = r24
            r3 = r25
            r8 = r28
            r7 = r29
            goto L_0x0115
        L_0x01f2:
            r25 = r3
            r24 = r4
            r29 = r7
            r28 = r8
            r5.p(r0)     // Catch:{ Exception -> 0x0186 }
            r0 = 0
        L_0x01fe:
            int r3 = r5.f2800i     // Catch:{ Exception -> 0x0186 }
            if (r0 >= r3) goto L_0x020f
            g0.c[] r3 = r5.f2796e     // Catch:{ Exception -> 0x0186 }
            r3 = r3[r0]     // Catch:{ Exception -> 0x0186 }
            g0.j r4 = r3.f2785a     // Catch:{ Exception -> 0x0186 }
            float r3 = r3.f2786b     // Catch:{ Exception -> 0x0186 }
            r4.f2821e = r3     // Catch:{ Exception -> 0x0186 }
            int r0 = r0 + 1
            goto L_0x01fe
        L_0x020f:
            r14 = 1
            goto L_0x0243
        L_0x0211:
            r0 = move-exception
            r25 = r3
            r24 = r4
            r29 = r7
            r28 = r8
            r19 = r10
            r18 = r15
        L_0x021e:
            r14 = 1
            goto L_0x022d
        L_0x0220:
            r0 = move-exception
            r25 = r3
            r24 = r4
            r29 = r7
            r28 = r8
            r19 = r10
            r18 = r15
        L_0x022d:
            r0.printStackTrace()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "EXCEPTION : "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.println(r0)
        L_0x0243:
            boolean[] r0 = com.bumptech.glide.e.f1705a
            if (r14 == 0) goto L_0x0265
            r3 = 2
            r4 = 0
            r0[r3] = r4
            r1.A(r5)
            java.util.ArrayList r3 = r1.f3296d0
            int r3 = r3.size()
            r4 = 0
        L_0x0255:
            if (r4 >= r3) goto L_0x0279
            java.util.ArrayList r6 = r1.f3296d0
            java.lang.Object r6 = r6.get(r4)
            h0.e r6 = (h0.e) r6
            r6.A(r5)
            int r4 = r4 + 1
            goto L_0x0255
        L_0x0265:
            r1.A(r5)
            r3 = 0
        L_0x0269:
            if (r3 >= r13) goto L_0x0279
            java.util.ArrayList r4 = r1.f3296d0
            java.lang.Object r4 = r4.get(r3)
            h0.e r4 = (h0.e) r4
            r4.A(r5)
            int r3 = r3 + 1
            goto L_0x0269
        L_0x0279:
            if (r12 == 0) goto L_0x02e0
            r3 = 8
            if (r2 >= r3) goto L_0x02e0
            r3 = 2
            boolean r0 = r0[r3]
            if (r0 == 0) goto L_0x02e0
            r0 = 0
            r3 = 0
            r4 = 0
        L_0x0287:
            if (r0 >= r13) goto L_0x02aa
            java.util.ArrayList r6 = r1.f3296d0
            java.lang.Object r6 = r6.get(r0)
            h0.e r6 = (h0.e) r6
            int r7 = r6.N
            int r8 = r6.l()
            int r8 = r8 + r7
            int r3 = java.lang.Math.max(r3, r8)
            int r7 = r6.O
            int r6 = r6.j()
            int r6 = r6 + r7
            int r4 = java.lang.Math.max(r4, r6)
            int r0 = r0 + 1
            goto L_0x0287
        L_0x02aa:
            int r0 = r1.Q
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r1.R
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 2
            if (r9 != r4) goto L_0x02ca
            int r6 = r31.l()
            if (r6 >= r0) goto L_0x02ca
            r1.y(r0)
            r6 = 0
            r29[r6] = r4
            r6 = r28
            r0 = 1
            r15 = 1
            goto L_0x02cf
        L_0x02ca:
            r15 = r18
            r6 = r28
            r0 = 0
        L_0x02cf:
            if (r6 != r4) goto L_0x02e5
            int r7 = r31.j()
            if (r7 >= r3) goto L_0x02e5
            r1.v(r3)
            r3 = 1
            r29[r3] = r4
            r0 = 1
            r15 = 1
            goto L_0x02e5
        L_0x02e0:
            r6 = r28
            r15 = r18
            r0 = 0
        L_0x02e5:
            int r3 = r1.Q
            int r4 = r31.l()
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r31.l()
            if (r3 <= r4) goto L_0x0300
            r1.y(r3)
            r3 = 1
            r4 = 0
            r29[r4] = r3
            r0 = r3
            r16 = r0
            goto L_0x0303
        L_0x0300:
            r3 = 1
            r16 = r15
        L_0x0303:
            int r4 = r1.R
            int r7 = r31.j()
            int r4 = java.lang.Math.max(r4, r7)
            int r7 = r31.j()
            if (r4 <= r7) goto L_0x031b
            r1.v(r4)
            r29[r3] = r3
            r0 = r3
            r10 = r0
            goto L_0x031d
        L_0x031b:
            r10 = r16
        L_0x031d:
            if (r10 != 0) goto L_0x0361
            r4 = 0
            r7 = r29[r4]
            r8 = 2
            if (r7 != r8) goto L_0x0339
            if (r25 <= 0) goto L_0x0339
            int r7 = r31.l()
            r8 = r25
            if (r7 <= r8) goto L_0x033b
            r1.f3308q0 = r3
            r29[r4] = r3
            r1.y(r8)
            r0 = r3
            r10 = r0
            goto L_0x0340
        L_0x0339:
            r8 = r25
        L_0x033b:
            r30 = r10
            r10 = r0
            r0 = r30
        L_0x0340:
            r4 = r29[r3]
            r7 = 2
            if (r4 != r7) goto L_0x0359
            if (r24 <= 0) goto L_0x0359
            int r4 = r31.j()
            r14 = r24
            if (r4 <= r14) goto L_0x035b
            r1.f3309r0 = r3
            r29[r3] = r3
            r1.v(r14)
            r0 = 1
            r15 = 1
            goto L_0x0367
        L_0x0359:
            r14 = r24
        L_0x035b:
            r30 = r10
            r10 = r0
            r0 = r30
            goto L_0x0366
        L_0x0361:
            r14 = r24
            r8 = r25
            r7 = 2
        L_0x0366:
            r15 = r10
        L_0x0367:
            r3 = r8
            r4 = r14
            r10 = r19
            r7 = r29
            r14 = r0
            r0 = r2
            r8 = r6
            r2 = 0
            r6 = 1
            goto L_0x0079
        L_0x0374:
            r29 = r7
            r6 = r8
            r2 = r10
            r18 = r15
            r1.f3296d0 = r2
            if (r18 == 0) goto L_0x0384
            r2 = 0
            r29[r2] = r9
            r2 = 1
            r29[r2] = r6
        L_0x0384:
            r1.u(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.f.E():void");
    }

    public final void s() {
        this.f3300i0.r();
        this.f3301j0 = 0;
        this.f3302k0 = 0;
        this.f3296d0.clear();
        super.s();
    }

    public final void u(h hVar) {
        super.u(hVar);
        int size = this.f3296d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e) this.f3296d0.get(i3)).u(hVar);
        }
    }

    public final void z(boolean z5, boolean z6) {
        super.z(z5, z6);
        int size = this.f3296d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e) this.f3296d0.get(i3)).z(z5, z6);
        }
    }
}
