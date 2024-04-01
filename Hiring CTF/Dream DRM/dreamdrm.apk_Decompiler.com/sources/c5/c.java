package c5;

import b1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1670a;

    /* renamed from: b  reason: collision with root package name */
    public a f1671b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1672c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1673d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1674e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1675f;

    public c(f fVar, String str) {
        o.m(fVar, "taskRunner");
        o.m(str, "name");
        this.f1674e = fVar;
        this.f1675f = str;
    }

    public final void a() {
        byte[] bArr = a5.c.f212a;
        synchronized (this.f1674e) {
            if (b()) {
                this.f1674e.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1671b;
        if (aVar != null && aVar.f1667d) {
            this.f1673d = true;
        }
        ArrayList arrayList = this.f1672c;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((a) arrayList.get(size)).f1667d) {
                a aVar2 = (a) arrayList.get(size);
                if (f.f1679i.isLoggable(Level.FINE)) {
                    com.bumptech.glide.c.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(c5.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            b1.o.m(r3, r0)
            c5.f r0 = r2.f1674e
            monitor-enter(r0)
            boolean r1 = r2.f1670a     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r3.f1667d     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0023
            c5.f r4 = c5.f.f1678h     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = c5.f.f1679i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            com.bumptech.glide.c.a(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            c5.f r4 = c5.f.f1678h     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = c5.f.f1679i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            com.bumptech.glide.c.a(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x003a:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            c5.f r3 = r2.f1674e     // Catch:{ all -> 0x0048 }
            r3.e(r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.c(c5.a, long):void");
    }

    public final boolean d(a aVar, long j6, boolean z5) {
        String str;
        String str2;
        o.m(aVar, "task");
        c cVar = aVar.f1664a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f1664a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f1674e.f1686g.getClass();
        long nanoTime = System.nanoTime();
        long j7 = nanoTime + j6;
        ArrayList arrayList = this.f1672c;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f1665b <= j7) {
                if (f.f1679i.isLoggable(Level.FINE)) {
                    com.bumptech.glide.c.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f1665b = j7;
        if (f.f1679i.isLoggable(Level.FINE)) {
            long j8 = j7 - nanoTime;
            if (z5) {
                str = com.bumptech.glide.c.n(j8);
                str2 = "run again after ";
            } else {
                str = com.bumptech.glide.c.n(j8);
                str2 = "scheduled after ";
            }
            com.bumptech.glide.c.a(aVar, this, str2.concat(str));
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((a) it.next()).f1665b - nanoTime > j6) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            i3 = arrayList.size();
        }
        arrayList.add(i3, aVar);
        return i3 == 0;
    }

    public final void e() {
        byte[] bArr = a5.c.f212a;
        synchronized (this.f1674e) {
            this.f1670a = true;
            if (b()) {
                this.f1674e.e(this);
            }
        }
    }

    public final String toString() {
        return this.f1675f;
    }
}
