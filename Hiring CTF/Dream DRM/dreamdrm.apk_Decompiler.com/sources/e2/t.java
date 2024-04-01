package e2;

import java.util.ArrayDeque;
import r2.l;

public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayDeque f2540d = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public int f2541a;

    /* renamed from: b  reason: collision with root package name */
    public int f2542b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2543c;

    static {
        char[] cArr = l.f4938a;
    }

    public static t a(Object obj) {
        t tVar;
        ArrayDeque arrayDeque = f2540d;
        synchronized (arrayDeque) {
            tVar = (t) arrayDeque.poll();
        }
        if (tVar == null) {
            tVar = new t();
        }
        tVar.f2543c = obj;
        tVar.f2542b = 0;
        tVar.f2541a = 0;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2542b == tVar.f2542b && this.f2541a == tVar.f2541a && this.f2543c.equals(tVar.f2543c);
    }

    public final int hashCode() {
        return this.f2543c.hashCode() + (((this.f2541a * 31) + this.f2542b) * 31);
    }
}
