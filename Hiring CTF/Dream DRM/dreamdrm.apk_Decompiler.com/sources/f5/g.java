package f5;

import b1.o;

public final class g extends b {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2700g;

    public g(h hVar) {
        super(hVar);
    }

    public final void close() {
        if (!this.f2686e) {
            if (!this.f2700g) {
                b();
            }
            this.f2686e = true;
        }
    }

    public final long o(l5.g gVar, long j6) {
        o.m(gVar, "sink");
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        } else if (!(!this.f2686e)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f2700g) {
            return -1;
        } else {
            long o5 = super.o(gVar, j6);
            if (o5 != -1) {
                return o5;
            }
            this.f2700g = true;
            b();
            return -1;
        }
    }
}
