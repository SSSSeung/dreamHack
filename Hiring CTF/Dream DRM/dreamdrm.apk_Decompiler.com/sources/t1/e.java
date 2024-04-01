package t1;

import android.view.ViewGroup;
import h5.d;

public final class e extends q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5098a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5099b;

    public e(ViewGroup viewGroup) {
        this.f5099b = viewGroup;
    }

    public final void a() {
        d.m(this.f5099b, false);
        this.f5098a = true;
    }

    public final void b(p pVar) {
        if (!this.f5098a) {
            d.m(this.f5099b, false);
        }
        pVar.v(this);
    }

    public final void d() {
        d.m(this.f5099b, false);
    }

    public final void e() {
        d.m(this.f5099b, true);
    }
}
