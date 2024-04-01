package n1;

import android.view.Choreographer;

public final /* synthetic */ class f implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f4252a;

    public /* synthetic */ f(Runnable runnable) {
        this.f4252a = runnable;
    }

    public final void doFrame(long j6) {
        this.f4252a.run();
    }
}
