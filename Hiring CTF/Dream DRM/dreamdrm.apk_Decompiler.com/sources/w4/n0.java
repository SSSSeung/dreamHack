package w4;

import f4.h;

public final class n0 extends m0 {

    /* renamed from: h  reason: collision with root package name */
    public final q0 f5495h;

    /* renamed from: i  reason: collision with root package name */
    public final o0 f5496i;

    /* renamed from: j  reason: collision with root package name */
    public final g f5497j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f5498k;

    public n0(q0 q0Var, o0 o0Var, g gVar, Object obj) {
        this.f5495h = q0Var;
        this.f5496i = o0Var;
        this.f5497j = gVar;
        this.f5498k = obj;
    }

    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        s((Throwable) obj);
        return h.f2682a;
    }

    public final void s(Throwable th) {
        q0 q0Var = this.f5495h;
        q0Var.getClass();
        g J = q0.J(this.f5497j);
        o0 o0Var = this.f5496i;
        Object obj = this.f5498k;
        if (J == null || !q0Var.R(o0Var, J, obj)) {
            q0Var.a(q0Var.u(o0Var, obj));
        }
    }
}
