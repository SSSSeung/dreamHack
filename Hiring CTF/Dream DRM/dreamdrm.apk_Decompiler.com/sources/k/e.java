package k;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3872a;

    /* renamed from: b  reason: collision with root package name */
    public int f3873b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3874c;

    /* renamed from: d  reason: collision with root package name */
    public int f3875d;

    /* renamed from: e  reason: collision with root package name */
    public int f3876e;

    public e(int i3) {
        if (i3 > 0) {
            this.f3874c = i3;
            this.f3872a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f3872a.get(obj);
                if (obj2 != null) {
                    this.f3875d++;
                    return obj2;
                }
                this.f3876e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0083
            monitor-enter(r2)
            int r0 = r2.f3873b     // Catch:{ all -> 0x0080 }
            int r0 = r0 + 1
            r2.f3873b = r0     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap r0 = r2.f3872a     // Catch:{ all -> 0x0080 }
            java.lang.Object r3 = r0.put(r3, r4)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0017
            int r4 = r2.f3873b     // Catch:{ all -> 0x0080 }
            int r4 = r4 + -1
            r2.f3873b = r4     // Catch:{ all -> 0x0080 }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            int r4 = r2.f3874c
        L_0x001a:
            monitor-enter(r2)
            int r0 = r2.f3873b     // Catch:{ all -> 0x007d }
            if (r0 < 0) goto L_0x005e
            java.util.LinkedHashMap r0 = r2.f3872a     // Catch:{ all -> 0x007d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x002b
            int r0 = r2.f3873b     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x005e
        L_0x002b:
            int r0 = r2.f3873b     // Catch:{ all -> 0x007d }
            if (r0 <= r4) goto L_0x005c
            java.util.LinkedHashMap r0 = r2.f3872a     // Catch:{ all -> 0x007d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0038
            goto L_0x005c
        L_0x0038:
            java.util.LinkedHashMap r0 = r2.f3872a     // Catch:{ all -> 0x007d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x007d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x007d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x007d }
            r0.getValue()     // Catch:{ all -> 0x007d }
            java.util.LinkedHashMap r0 = r2.f3872a     // Catch:{ all -> 0x007d }
            r0.remove(r1)     // Catch:{ all -> 0x007d }
            int r0 = r2.f3873b     // Catch:{ all -> 0x007d }
            int r0 = r0 + -1
            r2.f3873b = r0     // Catch:{ all -> 0x007d }
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            goto L_0x001a
        L_0x005c:
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            return r3
        L_0x005e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r4.<init>()     // Catch:{ all -> 0x007d }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x007d }
            r4.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007d }
            r3.<init>(r4)     // Catch:{ all -> 0x007d }
            throw r3     // Catch:{ all -> 0x007d }
        L_0x007d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            throw r3
        L_0x0080:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            throw r3
        L_0x0083:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i3;
        int i6;
        i3 = this.f3875d;
        i6 = this.f3876e + i3;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3874c), Integer.valueOf(this.f3875d), Integer.valueOf(this.f3876e), Integer.valueOf(i6 != 0 ? (i3 * 100) / i6 : 0)});
    }
}
