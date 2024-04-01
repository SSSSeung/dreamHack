package l5;

import b1.o;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import g4.h;

public final class t extends j {

    /* renamed from: h  reason: collision with root package name */
    public final transient byte[][] f4162h;

    /* renamed from: i  reason: collision with root package name */
    public final transient int[] f4163i;

    public t(byte[][] bArr, int[] iArr) {
        super(j.f4129g.f4132f);
        this.f4162h = bArr;
        this.f4163i = iArr;
    }

    public final String a() {
        throw null;
    }

    public final int b() {
        return this.f4163i[this.f4162h.length - 1];
    }

    public final String c() {
        return new j(k()).c();
    }

    public final byte[] d() {
        return k();
    }

    public final byte e(int i3) {
        byte[][] bArr = this.f4162h;
        int[] iArr = this.f4163i;
        e.g((long) iArr[bArr.length - 1], (long) i3, 1);
        int B = d.B(this, i3);
        return bArr[B][(i3 - (B == 0 ? 0 : iArr[B - 1])) + iArr[bArr.length + B]];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.b() != b() || !g(jVar, b())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i3, byte[] bArr, int i6, int i7) {
        o.m(bArr, "other");
        if (i3 < 0 || i3 > b() - i7 || i6 < 0 || i6 > bArr.length - i7) {
            return false;
        }
        int i8 = i7 + i3;
        int B = d.B(this, i3);
        while (i3 < i8) {
            int[] iArr = this.f4163i;
            int i9 = B == 0 ? 0 : iArr[B - 1];
            byte[][] bArr2 = this.f4162h;
            int i10 = iArr[bArr2.length + B];
            int min = Math.min(i8, (iArr[B] - i9) + i9) - i3;
            if (!e.c((i3 - i9) + i10, i6, min, bArr2[B], bArr)) {
                return false;
            }
            i6 += min;
            i3 += min;
            B++;
        }
        return true;
    }

    public final boolean g(j jVar, int i3) {
        o.m(jVar, "other");
        if (b() - i3 < 0) {
            return false;
        }
        int i6 = i3 + 0;
        int B = d.B(this, 0);
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int[] iArr = this.f4163i;
            int i9 = B == 0 ? 0 : iArr[B - 1];
            byte[][] bArr = this.f4162h;
            int i10 = iArr[bArr.length + B];
            int min = Math.min(i6, (iArr[B] - i9) + i9) - i7;
            if (!jVar.f(i8, bArr[B], (i7 - i9) + i10, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            B++;
        }
        return true;
    }

    public final j h() {
        return new j(k()).h();
    }

    public final int hashCode() {
        int i3 = this.f4130d;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f4162h;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 1;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.f4163i;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            byte[] bArr2 = bArr[i6];
            int i11 = (i10 - i8) + i9;
            while (i9 < i11) {
                i7 = (i7 * 31) + bArr2[i9];
                i9++;
            }
            i6++;
            i8 = i10;
        }
        this.f4130d = i7;
        return i7;
    }

    public final void j(g gVar, int i3) {
        o.m(gVar, "buffer");
        int i6 = i3 + 0;
        int B = d.B(this, 0);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr = this.f4163i;
            int i8 = B == 0 ? 0 : iArr[B - 1];
            byte[][] bArr = this.f4162h;
            int i9 = iArr[bArr.length + B];
            int min = Math.min(i6, (iArr[B] - i8) + i8) - i7;
            int i10 = (i7 - i8) + i9;
            r rVar = new r(bArr[B], i10, i10 + min, true);
            r rVar2 = gVar.f4127d;
            if (rVar2 == null) {
                rVar.f4158g = rVar;
                rVar.f4157f = rVar;
                gVar.f4127d = rVar;
            } else {
                r rVar3 = rVar2.f4158g;
                o.k(rVar3);
                rVar3.b(rVar);
            }
            i7 += min;
            B++;
        }
        gVar.f4128e += (long) b();
    }

    public final byte[] k() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f4162h;
        int length = bArr2.length;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < length) {
            int[] iArr = this.f4163i;
            int i8 = iArr[length + i3];
            int i9 = iArr[i3];
            int i10 = i9 - i6;
            h.X(i7, i8, i8 + i10, bArr2[i3], bArr);
            i7 += i10;
            i3++;
            i6 = i9;
        }
        return bArr;
    }

    public final String toString() {
        return new j(k()).toString();
    }
}
