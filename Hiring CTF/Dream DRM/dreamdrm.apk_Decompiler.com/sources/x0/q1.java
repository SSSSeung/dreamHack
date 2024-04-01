package x0;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class q1 extends r1 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f5605e;

    public q1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.f5605e = windowInsetsAnimation;
    }

    public final long a() {
        return this.f5605e.getDurationMillis();
    }

    public final float b() {
        return this.f5605e.getInterpolatedFraction();
    }

    public final int c() {
        return this.f5605e.getTypeMask();
    }

    public final void d(float f6) {
        this.f5605e.setFraction(f6);
    }
}
