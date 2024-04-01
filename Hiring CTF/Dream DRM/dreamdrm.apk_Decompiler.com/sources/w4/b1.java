package w4;

import i4.h;

public final class b1 extends l {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5473f = 0;

    static {
        new b1();
    }

    public final void C(h hVar, Runnable runnable) {
        e1 e1Var = (e1) hVar.l(e1.f5481e);
        if (e1Var != null) {
            e1Var.getClass();
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
