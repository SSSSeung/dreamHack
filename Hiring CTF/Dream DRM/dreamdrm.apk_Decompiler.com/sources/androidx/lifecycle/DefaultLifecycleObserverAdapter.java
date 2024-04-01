package androidx.lifecycle;

import b1.o;

public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: d  reason: collision with root package name */
    public final d f1336d;

    /* renamed from: e  reason: collision with root package name */
    public final p f1337e;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        o.m(dVar, "defaultLifecycleObserver");
        this.f1336d = dVar;
        this.f1337e = pVar;
    }

    public final void b(r rVar, l lVar) {
        int i3 = e.f1350a[lVar.ordinal()];
        d dVar = this.f1336d;
        switch (i3) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                dVar.getClass();
                break;
            case 3:
                dVar.a(rVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f1337e;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}
