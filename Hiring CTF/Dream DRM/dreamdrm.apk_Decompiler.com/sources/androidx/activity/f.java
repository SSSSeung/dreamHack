package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.HashMap;
import q1.c;

public final /* synthetic */ class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f283a;

    public /* synthetic */ f(v vVar) {
        this.f283a = vVar;
    }

    public final Bundle a() {
        n nVar = this.f283a;
        nVar.getClass();
        Bundle bundle = new Bundle();
        h hVar = nVar.f307m;
        hVar.getClass();
        HashMap hashMap = hVar.f286b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(hVar.f288d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f291g.clone());
        return bundle;
    }
}
