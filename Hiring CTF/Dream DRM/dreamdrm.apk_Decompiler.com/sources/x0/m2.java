package x0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.e;
import e.n0;

public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public final e f5590a;

    public m2(Window window, View view) {
        n0 n0Var = new n0(view, 13);
        this.f5590a = Build.VERSION.SDK_INT >= 30 ? new l2(window, n0Var) : new k2(window, n0Var);
    }

    public m2(WindowInsetsController windowInsetsController) {
        this.f5590a = new l2(windowInsetsController, new n0(windowInsetsController));
    }
}
