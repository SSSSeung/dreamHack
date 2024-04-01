package w4;

import b1.o;
import h5.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.h;
import o4.c;

public abstract class m0 extends h implements x, g0, c {

    /* renamed from: g  reason: collision with root package name */
    public q0 f5493g;

    public final boolean b() {
        return true;
    }

    public final void c() {
        boolean z5;
        q0 r5 = r();
        do {
            Object B = r5.B();
            if (B instanceof m0) {
                if (B == this) {
                    z zVar = l.f3497p;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q0.f5523d;
                        if (!atomicReferenceFieldUpdater.compareAndSet(r5, B, zVar)) {
                            if (atomicReferenceFieldUpdater.get(r5) != B) {
                                z5 = false;
                                continue;
                                break;
                            }
                        } else {
                            z5 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((B instanceof g0) && ((g0) B).f() != null) {
                o();
                return;
            } else {
                return;
            }
        } while (!z5);
    }

    public final t0 f() {
        return null;
    }

    public final q0 r() {
        q0 q0Var = this.f5493g;
        if (q0Var != null) {
            return q0Var;
        }
        o.Y("job");
        throw null;
    }

    public abstract void s(Throwable th);

    public final String toString() {
        return getClass().getSimpleName() + '@' + p.p(this) + "[job@" + p.p(r()) + ']';
    }
}
