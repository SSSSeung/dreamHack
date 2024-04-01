package e5;

import a5.c;
import androidx.fragment.app.n0;
import b1.o;
import l5.j;
import v4.i;
import z4.a0;

public abstract class e {
    static {
        j jVar = j.f4129g;
        n0.n("\"\\");
        n0.n("\t ,=");
    }

    public static final boolean a(a0 a0Var) {
        if (o.c((String) a0Var.f5956d.f821d, "HEAD")) {
            return false;
        }
        int i3 = a0Var.f5959g;
        return (((i3 >= 100 && i3 < 200) || i3 == 204 || i3 == 304) && c.i(a0Var) == -1 && !i.T("chunked", a0.b(a0Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0203, code lost:
        if (r2.f5422d.matcher(r0).matches() == false) goto L_0x0208;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0262 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(z4.l r36, z4.t r37, z4.r r38) {
        /*
            r0 = r36
            r1 = r37
            r2 = r38
            java.lang.String r3 = "$this$receiveHeaders"
            b1.o.m(r0, r3)
            java.lang.String r3 = "url"
            b1.o.m(r1, r3)
            java.lang.String r3 = "headers"
            b1.o.m(r2, r3)
            androidx.compose.ui.platform.e r3 = z4.l.f6048c
            if (r0 != r3) goto L_0x001a
            return
        L_0x001a:
            java.util.regex.Pattern r0 = z4.k.f6035j
            java.lang.String[] r0 = r2.f6060d
            int r0 = r0.length
            r3 = 2
            int r0 = r0 / r3
            r4 = 0
            r6 = r4
            r7 = 0
        L_0x0024:
            if (r6 >= r0) goto L_0x0043
            java.lang.String r8 = r2.b(r6)
            java.lang.String r9 = "Set-Cookie"
            boolean r8 = v4.i.T(r9, r8)
            if (r8 == 0) goto L_0x0040
            if (r7 != 0) goto L_0x0039
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
        L_0x0039:
            java.lang.String r8 = r2.d(r6)
            r7.add(r8)
        L_0x0040:
            int r6 = r6 + 1
            goto L_0x0024
        L_0x0043:
            g4.n r2 = g4.n.f2906d
            if (r7 == 0) goto L_0x0052
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            java.lang.String r3 = "Collections.unmodifiableList(result)"
            b1.o.l(r0, r3)
            r3 = r0
            goto L_0x0053
        L_0x0052:
            r3 = r2
        L_0x0053:
            int r6 = r3.size()
            r7 = r4
            r8 = 0
        L_0x0059:
            if (r7 >= r6) goto L_0x0269
            java.lang.Object r0 = r3.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "setCookie"
            b1.o.m(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            byte[] r0 = a5.c.f212a
            int r0 = r9.length()
            r12 = 59
            int r0 = a5.c.d(r9, r12, r4, r0)
            r13 = 61
            int r14 = a5.c.d(r9, r13, r4, r0)
            if (r14 != r0) goto L_0x0084
        L_0x007f:
            r35 = r2
            r5 = r4
            goto L_0x0254
        L_0x0084:
            java.lang.String r16 = a5.c.w(r4, r14, r9)
            int r15 = r16.length()
            r17 = 1
            if (r15 != 0) goto L_0x0093
            r15 = r17
            goto L_0x0094
        L_0x0093:
            r15 = r4
        L_0x0094:
            if (r15 != 0) goto L_0x007f
            int r15 = a5.c.k(r16)
            r5 = -1
            if (r15 == r5) goto L_0x009e
            goto L_0x007f
        L_0x009e:
            int r14 = r14 + 1
            java.lang.String r14 = a5.c.w(r14, r0, r9)
            int r15 = a5.c.k(r14)
            if (r15 == r5) goto L_0x00ab
            goto L_0x007f
        L_0x00ab:
            int r0 = r0 + 1
            int r5 = r9.length()
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r20 = -1
            r22 = r4
            r23 = r22
            r24 = r23
            r25 = r17
            r28 = r18
            r26 = r20
            r15 = 0
            r30 = 0
        L_0x00c7:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r5) goto L_0x01a3
            int r4 = a5.c.d(r9, r12, r0, r5)
            int r12 = a5.c.d(r9, r13, r0, r4)
            java.lang.String r0 = a5.c.w(r0, r12, r9)
            if (r12 >= r4) goto L_0x00e5
            int r12 = r12 + 1
            java.lang.String r12 = a5.c.w(r12, r4, r9)
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r12 = ""
        L_0x00e7:
            java.lang.String r13 = "expires"
            boolean r13 = v4.i.T(r0, r13)
            if (r13 == 0) goto L_0x0100
            int r0 = r12.length()     // Catch:{ IllegalArgumentException -> 0x00fc }
            long r12 = h5.d.l(r0, r12)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r35 = r2
            r28 = r12
            goto L_0x0140
        L_0x00fc:
            r35 = r2
            goto L_0x0198
        L_0x0100:
            java.lang.String r13 = "max-age"
            boolean r13 = v4.i.T(r0, r13)
            if (r13 == 0) goto L_0x0144
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x011a }
            r26 = 0
            int r0 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r33 = r12
        L_0x0115:
            r35 = r2
            r26 = r33
            goto L_0x0140
        L_0x011a:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            r35 = r2
            java.lang.String r2 = "compile(pattern)"
            b1.o.l(r0, r2)     // Catch:{ NumberFormatException -> 0x0198 }
            java.util.regex.Matcher r0 = r0.matcher(r12)     // Catch:{ NumberFormatException -> 0x0198 }
            boolean r0 = r0.matches()     // Catch:{ NumberFormatException -> 0x0198 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = "-"
            r2 = 0
            boolean r0 = v4.i.k0(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x0198 }
            if (r0 == 0) goto L_0x013e
            r31 = r33
        L_0x013e:
            r26 = r31
        L_0x0140:
            r24 = r17
            goto L_0x0198
        L_0x0143:
            throw r13     // Catch:{ NumberFormatException -> 0x0198 }
        L_0x0144:
            r35 = r2
            java.lang.String r2 = "domain"
            boolean r2 = v4.i.T(r0, r2)
            if (r2 == 0) goto L_0x0178
            java.lang.String r0 = "."
            boolean r2 = r12.endsWith(r0)     // Catch:{  }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x016c
            java.lang.String r0 = v4.i.f0(r0, r12)     // Catch:{  }
            java.lang.String r0 = com.bumptech.glide.e.v(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0166
            r15 = r0
            r25 = 0
            goto L_0x0198
        L_0x0166:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x016c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()     // Catch:{  }
            r0.<init>(r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0178:
            java.lang.String r2 = "path"
            boolean r2 = v4.i.T(r0, r2)
            if (r2 == 0) goto L_0x0183
            r30 = r12
            goto L_0x0198
        L_0x0183:
            java.lang.String r2 = "secure"
            boolean r2 = v4.i.T(r0, r2)
            if (r2 == 0) goto L_0x018e
            r22 = r17
            goto L_0x0198
        L_0x018e:
            java.lang.String r2 = "httponly"
            boolean r0 = v4.i.T(r0, r2)
            if (r0 == 0) goto L_0x0198
            r23 = r17
        L_0x0198:
            int r0 = r4 + 1
            r2 = r35
            r4 = 0
            r12 = 59
            r13 = 61
            goto L_0x00c7
        L_0x01a3:
            r35 = r2
            int r0 = (r26 > r33 ? 1 : (r26 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x01ac
            r18 = r33
            goto L_0x01ce
        L_0x01ac:
            int r0 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01cc
            r4 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01be
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r31 = r26 * r4
        L_0x01be:
            long r31 = r10 + r31
            int r0 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01ce
            int r0 = (r31 > r18 ? 1 : (r31 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c9
            goto L_0x01ce
        L_0x01c9:
            r18 = r31
            goto L_0x01ce
        L_0x01cc:
            r18 = r28
        L_0x01ce:
            java.lang.String r0 = r1.f6074e
            if (r15 != 0) goto L_0x01d4
            r2 = r0
            goto L_0x020d
        L_0x01d4:
            boolean r2 = b1.o.c(r0, r15)
            if (r2 == 0) goto L_0x01db
            goto L_0x0208
        L_0x01db:
            boolean r2 = v4.i.S(r0, r15)
            if (r2 == 0) goto L_0x0206
            int r2 = r0.length()
            int r4 = r15.length()
            int r2 = r2 - r4
            int r2 = r2 + -1
            char r2 = r0.charAt(r2)
            r4 = 46
            if (r2 != r4) goto L_0x0206
            v4.d r2 = a5.c.f217f
            r2.getClass()
            java.util.regex.Pattern r2 = r2.f5422d
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r17 = 0
        L_0x0208:
            if (r17 != 0) goto L_0x020c
        L_0x020a:
            r5 = 0
            goto L_0x0254
        L_0x020c:
            r2 = r15
        L_0x020d:
            int r0 = r0.length()
            int r4 = r2.length()
            if (r0 == r4) goto L_0x0220
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4349g
            java.lang.String r0 = r0.a(r2)
            if (r0 != 0) goto L_0x0220
            goto L_0x020a
        L_0x0220:
            java.lang.String r0 = "/"
            r4 = r30
            r5 = 0
            if (r4 == 0) goto L_0x0231
            boolean r9 = v4.i.k0(r4, r0, r5)
            if (r9 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r21 = r4
            goto L_0x0249
        L_0x0231:
            java.lang.String r4 = r37.b()
            r9 = 47
            r10 = 6
            int r9 = v4.i.b0(r4, r9, r5, r10)
            if (r9 == 0) goto L_0x0247
            java.lang.String r0 = r4.substring(r5, r9)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            b1.o.l(r0, r4)
        L_0x0247:
            r21 = r0
        L_0x0249:
            z4.k r0 = new z4.k
            r15 = r0
            r17 = r14
            r20 = r2
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            if (r0 == 0) goto L_0x0262
            if (r8 != 0) goto L_0x025f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8 = r2
        L_0x025f:
            r8.add(r0)
        L_0x0262:
            int r7 = r7 + 1
            r4 = r5
            r2 = r35
            goto L_0x0059
        L_0x0269:
            r35 = r2
            if (r8 == 0) goto L_0x0277
            java.util.List r2 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r0 = "Collections.unmodifiableList(cookies)"
            b1.o.l(r2, r0)
            goto L_0x0279
        L_0x0277:
            r2 = r35
        L_0x0279:
            r2.isEmpty()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.e.b(z4.l, z4.t, z4.r):void");
    }
}
