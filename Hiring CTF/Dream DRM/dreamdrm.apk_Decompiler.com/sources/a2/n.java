package a2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.a0;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.e;
import h2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import s2.b;
import s2.d;
import w0.c;
import y1.a;
import y1.f;
import y1.i;

public final class n implements g, Runnable, Comparable, b {
    public Object A;
    public a B;
    public e C;
    public volatile h D;
    public volatile boolean E;
    public volatile boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: d  reason: collision with root package name */
    public final i f103d = new i();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f104e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final d f105f = new d();

    /* renamed from: g  reason: collision with root package name */
    public final b.a f106g;

    /* renamed from: h  reason: collision with root package name */
    public final c f107h;

    /* renamed from: i  reason: collision with root package name */
    public final k f108i = new k();

    /* renamed from: j  reason: collision with root package name */
    public final l f109j = new l();

    /* renamed from: k  reason: collision with root package name */
    public g f110k;

    /* renamed from: l  reason: collision with root package name */
    public f f111l;

    /* renamed from: m  reason: collision with root package name */
    public h f112m;

    /* renamed from: n  reason: collision with root package name */
    public x f113n;

    /* renamed from: o  reason: collision with root package name */
    public int f114o;

    /* renamed from: p  reason: collision with root package name */
    public int f115p;

    /* renamed from: q  reason: collision with root package name */
    public q f116q;

    /* renamed from: r  reason: collision with root package name */
    public i f117r;

    /* renamed from: s  reason: collision with root package name */
    public j f118s;

    /* renamed from: t  reason: collision with root package name */
    public int f119t;

    /* renamed from: u  reason: collision with root package name */
    public long f120u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f121v;
    public Object w;

    /* renamed from: x  reason: collision with root package name */
    public Thread f122x;

    /* renamed from: y  reason: collision with root package name */
    public f f123y;

    /* renamed from: z  reason: collision with root package name */
    public f f124z;

    public n(b.a aVar, c cVar) {
        this.f106g = aVar;
        this.f107h = cVar;
    }

    public final d a() {
        return this.f105f;
    }

    public final void b() {
        this.I = 2;
        v vVar = (v) this.f118s;
        (vVar.f161q ? vVar.f156l : vVar.f162r ? vVar.f157m : vVar.f155k).execute(this);
    }

