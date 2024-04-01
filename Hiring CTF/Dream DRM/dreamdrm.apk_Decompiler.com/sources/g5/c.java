package g5;

import androidx.fragment.app.n0;
import b1.o;
import l5.j;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final j f2938d = n0.n(":");

    /* renamed from: e  reason: collision with root package name */
    public static final j f2939e = n0.n(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final j f2940f = n0.n(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final j f2941g = n0.n(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final j f2942h = n0.n(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final j f2943i = n0.n(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final int f2944a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2945b;

    /* renamed from: c  reason: collision with root package name */
    public final j f2946c;

    static {
        j jVar = j.f4129g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(n0.n(str), n0.n(str2));
        o.m(str, "name");
        o.m(str2, "value");
        j jVar = j.f4129g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return o.c(this.f2945b, cVar.f2945b) && o.c(this.f2946c, cVar.f2946c);
    }

    public final int hashCode() {
        int i3 = 0;
        j jVar = this.f2945b;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        j jVar2 = this.f2946c;
        if (jVar2 != null) {
            i3 = jVar2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return this.f2945b.i() + ": " + this.f2946c.i();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(j jVar, String str) {
        this(jVar, n0.n(str));
        o.m(jVar, "name");
        o.m(str, "value");
        j jVar2 = j.f4129g;
    }

    public c(j jVar, j jVar2) {
        o.m(jVar, "name");
        o.m(jVar2, "value");
        this.f2945b = jVar;
        this.f2946c = jVar2;
        this.f2944a = jVar2.b() + jVar.b() + 32;
    }
}
