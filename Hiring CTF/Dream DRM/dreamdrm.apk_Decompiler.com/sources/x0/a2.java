package x0;

import android.view.View;
import android.view.WindowInsets;
import q0.c;

public class a2 extends z1 {

    /* renamed from: m  reason: collision with root package name */
    public c f5540m = null;

    public a2(h2 h2Var, WindowInsets windowInsets) {
        super(h2Var, windowInsets);
    }

    public h2 b() {
        return h2.h((View) null, this.f5658c.consumeStableInsets());
    }

    public h2 c() {
        return h2.h((View) null, this.f5658c.consumeSystemWindowInsets());
    }

    public final c h() {
        if (this.f5540m == null) {
            WindowInsets windowInsets = this.f5658c;
            this.f5540m = c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5540m;
    }

    public boolean m() {
        return this.f5658c.isConsumed();
    }

    public void q(c cVar) {
        this.f5540m = cVar;
    }
}
