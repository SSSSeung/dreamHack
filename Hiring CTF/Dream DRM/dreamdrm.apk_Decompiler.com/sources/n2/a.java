package n2;

import a2.p;
import a2.q;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b1.o;
import com.bumptech.glide.h;
import h2.e;
import h2.m;
import h2.n;
import h2.r;
import j2.d;
import q2.b;
import r2.c;
import r2.l;
import y1.f;
import y1.i;

public abstract class a implements Cloneable {
    public boolean A;
    public boolean B = true;
    public boolean C;

    /* renamed from: d  reason: collision with root package name */
    public int f4263d;

    /* renamed from: e  reason: collision with root package name */
    public float f4264e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public q f4265f = q.f133c;

    /* renamed from: g  reason: collision with root package name */
    public h f4266g = h.f1737f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4267h;

    /* renamed from: i  reason: collision with root package name */
    public int f4268i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f4269j;

    /* renamed from: k  reason: collision with root package name */
    public int f4270k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4271l = true;

    /* renamed from: m  reason: collision with root package name */
    public int f4272m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f4273n = -1;

    /* renamed from: o  reason: collision with root package name */
    public f f4274o = q2.a.f4900b;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4275p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4276q = true;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f4277r;

    /* renamed from: s  reason: collision with root package name */
    public int f4278s;

    /* renamed from: t  reason: collision with root package name */
    public i f4279t = new i();

    /* renamed from: u  reason: collision with root package name */
    public c f4280u = new c();

    /* renamed from: v  reason: collision with root package name */
    public Class f4281v = Object.class;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public Resources.Theme f4282x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4283y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4284z;

    public static boolean e(int i3, int i6) {
        return (i3 & i6) != 0;
    }

    public a a(a aVar) {
        if (this.f4283y) {
            return clone().a(aVar);
        }
        if (e(aVar.f4263d, 2)) {
            this.f4264e = aVar.f4264e;
        }
        if (e(aVar.f4263d, 262144)) {
            this.f4284z = aVar.f4284z;
        }
        if (e(aVar.f4263d, 1048576)) {
            this.C = aVar.C;
        }
        if (e(aVar.f4263d, 4)) {
            this.f4265f = aVar.f4265f;
        }
        if (e(aVar.f4263d, 8)) {
            this.f4266g = aVar.f4266g;
        }
        if (e(aVar.f4263d, 16)) {
            this.f4267h = aVar.f4267h;
            this.f4268i = 0;
            this.f4263d &= -33;
        }
        if (e(aVar.f4263d, 32)) {
            this.f4268i = aVar.f4268i;
            this.f4267h = null;
            this.f4263d &= -17;
        }
        if (e(aVar.f4263d, 64)) {
            this.f4269j = aVar.f4269j;
            this.f4270k = 0;
            this.f4263d &= -129;
        }
        if (e(aVar.f4263d, 128)) {
            this.f4270k = aVar.f4270k;
            this.f4269j = null;
            this.f4263d &= -65;
        }
        if (e(aVar.f4263d, 256)) {
            this.f4271l = aVar.f4271l;
        }
        if (e(aVar.f4263d, 512)) {
            this.f4273n = aVar.f4273n;
            this.f4272m = aVar.f4272m;
        }
        if (e(aVar.f4263d, 1024)) {
            this.f4274o = aVar.f4274o;
        }
        if (e(aVar.f4263d, 4096)) {
            this.f4281v = aVar.f4281v;
        }
        if (e(aVar.f4263d, 8192)) {
            this.f4277r = aVar.f4277r;
            this.f4278s = 0;
            this.f4263d &= -16385;
        }
        if (e(aVar.f4263d, 16384)) {
            this.f4278s = aVar.f4278s;
            this.f4277r = null;
            this.f4263d &= -8193;
        }
        if (e(aVar.f4263d, 32768)) {
            this.f4282x = aVar.f4282x;
        }
        if (e(aVar.f4263d, 65536)) {
            this.f4276q = aVar.f4276q;
        }
        if (e(aVar.f4263d, 131072)) {
            this.f4275p = aVar.f4275p;
        }
        if (e(aVar.f4263d, 2048)) {
            this.f4280u.putAll(aVar.f4280u);
            this.B = aVar.B;
        }
        if (e(aVar.f4263d, 524288)) {
            this.A = aVar.A;
        }
        if (!this.f4276q) {
            this.f4280u.clear();
            this.f4275p = false;
            this.f4263d = this.f4263d & -2049 & -131073;
            this.B = true;
        }
        this.f4263d |= aVar.f4263d;
        this.f4279t.f5816b.i(aVar.f4279t.f5816b);
        i();
        return this;
    }

