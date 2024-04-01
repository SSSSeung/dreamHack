package x0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import q0.c;
import w0.b;

public final class h2 {

    /* renamed from: b  reason: collision with root package name */
    public static final h2 f5571b = (Build.VERSION.SDK_INT >= 30 ? d2.f5556q : e2.f5561b);

    /* renamed from: a  reason: collision with root package name */
    public final e2 f5572a;

    public h2() {
        this.f5572a = new e2(this);
    }

    public static c f(c cVar, int i3, int i6, int i7, int i8) {
        int max = Math.max(0, cVar.f4869a - i3);
        int max2 = Math.max(0, cVar.f4870b - i6);
        int max3 = Math.max(0, cVar.f4871c - i7);
        int max4 = Math.max(0, cVar.f4872d - i8);
        return (max == i3 && max2 == i6 && max3 == i7 && max4 == i8) ? cVar : c.b(max, max2, max3, max4);
    }

    public static h2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        h2 h2Var = new h2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = u0.f5622a;
            if (g0.b(view)) {
                h2 a6 = k0.a(view);
                e2 e2Var = h2Var.f5572a;
                e2Var.p(a6);
                e2Var.d(view.getRootView());
            }
        }
        return h2Var;
    }

    public final c a(int i3) {
        return this.f5572a.f(i3);
    }

    public final int b() {
        return this.f5572a.j().f4872d;
    }

    public final int c() {
        return this.f5572a.j().f4869a;
    }

    public final int d() {
        return this.f5572a.j().f4871c;
    }

    public final int e() {
        return this.f5572a.j().f4870b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        return b.a(this.f5572a, ((h2) obj).f5572a);
    }

    public final WindowInsets g() {
        e2 e2Var = this.f5572a;
        if (e2Var instanceof z1) {
            return ((z1) e2Var).f5658c;
        }
        return null;
    }

    public final int hashCode() {
        e2 e2Var = this.f5572a;
        if (e2Var == null) {
            return 0;
        }
        return e2Var.hashCode();
    }

    public h2(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        this.f5572a = i3 >= 30 ? new d2(this, windowInsets) : i3 >= 29 ? new c2(this, windowInsets) : i3 >= 28 ? new b2(this, windowInsets) : new a2(this, windowInsets);
    }
}
