package u0;

import java.util.concurrent.ThreadFactory;

public final class i implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f5260a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f5261b = 10;

    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f5260a, this.f5261b);
    }
}
