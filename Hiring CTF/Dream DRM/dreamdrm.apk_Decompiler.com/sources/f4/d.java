package f4;

import b1.o;
import java.io.Serializable;

public final class d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f2678d;

    public d(Throwable th) {
        o.m(th, "exception");
        this.f2678d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (o.c(this.f2678d, ((d) obj).f2678d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2678d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2678d + ')';
    }
}
