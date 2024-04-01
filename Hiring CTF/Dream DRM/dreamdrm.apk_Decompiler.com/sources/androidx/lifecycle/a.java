package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1342a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f1343b;

    public a(HashMap hashMap) {
        this.f1343b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getValue();
            List list = (List) this.f1342a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f1342a.put(lVar, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                b bVar = (b) list.get(size);
                bVar.getClass();
                try {
                    int i3 = bVar.f1344a;
                    Method method = bVar.f1345b;
                    if (i3 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i3 == 1) {
                        method.invoke(obj, new Object[]{rVar});
                    } else if (i3 == 2) {
                        method.invoke(obj, new Object[]{rVar, lVar});
                    }
                    size--;
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }
}
