package r4;

import b1.o;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends q4.a {
    public final Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        o.l(current, "current()");
        return current;
    }
}
