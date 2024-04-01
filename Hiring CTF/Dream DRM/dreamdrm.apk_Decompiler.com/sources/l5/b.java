package l5;

public final class b extends Thread {
    public b() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r1 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r1.k();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Class<l5.e> r0 = l5.e.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
            l5.e r1 = l5.e.f4121j     // Catch:{ all -> 0x0019 }
            l5.e r1 = androidx.fragment.app.n0.h()     // Catch:{ all -> 0x0019 }
            l5.e r2 = l5.e.f4121j     // Catch:{ all -> 0x0019 }
            if (r1 != r2) goto L_0x0012
            r1 = 0
            l5.e.f4121j = r1     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
            if (r1 == 0) goto L_0x0000
            r1.k()     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
            throw r1     // Catch:{ InterruptedException -> 0x0000 }
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.run():void");
    }
}
