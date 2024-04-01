package x0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class e1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5558b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5559c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f5560d;

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i3) {
        this.f5557a = i3;
        this.f5560d = obj;
        this.f5559c = obj2;
        this.f5558b = obj3;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.f5557a) {
            case 0:
                ((h1) this.f5559c).b((View) this.f5558b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f5557a;
        Object obj = this.f5559c;
        switch (i3) {
            case 0:
                ((h1) obj).a();
                return;
            default:
                ((s1) obj).f5613a.d(1.0f);
                o1.e((View) this.f5558b);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f5557a) {
            case 0:
                ((h1) this.f5559c).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
