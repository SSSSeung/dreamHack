package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.r;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4477b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f4478c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4479d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4480e;

    public /* synthetic */ f(k kVar, Object obj, View view, ViewPropertyAnimator viewPropertyAnimator, int i3) {
        this.f4476a = i3;
        this.f4480e = kVar;
        this.f4477b = obj;
        this.f4478c = view;
        this.f4479d = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.f4476a) {
            case 1:
                this.f4478c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f4476a;
        Object obj = this.f4480e;
        View view = this.f4478c;
        Object obj2 = this.f4477b;
        Object obj3 = this.f4479d;
        switch (i3) {
            case 0:
                ((ViewPropertyAnimator) obj3).setListener((Animator.AnimatorListener) null);
                view.setAlpha(1.0f);
                k kVar = (k) obj;
                f1 f1Var = (f1) obj2;
                kVar.c(f1Var);
                kVar.f4551q.remove(f1Var);
                kVar.i();
                return;
            case 1:
                ((ViewPropertyAnimator) obj3).setListener((Animator.AnimatorListener) null);
                k kVar2 = (k) obj;
                f1 f1Var2 = (f1) obj2;
                kVar2.c(f1Var2);
                kVar2.f4549o.remove(f1Var2);
                kVar2.i();
                return;
            default:
                ((ViewGroup) obj2).endViewTransition(view);
                animator.removeListener(this);
                r rVar = (r) obj3;
                View view2 = rVar.H;
                if (view2 != null && rVar.B) {
                    view2.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        int i3 = this.f4476a;
        Object obj = this.f4480e;
        switch (i3) {
            case 0:
                ((k) obj).getClass();
                return;
            case 1:
                ((k) obj).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(k kVar, f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4476a = 0;
        this.f4480e = kVar;
        this.f4477b = f1Var;
        this.f4479d = viewPropertyAnimator;
        this.f4478c = view;
    }
}
