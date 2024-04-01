package androidx.activity;

import androidx.fragment.app.e0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b1.o;

final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements p, c {

    /* renamed from: d  reason: collision with root package name */
    public final w4.p f271d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f272e;

    /* renamed from: f  reason: collision with root package name */
    public w f273f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f274g;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(y yVar, w4.p pVar, e0 e0Var) {
        o.m(e0Var, "onBackPressedCallback");
        this.f274g = yVar;
        this.f271d = pVar;
        this.f272e = e0Var;
        pVar.a(this);
    }

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_START) {
            y yVar = this.f274g;
            yVar.getClass();
            e0 e0Var = this.f272e;
            o.m(e0Var, "onBackPressedCallback");
            yVar.f344b.c(e0Var);
            w wVar = new w(yVar, e0Var);
            e0Var.f1129b.add(wVar);
            yVar.d();
            e0Var.f1130c = new x(1, yVar);
            this.f273f = wVar;
        } else if (lVar == l.ON_STOP) {
            w wVar2 = this.f273f;
            if (wVar2 != null) {
                wVar2.cancel();
            }
        } else if (lVar == l.ON_DESTROY) {
            cancel();
        }
    }

    public final void cancel() {
        this.f271d.t(this);
        e0 e0Var = this.f272e;
        e0Var.getClass();
        e0Var.f1129b.remove(this);
        w wVar = this.f273f;
        if (wVar != null) {
            wVar.cancel();
        }
        this.f273f = null;
    }
}
