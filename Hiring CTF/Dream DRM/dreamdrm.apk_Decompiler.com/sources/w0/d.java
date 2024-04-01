package w0;

import g0.f;

public final class d extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Object f5426g = new Object();

    public d(int i3) {
        super(i3, 1);
    }

    public final boolean a(Object obj) {
        boolean a6;
        synchronized (this.f5426g) {
            a6 = super.a(obj);
        }
        return a6;
    }

    public final Object b() {
        Object b6;
        synchronized (this.f5426g) {
            b6 = super.b();
        }
        return b6;
    }
}
