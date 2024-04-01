package l5;

import b1.o;
import g4.h;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4152a;

    /* renamed from: b  reason: collision with root package name */
    public int f4153b;

    /* renamed from: c  reason: collision with root package name */
    public int f4154c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4155d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4156e;

    /* renamed from: f  reason: collision with root package name */
    public r f4157f;

    /* renamed from: g  reason: collision with root package name */
    public r f4158g;

    public r() {
        this.f4152a = new byte[8192];
        this.f4156e = true;
        this.f4155d = false;
    }

    public final r a() {
        r rVar = this.f4157f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f4158g;
        o.k(rVar2);
        rVar2.f4157f = this.f4157f;
        r rVar3 = this.f4157f;
        o.k(rVar3);
        rVar3.f4158g = this.f4158g;
        this.f4157f = null;
        this.f4158g = null;
        return rVar;
    }

    public final void b(r rVar) {
        rVar.f4158g = this;
        rVar.f4157f = this.f4157f;
        r rVar2 = this.f4157f;
        o.k(rVar2);
        rVar2.f4158g = rVar;
        this.f4157f = rVar;
    }

    public final r c() {
        this.f4155d = true;
        return new r(this.f4152a, this.f4153b, this.f4154c, true);
    }

    public final void d(r rVar, int i3) {
        if (rVar.f4156e) {
            int i6 = rVar.f4154c;
            int i7 = i6 + i3;
            byte[] bArr = rVar.f4152a;
            if (i7 > 8192) {
                if (!rVar.f4155d) {
                    int i8 = rVar.f4153b;
                    if (i7 - i8 <= 8192) {
                        h.X(0, i8, i6, bArr, bArr);
                        rVar.f4154c -= rVar.f4153b;
                        rVar.f4153b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i9 = rVar.f4154c;
            int i10 = this.f4153b;
            h.X(i9, i10, i10 + i3, this.f4152a, bArr);
            rVar.f4154c += i3;
            this.f4153b += i3;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public r(byte[] bArr, int i3, int i6, boolean z5) {
        o.m(bArr, "data");
        this.f4152a = bArr;
        this.f4153b = i3;
        this.f4154c = i6;
        this.f4155d = z5;
        this.f4156e = false;
    }
}
