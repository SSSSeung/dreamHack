package f1;

import android.view.animation.Interpolator;

public final class c implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2615a;

    public /* synthetic */ c(int i3) {
        this.f2615a = i3;
    }

    public final float getInterpolation(float f6) {
        switch (this.f2615a) {
        }
        float f7 = f6 - 1.0f;
        return (f7 * f7 * f7 * f7 * f7) + 1.0f;
    }
}
