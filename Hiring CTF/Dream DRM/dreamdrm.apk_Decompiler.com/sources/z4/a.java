package z4;

import a2.m;
import androidx.compose.ui.platform.e;
import b1.o;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k5.c;
import v4.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final t f5945a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5946b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5947c;

    /* renamed from: d  reason: collision with root package name */
    public final o f5948d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f5949e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f5950f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f5951g;

    /* renamed from: h  reason: collision with root package name */
    public final g f5952h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5953i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f5954j = null;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f5955k;

    public a(String str, int i3, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, c cVar, g gVar, e eVar, List list, List list2, ProxySelector proxySelector) {
        o.m(str, "uriHost");
        o.m(nVar, "dns");
        o.m(socketFactory, "socketFactory");
        o.m(eVar, "proxyAuthenticator");
        o.m(list, "protocols");
        o.m(list2, "connectionSpecs");
        o.m(proxySelector, "proxySelector");
        this.f5948d = nVar;
        this.f5949e = socketFactory;
        this.f5950f = sSLSocketFactory;
        this.f5951g = cVar;
        this.f5952h = gVar;
        this.f5953i = eVar;
        this.f5955k = proxySelector;
        s sVar = new s();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? str2 : "http";
        if (i.T(str3, "http")) {
            str2 = "http";
        } else if (!i.T(str3, str2)) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        sVar.f6061a = str2;
        boolean z5 = false;
        String v5 = com.bumptech.glide.e.v(n.e(str, 0, 0, false, 7));
        if (v5 != null) {
            sVar.f6064d = v5;
            if (1 <= i3 && 65535 >= i3) {
                z5 = true;
            }
            if (z5) {
                sVar.f6065e = i3;
                this.f5945a = sVar.a();
                this.f5946b = a5.c.u(list);
                this.f5947c = a5.c.u(list2);
                return;
            }
            throw new IllegalArgumentException(m.g("unexpected port: ", i3).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean a(a aVar) {
        o.m(aVar, "that");
        return o.c(this.f5948d, aVar.f5948d) && o.c(this.f5953i, aVar.f5953i) && o.c(this.f5946b, aVar.f5946b) && o.c(this.f5947c, aVar.f5947c) && o.c(this.f5955k, aVar.f5955k) && o.c(this.f5954j, aVar.f5954j) && o.c(this.f5950f, aVar.f5950f) && o.c(this.f5951g, aVar.f5951g) && o.c(this.f5952h, aVar.f5952h) && this.f5945a.f6075f == aVar.f5945a.f6075f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return o.c(this.f5945a, aVar.f5945a) && a(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f5948d.hashCode();
        int hashCode2 = this.f5953i.hashCode();
        int hashCode3 = this.f5946b.hashCode();
        int hashCode4 = this.f5947c.hashCode();
        int hashCode5 = this.f5955k.hashCode();
        int hashCode6 = Objects.hashCode(this.f5954j);
        int hashCode7 = Objects.hashCode(this.f5950f);
        int hashCode8 = Objects.hashCode(this.f5951g);
        return Objects.hashCode(this.f5952h) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f5945a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        t tVar = this.f5945a;
        sb.append(tVar.f6074e);
        sb.append(':');
        sb.append(tVar.f6075f);
        sb.append(", ");
        Proxy proxy = this.f5954j;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f5955k;
        }
        return m.j(sb, str, "}");
    }
}
