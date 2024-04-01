package w4;

import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.r;

public final class p0 extends f {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0 f5519d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5520e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(h hVar, q0 q0Var, Object obj) {
        super(hVar);
        this.f5519d = q0Var;
        this.f5520e = obj;
    }

    public final r c(Object obj) {
        h hVar = (h) obj;
        if (this.f5519d.B() == this.f5520e) {
            return null;
        }
        return p.f5501b;
    }
}
