package x0;

import android.view.View;
import android.view.WindowInsets;

public abstract class k0 {
    public static h2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        h2 h6 = h2.h((View) null, rootWindowInsets);
        e2 e2Var = h6.f5572a;
        e2Var.p(h6);
        e2Var.d(view.getRootView());
        return h6;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i6) {
        view.setScrollIndicators(i3, i6);
    }
}
