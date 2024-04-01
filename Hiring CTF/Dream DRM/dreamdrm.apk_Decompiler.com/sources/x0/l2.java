package x0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.e;
import e.n0;

public final class l2 extends e {

    /* renamed from: o  reason: collision with root package name */
    public final WindowInsetsController f5584o;

    /* renamed from: p  reason: collision with root package name */
    public final n0 f5585p;

    /* renamed from: q  reason: collision with root package name */
    public final Window f5586q;

    public l2(Window window, n0 n0Var) {
        this(window.getInsetsController(), n0Var);
        this.f5586q = window;
    }

    public final void C() {
        this.f5585p.G();
        this.f5584o.show(0);
    }

    public final void y(boolean z5) {
        WindowInsetsController windowInsetsController = this.f5584o;
        Window window = this.f5586q;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    public final void z(boolean z5) {
        WindowInsetsController windowInsetsController = this.f5584o;
        Window window = this.f5586q;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    public l2(WindowInsetsController windowInsetsController, n0 n0Var) {
        super(16);
        this.f5584o = windowInsetsController;
        this.f5585p = n0Var;
    }
}
