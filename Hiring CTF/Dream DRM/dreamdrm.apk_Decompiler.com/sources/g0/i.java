package g0;

import g.h;
import java.util.Arrays;

public final class i extends c {

    /* renamed from: f  reason: collision with root package name */
    public j[] f2813f = new j[128];

    /* renamed from: g  reason: collision with root package name */
    public j[] f2814g = new j[128];

    /* renamed from: h  reason: collision with root package name */
    public int f2815h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final h f2816i = new h(this);

    public i(h hVar) {
        super(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g0.j d(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f2815h
            if (r2 >= r4) goto L_0x0057
            g0.j[] r4 = r11.f2813f
            r5 = r4[r2]
            int r6 = r5.f2818b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            g0.h r6 = r11.f2816i
            r6.f2811d = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r7 < 0) goto L_0x0032
            g0.j r4 = r6.f2811d
            float[] r4 = r4.f2824h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r7 = r7 + -1
            goto L_0x001c
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r7 < 0) goto L_0x0050
            float[] r8 = r4.f2824h
            r8 = r8[r7]
            g0.j r9 = r6.f2811d
            float[] r9 = r9.f2824h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r7 = r7 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            g0.j[] r12 = r11.f2813f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.d(boolean[]):g0.j");
    }

    public final void i(c cVar, boolean z5) {
        boolean z6;
        c cVar2 = cVar;
        j jVar = cVar2.f2785a;
        if (jVar != null) {
            b bVar = cVar2.f2788d;
            int k6 = bVar.k();
            for (int i3 = 0; i3 < k6; i3++) {
                j f6 = bVar.f(i3);
                float a6 = bVar.a(i3);
                h hVar = this.f2816i;
                hVar.f2811d = f6;
                boolean z7 = f6.f2817a;
                float[] fArr = jVar.f2824h;
                if (z7) {
                    boolean z8 = true;
                    for (int i6 = 0; i6 < 9; i6++) {
                        float[] fArr2 = hVar.f2811d.f2824h;
                        float f7 = (fArr[i6] * a6) + fArr2[i6];
                        fArr2[i6] = f7;
                        if (Math.abs(f7) < 1.0E-4f) {
                            hVar.f2811d.f2824h[i6] = 0.0f;
                        } else {
                            z8 = false;
                        }
                    }
                    if (z8) {
                        hVar.f2812e.k(hVar.f2811d);
                    }
                    z6 = false;
                } else {
                    for (int i7 = 0; i7 < 9; i7++) {
                        float f8 = fArr[i7];
                        if (f8 != 0.0f) {
                            float f9 = f8 * a6;
                            if (Math.abs(f9) < 1.0E-4f) {
                                f9 = 0.0f;
                            }
                            hVar.f2811d.f2824h[i7] = f9;
                        } else {
                            hVar.f2811d.f2824h[i7] = 0.0f;
                        }
                    }
                    z6 = true;
                }
                if (z6) {
                    j(f6);
                }
                this.f2786b = (cVar2.f2786b * a6) + this.f2786b;
            }
            k(jVar);
        }
    }

    public final void j(j jVar) {
        int i3;
        int i6 = this.f2815h + 1;
        j[] jVarArr = this.f2813f;
        if (i6 > jVarArr.length) {
            j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length * 2);
            this.f2813f = jVarArr2;
            this.f2814g = (j[]) Arrays.copyOf(jVarArr2, jVarArr2.length * 2);
        }
        j[] jVarArr3 = this.f2813f;
        int i7 = this.f2815h;
        jVarArr3[i7] = jVar;
        int i8 = i7 + 1;
        this.f2815h = i8;
        if (i8 > 1 && jVarArr3[i8 - 1].f2818b > jVar.f2818b) {
            int i9 = 0;
            while (true) {
                i3 = this.f2815h;
                if (i9 >= i3) {
                    break;
                }
                this.f2814g[i9] = this.f2813f[i9];
                i9++;
            }
            Arrays.sort(this.f2814g, 0, i3, new g(0, this));
            for (int i10 = 0; i10 < this.f2815h; i10++) {
                this.f2813f[i10] = this.f2814g[i10];
            }
        }
        jVar.f2817a = true;
        jVar.a(this);
    }

    public final void k(j jVar) {
        int i3 = 0;
        while (i3 < this.f2815h) {
            if (this.f2813f[i3] == jVar) {
                while (true) {
                    int i6 = this.f2815h;
                    if (i3 < i6 - 1) {
                        j[] jVarArr = this.f2813f;
                        int i7 = i3 + 1;
                        jVarArr[i3] = jVarArr[i7];
                        i3 = i7;
                    } else {
                        this.f2815h = i6 - 1;
                        jVar.f2817a = false;
                        return;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f2786b + ") : ";
        for (int i3 = 0; i3 < this.f2815h; i3++) {
            j jVar = this.f2813f[i3];
            h hVar = this.f2816i;
            hVar.f2811d = jVar;
            str = str + hVar + " ";
        }
        return str;
    }
}
