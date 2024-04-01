package z4;

import b1.o;
import g4.i;
import java.util.ArrayList;
import java.util.Iterator;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public String f6061a;

    /* renamed from: b  reason: collision with root package name */
    public String f6062b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f6063c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f6064d;

    /* renamed from: e  reason: collision with root package name */
    public int f6065e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f6066f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f6067g;

    /* renamed from: h  reason: collision with root package name */
    public String f6068h;

    public s() {
        ArrayList arrayList = new ArrayList();
        this.f6066f = arrayList;
        arrayList.add("");
    }

    public final t a() {
        ArrayList arrayList;
        String str = this.f6061a;
        if (str != null) {
            String e6 = n.e(this.f6062b, 0, 0, false, 7);
            String e7 = n.e(this.f6063c, 0, 0, false, 7);
            String str2 = this.f6064d;
            if (str2 != null) {
                int b6 = b();
                ArrayList arrayList2 = this.f6066f;
                ArrayList arrayList3 = new ArrayList(i.W(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(n.e((String) it.next(), 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f6067g;
                String str3 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(i.W(arrayList4));
                    for (String str4 : arrayList4) {
                        arrayList.add(str4 != null ? n.e(str4, 0, 0, true, 3) : null);
                    }
                } else {
                    arrayList = null;
                }
                String str5 = this.f6068h;
                if (str5 != null) {
                    str3 = n.e(str5, 0, 0, false, 7);
                }
                return new t(str, e6, e7, str2, b6, arrayList3, arrayList, str3, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final int b() {
        int i3 = this.f6065e;
        if (i3 != -1) {
            return i3;
        }
        String str = this.f6061a;
        o.k(str);
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

    public final void c(String str) {
        this.f6067g = str != null ? n.f(n.a(str, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0253, code lost:
        if (65535 < r1) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r6 == ':') goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x021a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(z4.t r29, java.lang.String r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r10 = r30
            byte[] r2 = a5.c.f212a
            int r2 = r30.length()
            r11 = 0
            int r2 = a5.c.l(r11, r2, r10)
            int r3 = r30.length()
            int r12 = a5.c.m(r2, r3, r10)
            int r3 = r12 - r2
            r4 = 2
            r13 = 58
            r14 = -1
            r15 = 1
            if (r3 >= r4) goto L_0x0024
            goto L_0x007b
        L_0x0024:
            char r3 = r10.charAt(r2)
            r5 = 97
            int r6 = b1.o.o(r3, r5)
            r7 = 90
            r8 = 122(0x7a, float:1.71E-43)
            r9 = 65
            if (r6 < 0) goto L_0x003c
            int r6 = b1.o.o(r3, r8)
            if (r6 <= 0) goto L_0x0049
        L_0x003c:
            int r6 = b1.o.o(r3, r9)
            if (r6 < 0) goto L_0x007b
            int r3 = b1.o.o(r3, r7)
            if (r3 <= 0) goto L_0x0049
            goto L_0x007b
        L_0x0049:
            r3 = r2
        L_0x004a:
            int r3 = r3 + r15
            if (r3 >= r12) goto L_0x007b
            char r6 = r10.charAt(r3)
            if (r5 <= r6) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            if (r8 < r6) goto L_0x0057
            goto L_0x0075
        L_0x0057:
            if (r9 <= r6) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            if (r7 < r6) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            r5 = 48
            if (r5 <= r6) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r5 = 57
            if (r5 < r6) goto L_0x0067
            goto L_0x0075
        L_0x0067:
            r5 = 43
            if (r6 != r5) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            r5 = 45
            if (r6 != r5) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r5 = 46
            if (r6 != r5) goto L_0x0078
        L_0x0075:
            r5 = 97
            goto L_0x004a
        L_0x0078:
            if (r6 != r13) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r3 = r14
        L_0x007c:
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            if (r3 == r14) goto L_0x00be
            java.lang.String r5 = "https:"
            boolean r5 = v4.i.j0(r10, r5, r2, r15)
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = "https"
            r0.f6061a = r3
            int r2 = r2 + 6
            goto L_0x00c4
        L_0x008f:
            java.lang.String r5 = "http:"
            boolean r5 = v4.i.j0(r10, r5, r2, r15)
            if (r5 == 0) goto L_0x009e
            java.lang.String r3 = "http"
            r0.f6061a = r3
            int r2 = r2 + 5
            goto L_0x00c4
        L_0x009e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r4)
            java.lang.String r3 = r10.substring(r11, r3)
            b1.o.l(r3, r9)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00be:
            if (r1 == 0) goto L_0x0412
            java.lang.String r3 = r1.f6071b
            r0.f6061a = r3
        L_0x00c4:
            r3 = r2
            r5 = r11
        L_0x00c6:
            r8 = 92
            r7 = 47
            if (r3 >= r12) goto L_0x00d9
            char r6 = r10.charAt(r3)
            if (r6 == r8) goto L_0x00d4
            if (r6 != r7) goto L_0x00d9
        L_0x00d4:
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00d9:
            java.util.ArrayList r6 = r0.f6066f
            r3 = 63
            r11 = 35
            if (r5 >= r4) goto L_0x0121
            if (r1 == 0) goto L_0x0121
            java.lang.String r4 = r0.f6061a
            java.lang.String r13 = r1.f6071b
            boolean r4 = b1.o.c(r13, r4)
            r4 = r4 ^ r15
            if (r4 == 0) goto L_0x00ef
            goto L_0x0121
        L_0x00ef:
            java.lang.String r4 = r29.e()
            r0.f6062b = r4
            java.lang.String r4 = r29.a()
            r0.f6063c = r4
            java.lang.String r4 = r1.f6074e
            r0.f6064d = r4
            int r4 = r1.f6075f
            r0.f6065e = r4
            r6.clear()
            java.util.ArrayList r4 = r29.c()
            r6.addAll(r4)
            if (r2 == r12) goto L_0x0115
            char r4 = r10.charAt(r2)
            if (r4 != r11) goto L_0x011c
        L_0x0115:
            java.lang.String r1 = r29.d()
            r0.c(r1)
        L_0x011c:
            r21 = r6
            r11 = 0
            goto L_0x02b3
        L_0x0121:
            int r2 = r2 + r5
            r13 = r2
            r18 = 0
            r19 = 0
        L_0x0127:
            java.lang.String r1 = "@/\\?#"
            int r5 = a5.c.e(r10, r1, r13, r12)
            if (r5 == r12) goto L_0x0134
            char r1 = r10.charAt(r5)
            goto L_0x0135
        L_0x0134:
            r1 = r14
        L_0x0135:
            if (r1 == r14) goto L_0x01f5
            if (r1 == r11) goto L_0x01f5
            if (r1 == r7) goto L_0x01f5
            if (r1 == r8) goto L_0x01f5
            if (r1 == r3) goto L_0x01f5
            r2 = 64
            if (r1 == r2) goto L_0x014a
            r11 = r3
            r21 = r6
            r26 = r9
            goto L_0x01e7
        L_0x014a:
            java.lang.String r4 = "%40"
            if (r18 != 0) goto L_0x01b3
            r1 = 58
            int r2 = a5.c.d(r10, r1, r13, r5)
            java.lang.String r20 = " \"':;<=>@[]^`{}|/\\?#"
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 240(0xf0, float:3.36E-43)
            r1 = r30
            r29 = r2
            r2 = r13
            r13 = r3
            r3 = r29
            r11 = r4
            r4 = r20
            r14 = r5
            r5 = r21
            r21 = r6
            r6 = r22
            r7 = r23
            r8 = r24
            r26 = r9
            r9 = r25
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r19 == 0) goto L_0x0194
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f6062b
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0194:
            r0.f6062b = r1
            r1 = r29
            if (r1 == r14) goto L_0x01af
            int r2 = r1 + 1
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r1 = r30
            r3 = r14
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f6063c = r1
            r18 = r15
        L_0x01af:
            r11 = r13
            r19 = r15
            goto L_0x01e5
        L_0x01b3:
            r11 = r4
            r14 = r5
            r21 = r6
            r26 = r9
            r9 = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = r0.f6063c
            r8.append(r1)
            r8.append(r11)
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r7 = 0
            r11 = 0
            r22 = 240(0xf0, float:3.36E-43)
            r1 = r30
            r2 = r13
            r3 = r14
            r13 = r8
            r8 = r11
            r11 = r9
            r9 = r22
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            r0.f6063c = r1
        L_0x01e5:
            int r13 = r14 + 1
        L_0x01e7:
            r3 = r11
            r6 = r21
            r9 = r26
            r7 = 47
            r8 = 92
            r11 = 35
            r14 = -1
            goto L_0x0127
        L_0x01f5:
            r11 = r3
            r14 = r5
            r21 = r6
            r26 = r9
            r5 = r13
        L_0x01fc:
            if (r5 >= r14) goto L_0x021a
            char r1 = r10.charAt(r5)
            r2 = 58
            if (r1 == r2) goto L_0x0218
            r3 = 91
            if (r1 == r3) goto L_0x020b
            goto L_0x0216
        L_0x020b:
            int r5 = r5 + r15
            if (r5 >= r14) goto L_0x0216
            char r1 = r10.charAt(r5)
            r3 = 93
            if (r1 != r3) goto L_0x020b
        L_0x0216:
            int r5 = r5 + r15
            goto L_0x01fc
        L_0x0218:
            r9 = r5
            goto L_0x021b
        L_0x021a:
            r9 = r14
        L_0x021b:
            int r8 = r9 + 1
            r7 = 34
            r1 = 4
            if (r8 >= r14) goto L_0x0290
            r2 = 0
            java.lang.String r1 = z4.n.e(r10, r13, r9, r2, r1)
            java.lang.String r1 = com.bumptech.glide.e.v(r1)
            r0.f6064d = r1
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r17 = 0
            r18 = 0
            r19 = 248(0xf8, float:3.48E-43)
            r1 = r30
            r2 = r8
            r3 = r14
            r11 = r7
            r7 = r17
            r11 = r8
            r8 = r18
            r27 = r9
            r9 = r19
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0259 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0259 }
            if (r15 <= r1) goto L_0x0250
            goto L_0x0259
        L_0x0250:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r2 < r1) goto L_0x0259
            goto L_0x025a
        L_0x0256:
            r11 = r8
            r27 = r9
        L_0x0259:
            r1 = -1
        L_0x025a:
            r0.f6065e = r1
            r2 = -1
            if (r1 == r2) goto L_0x0261
            r2 = r15
            goto L_0x0262
        L_0x0261:
            r2 = 0
        L_0x0262:
            if (r2 == 0) goto L_0x026a
            r3 = r26
            r5 = r27
            r11 = 0
            goto L_0x02a9
        L_0x026a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL port: \""
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r11, r14)
            r3 = r26
            b1.o.l(r2, r3)
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0290:
            r5 = r9
            r3 = r26
            r11 = 0
            java.lang.String r1 = z4.n.e(r10, r13, r5, r11, r1)
            java.lang.String r1 = com.bumptech.glide.e.v(r1)
            r0.f6064d = r1
            java.lang.String r1 = r0.f6061a
            b1.o.k(r1)
            int r1 = z4.n.b(r1)
            r0.f6065e = r1
        L_0x02a9:
            java.lang.String r1 = r0.f6064d
            if (r1 == 0) goto L_0x02af
            r2 = r15
            goto L_0x02b0
        L_0x02af:
            r2 = r11
        L_0x02b0:
            if (r2 == 0) goto L_0x03ee
            r2 = r14
        L_0x02b3:
            java.lang.String r1 = "?#"
            int r13 = a5.c.e(r10, r1, r2, r12)
            if (r2 != r13) goto L_0x02bd
            goto L_0x03a8
        L_0x02bd:
            char r1 = r10.charAt(r2)
            java.lang.String r14 = ""
            r3 = 47
            if (r1 == r3) goto L_0x02d7
            r3 = 92
            if (r1 != r3) goto L_0x02cc
            goto L_0x02d7
        L_0x02cc:
            int r1 = r21.size()
            int r1 = r1 - r15
            r9 = r21
            r9.set(r1, r14)
            goto L_0x02e1
        L_0x02d7:
            r9 = r21
            r9.clear()
            r9.add(r14)
            int r2 = r2 + 1
        L_0x02e1:
            if (r2 >= r13) goto L_0x03a8
            java.lang.String r1 = "/\\"
            int r8 = a5.c.e(r10, r1, r2, r13)
            if (r8 >= r13) goto L_0x02ee
            r16 = r15
            goto L_0x02f0
        L_0x02ee:
            r16 = r11
        L_0x02f0:
            r5 = 1
            java.lang.String r4 = " \"<>^`{}|/\\?#"
            r6 = 0
            r7 = 0
            r17 = 0
            r18 = 240(0xf0, float:3.36E-43)
            r1 = r30
            r3 = r8
            r19 = r8
            r8 = r17
            r21 = r9
            r9 = r18
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "."
            boolean r2 = b1.o.c(r1, r2)
            if (r2 != 0) goto L_0x031b
            java.lang.String r2 = "%2e"
            boolean r2 = v4.i.T(r1, r2)
            if (r2 == 0) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            r2 = r11
            goto L_0x031c
        L_0x031b:
            r2 = r15
        L_0x031c:
            if (r2 == 0) goto L_0x0322
            r2 = r21
            goto L_0x039d
        L_0x0322:
            java.lang.String r2 = ".."
            boolean r2 = b1.o.c(r1, r2)
            if (r2 != 0) goto L_0x0345
            java.lang.String r2 = "%2e."
            boolean r2 = v4.i.T(r1, r2)
            if (r2 != 0) goto L_0x0345
            java.lang.String r2 = ".%2e"
            boolean r2 = v4.i.T(r1, r2)
            if (r2 != 0) goto L_0x0345
            java.lang.String r2 = "%2e%2e"
            boolean r2 = v4.i.T(r1, r2)
            if (r2 == 0) goto L_0x0343
            goto L_0x0345
        L_0x0343:
            r2 = r11
            goto L_0x0346
        L_0x0345:
            r2 = r15
        L_0x0346:
            if (r2 == 0) goto L_0x0374
            int r1 = r21.size()
            int r1 = r1 - r15
            r2 = r21
            java.lang.Object r1 = r2.remove(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x035d
            r1 = r15
            goto L_0x035e
        L_0x035d:
            r1 = r11
        L_0x035e:
            if (r1 == 0) goto L_0x0370
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ r15
            if (r1 == 0) goto L_0x0370
            int r1 = r2.size()
            int r1 = r1 - r15
            r2.set(r1, r14)
            goto L_0x039d
        L_0x0370:
            r2.add(r14)
            goto L_0x039d
        L_0x0374:
            r2 = r21
            int r3 = r2.size()
            int r3 = r3 - r15
            java.lang.Object r3 = r2.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0389
            r3 = r15
            goto L_0x038a
        L_0x0389:
            r3 = r11
        L_0x038a:
            if (r3 == 0) goto L_0x0395
            int r3 = r2.size()
            int r3 = r3 - r15
            r2.set(r3, r1)
            goto L_0x0398
        L_0x0395:
            r2.add(r1)
        L_0x0398:
            if (r16 == 0) goto L_0x039d
            r2.add(r14)
        L_0x039d:
            if (r16 == 0) goto L_0x03a3
            int r8 = r19 + 1
            r19 = r8
        L_0x03a3:
            r9 = r2
            r2 = r19
            goto L_0x02e1
        L_0x03a8:
            if (r13 >= r12) goto L_0x03d0
            char r1 = r10.charAt(r13)
            r2 = 63
            if (r1 != r2) goto L_0x03d0
            r1 = 35
            int r11 = a5.c.d(r10, r1, r13, r12)
            int r2 = r13 + 1
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 208(0xd0, float:2.91E-43)
            r1 = r30
            r3 = r11
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = z4.n.f(r1)
            r0.f6067g = r1
            r13 = r11
        L_0x03d0:
            if (r13 >= r12) goto L_0x03ed
            char r1 = r10.charAt(r13)
            r2 = 35
            if (r1 != r2) goto L_0x03ed
            int r2 = r13 + 1
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 176(0xb0, float:2.47E-43)
            r1 = r30
            r3 = r12
            java.lang.String r1 = z4.n.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f6068h = r1
        L_0x03ed:
            return
        L_0x03ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid URL host: \""
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r13, r5)
            b1.o.l(r2, r3)
            r1.append(r2)
            r2 = 34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0412:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.s.d(z4.t, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if ((r9.f6063c.length() > 0) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        if (r1 != r3) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r9.f6061a
            if (r1 == 0) goto L_0x000f
            r0.append(r1)
            java.lang.String r1 = "://"
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = "//"
        L_0x0011:
            r0.append(r1)
            java.lang.String r1 = r9.f6062b
            int r1 = r1.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x0020
            r1 = r3
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            r4 = 58
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r9.f6063c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x002f
            r1 = r3
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            if (r1 == 0) goto L_0x0051
        L_0x0032:
            java.lang.String r1 = r9.f6062b
            r0.append(r1)
            java.lang.String r1 = r9.f6063c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0041
            r1 = r3
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x004c
            r0.append(r4)
            java.lang.String r1 = r9.f6063c
            r0.append(r1)
        L_0x004c:
            r1 = 64
            r0.append(r1)
        L_0x0051:
            java.lang.String r1 = r9.f6064d
            r5 = 2
            if (r1 == 0) goto L_0x0075
            int r1 = v4.i.X(r1, r4, r2, r2, r5)
            if (r1 < 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = r2
        L_0x005e:
            if (r3 == 0) goto L_0x0070
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r9.f6064d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L_0x0075
        L_0x0070:
            java.lang.String r1 = r9.f6064d
            r0.append(r1)
        L_0x0075:
            int r1 = r9.f6065e
            r3 = -1
            if (r1 != r3) goto L_0x007e
            java.lang.String r1 = r9.f6061a
            if (r1 == 0) goto L_0x00b2
        L_0x007e:
            int r1 = r9.b()
            java.lang.String r6 = r9.f6061a
            if (r6 == 0) goto L_0x00ac
            int r7 = r6.hashCode()
            r8 = 3213448(0x310888, float:4.503E-39)
            if (r7 == r8) goto L_0x00a0
            r8 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r7 == r8) goto L_0x0095
            goto L_0x00aa
        L_0x0095:
            java.lang.String r7 = "https"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00aa
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x00aa
        L_0x00a0:
            java.lang.String r7 = "http"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00aa
            r3 = 80
        L_0x00aa:
            if (r1 == r3) goto L_0x00b2
        L_0x00ac:
            r0.append(r4)
            r0.append(r1)
        L_0x00b2:
            java.util.ArrayList r1 = r9.f6066f
            java.lang.String r3 = "$this$toPathString"
            b1.o.m(r1, r3)
            int r3 = r1.size()
            r4 = r2
        L_0x00be:
            if (r4 >= r3) goto L_0x00d1
            r6 = 47
            r0.append(r6)
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00d1:
            java.util.ArrayList r1 = r9.f6067g
            if (r1 == 0) goto L_0x011e
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r9.f6067g
            b1.o.k(r1)
            int r3 = r1.size()
            s4.c r2 = b1.v.T(r2, r3)
            s4.a r2 = b1.v.R(r2, r5)
            int r3 = r2.f5073d
            int r4 = r2.f5074e
            int r2 = r2.f5075f
            if (r2 < 0) goto L_0x00f6
            if (r3 > r4) goto L_0x011e
            goto L_0x00f8
        L_0x00f6:
            if (r3 < r4) goto L_0x011e
        L_0x00f8:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto L_0x010d
            r7 = 38
            r0.append(r7)
        L_0x010d:
            r0.append(r5)
            if (r6 == 0) goto L_0x011a
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        L_0x011a:
            if (r3 == r4) goto L_0x011e
            int r3 = r3 + r2
            goto L_0x00f8
        L_0x011e:
            java.lang.String r1 = r9.f6068h
            if (r1 == 0) goto L_0x012c
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r9.f6068h
            r0.append(r1)
        L_0x012c:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            b1.o.l(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.s.toString():java.lang.String");
    }
}
