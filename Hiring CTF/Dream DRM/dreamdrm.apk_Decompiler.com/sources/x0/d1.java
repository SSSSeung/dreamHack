package x0;

import android.animation.ValueAnimator;
import android.view.View;
import e.n0;
import e.s0;

public final /* synthetic */ class d1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n0 f5555a;

    public /* synthetic */ d1(n0 n0Var, View view) {
        this.f5555a = n0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) ((s0) this.f5555a.f2403e).f2433j.getParent()).invalidate();
    }
}
