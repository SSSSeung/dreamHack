package x0;

import android.view.View;
import android.view.WindowInsetsController;

public abstract class p0 {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static m2 c(View view) {
        WindowInsetsController l6 = view.getWindowInsetsController();
        if (l6 != null) {
            return new m2(l6);
        }
        return null;
    }

    public static boolean d(View view) {
        return view.isImportantForContentCapture();
    }

    public static void e(View view, int i3) {
        view.setImportantForContentCapture(i3);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
