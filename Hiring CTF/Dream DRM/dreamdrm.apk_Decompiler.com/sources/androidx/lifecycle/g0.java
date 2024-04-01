package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.n0;
import b1.o;

public final class g0 implements Application.ActivityLifecycleCallbacks {
    public static final f0 Companion = new f0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        o.m(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new g0());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        o.m(activity, "activity");
        int i3 = h0.f1360e;
        n0.m(activity, l.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
        o.m(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        o.m(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        o.m(activity, "activity");
    }
}
