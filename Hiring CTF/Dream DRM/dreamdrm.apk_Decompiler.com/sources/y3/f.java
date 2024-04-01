package y3;

import a2.m;
import c4.a;
import java.lang.reflect.Type;
import java.util.Map;
import v3.a0;
import v3.n;
import x3.d;
import x3.q;

public final class f extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f5856a;

    /* renamed from: b  reason: collision with root package name */
    public final q f5857b;

    /* renamed from: c  reason: collision with root package name */
    public final q f5858c;

    public f(g gVar, n nVar, Type type, a0 a0Var, Type type2, a0 a0Var2, q qVar) {
        this.f5856a = new q(nVar, a0Var, type);
        this.f5857b = new q(nVar, a0Var2, type2);
        this.f5858c = qVar;
    }

    public final Object b(a aVar) {
        int i3;
        int Q = aVar.Q();
        if (Q == 9) {
            aVar.M();
            return null;
        }
        Map map = (Map) this.f5858c.j();
        q qVar = this.f5857b;
        q qVar2 = this.f5856a;
        if (Q == 1) {
            aVar.b();
            while (aVar.D()) {
                aVar.b();
                Object b6 = qVar2.b(aVar);
                if (map.put(b6, qVar.b(aVar)) == null) {
                    aVar.n();
                } else {
                    throw new v3.q("duplicate key: " + b6);
                }
            }
            aVar.n();
        } else {
            aVar.e();
            while (aVar.D()) {
                d.f5715d.getClass();
                int i6 = aVar.f1647k;
                if (i6 == 0) {
                    i6 = aVar.l();
                }
                if (i6 == 13) {
                    aVar.f1647k = 9;
                } else {
                    if (i6 == 12) {
                        i3 = 8;
                    } else if (i6 == 14) {
                        i3 = 10;
                    } else {
                        throw new IllegalStateException("Expected a name but was " + m.w(aVar.Q()) + aVar.F());
                    }
                    aVar.f1647k = i3;
                }
                Object b7 = qVar2.b(aVar);
                if (map.put(b7, qVar.b(aVar)) != null) {
                    throw new v3.q("duplicate key: " + b7);
                }
            }
            aVar.p();
        }
        return map;
    }
}
