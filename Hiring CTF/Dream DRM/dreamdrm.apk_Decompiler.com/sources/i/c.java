package i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f3505a = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f3505a.getAndIncrement());
        return thread;
    }
}
