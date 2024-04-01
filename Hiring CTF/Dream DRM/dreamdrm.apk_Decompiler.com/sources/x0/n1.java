package x0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.a0;
import c3.e;
import java.util.Objects;
import java.util.WeakHashMap;
import q0.c;

public final class n1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f5591a;

    /* renamed from: b  reason: collision with root package name */
    public h2 f5592b;

    public n1(View view, e eVar) {
        h2 h2Var;
        this.f5591a = eVar;
        WeakHashMap weakHashMap = u0.f5622a;
        h2 a6 = k0.a(view);
        if (a6 != null) {
            int i3 = Build.VERSION.SDK_INT;
            h2Var = (i3 >= 30 ? new x1(a6) : i3 >= 29 ? new w1(a6) : new u1(a6)).b();
        } else {
            h2Var = null;
        }
        this.f5592b = h2Var;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.f5592b = h2.h(view, windowInsets);
        } else {
            h2 h6 = h2.h(view, windowInsets);
            if (this.f5592b == null) {
                WeakHashMap weakHashMap = u0.f5622a;
                this.f5592b = k0.a(view);
            }
            if (this.f5592b == null) {
                this.f5592b = h6;
            } else {
                e j6 = o1.j(view);
                if (j6 != null && Objects.equals(j6.f1635a, windowInsets2)) {
                    return o1.i(view, windowInsets);
                }
                h2 h2Var = this.f5592b;
                int i3 = 0;
                for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                    if (!h6.a(i6).equals(h2Var.a(i6))) {
                        i3 |= i6;
                    }
                }
                if (i3 == 0) {
                    return o1.i(view, windowInsets);
                }
                h2 h2Var2 = this.f5592b;
                s1 s1Var = new s1(i3, (i3 & 8) != 0 ? h6.a(8).f4872d > h2Var2.a(8).f4872d ? o1.f5598e : o1.f5599f : o1.f5600g, 160);
                r1 r1Var = s1Var.f5613a;
                r1Var.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r1Var.a());
                c a6 = h6.a(i3);
                c a7 = h2Var2.a(i3);
                int min = Math.min(a6.f4869a, a7.f4869a);
                int i7 = a6.f4870b;
                int i8 = a7.f4870b;
                int min2 = Math.min(i7, i8);
                int i9 = a6.f4871c;
                int i10 = a7.f4871c;
                int min3 = Math.min(i9, i10);
                ValueAnimator valueAnimator = duration;
                int i11 = a6.f4872d;
                int i12 = i3;
                int i13 = a7.f4872d;
                a0 a0Var = new a0((Object) c.b(min, min2, min3, Math.min(i11, i13)), 7, (Object) c.b(Math.max(a6.f4869a, a7.f4869a), Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i13)));
                o1.f(view2, windowInsets2, false);
                ValueAnimator valueAnimator2 = valueAnimator;
                valueAnimator2.addUpdateListener(new l1(s1Var, h6, h2Var2, i12, view));
                valueAnimator2.addListener(new e1(this, s1Var, view2, 1));
                v.a(view2, new m1(view2, s1Var, a0Var, valueAnimator2));
                this.f5592b = h6;
                return o1.i(view, windowInsets);
            }
        }
        return o1.i(view, windowInsets);
    }
}
