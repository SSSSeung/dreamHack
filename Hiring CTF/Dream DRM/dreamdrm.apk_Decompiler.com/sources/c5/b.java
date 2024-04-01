package c5;

import g5.p;
import g5.u;
import java.io.IOException;
import o4.a;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1668e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1669f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(p pVar, String str) {
        super(str, true);
        this.f1669f = pVar;
    }

    public final long a() {
        int i3 = this.f1668e;
        Object obj = this.f1669f;
        switch (i3) {
            case 0:
                ((a) obj).a();
                return -1;
            default:
                u uVar = (u) obj;
                uVar.getClass();
                try {
                    uVar.B.n(2, 0, false);
                } catch (IOException e6) {
                    uVar.e(e6);
                }
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, u uVar) {
        super(str, true);
        this.f1669f = uVar;
    }
}
