package x0;

import android.view.View;
import android.view.WindowInsets;
import q0.c;

public class c2 extends b2 {

    /* renamed from: n  reason: collision with root package name */
    public c f5551n = null;

    /* renamed from: o  reason: collision with root package name */
    public c f5552o = null;

    /* renamed from: p  reason: collision with root package name */
    public c f5553p = null;

    public c2(h2 h2Var, WindowInsets windowInsets) {
        super(h2Var, windowInsets);
    }

    public c g() {
        if (this.f5552o == null) {
            this.f5552o = c.c(this.f5658c.getMandatorySystemGestureInsets());
        }
        return this.f5552o;
    }

    public c i() {
        if (this.f5551n == null) {
            this.f5551n = c.c(this.f5658c.getSystemGestureInsets());
        }
        return this.f5551n;
    }

    public c k() {
        if (this.f5553p == null) {
            this.f5553p = c.c(this.f5658c.getTappableElementInsets());
        }
        return this.f5553p;
    }

    public h2 l(int i3, int i6, int i7, int i8) {
        return h2.h((View) null, this.f5658c.inset(i3, i6, i7, i8));
    }

    public void q(c cVar) {
    }
}
