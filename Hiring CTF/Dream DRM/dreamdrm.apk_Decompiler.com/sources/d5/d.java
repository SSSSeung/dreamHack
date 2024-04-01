package d5;

import b1.o;
import java.io.IOException;
import java.net.ProtocolException;
import l5.g;
import l5.v;
import l5.x;
import z4.n;

public final class d implements v {

    /* renamed from: d  reason: collision with root package name */
    public final v f2195d;

    /* renamed from: e  reason: collision with root package name */
    public long f2196e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2197f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2198g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2199h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2200i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f2201j;

    public d(e eVar, v vVar, long j6) {
        o.m(vVar, "delegate");
        this.f2201j = eVar;
        this.f2195d = vVar;
        this.f2200i = j6;
        if (j6 == 0) {
            e((IOException) null);
        }
    }

    public final void b() {
        this.f2195d.close();
    }

    public final x c() {
        return this.f2195d.c();
    }

    public final void close() {
        if (!this.f2199h) {
            this.f2199h = true;
            try {
                b();
                e((IOException) null);
            } catch (IOException e6) {
                throw e(e6);
            }
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f2198g) {
            return iOException;
        }
        this.f2198g = true;
        e eVar = this.f2201j;
        if (iOException == null && this.f2197f) {
            this.f2197f = false;
            eVar.f2205d.getClass();
            o.m(eVar.f2204c, "call");
        }
        return eVar.a(true, false, iOException);
    }

    /* renamed from: i */
    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f2195d + ')';
    }

    public final long o(g gVar, long j6) {
        o.m(gVar, "sink");
        if (!this.f2199h) {
            try {
                long o5 = this.f2195d.o(gVar, j6);
                if (this.f2197f) {
                    this.f2197f = false;
                    e eVar = this.f2201j;
                    n nVar = eVar.f2205d;
                    j jVar = eVar.f2204c;
                    nVar.getClass();
                    o.m(jVar, "call");
                }
                if (o5 == -1) {
                    e((IOException) null);
                    return -1;
                }
                long j7 = this.f2196e + o5;
                long j8 = this.f2200i;
                if (j8 == -1 || j7 <= j8) {
                    this.f2196e = j7;
                    if (j7 == j8) {
                        e((IOException) null);
                    }
                    return o5;
                }
                throw new ProtocolException("expected " + j8 + " bytes but received " + j7);
            } catch (IOException e6) {
                throw e(e6);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
