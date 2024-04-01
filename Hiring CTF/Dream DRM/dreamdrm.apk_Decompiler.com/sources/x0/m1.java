package x0;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.a0;

public final class m1 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f5587d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a0 f5588e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f5589f;

    public m1(View view, s1 s1Var, a0 a0Var, ValueAnimator valueAnimator) {
        this.f5587d = view;
        this.f5588e = a0Var;
        this.f5589f = valueAnimator;
    }

    public final void run() {
        o1.h(this.f5587d, this.f5588e);
        this.f5589f.start();
    }
}
