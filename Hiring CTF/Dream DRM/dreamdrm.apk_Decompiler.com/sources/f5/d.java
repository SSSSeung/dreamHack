package f5;

import a5.c;
import b1.o;
import e5.e;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l5.g;
import v4.i;
import z4.r;
import z4.t;
import z4.w;

public final class d extends b {

    /* renamed from: g  reason: collision with root package name */
    public long f2691g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2692h = true;

    /* renamed from: i  reason: collision with root package name */
    public final t f2693i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f2694j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar, t tVar) {
        super(hVar);
        o.m(tVar, "url");
        this.f2694j = hVar;
        this.f2693i = tVar;
    }

    public final void close() {
        if (!this.f2686e) {
            if (this.f2692h && !c.f(this, TimeUnit.MILLISECONDS)) {
                this.f2694j.f2705e.k();
                b();
            }
            this.f2686e = true;
        }
    }

    public final long o(g gVar, long j6) {
        o.m(gVar, "sink");
        boolean z5 = true;
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        } else if (!(!this.f2686e)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f2692h) {
            return -1;
        } else {
            long j7 = this.f2691g;
            int i3 = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
            h hVar = this.f2694j;
            if (i3 == 0 || j7 == -1) {
                if (j7 != -1) {
                    hVar.f2706f.r();
                }
                try {
                    this.f2691g = hVar.f2706f.z();
                    String r5 = hVar.f2706f.r();
                    if (r5 != null) {
                        String obj = i.n0(r5).toString();
                        if (this.f2691g >= 0) {
                            if (obj.length() <= 0) {
                                z5 = false;
                            }
                            if (!z5 || i.k0(obj, ";", false)) {
                                if (this.f2691g == 0) {
                                    this.f2692h = false;
                                    hVar.f2703c = hVar.f2702b.a();
                                    w wVar = hVar.f2704d;
                                    o.k(wVar);
                                    r rVar = hVar.f2703c;
                                    o.k(rVar);
                                    e.b(wVar.f6092m, this.f2693i, rVar);
                                    b();
                                }
                                if (!this.f2692h) {
                                    return -1;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f2691g + obj + '\"');
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                } catch (NumberFormatException e6) {
                    throw new ProtocolException(e6.getMessage());
                }
            }
            long o5 = super.o(gVar, Math.min(j6, this.f2691g));
            if (o5 != -1) {
                this.f2691g -= o5;
                return o5;
            }
            hVar.f2705e.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }
}
