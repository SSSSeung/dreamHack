package n1;

import android.view.Choreographer;

public abstract class g {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new f(runnable));
    }
}
