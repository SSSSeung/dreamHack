package d0;

import b1.o;

public final class c implements b {

    /* renamed from: d  reason: collision with root package name */
    public final float f2142d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2143e;

    public c(float f6, float f7) {
        this.f2142d = f6;
        this.f2143e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return o.c(Float.valueOf(this.f2142d), Float.valueOf(cVar.f2142d)) && o.c(Float.valueOf(this.f2143e), Float.valueOf(cVar.f2143e));
    }

    public final int hashCode() {
        return Float.hashCode(this.f2143e) + (Float.hashCode(this.f2142d) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f2142d + ", fontScale=" + this.f2143e + ')';
    }
}
