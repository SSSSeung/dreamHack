package p0;

import b1.o;

public final class q {

    /* renamed from: k  reason: collision with root package name */
    public static final q f4414k;

    /* renamed from: a  reason: collision with root package name */
    public final float f4415a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4416b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4417c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4418d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4419e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4420f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4421g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4422h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4423i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4424j;

    static {
        float f6;
        float f7;
        float[] fArr = o.f1526m;
        float f0 = (float) ((((double) o.f0()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = o.f1524k;
        float f8 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f9 = fArr[1];
        float f10 = fArr3[1] * f9;
        float f11 = fArr[2];
        float f12 = (fArr3[2] * f11) + f10 + (fArr3[0] * f8);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[2] * f11) + (fArr4[1] * f9) + (fArr4[0] * f8);
        float[] fArr5 = fArr2[2];
        float f14 = (f11 * fArr5[2]) + (f9 * fArr5[1]) + (f8 * fArr5[0]);
        if (((double) 1.0f) >= 0.9d) {
            f7 = 0.100000046f;
            f6 = 0.59f;
        } else {
            f7 = 0.12999998f;
            f6 = 0.525f;
        }
        float f15 = f7 + f6;
        float exp = (1.0f - (((float) Math.exp((double) (((-f0) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d6 = (double) exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp};
        float f16 = 1.0f / ((5.0f * f0) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float cbrt = (0.1f * f18 * f18 * ((float) Math.cbrt(((double) f0) * 5.0d))) + (f17 * f0);
        float f02 = o.f0() / fArr[1];
        double d7 = (double) f02;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f14)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f13)) / 100.0d, 0.42d), pow2};
        float f19 = fArr7[0];
        float f20 = fArr7[1];
        f4414k = new q(f02, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f19 * 400.0f) / (f19 + 27.13f)) * 2.0f) + ((f20 * 400.0f) / (f20 + 27.13f))) * pow, pow, pow, f15, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public q(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f4420f = f6;
        this.f4415a = f7;
        this.f4416b = f8;
        this.f4417c = f9;
        this.f4418d = f10;
        this.f4419e = f11;
        this.f4421g = fArr;
        this.f4422h = f12;
        this.f4423i = f13;
        this.f4424j = f14;
    }
}
