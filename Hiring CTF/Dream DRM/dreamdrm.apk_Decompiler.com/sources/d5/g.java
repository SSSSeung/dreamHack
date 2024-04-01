package d5;

import java.util.concurrent.atomic.AtomicInteger;
import z4.e;

public final class g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public volatile AtomicInteger f2218d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final e f2219e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f2220f;

    public g(j jVar, e eVar) {
        this.f2220f = jVar;
        this.f2219e = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ all -> 0x0075, all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ all -> 0x0075, all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[Catch:{ all -> 0x0075, all -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "canceled due to "
            java.lang.String r1 = "Callback failure for "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OkHttp "
            r2.<init>(r3)
            d5.j r3 = r8.f2220f
            androidx.appcompat.widget.w r3 = r3.f2240t
            java.lang.Object r3 = r3.f820c
            z4.t r3 = (z4.t) r3
            java.lang.String r3 = r3.f()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = "currentThread"
            b1.o.l(r3, r4)
            java.lang.String r4 = r3.getName()
            r3.setName(r2)
            d5.j r2 = r8.f2220f     // Catch:{ all -> 0x00b6 }
            d5.i r2 = r2.f2226f     // Catch:{ all -> 0x00b6 }
            r2.h()     // Catch:{ all -> 0x00b6 }
            r2 = 0
            d5.j r5 = r8.f2220f     // Catch:{ IOException -> 0x0078, all -> 0x0051 }
            z4.a0 r2 = r5.g()     // Catch:{ IOException -> 0x0078, all -> 0x0051 }
            r5 = 1
            z4.e r6 = r8.f2219e     // Catch:{ IOException -> 0x004e, all -> 0x004b }
            d5.j r7 = r8.f2220f     // Catch:{ IOException -> 0x004e, all -> 0x004b }
            r6.b(r7, r2)     // Catch:{ IOException -> 0x004e, all -> 0x004b }
            d5.j r0 = r8.f2220f     // Catch:{ all -> 0x00b6 }
            z4.w r0 = r0.f2239s     // Catch:{ all -> 0x00b6 }
        L_0x0048:
            z4.m r0 = r0.f6083d     // Catch:{ all -> 0x00b6 }
            goto L_0x00a5
        L_0x004b:
            r1 = move-exception
            r2 = r5
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r2 = r5
            goto L_0x0079
        L_0x0051:
            r1 = move-exception
        L_0x0052:
            d5.j r5 = r8.f2220f     // Catch:{ all -> 0x0075 }
            r5.d()     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0077
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r5.<init>(r0)     // Catch:{ all -> 0x0075 }
            r5.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0075 }
            r2.<init>(r0)     // Catch:{ all -> 0x0075 }
            b1.o.a(r2, r1)     // Catch:{ all -> 0x0075 }
            z4.e r0 = r8.f2219e     // Catch:{ all -> 0x0075 }
            d5.j r5 = r8.f2220f     // Catch:{ all -> 0x0075 }
            r0.a(r5, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            r0 = move-exception
            goto L_0x00ac
        L_0x0077:
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0078:
            r0 = move-exception
        L_0x0079:
            if (r2 == 0) goto L_0x0099
            h5.n r2 = h5.n.f3500a     // Catch:{ all -> 0x0075 }
            h5.n r2 = h5.n.f3500a     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r5.<init>(r1)     // Catch:{ all -> 0x0075 }
            d5.j r1 = r8.f2220f     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = d5.j.a(r1)     // Catch:{ all -> 0x0075 }
            r5.append(r1)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0075 }
            r2.getClass()     // Catch:{ all -> 0x0075 }
            r2 = 4
            h5.n.i(r1, r2, r0)     // Catch:{ all -> 0x0075 }
            goto L_0x00a0
        L_0x0099:
            z4.e r1 = r8.f2219e     // Catch:{ all -> 0x0075 }
            d5.j r2 = r8.f2220f     // Catch:{ all -> 0x0075 }
            r1.a(r2, r0)     // Catch:{ all -> 0x0075 }
        L_0x00a0:
            d5.j r0 = r8.f2220f     // Catch:{ all -> 0x00b6 }
            z4.w r0 = r0.f2239s     // Catch:{ all -> 0x00b6 }
            goto L_0x0048
        L_0x00a5:
            r0.a(r8)     // Catch:{ all -> 0x00b6 }
            r3.setName(r4)
            return
        L_0x00ac:
            d5.j r1 = r8.f2220f     // Catch:{ all -> 0x00b6 }
            z4.w r1 = r1.f2239s     // Catch:{ all -> 0x00b6 }
            z4.m r1 = r1.f6083d     // Catch:{ all -> 0x00b6 }
            r1.a(r8)     // Catch:{ all -> 0x00b6 }
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r3.setName(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.run():void");
    }
}
