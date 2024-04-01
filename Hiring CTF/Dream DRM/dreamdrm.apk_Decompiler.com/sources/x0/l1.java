package x0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import q0.c;

public final class l1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s1 f5579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h2 f5580b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h2 f5581c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5582d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f5583e;

    public l1(s1 s1Var, h2 h2Var, h2 h2Var2, int i3, View view) {
        this.f5579a = s1Var;
        this.f5580b = h2Var;
        this.f5581c = h2Var2;
        this.f5582d = i3;
        this.f5583e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c cVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        s1 s1Var = this.f5579a;
        s1Var.f5613a.d(animatedFraction);
        float b6 = s1Var.f5613a.b();
        PathInterpolator pathInterpolator = o1.f5598e;
        int i3 = Build.VERSION.SDK_INT;
        h2 h2Var = this.f5580b;
        y1 x1Var = i3 >= 30 ? new x1(h2Var) : i3 >= 29 ? new w1(h2Var) : new u1(h2Var);
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((this.f5582d & i6) == 0) {
                cVar = h2Var.a(i6);
            } else {
                c a6 = h2Var.a(i6);
                c a7 = this.f5581c.a(i6);
                float f6 = 1.0f - b6;
                cVar = h2.f(a6, (int) (((double) (((float) (a6.f4869a - a7.f4869a)) * f6)) + 0.5d), (int) (((double) (((float) (a6.f4870b - a7.f4870b)) * f6)) + 0.5d), (int) (((double) (((float) (a6.f4871c - a7.f4871c)) * f6)) + 0.5d), (int) (((double) (((float) (a6.f4872d - a7.f4872d)) * f6)) + 0.5d));
            }
            x1Var.c(i6, cVar);
        }
        o1.g(this.f5583e, x1Var.b(), Collections.singletonList(s1Var));
    }
}
