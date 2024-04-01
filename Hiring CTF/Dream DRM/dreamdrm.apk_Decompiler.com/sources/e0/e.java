package e0;

import com.bumptech.glide.d;

public final class e extends d {
    public e() {
        super(0);
    }

    public final void A(f fVar, Thread thread) {
        fVar.f2473a = thread;
    }

    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f2465b;
        synchronized (gVar) {
            if (gVar.f2480b != cVar) {
                return false;
            }
            gVar.f2480b = cVar2;
            return true;
        }
    }

    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            if (gVar.f2479a != obj) {
                return false;
            }
            gVar.f2479a = obj2;
            return true;
        }
    }

    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            if (gVar.f2481c != fVar) {
                return false;
            }
            gVar.f2481c = fVar2;
            return true;
        }
    }

    public final void z(f fVar, f fVar2) {
        fVar.f2474b = fVar2;
    }
}
