package p1;

import android.view.View;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public a0 f4684a;

    /* renamed from: b  reason: collision with root package name */
    public int f4685b;

    /* renamed from: c  reason: collision with root package name */
    public int f4686c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4687d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4688e;

    public v() {
        c();
    }

    public final void a(View view, int i3) {
        if (this.f4687d) {
            int b6 = this.f4684a.b(view);
            a0 a0Var = this.f4684a;
            this.f4686c = (Integer.MIN_VALUE == a0Var.f4436b ? 0 : a0Var.i() - a0Var.f4436b) + b6;
        } else {
            this.f4686c = this.f4684a.d(view);
        }
        this.f4685b = i3;
    }

    public final void b(View view, int i3) {
        int i6;
        a0 a0Var = this.f4684a;
        int i7 = Integer.MIN_VALUE == a0Var.f4436b ? 0 : a0Var.i() - a0Var.f4436b;
        if (i7 >= 0) {
            a(view, i3);
            return;
        }
        this.f4685b = i3;
        if (this.f4687d) {
            int f6 = (this.f4684a.f() - i7) - this.f4684a.b(view);
            this.f4686c = this.f4684a.f() - f6;
            if (f6 > 0) {
                int c6 = this.f4686c - this.f4684a.c(view);
                int h6 = this.f4684a.h();
                int min = c6 - (Math.min(this.f4684a.d(view) - h6, 0) + h6);
                if (min < 0) {
                    i6 = Math.min(f6, -min) + this.f4686c;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int d6 = this.f4684a.d(view);
            int h7 = d6 - this.f4684a.h();
            this.f4686c = d6;
            if (h7 > 0) {
                int f7 = (this.f4684a.f() - Math.min(0, (this.f4684a.f() - i7) - this.f4684a.b(view))) - (this.f4684a.c(view) + d6);
                if (f7 < 0) {
                    i6 = this.f4686c - Math.min(h7, -f7);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f4686c = i6;
    }

    public final void c() {
        this.f4685b = -1;
        this.f4686c = Integer.MIN_VALUE;
        this.f4687d = false;
        this.f4688e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f4685b + ", mCoordinate=" + this.f4686c + ", mLayoutFromEnd=" + this.f4687d + ", mValid=" + this.f4688e + '}';
    }
}
