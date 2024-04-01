package l5;

import androidx.fragment.app.n0;
import b1.o;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import java.io.Serializable;
import java.util.Arrays;
import v4.a;

public class j implements Serializable, Comparable {

    /* renamed from: g  reason: collision with root package name */
    public static final j f4129g = new j(new byte[0]);

    /* renamed from: d  reason: collision with root package name */
    public transient int f4130d;

    /* renamed from: e  reason: collision with root package name */
    public transient String f4131e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f4132f;

    static {
        new n0(25, 0);
    }

    public j(byte[] bArr) {
        o.m(bArr, "data");
        this.f4132f = bArr;
    }

    public String a() {
        byte[] bArr = a.f4112a;
        byte[] bArr2 = this.f4132f;
        o.m(bArr2, "$this$encodeBase64");
        o.m(bArr, "map");
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i3 = 0;
        int i6 = 0;
        while (i3 < length) {
            int i7 = i3 + 1;
            byte b6 = bArr2[i3];
            int i8 = i7 + 1;
            byte b7 = bArr2[i7];
            int i9 = i8 + 1;
            byte b8 = bArr2[i8];
            int i10 = i6 + 1;
            bArr3[i6] = bArr[(b6 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i12 = i11 + 1;
            bArr3[i11] = bArr[((b7 & 15) << 2) | ((b8 & 255) >> 6)];
            i6 = i12 + 1;
            bArr3[i12] = bArr[b8 & 63];
            i3 = i9;
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b9 = bArr2[i3];
            int i13 = i6 + 1;
            bArr3[i6] = bArr[(b9 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr[(b9 & 3) << 4];
            byte b10 = (byte) 61;
            bArr3[i14] = b10;
            bArr3[i14 + 1] = b10;
        } else if (length2 == 2) {
            int i15 = i3 + 1;
            byte b11 = bArr2[i3];
            byte b12 = bArr2[i15];
            int i16 = i6 + 1;
            bArr3[i6] = bArr[(b11 & 255) >> 2];
            int i17 = i16 + 1;
            bArr3[i16] = bArr[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr3[i17] = bArr[(b12 & 15) << 2];
            bArr3[i17 + 1] = (byte) 61;
        }
        return new String(bArr3, a.f5409a);
    }

    public int b() {
        return this.f4132f.length;
    }

    public String c() {
        byte[] bArr = this.f4132f;
        char[] cArr = new char[(bArr.length * 2)];
        int i3 = 0;
        for (byte b6 : bArr) {
            int i6 = i3 + 1;
            char[] cArr2 = d.f1702c;
            cArr[i3] = cArr2[(b6 >> 4) & 15];
            i3 = i6 + 1;
            cArr[i6] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            l5.j r8 = (l5.j) r8
            java.lang.String r0 = "other"
            b1.o.m(r8, r0)
            int r0 = r7.b()
            int r1 = r8.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            if (r4 >= r2) goto L_0x002b
            byte r5 = r7.e(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.e(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0028:
            if (r5 >= r6) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.j.compareTo(java.lang.Object):int");
    }

    public byte[] d() {
        return this.f4132f;
    }

    public byte e(int i3) {
        return this.f4132f[i3];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int b6 = jVar.b();
            byte[] bArr = this.f4132f;
            if (b6 == bArr.length && jVar.f(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i3, byte[] bArr, int i6, int i7) {
        o.m(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f4132f;
            return i3 <= bArr2.length - i7 && i6 >= 0 && i6 <= bArr.length - i7 && e.c(i3, i6, i7, bArr2, bArr);
        }
    }

    public boolean g(j jVar, int i3) {
        o.m(jVar, "other");
        return jVar.f(0, this.f4132f, 0, i3);
    }

    public j h() {
        byte b6;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f4132f;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i3];
            byte b8 = (byte) 65;
            if (b7 < b8 || b7 > (b6 = (byte) 90)) {
                i3++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                o.l(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i3] = (byte) (b7 + 32);
                for (int i6 = i3 + 1; i6 < copyOf.length; i6++) {
                    byte b9 = copyOf[i6];
                    if (b9 >= b8 && b9 <= b6) {
                        copyOf[i6] = (byte) (b9 + 32);
                    }
                }
                return new j(copyOf);
            }
        }
    }

    public int hashCode() {
        int i3 = this.f4130d;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f4132f);
        this.f4130d = hashCode;
        return hashCode;
    }

    public final String i() {
        String str = this.f4131e;
        if (str != null) {
            return str;
        }
        byte[] d6 = d();
        o.m(d6, "$this$toUtf8String");
        String str2 = new String(d6, a.f5409a);
        this.f4131e = str2;
        return str2;
    }

    public void j(g gVar, int i3) {
        o.m(gVar, "buffer");
        gVar.E(this.f4132f, 0, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011a, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0157, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0168, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0179, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0188, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x019e, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01a6, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ad, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01e2, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x01e5, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0087, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0096, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00df, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f0, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00ff, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0111, code lost:
        if (r6 == 64) goto L_0x01e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f4132f
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02ac
        L_0x0010:
            int r2 = r1.length
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0014:
            r9 = 64
            if (r5 >= r2) goto L_0x01e6
            byte r10 = r1[r5]
            r11 = 13
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 31
            r4 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            r3 = 10
            if (r10 < 0) goto L_0x007c
            int r16 = r6 + 1
            if (r6 != r9) goto L_0x0031
            goto L_0x01e6
        L_0x0031:
            if (r10 == r3) goto L_0x0043
            if (r10 == r11) goto L_0x0043
            if (r10 < 0) goto L_0x0039
            if (r14 >= r10) goto L_0x003e
        L_0x0039:
            if (r13 <= r10) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r12 < r10) goto L_0x0040
        L_0x003e:
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r6 != 0) goto L_0x01e5
        L_0x0043:
            if (r10 != r4) goto L_0x0047
            goto L_0x01e5
        L_0x0047:
            if (r10 >= r15) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 2
        L_0x004c:
            int r7 = r7 + r6
            int r5 = r5 + 1
        L_0x004f:
            r6 = r16
            if (r5 >= r2) goto L_0x0014
            byte r10 = r1[r5]
            if (r10 < 0) goto L_0x0014
            int r5 = r5 + 1
            int r16 = r6 + 1
            if (r6 != r9) goto L_0x005f
            goto L_0x01e6
        L_0x005f:
            if (r10 == r3) goto L_0x0071
            if (r10 == r11) goto L_0x0071
            if (r10 < 0) goto L_0x0067
            if (r14 >= r10) goto L_0x006c
        L_0x0067:
            if (r13 <= r10) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            if (r12 < r10) goto L_0x006e
        L_0x006c:
            r6 = 1
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 != 0) goto L_0x01e5
        L_0x0071:
            if (r10 != r4) goto L_0x0075
            goto L_0x01e5
        L_0x0075:
            if (r10 >= r15) goto L_0x0079
            r6 = 1
            goto L_0x007a
        L_0x0079:
            r6 = 2
        L_0x007a:
            int r7 = r7 + r6
            goto L_0x004f
        L_0x007c:
            int r8 = r10 >> 5
            r15 = -2
            r4 = 128(0x80, float:1.794E-43)
            if (r8 != r15) goto L_0x00d1
            int r8 = r5 + 1
            if (r2 > r8) goto L_0x008b
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x008b:
            byte r8 = r1[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x0093
            r15 = 1
            goto L_0x0094
        L_0x0093:
            r15 = 0
        L_0x0094:
            if (r15 != 0) goto L_0x009a
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x009a:
            r8 = r8 ^ 3968(0xf80, float:5.56E-42)
            int r10 = r10 << 6
            r8 = r8 ^ r10
            if (r8 >= r4) goto L_0x00a5
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x00a5:
            int r4 = r6 + 1
            if (r6 != r9) goto L_0x00ab
            goto L_0x01e6
        L_0x00ab:
            if (r8 == r3) goto L_0x00bd
            if (r8 == r11) goto L_0x00bd
            if (r8 < 0) goto L_0x00b3
            if (r14 >= r8) goto L_0x00b8
        L_0x00b3:
            if (r13 <= r8) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            if (r12 < r8) goto L_0x00ba
        L_0x00b8:
            r3 = 1
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 != 0) goto L_0x01e5
        L_0x00bd:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r8 != r3) goto L_0x00c4
            goto L_0x01e5
        L_0x00c4:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r8 >= r3) goto L_0x00ca
            r15 = 1
            goto L_0x00cb
        L_0x00ca:
            r15 = 2
        L_0x00cb:
            int r7 = r7 + r15
            int r5 = r5 + 2
            r6 = r4
            goto L_0x0014
        L_0x00d1:
            int r8 = r10 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            if (r8 != r15) goto L_0x014f
            int r8 = r5 + 2
            if (r2 > r8) goto L_0x00e3
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x00e3:
            int r15 = r5 + 1
            byte r15 = r1[r15]
            r14 = r15 & 192(0xc0, float:2.69E-43)
            if (r14 != r4) goto L_0x00ed
            r14 = 1
            goto L_0x00ee
        L_0x00ed:
            r14 = 0
        L_0x00ee:
            if (r14 != 0) goto L_0x00f4
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x00f4:
            byte r8 = r1[r8]
            r14 = r8 & 192(0xc0, float:2.69E-43)
            if (r14 != r4) goto L_0x00fc
            r4 = 1
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            if (r4 != 0) goto L_0x0103
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x0103:
            r4 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r8
            int r8 = r15 << 6
            r4 = r4 ^ r8
            int r8 = r10 << 12
            r4 = r4 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r4 >= r8) goto L_0x0115
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x0115:
            if (r12 <= r4) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            if (r13 < r4) goto L_0x011e
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x011e:
            int r8 = r6 + 1
            if (r6 != r9) goto L_0x0124
            goto L_0x01e6
        L_0x0124:
            if (r4 == r3) goto L_0x013c
            if (r4 == r11) goto L_0x013c
            if (r4 < 0) goto L_0x012e
            r3 = 31
            if (r3 >= r4) goto L_0x0137
        L_0x012e:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L_0x0133
            goto L_0x0139
        L_0x0133:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x0139
        L_0x0137:
            r3 = 1
            goto L_0x013a
        L_0x0139:
            r3 = 0
        L_0x013a:
            if (r3 != 0) goto L_0x01e5
        L_0x013c:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x0143
            goto L_0x01e5
        L_0x0143:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x0149
            r15 = 1
            goto L_0x014a
        L_0x0149:
            r15 = 2
        L_0x014a:
            int r7 = r7 + r15
            int r5 = r5 + 3
            goto L_0x01df
        L_0x014f:
            int r8 = r10 >> 3
            if (r8 != r15) goto L_0x01e2
            int r8 = r5 + 3
            if (r2 > r8) goto L_0x015b
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x015b:
            int r14 = r5 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r4) goto L_0x0165
            r15 = 1
            goto L_0x0166
        L_0x0165:
            r15 = 0
        L_0x0166:
            if (r15 != 0) goto L_0x016c
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x016c:
            int r15 = r5 + 2
            byte r15 = r1[r15]
            r11 = r15 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L_0x0176
            r11 = 1
            goto L_0x0177
        L_0x0176:
            r11 = 0
        L_0x0177:
            if (r11 != 0) goto L_0x017d
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x017d:
            byte r8 = r1[r8]
            r11 = r8 & 192(0xc0, float:2.69E-43)
            if (r11 != r4) goto L_0x0185
            r4 = 1
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            if (r4 != 0) goto L_0x018c
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x018c:
            r4 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r8
            int r8 = r15 << 6
            r4 = r4 ^ r8
            int r8 = r14 << 12
            r4 = r4 ^ r8
            int r8 = r10 << 18
            r4 = r4 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r8) goto L_0x01a1
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x01a1:
            if (r12 <= r4) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            if (r13 < r4) goto L_0x01a9
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x01a9:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r8) goto L_0x01b0
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x01b0:
            int r8 = r6 + 1
            if (r6 != r9) goto L_0x01b5
            goto L_0x01e6
        L_0x01b5:
            if (r4 == r3) goto L_0x01cf
            r3 = 13
            if (r4 == r3) goto L_0x01cf
            if (r4 < 0) goto L_0x01c1
            r3 = 31
            if (r3 >= r4) goto L_0x01ca
        L_0x01c1:
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L_0x01c6
            goto L_0x01cc
        L_0x01c6:
            r3 = 159(0x9f, float:2.23E-43)
            if (r3 < r4) goto L_0x01cc
        L_0x01ca:
            r3 = 1
            goto L_0x01cd
        L_0x01cc:
            r3 = 0
        L_0x01cd:
            if (r3 != 0) goto L_0x01e5
        L_0x01cf:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r4 != r3) goto L_0x01d5
            goto L_0x01e5
        L_0x01d5:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r3) goto L_0x01db
            r15 = 1
            goto L_0x01dc
        L_0x01db:
            r15 = 2
        L_0x01dc:
            int r7 = r7 + r15
            int r5 = r5 + 4
        L_0x01df:
            r6 = r8
            goto L_0x0014
        L_0x01e2:
            if (r6 != r9) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r7 = -1
        L_0x01e6:
            java.lang.String r2 = "[size="
            r3 = -1
            if (r7 != r3) goto L_0x0252
            int r3 = r1.length
            if (r3 > r9) goto L_0x01fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r2 = r17.c()
            r1.append(r2)
            goto L_0x02a3
        L_0x01fe:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r1.length
            r3.append(r2)
            java.lang.String r2 = " hex="
            r3.append(r2)
            int r2 = r1.length
            if (r9 > r2) goto L_0x0211
            r4 = 1
            goto L_0x0212
        L_0x0211:
            r4 = 0
        L_0x0212:
            if (r4 == 0) goto L_0x0234
            int r2 = r1.length
            if (r9 != r2) goto L_0x0219
            r2 = r0
            goto L_0x022c
        L_0x0219:
            l5.j r2 = new l5.j
            int r4 = r1.length
            b1.v.p(r9, r4)
            r4 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r4, r9)
            java.lang.String r4 = "copyOfRange(this, fromIndex, toIndex)"
            b1.o.l(r1, r4)
            r2.<init>(r1)
        L_0x022c:
            java.lang.String r1 = r2.c()
            r3.append(r1)
            goto L_0x028f
        L_0x0234:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0252:
            java.lang.String r3 = r17.i()
            r4 = 0
            java.lang.String r4 = r3.substring(r4, r7)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            b1.o.l(r4, r5)
            java.lang.String r5 = "\\"
            java.lang.String r6 = "\\\\"
            java.lang.String r4 = v4.i.g0(r4, r5, r6)
            java.lang.String r5 = "\n"
            java.lang.String r6 = "\\n"
            java.lang.String r4 = v4.i.g0(r4, r5, r6)
            java.lang.String r5 = "\r"
            java.lang.String r6 = "\\r"
            java.lang.String r4 = v4.i.g0(r4, r5, r6)
            int r3 = r3.length()
            if (r7 >= r3) goto L_0x0299
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r1 = r1.length
            r3.append(r1)
            java.lang.String r1 = " text="
            r3.append(r1)
            r3.append(r4)
        L_0x028f:
            java.lang.String r1 = "…]"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x02ac
        L_0x0299:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r1.<init>(r2)
            r1.append(r4)
        L_0x02a3:
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.j.toString():java.lang.String");
    }
}
