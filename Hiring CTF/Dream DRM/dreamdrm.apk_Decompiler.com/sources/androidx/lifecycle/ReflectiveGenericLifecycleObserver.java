package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: d  reason: collision with root package name */
    public final Object f1338d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1339e;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1338d = obj;
        this.f1339e = c.f1346c.b(obj.getClass());
    }

    public final void b(r rVar, l lVar) {
        HashMap hashMap = this.f1339e.f1342a;
        Object obj = this.f1338d;
        a.a((List) hashMap.get(lVar), rVar, lVar, obj);
        a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, obj);
    }
}
