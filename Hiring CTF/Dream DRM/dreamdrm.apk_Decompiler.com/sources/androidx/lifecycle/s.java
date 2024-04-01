package androidx.lifecycle;

import b1.o;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public m f1378a;

    /* renamed from: b  reason: collision with root package name */
    public final p f1379b;

    public s(q qVar, m mVar) {
        p pVar;
        o.k(qVar);
        HashMap hashMap = u.f1386a;
        boolean z5 = qVar instanceof p;
        boolean z6 = qVar instanceof d;
        if (z5 && z6) {
            pVar = new DefaultLifecycleObserverAdapter((d) qVar, (p) qVar);
        } else if (z6) {
            pVar = new DefaultLifecycleObserverAdapter((d) qVar, (p) null);
        } else if (z5) {
            pVar = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj = u.f1387b.get(cls);
                o.k(obj);
                List list = (List) obj;
                if (list.size() != 1) {
                    int size = list.size();
                    g[] gVarArr = new g[size];
                    if (size <= 0) {
                        pVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                pVar = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        this.f1379b = pVar;
        this.f1378a = mVar;
    }

    public final void a(r rVar, l lVar) {
        m a6 = lVar.a();
        m mVar = this.f1378a;
        o.m(mVar, "state1");
        if (a6.compareTo(mVar) < 0) {
            mVar = a6;
        }
        this.f1378a = mVar;
        this.f1379b.b(rVar, lVar);
        this.f1378a = a6;
    }
}
