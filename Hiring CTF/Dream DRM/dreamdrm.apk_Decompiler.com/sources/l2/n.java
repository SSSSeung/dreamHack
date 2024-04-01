package l2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o2.e;
import r2.l;

public final class n implements g {

    /* renamed from: d  reason: collision with root package name */
    public final Set f4106d = Collections.newSetFromMap(new WeakHashMap());

    public final void e() {
        Iterator it = l.d(this.f4106d).iterator();
        while (it.hasNext()) {
            ((e) it.next()).e();
        }
    }

    public final void j() {
        Iterator it = l.d(this.f4106d).iterator();
        while (it.hasNext()) {
            ((e) it.next()).j();
        }
    }

    public final void k() {
        Iterator it = l.d(this.f4106d).iterator();
        while (it.hasNext()) {
            ((e) it.next()).k();
        }
    }
}
