package g5;

import a5.c;
import f4.h;
import java.io.IOException;
import o4.a;

public final class p implements a {

    /* renamed from: d  reason: collision with root package name */
    public final x f3002d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f3003e;

    public p(u uVar, x xVar) {
        this.f3003e = uVar;
        this.f3002d = xVar;
    }

    public final Object a() {
        b bVar;
        u uVar = this.f3003e;
        x xVar = this.f3002d;
        b bVar2 = b.f2925g;
        e = null;
        try {
            xVar.e(this);
            while (xVar.b(false, this)) {
            }
            bVar = b.f2923e;
            try {
                uVar.b(bVar, b.f2928j, (IOException) null);
            } catch (IOException e6) {
                e = e6;
                try {
                    b bVar3 = b.f2924f;
                    uVar.b(bVar3, bVar3, e);
                    c.b(xVar);
                    return h.f2682a;
                } catch (Throwable th) {
                    th = th;
                    uVar.b(bVar, bVar2, e);
                    c.b(xVar);
                    throw th;
                }
            }
        } catch (IOException e7) {
            e = e7;
            bVar = bVar2;
            b bVar32 = b.f2924f;
            uVar.b(bVar32, bVar32, e);
            c.b(xVar);
            return h.f2682a;
        } catch (Throwable th2) {
            th = th2;
            bVar = bVar2;
            uVar.b(bVar, bVar2, e);
            c.b(xVar);
            throw th;
        }
        c.b(xVar);
        return h.f2682a;
    }
}
