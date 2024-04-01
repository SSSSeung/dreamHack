package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public final class x0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1319b;

    public x0(View view, ArrayList arrayList) {
        this.f1318a = view;
        this.f1319b = arrayList;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1318a.setVisibility(8);
        ArrayList arrayList = this.f1319b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((View) arrayList.get(i3)).setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
