package h4;

import b1.o;
import java.util.Comparator;

public final class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3456a = new a();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        o.m(comparable, "a");
        o.m(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return b.f3457a;
    }
}
