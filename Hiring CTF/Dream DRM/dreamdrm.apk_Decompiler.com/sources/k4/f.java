package k4;

import i4.d;
import i4.h;
import i4.i;

public abstract class f extends a {
    public f(d dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.f() == i.f3606d)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final h f() {
        return i.f3606d;
    }
}
