package com.bumptech.glide;

import a2.q;
import a2.r;
import android.content.Context;
import android.util.Log;
import b1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.a;
import n2.b;
import n2.c;
import n2.d;
import n2.e;
import n2.g;
import n2.h;
import r2.l;

public final class m extends a {
    public final Context D;
    public final n E;
    public final Class F;
    public final g G;
    public a H;
    public Object I;
    public ArrayList J;
    public m K;
    public m L;
    public final boolean M = true;
    public boolean N;
    public boolean O;

    static {
        e eVar = (e) ((e) ((e) new e().d(q.f132b)).h()).l();
    }

    public m(b bVar, n nVar, Class cls, Context context) {
        e eVar;
        this.E = nVar;
        this.F = cls;
        this.D = context;
        Map map = nVar.f1781d.f1691f.f1730f;
        a aVar = (a) map.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.H = aVar == null ? g.f1724k : aVar;
        this.G = bVar.f1691f;
        Iterator it = nVar.f1789l.iterator();
        while (it.hasNext()) {
            a2.m.o(it.next());
            p();
        }
        synchronized (nVar) {
            eVar = nVar.f1790m;
        }
        q(eVar);
    }

    public final a a(a aVar) {
        o.i(aVar);
        return (m) super.a(aVar);
    }

    public final m p() {
        if (this.f4283y) {
            return clone().p();
        }
        i();
        return this;
    }

    public final m q(a aVar) {
        o.i(aVar);
        return (m) super.a(aVar);
    }

    public final c r(int i3, int i6, a aVar, h hVar, a aVar2, d dVar, o2.e eVar, Object obj) {
        b bVar;
        b bVar2;
        h hVar2;
        int i7;
        h hVar3;
        int i8;
        int i9;
        a aVar3 = aVar2;
        Object obj2 = obj;
        if (this.L != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        m mVar = this.K;
        if (mVar == null) {
            hVar2 = v(i3, i6, aVar, hVar, aVar2, bVar2, eVar, obj);
        } else if (!this.O) {
            a aVar4 = mVar.M ? aVar : mVar.H;
            if (a.e(mVar.f4263d, 8)) {
                hVar3 = this.K.f4266g;
            } else {
                int ordinal = hVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    hVar3 = h.f1735d;
                } else if (ordinal == 2) {
                    hVar3 = h.f1736e;
                } else if (ordinal == 3) {
                    hVar3 = h.f1737f;
                } else {
                    throw new IllegalArgumentException("unknown priority: " + this.f4266g);
                }
            }
            h hVar4 = hVar3;
            m mVar2 = this.K;
            int i10 = mVar2.f4273n;
            int i11 = mVar2.f4272m;
            if (l.g(i3, i6)) {
                m mVar3 = this.K;
                if (!l.g(mVar3.f4273n, mVar3.f4272m)) {
                    i9 = aVar3.f4273n;
                    i8 = aVar3.f4272m;
                    h hVar5 = new h(obj2, bVar2);
                    o2.e eVar2 = eVar;
                    h hVar6 = hVar5;
                    g v5 = v(i3, i6, aVar, hVar, aVar2, hVar5, eVar2, obj);
                    this.O = true;
                    m mVar4 = this.K;
                    c r5 = mVar4.r(i9, i8, aVar4, hVar4, mVar4, hVar6, eVar2, obj);
                    this.O = false;
                    h hVar7 = hVar6;
                    hVar7.f4318c = v5;
                    hVar7.f4319d = r5;
                    hVar2 = hVar7;
                }
            }
            i8 = i11;
            i9 = i10;
            h hVar52 = new h(obj2, bVar2);
            o2.e eVar22 = eVar;
            h hVar62 = hVar52;
            g v52 = v(i3, i6, aVar, hVar, aVar2, hVar52, eVar22, obj);
            this.O = true;
            m mVar42 = this.K;
            c r52 = mVar42.r(i9, i8, aVar4, hVar4, mVar42, hVar62, eVar22, obj);
            this.O = false;
            h hVar72 = hVar62;
            hVar72.f4318c = v52;
            hVar72.f4319d = r52;
            hVar2 = hVar72;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return hVar2;
        }
        m mVar5 = this.L;
        int i12 = mVar5.f4273n;
        int i13 = mVar5.f4272m;
        if (l.g(i3, i6)) {
            m mVar6 = this.L;
            if (!l.g(mVar6.f4273n, mVar6.f4272m)) {
                int i14 = aVar3.f4273n;
                i7 = aVar3.f4272m;
                i12 = i14;
                m mVar7 = this.L;
                c r6 = mVar7.r(i12, i7, mVar7.H, mVar7.f4266g, mVar7, bVar, eVar, obj);
                bVar.f4287c = hVar2;
                bVar.f4288d = r6;
                return bVar;
            }
        }
        i7 = i13;
        m mVar72 = this.L;
        c r62 = mVar72.r(i12, i7, mVar72.H, mVar72.f4266g, mVar72, bVar, eVar, obj);
        bVar.f4287c = hVar2;
        bVar.f4288d = r62;
        return bVar;
    }

    /* renamed from: s */
    public final m clone() {
        m mVar = (m) super.clone();
        mVar.H = mVar.H.clone();
        if (mVar.J != null) {
            mVar.J = new ArrayList(mVar.J);
        }
        m mVar2 = mVar.K;
        if (mVar2 != null) {
            mVar.K = mVar2.clone();
        }
        m mVar3 = mVar.L;
        if (mVar3 != null) {
            mVar.L = mVar3.clone();
        }
        return mVar;
    }

    public final void t(o2.e eVar, a aVar) {
        o.i(eVar);
        if (this.N) {
            c r5 = r(aVar.f4273n, aVar.f4272m, this.H, aVar.f4266g, aVar, (d) null, eVar, new Object());
            c f6 = eVar.f();
            if (r5.j(f6)) {
                if (!(!aVar.f4271l && f6.h())) {
                    o.i(f6);
                    if (!f6.isRunning()) {
                        f6.e();
                        return;
                    }
                    return;
                }
            }
            this.E.l(eVar);
            eVar.c(r5);
            n nVar = this.E;
            synchronized (nVar) {
                nVar.f1786i.f4106d.add(eVar);
                l2.l lVar = nVar.f1784g;
                ((Set) lVar.f4103f).add(r5);
                if (!lVar.f4102e) {
                    r5.e();
                } else {
                    r5.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((List) lVar.f4104g).add(r5);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final m u(Object obj) {
        if (this.f4283y) {
            return clone().u(obj);
        }
        this.I = obj;
        this.N = true;
        i();
        return this;
    }

    public final g v(int i3, int i6, a aVar, h hVar, a aVar2, d dVar, o2.e eVar, Object obj) {
        Context context = this.D;
        Object obj2 = this.I;
        Class cls = this.F;
        ArrayList arrayList = this.J;
        g gVar = this.G;
        r rVar = gVar.f1731g;
        aVar.getClass();
        return new g(context, gVar, obj, obj2, cls, aVar2, i3, i6, hVar, eVar, arrayList, dVar, rVar);
    }
}
