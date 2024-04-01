package i;

import java.util.concurrent.Executor;

public final /* synthetic */ class a implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3502d;

    public /* synthetic */ a(int i3) {
        this.f3502d = i3;
    }

    public final void execute(Runnable runnable) {
        switch (this.f3502d) {
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
