package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.n0;
import b1.o;

public final class h0 extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f1360e = 0;

    /* renamed from: d  reason: collision with root package name */
    public d0 f1361d;

    public final void a(l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            o.l(activity, "activity");
            n0.m(activity, lVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(l.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(l.ON_DESTROY);
        this.f1361d = null;
    }

    public final void onPause() {
        super.onPause();
        a(l.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        d0 d0Var = this.f1361d;
        if (d0Var != null) {
            d0Var.f1349a.a();
        }
        a(l.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        d0 d0Var = this.f1361d;
        if (d0Var != null) {
            e0 e0Var = d0Var.f1349a;
            int i3 = e0Var.f1352d + 1;
            e0Var.f1352d = i3;
            if (i3 == 1 && e0Var.f1355g) {
                e0Var.f1357i.x(l.ON_START);
                e0Var.f1355g = false;
            }
        }
        a(l.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(l.ON_STOP);
    }
}
