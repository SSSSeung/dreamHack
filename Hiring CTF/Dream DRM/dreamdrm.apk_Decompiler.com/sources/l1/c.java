package l1;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import b1.o;

public final class c implements l0 {

    /* renamed from: d  reason: collision with root package name */
    public final e[] f4077d;

    public c(e... eVarArr) {
        o.m(eVarArr, "initializers");
        this.f4077d = eVarArr;
    }

    public final k0 c(Class cls, d dVar) {
        k0 k0Var = null;
        for (e eVar : this.f4077d) {
            if (o.c(eVar.f4078a, cls)) {
                Object i3 = eVar.f4079b.i(dVar);
                k0Var = i3 instanceof k0 ? (k0) i3 : null;
            }
        }
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
