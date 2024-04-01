package g0;

import a2.m;
import g.h;
import java.util.Arrays;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f2775a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final c f2776b;

    /* renamed from: c  reason: collision with root package name */
    public final h f2777c;

    /* renamed from: d  reason: collision with root package name */
    public int f2778d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2779e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2780f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2781g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2782h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2783i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2784j = false;

    public a(c cVar, h hVar) {
        this.f2776b = cVar;
        this.f2777c = hVar;
    }

    public final float a(int i3) {
        int i6 = this.f2782h;
        int i7 = 0;
        while (i6 != -1 && i7 < this.f2775a) {
            if (i7 == i3) {
                return this.f2781g[i6];
            }
            i6 = this.f2780f[i6];
            i7++;
        }
        return 0.0f;
    }

    public final float b(j jVar, boolean z5) {
        int i3 = this.f2782h;
        if (i3 == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i7 = -1;
        while (i3 != -1 && i6 < this.f2775a) {
            if (this.f2779e[i3] == jVar.f2818b) {
                if (i3 == this.f2782h) {
                    this.f2782h = this.f2780f[i3];
                } else {
                    int[] iArr = this.f2780f;
                    iArr[i7] = iArr[i3];
                }
                if (z5) {
                    jVar.b(this.f2776b);
                }
                jVar.f2827k--;
                this.f2775a--;
                this.f2779e[i3] = -1;
                if (this.f2784j) {
                    this.f2783i = i3;
                }
                return this.f2781g[i3];
            }
            i6++;
            i7 = i3;
            i3 = this.f2780f[i3];
        }
        return 0.0f;
    }

    public final float c(j jVar) {
        int i3 = this.f2782h;
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            if (this.f2779e[i3] == jVar.f2818b) {
                return this.f2781g[i3];
            }
            i3 = this.f2780f[i3];
            i6++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i3 = this.f2782h;
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            j jVar = ((j[]) this.f2777c.f2728d)[this.f2779e[i3]];
            if (jVar != null) {
                jVar.b(this.f2776b);
            }
            i3 = this.f2780f[i3];
            i6++;
        }
        this.f2782h = -1;
        this.f2783i = -1;
        this.f2784j = false;
        this.f2775a = 0;
    }

    public final boolean d(j jVar) {
        int i3 = this.f2782h;
        if (i3 == -1) {
            return false;
        }
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            if (this.f2779e[i3] == jVar.f2818b) {
                return true;
            }
            i3 = this.f2780f[i3];
            i6++;
        }
        return false;
    }

    public final float e(c cVar, boolean z5) {
        float c6 = c(cVar.f2785a);
        b(cVar.f2785a, z5);
        b bVar = cVar.f2788d;
        int k6 = bVar.k();
        for (int i3 = 0; i3 < k6; i3++) {
            j f6 = bVar.f(i3);
            g(f6, bVar.c(f6) * c6, z5);
        }
        return c6;
    }

    public final j f(int i3) {
        int i6 = this.f2782h;
        int i7 = 0;
        while (i6 != -1 && i7 < this.f2775a) {
            if (i7 == i3) {
                return ((j[]) this.f2777c.f2728d)[this.f2779e[i6]];
            }
            i6 = this.f2780f[i6];
            i7++;
        }
        return null;
    }

    public final void g(j jVar, float f6, boolean z5) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i3 = this.f2782h;
            c cVar = this.f2776b;
            if (i3 == -1) {
                this.f2782h = 0;
                this.f2781g[0] = f6;
                this.f2779e[0] = jVar.f2818b;
                this.f2780f[0] = -1;
                jVar.f2827k++;
                jVar.a(cVar);
                this.f2775a++;
                if (!this.f2784j) {
                    int i6 = this.f2783i + 1;
                    this.f2783i = i6;
                    int[] iArr = this.f2779e;
                    if (i6 >= iArr.length) {
                        this.f2784j = true;
                        this.f2783i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = 0;
            int i8 = -1;
            while (i3 != -1 && i7 < this.f2775a) {
                int i9 = this.f2779e[i3];
                int i10 = jVar.f2818b;
                if (i9 == i10) {
                    float[] fArr = this.f2781g;
                    float f7 = fArr[i3] + f6;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i3] = f7;
                    if (f7 == 0.0f) {
                        if (i3 == this.f2782h) {
                            this.f2782h = this.f2780f[i3];
                        } else {
                            int[] iArr2 = this.f2780f;
                            iArr2[i8] = iArr2[i3];
                        }
                        if (z5) {
                            jVar.b(cVar);
                        }
                        if (this.f2784j) {
                            this.f2783i = i3;
                        }
                        jVar.f2827k--;
                        this.f2775a--;
                        return;
                    }
                    return;
                }
                if (i9 < i10) {
                    i8 = i3;
                }
                i3 = this.f2780f[i3];
                i7++;
            }
            int i11 = this.f2783i;
            int i12 = i11 + 1;
            if (this.f2784j) {
                int[] iArr3 = this.f2779e;
                if (iArr3[i11] != -1) {
                    i11 = iArr3.length;
                }
            } else {
                i11 = i12;
            }
            int[] iArr4 = this.f2779e;
            if (i11 >= iArr4.length && this.f2775a < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f2779e;
                    if (i13 >= iArr5.length) {
                        break;
                    } else if (iArr5[i13] == -1) {
                        i11 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            int[] iArr6 = this.f2779e;
            if (i11 >= iArr6.length) {
                i11 = iArr6.length;
                int i14 = this.f2778d * 2;
                this.f2778d = i14;
                this.f2784j = false;
                this.f2783i = i11 - 1;
                this.f2781g = Arrays.copyOf(this.f2781g, i14);
                this.f2779e = Arrays.copyOf(this.f2779e, this.f2778d);
                this.f2780f = Arrays.copyOf(this.f2780f, this.f2778d);
            }
            this.f2779e[i11] = jVar.f2818b;
            this.f2781g[i11] = f6;
            int[] iArr7 = this.f2780f;
            if (i8 != -1) {
                iArr7[i11] = iArr7[i8];
                iArr7[i8] = i11;
            } else {
                iArr7[i11] = this.f2782h;
                this.f2782h = i11;
            }
            jVar.f2827k++;
            jVar.a(cVar);
            this.f2775a++;
            if (!this.f2784j) {
                this.f2783i++;
            }
            int i15 = this.f2783i;
            int[] iArr8 = this.f2779e;
            if (i15 >= iArr8.length) {
                this.f2784j = true;
                this.f2783i = iArr8.length - 1;
            }
        }
    }

    public final void h(j jVar, float f6) {
        if (f6 == 0.0f) {
            b(jVar, true);
            return;
        }
        int i3 = this.f2782h;
        c cVar = this.f2776b;
        if (i3 == -1) {
            this.f2782h = 0;
            this.f2781g[0] = f6;
            this.f2779e[0] = jVar.f2818b;
            this.f2780f[0] = -1;
            jVar.f2827k++;
            jVar.a(cVar);
            this.f2775a++;
            if (!this.f2784j) {
                int i6 = this.f2783i + 1;
                this.f2783i = i6;
                int[] iArr = this.f2779e;
                if (i6 >= iArr.length) {
                    this.f2784j = true;
                    this.f2783i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i7 = -1;
        int i8 = 0;
        while (i3 != -1 && i8 < this.f2775a) {
            int i9 = this.f2779e[i3];
            int i10 = jVar.f2818b;
            if (i9 == i10) {
                this.f2781g[i3] = f6;
                return;
            }
            if (i9 < i10) {
                i7 = i3;
            }
            i3 = this.f2780f[i3];
            i8++;
        }
        int i11 = this.f2783i;
        int i12 = i11 + 1;
        if (this.f2784j) {
            int[] iArr2 = this.f2779e;
            if (iArr2[i11] != -1) {
                i11 = iArr2.length;
            }
        } else {
            i11 = i12;
        }
        int[] iArr3 = this.f2779e;
        if (i11 >= iArr3.length && this.f2775a < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f2779e;
                if (i13 >= iArr4.length) {
                    break;
                } else if (iArr4[i13] == -1) {
                    i11 = i13;
                    break;
                } else {
                    i13++;
                }
            }
        }
        int[] iArr5 = this.f2779e;
        if (i11 >= iArr5.length) {
            i11 = iArr5.length;
            int i14 = this.f2778d * 2;
            this.f2778d = i14;
            this.f2784j = false;
            this.f2783i = i11 - 1;
            this.f2781g = Arrays.copyOf(this.f2781g, i14);
            this.f2779e = Arrays.copyOf(this.f2779e, this.f2778d);
            this.f2780f = Arrays.copyOf(this.f2780f, this.f2778d);
        }
        this.f2779e[i11] = jVar.f2818b;
        this.f2781g[i11] = f6;
        int[] iArr6 = this.f2780f;
        if (i7 != -1) {
            iArr6[i11] = iArr6[i7];
            iArr6[i7] = i11;
        } else {
            iArr6[i11] = this.f2782h;
            this.f2782h = i11;
        }
        jVar.f2827k++;
        jVar.a(cVar);
        int i15 = this.f2775a + 1;
        this.f2775a = i15;
        if (!this.f2784j) {
            this.f2783i++;
        }
        int[] iArr7 = this.f2779e;
        if (i15 >= iArr7.length) {
            this.f2784j = true;
        }
        if (this.f2783i >= iArr7.length) {
            this.f2784j = true;
            this.f2783i = iArr7.length - 1;
        }
    }

    public final void i(float f6) {
        int i3 = this.f2782h;
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            float[] fArr = this.f2781g;
            fArr[i3] = fArr[i3] / f6;
            i3 = this.f2780f[i3];
            i6++;
        }
    }

    public final void j() {
        int i3 = this.f2782h;
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            float[] fArr = this.f2781g;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.f2780f[i3];
            i6++;
        }
    }

    public final int k() {
        return this.f2775a;
    }

    public final String toString() {
        int i3 = this.f2782h;
        String str = "";
        int i6 = 0;
        while (i3 != -1 && i6 < this.f2775a) {
            str = (m.h(str, " -> ") + this.f2781g[i3] + " : ") + ((j[]) this.f2777c.f2728d)[this.f2779e[i3]];
            i3 = this.f2780f[i3];
            i6++;
        }
        return str;
    }
}
