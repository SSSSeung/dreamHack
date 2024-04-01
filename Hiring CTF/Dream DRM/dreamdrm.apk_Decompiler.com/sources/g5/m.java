package g5;

import c5.a;
import h5.n;
import java.io.IOException;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a0 f2994e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f2995f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, a0 a0Var, p pVar) {
        super(str, true);
        this.f2994e = a0Var;
        this.f2995f = pVar;
    }

    public final long a() {
        try {
            this.f2995f.f3003e.f3019e.b(this.f2994e);
            return -1;
        } catch (IOException e6) {
            n nVar = n.f3500a;
            n.f3500a.getClass();
            n.i("Http2Connection.Listener failure for " + this.f2995f.f3003e.f3021g, 4, e6);
            try {
                this.f2994e.c(b.f2924f, e6);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
