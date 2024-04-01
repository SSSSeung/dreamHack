package x0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

public final class x extends w {

    /* renamed from: p  reason: collision with root package name */
    public final View f5639p;

    /* renamed from: q  reason: collision with root package name */
    public final WindowInsetsController f5640q;

    public x(View view) {
        super(view);
        this.f5639p = view;
    }

    public final void B() {
        View view = this.f5639p;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f5640q;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.B();
        }
    }

    public x(WindowInsetsController windowInsetsController) {
        super((View) null);
        this.f5640q = windowInsetsController;
    }
}
