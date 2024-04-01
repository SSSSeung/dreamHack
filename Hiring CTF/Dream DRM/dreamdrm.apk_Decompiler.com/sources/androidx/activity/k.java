package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

public abstract class k {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
