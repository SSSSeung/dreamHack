package j0;

import android.view.ViewGroup;
import h0.e;
import h0.i;

public final class d extends ViewGroup.MarginLayoutParams {
    public float A = 0.5f;
    public String B = null;
    public final int C = 1;
    public float D = -1.0f;
    public float E = -1.0f;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public float N = 1.0f;
    public float O = 1.0f;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public boolean S = false;
    public boolean T = false;
    public String U = null;
    public boolean V = true;
    public boolean W = true;
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: a  reason: collision with root package name */
    public int f3657a = -1;

    /* renamed from: a0  reason: collision with root package name */
    public int f3658a0 = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f3659b = -1;

    /* renamed from: b0  reason: collision with root package name */
    public int f3660b0 = -1;

    /* renamed from: c  reason: collision with root package name */
    public float f3661c = -1.0f;

    /* renamed from: c0  reason: collision with root package name */
    public int f3662c0 = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3663d = -1;

    /* renamed from: d0  reason: collision with root package name */
    public int f3664d0 = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f3665e = -1;

    /* renamed from: e0  reason: collision with root package name */
    public int f3666e0 = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f3667f = -1;
    public int f0 = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3668g = -1;

    /* renamed from: g0  reason: collision with root package name */
    public float f3669g0 = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public int f3670h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public int f3671h0;

    /* renamed from: i  reason: collision with root package name */
    public int f3672i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f3673i0;

    /* renamed from: j  reason: collision with root package name */
    public int f3674j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public float f3675j0;

    /* renamed from: k  reason: collision with root package name */
    public int f3676k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public e f3677k0 = new e();

    /* renamed from: l  reason: collision with root package name */
    public int f3678l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f3679m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f3680n = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f3681o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    public int f3682p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f3683q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f3684r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f3685s = -1;

    /* renamed from: t  reason: collision with root package name */
    public final int f3686t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f3687u = -1;

    /* renamed from: v  reason: collision with root package name */
    public final int f3688v = -1;
    public int w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f3689x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f3690y = -1;

    /* renamed from: z  reason: collision with root package name */
    public float f3691z = 0.5f;

    public d() {
        super(-2, -2);
    }

