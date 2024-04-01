package g5;

import c5.a;
import java.io.IOException;

public final class t extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f3015e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3016f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f3017g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(String str, u uVar, int i3, long j6) {
        super(str, true);
        this.f3015e = uVar;
        this.f3016f = i3;
        this.f3017g = j6;
    }

    public final long a() {
        u uVar = this.f3015e;
        try {
            uVar.B.q(this.f3017g, this.f3016f);
            return -1;
        } catch (IOException e6) {
            uVar.e(e6);
            return -1;
        }
    }
}
