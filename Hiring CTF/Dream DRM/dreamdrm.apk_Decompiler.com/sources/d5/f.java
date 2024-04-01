package d5;

import b1.o;
import e.h;
import g5.b;
import g5.g0;
import java.io.IOException;
import z4.a;
import z4.d0;
import z4.n;
import z4.t;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public h f2208a;

    /* renamed from: b  reason: collision with root package name */
    public p f2209b;

    /* renamed from: c  reason: collision with root package name */
    public int f2210c;

    /* renamed from: d  reason: collision with root package name */
    public int f2211d;

    /* renamed from: e  reason: collision with root package name */
    public int f2212e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f2213f;

    /* renamed from: g  reason: collision with root package name */
    public final n f2214g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2215h;

    /* renamed from: i  reason: collision with root package name */
    public final j f2216i;

    /* renamed from: j  reason: collision with root package name */
    public final n f2217j;

    public f(n nVar, a aVar, j jVar, n nVar2) {
        o.m(nVar, "connectionPool");
        o.m(nVar2, "eventListener");
        this.f2214g = nVar;
        this.f2215h = aVar;
        this.f2216i = jVar;
        this.f2217j = nVar2;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02fd A[SYNTHETIC] */
    public final d5.l a(int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
        L_0x0001:
            d5.j r0 = r1.f2216i
            boolean r0 = r0.f2236p
            if (r0 != 0) goto L_0x0343
            d5.j r0 = r1.f2216i
            d5.l r2 = r0.f2230j
            r0 = 0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0062
            monitor-enter(r2)
            boolean r5 = r2.f2250i     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0024
            z4.d0 r5 = r2.f2258q     // Catch:{ all -> 0x005f }
            z4.a r5 = r5.f5988a     // Catch:{ all -> 0x005f }
            z4.t r5 = r5.f5945a     // Catch:{ all -> 0x005f }
            boolean r5 = r14.b(r5)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r4
            goto L_0x002a
        L_0x0024:
            d5.j r5 = r1.f2216i     // Catch:{ all -> 0x005f }
            java.net.Socket r5 = r5.j()     // Catch:{ all -> 0x005f }
        L_0x002a:
            monitor-exit(r2)
            d5.j r6 = r1.f2216i
            d5.l r6 = r6.f2230j
            if (r6 == 0) goto L_0x0044
            if (r5 != 0) goto L_0x0034
            r0 = r3
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            goto L_0x02c3
        L_0x0038:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0044:
            if (r5 == 0) goto L_0x0052
            byte[] r2 = a5.c.f212a
            r5.close()     // Catch:{ AssertionError -> 0x004f, RuntimeException -> 0x004c, Exception -> 0x0052 }
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x004f:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0052:
            z4.n r2 = r1.f2217j
            d5.j r5 = r1.f2216i
            r2.getClass()
            java.lang.String r2 = "call"
            b1.o.m(r5, r2)
            goto L_0x0062
        L_0x005f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0062:
            r1.f2210c = r0
            r1.f2211d = r0
            r1.f2212e = r0
            d5.n r2 = r1.f2214g
            z4.a r5 = r1.f2215h
            d5.j r6 = r1.f2216i
            boolean r2 = r2.a(r5, r6, r4, r0)
            if (r2 == 0) goto L_0x0076
            goto L_0x0258
        L_0x0076:
            z4.d0 r2 = r1.f2213f
            if (r2 == 0) goto L_0x007d
            r1.f2213f = r4
            goto L_0x0090
        L_0x007d:
            e.h r2 = r1.f2208a
            if (r2 == 0) goto L_0x0093
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0093
            e.h r0 = r1.f2208a
            b1.o.k(r0)
            z4.d0 r2 = r0.d()
        L_0x0090:
            r5 = r4
            goto L_0x0265
        L_0x0093:
            d5.p r2 = r1.f2209b
            if (r2 != 0) goto L_0x00a8
            d5.p r2 = new d5.p
            z4.a r5 = r1.f2215h
            d5.j r6 = r1.f2216i
            z4.w r7 = r6.f2239s
            e2.f r7 = r7.B
            z4.n r8 = r1.f2217j
            r2.<init>(r5, r7, r6, r8)
            r1.f2209b = r2
        L_0x00a8:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x033d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00b3:
            int r6 = r2.f2268b
            java.util.List r7 = r2.f2267a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00bf
            r6 = r3
            goto L_0x00c0
        L_0x00bf:
            r6 = r0
        L_0x00c0:
            if (r6 == 0) goto L_0x022d
            int r6 = r2.f2268b
            java.util.List r7 = r2.f2267a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00ce
            r6 = r3
            goto L_0x00cf
        L_0x00ce:
            r6 = r0
        L_0x00cf:
            java.lang.String r7 = "No route to "
            z4.a r8 = r2.f2271e
            if (r6 == 0) goto L_0x020d
            java.util.List r6 = r2.f2267a
            int r9 = r2.f2268b
            int r10 = r9 + 1
            r2.f2268b = r10
            java.lang.Object r6 = r6.get(r9)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r2.f2269c = r9
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.DIRECT
            if (r10 == r11) goto L_0x0141
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r10 != r11) goto L_0x00fb
            goto L_0x0141
        L_0x00fb:
            java.net.SocketAddress r10 = r6.address()
            boolean r11 = r10 instanceof java.net.InetSocketAddress
            if (r11 == 0) goto L_0x0125
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.lang.String r11 = "$this$socketHost"
            b1.o.m(r10, r11)
            java.net.InetAddress r11 = r10.getAddress()
            if (r11 == 0) goto L_0x0117
            java.lang.String r11 = r11.getHostAddress()
            java.lang.String r12 = "address.hostAddress"
            goto L_0x011d
        L_0x0117:
            java.lang.String r11 = r10.getHostName()
            java.lang.String r12 = "hostName"
        L_0x011d:
            b1.o.l(r11, r12)
            int r10 = r10.getPort()
            goto L_0x0147
        L_0x0125:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Proxy.address() is not an InetSocketAddress: "
            r0.<init>(r2)
            java.lang.Class r2 = r10.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0141:
            z4.t r10 = r8.f5945a
            java.lang.String r11 = r10.f6074e
            int r10 = r10.f6075f
        L_0x0147:
            if (r3 > r10) goto L_0x01ee
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r12 < r10) goto L_0x01ee
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r7 != r12) goto L_0x015e
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r11, r10)
            r9.add(r7)
            goto L_0x0196
        L_0x015e:
            z4.n r7 = r2.f2274h
            r7.getClass()
            z4.d r7 = r2.f2273g
            java.lang.String r12 = "call"
            b1.o.m(r7, r12)
            java.lang.String r7 = "domainName"
            b1.o.m(r11, r7)
            z4.o r7 = r8.f5948d
            z4.n r7 = (z4.n) r7
            java.util.List r7 = r7.d(r11)
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L_0x01d2
            java.util.Iterator r7 = r7.iterator()
        L_0x0181:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0196
            java.lang.Object r8 = r7.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r10)
            r9.add(r11)
            goto L_0x0181
        L_0x0196:
            java.util.List r7 = r2.f2269c
            java.util.Iterator r7 = r7.iterator()
        L_0x019c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ca
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            z4.d0 r9 = new z4.d0
            z4.a r10 = r2.f2271e
            r9.<init>(r10, r6, r8)
            e2.f r8 = r2.f2272f
            monitor-enter(r8)
            java.lang.Object r10 = r8.f2505e     // Catch:{ all -> 0x01c7 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x01c7 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01c3
            java.util.ArrayList r8 = r2.f2270d
            r8.add(r9)
            goto L_0x019c
        L_0x01c3:
            r5.add(r9)
            goto L_0x019c
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01ca:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x00b3
            goto L_0x022d
        L_0x01d2:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            z4.o r3 = r8.f5948d
            r2.append(r3)
            java.lang.String r3 = " returned no addresses for "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01ee:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r11)
            r3 = 58
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x020d:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            z4.t r4 = r8.f5945a
            java.lang.String r4 = r4.f6074e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List r2 = r2.f2267a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x022d:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x023d
            java.util.ArrayList r6 = r2.f2270d
            g4.k.X(r6, r5)
            java.util.ArrayList r2 = r2.f2270d
            r2.clear()
        L_0x023d:
            e.h r2 = new e.h
            r2.<init>((java.util.ArrayList) r5)
            r1.f2208a = r2
            java.util.List r5 = (java.util.List) r5
            d5.j r6 = r1.f2216i
            boolean r6 = r6.f2236p
            if (r6 != 0) goto L_0x0335
            d5.n r6 = r1.f2214g
            z4.a r7 = r1.f2215h
            d5.j r8 = r1.f2216i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x0261
        L_0x0258:
            d5.j r0 = r1.f2216i
            d5.l r0 = r0.f2230j
            b1.o.k(r0)
        L_0x025f:
            r2 = r0
            goto L_0x02b7
        L_0x0261:
            z4.d0 r2 = r2.d()
        L_0x0265:
            d5.l r13 = new d5.l
            d5.n r0 = r1.f2214g
            r13.<init>(r0, r2)
            d5.j r0 = r1.f2216i
            r0.f2238r = r13
            d5.j r11 = r1.f2216i     // Catch:{ all -> 0x032f }
            z4.n r12 = r1.f2217j     // Catch:{ all -> 0x032f }
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r6.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x032f }
            d5.j r0 = r1.f2216i
            r0.f2238r = r4
            d5.j r0 = r1.f2216i
            z4.w r0 = r0.f2239s
            e2.f r4 = r0.B
            z4.d0 r0 = r13.f2258q
            monitor-enter(r4)
            java.lang.String r6 = "route"
            b1.o.m(r0, r6)     // Catch:{ all -> 0x032c }
            java.lang.Object r6 = r4.f2505e     // Catch:{ all -> 0x032c }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x032c }
            r6.remove(r0)     // Catch:{ all -> 0x032c }
            monitor-exit(r4)
            d5.n r0 = r1.f2214g
            z4.a r4 = r1.f2215h
            d5.j r6 = r1.f2216i
            boolean r0 = r0.a(r4, r6, r5, r3)
            if (r0 == 0) goto L_0x02cc
            d5.j r0 = r1.f2216i
            d5.l r0 = r0.f2230j
            b1.o.k(r0)
            r1.f2213f = r2
            java.net.Socket r2 = r13.f2244c
            b1.o.k(r2)
            r2.close()     // Catch:{ AssertionError -> 0x02c9, RuntimeException -> 0x02c6, Exception -> 0x025f }
            goto L_0x025f
        L_0x02b7:
            z4.n r0 = r1.f2217j
            d5.j r4 = r1.f2216i
            r0.getClass()
            java.lang.String r0 = "call"
            b1.o.m(r4, r0)
        L_0x02c3:
            r0 = r19
            goto L_0x02f7
        L_0x02c6:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x02c9:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x02cc:
            monitor-enter(r13)
            d5.n r0 = r1.f2214g     // Catch:{ all -> 0x0329 }
            r0.getClass()     // Catch:{ all -> 0x0329 }
            byte[] r2 = a5.c.f212a     // Catch:{ all -> 0x0329 }
            java.util.concurrent.ConcurrentLinkedQueue r2 = r0.f2263d     // Catch:{ all -> 0x0329 }
            r2.add(r13)     // Catch:{ all -> 0x0329 }
            c5.c r2 = r0.f2261b     // Catch:{ all -> 0x0329 }
            d5.m r0 = r0.f2262c     // Catch:{ all -> 0x0329 }
            r4 = 0
            r2.c(r0, r4)     // Catch:{ all -> 0x0329 }
            d5.j r0 = r1.f2216i     // Catch:{ all -> 0x0329 }
            r0.b(r13)     // Catch:{ all -> 0x0329 }
            monitor-exit(r13)
            z4.n r0 = r1.f2217j
            d5.j r2 = r1.f2216i
            r0.getClass()
            java.lang.String r0 = "call"
            b1.o.m(r2, r0)
            r0 = r19
            r2 = r13
        L_0x02f7:
            boolean r4 = r2.i(r0)
            if (r4 == 0) goto L_0x02fe
            return r2
        L_0x02fe:
            r2.k()
            z4.d0 r2 = r1.f2213f
            if (r2 == 0) goto L_0x0307
            goto L_0x0001
        L_0x0307:
            e.h r2 = r1.f2208a
            if (r2 == 0) goto L_0x0310
            boolean r2 = r2.c()
            goto L_0x0311
        L_0x0310:
            r2 = r3
        L_0x0311:
            if (r2 == 0) goto L_0x0315
            goto L_0x0001
        L_0x0315:
            d5.p r2 = r1.f2209b
            if (r2 == 0) goto L_0x031d
            boolean r3 = r2.a()
        L_0x031d:
            if (r3 == 0) goto L_0x0321
            goto L_0x0001
        L_0x0321:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0329:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x032c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x032f:
            r0 = move-exception
            d5.j r2 = r1.f2216i
            r2.f2238r = r4
            throw r0
        L_0x0335:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x033d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0343:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.f.a(int, int, int, boolean, boolean):d5.l");
    }

    public final boolean b(t tVar) {
        o.m(tVar, "url");
        t tVar2 = this.f2215h.f5945a;
        return tVar.f6075f == tVar2.f6075f && o.c(tVar.f6074e, tVar2.f6074e);
    }

    public final void c(IOException iOException) {
        o.m(iOException, "e");
        this.f2213f = null;
        if ((iOException instanceof g0) && ((g0) iOException).f2979d == b.f2927i) {
            this.f2210c++;
        } else if (iOException instanceof g5.a) {
            this.f2211d++;
        } else {
            this.f2212e++;
        }
    }
}