    public final void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int i3 = this.width;
        if (i3 == -2 && this.S) {
            this.V = false;
            if (this.H == 0) {
                this.H = 1;
            }
        }
        int i6 = this.height;
        if (i6 == -2 && this.T) {
            this.W = false;
            if (this.I == 0) {
                this.I = 1;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.V = false;
            if (i3 == 0 && this.H == 1) {
                this.width = -2;
                this.S = true;
            }
        }
        if (i6 == 0 || i6 == -1) {
            this.W = false;
            if (i6 == 0 && this.I == 1) {
                this.height = -2;
                this.T = true;
            }
        }
        if (this.f3661c != -1.0f || this.f3657a != -1 || this.f3659b != -1) {
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f3677k0 instanceof i)) {
                this.f3677k0 = new i();
            }
            ((i) this.f3677k0).B(this.R);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        if (r1 > 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
        if (r1 > 0) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r10) {
        /*
            r9 = this;
            int r0 = r9.leftMargin
            int r1 = r9.rightMargin
            super.resolveLayoutDirection(r10)
            int r10 = r9.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r10) goto L_0x0011
            r10 = r3
            goto L_0x0012
        L_0x0011:
            r10 = r2
        L_0x0012:
            r4 = -1
            r9.f3662c0 = r4
            r9.f3664d0 = r4
            r9.f3658a0 = r4
            r9.f3660b0 = r4
            int r5 = r9.f3686t
            r9.f3666e0 = r5
            int r5 = r9.f3688v
            r9.f0 = r5
            float r5 = r9.f3691z
            r9.f3669g0 = r5
            int r6 = r9.f3657a
            r9.f3671h0 = r6
            int r7 = r9.f3659b
            r9.f3673i0 = r7
            float r8 = r9.f3661c
            r9.f3675j0 = r8
            if (r10 == 0) goto L_0x008c
            int r10 = r9.f3682p
            if (r10 == r4) goto L_0x003d
            r9.f3662c0 = r10
        L_0x003b:
            r2 = r3
            goto L_0x0044
        L_0x003d:
            int r10 = r9.f3683q
            if (r10 == r4) goto L_0x0044
            r9.f3664d0 = r10
            goto L_0x003b
        L_0x0044:
            int r10 = r9.f3684r
            if (r10 == r4) goto L_0x004b
            r9.f3660b0 = r10
            r2 = r3
        L_0x004b:
            int r10 = r9.f3685s
            if (r10 == r4) goto L_0x0052
            r9.f3658a0 = r10
            r2 = r3
        L_0x0052:
            int r10 = r9.f3689x
            if (r10 == r4) goto L_0x0058
            r9.f0 = r10
        L_0x0058:
            int r10 = r9.f3690y
            if (r10 == r4) goto L_0x005e
            r9.f3666e0 = r10
        L_0x005e:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0066
            float r2 = r10 - r5
            r9.f3669g0 = r2
        L_0x0066:
            boolean r2 = r9.Y
            if (r2 == 0) goto L_0x00b0
            int r2 = r9.R
            if (r2 != r3) goto L_0x00b0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x007c
            float r10 = r10 - r8
            r9.f3675j0 = r10
            r9.f3671h0 = r4
            r9.f3673i0 = r4
            goto L_0x00b0
        L_0x007c:
            if (r6 == r4) goto L_0x0085
            r9.f3673i0 = r6
            r9.f3671h0 = r4
        L_0x0082:
            r9.f3675j0 = r2
            goto L_0x00b0
        L_0x0085:
            if (r7 == r4) goto L_0x00b0
            r9.f3671h0 = r7
            r9.f3673i0 = r4
            goto L_0x0082
        L_0x008c:
            int r10 = r9.f3682p
            if (r10 == r4) goto L_0x0092
            r9.f3660b0 = r10
        L_0x0092:
            int r10 = r9.f3683q
            if (r10 == r4) goto L_0x0098
            r9.f3658a0 = r10
        L_0x0098:
            int r10 = r9.f3684r
            if (r10 == r4) goto L_0x009e
            r9.f3662c0 = r10
        L_0x009e:
            int r10 = r9.f3685s
            if (r10 == r4) goto L_0x00a4
            r9.f3664d0 = r10
        L_0x00a4:
            int r10 = r9.f3689x
            if (r10 == r4) goto L_0x00aa
            r9.f3666e0 = r10
        L_0x00aa:
            int r10 = r9.f3690y
            if (r10 == r4) goto L_0x00b0
            r9.f0 = r10
        L_0x00b0:
            int r10 = r9.f3684r
            if (r10 != r4) goto L_0x00f8
            int r10 = r9.f3685s
            if (r10 != r4) goto L_0x00f8
            int r10 = r9.f3683q
            if (r10 != r4) goto L_0x00f8
            int r10 = r9.f3682p
            if (r10 != r4) goto L_0x00f8
            int r10 = r9.f3667f
            if (r10 == r4) goto L_0x00cf
            r9.f3662c0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00dc
            if (r1 <= 0) goto L_0x00dc
        L_0x00cc:
            r9.rightMargin = r1
            goto L_0x00dc
        L_0x00cf:
            int r10 = r9.f3668g
            if (r10 == r4) goto L_0x00dc
            r9.f3664d0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00dc
            if (r1 <= 0) goto L_0x00dc
            goto L_0x00cc
        L_0x00dc:
            int r10 = r9.f3663d
            if (r10 == r4) goto L_0x00eb
            r9.f3658a0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00f8
            if (r0 <= 0) goto L_0x00f8
        L_0x00e8:
            r9.leftMargin = r0
            goto L_0x00f8
        L_0x00eb:
            int r10 = r9.f3665e
            if (r10 == r4) goto L_0x00f8
            r9.f3660b0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00f8
            if (r0 <= 0) goto L_0x00f8
            goto L_0x00e8
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.resolveLayoutDirection(int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0139, code lost:
        android.util.Log.e("ConstraintLayout", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r9.<init>(r10, r11)
            r0 = -1
            r9.f3657a = r0
            r9.f3659b = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.f3661c = r1
            r9.f3663d = r0
            r9.f3665e = r0
            r9.f3667f = r0
            r9.f3668g = r0
            r9.f3670h = r0
            r9.f3672i = r0
            r9.f3674j = r0
            r9.f3676k = r0
            r9.f3678l = r0
            r9.f3679m = r0
            r2 = 0
            r9.f3680n = r2
            r3 = 0
            r9.f3681o = r3
            r9.f3682p = r0
            r9.f3683q = r0
            r9.f3684r = r0
            r9.f3685s = r0
            r9.f3686t = r0
            r9.f3687u = r0
            r9.f3688v = r0
            r9.w = r0
            r9.f3689x = r0
            r9.f3690y = r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r9.f3691z = r4
            r9.A = r4
            r5 = 0
            r9.B = r5
            r6 = 1
            r9.C = r6
            r9.D = r1
            r9.E = r1
            r9.F = r2
            r9.G = r2
            r9.H = r2
            r9.I = r2
            r9.J = r2
            r9.K = r2
            r9.L = r2
            r9.M = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.N = r1
            r9.O = r1
            r9.P = r0
            r9.Q = r0
            r9.R = r0
            r9.S = r2
            r9.T = r2
            r9.U = r5
            r9.V = r6
            r9.W = r6
            r9.X = r2
            r9.Y = r2
            r9.Z = r2
            r9.f3658a0 = r0
            r9.f3660b0 = r0
            r9.f3662c0 = r0
            r9.f3664d0 = r0
            r9.f3666e0 = r0
            r9.f0 = r0
            r9.f3669g0 = r4
            h0.e r1 = new h0.e
            r1.<init>()
            r9.f3677k0 = r1
            int[] r1 = j0.r.f3778b
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
            int r11 = r10.getIndexCount()
            r1 = r2
        L_0x0096:
            if (r1 >= r11) goto L_0x03bc
            int r4 = r10.getIndex(r1)
            android.util.SparseIntArray r5 = j0.c.f3656a
            int r5 = r5.get(r4)
            r7 = 2
            r8 = -2
            switch(r5) {
                case 1: goto L_0x02de;
                case 2: goto L_0x02cc;
                case 3: goto L_0x02c2;
                case 4: goto L_0x02ac;
                case 5: goto L_0x02a2;
                case 6: goto L_0x0298;
                case 7: goto L_0x028e;
                case 8: goto L_0x027c;
                case 9: goto L_0x026a;
                case 10: goto L_0x0258;
                case 11: goto L_0x0246;
                case 12: goto L_0x0234;
                case 13: goto L_0x0222;
                case 14: goto L_0x0210;
                case 15: goto L_0x01fe;
                case 16: goto L_0x01ec;
                case 17: goto L_0x01da;
                case 18: goto L_0x01c8;
                case 19: goto L_0x01b6;
                case 20: goto L_0x01a4;
                case 21: goto L_0x019a;
                case 22: goto L_0x0190;
                case 23: goto L_0x0186;
                case 24: goto L_0x017c;
                case 25: goto L_0x0172;
                case 26: goto L_0x0168;
                case 27: goto L_0x015e;
                case 28: goto L_0x0154;
                case 29: goto L_0x014a;
                case 30: goto L_0x0140;
                case 31: goto L_0x012f;
                case 32: goto L_0x0124;
                case 33: goto L_0x010e;
                case 34: goto L_0x00f8;
                case 35: goto L_0x00e8;
                case 36: goto L_0x00d2;
                case 37: goto L_0x00bc;
                case 38: goto L_0x00ac;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            switch(r5) {
                case 44: goto L_0x0328;
                case 45: goto L_0x031e;
                case 46: goto L_0x0314;
                case 47: goto L_0x030c;
                case 48: goto L_0x0304;
                case 49: goto L_0x02fa;
                case 50: goto L_0x02f0;
                case 51: goto L_0x02e8;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x03b8
        L_0x00ac:
            float r5 = r9.O
            float r4 = r10.getFloat(r4, r5)
            float r4 = java.lang.Math.max(r3, r4)
            r9.O = r4
            r9.I = r7
            goto L_0x03b8
        L_0x00bc:
            int r5 = r9.M     // Catch:{ Exception -> 0x00c6 }
            int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00c6 }
            r9.M = r5     // Catch:{ Exception -> 0x00c6 }
            goto L_0x03b8
        L_0x00c6:
            int r5 = r9.M
            int r4 = r10.getInt(r4, r5)
            if (r4 != r8) goto L_0x03b8
            r9.M = r8
            goto L_0x03b8
        L_0x00d2:
            int r5 = r9.K     // Catch:{ Exception -> 0x00dc }
            int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00dc }
            r9.K = r5     // Catch:{ Exception -> 0x00dc }
            goto L_0x03b8
        L_0x00dc:
            int r5 = r9.K
            int r4 = r10.getInt(r4, r5)
            if (r4 != r8) goto L_0x03b8
            r9.K = r8
            goto L_0x03b8
        L_0x00e8:
            float r5 = r9.N
            float r4 = r10.getFloat(r4, r5)
            float r4 = java.lang.Math.max(r3, r4)
            r9.N = r4
            r9.H = r7
            goto L_0x03b8
        L_0x00f8:
            int r5 = r9.L     // Catch:{ Exception -> 0x0102 }
            int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x0102 }
            r9.L = r5     // Catch:{ Exception -> 0x0102 }
            goto L_0x03b8
        L_0x0102:
            int r5 = r9.L
            int r4 = r10.getInt(r4, r5)
            if (r4 != r8) goto L_0x03b8
            r9.L = r8
            goto L_0x03b8
        L_0x010e:
            int r5 = r9.J     // Catch:{ Exception -> 0x0118 }
            int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x0118 }
            r9.J = r5     // Catch:{ Exception -> 0x0118 }
            goto L_0x03b8
        L_0x0118:
            int r5 = r9.J
            int r4 = r10.getInt(r4, r5)
            if (r4 != r8) goto L_0x03b8
            r9.J = r8
            goto L_0x03b8
        L_0x0124:
            int r4 = r10.getInt(r4, r2)
            r9.I = r4
            if (r4 != r6) goto L_0x03b8
            java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            goto L_0x0139
        L_0x012f:
            int r4 = r10.getInt(r4, r2)
            r9.H = r4
            if (r4 != r6) goto L_0x03b8
            java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
        L_0x0139:
            java.lang.String r5 = "ConstraintLayout"
            android.util.Log.e(r5, r4)
            goto L_0x03b8
        L_0x0140:
            float r5 = r9.A
            float r4 = r10.getFloat(r4, r5)
            r9.A = r4
            goto L_0x03b8
        L_0x014a:
            float r5 = r9.f3691z
            float r4 = r10.getFloat(r4, r5)
            r9.f3691z = r4
            goto L_0x03b8
        L_0x0154:
            boolean r5 = r9.T
            boolean r4 = r10.getBoolean(r4, r5)
            r9.T = r4
            goto L_0x03b8
        L_0x015e:
            boolean r5 = r9.S
            boolean r4 = r10.getBoolean(r4, r5)
            r9.S = r4
            goto L_0x03b8
        L_0x0168:
            int r5 = r9.f3690y
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3690y = r4
            goto L_0x03b8
        L_0x0172:
            int r5 = r9.f3689x
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3689x = r4
            goto L_0x03b8
        L_0x017c:
            int r5 = r9.w
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.w = r4
            goto L_0x03b8
        L_0x0186:
            int r5 = r9.f3688v
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3688v = r4
            goto L_0x03b8
        L_0x0190:
            int r5 = r9.f3687u
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3687u = r4
            goto L_0x03b8
        L_0x019a:
            int r5 = r9.f3686t
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3686t = r4
            goto L_0x03b8
        L_0x01a4:
            int r5 = r9.f3685s
            int r5 = r10.getResourceId(r4, r5)
            r9.f3685s = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3685s = r4
            goto L_0x03b8
        L_0x01b6:
            int r5 = r9.f3684r
            int r5 = r10.getResourceId(r4, r5)
            r9.f3684r = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3684r = r4
            goto L_0x03b8
        L_0x01c8:
            int r5 = r9.f3683q
            int r5 = r10.getResourceId(r4, r5)
            r9.f3683q = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3683q = r4
            goto L_0x03b8
        L_0x01da:
            int r5 = r9.f3682p
            int r5 = r10.getResourceId(r4, r5)
            r9.f3682p = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3682p = r4
            goto L_0x03b8
        L_0x01ec:
            int r5 = r9.f3678l
            int r5 = r10.getResourceId(r4, r5)
            r9.f3678l = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3678l = r4
            goto L_0x03b8
        L_0x01fe:
            int r5 = r9.f3676k
            int r5 = r10.getResourceId(r4, r5)
            r9.f3676k = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3676k = r4
            goto L_0x03b8
        L_0x0210:
            int r5 = r9.f3674j
            int r5 = r10.getResourceId(r4, r5)
            r9.f3674j = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3674j = r4
            goto L_0x03b8
        L_0x0222:
            int r5 = r9.f3672i
            int r5 = r10.getResourceId(r4, r5)
            r9.f3672i = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3672i = r4
            goto L_0x03b8
        L_0x0234:
            int r5 = r9.f3670h
            int r5 = r10.getResourceId(r4, r5)
            r9.f3670h = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3670h = r4
            goto L_0x03b8
        L_0x0246:
            int r5 = r9.f3668g
            int r5 = r10.getResourceId(r4, r5)
            r9.f3668g = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3668g = r4
            goto L_0x03b8
        L_0x0258:
            int r5 = r9.f3667f
            int r5 = r10.getResourceId(r4, r5)
            r9.f3667f = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3667f = r4
            goto L_0x03b8
        L_0x026a:
            int r5 = r9.f3665e
            int r5 = r10.getResourceId(r4, r5)
            r9.f3665e = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3665e = r4
            goto L_0x03b8
        L_0x027c:
            int r5 = r9.f3663d
            int r5 = r10.getResourceId(r4, r5)
            r9.f3663d = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3663d = r4
            goto L_0x03b8
        L_0x028e:
            float r5 = r9.f3661c
            float r4 = r10.getFloat(r4, r5)
            r9.f3661c = r4
            goto L_0x03b8
        L_0x0298:
            int r5 = r9.f3659b
            int r4 = r10.getDimensionPixelOffset(r4, r5)
            r9.f3659b = r4
            goto L_0x03b8
        L_0x02a2:
            int r5 = r9.f3657a
            int r4 = r10.getDimensionPixelOffset(r4, r5)
            r9.f3657a = r4
            goto L_0x03b8
        L_0x02ac:
            float r5 = r9.f3681o
            float r4 = r10.getFloat(r4, r5)
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r5
            r9.f3681o = r4
            int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x03b8
            float r4 = r5 - r4
            float r4 = r4 % r5
            r9.f3681o = r4
            goto L_0x03b8
        L_0x02c2:
            int r5 = r9.f3680n
            int r4 = r10.getDimensionPixelSize(r4, r5)
            r9.f3680n = r4
            goto L_0x03b8
        L_0x02cc:
            int r5 = r9.f3679m
            int r5 = r10.getResourceId(r4, r5)
            r9.f3679m = r5
            if (r5 != r0) goto L_0x03b8
            int r4 = r10.getInt(r4, r0)
            r9.f3679m = r4
            goto L_0x03b8
        L_0x02de:
            int r5 = r9.R
            int r4 = r10.getInt(r4, r5)
            r9.R = r4
            goto L_0x03b8
        L_0x02e8:
            java.lang.String r4 = r10.getString(r4)
            r9.U = r4
            goto L_0x03b8
        L_0x02f0:
            int r5 = r9.Q
            int r4 = r10.getDimensionPixelOffset(r4, r5)
            r9.Q = r4
            goto L_0x03b8
        L_0x02fa:
            int r5 = r9.P
            int r4 = r10.getDimensionPixelOffset(r4, r5)
            r9.P = r4
            goto L_0x03b8
        L_0x0304:
            int r4 = r10.getInt(r4, r2)
            r9.G = r4
            goto L_0x03b8
        L_0x030c:
            int r4 = r10.getInt(r4, r2)
            r9.F = r4
            goto L_0x03b8
        L_0x0314:
            float r5 = r9.E
            float r4 = r10.getFloat(r4, r5)
            r9.E = r4
            goto L_0x03b8
        L_0x031e:
            float r5 = r9.D
            float r4 = r10.getFloat(r4, r5)
            r9.D = r4
            goto L_0x03b8
        L_0x0328:
            java.lang.String r4 = r10.getString(r4)
            r9.B = r4
            r9.C = r0
            if (r4 == 0) goto L_0x03b8
            int r4 = r4.length()
            java.lang.String r5 = r9.B
            r7 = 44
            int r5 = r5.indexOf(r7)
            if (r5 <= 0) goto L_0x0362
            int r7 = r4 + -1
            if (r5 >= r7) goto L_0x0362
            java.lang.String r7 = r9.B
            java.lang.String r7 = r7.substring(r2, r5)
            java.lang.String r8 = "W"
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0355
            r9.C = r2
            goto L_0x035f
        L_0x0355:
            java.lang.String r8 = "H"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x035f
            r9.C = r6
        L_0x035f:
            int r5 = r5 + 1
            goto L_0x0363
        L_0x0362:
            r5 = r2
        L_0x0363:
            java.lang.String r7 = r9.B
            r8 = 58
            int r7 = r7.indexOf(r8)
            if (r7 < 0) goto L_0x03a9
            int r4 = r4 + -1
            if (r7 >= r4) goto L_0x03a9
            java.lang.String r4 = r9.B
            java.lang.String r4 = r4.substring(r5, r7)
            java.lang.String r5 = r9.B
            int r7 = r7 + 1
            java.lang.String r5 = r5.substring(r7)
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x03b8
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x03b8
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03b8 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03b8 }
            int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x03b8
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x03b8
            int r7 = r9.C     // Catch:{ NumberFormatException -> 0x03b8 }
            if (r7 != r6) goto L_0x03a4
            float r5 = r5 / r4
            java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03b8 }
            goto L_0x03b8
        L_0x03a4:
            float r4 = r4 / r5
            java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03b8 }
            goto L_0x03b8
        L_0x03a9:
            java.lang.String r4 = r9.B
            java.lang.String r4 = r4.substring(r5)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x03b8
            java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03b8 }
        L_0x03b8:
            int r1 = r1 + 1
            goto L_0x0096
        L_0x03bc:
            r10.recycle()
            r9.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
