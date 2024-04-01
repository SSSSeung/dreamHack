package p0;

import android.graphics.Color;
import b1.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f4379a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4380b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4381c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4382d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4383e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4384f;

    public a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f4379a = f6;
        this.f4380b = f7;
        this.f4381c = f8;
        this.f4382d = f9;
        this.f4383e = f10;
        this.f4384f = f11;
    }

    public static a a(int i3) {
        q qVar = q.f4414k;
        float H = o.H(Color.red(i3));
        float H2 = o.H(Color.green(i3));
        float H3 = o.H(Color.blue(i3));
        float[][] fArr = o.f1527n;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * H3) + (fArr2[1] * H2) + (fArr2[0] * H);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * H3) + (fArr3[1] * H2) + (fArr3[0] * H);
        float[] fArr4 = fArr[2];
        float f8 = (H3 * fArr4[2]) + (H2 * fArr4[1]) + (H * fArr4[0]);
        float[][] fArr5 = o.f1524k;
        float[] fArr6 = fArr5[0];
        float f9 = (fArr6[2] * f8) + (fArr6[1] * f7) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f10 = fArr7[1] * f7;
        float f11 = fArr7[2] * f8;
        float[] fArr8 = fArr5[2];
        float f12 = f6 * fArr8[0];
        float f13 = f8 * fArr8[2];
        float[] fArr9 = qVar.f4421g;
        float f14 = fArr9[0] * f9;
        float f15 = fArr9[1] * (f11 + f10 + (fArr7[0] * f6));
        float f16 = fArr9[2] * (f13 + (f7 * fArr8[1]) + f12);
        float abs = Math.abs(f14);
        float f17 = qVar.f4422h;
        float pow = (float) Math.pow(((double) (abs * f17)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f15) * f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f16) * f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = (double) signum3;
        float f18 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d6)) / 11.0f;
        float f19 = ((float) (((double) (signum + signum2)) - (d6 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f19, (double) f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float f25 = f22 * qVar.f4416b;
        float f26 = qVar.f4415a;
        double d7 = (double) (f25 / f26);
        float f27 = qVar.f4424j;
        float f28 = qVar.f4418d;
        float pow4 = ((float) Math.pow(d7, (double) (f27 * f28))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f29 = f26 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) qVar.f4420f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f23) < 20.14d ? 360.0f + f23 : f23)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.f4419e) * qVar.f4417c) * ((float) Math.sqrt((double) ((f19 * f19) + (f18 * f18))))) / (f21 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        Math.sqrt((double) ((pow5 * f28) / f29));
        float f30 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((qVar.f4423i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d8 = (double) f24;
        return new a(f23, sqrt, pow4, f30, ((float) Math.cos(d8)) * log, log * ((float) Math.sin(d8)));
    }

    public static a b(float f6, float f7, float f8) {
        q qVar = q.f4414k;
        float f9 = qVar.f4418d;
        double d6 = ((double) f6) / 100.0d;
        Math.sqrt(d6);
        Math.sqrt((double) (((f7 / ((float) Math.sqrt(d6))) * qVar.f4418d) / (qVar.f4415a + 4.0f)));
        float f10 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((((double) (qVar.f4423i * f7)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (double) ((3.1415927f * f8) / 180.0f);
        return new a(f8, f7, f6, f10, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public final int c(q qVar) {
        float f6;
        q qVar2 = qVar;
        float f7 = this.f4380b;
        int i3 = (((double) f7) > 0.0d ? 1 : (((double) f7) == 0.0d ? 0 : -1));
        float f8 = this.f4381c;
        if (i3 != 0) {
            double d6 = (double) f8;
            if (d6 != 0.0d) {
                f6 = f7 / ((float) Math.sqrt(d6 / 100.0d));
                float pow = (float) Math.pow(((double) f6) / Math.pow(1.64d - Math.pow(0.29d, (double) qVar2.f4420f), 0.73d), 1.1111111111111112d);
                double d7 = (double) ((this.f4379a * 3.1415927f) / 180.0f);
                float pow2 = qVar2.f4415a * ((float) Math.pow(((double) f8) / 100.0d, (1.0d / ((double) qVar2.f4418d)) / ((double) qVar2.f4424j)));
                float cos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f * 3846.1538f * qVar2.f4419e * qVar2.f4417c;
                float f9 = pow2 / qVar2.f4416b;
                float sin = (float) Math.sin(d7);
                float cos2 = (float) Math.cos(d7);
                float f10 = 11.0f * pow * cos2;
                float f11 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f10 + (cos * 23.0f)));
                float f12 = cos2 * f11;
                float f13 = f11 * sin;
                float f14 = f9 * 460.0f;
                float f15 = ((288.0f * f13) + ((451.0f * f12) + f14)) / 1403.0f;
                float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
                float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))));
                float signum = Math.signum(f15);
                float f18 = 100.0f / qVar2.f4422h;
                float pow3 = signum * f18 * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = Math.signum(f16) * f18 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
                float[] fArr = qVar2.f4421g;
                float f19 = pow3 / fArr[0];
                float f20 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f17) * f18) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = o.f1525l;
                float[] fArr3 = fArr2[0];
                float f21 = fArr3[1] * f20;
                float f22 = (fArr3[2] * signum3) + f21 + (fArr3[0] * f19);
                float[] fArr4 = fArr2[1];
                float f23 = fArr4[1] * f20;
                float f24 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f25 = f19 * fArr5[0];
                return q0.a.a((double) f22, (double) (f24 + f23 + (fArr4[0] * f19)), (double) ((signum3 * fArr5[2]) + (f20 * fArr5[1]) + f25));
            }
        }
        f6 = 0.0f;
        float pow4 = (float) Math.pow(((double) f6) / Math.pow(1.64d - Math.pow(0.29d, (double) qVar2.f4420f), 0.73d), 1.1111111111111112d);
        double d72 = (double) ((this.f4379a * 3.1415927f) / 180.0f);
        float pow22 = qVar2.f4415a * ((float) Math.pow(((double) f8) / 100.0d, (1.0d / ((double) qVar2.f4418d)) / ((double) qVar2.f4424j)));
        float cos3 = ((float) (Math.cos(2.0d + d72) + 3.8d)) * 0.25f * 3846.1538f * qVar2.f4419e * qVar2.f4417c;
        float f92 = pow22 / qVar2.f4416b;
        float sin2 = (float) Math.sin(d72);
        float cos22 = (float) Math.cos(d72);
        float f102 = 11.0f * pow4 * cos22;
        float f112 = (((0.305f + f92) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f102 + (cos3 * 23.0f)));
        float f122 = cos22 * f112;
        float f132 = f112 * sin2;
        float f142 = f92 * 460.0f;
        float f152 = ((288.0f * f132) + ((451.0f * f122) + f142)) / 1403.0f;
        float f162 = ((f142 - (891.0f * f122)) - (261.0f * f132)) / 1403.0f;
        float f172 = ((f142 - (f122 * 220.0f)) - (f132 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f152)) * 27.13d) / (400.0d - ((double) Math.abs(f152))));
        float signum4 = Math.signum(f152);
        float f182 = 100.0f / qVar2.f4422h;
        float pow32 = signum4 * f182 * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = Math.signum(f162) * f182 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f162)) * 27.13d) / (400.0d - ((double) Math.abs(f162))))), 2.380952380952381d));
        float[] fArr6 = qVar2.f4421g;
        float f192 = pow32 / fArr6[0];
        float f202 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f172) * f182) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f172)) * 27.13d) / (400.0d - ((double) Math.abs(f172))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = o.f1525l;
        float[] fArr32 = fArr22[0];
        float f212 = fArr32[1] * f202;
        float f222 = (fArr32[2] * signum32) + f212 + (fArr32[0] * f192);
        float[] fArr42 = fArr22[1];
        float f232 = fArr42[1] * f202;
        float f242 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f252 = f192 * fArr52[0];
        return q0.a.a((double) f222, (double) (f242 + f232 + (fArr42[0] * f192)), (double) ((signum32 * fArr52[2]) + (f202 * fArr52[1]) + f252));
    }
}
