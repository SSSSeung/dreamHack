package e5;

import a5.c;
import androidx.appcompat.widget.w;
import androidx.compose.ui.platform.e;
import b1.o;
import b1.v;
import v4.i;
import z4.a0;
import z4.b0;
import z4.c0;
import z4.l;
import z4.q;
import z4.r;
import z4.t;
import z4.u;
import z4.y;
import z4.z;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final l f2591a;

    public a(e eVar) {
        o.m(eVar, "cookieJar");
        this.f2591a = eVar;
    }

    public final a0 a(f fVar) {
        c0 c0Var;
        w wVar = fVar.f2599f;
        wVar.getClass();
        y yVar = new y(wVar);
        boolean z5 = false;
        if (((v) wVar.f823f) != null) {
            long j6 = (long) 0;
            if (j6 != -1) {
                yVar.c("Content-Length", String.valueOf(j6));
                yVar.f6115c.c("Transfer-Encoding");
            } else {
                yVar.c("Transfer-Encoding", "chunked");
                yVar.f6115c.c("Content-Length");
            }
        }
        Object obj = wVar.f822e;
        String a6 = ((r) obj).a("Host");
        Object obj2 = wVar.f820c;
        if (a6 == null) {
            yVar.c("Host", c.t((t) obj2, false));
        }
        if (((r) obj).a("Connection") == null) {
            yVar.c("Connection", "Keep-Alive");
        }
        if (((r) obj).a("Accept-Encoding") == null && ((r) obj).a("Range") == null) {
            yVar.c("Accept-Encoding", "gzip");
            z5 = true;
        }
        t tVar = (t) obj2;
        l lVar = this.f2591a;
        ((e) lVar).getClass();
        o.m(tVar, "url");
        if (((r) obj).a("User-Agent") == null) {
            yVar.c("User-Agent", "okhttp/4.9.0");
        }
        a0 b6 = fVar.b(yVar.b());
        r rVar = b6.f5961i;
        e.b(lVar, tVar, rVar);
        z zVar = new z(b6);
        zVar.f6117a = wVar;
        if (z5 && i.T("gzip", a0.b(b6, "Content-Encoding")) && e.a(b6) && (c0Var = b6.f5962j) != null) {
            l5.l lVar2 = new l5.l(((b0) c0Var).f5972f);
            q c6 = rVar.c();
            c6.c("Content-Encoding");
            c6.c("Content-Length");
            zVar.f6122f = c6.b().c();
            zVar.f6123g = new b0(a0.b(b6, "Content-Type"), -1, new l5.q(lVar2));
        }
        return zVar.a();
    }
}
