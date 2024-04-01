package g5;

import b1.o;
import g4.h;
import java.util.Arrays;
import kotlinx.coroutines.internal.r;
import l5.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f2961a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2962b;

    /* renamed from: c  reason: collision with root package name */
    public int f2963c;

    /* renamed from: d  reason: collision with root package name */
    public c[] f2964d;

    /* renamed from: e  reason: collision with root package name */
    public int f2965e;

    /* renamed from: f  reason: collision with root package name */
    public int f2966f;

    /* renamed from: g  reason: collision with root package name */
    public int f2967g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2968h = true;

    /* renamed from: i  reason: collision with root package name */
    public final g f2969i;

    public e(g gVar) {
        this.f2969i = gVar;
        this.f2961a = Integer.MAX_VALUE;
        this.f2963c = 4096;
        this.f2964d = new c[8];
        this.f2965e = 7;
    }

    public final void a(int i3) {
        int i6;
        if (i3 > 0) {
            int length = this.f2964d.length - 1;
            int i7 = 0;
            while (true) {
                i6 = this.f2965e;
                if (length < i6 || i3 <= 0) {
                    c[] cVarArr = this.f2964d;
                    int i8 = i6 + 1;
                    System.arraycopy(cVarArr, i8, cVarArr, i8 + i7, this.f2966f);
                    c[] cVarArr2 = this.f2964d;
                    int i9 = this.f2965e + 1;
                    Arrays.fill(cVarArr2, i9, i9 + i7, (Object) null);
                    this.f2965e += i7;
                } else {
                    c cVar = this.f2964d[length];
                    o.k(cVar);
                    i3 -= cVar.f2944a;
                    int i10 = this.f2967g;
                    c cVar2 = this.f2964d[length];
                    o.k(cVar2);
                    this.f2967g = i10 - cVar2.f2944a;
                    this.f2966f--;
                    i7++;
                    length--;
                }
            }
            c[] cVarArr3 = this.f2964d;
            int i82 = i6 + 1;
            System.arraycopy(cVarArr3, i82, cVarArr3, i82 + i7, this.f2966f);
            c[] cVarArr22 = this.f2964d;
            int i92 = this.f2965e + 1;
            Arrays.fill(cVarArr22, i92, i92 + i7, (Object) null);
            this.f2965e += i7;
        }
    }

    public final void b(c cVar) {
        int i3 = this.f2963c;
        int i6 = cVar.f2944a;
        if (i6 > i3) {
            h.c0(this.f2964d, (r) null);
            this.f2965e = this.f2964d.length - 1;
            this.f2966f = 0;
            this.f2967g = 0;
            return;
        }
        a((this.f2967g + i6) - i3);
        int i7 = this.f2966f + 1;
        c[] cVarArr = this.f2964d;
        if (i7 > cVarArr.length) {
            c[] cVarArr2 = new c[(cVarArr.length * 2)];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f2965e = this.f2964d.length - 1;
            this.f2964d = cVarArr2;
        }
        int i8 = this.f2965e;
        this.f2965e = i8 - 1;
        this.f2964d[i8] = cVar;
        this.f2966f++;
        this.f2967g += i6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(l5.j r10) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            b1.o.m(r10, r0)
            boolean r0 = r9.f2968h
            r1 = 0
            if (r0 == 0) goto L_0x0083
            int[] r0 = g5.d0.f2958a
            int r0 = r10.b()
            r2 = 0
            r4 = r1
            r5 = r2
        L_0x0014:
            if (r4 >= r0) goto L_0x0027
            byte r7 = r10.e(r4)
            byte[] r8 = a5.c.f212a
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte[] r8 = g5.d0.f2959b
            byte r7 = r8[r7]
            long r7 = (long) r7
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0027:
            r0 = 7
            long r7 = (long) r0
            long r5 = r5 + r7
            r0 = 3
            long r4 = r5 >> r0
            int r0 = (int) r4
            int r4 = r10.b()
            if (r0 >= r4) goto L_0x0083
            l5.g r0 = new l5.g
            r0.<init>()
            int[] r4 = g5.d0.f2958a
            int r4 = r10.b()
            r5 = r2
            r2 = r1
        L_0x0041:
            if (r1 >= r4) goto L_0x0067
            byte r3 = r10.e(r1)
            byte[] r7 = a5.c.f212a
            r3 = r3 & 255(0xff, float:3.57E-43)
            int[] r7 = g5.d0.f2958a
            r7 = r7[r3]
            byte[] r8 = g5.d0.f2959b
            byte r3 = r8[r3]
            long r5 = r5 << r3
            long r7 = (long) r7
            long r5 = r5 | r7
            int r2 = r2 + r3
        L_0x0057:
            r3 = 8
            if (r2 < r3) goto L_0x0064
            int r2 = r2 + -8
            long r7 = r5 >> r2
            int r3 = (int) r7
            r0.G(r3)
            goto L_0x0057
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x0041
        L_0x0067:
            if (r2 <= 0) goto L_0x0076
            int r10 = 8 - r2
            long r3 = r5 << r10
            r5 = 255(0xff, double:1.26E-321)
            long r1 = r5 >>> r2
            long r1 = r1 | r3
            int r10 = (int) r1
            r0.G(r10)
        L_0x0076:
            long r1 = r0.f4128e
            l5.j r10 = r0.g(r1)
            int r0 = r10.b()
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0087
        L_0x0083:
            int r0 = r10.b()
        L_0x0087:
            r2 = 127(0x7f, float:1.78E-43)
            r9.e(r0, r2, r1)
            l5.g r0 = r9.f2969i
            r0.D(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e.c(l5.j):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.util.ArrayList r13) {
        /*
            r12 = this;
            boolean r0 = r12.f2962b
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r12.f2961a
            int r2 = r12.f2963c
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L_0x0012
            r12.e(r0, r4, r3)
        L_0x0012:
            r12.f2962b = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r12.f2961a = r0
            int r0 = r12.f2963c
            r12.e(r0, r4, r3)
        L_0x001e:
            int r0 = r13.size()
            r2 = r1
        L_0x0023:
            if (r2 >= r0) goto L_0x00f6
            java.lang.Object r3 = r13.get(r2)
            g5.c r3 = (g5.c) r3
            l5.j r4 = r3.f2945b
            l5.j r4 = r4.h()
            java.util.Map r5 = g5.f.f2972b
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = -1
            l5.j r7 = r3.f2946c
            if (r5 == 0) goto L_0x0069
            int r5 = r5.intValue()
            int r5 = r5 + 1
            r8 = 2
            if (r8 <= r5) goto L_0x0048
            goto L_0x0067
        L_0x0048:
            r8 = 7
            if (r8 < r5) goto L_0x0067
            g5.c[] r8 = g5.f.f2971a
            int r9 = r5 + -1
            r9 = r8[r9]
            l5.j r9 = r9.f2946c
            boolean r9 = b1.o.c(r9, r7)
            if (r9 == 0) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            r8 = r8[r5]
            l5.j r8 = r8.f2946c
            boolean r8 = b1.o.c(r8, r7)
            if (r8 == 0) goto L_0x0067
            int r8 = r5 + 1
            goto L_0x006b
        L_0x0067:
            r8 = r6
            goto L_0x006b
        L_0x0069:
            r5 = r6
        L_0x006a:
            r8 = r5
        L_0x006b:
            if (r8 != r6) goto L_0x00a9
            int r9 = r12.f2965e
            int r9 = r9 + 1
            g5.c[] r10 = r12.f2964d
            int r10 = r10.length
        L_0x0074:
            if (r9 >= r10) goto L_0x00a9
            g5.c[] r11 = r12.f2964d
            r11 = r11[r9]
            b1.o.k(r11)
            l5.j r11 = r11.f2945b
            boolean r11 = b1.o.c(r11, r4)
            if (r11 == 0) goto L_0x00a6
            g5.c[] r11 = r12.f2964d
            r11 = r11[r9]
            b1.o.k(r11)
            l5.j r11 = r11.f2946c
            boolean r11 = b1.o.c(r11, r7)
            if (r11 == 0) goto L_0x009c
            int r8 = r12.f2965e
            int r9 = r9 - r8
            g5.c[] r8 = g5.f.f2971a
            int r8 = r8.length
            int r8 = r8 + r9
            goto L_0x00a9
        L_0x009c:
            if (r5 != r6) goto L_0x00a6
            int r5 = r12.f2965e
            int r5 = r9 - r5
            g5.c[] r11 = g5.f.f2971a
            int r11 = r11.length
            int r5 = r5 + r11
        L_0x00a6:
            int r9 = r9 + 1
            goto L_0x0074
        L_0x00a9:
            if (r8 == r6) goto L_0x00b3
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.794E-43)
            r12.e(r8, r3, r4)
            goto L_0x00f2
        L_0x00b3:
            r8 = 64
            if (r5 != r6) goto L_0x00c0
            l5.g r5 = r12.f2969i
            r5.G(r8)
            r12.c(r4)
            goto L_0x00ec
        L_0x00c0:
            l5.j r6 = g5.c.f2938d
            r4.getClass()
            java.lang.String r9 = "prefix"
            b1.o.m(r6, r9)
            int r9 = r6.b()
            boolean r6 = r4.g(r6, r9)
            if (r6 == 0) goto L_0x00e7
            l5.j r6 = g5.c.f2943i
            boolean r4 = b1.o.c(r6, r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x00e7
            r3 = 15
            r12.e(r5, r3, r1)
            r12.c(r7)
            goto L_0x00f2
        L_0x00e7:
            r4 = 63
            r12.e(r5, r4, r8)
        L_0x00ec:
            r12.c(r7)
            r12.b(r3)
        L_0x00f2:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e.d(java.util.ArrayList):void");
    }

    public final void e(int i3, int i6, int i7) {
        g gVar = this.f2969i;
        if (i3 < i6) {
            gVar.G(i3 | i7);
            return;
        }
        gVar.G(i7 | i6);
        int i8 = i3 - i6;
        while (i8 >= 128) {
            gVar.G(128 | (i8 & 127));
            i8 >>>= 7;
        }
        gVar.G(i8);
    }
}
