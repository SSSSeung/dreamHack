package d5;

import a5.c;
import b1.o;
import h4.a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l0.g;
import z4.h;
import z4.i;
import z4.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f2185a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2186b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2187c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2188d;

    public b(List list) {
        o.m(list, "connectionSpecs");
        this.f2188d = list;
    }

    public final j a(SSLSocket sSLSocket) {
        j jVar;
        boolean z5;
        String[] strArr;
        String[] strArr2;
        int i3 = this.f2185a;
        List list = this.f2188d;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                jVar = null;
                break;
            }
            jVar = (j) list.get(i3);
            if (jVar.b(sSLSocket)) {
                this.f2185a = i3 + 1;
                break;
            }
            i3++;
        }
        if (jVar != null) {
            int i6 = this.f2185a;
            int size2 = list.size();
            while (true) {
                if (i6 >= size2) {
                    z5 = false;
                    break;
                } else if (((j) list.get(i6)).b(sSLSocket)) {
                    z5 = true;
                    break;
                } else {
                    i6++;
                }
            }
            this.f2186b = z5;
            boolean z6 = this.f2187c;
            String[] strArr3 = jVar.f6033c;
            if (strArr3 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                o.l(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                strArr = c.n(enabledCipherSuites, strArr3, h.f6005b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = jVar.f6034d;
            if (strArr4 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                o.l(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = c.n(enabledProtocols, strArr4, a.f3456a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            o.l(supportedCipherSuites, "supportedCipherSuites");
            g gVar = h.f6005b;
            byte[] bArr = c.f212a;
            int length = supportedCipherSuites.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                }
                if (gVar.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i7++;
            }
            if (z6 && i7 != -1) {
                o.l(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i7];
                o.l(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                o.l(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            i iVar = new i(jVar);
            o.l(strArr, "cipherSuitesIntersection");
            iVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
            o.l(strArr2, "tlsVersionsIntersection");
            iVar.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            j a6 = iVar.a();
            if (a6.c() != null) {
                sSLSocket.setEnabledProtocols(a6.f6034d);
            }
            if (a6.a() != null) {
                sSLSocket.setEnabledCipherSuites(a6.f6033c);
            }
            return jVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f2187c);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        o.k(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        o.l(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
