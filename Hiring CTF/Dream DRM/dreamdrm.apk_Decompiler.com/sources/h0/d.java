package h0;

import g0.j;
import java.util.HashSet;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f3261a = null;

    /* renamed from: b  reason: collision with root package name */
    public final e f3262b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3263c;

    /* renamed from: d  reason: collision with root package name */
    public d f3264d;

    /* renamed from: e  reason: collision with root package name */
    public int f3265e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f3266f = -1;

    /* renamed from: g  reason: collision with root package name */
    public j f3267g;

    public d(e eVar, c cVar) {
        this.f3262b = eVar;
        this.f3263c = cVar;
    }

    public final void a(d dVar, int i3) {
        b(dVar, i3, -1, false);
    }

    public final boolean b(d dVar, int i3, int i6, boolean z5) {
        if (dVar == null) {
            h();
            return true;
        } else if (!z5 && !g(dVar)) {
            return false;
        } else {
            this.f3264d = dVar;
            if (dVar.f3261a == null) {
                dVar.f3261a = new HashSet();
            }
            this.f3264d.f3261a.add(this);
            if (i3 > 0) {
                this.f3265e = i3;
            } else {
                this.f3265e = 0;
            }
            this.f3266f = i6;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = r3.f3264d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r3 = this;
            h0.e r0 = r3.f3262b
            int r0 = r0.V
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f3266f
            r2 = -1
            if (r0 <= r2) goto L_0x001a
            h0.d r2 = r3.f3264d
            if (r2 == 0) goto L_0x001a
            h0.e r2 = r2.f3262b
            int r2 = r2.V
            if (r2 != r1) goto L_0x001a
            return r0
        L_0x001a:
            int r0 = r3.f3265e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.d.c():int");
    }

    public final d d() {
        c cVar = this.f3263c;
        int ordinal = cVar.ordinal();
        e eVar = this.f3262b;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f3295z;
            case 2:
                return eVar.A;
            case 3:
                return eVar.f3293x;
            case 4:
                return eVar.f3294y;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f3261a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f3264d != null;
    }

    public final boolean g(d dVar) {
        boolean z5 = false;
        if (dVar == null) {
            return false;
        }
        c cVar = c.f3256h;
        c cVar2 = this.f3263c;
        e eVar = dVar.f3262b;
        c cVar3 = dVar.f3263c;
        if (cVar3 == cVar2) {
            return cVar2 != cVar || (eVar.w && this.f3262b.w);
        }
        int ordinal = cVar2.ordinal();
        c cVar4 = c.f3259k;
        c cVar5 = c.f3258j;
        switch (ordinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z6 = cVar3 == c.f3252d || cVar3 == c.f3254f;
                if (!(eVar instanceof i)) {
                    return z6;
                }
                if (z6 || cVar3 == cVar5) {
                    z5 = true;
                }
                return z5;
            case 2:
            case 4:
                boolean z7 = cVar3 == c.f3253e || cVar3 == c.f3255g;
                if (!(eVar instanceof i)) {
                    return z7;
                }
                if (z7 || cVar3 == cVar4) {
                    z5 = true;
                }
                return z5;
            case 6:
                return (cVar3 == cVar || cVar3 == cVar5 || cVar3 == cVar4) ? false : true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void h() {
        HashSet hashSet;
        d dVar = this.f3264d;
        if (!(dVar == null || (hashSet = dVar.f3261a) == null)) {
            hashSet.remove(this);
        }
        this.f3264d = null;
        this.f3265e = 0;
        this.f3266f = -1;
    }

    public final void i() {
        j jVar = this.f3267g;
        if (jVar == null) {
            this.f3267g = new j(1);
        } else {
            jVar.c();
        }
    }

    public final String toString() {
        return this.f3262b.W + ":" + this.f3263c.toString();
    }
}
