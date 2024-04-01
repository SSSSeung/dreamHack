package w4;

import b1.o;
import o4.c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5488a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5489b;

    public j(Object obj, c cVar) {
        this.f5488a = obj;
        this.f5489b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return o.c(this.f5488a, jVar.f5488a) && o.c(this.f5489b, jVar.f5489b);
    }

    public final int hashCode() {
        Object obj = this.f5488a;
        return this.f5489b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f5488a + ", onCancellation=" + this.f5489b + ')';
    }
}
