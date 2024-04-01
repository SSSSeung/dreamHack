package y3;

import a4.c;
import c4.a;
import h5.d;
import java.util.LinkedHashMap;
import java.util.Map;
import v3.a0;
import v3.q;

public abstract class l extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f5874a;

    public l(LinkedHashMap linkedHashMap) {
        this.f5874a = linkedHashMap;
    }

    public final Object b(a aVar) {
        if (aVar.Q() == 9) {
            aVar.M();
            return null;
        }
        Object c6 = c();
        try {
            aVar.e();
            while (aVar.D()) {
                k kVar = (k) this.f5874a.get(aVar.K());
                if (kVar != null) {
                    if (kVar.f5869d) {
                        e(c6, aVar, kVar);
                    }
                }
                aVar.W();
            }
            aVar.p();
            return d(c6);
        } catch (IllegalStateException e6) {
            throw new q((Exception) e6);
        } catch (IllegalAccessException e7) {
            d dVar = c.f208a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, a aVar, k kVar);
}
