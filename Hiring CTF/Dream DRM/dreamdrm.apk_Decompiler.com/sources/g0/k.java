package g0;

import a2.m;
import g.h;
import java.util.Arrays;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f2829a = 16;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f2830b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f2831c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f2832d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public float[] f2833e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2834f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f2835g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f2836h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f2837i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final c f2838j;

    /* renamed from: k  reason: collision with root package name */
    public final h f2839k;

    public k(c cVar, h hVar) {
        this.f2838j = cVar;
        this.f2839k = hVar;
        clear();
    }

    public final float a(int i3) {
        int i6 = this.f2836h;
        int i7 = this.f2837i;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i3) {
                return this.f2833e[i7];
            }
            i7 = this.f2835g[i7];
            if (i7 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final float b(j jVar, boolean z5) {
        int[] iArr;
        int i3;
        int n5 = n(jVar);
        if (n5 == -1) {
            return 0.0f;
        }
        int i6 = jVar.f2818b;
        int i7 = i6 % 16;
        int[] iArr2 = this.f2830b;
        int i8 = iArr2[i7];
        if (i8 != -1) {
            if (this.f2832d[i8] == i6) {
                int[] iArr3 = this.f2831c;
                iArr2[i7] = iArr3[i8];
                iArr3[i8] = -1;
            } else {
                while (true) {
                    iArr = this.f2831c;
                    i3 = iArr[i8];
                    if (i3 != -1 && this.f2832d[i3] != i6) {
                        i8 = i3;
                    } else if (i3 != -1 && this.f2832d[i3] == i6) {
                        iArr[i8] = iArr[i3];
                        iArr[i3] = -1;
                    }
                }
                iArr[i8] = iArr[i3];
                iArr[i3] = -1;
            }
        }
        float f6 = this.f2833e[n5];
        if (this.f2837i == n5) {
            this.f2837i = this.f2835g[n5];
        }
        this.f2832d[n5] = -1;
        int[] iArr4 = this.f2834f;
        int i9 = iArr4[n5];
        if (i9 != -1) {
            int[] iArr5 = this.f2835g;
            iArr5[i9] = iArr5[n5];
        }
        int i10 = this.f2835g[n5];
        if (i10 != -1) {
            iArr4[i10] = iArr4[n5];
        }
        this.f2836h--;
        jVar.f2827k--;
        if (z5) {
            jVar.b(this.f2838j);
        }
        return f6;
    }

    public final float c(j jVar) {
        int n5 = n(jVar);
        if (n5 != -1) {
            return this.f2833e[n5];
        }
        return 0.0f;
    }

    public final void clear() {
        int i3 = this.f2836h;
        for (int i6 = 0; i6 < i3; i6++) {
            j f6 = f(i6);
            if (f6 != null) {
                f6.b(this.f2838j);
            }
        }
        for (int i7 = 0; i7 < this.f2829a; i7++) {
            this.f2832d[i7] = -1;
            this.f2831c[i7] = -1;
        }
        for (int i8 = 0; i8 < 16; i8++) {
            this.f2830b[i8] = -1;
        }
        this.f2836h = 0;
        this.f2837i = -1;
    }

    public final boolean d(j jVar) {
        return n(jVar) != -1;
    }

    public final float e(c cVar, boolean z5) {
        float c6 = c(cVar.f2785a);
        b(cVar.f2785a, z5);
        k kVar = (k) cVar.f2788d;
        int i3 = kVar.f2836h;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = kVar.f2832d[i7];
            if (i8 != -1) {
                g(((j[]) this.f2839k.f2728d)[i8], kVar.f2833e[i7] * c6, z5);
                i6++;
            }
            i7++;
        }
        return c6;
    }

    public final j f(int i3) {
        int i6 = this.f2836h;
        if (i6 == 0) {
            return null;
        }
        int i7 = this.f2837i;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i3 && i7 != -1) {
                return ((j[]) this.f2839k.f2728d)[this.f2832d[i7]];
            }
            i7 = this.f2835g[i7];
            if (i7 == -1) {
                break;
            }
        }
        return null;
    }

    public final void g(j jVar, float f6, boolean z5) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int n5 = n(jVar);
            if (n5 == -1) {
                h(jVar, f6);
                return;
            }
            float[] fArr = this.f2833e;
            float f7 = fArr[n5] + f6;
            fArr[n5] = f7;
            if (f7 > -0.001f && f7 < 0.001f) {
                fArr[n5] = 0.0f;
                b(jVar, z5);
            }
        }
    }

    public final void h(j jVar, float f6) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i3 = 0;
            if (this.f2836h == 0) {
                m(0, jVar, f6);
                l(jVar, 0);
                this.f2837i = 0;
                return;
            }
            int n5 = n(jVar);
            if (n5 != -1) {
                this.f2833e[n5] = f6;
                return;
            }
            int i6 = this.f2836h + 1;
            int i7 = this.f2829a;
            if (i6 >= i7) {
                int i8 = i7 * 2;
                this.f2832d = Arrays.copyOf(this.f2832d, i8);
                this.f2833e = Arrays.copyOf(this.f2833e, i8);
                this.f2834f = Arrays.copyOf(this.f2834f, i8);
                this.f2835g = Arrays.copyOf(this.f2835g, i8);
                this.f2831c = Arrays.copyOf(this.f2831c, i8);
                for (int i9 = this.f2829a; i9 < i8; i9++) {
                    this.f2832d[i9] = -1;
                    this.f2831c[i9] = -1;
                }
                this.f2829a = i8;
            }
            int i10 = this.f2836h;
            int i11 = this.f2837i;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.f2832d[i11];
                int i15 = jVar.f2818b;
                if (i14 == i15) {
                    this.f2833e[i11] = f6;
                    return;
                }
                if (i14 < i15) {
                    i12 = i11;
                }
                i11 = this.f2835g[i11];
                if (i11 == -1) {
                    break;
                }
            }
            while (true) {
                if (i3 >= this.f2829a) {
                    i3 = -1;
                    break;
                } else if (this.f2832d[i3] == -1) {
                    break;
                } else {
                    i3++;
                }
            }
            m(i3, jVar, f6);
            int[] iArr = this.f2834f;
            if (i12 != -1) {
                iArr[i3] = i12;
                int[] iArr2 = this.f2835g;
                iArr2[i3] = iArr2[i12];
                iArr2[i12] = i3;
            } else {
                iArr[i3] = -1;
                if (this.f2836h > 0) {
                    this.f2835g[i3] = this.f2837i;
                    this.f2837i = i3;
                } else {
                    this.f2835g[i3] = -1;
                }
            }
            int i16 = this.f2835g[i3];
            if (i16 != -1) {
                this.f2834f[i16] = i3;
            }
            l(jVar, i3);
            return;
        }
        b(jVar, true);
    }

    public final void i(float f6) {
        int i3 = this.f2836h;
        int i6 = this.f2837i;
        int i7 = 0;
        while (i7 < i3) {
            float[] fArr = this.f2833e;
            fArr[i6] = fArr[i6] / f6;
            i6 = this.f2835g[i6];
            if (i6 != -1) {
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i3 = this.f2836h;
        int i6 = this.f2837i;
        int i7 = 0;
        while (i7 < i3) {
            float[] fArr = this.f2833e;
            fArr[i6] = fArr[i6] * -1.0f;
            i6 = this.f2835g[i6];
            if (i6 != -1) {
                i7++;
            } else {
                return;
            }
        }
    }

    public final int k() {
        return this.f2836h;
    }

    public final void l(j jVar, int i3) {
        int[] iArr;
        int i6 = jVar.f2818b % 16;
        int[] iArr2 = this.f2830b;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            iArr2[i6] = i3;
        } else {
            while (true) {
                iArr = this.f2831c;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    break;
                }
                i7 = i8;
            }
            iArr[i7] = i3;
        }
        this.f2831c[i3] = -1;
    }

    public final void m(int i3, j jVar, float f6) {
        this.f2832d[i3] = jVar.f2818b;
        this.f2833e[i3] = f6;
        this.f2834f[i3] = -1;
        this.f2835g[i3] = -1;
        jVar.a(this.f2838j);
        jVar.f2827k++;
        this.f2836h++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(g0.j r4) {
        /*
            r3 = this;
            int r0 = r3.f2836h
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r4 = r4.f2818b
            int r0 = r4 % 16
            int[] r2 = r3.f2830b
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x0011:
            int[] r2 = r3.f2832d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0018
            return r0
        L_0x0018:
            int[] r2 = r3.f2831c
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0025
            int[] r2 = r3.f2832d
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0025
            goto L_0x0018
        L_0x0025:
            if (r0 != r1) goto L_0x0028
            return r1
        L_0x0028:
            int[] r2 = r3.f2832d
            r2 = r2[r0]
            if (r2 != r4) goto L_0x002f
            return r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.n(g0.j):int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i3 = this.f2836h;
        for (int i6 = 0; i6 < i3; i6++) {
            j f6 = f(i6);
            if (f6 != null) {
                String str3 = str2 + f6 + " = " + a(i6) + " ";
                int n5 = n(f6);
                String h6 = m.h(str3, "[p: ");
                int i7 = this.f2834f[n5];
                h hVar = this.f2839k;
                if (i7 != -1) {
                    sb = new StringBuilder();
                    sb.append(h6);
                    sb.append(((j[]) hVar.f2728d)[this.f2832d[this.f2834f[n5]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(h6);
                    sb.append("none");
                }
                String h7 = m.h(sb.toString(), ", n: ");
                if (this.f2835g[n5] != -1) {
                    str = h7 + ((j[]) hVar.f2728d)[this.f2832d[this.f2835g[n5]]];
                } else {
                    str = m.h(h7, "none");
                }
                str2 = m.h(str, "]");
            }
        }
        return m.h(str2, " }");
    }
}
