package k5;

import b1.o;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3975a;

    public b(X509Certificate... x509CertificateArr) {
        o.m(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            o.l(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f3975a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate r5) {
        /*
            r4 = this;
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.LinkedHashMap r1 = r4.f3975a
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ Exception -> 0x0029 }
            r5.verify(r3)     // Catch:{ Exception -> 0x0029 }
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x0013
            r1 = r2
        L_0x002d:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && o.c(((b) obj).f3975a, this.f3975a));
    }

    public final int hashCode() {
        return this.f3975a.hashCode();
    }
}
