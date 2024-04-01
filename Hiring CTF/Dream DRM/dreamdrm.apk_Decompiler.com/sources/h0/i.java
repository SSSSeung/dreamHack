package h0;

import g0.c;
import g0.e;
import g0.j;
import java.util.ArrayList;

public final class i extends e {

    /* renamed from: d0  reason: collision with root package name */
    public float f3348d0 = -1.0f;

    /* renamed from: e0  reason: collision with root package name */
    public int f3349e0 = -1;
    public int f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public d f3350g0 = this.f3294y;

    /* renamed from: h0  reason: collision with root package name */
    public int f3351h0;

    public i() {
        this.f3351h0 = 0;
        this.G.clear();
        this.G.add(this.f3350g0);
        int length = this.F.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.F[i3] = this.f3350g0;
        }
    }

    public final void A(e eVar) {
        if (this.I != null) {
            d dVar = this.f3350g0;
            eVar.getClass();
            int n5 = e.n(dVar);
            if (this.f3351h0 == 1) {
                this.N = n5;
                this.O = 0;
                v(this.I.j());
                y(0);
                return;
            }
            this.N = 0;
            this.O = n5;
            y(this.I.l());
            v(0);
        }
    }

    public final void B(int i3) {
        if (this.f3351h0 != i3) {
            this.f3351h0 = i3;
            ArrayList arrayList = this.G;
            arrayList.clear();
            this.f3350g0 = this.f3351h0 == 1 ? this.f3293x : this.f3294y;
            arrayList.add(this.f3350g0);
            d[] dVarArr = this.F;
            int length = dVarArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                dVarArr[i6] = this.f3350g0;
            }
        }
    }

    public final void b(e eVar) {
        f fVar = (f) this.I;
        if (fVar != null) {
            d h6 = fVar.h(c.f3252d);
            d h7 = fVar.h(c.f3254f);
            e eVar2 = this.I;
            boolean z5 = true;
            boolean z6 = eVar2 != null && eVar2.f3273c0[0] == 2;
            if (this.f3351h0 == 0) {
                h6 = fVar.h(c.f3253e);
                h7 = fVar.h(c.f3255g);
                e eVar3 = this.I;
                if (eVar3 == null || eVar3.f3273c0[1] != 2) {
                    z5 = false;
                }
                z6 = z5;
            }
            if (this.f3349e0 != -1) {
                j k6 = eVar.k(this.f3350g0);
                eVar.e(k6, eVar.k(h6), this.f3349e0, 8);
                if (z6) {
                    eVar.f(eVar.k(h7), k6, 0, 5);
                }
            } else if (this.f0 != -1) {
                j k7 = eVar.k(this.f3350g0);
                j k8 = eVar.k(h7);
                eVar.e(k7, k8, -this.f0, 8);
                if (z6) {
                    eVar.f(k7, eVar.k(h6), 0, 5);
                    eVar.f(k8, k7, 0, 5);
                }
            } else if (this.f3348d0 != -1.0f) {
                j k9 = eVar.k(this.f3350g0);
                j k10 = eVar.k(h7);
                float f6 = this.f3348d0;
                c l6 = eVar.l();
                l6.f2788d.h(k9, -1.0f);
                l6.f2788d.h(k10, f6);
                eVar.c(l6);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final d h(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f3351h0 == 1) {
                    return this.f3350g0;
                }
                break;
            case 2:
            case 4:
                if (this.f3351h0 == 0) {
                    return this.f3350g0;
                }
                break;
        }
        throw new AssertionError(cVar.name());
    }
}
