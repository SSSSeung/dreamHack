package c3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p3.f;
import p3.g;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1623b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1622a = i3;
        this.f1623b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f1622a;
        Object obj = this.f1623b;
        switch (i3) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f1845i;
                if (gVar != null) {
                    f fVar = gVar.f4767d;
                    if (fVar.f4754j != floatValue) {
                        fVar.f4754j = floatValue;
                        gVar.f4771h = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).f2064x0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
