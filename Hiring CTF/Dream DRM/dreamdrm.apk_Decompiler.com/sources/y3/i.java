package y3;

import a2.m;
import c4.a;
import v3.a0;
import v3.q;
import v3.y;
import v3.z;
import y.d;

public final class i extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final h f5862b = new h(0, new i());

    /* renamed from: a  reason: collision with root package name */
    public final z f5863a = y.f5407e;

    public final Object b(a aVar) {
        int Q = aVar.Q();
        int b6 = d.b(Q);
        if (b6 == 5 || b6 == 6) {
            return this.f5863a.a(aVar);
        }
        if (b6 == 8) {
            aVar.M();
            return null;
        }
        throw new q("Expecting number, got: " + m.w(Q) + "; at path " + aVar.C(false));
    }
}
