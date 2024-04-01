package androidx.lifecycle;

import android.app.Activity;
import b1.o;

public final class b0 extends f {
    final /* synthetic */ e0 this$0;

    public b0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    public void onActivityPostResumed(Activity activity) {
        o.m(activity, "activity");
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity activity) {
        o.m(activity, "activity");
        e0 e0Var = this.this$0;
        int i3 = e0Var.f1352d + 1;
        e0Var.f1352d = i3;
        if (i3 == 1 && e0Var.f1355g) {
            e0Var.f1357i.x(l.ON_START);
            e0Var.f1355g = false;
        }
    }
}
