package a2;

import androidx.appcompat.widget.a0;
import androidx.fragment.app.n0;
import b1.o;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s2.b;
import s2.d;
import w0.c;
import y1.a;
import y1.f;

public final class v implements j, b {
    public static final n0 C = new n0(13);
    public volatile boolean A;
    public boolean B;

    /* renamed from: d  reason: collision with root package name */
    public final u f148d = new u(new ArrayList(2));

    /* renamed from: e  reason: collision with root package name */
    public final d f149e = new d();

    /* renamed from: f  reason: collision with root package name */
    public final y f150f;

    /* renamed from: g  reason: collision with root package name */
    public final c f151g;

    /* renamed from: h  reason: collision with root package name */
    public final n0 f152h;

    /* renamed from: i  reason: collision with root package name */
    public final w f153i;

    /* renamed from: j  reason: collision with root package name */
    public final d2.c f154j;

    /* renamed from: k  reason: collision with root package name */
    public final d2.c f155k;

    /* renamed from: l  reason: collision with root package name */
    public final d2.c f156l;

    /* renamed from: m  reason: collision with root package name */
    public final d2.c f157m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicInteger f158n = new AtomicInteger();

    /* renamed from: o  reason: collision with root package name */
    public f f159o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f160p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f161q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f162r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f163s;

    /* renamed from: t  reason: collision with root package name */
    public f0 f164t;

    /* renamed from: u  reason: collision with root package name */
    public a f165u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f166v;
    public b0 w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f167x;

    /* renamed from: y  reason: collision with root package name */
    public z f168y;

    /* renamed from: z  reason: collision with root package name */
    public n f169z;

    public v(d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4, w wVar, y yVar, c cVar5) {
        n0 n0Var = C;
        this.f154j = cVar;
        this.f155k = cVar2;
        this.f156l = cVar3;
        this.f157m = cVar4;
        this.f153i = wVar;
        this.f150f = yVar;
        this.f151g = cVar5;
        this.f152h = n0Var;
    }

    public final d a() {
        return this.f149e;
    }

    public final synchronized void b(n2.f fVar, Executor executor) {
        s sVar;
        this.f149e.a();
        u uVar = this.f148d;
        uVar.getClass();
        uVar.f147d.add(new t(fVar, executor));
        boolean z5 = true;
        if (this.f166v) {
            e(1);
            sVar = new s(this, fVar, 1);
        } else if (this.f167x) {
            e(1);
            sVar = new s(this, fVar, 0);
        } else {
            if (this.A) {
                z5 = false;
            }
            o.h("Cannot add callbacks to a cancelled EngineJob", z5);
        }
        executor.execute(sVar);
    }

    public final void c() {
        if (!f()) {
            this.A = true;
            n nVar = this.f169z;
            nVar.F = true;
            h hVar = nVar.D;
            if (hVar != null) {
                hVar.cancel();
            }
            w wVar = this.f153i;
            f fVar = this.f159o;
            r rVar = (r) wVar;
            synchronized (rVar) {
                a0 a0Var = rVar.f135a;
                a0Var.getClass();
                Map map = (Map) (this.f163s ? a0Var.f504f : a0Var.f503e);
                if (equals(map.get(fVar))) {
                    map.remove(fVar);
                }
            }
        }
    }

    public final void d() {
        z zVar;
        synchronized (this) {
            this.f149e.a();
            o.h("Not yet complete!", f());
            int decrementAndGet = this.f158n.decrementAndGet();
            o.h("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                zVar = this.f168y;
                g();
            } else {
                zVar = null;
            }
        }
        if (zVar != null) {
            zVar.e();
        }
    }

    public final synchronized void e(int i3) {
        z zVar;
        o.h("Not yet complete!", f());
        if (this.f158n.getAndAdd(i3) == 0 && (zVar = this.f168y) != null) {
            zVar.a();
        }
    }

    public final boolean f() {
        return this.f167x || this.f166v || this.A;
    }

    public final synchronized void g() {
        boolean a6;
        if (this.f159o != null) {
            this.f148d.f147d.clear();
            this.f159o = null;
            this.f168y = null;
            this.f164t = null;
            this.f167x = false;
            this.A = false;
            this.f166v = false;
            this.B = false;
            n nVar = this.f169z;
            l lVar = nVar.f109j;
            synchronized (lVar) {
                lVar.f100a = true;
                a6 = lVar.a();
            }
            if (a6) {
                nVar.l();
            }
            this.f169z = null;
            this.w = null;
            this.f165u = null;
            this.f151g.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(n2.f fVar) {
        boolean z5;
        this.f149e.a();
        u uVar = this.f148d;
        uVar.f147d.remove(new t(fVar, com.bumptech.glide.d.f1704e));
        if (this.f148d.f147d.isEmpty()) {
            c();
            if (!this.f166v) {
                if (!this.f167x) {
                    z5 = false;
                    if (z5 && this.f158n.get() == 0) {
                        g();
                    }
                }
            }
            z5 = true;
            g();
        }
    }
}
