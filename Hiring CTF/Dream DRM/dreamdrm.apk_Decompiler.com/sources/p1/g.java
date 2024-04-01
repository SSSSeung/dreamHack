package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f1 f4502a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4503b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f4504c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4505d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4506e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f4507f;

    public g(k kVar, f1 f1Var, int i3, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4507f = kVar;
        this.f4502a = f1Var;
        this.f4503b = i3;
        this.f4504c = view;
        this.f4505d = i6;
        this.f4506e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f4503b;
        View view = this.f4504c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4505d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4506e.setListener((Animator.AnimatorListener) null);
        k kVar = this.f4507f;
        f1 f1Var = this.f4502a;
        kVar.c(f1Var);
        kVar.f4550p.remove(f1Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f4507f.getClass();
    }
}
