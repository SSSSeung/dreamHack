package m5;

import b1.o;
import l5.g;
import l5.r;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4209a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(v4.a.f5409a);
        o.l(bytes, "(this as java.lang.String).getBytes(charset)");
        f4209a = bytes;
    }

    public static final String a(g gVar, long j6) {
        o.m(gVar, "$this$readUtf8Line");
        if (j6 > 0) {
            long j7 = j6 - 1;
            if (gVar.e(j7) == ((byte) 13)) {
                String p2 = gVar.p(j7, v4.a.f5409a);
                gVar.a(2);
                return p2;
            }
        }
        String p5 = gVar.p(j6, v4.a.f5409a);
        gVar.a(1);
        return p5;
    }

    public static final int b(g gVar, l5.o oVar, boolean z5) {
        int i3;
        int i6;
        byte[] bArr;
        r rVar;
        int i7;
        g gVar2 = gVar;
        l5.o oVar2 = oVar;
        o.m(gVar2, "$this$selectPrefix");
        o.m(oVar2, "options");
        r rVar2 = gVar2.f4127d;
        int i8 = -2;
        if (rVar2 == null) {
            return z5 ? -2 : -1;
        }
        int i9 = rVar2.f4153b;
        int i10 = rVar2.f4154c;
        byte[] bArr2 = rVar2.f4152a;
        r rVar3 = rVar2;
        int i11 = -1;
        int i12 = 0;
        loop0:
        while (true) {
            int i13 = i12 + 1;
            int[] iArr = oVar2.f4145e;
            int i14 = iArr[i12];
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            if (i16 != -1) {
                i11 = i16;
            }
            if (rVar3 == null) {
                break;
            }
            if (i14 < 0) {
                int i17 = (i14 * -1) + i15;
                while (true) {
                    int i18 = i9 + 1;
                    int i19 = i15 + 1;
                    if ((bArr2[i9] & 255) != iArr[i15]) {
                        return i11;
                    }
                    boolean z6 = i19 == i17;
                    if (i18 == i10) {
                        o.k(rVar3);
                        r rVar4 = rVar3.f4157f;
                        o.k(rVar4);
                        i7 = rVar4.f4153b;
                        int i20 = rVar4.f4154c;
                        bArr = rVar4.f4152a;
                        if (rVar4 != rVar2) {
                            int i21 = i20;
                            rVar = rVar4;
                            i10 = i21;
                        } else if (!z6) {
                            break loop0;
                        } else {
                            i10 = i20;
                            rVar = null;
                        }
                    } else {
                        r rVar5 = rVar3;
                        bArr = bArr2;
                        i7 = i18;
                        rVar = rVar5;
                    }
                    if (z6) {
                        i3 = iArr[i19];
                        i6 = i7;
                        bArr2 = bArr;
                        rVar3 = rVar;
                        break;
                    }
                    i9 = i7;
                    bArr2 = bArr;
                    i15 = i19;
                    rVar3 = rVar;
                }
            } else {
                int i22 = i9 + 1;
                byte b6 = bArr2[i9] & 255;
                int i23 = i15 + i14;
                while (i15 != i23) {
                    if (b6 == iArr[i15]) {
                        i3 = iArr[i15 + i14];
                        if (i22 == i10) {
                            rVar3 = rVar3.f4157f;
                            o.k(rVar3);
                            i6 = rVar3.f4153b;
                            i10 = rVar3.f4154c;
                            bArr2 = rVar3.f4152a;
                            if (rVar3 == rVar2) {
                                rVar3 = null;
                            }
                        } else {
                            i6 = i22;
                        }
                    } else {
                        i15++;
                    }
                }
                return i11;
            }
            if (i3 >= 0) {
                return i3;
            }
            i12 = -i3;
            i9 = i6;
            i8 = -2;
        }
        return z5 ? i8 : i11;
    }
}
