package d5;

import b1.o;
import e5.f;
import java.io.IOException;
import z4.a0;
import z4.u;
import z4.w;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2184a = new a();

    public final a0 a(f fVar) {
        j jVar = fVar.f2595b;
        jVar.getClass();
        synchronized (jVar) {
            if (!jVar.f2235o) {
                throw new IllegalStateException("released".toString());
            } else if (!(!jVar.f2234n)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!jVar.f2233m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        f fVar2 = jVar.f2229i;
        o.k(fVar2);
        w wVar = jVar.f2239s;
        o.m(wVar, "client");
        try {
            e eVar = new e(jVar, jVar.f2225e, fVar2, fVar2.a(fVar.f2600g, fVar.f2601h, fVar.f2602i, wVar.f6088i, !o.c((String) fVar.f2599f.f821d, "GET")).j(wVar, fVar));
            jVar.f2232l = eVar;
            jVar.f2237q = eVar;
            synchronized (jVar) {
                jVar.f2233m = true;
                jVar.f2234n = true;
            }
            if (!jVar.f2236p) {
                return f.a(fVar, 0, eVar, (androidx.appcompat.widget.w) null, 61).b(fVar.f2599f);
            }
            throw new IOException("Canceled");
        } catch (o e6) {
            fVar2.c(e6.f2265d);
            throw e6;
        } catch (IOException e7) {
            fVar2.c(e7);
            throw new o(e7);
        }
    }
}
