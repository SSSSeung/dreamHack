package z2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import k1.b;
import k1.c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f5933a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final b f5934b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k1.a f5935c = new k1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f5936d = new c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f7, float f8, float f9, float f10) {
        if (f10 <= f8) {
            return f6;
        }
        if (f10 >= f9) {
            return f7;
        }
        return ((f7 - f6) * ((f10 - f8) / (f9 - f8))) + f6;
    }
}
