package u0;

import android.os.Process;

public final class h extends Thread {

    /* renamed from: d  reason: collision with root package name */
    public final int f5259d;

    public h(Runnable runnable, String str, int i3) {
        super(runnable, str);
        this.f5259d = i3;
    }

    public final void run() {
        Process.setThreadPriority(this.f5259d);
        super.run();
    }
}
