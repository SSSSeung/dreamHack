package g4;

import b1.o;
import b1.v;
import java.util.Collection;

public abstract class i extends v {
    public static final int W(Iterable iterable) {
        o.m(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
