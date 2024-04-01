package l;

import androidx.appcompat.widget.a0;
import androidx.fragment.app.l;
import b1.o;
import p.c;
import p.g;
import p.h;

public abstract class d implements h {

    /* renamed from: d  reason: collision with root package name */
    public final e f4049d;

    /* renamed from: e  reason: collision with root package name */
    public l f4050e;

    public d(Object obj, e eVar) {
        o.m(eVar, "policy");
        this.f4049d = eVar;
        this.f4050e = new l(obj);
    }

    public final Object a() {
        l c6;
        l lVar = this.f4050e;
        a0 a0Var = g.f4374a;
        o.m(lVar, "<this>");
        c b6 = g.b();
        l c7 = g.c(lVar, b6.f4357b, b6.f4356a);
        if (c7 == null) {
            synchronized (g.f4375b) {
                c b7 = g.b();
                c6 = g.c(lVar, b7.f4357b, b7.f4356a);
            }
            if (c6 != null) {
                c7 = c6;
            } else {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
            }
        }
        return c7.f1170b;
    }

    public final String toString() {
        l a6 = g.a(this.f4050e);
        return "MutableState(value=" + a6.f1170b + ")@" + hashCode();
    }
}
