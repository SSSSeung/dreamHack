package androidx.fragment.app;

import a2.m;

public final class f1 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1139d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g1 f1140e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h1 f1141f;

    public /* synthetic */ f1(h1 h1Var, g1 g1Var, int i3) {
        this.f1139d = i3;
        this.f1141f = h1Var;
        this.f1140e = g1Var;
    }

    public final void run() {
        int i3 = this.f1139d;
        g1 g1Var = this.f1140e;
        h1 h1Var = this.f1141f;
        switch (i3) {
            case 0:
                if (h1Var.f1158b.contains(g1Var)) {
                    m.a(g1Var.f1146a, g1Var.f1148c.H);
                    return;
                }
                return;
            default:
                h1Var.f1158b.remove(g1Var);
                h1Var.f1159c.remove(g1Var);
                return;
        }
    }
}
