package e;

import android.os.Bundle;
import b1.o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.a;
import q1.c;
import q1.d;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2388a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2389b;

    public /* synthetic */ j(int i3, Object obj) {
        this.f2388a = i3;
        this.f2389b = obj;
    }

    public final Bundle a() {
        int i3 = this.f2388a;
        Object obj = this.f2389b;
        switch (i3) {
            case 0:
                Bundle bundle = new Bundle();
                ((l) obj).m().getClass();
                return bundle;
            case 1:
                Map a6 = ((a) obj).a();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : a6.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
                }
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList((Set) obj));
                return bundle3;
        }
    }

    public j(d dVar) {
        this.f2388a = 2;
        o.m(dVar, "registry");
        this.f2389b = new LinkedHashSet();
        dVar.c("androidx.savedstate.Restarter", this);
    }
}
