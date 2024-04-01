package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.v;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class ComponentActivity$2 implements p {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f266d;

    public ComponentActivity$2(v vVar) {
        this.f266d = vVar;
    }

    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_STOP) {
            Window window = this.f266d.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
