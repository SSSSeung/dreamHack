package e5;

import androidx.appcompat.widget.w;
import b1.o;
import b1.v;
import d5.c;
import d5.d;
import d5.e;
import d5.j;
import d5.l;
import java.io.IOException;
import java.net.ProtocolException;
import l5.p;
import l5.q;
import v4.i;
import z4.a0;
import z4.b0;
import z4.c0;
import z4.n;
import z4.r;
import z4.u;
import z4.z;

public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2592a;

    public b(boolean z5) {
        this.f2592a = z5;
    }

    public final a0 a(f fVar) {
        z zVar;
        b0 b0Var;
        z zVar2;
        boolean z5;
        f fVar2 = fVar;
        e eVar = fVar2.f2598e;
        o.k(eVar);
        d dVar = eVar.f2207f;
        n nVar = eVar.f2205d;
        j jVar = eVar.f2204c;
        w wVar = fVar2.f2599f;
        v vVar = (v) wVar.f823f;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            nVar.getClass();
            o.m(jVar, "call");
            dVar.g(wVar);
            boolean L = o.L((String) wVar.f821d);
            boolean z6 = true;
            Long l6 = null;
            l lVar = eVar.f2203b;
            if (!L || vVar == null) {
                jVar.h(eVar, true, false, (IOException) null);
                zVar = null;
            } else {
                if (i.T("100-continue", ((r) wVar.f822e).a("Expect"))) {
                    try {
                        dVar.e();
                        zVar = eVar.b(true);
                        nVar.getClass();
                        o.m(jVar, "call");
                        z5 = false;
                    } catch (IOException e6) {
                        IOException iOException = e6;
                        nVar.getClass();
                        o.m(jVar, "call");
                        eVar.c(iOException);
                        throw iOException;
                    }
                } else {
                    z5 = true;
                    zVar = null;
                }
                if (zVar != null) {
                    jVar.h(eVar, true, false, (IOException) null);
                    if (lVar.f2247f == null) {
                        z6 = false;
                    }
                    if (!z6) {
                        dVar.h().k();
                    }
                    z6 = z5;
                } else {
                    eVar.f2202a = false;
                    o.k((v) wVar.f823f);
                    long j6 = (long) 0;
                    nVar.getClass();
                    o.m(jVar, "call");
                    new p(new c(eVar, dVar.b(wVar, j6), j6)).e((byte[]) null, 0, 0);
                    throw null;
                }
            }
            try {
                dVar.d();
                if (zVar == null) {
                    zVar = eVar.b(false);
                    o.k(zVar);
                    if (z6) {
                        nVar.getClass();
                        o.m(jVar, "call");
                        z6 = false;
                    }
                }
                zVar.f6117a = wVar;
                zVar.f6121e = lVar.f2245d;
                zVar.f6127k = currentTimeMillis;
                zVar.f6128l = System.currentTimeMillis();
                a0 a6 = zVar.a();
                int i3 = a6.f5959g;
                if (i3 == 100) {
                    z b6 = eVar.b(false);
                    o.k(b6);
                    if (z6) {
                        nVar.getClass();
                        o.m(jVar, "call");
                    }
                    b6.f6117a = wVar;
                    b6.f6121e = lVar.f2245d;
                    b6.f6127k = currentTimeMillis;
                    b6.f6128l = System.currentTimeMillis();
                    a6 = b6.a();
                    i3 = a6.f5959g;
                }
                if (!this.f2592a || i3 != 101) {
                    zVar2 = new z(a6);
                    try {
                        String b7 = a0.b(a6, "Content-Type");
                        long c6 = dVar.c(a6);
                        b0Var = new b0(b7, c6, new q(new d(eVar, dVar.a(a6), c6)));
                    } catch (IOException e7) {
                        eVar.c(e7);
                        throw e7;
                    }
                } else {
                    zVar2 = new z(a6);
                    b0Var = a5.c.f214c;
                }
                zVar2.f6123g = b0Var;
                a0 a7 = zVar2.a();
                if (i.T("close", ((r) a7.f5956d.f822e).a("Connection")) || i.T("close", a0.b(a7, "Connection"))) {
                    dVar.h().k();
                }
                if (i3 == 204 || i3 == 205) {
                    c0 c0Var = a7.f5962j;
                    if ((c0Var != null ? ((b0) c0Var).f5971e : -1) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i3);
                        sb.append(" had non-zero Content-Length: ");
                        if (c0Var != null) {
                            l6 = Long.valueOf(((b0) c0Var).f5971e);
                        }
                        sb.append(l6);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a7;
            } catch (IOException e8) {
                IOException iOException2 = e8;
                eVar.c(iOException2);
                throw iOException2;
            }
        } catch (IOException e9) {
            nVar.getClass();
            o.m(jVar, "call");
            eVar.c(e9);
            throw e9;
        }
    }
}
