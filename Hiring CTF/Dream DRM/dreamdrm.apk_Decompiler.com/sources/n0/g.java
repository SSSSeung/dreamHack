package n0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.n0;
import androidx.lifecycle.h0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import w4.p;
import x0.l;

public abstract class g extends Activity implements r, l {

    /* renamed from: d  reason: collision with root package name */
    public final t f4227d = new t(this);

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !p.l(decorView, keyEvent)) {
            return p.m(this, decorView, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !p.l(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = h0.f1360e;
        n0.r(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        t tVar = this.f4227d;
        tVar.getClass();
        tVar.w("markState");
        tVar.z();
        super.onSaveInstanceState(bundle);
    }
}