    public final void c(f fVar, Exception exc, e eVar, a aVar) {
        eVar.b();
        b0 b0Var = new b0("Fetching data failed", Collections.singletonList(exc));
        Class a6 = eVar.a();
        b0Var.f23e = fVar;
        b0Var.f24f = aVar;
        b0Var.f25g = a6;
        this.f104e.add(b0Var);
        if (Thread.currentThread() != this.f122x) {
            this.I = 2;
            v vVar = (v) this.f118s;
            (vVar.f161q ? vVar.f156l : vVar.f162r ? vVar.f157m : vVar.f155k).execute(this);
            return;
        }
        m();
    }

    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int ordinal = this.f112m.ordinal() - nVar.f112m.ordinal();
        return ordinal == 0 ? this.f119t - nVar.f119t : ordinal;
    }

    public final void d(f fVar, Object obj, e eVar, a aVar, f fVar2) {
        this.f123y = fVar;
        this.A = obj;
        this.C = eVar;
        this.B = aVar;
        this.f124z = fVar2;
        boolean z5 = false;
        if (fVar != this.f103d.a().get(0)) {
            z5 = true;
        }
        this.G = z5;
        if (Thread.currentThread() != this.f122x) {
            this.I = 3;
            v vVar = (v) this.f118s;
            (vVar.f161q ? vVar.f156l : vVar.f162r ? vVar.f157m : vVar.f155k).execute(this);
            return;
        }
        g();
    }

    public final f0 e(e eVar, Object obj, a aVar) {
        if (obj == null) {
            eVar.b();
            return null;
        }
        try {
            int i3 = r2.f.f4927b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            f0 f6 = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f6, elapsedRealtimeNanos, (String) null);
            }
            return f6;
        } finally {
            eVar.b();
        }
    }

    public final f0 f(Object obj, a aVar) {
        com.bumptech.glide.load.data.g b6;
        d0 c6 = this.f103d.c(obj.getClass());
        i iVar = this.f117r;
        boolean z5 = aVar == a.f5803g || this.f103d.f86r;
        y1.h hVar = p.f3420i;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool == null || (bool.booleanValue() && !z5)) {
            iVar = new i();
            iVar.f5816b.i(this.f117r.f5816b);
            iVar.f5816b.put(hVar, Boolean.valueOf(z5));
        }
        i iVar2 = iVar;
        com.bumptech.glide.load.data.i iVar3 = this.f110k.f1726b.f1744e;
        synchronized (iVar3) {
            com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) iVar3.f1765a.get(obj.getClass());
            if (fVar == null) {
                Iterator it = iVar3.f1765a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                    if (fVar2.a().isAssignableFrom(obj.getClass())) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
            if (fVar == null) {
                fVar = com.bumptech.glide.load.data.i.f1764b;
            }
            b6 = fVar.b(obj);
        }
        try {
            return c6.a(this.f114o, this.f115p, new a0((Object) this, (Object) aVar, 10), iVar2, b6);
        } finally {
            b6.b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: a2.e0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: a2.e0} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Class] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r13 = this;
            java.lang.String r0 = "DecodeJob"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "Retrieved data"
            long r1 = r13.f120u
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "data: "
            r3.<init>(r4)
            java.lang.Object r4 = r13.A
            r3.append(r4)
            java.lang.String r4 = ", cache key: "
            r3.append(r4)
            y1.f r4 = r13.f123y
            r3.append(r4)
            java.lang.String r4 = ", fetcher: "
            r3.append(r4)
            com.bumptech.glide.load.data.e r4 = r13.C
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r13.j(r0, r1, r3)
        L_0x0034:
            r0 = 0
            com.bumptech.glide.load.data.e r1 = r13.C     // Catch:{ b0 -> 0x0040 }
            java.lang.Object r2 = r13.A     // Catch:{ b0 -> 0x0040 }
            y1.a r3 = r13.B     // Catch:{ b0 -> 0x0040 }
            a2.f0 r1 = r13.e(r1, r2, r3)     // Catch:{ b0 -> 0x0040 }
            goto L_0x0051
        L_0x0040:
            r1 = move-exception
            y1.f r2 = r13.f124z
            y1.a r3 = r13.B
            r1.f23e = r2
            r1.f24f = r3
            r1.f25g = r0
            java.util.ArrayList r2 = r13.f104e
            r2.add(r1)
            r1 = r0
        L_0x0051:
            if (r1 == 0) goto L_0x0180
            y1.a r2 = r13.B
            boolean r3 = r13.G
            boolean r4 = r1 instanceof a2.c0
            if (r4 == 0) goto L_0x0061
            r4 = r1
            a2.c0 r4 = (a2.c0) r4
            r4.a()
        L_0x0061:
            a2.k r4 = r13.f108i
            java.lang.Object r4 = r4.f92c
            a2.e0 r4 = (a2.e0) r4
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x006d
            r4 = r6
            goto L_0x006e
        L_0x006d:
            r4 = r5
        L_0x006e:
            if (r4 == 0) goto L_0x0082
            androidx.activity.result.c r0 = a2.e0.f43h
            java.lang.Object r0 = r0.b()
            a2.e0 r0 = (a2.e0) r0
            b1.o.i(r0)
            r0.f47g = r5
            r0.f46f = r6
            r0.f45e = r1
            r1 = r0
        L_0x0082:
            r13.o()
            a2.j r4 = r13.f118s
            a2.v r4 = (a2.v) r4
            monitor-enter(r4)
            r4.f164t = r1     // Catch:{ all -> 0x017d }
            r4.f165u = r2     // Catch:{ all -> 0x017d }
            r4.B = r3     // Catch:{ all -> 0x017d }
            monitor-exit(r4)     // Catch:{ all -> 0x017d }
            monitor-enter(r4)
            s2.d r1 = r4.f149e     // Catch:{ all -> 0x017a }
            r1.a()     // Catch:{ all -> 0x017a }
            boolean r1 = r4.A     // Catch:{ all -> 0x017a }
            if (r1 == 0) goto L_0x00a6
            a2.f0 r1 = r4.f164t     // Catch:{ all -> 0x017a }
            r1.d()     // Catch:{ all -> 0x017a }
            r4.g()     // Catch:{ all -> 0x017a }
            monitor-exit(r4)     // Catch:{ all -> 0x017a }
            goto L_0x0133
        L_0x00a6:
            a2.u r1 = r4.f148d     // Catch:{ all -> 0x017a }
            java.util.List r1 = r1.f147d     // Catch:{ all -> 0x017a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x017a }
            if (r1 != 0) goto L_0x0172
            boolean r1 = r4.f166v     // Catch:{ all -> 0x017a }
            if (r1 != 0) goto L_0x016a
            androidx.fragment.app.n0 r1 = r4.f152h     // Catch:{ all -> 0x017a }
            a2.f0 r8 = r4.f164t     // Catch:{ all -> 0x017a }
            boolean r9 = r4.f160p     // Catch:{ all -> 0x017a }
            y1.f r11 = r4.f159o     // Catch:{ all -> 0x017a }
            a2.y r12 = r4.f150f     // Catch:{ all -> 0x017a }
            r1.getClass()     // Catch:{ all -> 0x017a }
            a2.z r1 = new a2.z     // Catch:{ all -> 0x017a }
            r10 = 1
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x017a }
            r4.f168y = r1     // Catch:{ all -> 0x017a }
            r4.f166v = r6     // Catch:{ all -> 0x017a }
            a2.u r1 = r4.f148d     // Catch:{ all -> 0x017a }
            r1.getClass()     // Catch:{ all -> 0x017a }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x017a }
            java.util.List r1 = r1.f147d     // Catch:{ all -> 0x017a }
            r2.<init>(r1)     // Catch:{ all -> 0x017a }
            int r1 = r2.size()     // Catch:{ all -> 0x017a }
            int r1 = r1 + r6
            r4.e(r1)     // Catch:{ all -> 0x017a }
            y1.f r1 = r4.f159o     // Catch:{ all -> 0x017a }
            a2.z r3 = r4.f168y     // Catch:{ all -> 0x017a }
            monitor-exit(r4)     // Catch:{ all -> 0x017a }
            a2.w r7 = r4.f153i
            a2.r r7 = (a2.r) r7
            monitor-enter(r7)
            if (r3 == 0) goto L_0x00f5
            boolean r8 = r3.f179d     // Catch:{ all -> 0x0167 }
            if (r8 == 0) goto L_0x00f5
            a2.c r8 = r7.f141g     // Catch:{ all -> 0x0167 }
            r8.a(r1, r3)     // Catch:{ all -> 0x0167 }
        L_0x00f5:
            androidx.appcompat.widget.a0 r3 = r7.f135a     // Catch:{ all -> 0x0167 }
            r3.getClass()     // Catch:{ all -> 0x0167 }
            boolean r8 = r4.f163s     // Catch:{ all -> 0x0167 }
            if (r8 == 0) goto L_0x0101
            java.lang.Object r3 = r3.f504f     // Catch:{ all -> 0x0167 }
            goto L_0x0103
        L_0x0101:
            java.lang.Object r3 = r3.f503e     // Catch:{ all -> 0x0167 }
        L_0x0103:
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0167 }
            java.lang.Object r8 = r3.get(r1)     // Catch:{ all -> 0x0167 }
            boolean r8 = r4.equals(r8)     // Catch:{ all -> 0x0167 }
            if (r8 == 0) goto L_0x0112
            r3.remove(r1)     // Catch:{ all -> 0x0167 }
        L_0x0112:
            monitor-exit(r7)
            java.util.Iterator r1 = r2.iterator()
        L_0x0117:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0130
            java.lang.Object r2 = r1.next()
            a2.t r2 = (a2.t) r2
            java.util.concurrent.Executor r3 = r2.f146b
            a2.s r7 = new a2.s
            n2.f r2 = r2.f145a
            r7.<init>(r4, r2, r6)
            r3.execute(r7)
            goto L_0x0117
        L_0x0130:
            r4.d()
        L_0x0133:
            r1 = 5
            r13.H = r1
            a2.k r1 = r13.f108i     // Catch:{ all -> 0x0160 }
            java.lang.Object r2 = r1.f92c     // Catch:{ all -> 0x0160 }
            a2.e0 r2 = (a2.e0) r2     // Catch:{ all -> 0x0160 }
            if (r2 == 0) goto L_0x013f
            r5 = r6
        L_0x013f:
            if (r5 == 0) goto L_0x0148
            b.a r2 = r13.f106g     // Catch:{ all -> 0x0160 }
            y1.i r3 = r13.f117r     // Catch:{ all -> 0x0160 }
            r1.a(r2, r3)     // Catch:{ all -> 0x0160 }
        L_0x0148:
            if (r0 == 0) goto L_0x014d
            r0.e()
        L_0x014d:
            a2.l r0 = r13.f109j
            monitor-enter(r0)
            r0.f101b = r6     // Catch:{ all -> 0x015d }
            boolean r1 = r0.a()     // Catch:{ all -> 0x015d }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0183
            r13.l()
            goto L_0x0183
        L_0x015d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0160:
            r1 = move-exception
            if (r0 == 0) goto L_0x0166
            r0.e()
        L_0x0166:
            throw r1
        L_0x0167:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017a }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017a }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017a }
            throw r0
        L_0x017d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            r13.m()
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.n.g():void");
    }

    public final h h() {
        int b6 = y.d.b(this.H);
        i iVar = this.f103d;
        if (b6 == 1) {
            return new g0(iVar, this);
        }
        if (b6 == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (b6 == 3) {
            return new k0(iVar, this);
        }
        if (b6 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(m.t(this.H)));
    }

    public final int i(int i3) {
        if (i3 != 0) {
            int i6 = i3 - 1;
            boolean z5 = false;
            if (i6 == 0) {
                switch (((p) this.f116q).f130d) {
                    case 1:
                    case 2:
                        break;
                    default:
                        z5 = true;
                        break;
                }
                if (z5) {
                    return 2;
                }
                return i(2);
            } else if (i6 == 1) {
                switch (((p) this.f116q).f130d) {
                    case 1:
                        break;
                    default:
                        z5 = true;
                        break;
                }
                if (z5) {
                    return 3;
                }
                return i(3);
            } else if (i6 == 2) {
                return this.f121v ? 6 : 4;
            } else {
                if (i6 == 3 || i6 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Unrecognized stage: ".concat(m.t(i3)));
            }
        } else {
            throw null;
        }
    }

    public final void j(String str, long j6, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(r2.f.a(j6));
        sb.append(", load key: ");
        sb.append(this.f113n);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void k() {
        boolean a6;
        o();
        b0 b0Var = new b0("Failed to load resource", new ArrayList(this.f104e));
        v vVar = (v) this.f118s;
        synchronized (vVar) {
            vVar.w = b0Var;
        }
        synchronized (vVar) {
            vVar.f149e.a();
            if (vVar.A) {
                vVar.g();
            } else if (vVar.f148d.f147d.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!vVar.f167x) {
                vVar.f167x = true;
                f fVar = vVar.f159o;
                u uVar = vVar.f148d;
                uVar.getClass();
                ArrayList<t> arrayList = new ArrayList<>(uVar.f147d);
                vVar.e(arrayList.size() + 1);
                r rVar = (r) vVar.f153i;
                synchronized (rVar) {
                    a0 a0Var = rVar.f135a;
                    a0Var.getClass();
                    Map map = (Map) (vVar.f163s ? a0Var.f504f : a0Var.f503e);
                    if (vVar.equals(map.get(fVar))) {
                        map.remove(fVar);
                    }
                }
                for (t tVar : arrayList) {
                    tVar.f146b.execute(new s(vVar, tVar.f145a, 0));
                }
                vVar.d();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        l lVar = this.f109j;
        synchronized (lVar) {
            lVar.f102c = true;
            a6 = lVar.a();
        }
        if (a6) {
            l();
        }
    }

    public final void l() {
        l lVar = this.f109j;
        synchronized (lVar) {
            lVar.f101b = false;
            lVar.f100a = false;
            lVar.f102c = false;
        }
        k kVar = this.f108i;
        kVar.f90a = null;
        kVar.f91b = null;
        kVar.f92c = null;
        i iVar = this.f103d;
        iVar.f71c = null;
        iVar.f72d = null;
        iVar.f82n = null;
        iVar.f75g = null;
        iVar.f79k = null;
        iVar.f77i = null;
        iVar.f83o = null;
        iVar.f78j = null;
        iVar.f84p = null;
        iVar.f69a.clear();
        iVar.f80l = false;
        iVar.f70b.clear();
        iVar.f81m = false;
        this.E = false;
        this.f110k = null;
        this.f111l = null;
        this.f117r = null;
        this.f112m = null;
        this.f113n = null;
        this.f118s = null;
        this.H = 0;
        this.D = null;
        this.f122x = null;
        this.f123y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f120u = 0;
        this.F = false;
        this.w = null;
        this.f104e.clear();
        this.f107h.a(this);
    }

    public final void m() {
        this.f122x = Thread.currentThread();
        int i3 = r2.f.f4927b;
        this.f120u = SystemClock.elapsedRealtimeNanos();
        boolean z5 = false;
        while (!this.F && this.D != null && !(z5 = this.D.a())) {
            this.H = i(this.H);
            this.D = h();
            if (this.H == 4) {
                b();
                return;
            }
        }
        if ((this.H == 6 || this.F) && !z5) {
            k();
        }
    }

    public final void n() {
        int b6 = y.d.b(this.I);
        if (b6 == 0) {
            this.H = i(1);
            this.D = h();
        } else if (b6 != 1) {
            if (b6 == 2) {
                g();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(m.s(this.I)));
        }
        m();
    }

    public final void o() {
        Throwable th;
        this.f105f.a();
        if (this.E) {
            if (this.f104e.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f104e;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.E = true;
    }

    public final void run() {
        e eVar = this.C;
        try {
            if (this.F) {
                k();
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            }
            n();
            if (eVar != null) {
                eVar.b();
            }
        } catch (d e6) {
            throw e6;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.b();
            }
            throw th;
        }
    }
}
