package f5;

import a5.c;
import b1.o;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l5.g;

public final class e extends b {

    /* renamed from: g  reason: collision with root package name */
    public long f2695g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f2696h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar, long j6) {
        super(hVar);
        this.f2696h = hVar;
        this.f2695g = j6;
        if (j6 == 0) {
            b();
        }
    }

    public final void close() {
        if (!this.f2686e) {
            if (this.f2695g != 0 && !c.f(this, TimeUnit.MILLISECONDS)) {
                this.f2696h.f2705e.k();
                b();
            }
            this.f2686e = true;
        }
    }

    public final long o(g gVar, long j6) {
        o.m(gVar, "sink");
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        } else if (!this.f2686e) {
            long j7 = this.f2695g;
            if (j7 == 0) {
                return -1;
            }
            long o5 = super.o(gVar, Math.min(j7, j6));
            if (o5 != -1) {
                long j8 = this.f2695g - o5;
                this.f2695g = j8;
                if (j8 == 0) {
                    b();
                }
                return o5;
            }
            this.f2696h.f2705e.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
