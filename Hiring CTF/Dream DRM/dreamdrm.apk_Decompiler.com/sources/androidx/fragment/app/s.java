package androidx.fragment.app;

import android.os.Bundle;
import e.l;
import q1.c;

public final class s implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f1281a;

    public s(l lVar) {
        this.f1281a = lVar;
    }

    public final Bundle a() {
        v vVar;
        Bundle bundle = new Bundle();
        do {
            vVar = this.f1281a;
        } while (v.l(((u) vVar.f1303s.f1170b).f1297t));
        vVar.f1304t.x(androidx.lifecycle.l.ON_STOP);
        m0 S = ((u) vVar.f1303s.f1170b).f1297t.S();
        if (S != null) {
            bundle.putParcelable("android:support:fragments", S);
        }
        return bundle;
    }
}
