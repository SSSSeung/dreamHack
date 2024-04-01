package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import b1.o;

public final class c0 extends f {
    final /* synthetic */ e0 this$0;

    public c0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = h0.f1360e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            o.j(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((h0) findFragmentByTag).f1361d = this.this$0.f1359k;
        }
    }

    public void onActivityPaused(Activity activity) {
        o.m(activity, "activity");
        e0 e0Var = this.this$0;
        int i3 = e0Var.f1353e - 1;
        e0Var.f1353e = i3;
        if (i3 == 0) {
            Handler handler = e0Var.f1356h;
            o.k(handler);
            handler.postDelayed(e0Var.f1358j, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        o.m(activity, "activity");
        a0.a(activity, new b0(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        o.m(activity, "activity");
        e0 e0Var = this.this$0;
        int i3 = e0Var.f1352d - 1;
        e0Var.f1352d = i3;
        if (i3 == 0 && e0Var.f1354f) {
            e0Var.f1357i.x(l.ON_STOP);
            e0Var.f1355g = true;
        }
    }
}
