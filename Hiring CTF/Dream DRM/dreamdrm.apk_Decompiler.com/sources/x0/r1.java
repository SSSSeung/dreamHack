package x0;

import android.view.animation.Interpolator;

public abstract class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5609a;

    /* renamed from: b  reason: collision with root package name */
    public float f5610b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f5611c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5612d;

    public r1(int i3, Interpolator interpolator, long j6) {
        this.f5609a = i3;
        this.f5611c = interpolator;
        this.f5612d = j6;
    }

    public long a() {
        return this.f5612d;
    }

    public float b() {
        Interpolator interpolator = this.f5611c;
        return interpolator != null ? interpolator.getInterpolation(this.f5610b) : this.f5610b;
    }

    public int c() {
        return this.f5609a;
    }

    public void d(float f6) {
        this.f5610b = f6;
    }
}
