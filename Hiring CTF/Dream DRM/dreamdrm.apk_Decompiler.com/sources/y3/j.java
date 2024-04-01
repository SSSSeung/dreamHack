package y3;

import a2.m;
import c4.a;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v3.a0;
import v3.n;
import v3.y;
import v3.z;
import x3.p;

public final class j extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final h f5864b = new h(1, y.f5406d);

    /* renamed from: a  reason: collision with root package name */
    public final z f5865a;

    public j(n nVar, z zVar) {
        this.f5865a = zVar;
    }

    public static Serializable d(a aVar, int i3) {
        if (i3 != 0) {
            int i6 = i3 - 1;
            if (i6 == 0) {
                aVar.b();
                return new ArrayList();
            } else if (i6 != 2) {
                return null;
            } else {
                aVar.e();
                return new p(true);
            }
        } else {
            throw null;
        }
    }

    public final Object b(a aVar) {
        int Q = aVar.Q();
        Object d6 = d(aVar, Q);
        if (d6 == null) {
            return c(aVar, Q);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.D()) {
                String K = d6 instanceof Map ? aVar.K() : null;
                int Q2 = aVar.Q();
                Serializable d7 = d(aVar, Q2);
                boolean z5 = d7 != null;
                Serializable c6 = d7 == null ? c(aVar, Q2) : d7;
                if (d6 instanceof List) {
                    ((List) d6).add(c6);
                } else {
                    ((Map) d6).put(K, c6);
                }
                if (z5) {
                    arrayDeque.addLast(d6);
                    d6 = c6;
                }
            } else {
                if (d6 instanceof List) {
                    aVar.n();
                } else {
                    aVar.p();
                }
                if (arrayDeque.isEmpty()) {
                    return d6;
                }
                d6 = arrayDeque.removeLast();
            }
        }
    }

    public final Serializable c(a aVar, int i3) {
        if (i3 != 0) {
            int i6 = i3 - 1;
            if (i6 == 5) {
                return aVar.O();
            }
            if (i6 == 6) {
                return this.f5865a.a(aVar);
            }
            if (i6 == 7) {
                return Boolean.valueOf(aVar.G());
            }
            if (i6 == 8) {
                aVar.M();
                return null;
            }
            throw new IllegalStateException("Unexpected token: ".concat(m.w(i3)));
        }
        throw null;
    }
}
