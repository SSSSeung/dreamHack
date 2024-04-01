package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import java.util.WeakHashMap;
import t1.x;
import x0.d0;
import x0.u0;

public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4581a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4582b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4583c;

    public n(View view) {
        this.f4581a = 1;
        this.f4582b = false;
        this.f4583c = view;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.f4581a) {
            case 0:
                this.f4582b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f4581a;
        Object obj = this.f4583c;
        switch (i3) {
            case 0:
                if (this.f4582b) {
                    this.f4582b = false;
                    return;
                }
                p pVar = (p) obj;
                if (((Float) pVar.f4639z.getAnimatedValue()).floatValue() == 0.0f) {
                    pVar.A = 0;
                    pVar.f(0);
                    return;
                }
                pVar.A = 2;
                pVar.f4633s.invalidate();
                return;
            default:
                View view = (View) obj;
                x.f5173a.y(view, 1.0f);
                if (this.f4582b) {
                    view.setLayerType(0, (Paint) null);
                    return;
                }
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f4581a) {
            case 1:
                View view = (View) this.f4583c;
                WeakHashMap weakHashMap = u0.f5622a;
                if (d0.h(view) && view.getLayerType() == 0) {
                    this.f4582b = true;
                    view.setLayerType(2, (Paint) null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public n(p pVar) {
        this.f4581a = 0;
        this.f4583c = pVar;
        this.f4582b = false;
    }
}
