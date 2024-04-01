package d5;

import b1.o;
import java.io.IOException;
import java.net.ProtocolException;
import l5.g;
import l5.u;
import l5.x;

public final class c implements u {

    /* renamed from: d  reason: collision with root package name */
    public final u f2189d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2190e;

    /* renamed from: f  reason: collision with root package name */
    public long f2191f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2192g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2193h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f2194i;

    public c(e eVar, u uVar, long j6) {
        o.m(uVar, "delegate");
        this.f2194i = eVar;
        this.f2189d = uVar;
        this.f2193h = j6;
    }

    public final void b() {
        this.f2189d.close();
    }

    public final x c() {
        return this.f2189d.c();
    }

    public final void close() {
        if (!this.f2192g) {
            this.f2192g = true;
            long j6 = this.f2193h;
            if (j6 == -1 || this.f2191f == j6) {
                try {
                    b();
                    e((IOException) null);
                } catch (IOException e6) {
                    throw e(e6);
                }
            } else {
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f2190e) {
            return iOException;
        }
        this.f2190e = true;
        return this.f2194i.a(false, true, iOException);
    }

    public final void flush() {
        try {
            i();
        } catch (IOException e6) {
            throw e(e6);
        }
    }

    public final void i() {
        this.f2189d.flush();
    }

    /* renamed from: l */
    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f2189d + ')';
    }

    public final void t(g gVar, long j6) {
        o.m(gVar, "source");
        if (!this.f2192g) {
            long j7 = this.f2193h;
            if (j7 == -1 || this.f2191f + j6 <= j7) {
                try {
                    this.f2189d.t(gVar, j6);
                    this.f2191f += j6;
                } catch (IOException e6) {
                    throw e(e6);
                }
            } else {
                throw new ProtocolException("expected " + j7 + " bytes but received " + (this.f2191f + j6));
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
