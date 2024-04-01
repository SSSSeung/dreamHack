package androidx.fragment.app;

import a2.m;
import java.util.ArrayList;
import java.util.List;
import t0.d;

public final class u0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1299d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1300e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1301f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1302g;

    public u0(i iVar, ArrayList arrayList, g1 g1Var) {
        this.f1302g = iVar;
        this.f1300e = arrayList;
        this.f1301f = g1Var;
    }

    public final void run() {
        int i3 = this.f1299d;
        Object obj = this.f1302g;
        Object obj2 = this.f1301f;
        Object obj3 = this.f1300e;
        switch (i3) {
            case 0:
                ((d0) obj3).c((r) obj2, (d) obj);
                return;
            case 1:
                ((d0) obj3).c((r) obj2, (d) obj);
                return;
            default:
                List list = (List) obj3;
                g1 g1Var = (g1) obj2;
                if (list.contains(g1Var)) {
                    list.remove(g1Var);
                    ((i) obj).getClass();
                    m.a(g1Var.f1146a, g1Var.f1148c.H);
                    return;
                }
                return;
        }
    }
}
