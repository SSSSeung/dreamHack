package androidx.appcompat.widget;

import h.q;

public final /* synthetic */ class x3 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f849d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Toolbar f850e;

    public /* synthetic */ x3(Toolbar toolbar, int i3) {
        this.f849d = i3;
        this.f850e = toolbar;
    }

    public final void run() {
        int i3 = this.f849d;
        Toolbar toolbar = this.f850e;
        switch (i3) {
            case 0:
                toolbar.l();
                return;
            default:
                a4 a4Var = toolbar.O;
                q qVar = a4Var == null ? null : a4Var.f509e;
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
