package z4;

import b1.o;
import com.bumptech.glide.e;
import g4.l;
import java.util.ArrayList;
import java.util.Set;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f6002c = new g(l.e0(new ArrayList()), (e) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f6003a;

    /* renamed from: b  reason: collision with root package name */
    public final e f6004b;

    public g(Set set, e eVar) {
        o.m(set, "pins");
        this.f6003a = set;
        this.f6004b = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return o.c(gVar.f6003a, this.f6003a) && o.c(gVar.f6004b, this.f6004b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f6003a.hashCode() + 1517) * 41;
        e eVar = this.f6004b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
