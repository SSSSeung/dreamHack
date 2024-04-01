package k1;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f3905a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3906b;

    public d(float[] fArr) {
        this.f3905a = fArr;
        this.f3906b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3905a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f6), fArr.length - 2);
        float f7 = this.f3906b;
        float f8 = fArr[min];
        return ((fArr[min + 1] - f8) * ((f6 - (((float) min) * f7)) / f7)) + f8;
    }
}
