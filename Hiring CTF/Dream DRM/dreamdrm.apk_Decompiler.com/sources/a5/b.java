package a5;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f211b;

    public b(String str, boolean z5) {
        this.f210a = str;
        this.f211b = z5;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f210a);
        thread.setDaemon(this.f211b);
        return thread;
    }
}
