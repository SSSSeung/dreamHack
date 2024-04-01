package s3;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4953b;

    public /* synthetic */ a(o oVar, int i3) {
        this.f4952a = i3;
        this.f4953b = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f4952a;
        o oVar = this.f4953b;
        switch (i3) {
            case 0:
                d dVar = (d) oVar;
                dVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = dVar.f5014d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
            case 1:
                d dVar2 = (d) oVar;
                dVar2.getClass();
                dVar2.f5014d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                k kVar = (k) oVar;
                kVar.getClass();
                kVar.f5014d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
