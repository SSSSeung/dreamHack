package g5;

import a5.c;
import b1.o;
import g4.h;
import java.io.IOException;
import java.util.ArrayList;
import kotlinx.coroutines.internal.r;
import l5.g;
import l5.j;
import l5.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2950a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final q f2951b;

    /* renamed from: c  reason: collision with root package name */
    public c[] f2952c;

    /* renamed from: d  reason: collision with root package name */
    public int f2953d;

    /* renamed from: e  reason: collision with root package name */
    public int f2954e;

    /* renamed from: f  reason: collision with root package name */
    public int f2955f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2956g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public int f2957h = 4096;

    public d(w wVar) {
        this.f2951b = new q(wVar);
        this.f2952c = new c[8];
        this.f2953d = 7;
    }

    public final int a(int i3) {
        int i6;
        int i7 = 0;
        if (i3 > 0) {
            int length = this.f2952c.length;
            while (true) {
                length--;
                i6 = this.f2953d;
                if (length < i6 || i3 <= 0) {
                    c[] cVarArr = this.f2952c;
                    int i8 = i6 + 1;
                    System.arraycopy(cVarArr, i8, cVarArr, i8 + i7, this.f2954e);
                    this.f2953d += i7;
                } else {
                    c cVar = this.f2952c[length];
                    o.k(cVar);
                    int i9 = cVar.f2944a;
                    i3 -= i9;
                    this.f2955f -= i9;
                    this.f2954e--;
                    i7++;
                }
            }
            c[] cVarArr2 = this.f2952c;
            int i82 = i6 + 1;
            System.arraycopy(cVarArr2, i82, cVarArr2, i82 + i7, this.f2954e);
            this.f2953d += i7;
        }
        return i7;
    }

    public final j b(int i3) {
        c cVar;
        if (i3 >= 0 && i3 <= f.f2971a.length - 1) {
            cVar = f.f2971a[i3];
        } else {
            int length = this.f2953d + 1 + (i3 - f.f2971a.length);
            if (length >= 0) {
                c[] cVarArr = this.f2952c;
                if (length < cVarArr.length) {
                    cVar = cVarArr[length];
                    o.k(cVar);
                }
            }
            throw new IOException("Header index too large " + (i3 + 1));
        }
        return cVar.f2945b;
    }

    public final void c(c cVar) {
        this.f2950a.add(cVar);
        int i3 = this.f2957h;
        int i6 = cVar.f2944a;
        if (i6 > i3) {
            h.c0(this.f2952c, (r) null);
            this.f2953d = this.f2952c.length - 1;
            this.f2954e = 0;
            this.f2955f = 0;
            return;
        }
        a((this.f2955f + i6) - i3);
        int i7 = this.f2954e + 1;
        c[] cVarArr = this.f2952c;
        if (i7 > cVarArr.length) {
            c[] cVarArr2 = new c[(cVarArr.length * 2)];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f2953d = this.f2952c.length - 1;
            this.f2952c = cVarArr2;
        }
        int i8 = this.f2953d;
        this.f2953d = i8 - 1;
        this.f2952c[i8] = cVar;
        this.f2954e++;
        this.f2955f += i6;
    }

    public final j d() {
        int i3;
        q qVar = this.f2951b;
        byte readByte = qVar.readByte();
        byte[] bArr = c.f212a;
        byte b6 = readByte & 255;
        byte b7 = 0;
        boolean z5 = (b6 & 128) == 128;
        long e6 = (long) e(b6, 127);
        if (!z5) {
            return qVar.g(e6);
        }
        g gVar = new g();
        int[] iArr = d0.f2958a;
        o.m(qVar, "source");
        c0 c0Var = d0.f2960c;
        c0 c0Var2 = c0Var;
        int i6 = 0;
        for (long j6 = 0; j6 < e6; j6++) {
            byte readByte2 = qVar.readByte();
            byte[] bArr2 = c.f212a;
            b7 = (b7 << 8) | (readByte2 & 255);
            i6 += 8;
            while (i6 >= 8) {
                int i7 = i6 - 8;
                c0[] c0VarArr = c0Var2.f2947a;
                o.k(c0VarArr);
                c0Var2 = c0VarArr[(b7 >>> i7) & 255];
                o.k(c0Var2);
                if (c0Var2.f2947a == null) {
                    gVar.G(c0Var2.f2948b);
                    i6 -= c0Var2.f2949c;
                    c0Var2 = c0Var;
                } else {
                    i6 = i7;
                }
            }
        }
        while (i6 > 0) {
            c0[] c0VarArr2 = c0Var2.f2947a;
            o.k(c0VarArr2);
            c0 c0Var3 = c0VarArr2[(b7 << (8 - i6)) & 255];
            o.k(c0Var3);
            if (c0Var3.f2947a != null || (i3 = c0Var3.f2949c) > i6) {
                break;
            }
            gVar.G(c0Var3.f2948b);
            i6 -= i3;
            c0Var2 = c0Var;
        }
        return gVar.g(gVar.f4128e);
    }

    public final int e(int i3, int i6) {
        int i7 = i3 & i6;
        if (i7 < i6) {
            return i7;
        }
        int i8 = 0;
        while (true) {
            byte readByte = this.f2951b.readByte();
            byte[] bArr = c.f212a;
            byte b6 = readByte & 255;
            if ((b6 & 128) == 0) {
                return i6 + (b6 << i8);
            }
            i6 += (b6 & Byte.MAX_VALUE) << i8;
            i8 += 7;
        }
    }
}
