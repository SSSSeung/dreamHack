package androidx.lifecycle;

import android.os.Bundle;

public final class SavedStateHandleAttacher implements p {

    /* renamed from: d  reason: collision with root package name */
    public final i0 f1340d;

    public SavedStateHandleAttacher(i0 i0Var) {
        this.f1340d = i0Var;
    }

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_CREATE) {
            rVar.h().t(this);
            i0 i0Var = this.f1340d;
            if (!i0Var.f1363b) {
                Bundle a6 = i0Var.f1362a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = i0Var.f1364c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a6 != null) {
                    bundle.putAll(a6);
                }
                i0Var.f1364c = bundle;
                i0Var.f1363b = true;
                j0 j0Var = (j0) i0Var.f1365d.a();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
    }
}
