package i0;

import h0.e;
import h0.i;

public final class h extends m {
    public h(e eVar) {
        super(eVar);
        eVar.f3274d.f();
        eVar.f3275e.f();
        this.f3550f = ((i) eVar).f3351h0;
    }

    public final void a(d dVar) {
        f fVar = this.f3552h;
        if (fVar.f3529c && !fVar.f3536j) {
            fVar.d((int) ((((float) ((f) fVar.f3538l.get(0)).f3533g) * ((i) this.f3546b).f3348d0) + 0.5f));
        }
    }

    public final void d() {
        m mVar;
        e eVar = this.f3546b;
        i iVar = (i) eVar;
        int i3 = iVar.f3349e0;
        int i6 = iVar.f0;
        int i7 = iVar.f3351h0;
        f fVar = this.f3552h;
        if (i7 == 1) {
            if (i3 != -1) {
                fVar.f3538l.add(eVar.I.f3274d.f3552h);
                this.f3546b.I.f3274d.f3552h.f3537k.add(fVar);
                fVar.f3532f = i3;
            } else if (i6 != -1) {
                fVar.f3538l.add(eVar.I.f3274d.f3553i);
                this.f3546b.I.f3274d.f3553i.f3537k.add(fVar);
                fVar.f3532f = -i6;
            } else {
                fVar.f3528b = true;
                fVar.f3538l.add(eVar.I.f3274d.f3553i);
                this.f3546b.I.f3274d.f3553i.f3537k.add(fVar);
            }
            m(this.f3546b.f3274d.f3552h);
            mVar = this.f3546b.f3274d;
        } else {
            if (i3 != -1) {
                fVar.f3538l.add(eVar.I.f3275e.f3552h);
                this.f3546b.I.f3275e.f3552h.f3537k.add(fVar);
                fVar.f3532f = i3;
            } else if (i6 != -1) {
                fVar.f3538l.add(eVar.I.f3275e.f3553i);
                this.f3546b.I.f3275e.f3553i.f3537k.add(fVar);
                fVar.f3532f = -i6;
            } else {
                fVar.f3528b = true;
                fVar.f3538l.add(eVar.I.f3275e.f3553i);
                this.f3546b.I.f3275e.f3553i.f3537k.add(fVar);
            }
            m(this.f3546b.f3275e.f3552h);
            mVar = this.f3546b.f3275e;
        }
        m(mVar.f3553i);
    }

    public final void e() {
        e eVar = this.f3546b;
        int i3 = ((i) eVar).f3351h0;
        f fVar = this.f3552h;
        if (i3 == 1) {
            eVar.N = fVar.f3533g;
        } else {
            eVar.O = fVar.f3533g;
        }
    }

    public final void f() {
        this.f3552h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3552h;
        fVar2.f3537k.add(fVar);
        fVar.f3538l.add(fVar2);
    }
}
