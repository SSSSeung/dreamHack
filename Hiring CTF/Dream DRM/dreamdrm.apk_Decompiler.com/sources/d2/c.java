package d2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c implements ExecutorService {

    /* renamed from: e  reason: collision with root package name */
    public static final long f2151e = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f  reason: collision with root package name */
    public static volatile int f2152f;

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f2153d;

    public c(ThreadPoolExecutor threadPoolExecutor) {
        this.f2153d = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f2153d.awaitTermination(j6, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f2153d.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f2153d.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f2153d.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f2153d.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f2153d.isTerminated();
    }

    public final void shutdown() {
        this.f2153d.shutdown();
    }

    public final List shutdownNow() {
        return this.f2153d.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f2153d.submit(runnable);
    }

    public final String toString() {
        return this.f2153d.toString();
    }

    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f2153d.invokeAll(collection, j6, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f2153d.invokeAny(collection, j6, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f2153d.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f2153d.submit(callable);
    }
}
