package d5;

import a5.a;
import a5.c;
import b1.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import z4.d;
import z4.e;
import z4.m;
import z4.n;
import z4.t;
import z4.w;

public final class j implements d {

    /* renamed from: d  reason: collision with root package name */
    public final n f2224d;

    /* renamed from: e  reason: collision with root package name */
    public final n f2225e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2226f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f2227g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    public Object f2228h;

    /* renamed from: i  reason: collision with root package name */
    public f f2229i;

    /* renamed from: j  reason: collision with root package name */
    public l f2230j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2231k;

    /* renamed from: l  reason: collision with root package name */
    public e f2232l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2233m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2234n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2235o = true;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f2236p;

    /* renamed from: q  reason: collision with root package name */
    public volatile e f2237q;

    /* renamed from: r  reason: collision with root package name */
    public volatile l f2238r;

    /* renamed from: s  reason: collision with root package name */
    public final w f2239s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.appcompat.widget.w f2240t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2241u;

    public j(w wVar, androidx.appcompat.widget.w wVar2, boolean z5) {
        o.m(wVar, "client");
        o.m(wVar2, "originalRequest");
        this.f2239s = wVar;
        this.f2240t = wVar2;
        this.f2241u = z5;
        this.f2224d = (n) wVar.f6084e.f2505e;
        a aVar = wVar.f6087h;
        aVar.getClass();
        this.f2225e = aVar.f209a;
        i iVar = new i(0, this);
        iVar.g((long) 0, TimeUnit.MILLISECONDS);
        this.f2226f = iVar;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f2236p ? "canceled " : "");
        sb.append(jVar.f2241u ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((t) jVar.f2240t.f820c).f());
        return sb.toString();
    }

    public final void b(l lVar) {
        byte[] bArr = c.f212a;
        if (this.f2230j == null) {
            this.f2230j = lVar;
            lVar.f2256o.add(new h(this, this.f2228h));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        n nVar;
        Socket j6;
        byte[] bArr = c.f212a;
        l lVar = this.f2230j;
        if (lVar != null) {
            synchronized (lVar) {
                j6 = j();
            }
            if (this.f2230j == null) {
                if (j6 != null) {
                    try {
                        j6.close();
                    } catch (AssertionError e6) {
                        throw e6;
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused) {
                    }
                }
                this.f2225e.getClass();
            } else {
                if (!(j6 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f2231k && this.f2226f.i()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            nVar = this.f2225e;
            o.k(iOException2);
        } else {
            nVar = this.f2225e;
        }
        nVar.getClass();
        return iOException2;
    }

    public final Object clone() {
        return new j(this.f2239s, this.f2240t, this.f2241u);
    }

    public final void d() {
        Socket socket;
        if (!this.f2236p) {
            this.f2236p = true;
            e eVar = this.f2237q;
            if (eVar != null) {
                eVar.f2207f.cancel();
            }
            l lVar = this.f2238r;
            if (!(lVar == null || (socket = lVar.f2243b) == null)) {
                c.c(socket);
            }
            this.f2225e.getClass();
        }
    }

    public final void e(e eVar) {
        g gVar;
        if (this.f2227g.compareAndSet(false, true)) {
            h5.n nVar = h5.n.f3500a;
            this.f2228h = h5.n.f3500a.g();
            this.f2225e.getClass();
            m mVar = this.f2239s.f6083d;
            g gVar2 = new g(this, eVar);
            mVar.getClass();
            synchronized (mVar) {
                mVar.f6050b.add(gVar2);
                if (!this.f2241u) {
                    String str = ((t) this.f2240t.f820c).f6074e;
                    Iterator it = mVar.f6051c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = mVar.f6050b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    gVar = null;
                                    break;
                                }
                                gVar = (g) it2.next();
                                if (o.c(((t) gVar.f2220f.f2240t.f820c).f6074e, str)) {
                                    break;
                                }
                            }
                        } else {
                            gVar = (g) it.next();
                            if (o.c(((t) gVar.f2220f.f2240t.f820c).f6074e, str)) {
                                break;
                            }
                        }
                    }
                    if (gVar != null) {
                        gVar2.f2218d = gVar.f2218d;
                    }
                }
            }
            mVar.b();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void f(boolean z5) {
        e eVar;
        synchronized (this) {
            if (!this.f2235o) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z5 && (eVar = this.f2237q) != null) {
            eVar.f2207f.cancel();
            eVar.f2204c.h(eVar, true, true, (IOException) null);
        }
        this.f2232l = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z4.a0 g() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            z4.w r0 = r10.f2239s
            java.util.List r0 = r0.f6085f
            g4.k.X(r0, r2)
            e5.g r0 = new e5.g
            z4.w r1 = r10.f2239s
            r0.<init>(r1)
            r2.add(r0)
            e5.a r0 = new e5.a
            z4.w r1 = r10.f2239s
            androidx.compose.ui.platform.e r1 = r1.f6092m
            r0.<init>(r1)
            r2.add(r0)
            b5.a r0 = new b5.a
            z4.w r1 = r10.f2239s
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            d5.a r0 = d5.a.f2184a
            r2.add(r0)
            boolean r0 = r10.f2241u
            if (r0 != 0) goto L_0x003f
            z4.w r0 = r10.f2239s
            java.util.List r0 = r0.f6086g
            g4.k.X(r0, r2)
        L_0x003f:
            e5.b r0 = new e5.b
            boolean r1 = r10.f2241u
            r0.<init>(r1)
            r2.add(r0)
            e5.f r9 = new e5.f
            r3 = 0
            r4 = 0
            androidx.appcompat.widget.w r5 = r10.f2240t
            z4.w r0 = r10.f2239s
            int r6 = r0.f6103y
            int r7 = r0.f6104z
            int r8 = r0.A
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            androidx.appcompat.widget.w r1 = r10.f2240t     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            z4.a0 r1 = r9.b(r1)     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            boolean r2 = r10.f2236p     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            if (r2 != 0) goto L_0x006b
            r10.i(r0)
            return r1
        L_0x006b:
            a5.c.b(r1)     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
            throw r1     // Catch:{ IOException -> 0x0079, all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            r2 = 0
            goto L_0x008b
        L_0x0079:
            r1 = move-exception
            java.io.IOException r1 = r10.i(r1)     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0088
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r2)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            r2 = 1
        L_0x008b:
            if (r2 != 0) goto L_0x0090
            r10.i(r0)
        L_0x0090:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.g():z4.a0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException h(d5.e r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            b1.o.m(r3, r0)
            d5.e r0 = r2.f2237q
            boolean r3 = b1.o.c(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f2233m     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.f2234n     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f2233m = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f2234n = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f2233m     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f2234n     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f2234n     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f2235o     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.f2237q = r3
            d5.l r3 = r2.f2230j
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f2253l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f2253l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.c(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.h(d5.e, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.f2235o) {
                this.f2235o = false;
                if (!this.f2233m && !this.f2234n) {
                    z5 = true;
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final Socket j() {
        l lVar = this.f2230j;
        o.k(lVar);
        byte[] bArr = c.f212a;
        ArrayList arrayList = lVar.f2256o;
        Iterator it = arrayList.iterator();
        boolean z5 = false;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (o.c((j) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1) {
            arrayList.remove(i3);
            this.f2230j = null;
            if (arrayList.isEmpty()) {
                lVar.f2257p = System.nanoTime();
                n nVar = this.f2224d;
                nVar.getClass();
                byte[] bArr2 = c.f212a;
                boolean z6 = lVar.f2250i;
                c5.c cVar = nVar.f2261b;
                if (z6 || nVar.f2264e == 0) {
                    lVar.f2250i = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = nVar.f2263d;
                    concurrentLinkedQueue.remove(lVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z5 = true;
                } else {
                    cVar.c(nVar.f2262c, 0);
                }
                if (z5) {
                    Socket socket = lVar.f2244c;
                    o.k(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
