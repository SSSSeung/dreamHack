package p4;

import a2.m;
import b1.o;
import kotlinx.coroutines.internal.g;
import o4.a;
import t4.d;
import w4.p;

public abstract class h extends a implements d, a {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4864j = false;

    public h(Object obj) {
        super(obj, p.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    public final Object a() {
        return ((g) this).f4853e.getClass().getSimpleName();
    }

    public final t4.a c() {
        if (!this.f4864j) {
            t4.a aVar = this.f4852d;
            if (aVar != null) {
                return aVar;
            }
            e();
            this.f4852d = this;
        }
        return this;
    }

    public final t4.a e() {
        j.f4866a.getClass();
        return this;
    }

    /* renamed from: f */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return b().equals(hVar.b()) && this.f4855g.equals(hVar.f4855g) && this.f4856h.equals(hVar.f4856h) && o.c(this.f4853e, hVar.f4853e);
        } else if (obj instanceof d) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public final int hashCode() {
        int hashCode = this.f4855g.hashCode();
        return this.f4856h.hashCode() + ((hashCode + (b().hashCode() * 31)) * 31);
    }

    /* renamed from: j */
    public final String toString() {
        t4.a c6 = c();
        return c6 != this ? c6.toString() : m.j(new StringBuilder("property "), this.f4855g, " (Kotlin reflection is not available)");
    }
}
