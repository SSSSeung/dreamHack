package p1;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class l implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4558d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4559e;

    public /* synthetic */ l(int i3, Object obj) {
        this.f4558d = i3;
        this.f4559e = obj;
    }

    public final void run() {
        int i3 = this.f4558d;
        Object obj = this.f4559e;
        switch (i3) {
            case 0:
                p pVar = (p) obj;
                int i6 = pVar.A;
                ValueAnimator valueAnimator = pVar.f4639z;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                pVar.A = 3;
                valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).A0();
                return;
        }
    }
}
