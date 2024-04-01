package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import b1.o;

public abstract class f implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
        o.m(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        o.m(activity, "activity");
    }
}
