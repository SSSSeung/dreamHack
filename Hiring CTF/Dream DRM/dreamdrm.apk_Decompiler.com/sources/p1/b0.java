package p1;

import android.graphics.Rect;
import android.view.View;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f4435a;

    /* renamed from: b  reason: collision with root package name */
    public int f4436b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4437c = new Rect();

    public b0(o0 o0Var) {
        this.f4435a = o0Var;
    }

    public static a0 a(o0 o0Var, int i3) {
        if (i3 == 0) {
            return new a0(o0Var, 0);
        }
        if (i3 == 1) {
            return new a0(o0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j(View view);

    public abstract int k(View view);

    public abstract void l(int i3);
}
