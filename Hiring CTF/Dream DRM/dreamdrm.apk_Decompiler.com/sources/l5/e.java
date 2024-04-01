package l5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class e extends x {

    /* renamed from: h  reason: collision with root package name */
    public static final long f4119h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f4120i;

    /* renamed from: j  reason: collision with root package name */
    public static e f4121j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4122e;

    /* renamed from: f  reason: collision with root package name */
    public e f4123f;

    /* renamed from: g  reason: collision with root package name */
    public long f4124g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f4119h = millis;
        f4120i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[EDGE_INSN: B:40:0x005d->B:27:0x005d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            boolean r0 = r9.f4122e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0075
            long r2 = r9.f4167c
            boolean r0 = r9.f4165a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            r9.f4122e = r1
            java.lang.Class<l5.e> r1 = l5.e.class
            monitor-enter(r1)
            l5.e r5 = f4121j     // Catch:{ all -> 0x0072 }
            if (r5 != 0) goto L_0x002b
            l5.e r5 = new l5.e     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            f4121j = r5     // Catch:{ all -> 0x0072 }
            l5.b r5 = new l5.b     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            r5.start()     // Catch:{ all -> 0x0072 }
        L_0x002b:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003d
            long r7 = r9.c()     // Catch:{ all -> 0x0072 }
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0072 }
            goto L_0x003f
        L_0x003d:
            if (r4 == 0) goto L_0x0041
        L_0x003f:
            long r2 = r2 + r5
            goto L_0x0047
        L_0x0041:
            if (r0 == 0) goto L_0x006c
            long r2 = r9.c()     // Catch:{ all -> 0x0072 }
        L_0x0047:
            r9.f4124g = r2     // Catch:{ all -> 0x0072 }
            long r2 = r2 - r5
            l5.e r0 = f4121j     // Catch:{ all -> 0x0072 }
        L_0x004c:
            b1.o.k(r0)     // Catch:{ all -> 0x0072 }
            l5.e r4 = r0.f4123f     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x005d
            long r7 = r4.f4124g     // Catch:{ all -> 0x0072 }
            long r7 = r7 - r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r0 = r4
            goto L_0x004c
        L_0x005d:
            r9.f4123f = r4     // Catch:{ all -> 0x0072 }
            r0.f4123f = r9     // Catch:{ all -> 0x0072 }
            l5.e r2 = f4121j     // Catch:{ all -> 0x0072 }
            if (r0 != r2) goto L_0x006a
            java.lang.Class<l5.e> r0 = l5.e.class
            r0.notify()     // Catch:{ all -> 0x0072 }
        L_0x006a:
            monitor-exit(r1)
            return
        L_0x006c:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0075:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.h():void");
    }

    public final boolean i() {
        if (!this.f4122e) {
            return false;
        }
        this.f4122e = false;
        synchronized (e.class) {
            e eVar = f4121j;
            while (eVar != null) {
                e eVar2 = eVar.f4123f;
                if (eVar2 == this) {
                    eVar.f4123f = this.f4123f;
                    this.f4123f = null;
                    return false;
                }
                eVar = eVar2;
            }
            return true;
        }
    }

    public InterruptedIOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
