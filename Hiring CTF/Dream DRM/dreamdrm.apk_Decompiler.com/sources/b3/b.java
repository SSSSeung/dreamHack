package b3;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f1.d;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public final class b implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final View f1584d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1585e;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z5) {
        this.f1585e = swipeDismissBehavior;
        this.f1584d = view;
    }

    public final void run() {
        d dVar = this.f1585e.f1825a;
        if (dVar != null && dVar.g()) {
            WeakHashMap weakHashMap = u0.f5622a;
            d0.m(this.f1584d, this);
        }
    }
}
