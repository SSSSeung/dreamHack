package f5;

import a5.c;
import b1.o;
import l5.g;
import l5.k;
import l5.u;
import l5.x;

public final class f implements u {

    /* renamed from: d  reason: collision with root package name */
    public final k f2697d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2698e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f2699f;

    public f(h hVar) {
        this.f2699f = hVar;
        this.f2697d = new k(hVar.f2707g.c());
    }

    public final x c() {
        return this.f2697d;
    }

    public final void close() {
        if (!this.f2698e) {
            this.f2698e = true;
            h hVar = this.f2699f;
            hVar.getClass();
            k kVar = this.f2697d;
            x xVar = kVar.f4133e;
            kVar.f4133e = x.f4164d;
            xVar.a();
            xVar.b();
            hVar.f2701a = 3;
        }
    }

    public final void flush() {
        if (!this.f2698e) {
            this.f2699f.f2707g.flush();
        }
    }

    public final void t(g gVar, long j6) {
        o.m(gVar, "source");
        if (!this.f2698e) {
            long j7 = gVar.f4128e;
            byte[] bArr = c.f212a;
            if ((0 | j6) < 0 || 0 > j7 || j7 - 0 < j6) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f2699f.f2707g.t(gVar, j6);
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
