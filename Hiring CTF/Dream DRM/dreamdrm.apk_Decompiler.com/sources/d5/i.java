package d5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import l5.e;

public final class i extends e {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2222k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f2223l;

    public /* synthetic */ i(int i3, Object obj) {
        this.f2222k = i3;
        this.f2223l = obj;
    }

    public final InterruptedIOException j(IOException iOException) {
        switch (this.f2222k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.j(iOException);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r6 = this;
            int r0 = r6.f2222k
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0056
        L_0x0006:
            java.lang.Object r0 = r6.f2223l
            g5.a0 r0 = (g5.a0) r0
            g5.b r1 = g5.b.f2928j
            r0.e(r1)
            java.lang.Object r0 = r6.f2223l
            g5.a0 r0 = (g5.a0) r0
            g5.u r0 = r0.f2922n
            monitor-enter(r0)
            long r1 = r0.f3033s     // Catch:{ all -> 0x004b }
            long r3 = r0.f3032r     // Catch:{ all -> 0x004b }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            monitor-exit(r0)
            goto L_0x004a
        L_0x0020:
            r1 = 1
            long r3 = r3 + r1
            r0.f3032r = r3     // Catch:{ all -> 0x004b }
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004b }
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r3 = (long) r3     // Catch:{ all -> 0x004b }
            long r1 = r1 + r3
            r0.f3034t = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            c5.c r1 = r0.f3026l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f3021g
            java.lang.String r4 = " ping"
            java.lang.String r2 = a2.m.j(r2, r3, r4)
            c5.b r3 = new c5.b
            r3.<init>((java.lang.String) r2, (g5.u) r0)
            r4 = 0
            r1.c(r3, r4)
        L_0x004a:
            return
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004e:
            java.lang.Object r0 = r6.f2223l
            d5.j r0 = (d5.j) r0
            r0.d()
            return
        L_0x0056:
            java.lang.String r0 = "Failed to close timed out socket "
            java.lang.Object r1 = r6.f2223l
            r2 = r1
            java.net.Socket r2 = (java.net.Socket) r2     // Catch:{ Exception -> 0x0073, AssertionError -> 0x0061 }
            r2.close()     // Catch:{ Exception -> 0x0073, AssertionError -> 0x0061 }
            goto L_0x0089
        L_0x0061:
            r2 = move-exception
            boolean r3 = com.bumptech.glide.c.t(r2)
            if (r3 == 0) goto L_0x0072
            java.util.logging.Logger r3 = l5.n.f4143a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            goto L_0x007d
        L_0x0072:
            throw r2
        L_0x0073:
            r2 = move-exception
            java.util.logging.Logger r3 = l5.n.f4143a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
        L_0x007d:
            java.net.Socket r1 = (java.net.Socket) r1
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r3.log(r4, r0, r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.k():void");
    }

    public final void l() {
        if (i()) {
            throw j((IOException) null);
        }
    }

    public i(Socket socket) {
        this.f2222k = 2;
        this.f2223l = socket;
    }
}
