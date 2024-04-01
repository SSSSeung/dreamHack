package x0;

import android.view.View;
import android.view.Window;

public abstract class j1 {
    public static void a(Window window, boolean z5) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }
}
