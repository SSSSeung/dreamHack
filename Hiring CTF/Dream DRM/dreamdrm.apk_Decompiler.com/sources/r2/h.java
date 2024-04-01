package r2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4930a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f4931b;

    /* renamed from: c  reason: collision with root package name */
    public long f4932c;

    public h(long j6) {
        this.f4931b = j6;
    }

    public final synchronized Object a(Object obj) {
        g gVar;
        gVar = (g) this.f4930a.get(obj);
        return gVar != null ? gVar.f4928a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object d(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f4931b     // Catch:{ all -> 0x004c }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f4932c     // Catch:{ all -> 0x004c }
            long r5 = r5 + r1
            r7.f4932c = r5     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f4930a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            r2.g r2 = new r2.g     // Catch:{ all -> 0x004c }
            r2.<init>(r0, r9)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            r2.g r0 = (r2.g) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f4932c     // Catch:{ all -> 0x004c }
            int r3 = r0.f4929b     // Catch:{ all -> 0x004c }
            long r5 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r5
            r7.f4932c = r1     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r0.f4928a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            java.lang.Object r9 = r0.f4928a     // Catch:{ all -> 0x004c }
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f4931b     // Catch:{ all -> 0x004c }
            r7.e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r4 = r0.f4928a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.h.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized void e(long j6) {
        while (this.f4932c > j6) {
            Iterator it = this.f4930a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            g gVar = (g) entry.getValue();
            this.f4932c -= (long) gVar.f4929b;
            Object key = entry.getKey();
            it.remove();
            c(key, gVar.f4928a);
        }
    }
}
