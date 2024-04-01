package i0;

import java.util.Iterator;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f3539m;

    public g(m mVar) {
        super(mVar);
        this.f3531e = mVar instanceof j ? 2 : 3;
    }

    public final void d(int i3) {
        if (!this.f3536j) {
            this.f3536j = true;
            this.f3533g = i3;
            Iterator it = this.f3537k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
