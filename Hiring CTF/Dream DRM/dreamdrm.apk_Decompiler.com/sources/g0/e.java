package g0;

import g.h;
import h0.d;
import java.util.Arrays;

public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static int f2790o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f2791p = true;

    /* renamed from: a  reason: collision with root package name */
    public int f2792a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2793b;

    /* renamed from: c  reason: collision with root package name */
    public int f2794c;

    /* renamed from: d  reason: collision with root package name */
    public int f2795d;

    /* renamed from: e  reason: collision with root package name */
    public c[] f2796e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2797f;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f2798g;

    /* renamed from: h  reason: collision with root package name */
    public int f2799h;

    /* renamed from: i  reason: collision with root package name */
    public int f2800i;

    /* renamed from: j  reason: collision with root package name */
    public int f2801j;

    /* renamed from: k  reason: collision with root package name */
    public final h f2802k;

    /* renamed from: l  reason: collision with root package name */
    public j[] f2803l;

    /* renamed from: m  reason: collision with root package name */
    public int f2804m;

    /* renamed from: n  reason: collision with root package name */
    public c f2805n;

    public e() {
        this.f2792a = 0;
        this.f2794c = 32;
        this.f2795d = 32;
        this.f2796e = null;
        this.f2797f = false;
        this.f2798g = new boolean[32];
        this.f2799h = 1;
        this.f2800i = 0;
        this.f2801j = 32;
        this.f2803l = new j[f2790o];
        this.f2804m = 0;
        this.f2796e = new c[32];
        q();
        h hVar = new h(1);
        this.f2802k = hVar;
        this.f2793b = new i(hVar);
        this.f2805n = f2791p ? new d(hVar) : new c(hVar);
    }

    public static int n(d dVar) {
        j jVar = dVar.f3267g;
        if (jVar != null) {
            return (int) (jVar.f2821e + 0.5f);
        }
        return 0;
    }

    public final j a(int i3) {
        j jVar = (j) ((f) this.f2802k.f2727c).b();
        if (jVar == null) {
            jVar = new j(i3);
        } else {
            jVar.c();
        }
        jVar.f2828l = i3;
        int i6 = this.f2804m;
        int i7 = f2790o;
        if (i6 >= i7) {
            int i8 = i7 * 2;
            f2790o = i8;
            this.f2803l = (j[]) Arrays.copyOf(this.f2803l, i8);
        }
        j[] jVarArr = this.f2803l;
        int i9 = this.f2804m;
        this.f2804m = i9 + 1;
        jVarArr[i9] = jVar;
        return jVar;
    }

    public final void b(j jVar, j jVar2, int i3, float f6, j jVar3, j jVar4, int i6, int i7) {
        float f7;
        int i8;
        c l6 = l();
        if (jVar2 == jVar3) {
            l6.f2788d.h(jVar, 1.0f);
            l6.f2788d.h(jVar4, 1.0f);
            l6.f2788d.h(jVar2, -2.0f);
        } else {
            if (f6 == 0.5f) {
                l6.f2788d.h(jVar, 1.0f);
                l6.f2788d.h(jVar2, -1.0f);
                l6.f2788d.h(jVar3, -1.0f);
                l6.f2788d.h(jVar4, 1.0f);
                if (i3 > 0 || i6 > 0) {
                    i8 = (-i3) + i6;
                }
            } else if (f6 <= 0.0f) {
                l6.f2788d.h(jVar, -1.0f);
                l6.f2788d.h(jVar2, 1.0f);
                f7 = (float) i3;
                l6.f2786b = f7;
            } else if (f6 >= 1.0f) {
                l6.f2788d.h(jVar4, -1.0f);
                l6.f2788d.h(jVar3, 1.0f);
                i8 = -i6;
            } else {
                float f8 = 1.0f - f6;
                l6.f2788d.h(jVar, f8 * 1.0f);
                l6.f2788d.h(jVar2, f8 * -1.0f);
                l6.f2788d.h(jVar3, -1.0f * f6);
                l6.f2788d.h(jVar4, 1.0f * f6);
                if (i3 > 0 || i6 > 0) {
                    l6.f2786b = (((float) i6) * f6) + (((float) (-i3)) * f8);
                }
            }
            f7 = (float) i8;
            l6.f2786b = f7;
        }
        if (i7 != 8) {
            l6.a(this, i7);
        }
        c(l6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r4.f2827k <= 1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        if (r4.f2827k <= 1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e5, code lost:
        if (r4.f2827k <= 1) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ee, code lost:
        if (r4.f2827k <= 1) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(g0.c r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f2800i
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f2801j
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f2799h
            int r2 = r2 + r3
            int r4 = r0.f2795d
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.f2789e
            if (r2 != 0) goto L_0x01ab
            g0.c[] r2 = r0.f2796e
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0071
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0071
            g0.b r6 = r1.f2788d
            int r6 = r6.k()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.f2787c
            if (r7 >= r6) goto L_0x0043
            g0.b r9 = r1.f2788d
            g0.j r9 = r9.f(r7)
            int r10 = r9.f2819c
            if (r10 != r5) goto L_0x003d
            boolean r10 = r9.f2822f
            if (r10 == 0) goto L_0x0040
        L_0x003d:
            r8.add(r9)
        L_0x0040:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0043:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006f
            java.util.Iterator r6 = r8.iterator()
        L_0x004d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x006b
            java.lang.Object r7 = r6.next()
            g0.j r7 = (g0.j) r7
            boolean r9 = r7.f2822f
            if (r9 == 0) goto L_0x0061
            r1.h(r7, r3)
            goto L_0x004d
        L_0x0061:
            g0.c[] r9 = r0.f2796e
            int r7 = r7.f2819c
            r7 = r9[r7]
            r1.i(r7, r3)
            goto L_0x004d
        L_0x006b:
            r8.clear()
            goto L_0x0022
        L_0x006f:
            r2 = r3
            goto L_0x0022
        L_0x0071:
            g0.j r2 = r1.f2785a
            r6 = 0
            if (r2 != 0) goto L_0x0086
            float r2 = r1.f2786b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            g0.b r2 = r1.f2788d
            int r2 = r2.k()
            if (r2 != 0) goto L_0x0086
            r2 = r3
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f2786b
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009a
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f2786b = r2
            g0.b r2 = r1.f2788d
            r2.j()
        L_0x009a:
            g0.b r2 = r1.f2788d
            int r2 = r2.k()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a8:
            if (r8 >= r2) goto L_0x0105
            g0.b r15 = r1.f2788d
            float r15 = r15.a(r8)
            g0.b r4 = r1.f2788d
            g0.j r4 = r4.f(r8)
            int r5 = r4.f2828l
            if (r5 != r3) goto L_0x00db
            if (r9 != 0) goto L_0x00c1
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00ca
            goto L_0x00d7
        L_0x00c1:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cc
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00ca
            goto L_0x00d7
        L_0x00ca:
            r12 = 0
            goto L_0x00d8
        L_0x00cc:
            if (r12 != 0) goto L_0x0101
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00d4
            r5 = r3
            goto L_0x00d5
        L_0x00d4:
            r5 = 0
        L_0x00d5:
            if (r5 == 0) goto L_0x0101
        L_0x00d7:
            r12 = r3
        L_0x00d8:
            r9 = r4
            r11 = r15
            goto L_0x0101
        L_0x00db:
            if (r9 != 0) goto L_0x0101
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0101
            if (r10 != 0) goto L_0x00e8
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00f1
            goto L_0x00fe
        L_0x00e8:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f3
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00f1
            goto L_0x00fe
        L_0x00f1:
            r14 = 0
            goto L_0x00ff
        L_0x00f3:
            if (r14 != 0) goto L_0x0101
            int r5 = r4.f2827k
            if (r5 > r3) goto L_0x00fb
            r5 = r3
            goto L_0x00fc
        L_0x00fb:
            r5 = 0
        L_0x00fc:
            if (r5 == 0) goto L_0x0101
        L_0x00fe:
            r14 = r3
        L_0x00ff:
            r10 = r4
            r13 = r15
        L_0x0101:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a8
        L_0x0105:
            if (r9 == 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r9 = r10
        L_0x0109:
            if (r9 != 0) goto L_0x010d
            r2 = r3
            goto L_0x0111
        L_0x010d:
            r1.f(r9)
            r2 = 0
        L_0x0111:
            g0.b r4 = r1.f2788d
            int r4 = r4.k()
            if (r4 != 0) goto L_0x011b
            r1.f2789e = r3
        L_0x011b:
            if (r2 == 0) goto L_0x0195
            int r2 = r0.f2799h
            int r2 = r2 + r3
            int r4 = r0.f2795d
            if (r2 < r4) goto L_0x0127
            r16.o()
        L_0x0127:
            r2 = 3
            g0.j r2 = r0.a(r2)
            int r4 = r0.f2792a
            int r4 = r4 + r3
            r0.f2792a = r4
            int r5 = r0.f2799h
            int r5 = r5 + r3
            r0.f2799h = r5
            r2.f2818b = r4
            g.h r5 = r0.f2802k
            java.lang.Object r5 = r5.f2728d
            g0.j[] r5 = (g0.j[]) r5
            r5[r4] = r2
            r1.f2785a = r2
            r16.i(r17)
            g0.c r4 = r0.f2805n
            r4.getClass()
            r4.f2785a = r7
            g0.b r5 = r4.f2788d
            r5.clear()
            r5 = 0
        L_0x0152:
            g0.b r8 = r1.f2788d
            int r8 = r8.k()
            if (r5 >= r8) goto L_0x016e
            g0.b r8 = r1.f2788d
            g0.j r8 = r8.f(r5)
            g0.b r9 = r1.f2788d
            float r9 = r9.a(r5)
            g0.b r10 = r4.f2788d
            r10.g(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x0152
        L_0x016e:
            g0.c r4 = r0.f2805n
            r0.p(r4)
            int r4 = r2.f2819c
            r5 = -1
            if (r4 != r5) goto L_0x0193
            g0.j r4 = r1.f2785a
            if (r4 != r2) goto L_0x0185
            g0.j r2 = r1.e(r7, r2)
            if (r2 == 0) goto L_0x0185
            r1.f(r2)
        L_0x0185:
            boolean r2 = r1.f2789e
            if (r2 != 0) goto L_0x018e
            g0.j r2 = r1.f2785a
            r2.d(r1)
        L_0x018e:
            int r2 = r0.f2800i
            int r2 = r2 - r3
            r0.f2800i = r2
        L_0x0193:
            r2 = r3
            goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            g0.j r4 = r1.f2785a
            if (r4 == 0) goto L_0x01a5
            int r4 = r4.f2828l
            if (r4 == r3) goto L_0x01a6
            float r4 = r1.f2786b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r3 = 0
        L_0x01a6:
            if (r3 != 0) goto L_0x01a9
            return
        L_0x01a9:
            r4 = r2
            goto L_0x01ac
        L_0x01ab:
            r4 = 0
        L_0x01ac:
            if (r4 != 0) goto L_0x01b1
            r16.i(r17)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e.c(g0.c):void");
    }

    public final void d(j jVar, int i3) {
        c cVar;
        b bVar;
        float f6;
        int i6 = jVar.f2819c;
        if (i6 == -1) {
            jVar.f2821e = (float) i3;
            jVar.f2822f = true;
            int i7 = jVar.f2826j;
            for (int i8 = 0; i8 < i7; i8++) {
                jVar.f2825i[i8].h(jVar, false);
            }
            jVar.f2826j = 0;
            return;
        }
        if (i6 != -1) {
            c cVar2 = this.f2796e[i6];
            if (!cVar2.f2789e) {
                if (cVar2.f2788d.k() == 0) {
                    cVar2.f2789e = true;
                } else {
                    cVar = l();
                    if (i3 < 0) {
                        cVar.f2786b = (float) (i3 * -1);
                        bVar = cVar.f2788d;
                        f6 = 1.0f;
                    } else {
                        cVar.f2786b = (float) i3;
                        bVar = cVar.f2788d;
                        f6 = -1.0f;
                    }
                    bVar.h(jVar, f6);
                }
            }
            cVar2.f2786b = (float) i3;
            return;
        }
        cVar = l();
        cVar.f2785a = jVar;
        float f7 = (float) i3;
        jVar.f2821e = f7;
        cVar.f2786b = f7;
        cVar.f2789e = true;
        c(cVar);
    }

    public final void e(j jVar, j jVar2, int i3, int i6) {
        boolean z5 = false;
        if (i6 == 8 && jVar2.f2822f && jVar.f2819c == -1) {
            jVar.f2821e = jVar2.f2821e + ((float) i3);
            jVar.f2822f = true;
            int i7 = jVar.f2826j;
            for (int i8 = 0; i8 < i7; i8++) {
                jVar.f2825i[i8].h(jVar, false);
            }
            jVar.f2826j = 0;
            return;
        }
        c l6 = l();
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z5 = true;
            }
            l6.f2786b = (float) i3;
        }
        if (!z5) {
            l6.f2788d.h(jVar, -1.0f);
            l6.f2788d.h(jVar2, 1.0f);
        } else {
            l6.f2788d.h(jVar, 1.0f);
            l6.f2788d.h(jVar2, -1.0f);
        }
        if (i6 != 8) {
            l6.a(this, i6);
        }
        c(l6);
    }

    public final void f(j jVar, j jVar2, int i3, int i6) {
        c l6 = l();
        j m6 = m();
        m6.f2820d = 0;
        l6.b(jVar, jVar2, m6, i3);
        if (i6 != 8) {
            l6.f2788d.h(j(i6), (float) ((int) (l6.f2788d.c(m6) * -1.0f)));
        }
        c(l6);
    }

    public final void g(j jVar, j jVar2, int i3, int i6) {
        c l6 = l();
        j m6 = m();
        m6.f2820d = 0;
        l6.c(jVar, jVar2, m6, i3);
        if (i6 != 8) {
            l6.f2788d.h(j(i6), (float) ((int) (l6.f2788d.c(m6) * -1.0f)));
        }
        c(l6);
    }

    public final void h(j jVar, j jVar2, j jVar3, j jVar4, float f6) {
        c l6 = l();
        l6.f2788d.h(jVar, -1.0f);
        l6.f2788d.h(jVar2, 1.0f);
        l6.f2788d.h(jVar3, f6);
        l6.f2788d.h(jVar4, -f6);
        c(l6);
    }

    public final void i(c cVar) {
        Object obj;
        c cVar2;
        boolean z5 = f2791p;
        h hVar = this.f2802k;
        if (z5) {
            cVar2 = this.f2796e[this.f2800i];
            if (cVar2 != null) {
                obj = hVar.f2725a;
            }
            c[] cVarArr = this.f2796e;
            int i3 = this.f2800i;
            cVarArr[i3] = cVar;
            j jVar = cVar.f2785a;
            jVar.f2819c = i3;
            this.f2800i = i3 + 1;
            jVar.d(cVar);
        }
        cVar2 = this.f2796e[this.f2800i];
        if (cVar2 != null) {
            obj = hVar.f2726b;
        }
        c[] cVarArr2 = this.f2796e;
        int i32 = this.f2800i;
        cVarArr2[i32] = cVar;
        j jVar2 = cVar.f2785a;
        jVar2.f2819c = i32;
        this.f2800i = i32 + 1;
        jVar2.d(cVar);
        ((f) obj).a(cVar2);
        c[] cVarArr22 = this.f2796e;
        int i322 = this.f2800i;
        cVarArr22[i322] = cVar;
        j jVar22 = cVar.f2785a;
        jVar22.f2819c = i322;
        this.f2800i = i322 + 1;
        jVar22.d(cVar);
    }

    public final j j(int i3) {
        if (this.f2799h + 1 >= this.f2795d) {
            o();
        }
        j a6 = a(4);
        int i6 = this.f2792a + 1;
        this.f2792a = i6;
        this.f2799h++;
        a6.f2818b = i6;
        a6.f2820d = i3;
        ((j[]) this.f2802k.f2728d)[i6] = a6;
        i iVar = this.f2793b;
        iVar.f2816i.f2811d = a6;
        float[] fArr = a6.f2824h;
        Arrays.fill(fArr, 0.0f);
        fArr[a6.f2820d] = 1.0f;
        iVar.j(a6);
        return a6;
    }

    public final j k(Object obj) {
        j jVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2799h + 1 >= this.f2795d) {
            o();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            jVar = dVar.f3267g;
            if (jVar == null) {
                dVar.i();
                jVar = dVar.f3267g;
            }
            int i3 = jVar.f2818b;
            h hVar = this.f2802k;
            if (i3 == -1 || i3 > this.f2792a || ((j[]) hVar.f2728d)[i3] == null) {
                if (i3 != -1) {
                    jVar.c();
                }
                int i6 = this.f2792a + 1;
                this.f2792a = i6;
                this.f2799h++;
                jVar.f2818b = i6;
                jVar.f2828l = 1;
                ((j[]) hVar.f2728d)[i6] = jVar;
            }
        }
        return jVar;
    }

    public final c l() {
        c cVar;
        boolean z5 = f2791p;
        h hVar = this.f2802k;
        if (z5) {
            cVar = (c) ((f) hVar.f2725a).b();
            if (cVar == null) {
                return new d(hVar);
            }
        } else {
            cVar = (c) ((f) hVar.f2726b).b();
            if (cVar == null) {
                return new c(hVar);
            }
        }
        cVar.g();
        return cVar;
    }

    public final j m() {
        if (this.f2799h + 1 >= this.f2795d) {
            o();
        }
        j a6 = a(3);
        int i3 = this.f2792a + 1;
        this.f2792a = i3;
        this.f2799h++;
        a6.f2818b = i3;
        ((j[]) this.f2802k.f2728d)[i3] = a6;
        return a6;
    }

    public final void o() {
        int i3 = this.f2794c * 2;
        this.f2794c = i3;
        this.f2796e = (c[]) Arrays.copyOf(this.f2796e, i3);
        h hVar = this.f2802k;
        hVar.f2728d = (j[]) Arrays.copyOf((j[]) hVar.f2728d, this.f2794c);
        int i6 = this.f2794c;
        this.f2798g = new boolean[i6];
        this.f2795d = i6;
        this.f2801j = i6;
    }

    public final void p(c cVar) {
        for (int i3 = 0; i3 < this.f2799h; i3++) {
            this.f2798g[i3] = false;
        }
        boolean z5 = false;
        int i6 = 0;
        while (!z5) {
            i6++;
            if (i6 < this.f2799h * 2) {
                j jVar = cVar.f2785a;
                if (jVar != null) {
                    this.f2798g[jVar.f2818b] = true;
                }
                j d6 = cVar.d(this.f2798g);
                if (d6 != null) {
                    boolean[] zArr = this.f2798g;
                    int i7 = d6.f2818b;
                    if (!zArr[i7]) {
                        zArr[i7] = true;
                    } else {
                        return;
                    }
                }
                if (d6 != null) {
                    float f6 = Float.MAX_VALUE;
                    int i8 = -1;
                    for (int i9 = 0; i9 < this.f2800i; i9++) {
                        c cVar2 = this.f2796e[i9];
                        if (cVar2.f2785a.f2828l != 1 && !cVar2.f2789e && cVar2.f2788d.d(d6)) {
                            float c6 = cVar2.f2788d.c(d6);
                            if (c6 < 0.0f) {
                                float f7 = (-cVar2.f2786b) / c6;
                                if (f7 < f6) {
                                    i8 = i9;
                                    f6 = f7;
                                }
                            }
                        }
                    }
                    if (i8 > -1) {
                        c cVar3 = this.f2796e[i8];
                        cVar3.f2785a.f2819c = -1;
                        cVar3.f(d6);
                        j jVar2 = cVar3.f2785a;
                        jVar2.f2819c = i8;
                        jVar2.d(cVar3);
                    }
                } else {
                    z5 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void q() {
        boolean z5 = f2791p;
        h hVar = this.f2802k;
        int i3 = 0;
        if (z5) {
            while (true) {
                c[] cVarArr = this.f2796e;
                if (i3 < cVarArr.length) {
                    c cVar = cVarArr[i3];
                    if (cVar != null) {
                        ((f) hVar.f2725a).a(cVar);
                    }
                    this.f2796e[i3] = null;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f2796e;
                if (i3 < cVarArr2.length) {
                    c cVar2 = cVarArr2[i3];
                    if (cVar2 != null) {
                        ((f) hVar.f2726b).a(cVar2);
                    }
                    this.f2796e[i3] = null;
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        h hVar;
        int i3 = 0;
        while (true) {
            hVar = this.f2802k;
            j[] jVarArr = (j[]) hVar.f2728d;
            if (i3 >= jVarArr.length) {
                break;
            }
            j jVar = jVarArr[i3];
            if (jVar != null) {
                jVar.c();
            }
            i3++;
        }
        f fVar = (f) hVar.f2727c;
        j[] jVarArr2 = this.f2803l;
        int i6 = this.f2804m;
        fVar.getClass();
        if (i6 > jVarArr2.length) {
            i6 = jVarArr2.length;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            j jVar2 = jVarArr2[i7];
            int i8 = fVar.f2808f;
            Object[] objArr = fVar.f2807e;
            if (i8 < objArr.length) {
                objArr[i8] = jVar2;
                fVar.f2808f = i8 + 1;
            }
        }
        this.f2804m = 0;
        Arrays.fill((j[]) hVar.f2728d, (Object) null);
        this.f2792a = 0;
        i iVar = this.f2793b;
        iVar.f2815h = 0;
        iVar.f2786b = 0.0f;
        this.f2799h = 1;
        for (int i9 = 0; i9 < this.f2800i; i9++) {
            this.f2796e[i9].getClass();
        }
        q();
        this.f2800i = 0;
        this.f2805n = f2791p ? new d(hVar) : new c(hVar);
    }
}
