package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import b1.o;

public abstract class a0 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        o.m(activity, "activity");
        o.m(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
