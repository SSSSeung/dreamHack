package kotlinx.coroutines.internal;

import b1.o;
import f4.e;
import i4.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.d;
import w4.d0;
import w4.i;
import w4.j;
import w4.l;
import w4.p;
import w4.v;
import w4.z0;

public final class c extends v implements d, i4.d {
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: g  reason: collision with root package name */
    public final l f3979g;

    /* renamed from: h  reason: collision with root package name */
    public final i4.d f3980h;

    /* renamed from: i  reason: collision with root package name */
    public Object f3981i = h5.l.f3487f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f3982j = o.X(f());

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");
    }

    public c(l lVar, k4.c cVar) {
        super(-1);
        this.f3979g = lVar;
        this.f3980h = cVar;
    }

    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof j) {
            ((j) obj).f5489b.i(cancellationException);
        }
    }

    public final i4.d b() {
        return this;
    }

    public final d c() {
        i4.d dVar = this.f3980h;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final h f() {
        return this.f3980h.f();
    }

    public final void g(Object obj) {
        h f6;
        Object b02;
        i4.d dVar = this.f3980h;
        h f7 = dVar.f();
        Throwable a6 = e.a(obj);
        Object iVar = a6 == null ? obj : new i(a6, false);
        l lVar = this.f3979g;
        if (lVar.D()) {
            this.f3981i = iVar;
            this.f5528f = 0;
            lVar.C(f7, this);
            return;
        }
        d0 a7 = z0.a();
        if (a7.I()) {
            this.f3981i = iVar;
            this.f5528f = 0;
            a7.F(this);
            return;
        }
        a7.H(true);
        try {
            f6 = f();
            b02 = o.b0(f6, this.f3982j);
            dVar.g(obj);
            o.U(f6, b02);
            do {
            } while (a7.J());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a7.E(true);
                throw th2;
            }
        }
        a7.E(true);
    }

    public final Object i() {
        Object obj = this.f3981i;
        this.f3981i = h5.l.f3487f;
        return obj;
    }

    public final void j() {
        Object obj = this._reusableCancellableContinuation;
        w4.e eVar = obj instanceof w4.e ? (w4.e) obj : null;
        if (eVar != null) {
            eVar.j();
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3979g + ", " + p.u(this.f3980h) + ']';
    }
}
