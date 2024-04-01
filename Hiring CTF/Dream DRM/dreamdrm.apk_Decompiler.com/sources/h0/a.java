package h0;

import a2.m;
import g0.c;
import g0.e;
import g0.j;

public final class a extends k {
    public int f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3233g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public int f3234h0 = 0;

    public final void b(e eVar) {
        boolean z5;
        d dVar;
        j jVar;
        int i3;
        int i6;
        e eVar2 = eVar;
        d[] dVarArr = this.F;
        d dVar2 = this.f3293x;
        dVarArr[0] = dVar2;
        int i7 = 2;
        d dVar3 = this.f3294y;
        dVarArr[2] = dVar3;
        d dVar4 = this.f3295z;
        dVarArr[1] = dVar4;
        d dVar5 = this.A;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.f3267g = eVar2.k(dVar6);
        }
        int i8 = this.f0;
        if (i8 >= 0 && i8 < 4) {
            d dVar7 = dVarArr[i8];
            int i9 = 0;
            while (true) {
                if (i9 >= this.f3353e0) {
                    z5 = false;
                    break;
                }
                e eVar3 = this.f3352d0[i9];
                if ((this.f3233g0 || eVar3.c()) && ((((i6 = this.f0) == 0 || i6 == 1) && eVar3.f3273c0[0] == 3 && eVar3.f3293x.f3264d != null && eVar3.f3295z.f3264d != null) || ((i6 == 2 || i6 == 3) && eVar3.f3273c0[1] == 3 && eVar3.f3294y.f3264d != null && eVar3.A.f3264d != null))) {
                    z5 = true;
                } else {
                    i9++;
                }
            }
            boolean z6 = dVar2.e() || dVar4.e();
            boolean z7 = dVar3.e() || dVar5.e();
            int i10 = !(!z5 && (((i3 = this.f0) == 0 && z6) || ((i3 == 2 && z7) || ((i3 == 1 && z6) || (i3 == 3 && z7))))) ? 4 : 5;
            int i11 = 0;
            while (i11 < this.f3353e0) {
                e eVar4 = this.f3352d0[i11];
                if (this.f3233g0 || eVar4.c()) {
                    j k6 = eVar2.k(eVar4.F[this.f0]);
                    int i12 = this.f0;
                    d dVar8 = eVar4.F[i12];
                    dVar8.f3267g = k6;
                    d dVar9 = dVar8.f3264d;
                    int i13 = (dVar9 == null || dVar9.f3262b != this) ? 0 : dVar8.f3265e + 0;
                    if (i12 == 0 || i12 == i7) {
                        c l6 = eVar.l();
                        j m6 = eVar.m();
                        m6.f2820d = 0;
                        l6.c(dVar7.f3267g, k6, m6, this.f3234h0 - i13);
                        eVar2.c(l6);
                    } else {
                        c l7 = eVar.l();
                        j m7 = eVar.m();
                        m7.f2820d = 0;
                        l7.b(dVar7.f3267g, k6, m7, this.f3234h0 + i13);
                        eVar2.c(l7);
                    }
                    eVar2.e(dVar7.f3267g, k6, this.f3234h0 + i13, i10);
                }
                i11++;
                i7 = 2;
            }
            int i14 = this.f0;
            if (i14 == 0) {
                eVar2.e(dVar4.f3267g, dVar2.f3267g, 0, 8);
                eVar2.e(dVar2.f3267g, this.I.f3295z.f3267g, 0, 4);
                jVar = dVar2.f3267g;
                dVar = this.I.f3293x;
            } else if (i14 == 1) {
                eVar2.e(dVar2.f3267g, dVar4.f3267g, 0, 8);
                eVar2.e(dVar2.f3267g, this.I.f3293x.f3267g, 0, 4);
                jVar = dVar2.f3267g;
                dVar = this.I.f3295z;
            } else if (i14 == 2) {
                eVar2.e(dVar5.f3267g, dVar3.f3267g, 0, 8);
                eVar2.e(dVar3.f3267g, this.I.A.f3267g, 0, 4);
                jVar = dVar3.f3267g;
                dVar = this.I.f3294y;
            } else if (i14 == 3) {
                eVar2.e(dVar3.f3267g, dVar5.f3267g, 0, 8);
                eVar2.e(dVar3.f3267g, this.I.f3294y.f3267g, 0, 4);
                jVar = dVar3.f3267g;
                dVar = this.I.A;
            } else {
                return;
            }
            eVar2.e(jVar, dVar.f3267g, 0, 0);
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String j6 = m.j(new StringBuilder("[Barrier] "), this.W, " {");
        for (int i3 = 0; i3 < this.f3353e0; i3++) {
            e eVar = this.f3352d0[i3];
            if (i3 > 0) {
                j6 = m.h(j6, ", ");
            }
            j6 = j6 + eVar.W;
        }
        return m.h(j6, "}");
    }
}
