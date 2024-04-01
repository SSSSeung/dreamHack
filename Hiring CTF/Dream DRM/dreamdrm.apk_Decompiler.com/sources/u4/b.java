package u4;

import b1.o;
import java.util.Iterator;
import x0.a1;

public final class b implements f, c {

    /* renamed from: a  reason: collision with root package name */
    public final f f5341a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5342b;

    public b(f fVar, int i3) {
        o.m(fVar, "sequence");
        this.f5341a = fVar;
        this.f5342b = i3;
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
        }
    }

    public final f a(int i3) {
        int i6 = this.f5342b + i3;
        return i6 < 0 ? new b(this, i3) : new b(this.f5341a, i6);
    }

    public final Iterator iterator() {
        return new a1(this);
    }
}
