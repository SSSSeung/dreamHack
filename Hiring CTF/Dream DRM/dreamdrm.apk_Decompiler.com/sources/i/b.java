package i;

import h5.l;

public final class b extends l {

    /* renamed from: r  reason: collision with root package name */
    public static volatile b f3503r;

    /* renamed from: q  reason: collision with root package name */
    public final d f3504q = new d();

    public b() {
        super(0);
    }

    public static b x() {
        if (f3503r != null) {
            return f3503r;
        }
        synchronized (b.class) {
            if (f3503r == null) {
                f3503r = new b();
            }
        }
        return f3503r;
    }
}
