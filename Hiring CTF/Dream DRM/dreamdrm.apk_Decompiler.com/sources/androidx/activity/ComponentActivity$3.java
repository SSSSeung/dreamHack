package androidx.activity;

import androidx.fragment.app.v;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class ComponentActivity$3 implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f267d;

    public ComponentActivity$3(v vVar) {
        this.f267d = vVar;
    }

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f267d.f299e.f1481b = null;
            if (!this.f267d.isChangingConfigurations()) {
                this.f267d.e().a();
            }
            m mVar = this.f267d.f305k;
            n nVar = mVar.f298g;
            nVar.getWindow().getDecorView().removeCallbacks(mVar);
            nVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mVar);
        }
    }
}
