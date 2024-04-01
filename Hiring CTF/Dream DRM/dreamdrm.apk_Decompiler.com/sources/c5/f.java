package c5;

import a2.m;
import a5.b;
import a5.c;
import b1.o;
import java.util.ArrayList;
import java.util.logging.Logger;

public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final f f1678h;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f1679i;

    /* renamed from: a  reason: collision with root package name */
    public int f1680a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1681b;

    /* renamed from: c  reason: collision with root package name */
    public long f1682c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1683d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1684e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final e f1685f = new e(this);

    /* renamed from: g  reason: collision with root package name */
    public final d f1686g;

    static {
        String str = c.f218g + " TaskRunner";
        o.m(str, "name");
        f1678h = new f(new d(new b(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        o.l(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f1679i = logger;
    }

    public f(d dVar) {
        this.f1686g = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = c.f212a;
        Thread currentThread = Thread.currentThread();
        o.l(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f1666c);
        try {
            long a6 = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a6);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (fVar) {
                fVar.b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j6) {
        byte[] bArr = c.f212a;
        c cVar = aVar.f1664a;
        o.k(cVar);
        if (cVar.f1671b == aVar) {
            boolean z5 = cVar.f1673d;
            cVar.f1673d = false;
            cVar.f1671b = null;
            this.f1683d.remove(cVar);
            if (j6 != -1 && !z5 && !cVar.f1670a) {
                cVar.d(aVar, j6, true);
            }
            if (!cVar.f1672c.isEmpty()) {
                this.f1684e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:38|39|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        r1.f1681b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c5.a c() {
        /*
            r16 = this;
            r1 = r16
            byte[] r0 = a5.c.f212a
        L_0x0004:
            java.util.ArrayList r0 = r1.f1684e
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            c5.d r2 = r1.f1686g
            r2.getClass()
            long r4 = java.lang.System.nanoTime()
            java.util.Iterator r6 = r0.iterator()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r3
        L_0x0021:
            boolean r10 = r6.hasNext()
            r11 = 0
            r13 = 0
            if (r10 == 0) goto L_0x004e
            java.lang.Object r10 = r6.next()
            c5.c r10 = (c5.c) r10
            java.util.ArrayList r10 = r10.f1672c
            java.lang.Object r10 = r10.get(r11)
            c5.a r10 = (c5.a) r10
            long r11 = r10.f1665b
            long r11 = r11 - r4
            long r11 = java.lang.Math.max(r13, r11)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0048
            long r7 = java.lang.Math.min(r11, r7)
            goto L_0x0021
        L_0x0048:
            if (r9 == 0) goto L_0x004c
            r6 = 1
            goto L_0x004f
        L_0x004c:
            r9 = r10
            goto L_0x0021
        L_0x004e:
            r6 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0086
            byte[] r3 = a5.c.f212a
            r3 = -1
            r9.f1665b = r3
            c5.c r3 = r9.f1664a
            b1.o.k(r3)
            java.util.ArrayList r4 = r3.f1672c
            r4.remove(r9)
            r0.remove(r3)
            r3.f1671b = r9
            java.util.ArrayList r4 = r1.f1683d
            r4.add(r3)
            if (r6 != 0) goto L_0x0079
            boolean r3 = r1.f1681b
            if (r3 != 0) goto L_0x0085
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0085
        L_0x0079:
            java.lang.String r0 = "runnable"
            c5.e r3 = r1.f1685f
            b1.o.m(r3, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f1676a
            r0.execute(r3)
        L_0x0085:
            return r9
        L_0x0086:
            boolean r0 = r1.f1681b
            if (r0 == 0) goto L_0x0095
            long r9 = r1.f1682c
            long r9 = r9 - r4
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            r16.notify()
        L_0x0094:
            return r3
        L_0x0095:
            r0 = 1
            r1.f1681b = r0
            long r4 = r4 + r7
            r1.f1682c = r4
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r7 / r2
            long r2 = r2 * r4
            long r2 = r7 - r2
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00ab
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
        L_0x00ab:
            int r0 = (int) r2     // Catch:{ InterruptedException -> 0x00b3 }
            r1.wait(r4, r0)     // Catch:{ InterruptedException -> 0x00b3 }
            goto L_0x00b6
        L_0x00b0:
            r0 = move-exception
            r2 = 0
            goto L_0x00bb
        L_0x00b3:
            r16.d()     // Catch:{ all -> 0x00b0 }
        L_0x00b6:
            r2 = 0
            r1.f1681b = r2
            goto L_0x0004
        L_0x00bb:
            r1.f1681b = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f.c():c5.a");
    }

    public final void d() {
        ArrayList arrayList = this.f1683d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((c) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.f1684e;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                c cVar = (c) arrayList2.get(size2);
                cVar.b();
                if (cVar.f1672c.isEmpty()) {
                    arrayList2.remove(size2);
                }
            } else {
                return;
            }
        }
    }

    public final void e(c cVar) {
        o.m(cVar, "taskQueue");
        byte[] bArr = c.f212a;
        if (cVar.f1671b == null) {
            boolean z5 = !cVar.f1672c.isEmpty();
            ArrayList arrayList = this.f1684e;
            if (z5) {
                o.m(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z6 = this.f1681b;
        d dVar = this.f1686g;
        dVar.getClass();
        if (z6) {
            notify();
            return;
        }
        e eVar = this.f1685f;
        o.m(eVar, "runnable");
        dVar.f1676a.execute(eVar);
    }

    public final c f() {
        int i3;
        synchronized (this) {
            i3 = this.f1680a;
            this.f1680a = i3 + 1;
        }
        return new c(this, m.g("Q", i3));
    }
}
