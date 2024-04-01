package e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.j;
import java.util.Objects;

public abstract class x {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, e0 e0Var) {
        Objects.requireNonNull(e0Var);
        w wVar = new w(e0Var);
        j.q(obj).registerOnBackInvokedCallback(1000000, wVar);
        return wVar;
    }

    public static void c(Object obj, Object obj2) {
        j.q(obj).unregisterOnBackInvokedCallback(j.n(obj2));
    }
}
