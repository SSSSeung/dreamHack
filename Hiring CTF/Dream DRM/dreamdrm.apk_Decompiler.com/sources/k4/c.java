package k4;

import androidx.compose.ui.platform.e;
import b1.o;
import i4.d;
import i4.f;
import i4.h;

public abstract class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public final h f3970e;

    /* renamed from: f  reason: collision with root package name */
    public transient d f3971f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        this(dVar, dVar != null ? dVar.f() : null);
    }

    public h f() {
        h hVar = this.f3970e;
        o.k(hVar);
        return hVar;
    }

    public void k() {
        d dVar = this.f3971f;
        if (!(dVar == null || dVar == this)) {
            f l6 = f().l(e.f892i);
            o.k(l6);
            i4.e eVar = (i4.e) l6;
            ((kotlinx.coroutines.internal.c) dVar).j();
        }
        this.f3971f = b.f3969d;
    }

    public c(d dVar, h hVar) {
        super(dVar);
        this.f3970e = hVar;
    }
}
