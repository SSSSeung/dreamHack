package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import t0.d;

public final class w implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1309d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1310e;

    public /* synthetic */ w(int i3, Object obj) {
        this.f1309d = i3;
        this.f1310e = obj;
    }

    public final void run() {
        int i3 = this.f1309d;
        Object obj = this.f1310e;
        switch (i3) {
            case 0:
                d dVar = (d) obj;
                Object obj2 = dVar.f1117c;
                p pVar = ((r) obj2).K;
                if ((pVar == null ? null : pVar.f1226a) != null) {
                    ((r) obj2).f().f1226a = null;
                    ((d0) dVar.f1118d).c((r) dVar.f1117c, (d) dVar.f1119e);
                    return;
                }
                return;
            case 1:
                d dVar2 = (d) obj;
                dVar2.f1116b.endViewTransition((View) dVar2.f1117c);
                ((g) dVar2.f1118d).b();
                return;
            case 2:
                n nVar = (n) obj;
                nVar.Y.onDismiss(nVar.f1211g0);
                return;
            case 3:
                ((l0) obj).w(true);
                return;
            default:
                v0.b((ArrayList) obj, 4);
                return;
        }
    }
}
