package a2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.g4;
import androidx.fragment.app.n0;
import b.a;
import b1.o;
import c2.d;
import c2.f;
import c2.g;
import com.bumptech.glide.h;
import java.util.Map;
import java.util.concurrent.Executor;
import p0.c;
import y1.i;

public final class r implements w, g, y {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f134h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f135a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f136b;

    /* renamed from: c  reason: collision with root package name */
    public final f f137c;

    /* renamed from: d  reason: collision with root package name */
    public final g4 f138d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f139e;

    /* renamed from: f  reason: collision with root package name */
    public final c f140f;

    /* renamed from: g  reason: collision with root package name */
    public final c f141g;

    public r(f fVar, d dVar, d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4) {
        this.f137c = fVar;
        a aVar = new a(dVar);
        c cVar5 = new c();
        this.f141g = cVar5;
        synchronized (this) {
            synchronized (cVar5) {
                cVar5.f30d = this;
            }
        }
        this.f136b = new n0(14);
        this.f135a = new a0(11);
        this.f138d = new g4(cVar, cVar2, cVar3, cVar4, this, this);
        this.f140f = new c(aVar);
        this.f139e = new j0();
        fVar.f1612e = this;
    }

    public static void c(String str, long j6, y1.f fVar) {
        Log.v("Engine", str + " in " + r2.f.a(j6) + "ms, key: " + fVar);
    }

