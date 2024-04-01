package w4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class q extends c0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k  reason: collision with root package name */
    public static final q f5521k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f5522l;

    static {
        Long l6;
        q qVar = new q();
        f5521k = qVar;
        qVar.H(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l6 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l6 = 1000L;
        }
        f5522l = timeUnit.toNanos(l6.longValue());
    }

    public final Thread G() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final void K(long j6, a0 a0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void L(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.L(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void R() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            P();
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0096, code lost:
        _thread = null;
        R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (N() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = w4.z0.f5534a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch:{ all -> 0x0091 }
            int r0 = debugStatus     // Catch:{ all -> 0x0093 }
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L_0x0016
            if (r0 != r3) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r5
            goto L_0x0017
        L_0x0016:
            r0 = r6
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r5
            goto L_0x0023
        L_0x001c:
            debugStatus = r6     // Catch:{ all -> 0x0093 }
            r17.notifyAll()     // Catch:{ all -> 0x0093 }
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r6
        L_0x0023:
            if (r0 != 0) goto L_0x0034
            _thread = r2
            r17.R()
            boolean r0 = r17.N()
            if (r0 != 0) goto L_0x0033
            r17.G()
        L_0x0033:
            return
        L_0x0034:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L_0x003a:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0091 }
            long r11 = r17.O()     // Catch:{ all -> 0x0091 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L_0x006d
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0091 }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            long r9 = f5522l     // Catch:{ all -> 0x0091 }
            long r9 = r9 + r15
        L_0x0052:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            _thread = r2
            r17.R()
            boolean r0 = r17.N()
            if (r0 != 0) goto L_0x0066
            r17.G()
        L_0x0066:
            return
        L_0x0067:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r11 = r15
            goto L_0x006e
        L_0x006d:
            r9 = r7
        L_0x006e:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            int r0 = debugStatus     // Catch:{ all -> 0x0091 }
            if (r0 == r4) goto L_0x007b
            if (r0 != r3) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = r5
            goto L_0x007c
        L_0x007b:
            r0 = r6
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            _thread = r2
            r17.R()
            boolean r0 = r17.N()
            if (r0 != 0) goto L_0x008c
            r17.G()
        L_0x008c:
            return
        L_0x008d:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch:{ all -> 0x0091 }
            goto L_0x003a
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0096:
            _thread = r2
            r17.R()
            boolean r2 = r17.N()
            if (r2 != 0) goto L_0x00a4
            r17.G()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q.run():void");
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
