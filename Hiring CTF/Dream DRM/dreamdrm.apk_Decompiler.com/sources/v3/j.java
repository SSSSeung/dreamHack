package v3;

import c4.a;

public final class j extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5392a;

    public /* synthetic */ j(int i3) {
        this.f5392a = i3;
    }

    public final Object b(a aVar) {
        switch (this.f5392a) {
            case 0:
                if (aVar.Q() != 9) {
                    return Double.valueOf(aVar.H());
                }
                aVar.M();
                return null;
            default:
                if (aVar.Q() != 9) {
                    return Float.valueOf((float) aVar.H());
                }
                aVar.M();
                return null;
        }
    }
}
