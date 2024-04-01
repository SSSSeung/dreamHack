package w4;

import f4.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o4.c;

public final class h0 extends k0 {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5484i = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h  reason: collision with root package name */
    public final c f5485h;

    public h0(c cVar) {
        this.f5485h = cVar;
    }

    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        s((Throwable) obj);
        return h.f2682a;
    }

    public final void s(Throwable th) {
        if (f5484i.compareAndSet(this, 0, 1)) {
            this.f5485h.i(th);
        }
    }
}
