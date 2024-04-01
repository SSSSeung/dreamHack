package g4;

import b1.o;
import java.util.RandomAccess;
import x3.d;

public final class c extends d implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public final d f2896d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2897e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2898f;

    public c(d dVar, int i3, int i6) {
        o.m(dVar, "list");
        this.f2896d = dVar;
        this.f2897e = i3;
        d.a(i3, i6, dVar.a());
        this.f2898f = i6 - i3;
    }

    public final int a() {
        return this.f2898f;
    }

    public final Object get(int i3) {
        int i6 = this.f2898f;
        if (i3 < 0 || i3 >= i6) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i6);
        }
        return this.f2896d.get(this.f2897e + i3);
    }
}
