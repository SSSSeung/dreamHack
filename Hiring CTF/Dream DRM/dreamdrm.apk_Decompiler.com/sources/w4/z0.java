package w4;

public abstract class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f5534a = new ThreadLocal();

    public static d0 a() {
        ThreadLocal threadLocal = f5534a;
        d0 d0Var = (d0) threadLocal.get();
        if (d0Var != null) {
            return d0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
