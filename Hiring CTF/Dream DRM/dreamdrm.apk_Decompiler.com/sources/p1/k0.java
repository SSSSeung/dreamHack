package p1;

import android.view.View;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public int f4553a;

    /* renamed from: b  reason: collision with root package name */
    public int f4554b;

    /* renamed from: c  reason: collision with root package name */
    public int f4555c;

    /* renamed from: d  reason: collision with root package name */
    public int f4556d;

    public k0() {
    }

    public k0(int i3, int i6, int i7, int i8) {
        this.f4553a = i3;
        this.f4554b = i6;
        this.f4555c = i7;
        this.f4556d = i8;
    }

    public final void a(f1 f1Var) {
        View view = f1Var.f4483a;
        this.f4553a = view.getLeft();
        this.f4554b = view.getTop();
        this.f4555c = view.getRight();
        this.f4556d = view.getBottom();
    }
}
