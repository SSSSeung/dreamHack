package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.v;
import b.b;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f284a;

    public /* synthetic */ g(v vVar) {
        this.f284a = vVar;
    }

    public final void a() {
        n nVar = this.f284a;
        Bundle a6 = nVar.f302h.f4898b.a("android:support:activity-result");
        if (a6 != null) {
            h hVar = nVar.f307m;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = a6.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                hVar.f288d = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                Bundle bundle = a6.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = hVar.f291g;
                bundle2.putAll(bundle);
                for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                    String str = stringArrayList.get(i3);
                    HashMap hashMap = hVar.f286b;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = hVar.f285a;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i3).intValue();
                    String str2 = stringArrayList.get(i3);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }
}
