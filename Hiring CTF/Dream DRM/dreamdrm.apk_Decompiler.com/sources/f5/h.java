package f5;

import a5.c;
import androidx.fragment.app.n0;
import b1.o;
import d5.l;
import e5.d;
import e5.e;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import l5.i;
import l5.u;
import l5.v;
import z4.a0;
import z4.r;
import z4.t;
import z4.w;
import z4.x;
import z4.z;

public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f2701a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2702b;

    /* renamed from: c  reason: collision with root package name */
    public r f2703c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2704d;

    /* renamed from: e  reason: collision with root package name */
    public final l f2705e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2706f;

    /* renamed from: g  reason: collision with root package name */
    public final l5.h f2707g;

    public h(w wVar, l lVar, i iVar, l5.h hVar) {
        o.m(lVar, "connection");
        this.f2704d = wVar;
        this.f2705e = lVar;
        this.f2706f = iVar;
        this.f2707g = hVar;
        this.f2702b = new a(iVar);
    }

    public final v a(a0 a0Var) {
        if (!e.a(a0Var)) {
            return i(0);
        }
        boolean z5 = true;
        if (v4.i.T("chunked", a0.b(a0Var, "Transfer-Encoding"))) {
            t tVar = (t) a0Var.f5956d.f820c;
            if (this.f2701a != 4) {
                z5 = false;
            }
            if (z5) {
                this.f2701a = 5;
                return new d(this, tVar);
            }
            throw new IllegalStateException(("state: " + this.f2701a).toString());
        }
        long i3 = c.i(a0Var);
        if (i3 != -1) {
            return i(i3);
        }
        if (this.f2701a != 4) {
            z5 = false;
        }
        if (z5) {
            this.f2701a = 5;
            this.f2705e.k();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.f2701a).toString());
    }

    public final u b(androidx.appcompat.widget.w wVar, long j6) {
        b1.v vVar = (b1.v) wVar.f823f;
        if (vVar != null) {
            vVar.getClass();
        }
        boolean z5 = true;
        if (v4.i.T("chunked", ((r) wVar.f822e).a("Transfer-Encoding"))) {
            if (this.f2701a != 1) {
                z5 = false;
            }
            if (z5) {
                this.f2701a = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f2701a).toString());
        } else if (j6 != -1) {
            if (this.f2701a != 1) {
                z5 = false;
            }
            if (z5) {
                this.f2701a = 2;
                return new f(this);
            }
            throw new IllegalStateException(("state: " + this.f2701a).toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final long c(a0 a0Var) {
        if (!e.a(a0Var)) {
            return 0;
        }
        if (v4.i.T("chunked", a0.b(a0Var, "Transfer-Encoding"))) {
            return -1;
        }
        return c.i(a0Var);
    }

    public final void cancel() {
        Socket socket = this.f2705e.f2243b;
        if (socket != null) {
            c.c(socket);
        }
    }

    public final void d() {
        this.f2707g.flush();
    }

    public final void e() {
        this.f2707g.flush();
    }

    public final z f(boolean z5) {
        a aVar = this.f2702b;
        int i3 = this.f2701a;
        boolean z6 = true;
        if (!(i3 == 1 || i3 == 3)) {
            z6 = false;
        }
        if (z6) {
            try {
                String h6 = aVar.f2684b.h(aVar.f2683a);
                aVar.f2683a -= (long) h6.length();
                e5.h v5 = n0.v(h6);
                int i6 = v5.f2605b;
                z zVar = new z();
                x xVar = v5.f2604a;
                o.m(xVar, "protocol");
                zVar.f6118b = xVar;
                zVar.f6119c = i6;
                String str = v5.f2606c;
                o.m(str, "message");
                zVar.f6120d = str;
                zVar.f6122f = aVar.a().c();
                if (z5 && i6 == 100) {
                    return null;
                }
                if (i6 == 100) {
                    this.f2701a = 3;
                    return zVar;
                }
                this.f2701a = 4;
                return zVar;
            } catch (EOFException e6) {
                throw new IOException("unexpected end of stream on " + this.f2705e.f2258q.f5988a.f5945a.f(), e6);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f2701a).toString());
        }
    }

    public final void g(androidx.appcompat.widget.w wVar) {
        Proxy.Type type = this.f2705e.f2258q.f5989b.type();
        o.l(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) wVar.f821d);
        sb.append(' ');
        Object obj = wVar.f820c;
        if (!((t) obj).f6070a && type == Proxy.Type.HTTP) {
            sb.append((t) obj);
        } else {
            t tVar = (t) obj;
            o.m(tVar, "url");
            String b6 = tVar.b();
            String d6 = tVar.d();
            if (d6 != null) {
                b6 = b6 + '?' + d6;
            }
            sb.append(b6);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        o.l(sb2, "StringBuilder().apply(builderAction).toString()");
        j((r) wVar.f822e, sb2);
    }

    public final l h() {
        return this.f2705e;
    }

    public final e i(long j6) {
        if (this.f2701a == 4) {
            this.f2701a = 5;
            return new e(this, j6);
        }
        throw new IllegalStateException(("state: " + this.f2701a).toString());
    }

    public final void j(r rVar, String str) {
        o.m(rVar, "headers");
        o.m(str, "requestLine");
        if (this.f2701a == 0) {
            l5.h hVar = this.f2707g;
            hVar.u(str).u("\r\n");
            int length = rVar.f6060d.length / 2;
            for (int i3 = 0; i3 < length; i3++) {
                hVar.u(rVar.b(i3)).u(": ").u(rVar.d(i3)).u("\r\n");
            }
            hVar.u("\r\n");
            this.f2701a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f2701a).toString());
    }
}
