package g5;

import c5.a;
import java.io.IOException;

public final class h extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f2980e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f2981f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, u uVar, long j6) {
        super(str, true);
        this.f2980e = uVar;
        this.f2981f = j6;
    }

    public final long a() {
        u uVar;
        boolean z5;
        synchronized (this.f2980e) {
            uVar = this.f2980e;
            long j6 = uVar.f3031q;
            long j7 = uVar.f3030p;
            if (j6 < j7) {
                z5 = true;
            } else {
                uVar.f3030p = j7 + 1;
                z5 = false;
            }
        }
        if (z5) {
            uVar.e((IOException) null);
            return -1;
        }
        try {
            uVar.B.n(1, 0, false);
        } catch (IOException e6) {
            uVar.e(e6);
        }
        return this.f2981f;
    }
}