    public static void e(f0 f0Var) {
        if (f0Var instanceof z) {
            ((z) f0Var).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final k a(com.bumptech.glide.g gVar, Object obj, y1.f fVar, int i3, int i6, Class cls, Class cls2, h hVar, q qVar, r2.c cVar, boolean z5, boolean z6, i iVar, boolean z7, boolean z8, boolean z9, boolean z10, n2.f fVar2, Executor executor) {
        long j6;
        if (f134h) {
            int i7 = r2.f.f4927b;
            j6 = SystemClock.elapsedRealtimeNanos();
        } else {
            j6 = 0;
        }
        long j7 = j6;
        this.f136b.getClass();
        x xVar = new x(obj, fVar, i3, i6, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                z b6 = b(xVar, z7, j7);
                if (b6 == null) {
                    k f6 = f(gVar, obj, fVar, i3, i6, cls, cls2, hVar, qVar, cVar, z5, z6, iVar, z7, z8, z9, z10, fVar2, executor, xVar, j7);
                    return f6;
                }
                ((n2.g) fVar2).m(b6, y1.a.f5804h, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final z b(x xVar, boolean z5, long j6) {
        z zVar;
        Object obj;
        if (!z5) {
            return null;
        }
        c cVar = this.f141g;
        synchronized (cVar) {
            b bVar = (b) cVar.f28b.get(xVar);
            if (bVar == null) {
                zVar = null;
            } else {
                zVar = (z) bVar.get();
                if (zVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (zVar != null) {
            zVar.a();
        }
        if (zVar != null) {
            if (f134h) {
                c("Loaded resource from active resources", j6, xVar);
            }
            return zVar;
        }
        f fVar = this.f137c;
        synchronized (fVar) {
            r2.g gVar = (r2.g) fVar.f4930a.remove(xVar);
            if (gVar == null) {
                obj = null;
            } else {
                fVar.f4932c -= (long) gVar.f4929b;
                obj = gVar.f4928a;
            }
        }
        f0 f0Var = (f0) obj;
        z zVar2 = f0Var == null ? null : f0Var instanceof z ? (z) f0Var : new z(f0Var, true, true, xVar, this);
        if (zVar2 != null) {
            zVar2.a();
            this.f141g.a(xVar, zVar2);
        }
        if (zVar2 == null) {
            return null;
        }
        if (f134h) {
            c("Loaded resource from cache", j6, xVar);
        }
        return zVar2;
    }

    public final void d(y1.f fVar, z zVar) {
        c cVar = this.f141g;
        synchronized (cVar) {
            b bVar = (b) cVar.f28b.remove(fVar);
            if (bVar != null) {
                bVar.f20c = null;
                bVar.clear();
            }
        }
        if (zVar.f179d) {
            f0 f0Var = (f0) this.f137c.d(fVar, zVar);
        } else {
            this.f139e.a(zVar, false);
        }
    }

    public final k f(com.bumptech.glide.g gVar, Object obj, y1.f fVar, int i3, int i6, Class cls, Class cls2, h hVar, q qVar, r2.c cVar, boolean z5, boolean z6, i iVar, boolean z7, boolean z8, boolean z9, boolean z10, n2.f fVar2, Executor executor, x xVar, long j6) {
        com.bumptech.glide.g gVar2 = gVar;
        Object obj2 = obj;
        y1.f fVar3 = fVar;
        int i7 = i3;
        int i8 = i6;
        h hVar2 = hVar;
        q qVar2 = qVar;
        i iVar2 = iVar;
        boolean z11 = z10;
        n2.f fVar4 = fVar2;
        Executor executor2 = executor;
        x xVar2 = xVar;
        long j7 = j6;
        a0 a0Var = this.f135a;
        v vVar = (v) ((Map) (z11 ? a0Var.f504f : a0Var.f503e)).get(xVar2);
        if (vVar != null) {
            vVar.b(fVar4, executor2);
            if (f134h) {
                c("Added to existing load", j7, xVar2);
            }
            return new k(this, fVar4, vVar);
        }
        v vVar2 = (v) ((w0.c) this.f138d.f617g).b();
        o.i(vVar2);
        synchronized (vVar2) {
            vVar2.f159o = xVar2;
            vVar2.f160p = z7;
            vVar2.f161q = z8;
            vVar2.f162r = z9;
            vVar2.f163s = z11;
        }
        c cVar2 = this.f140f;
        n nVar = (n) ((w0.c) cVar2.f4388c).b();
        o.i(nVar);
        int i9 = cVar2.f4386a;
        cVar2.f4386a = i9 + 1;
        i iVar3 = nVar.f103d;
        iVar3.f71c = gVar2;
        iVar3.f72d = obj2;
        iVar3.f82n = fVar3;
        iVar3.f73e = i7;
        iVar3.f74f = i8;
        iVar3.f84p = qVar2;
        iVar3.f75g = cls;
        iVar3.f76h = nVar.f106g;
        iVar3.f79k = cls2;
        iVar3.f83o = hVar2;
        iVar3.f77i = iVar2;
        iVar3.f78j = cVar;
        iVar3.f85q = z5;
        iVar3.f86r = z6;
        nVar.f110k = gVar2;
        nVar.f111l = fVar3;
        nVar.f112m = hVar2;
        nVar.f113n = xVar2;
        nVar.f114o = i7;
        nVar.f115p = i8;
        nVar.f116q = qVar2;
        nVar.f121v = z11;
        nVar.f117r = iVar2;
        nVar.f118s = vVar2;
        nVar.f119t = i9;
        boolean z12 = true;
        nVar.I = 1;
        nVar.w = obj2;
        a0 a0Var2 = this.f135a;
        a0Var2.getClass();
        ((Map) (vVar2.f163s ? a0Var2.f504f : a0Var2.f503e)).put(xVar2, vVar2);
        n2.f fVar5 = fVar2;
        vVar2.b(fVar5, executor);
        synchronized (vVar2) {
            vVar2.f169z = nVar;
            int i10 = nVar.i(1);
            if (i10 != 2) {
                if (i10 != 3) {
                    z12 = false;
                }
            }
            (z12 ? vVar2.f154j : vVar2.f161q ? vVar2.f156l : vVar2.f162r ? vVar2.f157m : vVar2.f155k).execute(nVar);
        }
        if (f134h) {
            c("Started new load", j6, xVar2);
        }
        return new k(this, fVar5, vVar2);
    }
}
