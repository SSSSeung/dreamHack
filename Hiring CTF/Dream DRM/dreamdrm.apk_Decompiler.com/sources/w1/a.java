package w1;

import java.util.concurrent.Callable;

public final class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5427a;

    public a(f fVar) {
        this.f5427a = fVar;
    }

    public final Object call() {
        synchronized (this.f5427a) {
            f fVar = this.f5427a;
            if (fVar.f5453l != null) {
                fVar.I();
                if (this.f5427a.q()) {
                    this.f5427a.G();
                    this.f5427a.f5455n = 0;
                }
            }
        }
        return null;
    }
}
