package u0;

import w0.a;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5247b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f5246a = i3;
        this.f5247b = obj;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f5246a) {
            case 0:
                b((e) obj);
                return;
            default:
                b((e) obj);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0 >= r2.size()) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        ((u0.d) ((w0.a) r2.get(r0))).a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(u0.e r5) {
        /*
            r4 = this;
            int r0 = r4.f5246a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0016
        L_0x0006:
            if (r5 != 0) goto L_0x000e
            u0.e r5 = new u0.e
            r0 = -3
            r5.<init>((int) r0)
        L_0x000e:
            java.lang.Object r0 = r4.f5247b
            androidx.appcompat.widget.a0 r0 = (androidx.appcompat.widget.a0) r0
            r0.x(r5)
            return
        L_0x0016:
            java.lang.Object r0 = u0.f.f5252c
            monitor-enter(r0)
            k.j r1 = u0.f.f5253d     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = r4.f5247b     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0048 }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0047
        L_0x002a:
            java.lang.Object r3 = r4.f5247b     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0048 }
            r1.remove(r3)     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            r0 = 0
        L_0x0033:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x0047
            java.lang.Object r1 = r2.get(r0)
            w0.a r1 = (w0.a) r1
            u0.d r1 = (u0.d) r1
            r1.a(r5)
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0047:
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d.b(u0.e):void");
    }
}
