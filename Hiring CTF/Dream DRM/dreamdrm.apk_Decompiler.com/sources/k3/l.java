package k3;

import android.view.View;
import java.util.WeakHashMap;
import x0.h0;
import x0.u0;

public final class l implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = u0.f5622a;
        h0.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
