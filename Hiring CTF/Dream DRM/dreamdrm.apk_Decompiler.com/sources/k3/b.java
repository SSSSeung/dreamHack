package k3;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import b1.v;
import java.util.WeakHashMap;
import m3.a;
import v0.j;
import x0.d0;
import x0.e0;
import x0.u0;

public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public final boolean D = true;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f3911a;

    /* renamed from: a0  reason: collision with root package name */
    public float f3912a0;

    /* renamed from: b  reason: collision with root package name */
    public float f3913b;

    /* renamed from: b0  reason: collision with root package name */
    public float f3914b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3915c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f3916c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3917d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f3918d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f3919e;

    /* renamed from: e0  reason: collision with root package name */
    public final float f3920e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f3921f = 16;
    public final int f0 = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f3922g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f3923h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f3924i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3925j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3926k;

    /* renamed from: l  reason: collision with root package name */
    public float f3927l;

    /* renamed from: m  reason: collision with root package name */
    public float f3928m;

    /* renamed from: n  reason: collision with root package name */
    public float f3929n;

    /* renamed from: o  reason: collision with root package name */
    public float f3930o;

    /* renamed from: p  reason: collision with root package name */
    public float f3931p;

    /* renamed from: q  reason: collision with root package name */
    public float f3932q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f3933r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f3934s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f3935t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f3936u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f3937v;
    public Typeface w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f3938x;

    /* renamed from: y  reason: collision with root package name */
    public a f3939y;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f3940z = TextUtils.TruncateAt.END;

    public b(View view) {
        this.f3911a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f3917d = new Rect();
        this.f3915c = new Rect();
        this.f3919e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i3, int i6, float f6) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((((float) Color.alpha(i6)) * f6) + (((float) Color.alpha(i3)) * f7)), Math.round((((float) Color.red(i6)) * f6) + (((float) Color.red(i3)) * f7)), Math.round((((float) Color.green(i6)) * f6) + (((float) Color.green(i3)) * f7)), Math.round((((float) Color.blue(i6)) * f6) + (((float) Color.blue(i3)) * f7)));
    }

    public static float f(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        LinearInterpolator linearInterpolator = z2.a.f5933a;
        return ((f7 - f6) * f8) + f6;
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = u0.f5622a;
        boolean z5 = true;
        if (e0.d(this.f3911a) != 1) {
            z5 = false;
        }
        if (!this.D) {
            return z5;
        }
        return (z5 ? j.f5377d : j.f5376c).e(charSequence, charSequence.length());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x010c, code lost:
        if (r12.C != false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.A
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.Rect r0 = r12.f3917d
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r12.f3915c
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r13 - r2
            float r3 = java.lang.Math.abs(r3)
            r4 = 925353388(0x3727c5ac, float:1.0E-5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 >= 0) goto L_0x0026
            r3 = r5
            goto L_0x0027
        L_0x0026:
            r3 = r6
        L_0x0027:
            r7 = 0
            if (r3 == 0) goto L_0x0033
            float r13 = r12.f3924i
            float r14 = r12.V
            r12.F = r2
            android.graphics.Typeface r1 = r12.f3933r
            goto L_0x0073
        L_0x0033:
            float r3 = r12.f3923h
            float r8 = r12.W
            android.graphics.Typeface r9 = r12.f3936u
            float r10 = r13 - r7
            float r10 = java.lang.Math.abs(r10)
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0045
            r4 = r5
            goto L_0x0046
        L_0x0045:
            r4 = r6
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            r12.F = r2
            goto L_0x005a
        L_0x004b:
            float r4 = r12.f3923h
            float r10 = r12.f3924i
            android.animation.TimeInterpolator r11 = r12.Q
            float r13 = f(r4, r10, r13, r11)
            float r4 = r12.f3923h
            float r13 = r13 / r4
            r12.F = r13
        L_0x005a:
            float r13 = r12.f3924i
            float r4 = r12.f3923h
            float r13 = r13 / r4
            float r4 = r1 * r13
            if (r14 == 0) goto L_0x0064
            goto L_0x006f
        L_0x0064:
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x006f
            float r0 = r0 / r13
            float r13 = java.lang.Math.min(r0, r1)
            r0 = r13
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            r13 = r3
            r14 = r8
            r1 = r9
        L_0x0073:
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            android.text.TextPaint r4 = r12.N
            if (r3 <= 0) goto L_0x00c7
            float r3 = r12.G
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0081
            r3 = r5
            goto L_0x0082
        L_0x0081:
            r3 = r6
        L_0x0082:
            float r8 = r12.X
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x008a
            r8 = r5
            goto L_0x008b
        L_0x008a:
            r8 = r6
        L_0x008b:
            android.graphics.Typeface r9 = r12.f3938x
            if (r9 == r1) goto L_0x0091
            r9 = r5
            goto L_0x0092
        L_0x0091:
            r9 = r6
        L_0x0092:
            android.text.StaticLayout r10 = r12.Y
            if (r10 == 0) goto L_0x00a1
            int r10 = r10.getWidth()
            float r10 = (float) r10
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x00a1
            r10 = r5
            goto L_0x00a2
        L_0x00a1:
            r10 = r6
        L_0x00a2:
            if (r3 != 0) goto L_0x00b1
            if (r8 != 0) goto L_0x00b1
            if (r10 != 0) goto L_0x00b1
            if (r9 != 0) goto L_0x00b1
            boolean r3 = r12.M
            if (r3 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r3 = r6
            goto L_0x00b2
        L_0x00b1:
            r3 = r5
        L_0x00b2:
            r12.G = r13
            r12.X = r14
            r12.f3938x = r1
            r12.M = r6
            float r13 = r12.F
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x00c2
            r13 = r5
            goto L_0x00c3
        L_0x00c2:
            r13 = r6
        L_0x00c3:
            r4.setLinearText(r13)
            goto L_0x00c8
        L_0x00c7:
            r3 = r6
        L_0x00c8:
            java.lang.CharSequence r13 = r12.B
            if (r13 == 0) goto L_0x00ce
            if (r3 == 0) goto L_0x0153
        L_0x00ce:
            float r13 = r12.G
            r4.setTextSize(r13)
            android.graphics.Typeface r13 = r12.f3938x
            r4.setTypeface(r13)
            float r13 = r12.X
            r4.setLetterSpacing(r13)
            java.lang.CharSequence r13 = r12.A
            boolean r13 = r12.b(r13)
            r12.C = r13
            int r14 = r12.f3918d0
            if (r14 <= r5) goto L_0x00ee
            if (r13 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r1 = r5
            goto L_0x00ef
        L_0x00ee:
            r1 = r6
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r14 = r5
        L_0x00f3:
            if (r14 != r5) goto L_0x00f8
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ f -> 0x0139 }
            goto L_0x0116
        L_0x00f8:
            int r1 = r12.f3921f     // Catch:{ f -> 0x0139 }
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r13)     // Catch:{ f -> 0x0139 }
            r1 = r1 & 7
            if (r1 == r5) goto L_0x0114
            r2 = 5
            if (r1 == r2) goto L_0x010a
            boolean r1 = r12.C     // Catch:{ f -> 0x0139 }
            if (r1 == 0) goto L_0x010e
            goto L_0x0111
        L_0x010a:
            boolean r1 = r12.C     // Catch:{ f -> 0x0139 }
            if (r1 == 0) goto L_0x0111
        L_0x010e:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ f -> 0x0139 }
            goto L_0x0116
        L_0x0111:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ f -> 0x0139 }
            goto L_0x0116
        L_0x0114:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ f -> 0x0139 }
        L_0x0116:
            java.lang.CharSequence r2 = r12.A     // Catch:{ f -> 0x0139 }
            int r0 = (int) r0     // Catch:{ f -> 0x0139 }
            k3.g r3 = new k3.g     // Catch:{ f -> 0x0139 }
            r3.<init>(r2, r4, r0)     // Catch:{ f -> 0x0139 }
            android.text.TextUtils$TruncateAt r0 = r12.f3940z     // Catch:{ f -> 0x0139 }
            r3.f3959l = r0     // Catch:{ f -> 0x0139 }
            r3.f3958k = r13     // Catch:{ f -> 0x0139 }
            r3.f3952e = r1     // Catch:{ f -> 0x0139 }
            r3.f3957j = r6     // Catch:{ f -> 0x0139 }
            r3.f3953f = r14     // Catch:{ f -> 0x0139 }
            float r13 = r12.f3920e0     // Catch:{ f -> 0x0139 }
            r3.f3954g = r7     // Catch:{ f -> 0x0139 }
            r3.f3955h = r13     // Catch:{ f -> 0x0139 }
            int r13 = r12.f0     // Catch:{ f -> 0x0139 }
            r3.f3956i = r13     // Catch:{ f -> 0x0139 }
            android.text.StaticLayout r13 = r3.a()     // Catch:{ f -> 0x0139 }
            goto L_0x0148
        L_0x0139:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()
            java.lang.String r14 = r14.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r14, r13)
            r13 = 0
        L_0x0148:
            r13.getClass()
            r12.Y = r13
            java.lang.CharSequence r13 = r13.getText()
            r12.B = r13
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.c(float, boolean):void");
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f3924i);
        textPaint.setTypeface(this.f3933r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3935t;
            if (typeface != null) {
                this.f3934s = v.F(configuration, typeface);
            }
            Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.f3937v = v.F(configuration, typeface2);
            }
            Typeface typeface3 = this.f3934s;
            if (typeface3 == null) {
                typeface3 = this.f3935t;
            }
            this.f3933r = typeface3;
            Typeface typeface4 = this.f3937v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.f3936u = typeface4;
            h(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.view.View r2 = r0.f3911a
            int r3 = r2.getHeight()
            if (r3 <= 0) goto L_0x0012
            int r3 = r2.getWidth()
            if (r3 > 0) goto L_0x0014
        L_0x0012:
            if (r1 == 0) goto L_0x01e9
        L_0x0014:
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.c(r3, r1)
            java.lang.CharSequence r4 = r0.B
            android.text.TextPaint r5 = r0.N
            if (r4 == 0) goto L_0x0030
            android.text.StaticLayout r6 = r0.Y
            if (r6 == 0) goto L_0x0030
            int r6 = r6.getWidth()
            float r6 = (float) r6
            android.text.TextUtils$TruncateAt r7 = r0.f3940z
            java.lang.CharSequence r4 = android.text.TextUtils.ellipsize(r4, r5, r6, r7)
            r0.f3916c0 = r4
        L_0x0030:
            java.lang.CharSequence r4 = r0.f3916c0
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x0041
            int r8 = r4.length()
            float r4 = r5.measureText(r4, r6, r8)
            r0.Z = r4
            goto L_0x0043
        L_0x0041:
            r0.Z = r7
        L_0x0043:
            int r4 = r0.f3922g
            boolean r8 = r0.C
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r8)
            r8 = r4 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r9 = r0.f3917d
            r10 = 80
            r11 = 48
            r12 = 1073741824(0x40000000, float:2.0)
            if (r8 == r11) goto L_0x0075
            if (r8 == r10) goto L_0x006a
            float r8 = r5.descent()
            float r13 = r5.ascent()
            float r8 = r8 - r13
            float r8 = r8 / r12
            int r13 = r9.centerY()
            float r13 = (float) r13
            float r13 = r13 - r8
            goto L_0x0072
        L_0x006a:
            int r8 = r9.bottom
            float r8 = (float) r8
            float r13 = r5.ascent()
            float r13 = r13 + r8
        L_0x0072:
            r0.f3928m = r13
            goto L_0x007a
        L_0x0075:
            int r8 = r9.top
            float r8 = (float) r8
            r0.f3928m = r8
        L_0x007a:
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r8
            r13 = 5
            r14 = 1
            if (r4 == r14) goto L_0x008e
            if (r4 == r13) goto L_0x0088
            int r4 = r9.left
            float r4 = (float) r4
            goto L_0x0097
        L_0x0088:
            int r4 = r9.right
            float r4 = (float) r4
            float r15 = r0.Z
            goto L_0x0096
        L_0x008e:
            int r4 = r9.centerX()
            float r4 = (float) r4
            float r15 = r0.Z
            float r15 = r15 / r12
        L_0x0096:
            float r4 = r4 - r15
        L_0x0097:
            r0.f3930o = r4
            r0.c(r7, r1)
            android.text.StaticLayout r1 = r0.Y
            if (r1 == 0) goto L_0x00a6
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00a7
        L_0x00a6:
            r1 = r7
        L_0x00a7:
            android.text.StaticLayout r4 = r0.Y
            if (r4 == 0) goto L_0x00b5
            int r15 = r0.f3918d0
            if (r15 <= r14) goto L_0x00b5
            int r4 = r4.getWidth()
            float r4 = (float) r4
            goto L_0x00c3
        L_0x00b5:
            java.lang.CharSequence r4 = r0.B
            if (r4 == 0) goto L_0x00c2
            int r15 = r4.length()
            float r4 = r5.measureText(r4, r6, r15)
            goto L_0x00c3
        L_0x00c2:
            r4 = r7
        L_0x00c3:
            android.text.StaticLayout r6 = r0.Y
            if (r6 == 0) goto L_0x00ca
            r6.getLineCount()
        L_0x00ca:
            int r6 = r0.f3921f
            boolean r15 = r0.C
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r15)
            r15 = r6 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r7 = r0.f3915c
            if (r15 == r11) goto L_0x00ee
            if (r15 == r10) goto L_0x00e4
            float r1 = r1 / r12
            int r10 = r7.centerY()
            float r10 = (float) r10
            float r10 = r10 - r1
            r0.f3927l = r10
            goto L_0x00f3
        L_0x00e4:
            int r10 = r7.bottom
            float r10 = (float) r10
            float r10 = r10 - r1
            float r1 = r5.descent()
            float r1 = r1 + r10
            goto L_0x00f1
        L_0x00ee:
            int r1 = r7.top
            float r1 = (float) r1
        L_0x00f1:
            r0.f3927l = r1
        L_0x00f3:
            r1 = r6 & r8
            if (r1 == r14) goto L_0x0101
            if (r1 == r13) goto L_0x00fd
            int r1 = r7.left
            float r1 = (float) r1
            goto L_0x0108
        L_0x00fd:
            int r1 = r7.right
            float r1 = (float) r1
            goto L_0x0107
        L_0x0101:
            int r1 = r7.centerX()
            float r1 = (float) r1
            float r4 = r4 / r12
        L_0x0107:
            float r1 = r1 - r4
        L_0x0108:
            r0.f3929n = r1
            android.graphics.Bitmap r1 = r0.E
            r4 = 0
            if (r1 == 0) goto L_0x0114
            r1.recycle()
            r0.E = r4
        L_0x0114:
            float r1 = r0.f3913b
            r0.l(r1)
            float r1 = r0.f3913b
            int r6 = r7.left
            float r6 = (float) r6
            int r8 = r9.left
            float r8 = (float) r8
            android.animation.TimeInterpolator r10 = r0.P
            float r6 = f(r6, r8, r1, r10)
            android.graphics.RectF r8 = r0.f3919e
            r8.left = r6
            float r6 = r0.f3927l
            float r10 = r0.f3928m
            android.animation.TimeInterpolator r11 = r0.P
            float r6 = f(r6, r10, r1, r11)
            r8.top = r6
            int r6 = r7.right
            float r6 = (float) r6
            int r10 = r9.right
            float r10 = (float) r10
            android.animation.TimeInterpolator r11 = r0.P
            float r6 = f(r6, r10, r1, r11)
            r8.right = r6
            int r6 = r7.bottom
            float r6 = (float) r6
            int r7 = r9.bottom
            float r7 = (float) r7
            android.animation.TimeInterpolator r9 = r0.P
            float r6 = f(r6, r7, r1, r9)
            r8.bottom = r6
            float r6 = r0.f3929n
            float r7 = r0.f3930o
            android.animation.TimeInterpolator r8 = r0.P
            float r6 = f(r6, r7, r1, r8)
            r0.f3931p = r6
            float r6 = r0.f3927l
            float r7 = r0.f3928m
            android.animation.TimeInterpolator r8 = r0.P
            float r6 = f(r6, r7, r1, r8)
            r0.f3932q = r6
            r0.l(r1)
            float r6 = r3 - r1
            k1.b r7 = z2.a.f5934b
            r8 = 0
            float r6 = f(r8, r3, r6, r7)
            float r6 = r3 - r6
            r0.f3912a0 = r6
            java.util.WeakHashMap r6 = x0.u0.f5622a
            x0.d0.k(r2)
            float r3 = f(r3, r8, r1, r7)
            r0.f3914b0 = r3
            x0.d0.k(r2)
            android.content.res.ColorStateList r3 = r0.f3926k
            android.content.res.ColorStateList r6 = r0.f3925j
            if (r3 == r6) goto L_0x019e
            int r3 = r0.e(r6)
            android.content.res.ColorStateList r6 = r0.f3926k
            int r6 = r0.e(r6)
            int r3 = a(r3, r6, r1)
            goto L_0x01a2
        L_0x019e:
            int r3 = r0.e(r3)
        L_0x01a2:
            r5.setColor(r3)
            float r3 = r0.V
            float r6 = r0.W
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b1
            float r3 = f(r6, r3, r1, r7)
        L_0x01b1:
            r5.setLetterSpacing(r3)
            float r3 = r0.R
            r6 = 0
            float r3 = f(r6, r3, r1, r4)
            r0.H = r3
            float r3 = r0.S
            float r3 = f(r6, r3, r1, r4)
            r0.I = r3
            float r3 = r0.T
            float r3 = f(r6, r3, r1, r4)
            r0.J = r3
            int r3 = r0.e(r4)
            android.content.res.ColorStateList r4 = r0.U
            int r4 = r0.e(r4)
            int r1 = a(r3, r4, r1)
            r0.K = r1
            float r3 = r0.H
            float r4 = r0.I
            float r6 = r0.J
            r5.setShadowLayer(r3, r4, r6, r1)
            x0.d0.k(r2)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.h(boolean):void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f3926k != colorStateList || this.f3925j != colorStateList) {
            this.f3926k = colorStateList;
            this.f3925j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        a aVar = this.f3939y;
        if (aVar != null) {
            aVar.f4187i = true;
        }
        if (this.f3935t == typeface) {
            return false;
        }
        this.f3935t = typeface;
        Typeface F2 = v.F(this.f3911a.getContext().getResources().getConfiguration(), typeface);
        this.f3934s = F2;
        if (F2 == null) {
            F2 = this.f3935t;
        }
        this.f3933r = F2;
        return true;
    }

    public final void k(float f6) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f3913b) {
            this.f3913b = f6;
            Rect rect = this.f3915c;
            Rect rect2 = this.f3917d;
            float f7 = f((float) rect.left, (float) rect2.left, f6, this.P);
            RectF rectF = this.f3919e;
            rectF.left = f7;
            rectF.top = f(this.f3927l, this.f3928m, f6, this.P);
            rectF.right = f((float) rect.right, (float) rect2.right, f6, this.P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f6, this.P);
            this.f3931p = f(this.f3929n, this.f3930o, f6, this.P);
            this.f3932q = f(this.f3927l, this.f3928m, f6, this.P);
            l(f6);
            k1.b bVar = z2.a.f5934b;
            this.f3912a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, bVar);
            WeakHashMap weakHashMap = u0.f5622a;
            View view = this.f3911a;
            d0.k(view);
            this.f3914b0 = f(1.0f, 0.0f, f6, bVar);
            d0.k(view);
            ColorStateList colorStateList = this.f3926k;
            ColorStateList colorStateList2 = this.f3925j;
            TextPaint textPaint = this.N;
            textPaint.setColor(colorStateList != colorStateList2 ? a(e(colorStateList2), e(this.f3926k), f6) : e(colorStateList));
            float f8 = this.V;
            float f9 = this.W;
            if (f8 != f9) {
                f8 = f(f9, f8, f6, bVar);
            }
            textPaint.setLetterSpacing(f8);
            this.H = f(0.0f, this.R, f6, (TimeInterpolator) null);
            this.I = f(0.0f, this.S, f6, (TimeInterpolator) null);
            this.J = f(0.0f, this.T, f6, (TimeInterpolator) null);
            int a6 = a(e((ColorStateList) null), e(this.U), f6);
            this.K = a6;
            textPaint.setShadowLayer(this.H, this.I, this.J, a6);
            d0.k(view);
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap weakHashMap = u0.f5622a;
        d0.k(this.f3911a);
    }

    public final void m(Typeface typeface) {
        boolean z5;
        boolean j6 = j(typeface);
        if (this.w != typeface) {
            this.w = typeface;
            Typeface F2 = v.F(this.f3911a.getContext().getResources().getConfiguration(), typeface);
            this.f3937v = F2;
            if (F2 == null) {
                F2 = this.w;
            }
            this.f3936u = F2;
            z5 = true;
        } else {
            z5 = false;
        }
        if (j6 || z5) {
            h(false);
        }
    }
}
