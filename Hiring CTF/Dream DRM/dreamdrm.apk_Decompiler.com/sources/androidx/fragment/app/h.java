package androidx.fragment.app;

import android.transition.Transition;
import e.b0;
import t0.d;

public final class h extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public final Object f1154f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1155g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f1156h;

    public h(g1 g1Var, d dVar, boolean z5, boolean z6) {
        super(g1Var, dVar);
        Object obj;
        Object obj2;
        int i3 = g1Var.f1146a;
        r rVar = g1Var.f1148c;
        if (i3 == 2) {
            if (z5) {
                obj2 = rVar.l();
            } else {
                rVar.getClass();
                obj2 = null;
            }
            this.f1154f = obj2;
            rVar.getClass();
        } else {
            if (z5) {
                obj = rVar.m();
            } else {
                rVar.getClass();
                obj = null;
            }
            this.f1154f = obj;
        }
        this.f1155g = true;
        if (z6) {
            if (z5) {
                this.f1156h = rVar.n();
                return;
            }
            rVar.getClass();
        }
        this.f1156h = null;
    }

    public final c1 i(Object obj) {
        if (obj == null) {
            return null;
        }
        a1 a1Var = v0.f1307a;
        if (obj instanceof Transition) {
            return a1Var;
        }
        c1 c1Var = v0.f1308b;
        if (c1Var != null && c1Var.e(obj)) {
            return c1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((g1) this.f2280d).f1148c + " is not a valid framework Transition or AndroidX Transition");
    }
}
