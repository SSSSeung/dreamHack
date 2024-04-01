package l4;

import b1.o;
import java.lang.reflect.Method;
import q4.c;
import q4.e;

public class b {
    public void a(Throwable th, Throwable th2) {
        o.m(th, "cause");
        o.m(th2, "exception");
        Method method = a.f4110a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public e b() {
        return new c();
    }
}
