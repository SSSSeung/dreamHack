package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import k.b;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5133b;

    public /* synthetic */ m(Object obj, b bVar) {
        this.f5133b = obj;
        this.f5132a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ((b) this.f5132a).remove(animator);
        ((p) this.f5133b).f5154p.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        ((p) this.f5133b).f5154p.add(animator);
    }
}
