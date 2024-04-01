package z4;

import b1.o;
import d5.g;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f6049a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f6050b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f6051c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f6052d = new ArrayDeque();

    public final void a(g gVar) {
        o.m(gVar, "call");
        gVar.f2218d.decrementAndGet();
        ArrayDeque arrayDeque = this.f6051c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void b() {
        /*
            r14 = this;
            byte[] r0 = a5.c.f212a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f6050b     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            b1.o.l(r1, r2)     // Catch:{ all -> 0x00d9 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d9 }
            d5.g r2 = (d5.g) r2     // Catch:{ all -> 0x00d9 }
            java.util.ArrayDeque r3 = r14.f6051c     // Catch:{ all -> 0x00d9 }
            int r3 = r3.size()     // Catch:{ all -> 0x00d9 }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f2218d     // Catch:{ all -> 0x00d9 }
            int r3 = r3.get()     // Catch:{ all -> 0x00d9 }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00d9 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f2218d     // Catch:{ all -> 0x00d9 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00d9 }
            r0.add(r2)     // Catch:{ all -> 0x00d9 }
            java.util.ArrayDeque r3 = r14.f6051c     // Catch:{ all -> 0x00d9 }
            r3.add(r2)     // Catch:{ all -> 0x00d9 }
            goto L_0x0013
        L_0x0045:
            monitor-enter(r14)     // Catch:{ all -> 0x00d9 }
            java.util.ArrayDeque r1 = r14.f6051c     // Catch:{ all -> 0x00d6 }
            r1.size()     // Catch:{ all -> 0x00d6 }
            java.util.ArrayDeque r1 = r14.f6052d     // Catch:{ all -> 0x00d6 }
            r1.size()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r14)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r14)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L_0x0058:
            if (r3 >= r1) goto L_0x00d5
            java.lang.Object r4 = r0.get(r3)
            d5.g r4 = (d5.g) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6049a     // Catch:{ all -> 0x00d2 }
            if (r5 != 0) goto L_0x0097
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00d2 }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00d2 }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00d2 }
            r12.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r6.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = a5.c.f218g     // Catch:{ all -> 0x00d2 }
            r6.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = " Dispatcher"
            r6.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = "name"
            b1.o.m(r6, r13)     // Catch:{ all -> 0x00d2 }
            a5.b r13 = new a5.b     // Catch:{ all -> 0x00d2 }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00d2 }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00d2 }
            r14.f6049a = r5     // Catch:{ all -> 0x00d2 }
        L_0x0097:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f6049a     // Catch:{ all -> 0x00d2 }
            b1.o.k(r5)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r14)
            r4.getClass()
            d5.j r6 = r4.f2220f
            z4.w r7 = r6.f2239s
            z4.m r7 = r7.f6083d
            byte[] r7 = a5.c.f212a
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00ac }
            goto L_0x00c6
        L_0x00ac:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00c9 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00c9 }
            r7.initCause(r5)     // Catch:{ all -> 0x00c9 }
            r6.i(r7)     // Catch:{ all -> 0x00c9 }
            z4.e r5 = r4.f2219e     // Catch:{ all -> 0x00c9 }
            r5.a(r6, r7)     // Catch:{ all -> 0x00c9 }
            z4.w r5 = r6.f2239s
            z4.m r5 = r5.f6083d
            r5.a(r4)
        L_0x00c6:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x00c9:
            r0 = move-exception
            z4.w r1 = r6.f2239s
            z4.m r1 = r1.f6083d
            r1.a(r4)
            throw r0
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00d5:
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.m.b():void");
    }
}
