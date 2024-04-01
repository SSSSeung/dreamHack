package g5;

import c5.a;

public final class s extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f3011e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f3012f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3013g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3014h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(String str, u uVar, int i3, Object obj, int i6) {
        super(str, true);
        this.f3011e = i6;
        this.f3012f = uVar;
        this.f3013g = i3;
        this.f3014h = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r6 = this;
            int r0 = r6.f3011e
            r1 = -1
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0048
        L_0x0008:
            g5.u r0 = r6.f3012f
            int r3 = r6.f3013g     // Catch:{ IOException -> 0x001e }
            java.lang.Object r4 = r6.f3014h     // Catch:{ IOException -> 0x001e }
            g5.b r4 = (g5.b) r4     // Catch:{ IOException -> 0x001e }
            r0.getClass()     // Catch:{ IOException -> 0x001e }
            java.lang.String r5 = "statusCode"
            b1.o.m(r4, r5)     // Catch:{ IOException -> 0x001e }
            g5.b0 r5 = r0.B     // Catch:{ IOException -> 0x001e }
            r5.p(r3, r4)     // Catch:{ IOException -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r3 = move-exception
            r0.e(r3)
        L_0x0022:
            return r1
        L_0x0023:
            g5.u r0 = r6.f3012f
            androidx.compose.ui.platform.e r0 = r0.f3029o
            java.lang.Object r3 = r6.f3014h
            g5.b r3 = (g5.b) r3
            r0.getClass()
            java.lang.String r0 = "errorCode"
            b1.o.m(r3, r0)
            g5.u r0 = r6.f3012f
            monitor-enter(r0)
            g5.u r3 = r6.f3012f     // Catch:{ all -> 0x0045 }
            java.util.LinkedHashSet r3 = r3.D     // Catch:{ all -> 0x0045 }
            int r4 = r6.f3013g     // Catch:{ all -> 0x0045 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0045 }
            r3.remove(r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            return r1
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0048:
            g5.u r0 = r6.f3012f
            androidx.compose.ui.platform.e r0 = r0.f3029o
            java.lang.Object r3 = r6.f3014h
            java.util.List r3 = (java.util.List) r3
            r0.getClass()
            java.lang.String r0 = "requestHeaders"
            b1.o.m(r3, r0)
            g5.u r0 = r6.f3012f     // Catch:{ IOException -> 0x0078 }
            g5.b0 r0 = r0.B     // Catch:{ IOException -> 0x0078 }
            int r3 = r6.f3013g     // Catch:{ IOException -> 0x0078 }
            g5.b r4 = g5.b.f2928j     // Catch:{ IOException -> 0x0078 }
            r0.p(r3, r4)     // Catch:{ IOException -> 0x0078 }
            g5.u r0 = r6.f3012f     // Catch:{ IOException -> 0x0078 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0078 }
            g5.u r3 = r6.f3012f     // Catch:{ all -> 0x0075 }
            java.util.LinkedHashSet r3 = r3.D     // Catch:{ all -> 0x0075 }
            int r4 = r6.f3013g     // Catch:{ all -> 0x0075 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0075 }
            r3.remove(r4)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0078 }
            goto L_0x0078
        L_0x0075:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0078 }
            throw r3     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.s.a():long");
    }
}
