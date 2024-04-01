package f5;

import b1.o;
import l5.g;
import l5.h;
import l5.k;
import l5.u;
import l5.x;

public final class c implements u {

    /* renamed from: d  reason: collision with root package name */
    public final k f2688d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2689e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f2690f;

    public c(h hVar) {
        this.f2690f = hVar;
        this.f2688d = new k(hVar.f2707g.c());
    }

    public final x c() {
        return this.f2688d;
    }

    public final synchronized void close() {
        if (!this.f2689e) {
            this.f2689e = true;
            this.f2690f.f2707g.u("0\r\n\r\n");
            h hVar = this.f2690f;
            k kVar = this.f2688d;
            hVar.getClass();
            x xVar = kVar.f4133e;
            kVar.f4133e = x.f4164d;
            xVar.a();
            xVar.b();
            this.f2690f.f2701a = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.f2689e) {
            this.f2690f.f2707g.flush();
        }
    }

    public final void t(g gVar, long j6) {
        o.m(gVar, "source");
        if (!(!this.f2689e)) {
            throw new IllegalStateException("closed".toString());
        } else if (j6 != 0) {
            h hVar = this.f2690f;
            hVar.f2707g.f(j6);
            h hVar2 = hVar.f2707g;
            hVar2.u("\r\n");
            hVar2.t(gVar, j6);
            hVar2.u("\r\n");
        }
    }
}
