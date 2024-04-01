package c2;

import a2.f0;
import a2.r;
import e2.t;
import java.util.ArrayDeque;
import r2.h;

public final class f extends h {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1611d = 0;

    /* renamed from: e  reason: collision with root package name */
    public Object f1612e;

    public f(long j6) {
        super(j6);
    }

    public final int b(Object obj) {
        switch (this.f1611d) {
            case 0:
                f0 f0Var = (f0) obj;
                if (f0Var == null) {
                    return 1;
                }
                return f0Var.b();
            default:
                return 1;
        }
    }

    public final void c(Object obj, Object obj2) {
        switch (this.f1611d) {
            case 0:
                y1.f fVar = (y1.f) obj;
                f0 f0Var = (f0) obj2;
                g gVar = (g) this.f1612e;
                if (gVar != null && f0Var != null) {
                    ((r) gVar).f139e.a(f0Var, true);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                tVar.getClass();
                ArrayDeque arrayDeque = t.f2540d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(tVar);
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e2.f fVar) {
        super(500);
        this.f1612e = fVar;
    }
}
