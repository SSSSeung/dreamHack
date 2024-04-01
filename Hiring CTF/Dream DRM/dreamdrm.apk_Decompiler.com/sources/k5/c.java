package k5;

import b1.o;
import g4.n;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3976a = new c();

    public static List a(X509Certificate x509Certificate, int i3) {
        n nVar = n.f2906d;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List next : subjectAlternativeNames) {
                    if (next != null) {
                        if (next.size() >= 2) {
                            if (!(!o.c(next.get(0), Integer.valueOf(i3)))) {
                                Object obj = next.get(1);
                                if (obj != null) {
                                    arrayList.add((String) obj);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            java.lang.String r0 = "host"
            b1.o.m(r11, r0)
            byte[] r0 = a5.c.f212a
            v4.d r0 = a5.c.f217f
            r0.getClass()
            java.util.regex.Pattern r0 = r0.f5422d
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0047
            java.lang.String r11 = com.bumptech.glide.e.v(r11)
            r0 = 7
            java.util.List r12 = a(r12, r0)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x002b
            goto L_0x0137
        L_0x002b:
            java.util.Iterator r12 = r12.iterator()
        L_0x002f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.bumptech.glide.e.v(r0)
            boolean r0 = b1.o.c(r11, r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x0136
        L_0x0047:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            b1.o.l(r0, r3)
            java.lang.String r11 = r11.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            b1.o.l(r11, r0)
            r4 = 2
            java.util.List r12 = a(r12, r4)
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L_0x0064
            goto L_0x0137
        L_0x0064:
            java.util.Iterator r12 = r12.iterator()
        L_0x0068:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r12.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r11.length()
            if (r5 != 0) goto L_0x007c
            r5 = r2
            goto L_0x007d
        L_0x007c:
            r5 = r1
        L_0x007d:
            if (r5 != 0) goto L_0x0133
            java.lang.String r5 = "."
            boolean r6 = v4.i.k0(r11, r5, r1)
            if (r6 != 0) goto L_0x0133
            java.lang.String r6 = ".."
            boolean r7 = r11.endsWith(r6)
            if (r7 == 0) goto L_0x0091
            goto L_0x0133
        L_0x0091:
            if (r4 == 0) goto L_0x009c
            int r7 = r4.length()
            if (r7 != 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r7 = r1
            goto L_0x009d
        L_0x009c:
            r7 = r2
        L_0x009d:
            if (r7 != 0) goto L_0x0133
            boolean r7 = v4.i.k0(r4, r5, r1)
            if (r7 != 0) goto L_0x0133
            boolean r6 = r4.endsWith(r6)
            if (r6 == 0) goto L_0x00ad
            goto L_0x0133
        L_0x00ad:
            boolean r6 = r11.endsWith(r5)
            if (r6 != 0) goto L_0x00b8
            java.lang.String r6 = r11.concat(r5)
            goto L_0x00b9
        L_0x00b8:
            r6 = r11
        L_0x00b9:
            boolean r7 = r4.endsWith(r5)
            if (r7 != 0) goto L_0x00c3
            java.lang.String r4 = r4.concat(r5)
        L_0x00c3:
            java.util.Locale r5 = java.util.Locale.US
            b1.o.l(r5, r3)
            if (r4 == 0) goto L_0x012b
            java.lang.String r4 = r4.toLowerCase(r5)
            b1.o.l(r4, r0)
            java.lang.String r5 = "*"
            boolean r5 = v4.i.R(r4, r5)
            if (r5 != 0) goto L_0x00de
            boolean r4 = b1.o.c(r6, r4)
            goto L_0x0134
        L_0x00de:
            java.lang.String r5 = "*."
            boolean r7 = v4.i.k0(r4, r5, r1)
            if (r7 == 0) goto L_0x0133
            r7 = 42
            r8 = 4
            int r7 = v4.i.X(r4, r7, r2, r1, r8)
            r9 = -1
            if (r7 == r9) goto L_0x00f1
            goto L_0x0133
        L_0x00f1:
            int r7 = r6.length()
            int r10 = r4.length()
            if (r7 >= r10) goto L_0x00fc
            goto L_0x0133
        L_0x00fc:
            boolean r5 = b1.o.c(r5, r4)
            if (r5 == 0) goto L_0x0103
            goto L_0x0133
        L_0x0103:
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            b1.o.l(r4, r5)
            boolean r5 = r6.endsWith(r4)
            if (r5 != 0) goto L_0x0113
            goto L_0x0133
        L_0x0113:
            int r5 = r6.length()
            int r4 = r4.length()
            int r5 = r5 - r4
            if (r5 <= 0) goto L_0x0129
            int r5 = r5 + -1
            r4 = 46
            int r4 = v4.i.b0(r6, r4, r5, r8)
            if (r4 == r9) goto L_0x0129
            goto L_0x0133
        L_0x0129:
            r4 = r2
            goto L_0x0134
        L_0x012b:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type java.lang.String"
            r11.<init>(r12)
            throw r11
        L_0x0133:
            r4 = r1
        L_0x0134:
            if (r4 == 0) goto L_0x0068
        L_0x0136:
            r1 = r2
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.c.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        o.m(str, "host");
        o.m(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
