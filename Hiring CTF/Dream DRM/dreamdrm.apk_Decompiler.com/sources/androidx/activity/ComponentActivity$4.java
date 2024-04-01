package androidx.activity;

import androidx.fragment.app.v;
import androidx.lifecycle.l;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class ComponentActivity$4 implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f268d;

    public ComponentActivity$4(v vVar) {
        this.f268d = vVar;
    }

    public final void b(r rVar, l lVar) {
        n nVar = this.f268d;
        if (nVar.f303i == null) {
            l lVar2 = (l) nVar.getLastNonConfigurationInstance();
            if (lVar2 != null) {
                nVar.f303i = lVar2.f294a;
            }
            if (nVar.f303i == null) {
                nVar.f303i = new m0();
            }
        }
        nVar.f301g.t(this);
    }
}
