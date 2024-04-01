package c3;

import android.view.View;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.List;
import x0.h2;
import x0.s1;
import z2.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f1635a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1636b;

    /* renamed from: c  reason: collision with root package name */
    public int f1637c;

    /* renamed from: d  reason: collision with root package name */
    public int f1638d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1639e = new int[2];

    public e(View view) {
        this.f1636b = view;
    }

    public final void a(h2 h2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            if ((s1Var.f5613a.c() & 8) != 0) {
                int i3 = this.f1638d;
                float b6 = s1Var.f5613a.b();
                LinearInterpolator linearInterpolator = a.f5933a;
                this.f1636b.setTranslationY((float) (Math.round(b6 * ((float) (0 - i3))) + i3));
                return;
            }
        }
    }
}
