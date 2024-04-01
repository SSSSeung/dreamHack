package x0;

import android.view.View;
import android.view.WindowInsets;
import q0.c;

public class w1 extends y1 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f5638c;

    public w1() {
        v1.g();
        this.f5638c = v1.b();
    }

    public h2 b() {
        a();
        h2 h6 = h2.h((View) null, this.f5638c.build());
        h6.f5572a.o(this.f5644b);
        return h6;
    }

    public void d(c cVar) {
        this.f5638c.setMandatorySystemGestureInsets(cVar.d());
    }

    public void e(c cVar) {
        this.f5638c.setStableInsets(cVar.d());
    }

    public void f(c cVar) {
        this.f5638c.setSystemGestureInsets(cVar.d());
    }

    public void g(c cVar) {
        this.f5638c.setSystemWindowInsets(cVar.d());
    }

    public void h(c cVar) {
        this.f5638c.setTappableElementInsets(cVar.d());
    }

    public w1(h2 h2Var) {
        super(h2Var);
        WindowInsets.Builder builder;
        WindowInsets g6 = h2Var.g();
        if (g6 != null) {
            v1.g();
            builder = v1.c(g6);
        } else {
            v1.g();
            builder = v1.b();
        }
        this.f5638c = builder;
    }
}
