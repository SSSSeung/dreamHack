package w4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5486b = AtomicIntegerFieldUpdater.newUpdater(i.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f5487a;

    public i(Throwable th, boolean z5) {
        this.f5487a = th;
        this._handled = z5 ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5487a + ']';
    }
}
