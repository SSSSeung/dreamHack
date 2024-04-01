package w4;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.scheduling.d;
import x4.c;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final s f5524a;

    static {
        String str;
        s sVar;
        int i3 = s.f4004a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            d dVar = w.f5529a;
            s0 s0Var = m.f4001a;
            c cVar = ((c) s0Var).f5768i;
            if (s0Var instanceof s) {
                sVar = (s) s0Var;
                f5524a = sVar;
            }
        }
        sVar = q.f5521k;
        f5524a = sVar;
    }
}
