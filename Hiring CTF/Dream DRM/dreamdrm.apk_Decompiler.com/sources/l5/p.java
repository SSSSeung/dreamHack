package l5;

import b1.o;
import java.nio.ByteBuffer;

public final class p implements h {

    /* renamed from: d  reason: collision with root package name */
    public final g f4146d = new g();

    /* renamed from: e  reason: collision with root package name */
    public boolean f4147e;

    /* renamed from: f  reason: collision with root package name */
    public final u f4148f;

    public p(u uVar) {
        o.m(uVar, "sink");
        this.f4148f = uVar;
    }

    public final h b() {
        if (!this.f4147e) {
            g gVar = this.f4146d;
            long j6 = gVar.f4128e;
            if (j6 == 0) {
                j6 = 0;
            } else {
                r rVar = gVar.f4127d;
                o.k(rVar);
                r rVar2 = rVar.f4158g;
                o.k(rVar2);
                int i3 = rVar2.f4154c;
                if (i3 < 8192 && rVar2.f4156e) {
                    j6 -= (long) (i3 - rVar2.f4153b);
                }
            }
            if (j6 > 0) {
                this.f4148f.t(gVar, j6);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final x c() {
        return this.f4148f.c();
    }

    public final void close() {
        u uVar = this.f4148f;
        if (!this.f4147e) {
            try {
                g gVar = this.f4146d;
                long j6 = gVar.f4128e;
                if (j6 > 0) {
                    uVar.t(gVar, j6);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                uVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f4147e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final h d(byte[] bArr) {
        o.m(bArr, "source");
        if (!this.f4147e) {
            g gVar = this.f4146d;
            gVar.getClass();
            gVar.E(bArr, 0, bArr.length);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h e(byte[] bArr, int i3, int i6) {
        o.m(bArr, "source");
        if (!this.f4147e) {
            this.f4146d.E(bArr, i3, i6);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h f(long j6) {
        if (!this.f4147e) {
            this.f4146d.H(j6);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.f4147e) {
            g gVar = this.f4146d;
            long j6 = gVar.f4128e;
            int i3 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
            u uVar = this.f4148f;
            if (i3 > 0) {
                uVar.t(gVar, j6);
            }
            uVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.f4147e;
    }

    public final h j(j jVar) {
        o.m(jVar, "byteString");
        if (!this.f4147e) {
            this.f4146d.D(jVar);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h k(int i3) {
        if (!this.f4147e) {
            this.f4146d.J(i3);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h m(int i3) {
        if (!this.f4147e) {
            this.f4146d.I(i3);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void t(g gVar, long j6) {
        o.m(gVar, "source");
        if (!this.f4147e) {
            this.f4146d.t(gVar, j6);
            b();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f4148f + ')';
    }

    public final h u(String str) {
        o.m(str, "string");
        if (!this.f4147e) {
            this.f4146d.L(str);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        o.m(byteBuffer, "source");
        if (!this.f4147e) {
            int write = this.f4146d.write(byteBuffer);
            b();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h y(int i3) {
        if (!this.f4147e) {
            this.f4146d.G(i3);
            b();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
