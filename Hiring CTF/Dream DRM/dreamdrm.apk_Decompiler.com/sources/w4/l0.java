package w4;

public class l0 extends q0 {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5492e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(i0 i0Var) {
        super(true);
        g gVar;
        boolean z5 = true;
        E(i0Var);
        f A = A();
        g gVar2 = A instanceof g ? (g) A : null;
        if (gVar2 != null) {
            while (true) {
                q0 r5 = gVar2.r();
                if (!r5.x()) {
                    f A2 = r5.A();
                    if (A2 instanceof g) {
                        gVar = (g) A2;
                        continue;
                    } else {
                        gVar = null;
                        continue;
                    }
                    if (gVar2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z5 = false;
        }
        this.f5492e = z5;
    }

    public final boolean x() {
        return this.f5492e;
    }

    public final boolean y() {
        return true;
    }
}
