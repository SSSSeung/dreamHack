package p4;

import a2.m;
import androidx.activity.y;
import b1.o;
import t4.a;
import t4.c;

public abstract class e extends a implements d, c {

    /* renamed from: j  reason: collision with root package name */
    public final int f4860j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final int f4861k = 0;

    public e(y yVar) {
        super(yVar, y.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
    }

    public final a c() {
        j.f4866a.getClass();
        return this;
    }

    public final int d() {
        return this.f4860j;
    }

    /* renamed from: e */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f4855g.equals(eVar.f4855g) && this.f4856h.equals(eVar.f4856h) && this.f4861k == eVar.f4861k && this.f4860j == eVar.f4860j && o.c(this.f4853e, eVar.f4853e) && o.c(b(), eVar.b());
        } else if (!(obj instanceof c)) {
            return false;
        } else {
            a aVar = this.f4852d;
            if (aVar == null) {
                c();
                this.f4852d = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    /* renamed from: f */
    public final int hashCode() {
        return this.f4856h.hashCode() + ((this.f4855g.hashCode() + (b() == null ? 0 : b().hashCode() * 31)) * 31);
    }

    /* renamed from: g */
    public final String toString() {
        a aVar = this.f4852d;
        if (aVar == null) {
            c();
            this.f4852d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f4855g;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : m.i("function ", str, " (Kotlin reflection is not available)");
    }
}
