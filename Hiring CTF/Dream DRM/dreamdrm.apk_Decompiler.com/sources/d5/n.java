package d5;

import a2.m;
import b1.o;
import c5.c;
import c5.f;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import z4.a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f2260a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2261b;

    /* renamed from: c  reason: collision with root package name */
    public final m f2262c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue f2263d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2264e = 5;

    public n(f fVar, TimeUnit timeUnit) {
        o.m(fVar, "taskRunner");
        o.m(timeUnit, "timeUnit");
        this.f2260a = timeUnit.toNanos(5);
        this.f2261b = fVar.f();
        this.f2262c = new m(this, m.j(new StringBuilder(), a5.c.f218g, " ConnectionPool"));
        this.f2263d = new ConcurrentLinkedQueue();
    }

    public final boolean a(a aVar, j jVar, List list, boolean z5) {
        o.m(aVar, "address");
        o.m(jVar, "call");
        Iterator it = this.f2263d.iterator();
        while (true) {
            boolean z6 = false;
            if (!it.hasNext()) {
                return false;
            }
            l lVar = (l) it.next();
            o.l(lVar, "connection");
            synchronized (lVar) {
                if (z5) {
                    if (lVar.f2247f != null) {
                        z6 = true;
                    }
                    if (!z6) {
                    }
                }
                if (lVar.h(aVar, list)) {
                    jVar.b(lVar);
                    return true;
                }
            }
        }
    }

    public final int b(l lVar, long j6) {
        byte[] bArr = a5.c.f212a;
        ArrayList arrayList = lVar.f2256o;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i3);
            if (reference.get() != null) {
                i3++;
            } else {
                h5.n nVar = h5.n.f3500a;
                h5.n.f3500a.j(((h) reference).f2221a, "A connection to " + lVar.f2258q.f5988a.f5945a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i3);
                lVar.f2250i = true;
                if (arrayList.isEmpty()) {
                    lVar.f2257p = j6 - this.f2260a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
