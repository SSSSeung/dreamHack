package p1;

import android.animation.ValueAnimator;

public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f4594a;

    public o(p pVar) {
        this.f4594a = pVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p pVar = this.f4594a;
        pVar.f4617c.setAlpha(floatValue);
        pVar.f4618d.setAlpha(floatValue);
        pVar.f4633s.invalidate();
    }
}
