package x0;

import android.view.View;
import android.view.Window;
import e.n0;

public final class k2 extends j2 {
    public k2(Window window, n0 n0Var) {
        super(window, n0Var);
    }

    public final void y(boolean z5) {
        if (z5) {
            Window window = this.f5576o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        D(16);
    }
}
