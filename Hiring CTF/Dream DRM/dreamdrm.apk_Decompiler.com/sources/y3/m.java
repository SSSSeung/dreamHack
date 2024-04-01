package y3;

import a4.c;
import c4.a;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import x3.q;

public final class m extends l {

    /* renamed from: b  reason: collision with root package name */
    public final q f5875b;

    public m(q qVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f5875b = qVar;
    }

    public final Object c() {
        return this.f5875b.j();
    }

    public final Object d(Object obj) {
        return obj;
    }

    public final void e(Object obj, a aVar, k kVar) {
        Object b6 = kVar.f5871f.b(aVar);
        if (b6 != null || !kVar.f5872g) {
            boolean z5 = kVar.f5870e;
            Field field = kVar.f5867b;
            if (z5) {
                o.b(obj, field);
            } else if (kVar.f5873h) {
                String d6 = c.d(field, false);
                throw new v3.q("Cannot set value of 'static final' " + d6);
            }
            field.set(obj, b6);
        }
    }
}
