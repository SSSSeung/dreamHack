package l5;

import a2.m;
import b1.o;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import g4.h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import m5.a;

public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: d  reason: collision with root package name */
    public r f4127d;

    /* renamed from: e  reason: collision with root package name */
    public long f4128e;

    public final String A(Charset charset) {
        return p(this.f4128e, charset);
    }

    public final f B() {
        return new f(this, 0);
    }

    public final r C(int i3) {
        boolean z5 = true;
        if (i3 < 1 || i3 > 8192) {
            z5 = false;
        }
        if (z5) {
            r rVar = this.f4127d;
            if (rVar == null) {
                r b6 = s.b();
                this.f4127d = b6;
                b6.f4158g = b6;
                b6.f4157f = b6;
                return b6;
            }
            r rVar2 = rVar.f4158g;
            o.k(rVar2);
            if (rVar2.f4154c + i3 <= 8192 && rVar2.f4156e) {
                return rVar2;
            }
            r b7 = s.b();
            rVar2.b(b7);
            return b7;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void D(j jVar) {
        o.m(jVar, "byteString");
        jVar.j(this, jVar.b());
    }

    public final void E(byte[] bArr, int i3, int i6) {
        o.m(bArr, "source");
        long j6 = (long) i6;
        e.g((long) bArr.length, (long) i3, j6);
        int i7 = i6 + i3;
        while (i3 < i7) {
            r C = C(1);
            int min = Math.min(i7 - i3, 8192 - C.f4154c);
            int i8 = i3 + min;
            h.X(C.f4154c, i3, i8, bArr, C.f4152a);
            C.f4154c += min;
            i3 = i8;
        }
        this.f4128e += j6;
    }

    public final void F(v vVar) {
        o.m(vVar, "source");
        do {
        } while (vVar.o(this, (long) 8192) != -1);
    }

    public final void G(int i3) {
        r C = C(1);
        int i6 = C.f4154c;
        C.f4154c = i6 + 1;
        C.f4152a[i6] = (byte) i3;
        this.f4128e++;
    }

    public final g H(long j6) {
        if (j6 == 0) {
            G(48);
        } else {
            long j7 = (j6 >>> 1) | j6;
            long j8 = j7 | (j7 >>> 2);
            long j9 = j8 | (j8 >>> 4);
            long j10 = j9 | (j9 >>> 8);
            long j11 = j10 | (j10 >>> 16);
            long j12 = j11 | (j11 >>> 32);
            long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
            long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
            long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
            long j16 = j15 + (j15 >>> 8);
            long j17 = j16 + (j16 >>> 16);
            int i3 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            r C = C(i3);
            int i6 = C.f4154c;
            for (int i7 = (i6 + i3) - 1; i7 >= i6; i7--) {
                C.f4152a[i7] = a.f4209a[(int) (15 & j6)];
                j6 >>>= 4;
            }
            C.f4154c += i3;
            this.f4128e += (long) i3;
        }
        return this;
    }

    public final void I(int i3) {
        r C = C(4);
        int i6 = C.f4154c;
        int i7 = i6 + 1;
        byte[] bArr = C.f4152a;
        bArr[i6] = (byte) ((i3 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i3 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i3 >>> 8) & 255);
        bArr[i9] = (byte) (i3 & 255);
        C.f4154c = i9 + 1;
        this.f4128e += 4;
    }

    public final void J(int i3) {
        r C = C(2);
        int i6 = C.f4154c;
        int i7 = i6 + 1;
        byte[] bArr = C.f4152a;
        bArr[i6] = (byte) ((i3 >>> 8) & 255);
        bArr[i7] = (byte) (i3 & 255);
        C.f4154c = i7 + 1;
        this.f4128e += 2;
    }

    public final void K(int i3, int i6, String str) {
        long j6;
        long j7;
        char charAt;
        o.m(str, "string");
        if (i3 >= 0) {
            if (i6 >= i3) {
                if (i6 <= str.length()) {
                    while (i3 < i6) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 < 128) {
                            r C = C(1);
                            int i7 = C.f4154c - i3;
                            int min = Math.min(i6, 8192 - i7);
                            int i8 = i3 + 1;
                            byte[] bArr = C.f4152a;
                            bArr[i3 + i7] = (byte) charAt2;
                            while (true) {
                                i3 = i8;
                                if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                                    int i9 = C.f4154c;
                                    int i10 = (i7 + i3) - i9;
                                    C.f4154c = i9 + i10;
                                    this.f4128e += (long) i10;
                                } else {
                                    i8 = i3 + 1;
                                    bArr[i3 + i7] = (byte) charAt;
                                }
                            }
                            int i92 = C.f4154c;
                            int i102 = (i7 + i3) - i92;
                            C.f4154c = i92 + i102;
                            this.f4128e += (long) i102;
                        } else {
                            if (charAt2 < 2048) {
                                r C2 = C(2);
                                int i11 = C2.f4154c;
                                byte[] bArr2 = C2.f4152a;
                                bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                                C2.f4154c = i11 + 2;
                                j7 = this.f4128e;
                                j6 = 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                r C3 = C(3);
                                int i12 = C3.f4154c;
                                byte[] bArr3 = C3.f4152a;
                                bArr3[i12] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                                C3.f4154c = i12 + 3;
                                j7 = this.f4128e;
                                j6 = 3;
                            } else {
                                int i13 = i3 + 1;
                                char charAt3 = i13 < i6 ? str.charAt(i13) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    G(63);
                                    i3 = i13;
                                } else {
                                    int i14 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    r C4 = C(4);
                                    int i15 = C4.f4154c;
                                    byte[] bArr4 = C4.f4152a;
                                    bArr4[i15] = (byte) ((i14 >> 18) | 240);
                                    bArr4[i15 + 1] = (byte) (((i14 >> 12) & 63) | 128);
                                    bArr4[i15 + 2] = (byte) (((i14 >> 6) & 63) | 128);
                                    bArr4[i15 + 3] = (byte) ((i14 & 63) | 128);
                                    C4.f4154c = i15 + 4;
                                    this.f4128e += 4;
                                    i3 += 2;
                                }
                            }
                            this.f4128e = j7 + j6;
                            i3++;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i6 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i6 + " < " + i3).toString());
        }
        throw new IllegalArgumentException(m.g("beginIndex < 0: ", i3).toString());
    }

    public final void L(String str) {
        o.m(str, "string");
        K(0, str.length(), str);
    }

    public final void M(int i3) {
        long j6;
        long j7;
        String str;
        if (i3 < 128) {
            G(i3);
            return;
        }
        if (i3 < 2048) {
            r C = C(2);
            int i6 = C.f4154c;
            byte[] bArr = C.f4152a;
            bArr[i6] = (byte) ((i3 >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i3 & 63) | 128);
            C.f4154c = i6 + 2;
            j7 = this.f4128e;
            j6 = 2;
        } else if (55296 <= i3 && 57343 >= i3) {
            G(63);
            return;
        } else if (i3 < 65536) {
            r C2 = C(3);
            int i7 = C2.f4154c;
            byte[] bArr2 = C2.f4152a;
            bArr2[i7] = (byte) ((i3 >> 12) | 224);
            bArr2[i7 + 1] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[i7 + 2] = (byte) ((i3 & 63) | 128);
            C2.f4154c = i7 + 3;
            j7 = this.f4128e;
            j6 = 3;
        } else if (i3 <= 1114111) {
            r C3 = C(4);
            int i8 = C3.f4154c;
            byte[] bArr3 = C3.f4152a;
            bArr3[i8] = (byte) ((i3 >> 18) | 240);
            bArr3[i8 + 1] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[i8 + 2] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[i8 + 3] = (byte) ((i3 & 63) | 128);
            C3.f4154c = i8 + 4;
            j7 = this.f4128e;
            j6 = 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i3 != 0) {
                char[] cArr = d.f1702c;
                int i9 = 0;
                char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
                while (i9 < 8 && cArr2[i9] == '0') {
                    i9++;
                }
                str = new String(cArr2, i9, 8 - i9);
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4128e = j7 + j6;
    }

    public final void a(long j6) {
        while (j6 > 0) {
            r rVar = this.f4127d;
            if (rVar != null) {
                int min = (int) Math.min(j6, (long) (rVar.f4154c - rVar.f4153b));
                long j7 = (long) min;
                this.f4128e -= j7;
                j6 -= j7;
                int i3 = rVar.f4153b + min;
                rVar.f4153b = i3;
                if (i3 == rVar.f4154c) {
                    this.f4127d = rVar.a();
                    s.a(rVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void b(g gVar, long j6, long j7) {
        o.m(gVar, "out");
        e.g(this.f4128e, j6, j7);
        if (j7 != 0) {
            gVar.f4128e += j7;
            r rVar = this.f4127d;
            while (true) {
                o.k(rVar);
                long j8 = (long) (rVar.f4154c - rVar.f4153b);
                if (j6 < j8) {
                    break;
                }
                j6 -= j8;
                rVar = rVar.f4157f;
            }
            while (j7 > 0) {
                o.k(rVar);
                r c6 = rVar.c();
                int i3 = c6.f4153b + ((int) j6);
                c6.f4153b = i3;
                c6.f4154c = Math.min(i3 + ((int) j7), c6.f4154c);
                r rVar2 = gVar.f4127d;
                if (rVar2 == null) {
                    c6.f4158g = c6;
                    c6.f4157f = c6;
                    gVar.f4127d = c6;
                } else {
                    r rVar3 = rVar2.f4158g;
                    o.k(rVar3);
                    rVar3.b(c6);
                }
                j7 -= (long) (c6.f4154c - c6.f4153b);
                rVar = rVar.f4157f;
                j6 = 0;
            }
        }
    }

    public final x c() {
        return x.f4164d;
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f4128e != 0) {
            r rVar = this.f4127d;
            o.k(rVar);
            r c6 = rVar.c();
            gVar.f4127d = c6;
            c6.f4158g = c6;
            c6.f4157f = c6;
            for (r rVar2 = rVar.f4157f; rVar2 != rVar; rVar2 = rVar2.f4157f) {
                r rVar3 = c6.f4158g;
                o.k(rVar3);
                o.k(rVar2);
                rVar3.b(rVar2.c());
            }
            gVar.f4128e = this.f4128e;
        }
        return gVar;
    }

    public final void close() {
    }

    public final h d(byte[] bArr) {
        o.m(bArr, "source");
        E(bArr, 0, bArr.length);
        return this;
    }

    public final byte e(long j6) {
        e.g(this.f4128e, j6, 1);
        r rVar = this.f4127d;
        if (rVar != null) {
            long j7 = this.f4128e;
            if (j7 - j6 < j6) {
                while (j7 > j6) {
                    rVar = rVar.f4158g;
                    o.k(rVar);
                    j7 -= (long) (rVar.f4154c - rVar.f4153b);
                }
                return rVar.f4152a[(int) ((((long) rVar.f4153b) + j6) - j7)];
            }
            long j8 = 0;
            while (true) {
                int i3 = rVar.f4154c;
                int i6 = rVar.f4153b;
                long j9 = ((long) (i3 - i6)) + j8;
                if (j9 > j6) {
                    return rVar.f4152a[(int) ((((long) i6) + j6) - j8)];
                }
                rVar = rVar.f4157f;
                o.k(rVar);
                j8 = j9;
            }
        } else {
            o.k((Object) null);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x0008
            goto L_0x0072
        L_0x0008:
            boolean r2 = r1 instanceof l5.g
            if (r2 != 0) goto L_0x000d
            goto L_0x0052
        L_0x000d:
            long r2 = r0.f4128e
            l5.g r1 = (l5.g) r1
            long r4 = r1.f4128e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0018
            goto L_0x0052
        L_0x0018:
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x001f
            goto L_0x0072
        L_0x001f:
            l5.r r2 = r0.f4127d
            b1.o.k(r2)
            l5.r r1 = r1.f4127d
            b1.o.k(r1)
            int r3 = r2.f4153b
            int r6 = r1.f4153b
            r7 = r4
        L_0x002e:
            long r9 = r0.f4128e
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0072
            int r9 = r2.f4154c
            int r9 = r9 - r3
            int r10 = r1.f4154c
            int r10 = r10 - r6
            int r9 = java.lang.Math.min(r9, r10)
            long r9 = (long) r9
            r11 = r4
        L_0x0040:
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x005a
            int r13 = r3 + 1
            byte[] r14 = r2.f4152a
            byte r3 = r14[r3]
            int r14 = r6 + 1
            byte[] r15 = r1.f4152a
            byte r6 = r15[r6]
            if (r3 == r6) goto L_0x0054
        L_0x0052:
            r1 = 0
            goto L_0x0073
        L_0x0054:
            r15 = 1
            long r11 = r11 + r15
            r3 = r13
            r6 = r14
            goto L_0x0040
        L_0x005a:
            int r11 = r2.f4154c
            if (r3 != r11) goto L_0x0065
            l5.r r2 = r2.f4157f
            b1.o.k(r2)
            int r3 = r2.f4153b
        L_0x0065:
            int r11 = r1.f4154c
            if (r6 != r11) goto L_0x0070
            l5.r r1 = r1.f4157f
            b1.o.k(r1)
            int r6 = r1.f4153b
        L_0x0070:
            long r7 = r7 + r9
            goto L_0x002e
        L_0x0072:
            r1 = 1
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.g.equals(java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ h f(long j6) {
        H(j6);
        return this;
    }

    public final void flush() {
    }

    public final j g(long j6) {
        if (!(j6 >= 0 && j6 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        } else if (this.f4128e < j6) {
            throw new EOFException();
        } else if (j6 < ((long) 4096)) {
            return new j(n(j6));
        } else {
            j q5 = q((int) j6);
            a(j6);
            return q5;
        }
    }

    public final String h(long j6) {
        if (j6 >= 0) {
            long j7 = Long.MAX_VALUE;
            if (j6 != Long.MAX_VALUE) {
                j7 = j6 + 1;
            }
            byte b6 = (byte) 10;
            long i3 = i(b6, 0, j7);
            if (i3 != -1) {
                return a.a(this, i3);
            }
            if (j7 < this.f4128e && e(j7 - 1) == ((byte) 13) && e(j7) == b6) {
                return a.a(this, j7);
            }
            g gVar = new g();
            b(gVar, 0, Math.min((long) 32, this.f4128e));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f4128e, j6) + " content=" + gVar.g(gVar.f4128e).c() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j6).toString());
    }

    public final int hashCode() {
        r rVar = this.f4127d;
        if (rVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i6 = rVar.f4154c;
            for (int i7 = rVar.f4153b; i7 < i6; i7++) {
                i3 = (i3 * 31) + rVar.f4152a[i7];
            }
            rVar = rVar.f4157f;
            o.k(rVar);
        } while (rVar != this.f4127d);
        return i3;
    }

    public final long i(byte b6, long j6, long j7) {
        r rVar;
        long j8 = 0;
        if (0 <= j6 && j7 >= j6) {
            long j9 = this.f4128e;
            if (j7 > j9) {
                j7 = j9;
            }
            if (!(j6 == j7 || (rVar = this.f4127d) == null)) {
                if (j9 - j6 < j6) {
                    while (j9 > j6) {
                        rVar = rVar.f4158g;
                        o.k(rVar);
                        j9 -= (long) (rVar.f4154c - rVar.f4153b);
                    }
                    while (j9 < j7) {
                        int min = (int) Math.min((long) rVar.f4154c, (((long) rVar.f4153b) + j7) - j9);
                        for (int i3 = (int) ((((long) rVar.f4153b) + j6) - j9); i3 < min; i3++) {
                            if (rVar.f4152a[i3] == b6) {
                                return ((long) (i3 - rVar.f4153b)) + j9;
                            }
                        }
                        j9 += (long) (rVar.f4154c - rVar.f4153b);
                        rVar = rVar.f4157f;
                        o.k(rVar);
                        j6 = j9;
                    }
                } else {
                    while (true) {
                        long j10 = ((long) (rVar.f4154c - rVar.f4153b)) + j8;
                        if (j10 > j6) {
                            break;
                        }
                        rVar = rVar.f4157f;
                        o.k(rVar);
                        j8 = j10;
                    }
                    while (j8 < j7) {
                        int min2 = (int) Math.min((long) rVar.f4154c, (((long) rVar.f4153b) + j7) - j8);
                        for (int i6 = (int) ((((long) rVar.f4153b) + j6) - j8); i6 < min2; i6++) {
                            if (rVar.f4152a[i6] == b6) {
                                return ((long) (i6 - rVar.f4153b)) + j8;
                            }
                        }
                        j8 += (long) (rVar.f4154c - rVar.f4153b);
                        rVar = rVar.f4157f;
                        o.k(rVar);
                        j6 = j8;
                    }
                }
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f4128e + " fromIndex=" + j6 + " toIndex=" + j7).toString());
    }

    public final boolean isOpen() {
        return true;
    }

    public final /* bridge */ /* synthetic */ h j(j jVar) {
        D(jVar);
        return this;
    }

    public final /* bridge */ /* synthetic */ h k(int i3) {
        J(i3);
        return this;
    }

    public final int l(byte[] bArr, int i3, int i6) {
        o.m(bArr, "sink");
        e.g((long) bArr.length, (long) i3, (long) i6);
        r rVar = this.f4127d;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i6, rVar.f4154c - rVar.f4153b);
        int i7 = rVar.f4153b;
        h.X(i3, i7, i7 + min, rVar.f4152a, bArr);
        int i8 = rVar.f4153b + min;
        rVar.f4153b = i8;
        this.f4128e -= (long) min;
        if (i8 != rVar.f4154c) {
            return min;
        }
        this.f4127d = rVar.a();
        s.a(rVar);
        return min;
    }

    public final /* bridge */ /* synthetic */ h m(int i3) {
        I(i3);
        return this;
    }

    public final byte[] n(long j6) {
        int i3 = 0;
        if (!(j6 >= 0 && j6 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        } else if (this.f4128e >= j6) {
            int i6 = (int) j6;
            byte[] bArr = new byte[i6];
            while (i3 < i6) {
                int l6 = l(bArr, i3, i6 - i3);
                if (l6 != -1) {
                    i3 += l6;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final long o(g gVar, long j6) {
        o.m(gVar, "sink");
        if (j6 >= 0) {
            long j7 = this.f4128e;
            if (j7 == 0) {
                return -1;
            }
            if (j6 > j7) {
                j6 = j7;
            }
            gVar.t(this, j6);
            return j6;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
    }

    public final String p(long j6, Charset charset) {
        o.m(charset, "charset");
        int i3 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
        if (!(i3 >= 0 && j6 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        } else if (this.f4128e < j6) {
            throw new EOFException();
        } else if (i3 == 0) {
            return "";
        } else {
            r rVar = this.f4127d;
            o.k(rVar);
            int i6 = rVar.f4153b;
            if (((long) i6) + j6 > ((long) rVar.f4154c)) {
                return new String(n(j6), charset);
            }
            int i7 = (int) j6;
            String str = new String(rVar.f4152a, i6, i7, charset);
            int i8 = rVar.f4153b + i7;
            rVar.f4153b = i8;
            this.f4128e -= j6;
            if (i8 == rVar.f4154c) {
                this.f4127d = rVar.a();
                s.a(rVar);
            }
            return str;
        }
    }

    public final j q(int i3) {
        if (i3 == 0) {
            return j.f4129g;
        }
        e.g(this.f4128e, 0, (long) i3);
        r rVar = this.f4127d;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            o.k(rVar);
            int i9 = rVar.f4154c;
            int i10 = rVar.f4153b;
            if (i9 != i10) {
                i7 += i9 - i10;
                i8++;
                rVar = rVar.f4157f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i8][];
        int[] iArr = new int[(i8 * 2)];
        r rVar2 = this.f4127d;
        int i11 = 0;
        while (i6 < i3) {
            o.k(rVar2);
            bArr[i11] = rVar2.f4152a;
            i6 += rVar2.f4154c - rVar2.f4153b;
            iArr[i11] = Math.min(i6, i3);
            iArr[i11 + i8] = rVar2.f4153b;
            rVar2.f4155d = true;
            i11++;
            rVar2 = rVar2.f4157f;
        }
        return new t(bArr, iArr);
    }

    public final String r() {
        return h(Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        o.m(byteBuffer, "sink");
        r rVar = this.f4127d;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f4154c - rVar.f4153b);
        byteBuffer.put(rVar.f4152a, rVar.f4153b, min);
        int i3 = rVar.f4153b + min;
        rVar.f4153b = i3;
        this.f4128e -= (long) min;
        if (i3 == rVar.f4154c) {
            this.f4127d = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final byte readByte() {
        if (this.f4128e != 0) {
            r rVar = this.f4127d;
            o.k(rVar);
            int i3 = rVar.f4153b;
            int i6 = rVar.f4154c;
            int i7 = i3 + 1;
            byte b6 = rVar.f4152a[i3];
            this.f4128e--;
            if (i7 == i6) {
                this.f4127d = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4153b = i7;
            }
            return b6;
        }
        throw new EOFException();
    }

    public final int readInt() {
        if (this.f4128e >= 4) {
            r rVar = this.f4127d;
            o.k(rVar);
            int i3 = rVar.f4153b;
            int i6 = rVar.f4154c;
            if (((long) (i6 - i3)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i7 = i3 + 1;
            byte[] bArr = rVar.f4152a;
            int i8 = i7 + 1;
            byte b6 = ((bArr[i3] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            byte b7 = b6 | ((bArr[i8] & 255) << 8);
            int i10 = i9 + 1;
            byte b8 = b7 | (bArr[i9] & 255);
            this.f4128e -= 4;
            if (i10 == i6) {
                this.f4127d = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4153b = i10;
            }
            return b8;
        }
        throw new EOFException();
    }

    public final short readShort() {
        if (this.f4128e >= 2) {
            r rVar = this.f4127d;
            o.k(rVar);
            int i3 = rVar.f4153b;
            int i6 = rVar.f4154c;
            if (i6 - i3 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i7 = i3 + 1;
            byte[] bArr = rVar.f4152a;
            int i8 = i7 + 1;
            byte b6 = ((bArr[i3] & 255) << 8) | (bArr[i7] & 255);
            this.f4128e -= 2;
            if (i8 == i6) {
                this.f4127d = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4153b = i8;
            }
            return (short) b6;
        }
        throw new EOFException();
    }

    public final void s(long j6) {
        if (this.f4128e < j6) {
            throw new EOFException();
        }
    }

    public final void t(g gVar, long j6) {
        int i3;
        r rVar;
        o.m(gVar, "source");
        if (gVar != this) {
            e.g(gVar.f4128e, 0, j6);
            while (j6 > 0) {
                r rVar2 = gVar.f4127d;
                o.k(rVar2);
                int i6 = rVar2.f4154c;
                r rVar3 = gVar.f4127d;
                o.k(rVar3);
                if (j6 < ((long) (i6 - rVar3.f4153b))) {
                    r rVar4 = this.f4127d;
                    r rVar5 = rVar4 != null ? rVar4.f4158g : null;
                    if (rVar5 != null && rVar5.f4156e) {
                        if ((((long) rVar5.f4154c) + j6) - ((long) (rVar5.f4155d ? 0 : rVar5.f4153b)) <= ((long) 8192)) {
                            r rVar6 = gVar.f4127d;
                            o.k(rVar6);
                            rVar6.d(rVar5, (int) j6);
                            gVar.f4128e -= j6;
                            this.f4128e += j6;
                            return;
                        }
                    }
                    r rVar7 = gVar.f4127d;
                    o.k(rVar7);
                    int i7 = (int) j6;
                    if (i7 > 0 && i7 <= rVar7.f4154c - rVar7.f4153b) {
                        if (i7 >= 1024) {
                            rVar = rVar7.c();
                        } else {
                            rVar = s.b();
                            int i8 = rVar7.f4153b;
                            h.X(0, i8, i8 + i7, rVar7.f4152a, rVar.f4152a);
                        }
                        rVar.f4154c = rVar.f4153b + i7;
                        rVar7.f4153b += i7;
                        r rVar8 = rVar7.f4158g;
                        o.k(rVar8);
                        rVar8.b(rVar);
                        gVar.f4127d = rVar;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                r rVar9 = gVar.f4127d;
                o.k(rVar9);
                long j7 = (long) (rVar9.f4154c - rVar9.f4153b);
                gVar.f4127d = rVar9.a();
                r rVar10 = this.f4127d;
                if (rVar10 == null) {
                    this.f4127d = rVar9;
                    rVar9.f4158g = rVar9;
                    rVar9.f4157f = rVar9;
                } else {
                    r rVar11 = rVar10.f4158g;
                    o.k(rVar11);
                    rVar11.b(rVar9);
                    r rVar12 = rVar9.f4158g;
                    if (rVar12 != rVar9) {
                        o.k(rVar12);
                        if (rVar12.f4156e) {
                            int i9 = rVar9.f4154c - rVar9.f4153b;
                            r rVar13 = rVar9.f4158g;
                            o.k(rVar13);
                            int i10 = 8192 - rVar13.f4154c;
                            r rVar14 = rVar9.f4158g;
                            o.k(rVar14);
                            if (rVar14.f4155d) {
                                i3 = 0;
                            } else {
                                r rVar15 = rVar9.f4158g;
                                o.k(rVar15);
                                i3 = rVar15.f4153b;
                            }
                            if (i9 <= i10 + i3) {
                                r rVar16 = rVar9.f4158g;
                                o.k(rVar16);
                                rVar9.d(rVar16, i9);
                                rVar9.a();
                                s.a(rVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                gVar.f4128e -= j7;
                this.f4128e += j7;
                j6 -= j7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final String toString() {
        long j6 = this.f4128e;
        if (j6 <= ((long) Integer.MAX_VALUE)) {
            return q((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4128e).toString());
    }

    public final /* bridge */ /* synthetic */ h u(String str) {
        L(str);
        return this;
    }

    public final int v(o oVar) {
        o.m(oVar, "options");
        int b6 = a.b(this, oVar, false);
        if (b6 == -1) {
            return -1;
        }
        a((long) oVar.f4144d[b6].b());
        return b6;
    }

    public final g w() {
        return this;
    }

    public final int write(ByteBuffer byteBuffer) {
        o.m(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            r C = C(1);
            int min = Math.min(i3, 8192 - C.f4154c);
            byteBuffer.get(C.f4152a, C.f4154c, min);
            i3 -= min;
            C.f4154c += min;
        }
        this.f4128e += (long) remaining;
        return remaining;
    }

    public final boolean x() {
        return this.f4128e == 0;
    }

    public final /* bridge */ /* synthetic */ h y(int i3) {
        G(i3);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098 A[EDGE_INSN: B:42:0x0098->B:28:0x0098 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long z() {
        /*
            r14 = this;
            long r0 = r14.f4128e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        L_0x000c:
            l5.r r7 = r14.f4127d
            b1.o.k(r7)
            int r8 = r7.f4153b
            int r9 = r7.f4154c
        L_0x0015:
            if (r8 >= r9) goto L_0x0098
            byte[] r10 = r7.f4152a
            byte r10 = r10[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0028
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0028
            int r11 = r10 - r11
            goto L_0x0041
        L_0x0028:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0033
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0070
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0070
        L_0x003d:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L_0x0041:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0051
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0051:
            l5.g r0 = new l5.g
            r0.<init>()
            r0.H(r4)
            r0.G(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            long r2 = r0.f4128e
            java.nio.charset.Charset r4 = v4.a.f5409a
            java.lang.String r0 = r0.p(r2, r4)
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0070:
            r6 = 1
            if (r1 == 0) goto L_0x0074
            goto L_0x0098
        L_0x0074:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = com.bumptech.glide.d.f1702c
            int r4 = r10 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r2[r0] = r4
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r6] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0098:
            if (r8 != r9) goto L_0x00a4
            l5.r r8 = r7.a()
            r14.f4127d = r8
            l5.s.a(r7)
            goto L_0x00a6
        L_0x00a4:
            r7.f4153b = r8
        L_0x00a6:
            if (r6 != 0) goto L_0x00ac
            l5.r r7 = r14.f4127d
            if (r7 != 0) goto L_0x000c
        L_0x00ac:
            long r2 = r14.f4128e
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f4128e = r2
            return r4
        L_0x00b3:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.g.z():long");
    }
}
