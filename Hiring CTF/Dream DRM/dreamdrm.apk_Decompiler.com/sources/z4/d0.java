package z4;

import b1.o;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f5988a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f5989b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f5990c;

    public d0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        o.m(aVar, "address");
        o.m(inetSocketAddress, "socketAddress");
        this.f5988a = aVar;
        this.f5989b = proxy;
        this.f5990c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return o.c(d0Var.f5988a, this.f5988a) && o.c(d0Var.f5989b, this.f5989b) && o.c(d0Var.f5990c, this.f5990c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f5989b.hashCode();
        return this.f5990c.hashCode() + ((hashCode + ((this.f5988a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f5990c + '}';
    }
}
