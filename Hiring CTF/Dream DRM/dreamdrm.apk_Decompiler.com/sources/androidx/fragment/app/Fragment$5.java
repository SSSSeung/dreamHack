package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class Fragment$5 implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f1062d;

    public Fragment$5(r rVar) {
        this.f1062d = rVar;
    }

    public final void b(r rVar, l lVar) {
        View view;
        if (lVar == l.ON_STOP && (view = this.f1062d.H) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
