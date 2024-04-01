package v4;

import a2.m;
import b1.o;
import b1.v;
import g4.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import s4.a;
import s4.b;
import s4.c;
import u4.e;

public abstract class i extends g {
    public static boolean R(CharSequence charSequence, String str) {
        o.m(charSequence, "<this>");
        return Y(charSequence, str, 0, false, 2) >= 0;
    }

    public static boolean S(String str, String str2) {
        o.m(str, "<this>");
        return str.endsWith(str2);
    }

    public static final boolean T(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final int U(CharSequence charSequence) {
        o.m(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int V(int i3, CharSequence charSequence, String str, boolean z5) {
        o.m(charSequence, "<this>");
        o.m(str, "string");
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        return W(charSequence, str, i3, charSequence.length(), z5, false);
    }

    public static final int W(CharSequence charSequence, CharSequence charSequence2, int i3, int i6, boolean z5, boolean z6) {
        a aVar;
        if (!z6) {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i6 > length) {
                i6 = length;
            }
            aVar = new c(i3, i6);
        } else {
            int U = U(charSequence);
            if (i3 > U) {
                i3 = U;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            aVar = new a(i3, i6, -1);
        }
        boolean z7 = charSequence instanceof String;
        int i7 = aVar.f5073d;
        int i8 = aVar.f5075f;
        int i9 = aVar.f5074e;
        if (!z7 || !(charSequence2 instanceof String)) {
            if ((i8 > 0 && i7 <= i9) || (i8 < 0 && i9 <= i7)) {
                while (true) {
                    if (!e0(charSequence2, 0, charSequence, i7, charSequence2.length(), z5)) {
                        if (i7 == i9) {
                            break;
                        }
                        i7 += i8;
                    } else {
                        return i7;
                    }
                }
            }
        } else if ((i8 > 0 && i7 <= i9) || (i8 < 0 && i9 <= i7)) {
            while (true) {
                if (!d0(0, i7, charSequence2.length(), (String) charSequence2, (String) charSequence, z5)) {
                    if (i7 == i9) {
                        break;
                    }
                    i7 += i8;
                } else {
                    return i7;
                }
            }
        }
        return -1;
    }

    public static int X(CharSequence charSequence, char c6, int i3, boolean z5, int i6) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        o.m(charSequence, "<this>");
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c6, i3);
        }
        return Z(i3, charSequence, z5, new char[]{c6});
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i3, boolean z5, int i6) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return V(i3, charSequence, str, z5);
    }

    public static final int Z(int i3, CharSequence charSequence, boolean z5, char[] cArr) {
        int i6;
        boolean z6;
        o.m(charSequence, "<this>");
        o.m(cArr, "chars");
        if (z5 || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i3 < 0) {
                i3 = 0;
            }
            c cVar = new c(i3, U(charSequence));
            int i7 = cVar.f5074e;
            int i8 = cVar.f5075f;
            boolean z7 = i8 <= 0 ? i3 >= i7 : i3 <= i7;
            if (!z7) {
                i3 = i7;
            }
            while (z7) {
                if (i3 != i7) {
                    i6 = i8 + i3;
                } else if (z7) {
                    i6 = i3;
                    z7 = false;
                } else {
                    throw new NoSuchElementException();
                }
                char charAt = charSequence.charAt(i3);
                int length = cArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        z6 = false;
                        break;
                    } else if (v.s(cArr[i9], charAt, z5)) {
                        z6 = true;
                        break;
                    } else {
                        i9++;
                    }
                }
                if (z6) {
                    return i3;
                }
                i3 = i6;
            }
            return -1;
        }
        return ((String) charSequence).indexOf(h.e0(cArr), i3);
    }

    public static final boolean a0(String str) {
        boolean z5;
        o.m(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        c cVar = new c(0, str.length() - 1);
        if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
            Iterator it = cVar.iterator();
            while (true) {
                if (((b) it).f5078f) {
                    if (!v.B(str.charAt(((b) it).b()))) {
                        z5 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z5 = true;
        return z5;
    }

    public static int b0(CharSequence charSequence, char c6, int i3, int i6) {
        if ((i6 & 2) != 0) {
            i3 = U(charSequence);
        }
        o.m(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c6, i3);
        }
        char[] cArr = {c6};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(h.e0(cArr), i3);
        }
        int U = U(charSequence);
        if (i3 > U) {
            i3 = U;
        }
        while (-1 < i3) {
            if (v.s(cArr[0], charSequence.charAt(i3), false)) {
                return i3;
            }
            i3--;
        }
        return -1;
    }

    public static final List c0(CharSequence charSequence) {
        o.m(charSequence, "<this>");
        h0(0);
        return u4.h.i0(new e(new c(charSequence, 0, 0, new h(1, h.W(new String[]{"\r\n", "\n", "\r"}), false)), new p.a(7, charSequence)));
    }

    public static final boolean d0(int i3, int i6, int i7, String str, String str2, boolean z5) {
        o.m(str, "<this>");
        o.m(str2, "other");
        return !z5 ? str.regionMatches(i3, str2, i6, i7) : str.regionMatches(z5, i3, str2, i6, i7);
    }

    public static final boolean e0(CharSequence charSequence, int i3, CharSequence charSequence2, int i6, int i7, boolean z5) {
        o.m(charSequence, "<this>");
        o.m(charSequence2, "other");
        if (i6 < 0 || i3 < 0 || i3 > charSequence.length() - i7 || i6 > charSequence2.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!v.s(charSequence.charAt(i3 + i8), charSequence2.charAt(i6 + i8), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final String f0(String str, String str2) {
        if (!k0(str2, str, false)) {
            return str2;
        }
        String substring = str2.substring(str.length());
        o.l(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String g0(String str, String str2, String str3) {
        o.m(str, "<this>");
        int V = V(0, str, str2, false);
        if (V < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = 1;
        if (length >= 1) {
            i3 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i6 = 0;
            do {
                sb.append(str, i6, V);
                sb.append(str3);
                i6 = V + length;
                if (V >= str.length() || (V = V(V + i3, str, str2, false)) <= 0) {
                    sb.append(str, i6, str.length());
                    String sb2 = sb.toString();
                    o.l(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i6, V);
                sb.append(str3);
                i6 = V + length;
                break;
            } while ((V = V(V + i3, str, str2, false)) <= 0);
            sb.append(str, i6, str.length());
            String sb22 = sb.toString();
            o.l(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static final void h0(int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(m.g("Limit must be non-negative, but was ", i3).toString());
        }
    }

    public static List i0(CharSequence charSequence, char[] cArr) {
        o.m(charSequence, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            h0(0);
            int V = V(0, charSequence, valueOf, false);
            if (V == -1) {
                return v.D(charSequence.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(charSequence.subSequence(i3, V).toString());
                i3 = valueOf.length() + V;
                V = V(i3, charSequence, valueOf, false);
            } while (V != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        h0(0);
        u4.i iVar = new u4.i(new c(charSequence, 0, 0, new h(0, cArr, false)));
        ArrayList arrayList2 = new ArrayList(g4.i.W(iVar));
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(l0(charSequence, (c) it.next()));
        }
        return arrayList2;
    }

    public static final boolean j0(String str, String str2, int i3, boolean z5) {
        o.m(str, "<this>");
        if (!z5) {
            return str.startsWith(str2, i3);
        }
        return d0(i3, 0, str2.length(), str, str2, z5);
    }

    public static final boolean k0(String str, String str2, boolean z5) {
        o.m(str, "<this>");
        o.m(str2, "prefix");
        return !z5 ? str.startsWith(str2) : d0(0, 0, str2.length(), str, str2, z5);
    }

    public static final String l0(CharSequence charSequence, c cVar) {
        o.m(charSequence, "<this>");
        o.m(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f5073d).intValue(), Integer.valueOf(cVar.f5074e).intValue() + 1).toString();
    }

    public static String m0(String str) {
        o.m(str, "<this>");
        o.m(str, "missingDelimiterValue");
        int b02 = b0(str, '.', 0, 6);
        if (b02 == -1) {
            return str;
        }
        String substring = str.substring(b02 + 1, str.length());
        o.l(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence n0(CharSequence charSequence) {
        o.m(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i3 = 0;
        boolean z5 = false;
        while (i3 <= length) {
            boolean B = v.B(charSequence.charAt(!z5 ? i3 : length));
            if (!z5) {
                if (!B) {
                    z5 = true;
                } else {
                    i3++;
                }
            } else if (!B) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i3, length + 1);
    }
}
