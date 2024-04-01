package z2;

import android.animation.TimeInterpolator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f5939a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f5940b = 300;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f5941c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f5942d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5943e = 1;

    public c(long j6, long j7, TimeInterpolator timeInterpolator) {
        this.f5939a = j6;
        this.f5940b = j7;
        this.f5941c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f5941c;
        return timeInterpolator != null ? timeInterpolator : a.f5934b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5939a == cVar.f5939a && this.f5940b == cVar.f5940b && this.f5942d == cVar.f5942d && this.f5943e == cVar.f5943e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f5939a;
        long j7 = this.f5940b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f5942d) * 31) + this.f5943e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f5939a + " duration: " + this.f5940b + " interpolator: " + a().getClass() + " repeatCount: " + this.f5942d + " repeatMode: " + this.f5943e + "}\n";
    }
}
