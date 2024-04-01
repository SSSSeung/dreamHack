package n2;

import a2.b0;
import a2.f0;
import a2.k;
import a2.m;
import a2.r;
import a2.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.h;
import e.m0;
import e2.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o2.d;
import o2.e;
import r2.f;
import r2.l;
import w4.p;
import y1.a;

public final class g implements c, d, f {
    public static final boolean C = Log.isLoggable("Request", 2);
    public final RuntimeException A;
    public int B;

    /* renamed from: a  reason: collision with root package name */
    public final String f4291a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.d f4292b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4293c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4294d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f4295e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bumptech.glide.g f4296f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4297g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f4298h;

    /* renamed from: i  reason: collision with root package name */
    public final a f4299i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4300j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4301k;

    /* renamed from: l  reason: collision with root package name */
    public final h f4302l;

    /* renamed from: m  reason: collision with root package name */
    public final e f4303m;

    /* renamed from: n  reason: collision with root package name */
    public final List f4304n;

    /* renamed from: o  reason: collision with root package name */
    public final d0 f4305o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f4306p;

    /* renamed from: q  reason: collision with root package name */
    public f0 f4307q;

    /* renamed from: r  reason: collision with root package name */
    public k f4308r;

    /* renamed from: s  reason: collision with root package name */
    public long f4309s;

    /* renamed from: t  reason: collision with root package name */
    public volatile r f4310t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f4311u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f4312v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public int f4313x;

    /* renamed from: y  reason: collision with root package name */
    public int f4314y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4315z;

