package androidx.fragment.app;

import android.view.View;
import h5.l;

public final class o extends l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ r f1218q;

    public o(r rVar) {
        this.f1218q = rVar;
    }

    public final View j(int i3) {
        r rVar = this.f1218q;
        View view = rVar.H;
        if (view != null) {
            return view.findViewById(i3);
        }
        throw new IllegalStateException("Fragment " + rVar + " does not have a view");
    }

    public final boolean k() {
        return this.f1218q.H != null;
    }
}
