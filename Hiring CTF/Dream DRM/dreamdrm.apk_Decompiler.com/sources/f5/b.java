package f5;

import b1.o;
import java.io.IOException;
import l5.g;
import l5.k;
import l5.v;
import l5.x;

public abstract class b implements v {

    /* renamed from: d  reason: collision with root package name */
    public final k f2685d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2686e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f2687f;

    public b(h hVar) {
        this.f2687f = hVar;
        this.f2685d = new k(hVar.f2706f.c());
    }

    public final void b() {
        h hVar = this.f2687f;
        int i3 = hVar.f2701a;
        if (i3 != 6) {
            if (i3 == 5) {
                k kVar = this.f2685d;
                x xVar = kVar.f4133e;
                kVar.f4133e = x.f4164d;
                xVar.a();
                xVar.b();
                hVar.f2701a = 6;
                return;
            }
            throw new IllegalStateException("state: " + hVar.f2701a);
        }
    }

    public final x c() {
        return this.f2685d;
    }

    public long o(g gVar, long j6) {
        h hVar = this.f2687f;
        o.m(gVar, "sink");
        try {
            return hVar.f2706f.o(gVar, j6);
        } catch (IOException e6) {
            hVar.f2705e.k();
            b();
            throw e6;
        }
    }
}
