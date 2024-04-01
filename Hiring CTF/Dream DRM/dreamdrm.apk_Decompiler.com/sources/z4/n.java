package z4;

import a5.c;
import b1.o;
import b1.v;
import g4.f;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import l5.g;
import v4.a;
import v4.i;

public final class n implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final n f6053b = new n();

    public static String a(String str, int i3, int i6, String str2, boolean z5, boolean z6, boolean z7, boolean z8, int i7) {
        String str3 = str;
        String str4 = str2;
        boolean z9 = false;
        int i8 = (i7 & 1) != 0 ? 0 : i3;
        int length = (i7 & 2) != 0 ? str.length() : i6;
        boolean z10 = (i7 & 8) != 0 ? false : z5;
        boolean z11 = (i7 & 16) != 0 ? false : z6;
        boolean z12 = (i7 & 32) != 0 ? false : z7;
        boolean z13 = (i7 & 64) != 0 ? false : z8;
        o.m(str3, "$this$canonicalize");
        int i9 = i8;
        while (i9 < length) {
            int codePointAt = str3.codePointAt(i9);
            int i10 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                if (!(i.X(str4, (char) codePointAt, 0, false, 2) >= 0) && ((codePointAt != 37 || (z10 && (!z11 || c(i9, length, str3)))) && (codePointAt != 43 || !z12))) {
                    i9 += Character.charCount(codePointAt);
                }
            }
            g gVar = new g();
            gVar.K(i8, i9, str3);
            g gVar2 = null;
            while (i9 < length) {
                int codePointAt2 = str3.codePointAt(i9);
                if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                    if (codePointAt2 != 43 || !z12) {
                        if (codePointAt2 >= 32 && codePointAt2 != i10) {
                            if (codePointAt2 < 128 || z13) {
                                if (!(i.X(str4, (char) codePointAt2, z9 ? 1 : 0, z9, 2) >= 0 ? true : z9) && (codePointAt2 != 37 || (z10 && (!z11 || c(i9, length, str3))))) {
                                    gVar.M(codePointAt2);
                                    i9 += Character.charCount(codePointAt2);
                                    z9 = false;
                                    i10 = 127;
                                }
                            }
                        }
                        if (gVar2 == null) {
                            gVar2 = new g();
                        }
                        gVar2.M(codePointAt2);
                        while (!gVar2.x()) {
                            byte readByte = gVar2.readByte() & 255;
                            gVar.G(37);
                            char[] cArr = t.f6069j;
                            gVar.G(cArr[(readByte >> 4) & 15]);
                            gVar.G(cArr[readByte & 15]);
                        }
                        i9 += Character.charCount(codePointAt2);
                        z9 = false;
                        i10 = 127;
                    } else {
                        gVar.L(z10 ? "+" : "%2B");
                    }
                }
                i9 += Character.charCount(codePointAt2);
                z9 = false;
                i10 = 127;
            }
            return gVar.p(gVar.f4128e, a.f5409a);
        }
        String substring = str3.substring(i8, length);
        o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static int b(String str) {
        o.m(str, "scheme");
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals("http")) {
            return 80;
        }
        return -1;
    }

    public static boolean c(int i3, int i6, String str) {
        int i7 = i3 + 2;
        return i7 < i6 && str.charAt(i3) == '%' && c.o(str.charAt(i3 + 1)) != -1 && c.o(str.charAt(i7)) != -1;
    }

    public static String e(String str, int i3, int i6, boolean z5, int i7) {
        int i8;
        int i9;
        if ((i7 & 1) != 0) {
            i3 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        o.m(str, "$this$percentDecode");
        int i10 = i3;
        while (i8 < i6) {
            char charAt = str.charAt(i8);
            if (charAt == '%' || (charAt == '+' && z5)) {
                g gVar = new g();
                gVar.K(i3, i8, str);
                while (i8 < i6) {
                    int codePointAt = str.codePointAt(i8);
                    if (codePointAt == 37 && (i9 = i8 + 2) < i6) {
                        int o5 = c.o(str.charAt(i8 + 1));
                        int o6 = c.o(str.charAt(i9));
                        if (!(o5 == -1 || o6 == -1)) {
                            gVar.G((o5 << 4) + o6);
                            i8 = Character.charCount(codePointAt) + i9;
                        }
                    } else if (codePointAt == 43 && z5) {
                        gVar.G(32);
                        i8++;
                    }
                    gVar.M(codePointAt);
                    i8 += Character.charCount(codePointAt);
                }
                return gVar.p(gVar.f4128e, a.f5409a);
            }
            i10 = i8 + 1;
        }
        String substring = str.substring(i3, i6);
        o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            int X = i.X(str, '&', i3, false, 4);
            if (X == -1) {
                X = str.length();
            }
            int X2 = i.X(str, '=', i3, false, 4);
            if (X2 == -1 || X2 > X) {
                String substring = str.substring(i3, X);
                o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                str2 = null;
            } else {
                String substring2 = str.substring(i3, X2);
                o.l(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                str2 = str.substring(X2 + 1, X);
                o.l(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            arrayList.add(str2);
            i3 = X + 1;
        }
        return arrayList;
    }

    public List d(String str) {
        o.m(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            o.l(allByName, "InetAddress.getAllByName(hostname)");
            int length = allByName.length;
            return length != 0 ? length != 1 ? new ArrayList(new f(allByName, false)) : v.D(allByName[0]) : g4.n.f2906d;
        } catch (NullPointerException e6) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e6);
            throw unknownHostException;
        }
    }
}
