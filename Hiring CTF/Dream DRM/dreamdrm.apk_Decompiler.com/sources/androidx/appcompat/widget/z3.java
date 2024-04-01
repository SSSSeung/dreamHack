package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.j;
import androidx.activity.s;
import java.util.Objects;

public abstract class z3 {
    public static OnBackInvokedDispatcher a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new s(1, runnable);
    }

    public static void c(Object obj, Object obj2) {
        j.q(obj).registerOnBackInvokedCallback(1000000, j.n(obj2));
    }

    public static void d(Object obj, Object obj2) {
        j.q(obj).unregisterOnBackInvokedCallback(j.n(obj2));
    }
}