    public g(Context context, com.bumptech.glide.g gVar, Object obj, Object obj2, Class cls, a aVar, int i3, int i6, h hVar, e eVar, ArrayList arrayList, d dVar, r rVar) {
        com.bumptech.glide.g gVar2 = gVar;
        d0 d0Var = androidx.compose.ui.platform.e.f894k;
        m0 m0Var = com.bumptech.glide.d.f1703d;
        this.f4291a = C ? String.valueOf(hashCode()) : null;
        this.f4292b = new s2.d();
        this.f4293c = obj;
        this.f4295e = context;
        this.f4296f = gVar2;
        this.f4297g = obj2;
        this.f4298h = cls;
        this.f4299i = aVar;
        this.f4300j = i3;
        this.f4301k = i6;
        this.f4302l = hVar;
        this.f4303m = eVar;
        this.f4304n = arrayList;
        this.f4294d = dVar;
        this.f4310t = rVar;
        this.f4305o = d0Var;
        this.f4306p = m0Var;
        this.B = 1;
        if (this.A == null && gVar2.f1732h.f1392a.containsKey(com.bumptech.glide.d.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z5;
        synchronized (this.f4293c) {
            z5 = this.B == 4;
        }
        return z5;
    }

    public final void b() {
        if (!this.f4315z) {
            this.f4292b.a();
            this.f4303m.a(this);
            k kVar = this.f4308r;
            if (kVar != null) {
                synchronized (((r) kVar.f92c)) {
                    ((v) kVar.f90a).h((f) kVar.f91b);
                }
                this.f4308r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable c() {
        int i3;
        if (this.f4312v == null) {
            a aVar = this.f4299i;
            Drawable drawable = aVar.f4269j;
            this.f4312v = drawable;
            if (drawable == null && (i3 = aVar.f4270k) > 0) {
                this.f4312v = f(i3);
            }
        }
        return this.f4312v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f4310t.getClass();
        a2.r.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4293c
            monitor-enter(r0)
            boolean r1 = r5.f4315z     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0046
            s2.d r1 = r5.f4292b     // Catch:{ all -> 0x004e }
            r1.a()     // Catch:{ all -> 0x004e }
            int r1 = r5.B     // Catch:{ all -> 0x004e }
            r2 = 6
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0013:
            r5.b()     // Catch:{ all -> 0x004e }
            a2.f0 r1 = r5.f4307q     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f4307q = r3     // Catch:{ all -> 0x004e }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            n2.d r3 = r5.f4294d     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.k(r5)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            o2.e r3 = r5.f4303m     // Catch:{ all -> 0x004e }
            android.graphics.drawable.Drawable r4 = r5.c()     // Catch:{ all -> 0x004e }
            r3.h(r4)     // Catch:{ all -> 0x004e }
        L_0x0038:
            r5.B = r2     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0045
            a2.r r0 = r5.f4310t
            r0.getClass()
            a2.r.e(r1)
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.clear():void");
    }

    public final void d() {
        synchronized (this.f4293c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r7 = this;
            java.lang.String r0 = "finished run method in "
            java.lang.Object r1 = r7.f4293c
            monitor-enter(r1)
            boolean r2 = r7.f4315z     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x00c0
            s2.d r2 = r7.f4292b     // Catch:{ all -> 0x00be }
            r2.a()     // Catch:{ all -> 0x00be }
            int r2 = r2.f.f4927b     // Catch:{ all -> 0x00be }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00be }
            r7.f4309s = r2     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r7.f4297g     // Catch:{ all -> 0x00be }
            r3 = 3
            if (r2 != 0) goto L_0x0054
            int r0 = r7.f4300j     // Catch:{ all -> 0x00be }
            int r2 = r7.f4301k     // Catch:{ all -> 0x00be }
            boolean r0 = r2.l.g(r0, r2)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x002d
            int r0 = r7.f4300j     // Catch:{ all -> 0x00be }
            r7.f4313x = r0     // Catch:{ all -> 0x00be }
            int r0 = r7.f4301k     // Catch:{ all -> 0x00be }
            r7.f4314y = r0     // Catch:{ all -> 0x00be }
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r7.w     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x0043
            n2.a r0 = r7.f4299i     // Catch:{ all -> 0x00be }
            android.graphics.drawable.Drawable r2 = r0.f4277r     // Catch:{ all -> 0x00be }
            r7.w = r2     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x0043
            int r0 = r0.f4278s     // Catch:{ all -> 0x00be }
            if (r0 <= 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r7.f(r0)     // Catch:{ all -> 0x00be }
            r7.w = r0     // Catch:{ all -> 0x00be }
        L_0x0043:
            android.graphics.drawable.Drawable r0 = r7.w     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x0048
            r3 = 5
        L_0x0048:
            a2.b0 r0 = new a2.b0     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Received null model"
            r0.<init>(r2)     // Catch:{ all -> 0x00be }
            r7.k(r0, r3)     // Catch:{ all -> 0x00be }
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            return
        L_0x0054:
            int r2 = r7.B     // Catch:{ all -> 0x00be }
            r4 = 2
            if (r2 == r4) goto L_0x00b6
            r5 = 0
            r6 = 4
            if (r2 != r6) goto L_0x0066
            a2.f0 r0 = r7.f4307q     // Catch:{ all -> 0x00be }
            y1.a r2 = y1.a.f5804h     // Catch:{ all -> 0x00be }
            r7.m(r0, r2, r5)     // Catch:{ all -> 0x00be }
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            return
        L_0x0066:
            r7.B = r3     // Catch:{ all -> 0x00be }
            int r2 = r7.f4300j     // Catch:{ all -> 0x00be }
            int r6 = r7.f4301k     // Catch:{ all -> 0x00be }
            boolean r2 = r2.l.g(r2, r6)     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x007a
            int r2 = r7.f4300j     // Catch:{ all -> 0x00be }
            int r6 = r7.f4301k     // Catch:{ all -> 0x00be }
            r7.n(r2, r6)     // Catch:{ all -> 0x00be }
            goto L_0x007f
        L_0x007a:
            o2.e r2 = r7.f4303m     // Catch:{ all -> 0x00be }
            r2.g(r7)     // Catch:{ all -> 0x00be }
        L_0x007f:
            int r2 = r7.B     // Catch:{ all -> 0x00be }
            if (r2 == r4) goto L_0x0085
            if (r2 != r3) goto L_0x009b
        L_0x0085:
            n2.d r2 = r7.f4294d     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x008f
            boolean r2 = r2.g(r7)     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x009b
            o2.e r2 = r7.f4303m     // Catch:{ all -> 0x00be }
            android.graphics.drawable.Drawable r3 = r7.c()     // Catch:{ all -> 0x00be }
            r2.b(r3)     // Catch:{ all -> 0x00be }
        L_0x009b:
            boolean r2 = C     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x00b4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r2.<init>(r0)     // Catch:{ all -> 0x00be }
            long r3 = r7.f4309s     // Catch:{ all -> 0x00be }
            double r3 = r2.f.a(r3)     // Catch:{ all -> 0x00be }
            r2.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00be }
            r7.g(r0)     // Catch:{ all -> 0x00be }
        L_0x00b4:
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            return
        L_0x00b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Cannot restart a running request"
            r0.<init>(r2)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            goto L_0x00c8
        L_0x00c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r2)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00c8:
            monitor-exit(r1)     // Catch:{ all -> 0x00be }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.e():void");
    }

    public final Drawable f(int i3) {
        Resources.Theme theme = this.f4299i.f4282x;
        if (theme == null) {
            theme = this.f4295e.getTheme();
        }
        com.bumptech.glide.g gVar = this.f4296f;
        return p.o(gVar, gVar, i3, theme);
    }

    public final void g(String str) {
        Log.v("Request", str + " this: " + this.f4291a);
    }

    public final boolean h() {
        boolean z5;
        synchronized (this.f4293c) {
            z5 = this.B == 4;
        }
        return z5;
    }

    public final boolean i() {
        boolean z5;
        synchronized (this.f4293c) {
            z5 = this.B == 6;
        }
        return z5;
    }

    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f4293c) {
            int i3 = this.B;
            if (i3 != 2) {
                if (i3 != 3) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        return z5;
    }

    public final boolean j(c cVar) {
        int i3;
        int i6;
        Object obj;
        Class cls;
        a aVar;
        h hVar;
        int size;
        int i7;
        int i8;
        Object obj2;
        Class cls2;
        a aVar2;
        h hVar2;
        int size2;
        c cVar2 = cVar;
        if (!(cVar2 instanceof g)) {
            return false;
        }
        synchronized (this.f4293c) {
            i3 = this.f4300j;
            i6 = this.f4301k;
            obj = this.f4297g;
            cls = this.f4298h;
            aVar = this.f4299i;
            hVar = this.f4302l;
            List list = this.f4304n;
            size = list != null ? list.size() : 0;
        }
        g gVar = (g) cVar2;
        synchronized (gVar.f4293c) {
            i7 = gVar.f4300j;
            i8 = gVar.f4301k;
            obj2 = gVar.f4297g;
            cls2 = gVar.f4298h;
            aVar2 = gVar.f4299i;
            hVar2 = gVar.f4302l;
            List list2 = gVar.f4304n;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i3 == i7 && i6 == i8) {
            char[] cArr = l.f4938a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final void k(b0 b0Var, int i3) {
        int i6;
        int i7;
        this.f4292b.a();
        synchronized (this.f4293c) {
            b0Var.getClass();
            int i8 = this.f4296f.f1733i;
            if (i8 <= i3) {
                Log.w("Glide", "Load failed for " + this.f4297g + " with size [" + this.f4313x + "x" + this.f4314y + "]", b0Var);
                if (i8 <= 4) {
                    b0Var.e();
                }
            }
            Drawable drawable = null;
            this.f4308r = null;
            this.B = 5;
            boolean z5 = true;
            this.f4315z = true;
            try {
                List list = this.f4304n;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        m.o(it.next());
                        d dVar = this.f4294d;
                        if (dVar != null) {
                            dVar.b().a();
                        }
                        throw null;
                    }
                }
                d dVar2 = this.f4294d;
                if (dVar2 != null) {
                    if (!dVar2.g(this)) {
                        z5 = false;
                    }
                }
                if (z5) {
                    if (this.f4297g == null) {
                        if (this.w == null) {
                            a aVar = this.f4299i;
                            Drawable drawable2 = aVar.f4277r;
                            this.w = drawable2;
                            if (drawable2 == null && (i7 = aVar.f4278s) > 0) {
                                this.w = f(i7);
                            }
                        }
                        drawable = this.w;
                    }
                    if (drawable == null) {
                        if (this.f4311u == null) {
                            a aVar2 = this.f4299i;
                            Drawable drawable3 = aVar2.f4267h;
                            this.f4311u = drawable3;
                            if (drawable3 == null && (i6 = aVar2.f4268i) > 0) {
                                this.f4311u = f(i6);
                            }
                        }
                        drawable = this.f4311u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f4303m.d(drawable);
                }
                this.f4315z = false;
                d dVar3 = this.f4294d;
                if (dVar3 != null) {
                    dVar3.l(this);
                }
            } catch (Throwable th) {
                this.f4315z = false;
                throw th;
            }
        }
    }

    public final void l(f0 f0Var, Object obj, a aVar) {
        d dVar = this.f4294d;
        if (dVar != null) {
            dVar.b().a();
        }
        this.B = 4;
        this.f4307q = f0Var;
        if (this.f4296f.f1733i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f4297g + " with size [" + this.f4313x + "x" + this.f4314y + "] in " + f.a(this.f4309s) + " ms");
        }
        this.f4315z = true;
        try {
            List list = this.f4304n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    m.o(it.next());
                    throw null;
                }
            }
            this.f4305o.getClass();
            this.f4303m.i(obj);
            if (dVar != null) {
                dVar.f(this);
            }
        } finally {
            this.f4315z = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r7.f4310t.getClass();
        a2.r.e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(a2.f0 r8, y1.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "Expected to receive an object of "
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            s2.d r1 = r7.f4292b
            r1.a()
            r1 = 0
            java.lang.Object r2 = r7.f4293c     // Catch:{ all -> 0x00c1 }
            monitor-enter(r2)     // Catch:{ all -> 0x00c1 }
            r7.f4308r = r1     // Catch:{ all -> 0x00b3 }
            r3 = 5
            if (r8 != 0) goto L_0x002f
            a2.b0 r8 = new a2.b0     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r9.<init>(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Class r10 = r7.f4298h     // Catch:{ all -> 0x00b3 }
            r9.append(r10)     // Catch:{ all -> 0x00b3 }
            java.lang.String r10 = " inside, but instead got null."
            r9.append(r10)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b3 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b3 }
            r7.k(r8, r3)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            return
        L_0x002f:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class r4 = r7.f4298h     // Catch:{ all -> 0x00b3 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ all -> 0x00b3 }
            if (r4 != 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            n2.d r10 = r7.f4294d     // Catch:{ all -> 0x00b3 }
            if (r10 == 0) goto L_0x004f
            boolean r10 = r10.c(r7)     // Catch:{ all -> 0x00b3 }
            if (r10 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0050
        L_0x004f:
            r10 = 1
        L_0x0050:
            if (r10 != 0) goto L_0x0061
            r7.f4307q = r1     // Catch:{ all -> 0x00af }
            r9 = 4
            r7.B = r9     // Catch:{ all -> 0x00af }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            a2.r r9 = r7.f4310t
            r9.getClass()
            a2.r.e(r8)
            return
        L_0x0061:
            r7.l(r8, r0, r9)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0066:
            r7.f4307q = r1     // Catch:{ all -> 0x00af }
            a2.b0 r9 = new a2.b0     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>(r10)     // Catch:{ all -> 0x00af }
            java.lang.Class r10 = r7.f4298h     // Catch:{ all -> 0x00af }
            r1.append(r10)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = " but instead got "
            r1.append(r10)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0080
            java.lang.Class r10 = r0.getClass()     // Catch:{ all -> 0x00af }
            goto L_0x0082
        L_0x0080:
            java.lang.String r10 = ""
        L_0x0082:
            r1.append(r10)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = "{"
            r1.append(r10)     // Catch:{ all -> 0x00af }
            r1.append(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = "} inside Resource{"
            r1.append(r10)     // Catch:{ all -> 0x00af }
            r1.append(r8)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = "}."
            r1.append(r10)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009f
            java.lang.String r10 = ""
            goto L_0x00a1
        L_0x009f:
            java.lang.String r10 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a1:
            r1.append(r10)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00af }
            r9.<init>(r10)     // Catch:{ all -> 0x00af }
            r7.k(r9, r3)     // Catch:{ all -> 0x00af }
            goto L_0x0057
        L_0x00af:
            r9 = move-exception
            r1 = r8
            r8 = r7
            goto L_0x00b8
        L_0x00b3:
            r8 = move-exception
            r9 = r7
        L_0x00b5:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x00b8:
            monitor-exit(r2)     // Catch:{ all -> 0x00bc }
            throw r9     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r9 = move-exception
            goto L_0x00c3
        L_0x00bc:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x00b5
        L_0x00c1:
            r9 = move-exception
            r8 = r7
        L_0x00c3:
            if (r1 == 0) goto L_0x00cd
            a2.r r8 = r8.f4310t
            r8.getClass()
            a2.r.e(r1)
        L_0x00cd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.m(a2.f0, y1.a, boolean):void");
    }

    public final void n(int i3, int i6) {
        Object obj;
        String str;
        k a6;
        int i7 = i3;
        int i8 = i6;
        this.f4292b.a();
        Object obj2 = this.f4293c;
        synchronized (obj2) {
            try {
                boolean z5 = C;
                if (z5) {
                    g("Got onSizeReady in " + f.a(this.f4309s));
                }
                if (this.B == 3) {
                    this.B = 2;
                    float f6 = this.f4299i.f4264e;
                    if (i7 != Integer.MIN_VALUE) {
                        i7 = Math.round(((float) i7) * f6);
                    }
                    this.f4313x = i7;
                    this.f4314y = i8 == Integer.MIN_VALUE ? i8 : Math.round(f6 * ((float) i8));
                    if (z5) {
                        g("finished setup for calling load in " + f.a(this.f4309s));
                    }
                    r rVar = this.f4310t;
                    com.bumptech.glide.g gVar = this.f4296f;
                    Object obj3 = this.f4297g;
                    a aVar = this.f4299i;
                    String str2 = "finished onSizeReady in ";
                    Object obj4 = obj2;
                    try {
                        obj = obj4;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        a6 = rVar.a(gVar, obj3, aVar.f4274o, this.f4313x, this.f4314y, aVar.f4281v, this.f4298h, this.f4302l, aVar.f4265f, aVar.f4280u, aVar.f4275p, aVar.B, aVar.f4279t, aVar.f4271l, aVar.f4284z, aVar.C, aVar.A, this, this.f4306p);
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    try {
                        this.f4308r = a6;
                        if (this.B != 2) {
                            this.f4308r = null;
                        }
                        if (z5) {
                            g(str + f.a(this.f4309s));
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }
}
