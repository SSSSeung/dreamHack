package x0;

import android.view.View;
import android.view.Window;
import e.n0;

public abstract class j2 extends i2 {
    public j2(Window window, n0 n0Var) {
        super(window, n0Var);
    }

    public final void z(boolean z5) {
        if (z5) {
            Window window = this.f5576o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        D(8192);
    }
}
