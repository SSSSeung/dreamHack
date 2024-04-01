package androidx.appcompat.widget;

import android.view.View;
import h.g0;

public final class k extends e2 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f649m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f650n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View f651o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i3) {
        super(view2);
        this.f649m = i3;
        this.f651o = view;
        this.f650n = obj;
    }

    public final g0 b() {
        switch (this.f649m) {
            case 0:
                h hVar = ((l) this.f651o).f652g.f674v;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (t0) this.f650n;
        }
    }

    public final boolean c() {
        int i3 = this.f649m;
        View view = this.f651o;
        switch (i3) {
            case 0:
                ((l) view).f652g.l();
                return true;
            default:
                w0 w0Var = (w0) view;
                if (!w0Var.getInternalPopup().a()) {
                    w0Var.f831i.d(o0.b(w0Var), o0.a(w0Var));
                }
                return true;
        }
    }

    public final boolean d() {
        switch (this.f649m) {
            case 0:
                m mVar = ((l) this.f651o).f652g;
                if (mVar.f675x != null) {
                    return false;
                }
                mVar.f();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
