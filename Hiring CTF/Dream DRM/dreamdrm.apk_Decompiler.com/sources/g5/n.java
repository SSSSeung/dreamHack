package g5;

import c5.a;
import java.io.IOException;

public final class n extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f2996e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2997f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f2998g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i3, int i6) {
        super(str, true);
        this.f2996e = pVar;
        this.f2997f = i3;
        this.f2998g = i6;
    }

    public final long a() {
        u uVar = this.f2996e.f3003e;
        int i3 = this.f2997f;
        int i6 = this.f2998g;
        uVar.getClass();
        try {
            uVar.B.n(i3, i6, true);
            return -1;
        } catch (IOException e6) {
            uVar.e(e6);
            return -1;
        }
    }
}