    /* renamed from: b */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.f4279t = iVar;
            iVar.f5816b.i(this.f4279t.f5816b);
            c cVar = new c();
            aVar.f4280u = cVar;
            cVar.putAll(this.f4280u);
            aVar.w = false;
            aVar.f4283y = false;
            return aVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final a c(Class cls) {
        if (this.f4283y) {
            return clone().c(cls);
        }
        this.f4281v = cls;
        this.f4263d |= 4096;
        i();
        return this;
    }

    public final a d(p pVar) {
        if (this.f4283y) {
            return clone().d(pVar);
        }
        this.f4265f = pVar;
        this.f4263d |= 4;
        i();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f4264e, this.f4264e) == 0 && this.f4268i == aVar.f4268i && l.a(this.f4267h, aVar.f4267h) && this.f4270k == aVar.f4270k && l.a(this.f4269j, aVar.f4269j) && this.f4278s == aVar.f4278s && l.a(this.f4277r, aVar.f4277r) && this.f4271l == aVar.f4271l && this.f4272m == aVar.f4272m && this.f4273n == aVar.f4273n && this.f4275p == aVar.f4275p && this.f4276q == aVar.f4276q && this.f4284z == aVar.f4284z && this.A == aVar.A && this.f4265f.equals(aVar.f4265f) && this.f4266g == aVar.f4266g && this.f4279t.equals(aVar.f4279t) && this.f4280u.equals(aVar.f4280u) && this.f4281v.equals(aVar.f4281v) && l.a(this.f4274o, aVar.f4274o) && l.a(this.f4282x, aVar.f4282x);
        }
    }

    public final a f(m mVar, e eVar) {
        if (this.f4283y) {
            return clone().f(mVar, eVar);
        }
        j(n.f3415f, mVar);
        return n(eVar, false);
    }

    public final a g(int i3, int i6) {
        if (this.f4283y) {
            return clone().g(i3, i6);
        }
        this.f4273n = i3;
        this.f4272m = i6;
        this.f4263d |= 512;
        i();
        return this;
    }

    public final a h() {
        h hVar = h.f1738g;
        if (this.f4283y) {
            return clone().h();
        }
        this.f4266g = hVar;
        this.f4263d |= 8;
        i();
        return this;
    }

    public final int hashCode() {
        float f6 = this.f4264e;
        char[] cArr = l.f4938a;
        return l.f(l.f(l.f(l.f(l.f(l.f(l.f((((((((((((((l.f((l.f((l.f(((Float.floatToIntBits(f6) + 527) * 31) + this.f4268i, this.f4267h) * 31) + this.f4270k, this.f4269j) * 31) + this.f4278s, this.f4277r) * 31) + (this.f4271l ? 1 : 0)) * 31) + this.f4272m) * 31) + this.f4273n) * 31) + (this.f4275p ? 1 : 0)) * 31) + (this.f4276q ? 1 : 0)) * 31) + (this.f4284z ? 1 : 0)) * 31) + (this.A ? 1 : 0), this.f4265f), this.f4266g), this.f4279t), this.f4280u), this.f4281v), this.f4274o), this.f4282x);
    }

    public final void i() {
        if (this.w) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a j(y1.h hVar, m mVar) {
        if (this.f4283y) {
            return clone().j(hVar, mVar);
        }
        o.i(hVar);
        this.f4279t.f5816b.put(hVar, mVar);
        i();
        return this;
    }

    public final a k(b bVar) {
        if (this.f4283y) {
            return clone().k(bVar);
        }
        this.f4274o = bVar;
        this.f4263d |= 1024;
        i();
        return this;
    }

    public final a l() {
        if (this.f4283y) {
            return clone().l();
        }
        this.f4271l = false;
        this.f4263d |= 256;
        i();
        return this;
    }

    public final a m(Class cls, y1.m mVar, boolean z5) {
        if (this.f4283y) {
            return clone().m(cls, mVar, z5);
        }
        o.i(mVar);
        this.f4280u.put(cls, mVar);
        this.f4276q = true;
        int i3 = this.f4263d | 2048 | 65536;
        this.f4263d = i3;
        this.B = false;
        if (z5) {
            this.f4263d = i3 | 131072;
            this.f4275p = true;
        }
        i();
        return this;
    }

    public final a n(y1.m mVar, boolean z5) {
        if (this.f4283y) {
            return clone().n(mVar, z5);
        }
        r rVar = new r(mVar, z5);
        m(Bitmap.class, mVar, z5);
        m(Drawable.class, rVar, z5);
        m(BitmapDrawable.class, rVar, z5);
        m(j2.c.class, new d(mVar), z5);
        i();
        return this;
    }

    public final a o() {
        if (this.f4283y) {
            return clone().o();
        }
        this.C = true;
        this.f4263d |= 1048576;
        i();
        return this;
    }
}
