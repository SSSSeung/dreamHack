package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import h5.l;

public final class m extends l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l f1196q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ n f1197r;

    public m(n nVar, o oVar) {
        this.f1197r = nVar;
        this.f1196q = oVar;
    }

    public final View j(int i3) {
        l lVar = this.f1196q;
        if (lVar.k()) {
            return lVar.j(i3);
        }
        Dialog dialog = this.f1197r.f1211g0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    public final boolean k() {
        return this.f1196q.k() || this.f1197r.f1214j0;
    }
}
