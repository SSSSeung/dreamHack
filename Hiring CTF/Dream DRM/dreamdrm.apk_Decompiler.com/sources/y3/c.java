package y3;

import c4.a;
import java.lang.reflect.Type;
import java.util.Collection;
import v3.a0;
import v3.n;
import x3.q;

public final class c extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5849a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5850b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5851c;

    public c(n nVar, Type type, a0 a0Var, q qVar) {
        this.f5850b = new q(nVar, a0Var, type);
        this.f5851c = qVar;
    }

    public final Object b(a aVar) {
        int i3 = this.f5849a;
        Object obj = this.f5850b;
        Object obj2 = this.f5851c;
        switch (i3) {
            case 0:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                Collection collection = (Collection) ((q) obj2).j();
                aVar.b();
                while (aVar.D()) {
                    collection.add(((a0) obj).b(aVar));
                }
                aVar.n();
                return collection;
            default:
                Object b6 = ((r) obj2).f5891f.b(aVar);
                if (b6 != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(b6)) {
                        throw new v3.q("Expected a " + cls.getName() + " but was " + b6.getClass().getName() + "; at path " + aVar.C(true));
                    }
                }
                return b6;
        }
    }

    public c(r rVar, Class cls) {
        this.f5851c = rVar;
        this.f5850b = cls;
    }
}
