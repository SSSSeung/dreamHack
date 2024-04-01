package h4;

import b1.o;
import java.util.Comparator;

public final class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3457a = new b();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        o.m(comparable, "a");
        o.m(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return a.f3456a;
    }
}
