package w1;

import androidx.appcompat.widget.a0;
import c2.a;
import java.io.File;
import java.io.Serializable;

public final class e implements a {

    /* renamed from: d  reason: collision with root package name */
    public final long f5440d;

    /* renamed from: e  reason: collision with root package name */
    public f f5441e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5442f;

    /* renamed from: g  reason: collision with root package name */
    public final Serializable f5443g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f5444h;

    public e(File file, long j6) {
        this.f5444h = new a0(15);
        this.f5443g = file;
        this.f5440d = j6;
        this.f5442f = new a0(17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(y1.f r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5442f
            androidx.appcompat.widget.a0 r0 = (androidx.appcompat.widget.a0) r0
            java.lang.String r0 = r0.s(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Get: Obtained: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " for for Key: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.v(r1, r5)
        L_0x002a:
            monitor-enter(r4)     // Catch:{ IOException -> 0x004c }
            w1.f r5 = r4.f5441e     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x003b
            java.io.Serializable r5 = r4.f5443g     // Catch:{ all -> 0x004e }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x004e }
            long r2 = r4.f5440d     // Catch:{ all -> 0x004e }
            w1.f r5 = w1.f.C(r5, r2)     // Catch:{ all -> 0x004e }
            r4.f5441e = r5     // Catch:{ all -> 0x004e }
        L_0x003b:
            w1.f r5 = r4.f5441e     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ IOException -> 0x004c }
            w1.e r5 = r5.p(r0)     // Catch:{ IOException -> 0x004c }
            if (r5 == 0) goto L_0x005d
            java.lang.Object r5 = r5.f5444h     // Catch:{ IOException -> 0x004c }
            java.io.File[] r5 = (java.io.File[]) r5     // Catch:{ IOException -> 0x004c }
            r0 = 0
            r5 = r5[r0]     // Catch:{ IOException -> 0x004c }
            goto L_0x005e
        L_0x004c:
            r5 = move-exception
            goto L_0x0051
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x004c }
            throw r5     // Catch:{ IOException -> 0x004c }
        L_0x0051:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "Unable to get from disk cache"
            android.util.Log.w(r1, r0, r5)
        L_0x005d:
            r5 = 0
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.a(y1.f):java.io.File");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00c4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(y1.f r8, a2.k r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            java.lang.Object r2 = r7.f5442f
            androidx.appcompat.widget.a0 r2 = (androidx.appcompat.widget.a0) r2
            java.lang.String r2 = r2.s(r8)
            java.lang.Object r3 = r7.f5444h
            androidx.appcompat.widget.a0 r3 = (androidx.appcompat.widget.a0) r3
            monitor-enter(r3)
            java.lang.Object r4 = r3.f503e     // Catch:{ all -> 0x00ec }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x00ec }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x00ec }
            c2.b r4 = (c2.b) r4     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x003f
            java.lang.Object r4 = r3.f504f     // Catch:{ all -> 0x00ec }
            c2.c r4 = (c2.c) r4     // Catch:{ all -> 0x00ec }
            java.util.ArrayDeque r5 = r4.f1608a     // Catch:{ all -> 0x00ec }
            monitor-enter(r5)     // Catch:{ all -> 0x00ec }
            java.util.ArrayDeque r4 = r4.f1608a     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x003c }
            c2.b r4 = (c2.b) r4     // Catch:{ all -> 0x003c }
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x0034
            c2.b r4 = new c2.b     // Catch:{ all -> 0x00ec }
            r4.<init>()     // Catch:{ all -> 0x00ec }
        L_0x0034:
            java.lang.Object r5 = r3.f503e     // Catch:{ all -> 0x00ec }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x00ec }
            r5.put(r2, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            throw r8     // Catch:{ all -> 0x00ec }
        L_0x003f:
            int r5 = r4.f1607b     // Catch:{ all -> 0x00ec }
            r6 = 1
            int r5 = r5 + r6
            r4.f1607b = r5     // Catch:{ all -> 0x00ec }
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            java.util.concurrent.locks.ReentrantLock r3 = r4.f1606a
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x006d
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r4.<init>(r1)     // Catch:{ all -> 0x00e3 }
            r4.append(r2)     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch:{ all -> 0x00e3 }
            r4.append(r8)     // Catch:{ all -> 0x00e3 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00e3 }
            android.util.Log.v(r3, r8)     // Catch:{ all -> 0x00e3 }
        L_0x006d:
            monitor-enter(r7)     // Catch:{ IOException -> 0x00ba }
            w1.f r8 = r7.f5441e     // Catch:{ all -> 0x00cf }
            if (r8 != 0) goto L_0x007e
            java.io.Serializable r8 = r7.f5443g     // Catch:{ all -> 0x00cf }
            java.io.File r8 = (java.io.File) r8     // Catch:{ all -> 0x00cf }
            long r3 = r7.f5440d     // Catch:{ all -> 0x00cf }
            w1.f r8 = w1.f.C(r8, r3)     // Catch:{ all -> 0x00cf }
            r7.f5441e = r8     // Catch:{ all -> 0x00cf }
        L_0x007e:
            w1.f r8 = r7.f5441e     // Catch:{ all -> 0x00cf }
            monitor-exit(r7)     // Catch:{ IOException -> 0x00ba }
            w1.e r1 = r8.p(r2)     // Catch:{ IOException -> 0x00ba }
            if (r1 == 0) goto L_0x008f
        L_0x0087:
            java.lang.Object r8 = r7.f5444h
            androidx.appcompat.widget.a0 r8 = (androidx.appcompat.widget.a0) r8
            r8.z(r2)
            return
        L_0x008f:
            w1.c r8 = r8.l(r2)     // Catch:{ IOException -> 0x00ba }
            if (r8 == 0) goto L_0x00c5
            java.io.File r0 = r8.b()     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r9.f90a     // Catch:{ all -> 0x00bc }
            y1.c r1 = (y1.c) r1     // Catch:{ all -> 0x00bc }
            java.lang.Object r3 = r9.f91b     // Catch:{ all -> 0x00bc }
            java.lang.Object r9 = r9.f92c     // Catch:{ all -> 0x00bc }
            y1.i r9 = (y1.i) r9     // Catch:{ all -> 0x00bc }
            boolean r9 = r1.e(r3, r0, r9)     // Catch:{ all -> 0x00bc }
            if (r9 == 0) goto L_0x00b2
            java.lang.Object r9 = r8.f5431d     // Catch:{ all -> 0x00bc }
            w1.f r9 = (w1.f) r9     // Catch:{ all -> 0x00bc }
            w1.f.b(r9, r8, r6)     // Catch:{ all -> 0x00bc }
            r8.f5428a = r6     // Catch:{ all -> 0x00bc }
        L_0x00b2:
            boolean r9 = r8.f5428a     // Catch:{ IOException -> 0x00ba }
            if (r9 != 0) goto L_0x0087
            r8.a()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0087
        L_0x00ba:
            r8 = move-exception
            goto L_0x00d2
        L_0x00bc:
            r9 = move-exception
            boolean r0 = r8.f5428a     // Catch:{ IOException -> 0x00ba }
            if (r0 != 0) goto L_0x00c4
            r8.a()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            throw r9     // Catch:{ IOException -> 0x00ba }
        L_0x00c5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00ba }
            java.lang.String r9 = r0.concat(r2)     // Catch:{ IOException -> 0x00ba }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00ba }
            throw r8     // Catch:{ IOException -> 0x00ba }
        L_0x00cf:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x00ba }
            throw r8     // Catch:{ IOException -> 0x00ba }
        L_0x00d2:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x00e3 }
            if (r9 == 0) goto L_0x0087
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch:{ all -> 0x00e3 }
            goto L_0x0087
        L_0x00e3:
            r8 = move-exception
            java.lang.Object r9 = r7.f5444h
            androidx.appcompat.widget.a0 r9 = (androidx.appcompat.widget.a0) r9
            r9.z(r2)
            throw r8
        L_0x00ec:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ec }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.f(y1.f, a2.k):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [long[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(w1.f r1, java.lang.String r2, long r3, java.io.File[] r5, long[] r6) {
        /*
            r0 = this;
            r0.f5441e = r1
            r0.<init>()
            r0.f5442f = r2
            r0.f5440d = r3
            r0.f5444h = r5
            r0.f5443g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e.<init>(w1.f, java.lang.String, long, java.io.File[], long[]):void");
    }
}
