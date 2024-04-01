package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.a;
import androidx.activity.result.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import t0.d;

public final class d0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l0 f1121b;

    public /* synthetic */ d0(l0 l0Var, int i3) {
        this.f1120a = i3;
        this.f1121b = l0Var;
    }

    public final void a(a aVar) {
        StringBuilder sb;
        StringBuilder sb2;
        int i3 = this.f1120a;
        l0 l0Var = this.f1121b;
        switch (i3) {
            case 0:
                i0 i0Var = (i0) l0Var.f1194y.pollFirst();
                if (i0Var == null) {
                    sb2 = new StringBuilder("No IntentSenders were started for ");
                    sb2.append(this);
                } else {
                    s0 s0Var = l0Var.f1173c;
                    String str = i0Var.f1162d;
                    r c6 = s0Var.c(str);
                    if (c6 == null) {
                        sb2 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                        sb2.append(str);
                    } else {
                        c6.p(i0Var.f1163e, aVar.f323d, aVar.f324e);
                        return;
                    }
                }
                Log.w("FragmentManager", sb2.toString());
                return;
            default:
                i0 i0Var2 = (i0) l0Var.f1194y.pollFirst();
                if (i0Var2 == null) {
                    sb = new StringBuilder("No Activities were started for result for ");
                    sb.append(this);
                } else {
                    s0 s0Var2 = l0Var.f1173c;
                    String str2 = i0Var2.f1162d;
                    r c7 = s0Var2.c(str2);
                    if (c7 == null) {
                        sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                        sb.append(str2);
                    } else {
                        c7.p(i0Var2.f1163e, aVar.f323d, aVar.f324e);
                        return;
                    }
                }
                Log.w("FragmentManager", sb.toString());
                return;
        }
    }

    public final void b(Object obj) {
        StringBuilder sb;
        switch (this.f1120a) {
            case 0:
                a((a) obj);
                return;
            case 1:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    iArr[i3] = ((Boolean) arrayList.get(i3)).booleanValue() ? 0 : -1;
                }
                l0 l0Var = this.f1121b;
                i0 i0Var = (i0) l0Var.f1194y.pollFirst();
                if (i0Var == null) {
                    sb = new StringBuilder("No permissions were requested for ");
                    sb.append(this);
                } else {
                    s0 s0Var = l0Var.f1173c;
                    String str = i0Var.f1162d;
                    if (s0Var.c(str) == null) {
                        sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                        sb.append(str);
                    } else {
                        return;
                    }
                }
                Log.w("FragmentManager", sb.toString());
                return;
            default:
                a((a) obj);
                return;
        }
    }

    public final void c(r rVar, d dVar) {
        boolean z5;
        synchronized (dVar) {
            z5 = dVar.f5082a;
        }
        if (!z5) {
            l0 l0Var = this.f1121b;
            Map map = l0Var.f1181k;
            HashSet hashSet = (HashSet) map.get(rVar);
            if (hashSet != null && hashSet.remove(dVar) && hashSet.isEmpty()) {
                map.remove(rVar);
                if (rVar.f1254d < 5) {
                    rVar.C();
                    l0Var.f1183m.o(false);
                    rVar.G = null;
                    rVar.H = null;
                    rVar.Q = null;
                    rVar.R.e((Object) null);
                    rVar.f1267q = false;
                    l0Var.K(l0Var.f1185o, rVar);
                }
            }
        }
    }

    public final void d(r rVar, d dVar) {
        Map map = this.f1121b.f1181k;
        if (map.get(rVar) == null) {
            map.put(rVar, new HashSet());
        }
        ((HashSet) map.get(rVar)).add(dVar);
    }
}
