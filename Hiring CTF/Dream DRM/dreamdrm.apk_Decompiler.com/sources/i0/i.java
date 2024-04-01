package i0;

import h0.a;
import h0.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class i extends m {
    public i(e eVar) {
        super(eVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f3546b;
        int i3 = aVar.f0;
        f fVar = this.f3552h;
        Iterator it = fVar.f3538l.iterator();
        int i6 = 0;
        int i7 = -1;
        while (it.hasNext()) {
            int i8 = ((f) it.next()).f3533g;
            if (i7 == -1 || i8 < i7) {
                i7 = i8;
            }
            if (i6 < i8) {
                i6 = i8;
            }
        }
        if (i3 == 0 || i3 == 2) {
            fVar.d(i7 + aVar.f3234h0);
        } else {
            fVar.d(i6 + aVar.f3234h0);
        }
    }

    public final void d() {
        m mVar;
        e eVar = this.f3546b;
        if (eVar instanceof a) {
            f fVar = this.f3552h;
            fVar.f3528b = true;
            a aVar = (a) eVar;
            int i3 = aVar.f0;
            boolean z5 = aVar.f3233g0;
            ArrayList arrayList = fVar.f3538l;
            int i6 = 0;
            if (i3 == 0) {
                fVar.f3531e = 4;
                while (i6 < aVar.f3353e0) {
                    e eVar2 = aVar.f3352d0[i6];
                    if (z5 || eVar2.V != 8) {
                        f fVar2 = eVar2.f3274d.f3552h;
                        fVar2.f3537k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i6++;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    fVar.f3531e = 6;
                    while (i6 < aVar.f3353e0) {
                        e eVar3 = aVar.f3352d0[i6];
                        if (z5 || eVar3.V != 8) {
                            f fVar3 = eVar3.f3275e.f3552h;
                            fVar3.f3537k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i6++;
                    }
                } else if (i3 == 3) {
                    fVar.f3531e = 7;
                    while (i6 < aVar.f3353e0) {
                        e eVar4 = aVar.f3352d0[i6];
                        if (z5 || eVar4.V != 8) {
                            f fVar4 = eVar4.f3275e.f3553i;
                            fVar4.f3537k.add(fVar);
                            arrayList.add(fVar4);
                        }
                        i6++;
                    }
                } else {
                    return;
                }
                m(this.f3546b.f3275e.f3552h);
                mVar = this.f3546b.f3275e;
                m(mVar.f3553i);
            } else {
                fVar.f3531e = 5;
                while (i6 < aVar.f3353e0) {
                    e eVar5 = aVar.f3352d0[i6];
                    if (z5 || eVar5.V != 8) {
                        f fVar5 = eVar5.f3274d.f3553i;
                        fVar5.f3537k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i6++;
                }
            }
            m(this.f3546b.f3274d.f3552h);
            mVar = this.f3546b.f3274d;
            m(mVar.f3553i);
        }
    }

    public final void e() {
        e eVar = this.f3546b;
        if (eVar instanceof a) {
            int i3 = ((a) eVar).f0;
            f fVar = this.f3552h;
            if (i3 == 0 || i3 == 1) {
                eVar.N = fVar.f3533g;
            } else {
                eVar.O = fVar.f3533g;
            }
        }
    }

    public final void f() {
        this.f3547c = null;
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
