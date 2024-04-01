package j;

import java.util.HashMap;

public final class a extends g {

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3629h = new HashMap();

    public final c a(Object obj) {
        return (c) this.f3629h.get(obj);
    }

    public final Object b(Object obj) {
        Object b6 = super.b(obj);
        this.f3629h.remove(obj);
        return b6;
    }

    public final Object c(Object obj, Object obj2) {
        c a6 = a(obj);
        if (a6 != null) {
            return a6.f3632e;
        }
        HashMap hashMap = this.f3629h;
        c cVar = new c(obj, obj2);
        this.f3643g++;
        c cVar2 = this.f3641e;
        if (cVar2 == null) {
            this.f3640d = cVar;
        } else {
            cVar2.f3633f = cVar;
            cVar.f3634g = cVar2;
        }
        this.f3641e = cVar;
        hashMap.put(obj, cVar);
        return null;
    }
}
