package f4;

import b1.o;
import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Object f2676d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2677e;

    public c(Object obj, Object obj2) {
        this.f2676d = obj;
        this.f2677e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return o.c(this.f2676d, cVar.f2676d) && o.c(this.f2677e, cVar.f2677e);
    }

    public final int hashCode() {
        int i3 = 0;
        Object obj = this.f2676d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2677e;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "(" + this.f2676d + ", " + this.f2677e + ')';
    }
}
