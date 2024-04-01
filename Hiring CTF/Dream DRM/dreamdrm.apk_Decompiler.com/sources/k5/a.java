package k5;

import b1.o;
import com.bumptech.glide.e;

public final class a extends e {

    /* renamed from: d  reason: collision with root package name */
    public final d f3974d;

    public a(d dVar) {
        o.m(dVar, "trustRootIndex");
        this.f3974d = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && o.c(((a) obj).f3974d, this.f3974d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x006b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List h(java.lang.String r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            b1.o.m(r12, r0)
            java.lang.String r0 = "hostname"
            b1.o.m(r11, r0)
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r11.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            b1.o.l(r0, r1)
            r12.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0023:
            r3 = 9
            if (r1 >= r3) goto L_0x00ce
            int r3 = r12.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r12.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            if (r3 == 0) goto L_0x00c8
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            k5.d r6 = r10.f3974d
            java.security.cert.X509Certificate r6 = r6.a(r3)
            if (r6 == 0) goto L_0x006e
            int r2 = r12.size()
            if (r2 > r4) goto L_0x004c
            boolean r2 = b1.o.c(r3, r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x004f
        L_0x004c:
            r12.add(r6)
        L_0x004f:
            java.security.Principal r2 = r6.getIssuerDN()
            java.security.Principal r3 = r6.getSubjectDN()
            boolean r2 = b1.o.c(r2, r3)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x005f
            goto L_0x0068
        L_0x005f:
            java.security.PublicKey r2 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0068 }
            r6.verify(r2)     // Catch:{ GeneralSecurityException -> 0x0068 }
            r2 = r4
            goto L_0x0069
        L_0x0068:
            r2 = r0
        L_0x0069:
            if (r2 == 0) goto L_0x006c
            return r12
        L_0x006c:
            r2 = r4
            goto L_0x00a7
        L_0x006e:
            java.util.Iterator r6 = r11.iterator()
            java.lang.String r7 = "queue.iterator()"
            b1.o.l(r6, r7)
        L_0x0077:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b1
            java.lang.Object r7 = r6.next()
            if (r7 == 0) goto L_0x00ab
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.security.Principal r8 = r3.getIssuerDN()
            java.security.Principal r9 = r7.getSubjectDN()
            boolean r8 = b1.o.c(r8, r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0095
            goto L_0x009e
        L_0x0095:
            java.security.PublicKey r8 = r7.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x009e }
            r3.verify(r8)     // Catch:{ GeneralSecurityException -> 0x009e }
            r8 = r4
            goto L_0x009f
        L_0x009e:
            r8 = r0
        L_0x009f:
            if (r8 == 0) goto L_0x0077
            r6.remove()
            r12.add(r7)
        L_0x00a7:
            int r1 = r1 + 1
            goto L_0x0023
        L_0x00ab:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x00b1:
            if (r2 == 0) goto L_0x00b4
            return r12
        L_0x00b4:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c8:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r5)
            throw r11
        L_0x00ce:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.a.h(java.lang.String, java.util.List):java.util.List");
    }

    public final int hashCode() {
        return this.f3974d.hashCode();
    }
}
