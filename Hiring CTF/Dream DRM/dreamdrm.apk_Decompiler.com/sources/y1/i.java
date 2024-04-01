package y1;

import java.security.MessageDigest;
import r2.c;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    public final c f5816b = new c();

    public final void a(MessageDigest messageDigest) {
        int i3 = 0;
        while (true) {
            c cVar = this.f5816b;
            if (i3 < cVar.f3895f) {
                h hVar = (h) cVar.h(i3);
                Object l6 = this.f5816b.l(i3);
                g gVar = hVar.f5813b;
                if (hVar.f5815d == null) {
                    hVar.f5815d = hVar.f5814c.getBytes(f.f5810a);
                }
                gVar.e(hVar.f5815d, l6, messageDigest);
                i3++;
            } else {
                return;
            }
        }
    }

    public final Object c(h hVar) {
        c cVar = this.f5816b;
        return cVar.containsKey(hVar) ? cVar.getOrDefault(hVar, (Object) null) : hVar.f5812a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f5816b.equals(((i) obj).f5816b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5816b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f5816b + '}';
    }
}
