package z4;

import b1.o;
import f4.f;
import g4.i;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import o4.a;
import y.e;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final f f6055a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f6056b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6057c;

    /* renamed from: d  reason: collision with root package name */
    public final List f6058d;

    public p(e0 e0Var, h hVar, List list, a aVar) {
        o.m(e0Var, "tlsVersion");
        o.m(hVar, "cipherSuite");
        o.m(list, "localCertificates");
        this.f6056b = e0Var;
        this.f6057c = hVar;
        this.f6058d = list;
        this.f6055a = new f(new e(7, aVar));
    }

    public final List a() {
        return (List) this.f6055a.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return pVar.f6056b == this.f6056b && o.c(pVar.f6057c, this.f6057c) && o.c(pVar.a(), a()) && o.c(pVar.f6058d, this.f6058d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6057c.hashCode();
        int hashCode2 = a().hashCode();
        return this.f6058d.hashCode() + ((hashCode2 + ((hashCode + ((this.f6056b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a6 = a();
        ArrayList arrayList = new ArrayList(i.W(a6));
        for (Certificate certificate : a6) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                o.l(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f6056b);
        sb.append(" cipherSuite=");
        sb.append(this.f6057c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f6058d;
        ArrayList arrayList2 = new ArrayList(i.W(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                o.l(str, "type");
            }
            arrayList2.add(str);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
