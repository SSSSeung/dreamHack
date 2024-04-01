package x0;

import a1.a;
import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f5613a;

    public s1(int i3, Interpolator interpolator, long j6) {
        r1 o1Var;
        if (Build.VERSION.SDK_INT >= 30) {
            a.n();
            o1Var = new q1(a.j(i3, interpolator, j6));
        } else {
            o1Var = new o1(i3, interpolator, j6);
        }
        this.f5613a = o1Var;
    }

    public s1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5613a = new q1(windowInsetsAnimation);
        }
    }
}
