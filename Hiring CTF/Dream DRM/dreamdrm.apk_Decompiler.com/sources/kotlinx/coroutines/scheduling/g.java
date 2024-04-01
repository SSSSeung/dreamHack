package kotlinx.coroutines.scheduling;

import i4.h;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import w4.e0;

public abstract class g extends e0 {

    /* renamed from: f  reason: collision with root package name */
    public final b f4030f;

    public g(int i3, int i6, long j6) {
        this.f4030f = new b(i3, i6, j6, "DefaultDispatcher");
    }

    public final void C(h hVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4015k;
        this.f4030f.e(runnable, j.f4039f, false);
    }
}
