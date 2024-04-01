package k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class b extends j implements Map {

    /* renamed from: k  reason: collision with root package name */
    public a f3856k;

    public b() {
    }

    public b(b bVar) {
        if (bVar != null) {
            i(bVar);
        }
    }

    public final Set entrySet() {
        if (this.f3856k == null) {
            this.f3856k = new a(0, this);
        }
        a aVar = this.f3856k;
        if (((g) aVar.f3098a) == null) {
            aVar.f3098a = new g(aVar, 0);
        }
        return (g) aVar.f3098a;
    }

    public final Set keySet() {
        if (this.f3856k == null) {
            this.f3856k = new a(0, this);
        }
        a aVar = this.f3856k;
        if (((g) aVar.f3099b) == null) {
            aVar.f3099b = new g(aVar, 1);
        }
        return (g) aVar.f3099b;
    }

    public final void putAll(Map map) {
        b(map.size() + this.f3895f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        if (this.f3856k == null) {
            this.f3856k = new a(0, this);
        }
        a aVar = this.f3856k;
        if (aVar.f3100c == null) {
            aVar.f3100c = new i(aVar);
        }
        return aVar.f3100c;
    }
}
