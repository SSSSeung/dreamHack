package e;

import java.util.concurrent.Executor;
import r2.l;

public final class m0 implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2400d;

    public /* synthetic */ m0(int i3) {
        this.f2400d = i3;
    }

    public final void execute(Runnable runnable) {
        switch (this.f2400d) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                l.e().post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
