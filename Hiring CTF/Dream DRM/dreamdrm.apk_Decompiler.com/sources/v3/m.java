package v3;

import c4.a;
import y3.p;

public final class m extends p {

    /* renamed from: a  reason: collision with root package name */
    public a0 f5396a = null;

    public final Object b(a aVar) {
        a0 a0Var = this.f5396a;
        if (a0Var != null) {
            return a0Var.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
