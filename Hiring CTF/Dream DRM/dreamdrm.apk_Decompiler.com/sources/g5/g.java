package g5;

import a2.m;
import a5.c;
import androidx.fragment.app.n0;
import b1.o;
import l5.j;
import v4.i;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final j f2975a = n0.n("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2976b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2977c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f2978d;

    static {
        j jVar = j.f4129g;
        String[] strArr = new String[256];
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            o.l(binaryString, "Integer.toBinaryString(it)");
            String replace = c.g("%8s", binaryString).replace(' ', '0');
            o.l(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i3] = replace;
        }
        f2978d = strArr;
        String[] strArr2 = f2977c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = "END_STREAM|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f2977c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + "|" + strArr3[i7];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i8]);
            sb.append("|");
            strArr3[i9 | 8] = m.j(sb, strArr3[i7], "|PADDED");
        }
        int length = f2977c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f2977c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f2978d[i10];
            }
        }
    }

    public static String a(int i3, int i6, int i7, int i8, boolean z5) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f2976b;
        String g6 = i7 < strArr.length ? strArr[i7] : c.g("0x%02x", Integer.valueOf(i7));
        if (i8 == 0) {
            str = "";
        } else {
            String[] strArr2 = f2978d;
            if (!(i7 == 2 || i7 == 3)) {
                if (i7 == 4 || i7 == 6) {
                    str = i8 == 1 ? "ACK" : strArr2[i8];
                } else if (!(i7 == 7 || i7 == 8)) {
                    String[] strArr3 = f2977c;
                    if (i8 < strArr3.length) {
                        str2 = strArr3[i8];
                        o.k(str2);
                    } else {
                        str2 = strArr2[i8];
                    }
                    if (i7 == 5 && (i8 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i7 != 0 || (i8 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = i.g0(str2, str4, str3);
                }
            }
            str = strArr2[i8];
        }
        return c.g("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i3), Integer.valueOf(i6), g6, str);
    }
}
