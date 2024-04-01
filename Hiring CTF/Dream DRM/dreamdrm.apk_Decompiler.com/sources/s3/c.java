package s3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4959b;

    public /* synthetic */ c(d dVar, int i3) {
        this.f4958a = i3;
        this.f4959b = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f4958a) {
            case 1:
                this.f4959b.f5012b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f4958a) {
            case 0:
                this.f4959b.f5012b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
