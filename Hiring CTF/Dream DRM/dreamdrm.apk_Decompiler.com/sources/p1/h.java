package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f4514b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4515c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f4516d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f4517e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f4513a = i3;
        this.f4517e = kVar;
        this.f4514b = iVar;
        this.f4515c = viewPropertyAnimator;
        this.f4516d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f4513a;
        k kVar = this.f4517e;
        i iVar = this.f4514b;
        View view = this.f4516d;
        ViewPropertyAnimator viewPropertyAnimator = this.f4515c;
        switch (i3) {
            case 0:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f4520a);
                kVar.f4552r.remove(iVar.f4520a);
                kVar.i();
                return;
            default:
                viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                kVar.c(iVar.f4521b);
                kVar.f4552r.remove(iVar.f4521b);
                kVar.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        int i3 = this.f4513a;
        k kVar = this.f4517e;
        i iVar = this.f4514b;
        switch (i3) {
            case 0:
                f1 f1Var = iVar.f4520a;
                kVar.getClass();
                return;
            default:
                f1 f1Var2 = iVar.f4521b;
                kVar.getClass();
                return;
        }
    }
}
