package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.n0;
import b.b;
import e.l;

public final class t implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f1285a;

    public t(l lVar) {
        this.f1285a = lVar;
    }

    public final void a() {
        v vVar = this.f1285a;
        u uVar = (u) vVar.f1303s.f1170b;
        uVar.f1297t.b(uVar, uVar, (r) null);
        Bundle a6 = vVar.f302h.f4898b.a("android:support:fragments");
        if (a6 != null) {
            Parcelable parcelable = a6.getParcelable("android:support:fragments");
            u uVar2 = (u) vVar.f1303s.f1170b;
            if (uVar2 instanceof n0) {
                uVar2.f1297t.R(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
