package g0;

import g.h;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public j f2785a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f2786b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2787c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public b f2788d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2789e = false;

    public c() {
    }

    public final void a(e eVar, int i3) {
        this.f2788d.h(eVar.j(i3), 1.0f);
        this.f2788d.h(eVar.j(i3), -1.0f);
    }

    public final void b(j jVar, j jVar2, j jVar3, int i3) {
        boolean z5 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z5 = true;
            }
            this.f2786b = (float) i3;
        }
        if (!z5) {
            this.f2788d.h(jVar, -1.0f);
            this.f2788d.h(jVar2, 1.0f);
            this.f2788d.h(jVar3, 1.0f);
            return;
        }
        this.f2788d.h(jVar, 1.0f);
        this.f2788d.h(jVar2, -1.0f);
        this.f2788d.h(jVar3, -1.0f);
    }

    public final void c(j jVar, j jVar2, j jVar3, int i3) {
        boolean z5 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z5 = true;
            }
            this.f2786b = (float) i3;
        }
        if (!z5) {
            this.f2788d.h(jVar, -1.0f);
            this.f2788d.h(jVar2, 1.0f);
            this.f2788d.h(jVar3, -1.0f);
            return;
        }
        this.f2788d.h(jVar, 1.0f);
        this.f2788d.h(jVar2, -1.0f);
        this.f2788d.h(jVar3, 1.0f);
    }

    public j d(boolean[] zArr) {
        return e(zArr, (j) null);
    }

    public final j e(boolean[] zArr, j jVar) {
        int i3;
        int k6 = this.f2788d.k();
        j jVar2 = null;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < k6; i6++) {
            float a6 = this.f2788d.a(i6);
            if (a6 < 0.0f) {
                j f7 = this.f2788d.f(i6);
                if ((zArr == null || !zArr[f7.f2818b]) && f7 != jVar && (((i3 = f7.f2828l) == 3 || i3 == 4) && a6 < f6)) {
                    f6 = a6;
                    jVar2 = f7;
                }
            }
        }
        return jVar2;
    }

    public final void f(j jVar) {
        j jVar2 = this.f2785a;
        if (jVar2 != null) {
            this.f2788d.h(jVar2, -1.0f);
            this.f2785a = null;
        }
        float b6 = this.f2788d.b(jVar, true) * -1.0f;
        this.f2785a = jVar;
        if (b6 != 1.0f) {
            this.f2786b /= b6;
            this.f2788d.i(b6);
        }
    }

    public final void g() {
        this.f2785a = null;
        this.f2788d.clear();
        this.f2786b = 0.0f;
        this.f2789e = false;
    }

    public final void h(j jVar, boolean z5) {
        if (jVar.f2822f) {
            float c6 = this.f2788d.c(jVar);
            this.f2786b = (jVar.f2821e * c6) + this.f2786b;
            this.f2788d.b(jVar, z5);
            if (z5) {
                jVar.b(this);
            }
        }
    }

    public void i(c cVar, boolean z5) {
        float e6 = this.f2788d.e(cVar, z5);
        this.f2786b = (cVar.f2786b * e6) + this.f2786b;
        if (z5) {
            cVar.f2785a.b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            g0.j r0 = r9.f2785a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            g0.j r1 = r9.f2785a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = a2.m.h(r0, r1)
            float r1 = r9.f2786b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f2786b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            g0.b r5 = r9.f2788d
            int r5 = r5.k()
        L_0x0040:
            if (r4 >= r5) goto L_0x00ac
            g0.b r6 = r9.f2788d
            g0.j r6 = r6.f(r4)
            if (r6 != 0) goto L_0x004b
            goto L_0x00a9
        L_0x004b:
            g0.b r7 = r9.f2788d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0056
            goto L_0x00a9
        L_0x0056:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x006b
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x008b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x0081
        L_0x006b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L_0x007f
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x008b
        L_0x007f:
            java.lang.String r0 = " - "
        L_0x0081:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L_0x008b:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00a4
        L_0x0097:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00a4:
            java.lang.String r0 = a2.m.j(r1, r0, r6)
            r1 = r3
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x00ac:
            if (r1 != 0) goto L_0x00b4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a2.m.h(r0, r1)
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.c.toString():java.lang.String");
    }

    public c(h hVar) {
        this.f2788d = new a(this, hVar);
    }
}
