package m4;

import b1.o;

public class b extends l4.b {
    public final void a(Throwable th, Throwable th2) {
        o.m(th, "cause");
        o.m(th2, "exception");
        Integer num = a.f4208a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
