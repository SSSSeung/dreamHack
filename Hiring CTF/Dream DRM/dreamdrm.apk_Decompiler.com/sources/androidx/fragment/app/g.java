package androidx.fragment.app;

import android.content.Context;
import e.b0;
import t0.d;

public final class g extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1142f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1143g = false;

    /* renamed from: h  reason: collision with root package name */
    public y f1144h;

    public g(g1 g1Var, d dVar, boolean z5) {
        super(g1Var, dVar);
        this.f1142f = z5;
    }

    public final y i(Context context) {
        if (this.f1143g) {
            return this.f1144h;
        }
        g1 g1Var = (g1) this.f2280d;
        y h6 = h5.d.h(context, g1Var.f1148c, g1Var.f1146a == 2, this.f1142f);
        this.f1144h = h6;
        this.f1143g = true;
        return h6;
    }
}
