package d5;

import b1.o;
import e5.d;
import java.io.IOException;
import z4.n;
import z4.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2202a;

    /* renamed from: b  reason: collision with root package name */
    public final l f2203b;

    /* renamed from: c  reason: collision with root package name */
    public final j f2204c;

    /* renamed from: d  reason: collision with root package name */
    public final n f2205d;

    /* renamed from: e  reason: collision with root package name */
    public final f f2206e;

    /* renamed from: f  reason: collision with root package name */
    public final d f2207f;

    public e(j jVar, n nVar, f fVar, d dVar) {
        o.m(nVar, "eventListener");
        this.f2204c = jVar;
        this.f2205d = nVar;
        this.f2206e = fVar;
        this.f2207f = dVar;
        this.f2203b = dVar.h();
    }

    public final IOException a(boolean z5, boolean z6, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        n nVar = this.f2205d;
        j jVar = this.f2204c;
        if (z6) {
            nVar.getClass();
            if (iOException != null) {
                o.m(jVar, "call");
            } else {
                o.m(jVar, "call");
            }
        }
        if (z5) {
            if (iOException != null) {
                nVar.getClass();
                o.m(jVar, "call");
            } else {
                nVar.getClass();
                o.m(jVar, "call");
            }
        }
        return jVar.h(this, z6, z5, iOException);
    }

    public final z b(boolean z5) {
        try {
            z f6 = this.f2207f.f(z5);
            if (f6 != null) {
                f6.f6129m = this;
            }
            return f6;
        } catch (IOException e6) {
            this.f2205d.getClass();
            o.m(this.f2204c, "call");
            c(e6);
            throw e6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6 > 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.IOException r6) {
        /*
            r5 = this;
            d5.f r0 = r5.f2206e
            r0.c(r6)
            e5.d r0 = r5.f2207f
            d5.l r0 = r0.h()
            d5.j r1 = r5.f2204c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            b1.o.m(r1, r2)     // Catch:{ all -> 0x0059 }
            boolean r2 = r6 instanceof g5.g0     // Catch:{ all -> 0x0059 }
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r2 = r6
            g5.g0 r2 = (g5.g0) r2     // Catch:{ all -> 0x0059 }
            g5.b r2 = r2.f2979d     // Catch:{ all -> 0x0059 }
            g5.b r4 = g5.b.f2927i     // Catch:{ all -> 0x0059 }
            if (r2 != r4) goto L_0x002b
            int r6 = r0.f2254m     // Catch:{ all -> 0x0059 }
            int r6 = r6 + r3
            r0.f2254m = r6     // Catch:{ all -> 0x0059 }
            if (r6 <= r3) goto L_0x0057
        L_0x0028:
            r0.f2250i = r3     // Catch:{ all -> 0x0059 }
            goto L_0x0052
        L_0x002b:
            g5.g0 r6 = (g5.g0) r6     // Catch:{ all -> 0x0059 }
            g5.b r6 = r6.f2979d     // Catch:{ all -> 0x0059 }
            g5.b r2 = g5.b.f2928j     // Catch:{ all -> 0x0059 }
            if (r6 != r2) goto L_0x0028
            boolean r6 = r1.f2236p     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0057
        L_0x0038:
            g5.u r2 = r0.f2247f     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x003e
            r2 = r3
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0045
            boolean r2 = r6 instanceof g5.a     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
        L_0x0045:
            r0.f2250i = r3     // Catch:{ all -> 0x0059 }
            int r2 = r0.f2253l     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0057
            z4.w r1 = r1.f2239s     // Catch:{ all -> 0x0059 }
            z4.d0 r2 = r0.f2258q     // Catch:{ all -> 0x0059 }
            d5.l.d(r1, r2, r6)     // Catch:{ all -> 0x0059 }
        L_0x0052:
            int r6 = r0.f2252k     // Catch:{ all -> 0x0059 }
            int r6 = r6 + r3
            r0.f2252k = r6     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r0)
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.e.c(java.io.IOException):void");
    }
}
