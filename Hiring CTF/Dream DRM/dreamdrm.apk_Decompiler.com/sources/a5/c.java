package a5;

import androidx.fragment.app.n0;
import g4.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l5.g;
import l5.j;
import l5.o;
import l5.x;
import v4.a;
import v4.d;
import v4.i;
import w4.p;
import z4.a0;
import z4.b0;
import z4.r;
import z4.t;
import z4.v;
import z4.w;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f212a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f213b = p.s(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f214c;

    /* renamed from: d  reason: collision with root package name */
    public static final o f215d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f216e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f217f = new d();

    /* renamed from: g  reason: collision with root package name */
    public static final String f218g;

    static {
        int i3;
        byte[] bArr = new byte[0];
        f212a = bArr;
        g gVar = new g();
        gVar.E(bArr, 0, 0);
        long j6 = (long) 0;
        f214c = new b0(gVar, (v) null, j6);
        if ((j6 | j6) < 0 || j6 > j6 || j6 - j6 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        j jVar = j.f4129g;
        j[] jVarArr = {n0.j("efbbbf"), n0.j("feff"), n0.j("fffe"), n0.j("0000ffff"), n0.j("ffff0000")};
        ArrayList arrayList = new ArrayList(new f(jVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i6 = 0; i6 < 5; i6++) {
            j jVar2 = jVarArr[i6];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
            b1.o.m(numArr2, "elements");
            ArrayList arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new f(numArr2, true));
            int i7 = 0;
            int i8 = 0;
            while (i7 < 5) {
                j jVar3 = jVarArr[i7];
                int i9 = i8 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i10 = size - 1;
                    int i11 = 0;
                    while (true) {
                        if (i11 > i10) {
                            i3 = -(i11 + 1);
                            break;
                        }
                        i3 = (i11 + i10) >>> 1;
                        Comparable comparable = (Comparable) arrayList.get(i3);
                        int compareTo = comparable == jVar3 ? 0 : comparable == null ? -1 : jVar3 == null ? 1 : comparable.compareTo(jVar3);
                        if (compareTo >= 0) {
                            if (compareTo <= 0) {
                                break;
                            }
                            i10 = i3 - 1;
                        } else {
                            i11 = i3 + 1;
                        }
                    }
                    arrayList3.set(i3, Integer.valueOf(i8));
                    i7++;
                    i8 = i9;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((j) arrayList.get(0)).b() > 0) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j jVar4 = (j) arrayList.get(i12);
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (i14 < arrayList.size()) {
                        j jVar5 = (j) arrayList.get(i14);
                        jVar5.getClass();
                        b1.o.m(jVar4, "prefix");
                        if (!jVar5.g(jVar4, jVar4.b())) {
                            continue;
                            break;
                        }
                        if (!(jVar5.b() != jVar4.b())) {
                            throw new IllegalArgumentException(("duplicate option: " + jVar5).toString());
                        } else if (((Number) arrayList3.get(i14)).intValue() > ((Number) arrayList3.get(i12)).intValue()) {
                            arrayList.remove(i14);
                            arrayList3.remove(i14);
                        } else {
                            i14++;
                        }
                    }
                    i12 = i13;
                }
                g gVar2 = new g();
                com.bumptech.glide.c.e(0, gVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
                int[] iArr = new int[((int) (gVar2.f4128e / ((long) 4)))];
                int i15 = 0;
                while (!gVar2.x()) {
                    iArr[i15] = gVar2.readInt();
                    i15++;
                }
                Object[] copyOf = Arrays.copyOf(jVarArr, 5);
                b1.o.l(copyOf, "java.util.Arrays.copyOf(this, size)");
                f215d = new o((j[]) copyOf, iArr);
                TimeZone timeZone = TimeZone.getTimeZone("GMT");
                b1.o.k(timeZone);
                f216e = timeZone;
                String f0 = i.f0("okhttp3.", w.class.getName());
                if (f0.endsWith("Client")) {
                    f0 = f0.substring(0, f0.length() - "Client".length());
                    b1.o.l(f0, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                f218g = f0;
                return;
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean a(t tVar, t tVar2) {
        b1.o.m(tVar, "$this$canReuseConnectionFor");
        b1.o.m(tVar2, "other");
        return b1.o.c(tVar.f6074e, tVar2.f6074e) && tVar.f6075f == tVar2.f6075f && b1.o.c(tVar.f6071b, tVar2.f6071b);
    }

    public static final void b(Closeable closeable) {
        b1.o.m(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void c(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final int d(String str, char c6, int i3, int i6) {
        b1.o.m(str, "$this$delimiterOffset");
        while (i3 < i6) {
            if (str.charAt(i3) == c6) {
                return i3;
            }
            i3++;
        }
        return i6;
    }

    public static final int e(String str, String str2, int i3, int i6) {
        b1.o.m(str, "$this$delimiterOffset");
        while (i3 < i6) {
            boolean z5 = false;
            if (i.X(str2, str.charAt(i3), 0, false, 2) >= 0) {
                z5 = true;
            }
            if (z5) {
                return i3;
            }
            i3++;
        }
        return i6;
    }

    public static final boolean f(l5.v vVar, TimeUnit timeUnit) {
        b1.o.m(vVar, "$this$discard");
        b1.o.m(timeUnit, "timeUnit");
        try {
            return r(vVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String g(String str, Object... objArr) {
        b1.o.m(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        b1.o.l(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        b1.o.m(strArr, "$this$hasIntersection");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(a0 a0Var) {
        String a6 = a0Var.f5961i.a("Content-Length");
        if (a6 != null) {
            try {
                return Long.parseLong(a6);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static final List j(Object... objArr) {
        b1.o.m(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(b1.v.E(Arrays.copyOf(objArr2, objArr2.length)));
        b1.o.l(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (b1.o.o(charAt, 31) <= 0 || b1.o.o(charAt, 127) >= 0) {
                return i3;
            }
        }
        return -1;
    }

    public static final int l(int i3, int i6, String str) {
        while (i3 < i6) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i6;
    }

    public static final int m(int i3, int i6, String str) {
        int i7 = i6 - 1;
        if (i7 >= i3) {
            while (true) {
                char charAt = str.charAt(i7);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i7 == i3) {
                        break;
                    }
                    i7--;
                } else {
                    return i7 + 1;
                }
            }
        }
        return i3;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        b1.o.m(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i3]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i3++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int o(char c6) {
        if ('0' <= c6 && '9' >= c6) {
            return c6 - '0';
        }
        char c7 = 'a';
        if ('a' > c6 || 'f' < c6) {
            c7 = 'A';
            if ('A' > c6 || 'F' < c6) {
                return -1;
            }
        }
        return (c6 - c7) + 10;
    }

    public static final Charset p(l5.i iVar, Charset charset) {
        Charset charset2;
        String str;
        Charset charset3;
        b1.o.m(iVar, "$this$readBomAsCharset");
        b1.o.m(charset, "default");
        int v5 = iVar.v(f215d);
        if (v5 == -1) {
            return charset;
        }
        if (v5 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (v5 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (v5 != 2) {
            if (v5 == 3) {
                Charset charset4 = a.f5409a;
                charset3 = a.f5411c;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32BE");
                    b1.o.l(charset3, "forName(\"UTF-32BE\")");
                    a.f5411c = charset3;
                }
            } else if (v5 == 4) {
                Charset charset5 = a.f5409a;
                charset3 = a.f5410b;
                if (charset3 == null) {
                    charset3 = Charset.forName("UTF-32LE");
                    b1.o.l(charset3, "forName(\"UTF-32LE\")");
                    a.f5410b = charset3;
                }
            } else {
                throw new AssertionError();
            }
            return charset3;
        } else {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        b1.o.l(charset2, str);
        return charset2;
    }

    public static final int q(l5.i iVar) {
        b1.o.m(iVar, "$this$readMedium");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean r(l5.v vVar, int i3, TimeUnit timeUnit) {
        b1.o.m(vVar, "$this$skipAll");
        b1.o.m(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c6 = vVar.c().e() ? vVar.c().c() - nanoTime : Long.MAX_VALUE;
        vVar.c().d(Math.min(c6, timeUnit.toNanos((long) i3)) + nanoTime);
        try {
            g gVar = new g();
            while (vVar.o(gVar, 8192) != -1) {
                gVar.a(gVar.f4128e);
            }
            int i6 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            x c7 = vVar.c();
            if (i6 == 0) {
                c7.a();
            } else {
                c7.d(nanoTime + c6);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i7 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            x c8 = vVar.c();
            if (i7 == 0) {
                c8.a();
            } else {
                c8.d(nanoTime + c6);
            }
            return false;
        } catch (Throwable th) {
            int i8 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            x c9 = vVar.c();
            if (i8 == 0) {
                c9.a();
            } else {
                c9.d(nanoTime + c6);
            }
            throw th;
        }
    }

    public static final r s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g5.c cVar = (g5.c) it.next();
            String i3 = cVar.f2945b.i();
            String i6 = cVar.f2946c.i();
            arrayList.add(i3);
            arrayList.add(i.n0(i6).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new r((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String t(z4.t r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            b1.o.m(r3, r0)
            java.lang.String r0 = ":"
            java.lang.String r1 = r3.f6074e
            boolean r0 = v4.i.R(r1, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L_0x0022:
            int r0 = r3.f6075f
            if (r4 != 0) goto L_0x0055
            java.lang.String r3 = r3.f6071b
            java.lang.String r4 = "scheme"
            b1.o.m(r3, r4)
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L_0x0047
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L_0x003c
            goto L_0x0052
        L_0x003c:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0052
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x0053
        L_0x0047:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0052
            r3 = 80
            goto L_0x0053
        L_0x0052:
            r3 = -1
        L_0x0053:
            if (r0 == r3) goto L_0x0069
        L_0x0055:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r4 = 58
            r3.append(r4)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.c.t(z4.t, boolean):java.lang.String");
    }

    public static final List u(List list) {
        b1.o.m(list, "$this$toImmutableList");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        b1.o.l(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int v(int i3, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i3;
    }

    public static final String w(int i3, int i6, String str) {
        int l6 = l(i3, i6, str);
        String substring = str.substring(l6, m(l6, i6, str));
        b1.o.l(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void x(IOException iOException, List list) {
        b1.o.m(iOException, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b1.o.a(iOException, (Exception) it.next());
        }
    }
}
