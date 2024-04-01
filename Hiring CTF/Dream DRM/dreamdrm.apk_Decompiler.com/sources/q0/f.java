package q0;

import android.graphics.Path;
import android.util.Log;
import com.bumptech.glide.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public char f4874a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f4875b;

    public f(char c6, float[] fArr) {
        this.f4874a = c6;
        this.f4875b = fArr;
    }

    public static void a(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z5, boolean z6) {
        double d6;
        double d7;
        float f13 = f6;
        float f14 = f8;
        float f15 = f10;
        boolean z7 = z6;
        double radians = Math.toRadians((double) f12);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d8 = (double) f13;
        double d9 = (double) f7;
        double d10 = (d9 * sin) + (d8 * cos);
        double d11 = d8;
        double d12 = (double) f15;
        double d13 = d10 / d12;
        double d14 = radians;
        double d15 = (double) f11;
        double d16 = ((d9 * cos) + (((double) (-f13)) * sin)) / d15;
        double d17 = d9;
        double d18 = (double) f9;
        double d19 = ((d18 * sin) + (((double) f14) * cos)) / d12;
        double d20 = ((d18 * cos) + (((double) (-f14)) * sin)) / d15;
        double d21 = d13 - d19;
        double d22 = d16 - d20;
        double d23 = (d13 + d19) / 2.0d;
        double d24 = (d16 + d20) / 2.0d;
        double d25 = sin;
        double d26 = (d22 * d22) + (d21 * d21);
        if (d26 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d27 = (1.0d / d26) - 0.25d;
        if (d27 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d26);
            float sqrt = (float) (Math.sqrt(d26) / 1.99999d);
            a(path, f6, f7, f8, f9, f15 * sqrt, f11 * sqrt, f12, z5, z6);
            return;
        }
        double sqrt2 = Math.sqrt(d27);
        double d28 = d21 * sqrt2;
        double d29 = sqrt2 * d22;
        if (z5 == z7) {
            d7 = d23 - d29;
            d6 = d24 + d28;
        } else {
            d7 = d23 + d29;
            d6 = d24 - d28;
        }
        double atan2 = Math.atan2(d16 - d6, d13 - d7);
        double atan22 = Math.atan2(d20 - d6, d19 - d7) - atan2;
        int i3 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z7 != (i3 >= 0)) {
            atan22 = i3 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d30 = d7 * d12;
        double d31 = d6 * d15;
        double d32 = (d30 * cos) - (d31 * d25);
        double d33 = (d31 * cos) + (d30 * d25);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d14);
        double sin2 = Math.sin(d14);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d34 = -d12;
        double d35 = d34 * cos2;
        double d36 = d15 * sin2;
        double d37 = (d35 * sin3) - (d36 * cos3);
        double d38 = d34 * sin2;
        double d39 = d15 * cos2;
        double d40 = (cos3 * d39) + (sin3 * d38);
        double d41 = d39;
        double d42 = atan22 / ((double) ceil);
        int i6 = 0;
        while (i6 < ceil) {
            double d43 = atan2 + d42;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            double d44 = d42;
            double d45 = (((d12 * cos2) * cos4) + d32) - (d36 * sin4);
            double d46 = d41;
            double d47 = d32;
            double d48 = (d46 * sin4) + (d12 * sin2 * cos4) + d33;
            double d49 = (d35 * sin4) - (d36 * cos4);
            double d50 = (cos4 * d46) + (sin4 * d38);
            double d51 = d43 - atan2;
            double tan = Math.tan(d51 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
            double d52 = d43;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d37 * sqrt3) + d11), (float) ((d40 * sqrt3) + d17), (float) (d45 - (sqrt3 * d49)), (float) (d48 - (sqrt3 * d50)), (float) d45, (float) d48);
            i6++;
            atan2 = d52;
            d38 = d38;
            cos2 = cos2;
            ceil = ceil;
            d40 = d50;
            d12 = d12;
            d37 = d49;
            d11 = d45;
            d17 = d48;
            d32 = d47;
            d42 = d44;
            d41 = d46;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i3;
        float f6;
        float f7;
        int i6;
        int i7;
        char c6;
        f fVar;
        int i8;
        char c7;
        f fVar2;
        int i9;
        float f8;
        float f9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        f[] fVarArr2 = fVarArr;
        Path path2 = path;
        int i12 = 6;
        float[] fArr = new float[6];
        char c8 = 'm';
        int i13 = 0;
        char c9 = 'm';
        int i14 = 0;
        while (i14 < fVarArr2.length) {
            f fVar3 = fVarArr2[i14];
            char c10 = fVar3.f4874a;
            float f31 = fArr[i13];
            float f32 = fArr[1];
            float f33 = fArr[2];
            float f34 = fArr[3];
            float f35 = fArr[4];
            float f36 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = i12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f35, f36);
                    f31 = f35;
                    f33 = f31;
                    f32 = f36;
                    f34 = f32;
                    break;
            }
            i3 = 2;
            float f37 = f35;
            float f38 = f36;
            float f39 = f31;
            float f40 = f32;
            int i15 = i13;
            while (true) {
                float[] fArr2 = fVar3.f4875b;
                if (i15 < fArr2.length) {
                    if (c10 != 'A') {
                        if (c10 != 'C') {
                            if (c10 == 'H') {
                                float[] fArr3 = fArr2;
                                i6 = i15;
                                c6 = c10;
                                fVar = fVar3;
                                i7 = i14;
                                int i16 = i6 + 0;
                                path2.lineTo(fArr3[i16], f40);
                                f39 = fArr3[i16];
                            } else if (c10 == 'Q') {
                                float[] fArr4 = fArr2;
                                i10 = i15;
                                c6 = c10;
                                fVar = fVar3;
                                i7 = i14;
                                int i17 = i10 + 0;
                                int i18 = i10 + 1;
                                int i19 = i10 + 2;
                                int i20 = i10 + 3;
                                path2.quadTo(fArr4[i17], fArr4[i18], fArr4[i19], fArr4[i20]);
                                f11 = fArr4[i17];
                                f10 = fArr4[i18];
                                f39 = fArr4[i19];
                                f40 = fArr4[i20];
                            } else if (c10 == 'V') {
                                float[] fArr5 = fArr2;
                                i6 = i15;
                                c6 = c10;
                                fVar = fVar3;
                                i7 = i14;
                                int i21 = i6 + 0;
                                path2.lineTo(f39, fArr5[i21]);
                                f40 = fArr5[i21];
                            } else if (c10 != 'a') {
                                if (c10 != 'c') {
                                    if (c10 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i6 = i15;
                                        float f41 = f40;
                                        int i22 = i6 + 0;
                                        path2.rLineTo(fArr6[i22], 0.0f);
                                        f39 += fArr6[i22];
                                    } else if (c10 != 'q') {
                                        if (c10 != 'v') {
                                            if (c10 != 'L') {
                                                if (c10 == 'M') {
                                                    float[] fArr7 = fArr2;
                                                    i6 = i15;
                                                    f22 = fArr7[i6 + 0];
                                                    f21 = fArr7[i6 + 1];
                                                    if (i6 > 0) {
                                                        path2.lineTo(f22, f21);
                                                    } else {
                                                        path2.moveTo(f22, f21);
                                                        f37 = f22;
                                                        f38 = f21;
                                                    }
                                                } else if (c10 == 'S') {
                                                    float[] fArr8 = fArr2;
                                                    i11 = i15;
                                                    float f42 = f40;
                                                    float f43 = f39;
                                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                        f23 = (f42 * 2.0f) - f6;
                                                        f24 = (f43 * 2.0f) - f7;
                                                    } else {
                                                        f24 = f43;
                                                        f23 = f42;
                                                    }
                                                    int i23 = i11 + 0;
                                                    int i24 = i11 + 1;
                                                    int i25 = i11 + 2;
                                                    int i26 = i11 + 3;
                                                    path.cubicTo(f24, f23, fArr8[i23], fArr8[i24], fArr8[i25], fArr8[i26]);
                                                    float f44 = fArr8[i23];
                                                    float f45 = fArr8[i24];
                                                    f13 = fArr8[i25];
                                                    f12 = fArr8[i26];
                                                    f7 = f44;
                                                    f6 = f45;
                                                    f39 = f13;
                                                    f40 = f12;
                                                } else if (c10 == 'T') {
                                                    float[] fArr9 = fArr2;
                                                    i6 = i15;
                                                    float f46 = f40;
                                                    float f47 = f39;
                                                    if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                        f25 = (f47 * 2.0f) - f7;
                                                        f26 = (f46 * 2.0f) - f6;
                                                    } else {
                                                        f25 = f47;
                                                        f26 = f46;
                                                    }
                                                    int i27 = i6 + 0;
                                                    int i28 = i6 + 1;
                                                    path2.quadTo(f25, f26, fArr9[i27], fArr9[i28]);
                                                    f6 = f26;
                                                    f7 = f25;
                                                    c6 = c10;
                                                    fVar = fVar3;
                                                    i7 = i14;
                                                    f39 = fArr9[i27];
                                                    f40 = fArr9[i28];
                                                } else if (c10 == 'l') {
                                                    float[] fArr10 = fArr2;
                                                    i6 = i15;
                                                    f19 = f40;
                                                    int i29 = i6 + 0;
                                                    int i30 = i6 + 1;
                                                    path2.rLineTo(fArr10[i29], fArr10[i30]);
                                                    f39 += fArr10[i29];
                                                    f20 = fArr10[i30];
                                                } else if (c10 == c8) {
                                                    float[] fArr11 = fArr2;
                                                    i6 = i15;
                                                    float f48 = fArr11[i6 + 0];
                                                    f39 += f48;
                                                    float f49 = fArr11[i6 + 1];
                                                    f40 += f49;
                                                    if (i6 > 0) {
                                                        path2.rLineTo(f48, f49);
                                                    } else {
                                                        path2.rMoveTo(f48, f49);
                                                        f38 = f40;
                                                        f37 = f39;
                                                    }
                                                } else if (c10 != 's') {
                                                    if (c10 == 't') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f29 = f39 - f7;
                                                            f30 = f40 - f6;
                                                        } else {
                                                            f30 = 0.0f;
                                                            f29 = 0.0f;
                                                        }
                                                        int i31 = i15 + 0;
                                                        int i32 = i15 + 1;
                                                        path2.rQuadTo(f29, f30, fArr2[i31], fArr2[i32]);
                                                        float f50 = f29 + f39;
                                                        float f51 = f30 + f40;
                                                        f39 += fArr2[i31];
                                                        f40 += fArr2[i32];
                                                        f6 = f51;
                                                        f7 = f50;
                                                    }
                                                    i6 = i15;
                                                } else {
                                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                        float f52 = f39 - f7;
                                                        f28 = f40 - f6;
                                                        f27 = f52;
                                                    } else {
                                                        f28 = 0.0f;
                                                        f27 = 0.0f;
                                                    }
                                                    int i33 = i15 + 0;
                                                    int i34 = i15 + 1;
                                                    int i35 = i15 + 2;
                                                    int i36 = i15 + 3;
                                                    float[] fArr12 = fArr2;
                                                    i11 = i15;
                                                    f14 = f40;
                                                    float f53 = f39;
                                                    path.rCubicTo(f27, f28, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                                    f17 = fArr12[i33] + f53;
                                                    f16 = fArr12[i34] + f14;
                                                    f15 = f53 + fArr12[i35];
                                                    f18 = fArr12[i36];
                                                }
                                                f39 = f37;
                                                f40 = f38;
                                            } else {
                                                float[] fArr13 = fArr2;
                                                i6 = i15;
                                                int i37 = i6 + 0;
                                                int i38 = i6 + 1;
                                                path2.lineTo(fArr13[i37], fArr13[i38]);
                                                f22 = fArr13[i37];
                                                f21 = fArr13[i38];
                                            }
                                            f39 = f22;
                                            f40 = f21;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i6 = i15;
                                            f19 = f40;
                                            float f54 = f39;
                                            int i39 = i6 + 0;
                                            path2.rLineTo(0.0f, fArr14[i39]);
                                            f20 = fArr14[i39];
                                        }
                                        f40 = f19 + f20;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i11 = i15;
                                        f14 = f40;
                                        float f55 = f39;
                                        int i40 = i11 + 0;
                                        int i41 = i11 + 1;
                                        int i42 = i11 + 2;
                                        int i43 = i11 + 3;
                                        path2.rQuadTo(fArr15[i40], fArr15[i41], fArr15[i42], fArr15[i43]);
                                        f17 = fArr15[i40] + f55;
                                        f16 = fArr15[i41] + f14;
                                        float f56 = f55 + fArr15[i42];
                                        float f57 = fArr15[i43];
                                        f15 = f56;
                                        f18 = f57;
                                    }
                                    c6 = c10;
                                    fVar = fVar3;
                                    i7 = i14;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i11 = i15;
                                    f14 = f40;
                                    float f58 = f39;
                                    int i44 = i11 + 2;
                                    int i45 = i11 + 3;
                                    int i46 = i11 + 4;
                                    int i47 = i11 + 5;
                                    path.rCubicTo(fArr16[i11 + 0], fArr16[i11 + 1], fArr16[i44], fArr16[i45], fArr16[i46], fArr16[i47]);
                                    f17 = fArr16[i44] + f58;
                                    f16 = fArr16[i45] + f14;
                                    f15 = f58 + fArr16[i46];
                                    f18 = fArr16[i47];
                                }
                                f12 = f14 + f18;
                                f7 = f17;
                                f6 = f16;
                                f13 = f15;
                                f39 = f13;
                                f40 = f12;
                                c6 = c10;
                                fVar = fVar3;
                                i7 = i14;
                            } else {
                                float[] fArr17 = fArr2;
                                i8 = i15;
                                float f59 = f40;
                                float f60 = f39;
                                int i48 = i8 + 5;
                                int i49 = i8 + 6;
                                c7 = c10;
                                fVar2 = fVar3;
                                i9 = i14;
                                a(path, f60, f59, fArr17[i48] + f60, fArr17[i49] + f59, fArr17[i8 + 0], fArr17[i8 + 1], fArr17[i8 + 2], fArr17[i8 + 3] != 0.0f, fArr17[i8 + 4] != 0.0f);
                                f8 = f60 + fArr17[i48];
                                f9 = f59 + fArr17[i49];
                            }
                            i15 = i6 + i3;
                            fVar3 = fVar;
                            c9 = c6;
                            c10 = c9;
                            i14 = i7;
                            c8 = 'm';
                            i13 = 0;
                            f[] fVarArr3 = fVarArr;
                        } else {
                            float[] fArr18 = fArr2;
                            i10 = i15;
                            c6 = c10;
                            fVar = fVar3;
                            i7 = i14;
                            int i50 = i10 + 2;
                            int i51 = i10 + 3;
                            int i52 = i10 + 4;
                            int i53 = i10 + 5;
                            path.cubicTo(fArr18[i10 + 0], fArr18[i10 + 1], fArr18[i50], fArr18[i51], fArr18[i52], fArr18[i53]);
                            float f61 = fArr18[i52];
                            float f62 = fArr18[i53];
                            f11 = fArr18[i50];
                            f39 = f61;
                            f40 = f62;
                            f10 = fArr18[i51];
                        }
                        f7 = f11;
                        f6 = f10;
                        i15 = i6 + i3;
                        fVar3 = fVar;
                        c9 = c6;
                        c10 = c9;
                        i14 = i7;
                        c8 = 'm';
                        i13 = 0;
                        f[] fVarArr32 = fVarArr;
                    } else {
                        float[] fArr19 = fArr2;
                        i8 = i15;
                        c7 = c10;
                        fVar2 = fVar3;
                        i9 = i14;
                        int i54 = i8 + 5;
                        int i55 = i8 + 6;
                        a(path, f39, f40, fArr19[i54], fArr19[i55], fArr19[i8 + 0], fArr19[i8 + 1], fArr19[i8 + 2], fArr19[i8 + 3] != 0.0f, fArr19[i8 + 4] != 0.0f);
                        f8 = fArr19[i54];
                        f9 = fArr19[i55];
                    }
                    f6 = f40;
                    f7 = f39;
                    i15 = i6 + i3;
                    fVar3 = fVar;
                    c9 = c6;
                    c10 = c9;
                    i14 = i7;
                    c8 = 'm';
                    i13 = 0;
                    f[] fVarArr322 = fVarArr;
                } else {
                    int i56 = i14;
                    int i57 = i13;
                    fArr[i57] = f39;
                    fArr[1] = f40;
                    fArr[2] = f7;
                    fArr[3] = f6;
                    fArr[4] = f37;
                    fArr[5] = f38;
                    i14 = i56 + 1;
                    i12 = 6;
                    c8 = 'm';
                    i13 = i57;
                    c9 = fVarArr[i56].f4874a;
                    fVarArr2 = fVarArr;
                }
            }
        }
    }

    public f(f fVar) {
        this.f4874a = fVar.f4874a;
        float[] fArr = fVar.f4875b;
        this.f4875b = e.i(fArr, fArr.length);
    }
}
