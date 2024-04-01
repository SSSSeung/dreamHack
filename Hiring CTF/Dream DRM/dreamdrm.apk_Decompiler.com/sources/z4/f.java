package z4;

import a5.c;
import b1.o;
import b1.v;
import com.bumptech.glide.e;
import d5.p;
import g4.i;
import java.net.Proxy;
import java.net.URI;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import o4.a;

public final class f extends p4.f implements a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5998e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f5999f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f6000g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f6001h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i3) {
        super(0);
        this.f5998e = i3;
        this.f5999f = obj;
        this.f6000g = obj2;
        this.f6001h = obj3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f5998e) {
            case 0:
                return b();
            case 1:
                return b();
            default:
                return b();
        }
    }

    public final List b() {
        List<Certificate> list;
        int i3 = this.f5998e;
        Object obj = this.f6001h;
        Object obj2 = this.f6000g;
        Object obj3 = this.f5999f;
        switch (i3) {
            case 0:
                e eVar = ((g) obj3).f6004b;
                if (eVar == null || (list = eVar.h((String) obj, (List) obj2)) == null) {
                    list = (List) obj2;
                }
                ArrayList arrayList = new ArrayList(i.W(list));
                for (Certificate certificate : list) {
                    if (certificate != null) {
                        arrayList.add((X509Certificate) certificate);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                return arrayList;
            case 1:
                e eVar2 = ((g) obj3).f6004b;
                o.k(eVar2);
                return eVar2.h(((a) obj).f5945a.f6074e, ((p) obj2).a());
            default:
                Proxy proxy = (Proxy) obj2;
                if (proxy != null) {
                    return v.D(proxy);
                }
                URI g6 = ((t) obj).g();
                if (g6.getHost() == null) {
                    return c.j(Proxy.NO_PROXY);
                }
                List<Proxy> select = ((p) obj3).f2271e.f5955k.select(g6);
                if (!(select == null || select.isEmpty())) {
                    return c.u(select);
                }
                return c.j(Proxy.NO_PROXY);
        }
    }
}
