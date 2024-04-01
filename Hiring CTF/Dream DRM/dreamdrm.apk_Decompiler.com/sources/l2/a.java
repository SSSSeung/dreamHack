package l2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import r2.l;

public final class a implements f {

    /* renamed from: d  reason: collision with root package name */
    public final Set f4080d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e  reason: collision with root package name */
    public boolean f4081e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4082f;

    public final void a() {
        this.f4082f = true;
        Iterator it = l.d(this.f4080d).iterator();
        while (it.hasNext()) {
            ((g) it.next()).k();
        }
    }

    public final void b(g gVar) {
        this.f4080d.add(gVar);
        if (this.f4082f) {
            gVar.k();
        } else if (this.f4081e) {
            gVar.j();
        } else {
            gVar.e();
        }
    }

    public final void c() {
        this.f4081e = true;
        Iterator it = l.d(this.f4080d).iterator();
        while (it.hasNext()) {
            ((g) it.next()).j();
        }
    }

    public final void d() {
        this.f4081e = false;
        Iterator it = l.d(this.f4080d).iterator();
        while (it.hasNext()) {
            ((g) it.next()).e();
        }
    }

    public final void g(g gVar) {
        this.f4080d.remove(gVar);
    }
}
