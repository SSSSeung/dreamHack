package d5;

import b1.o;
import e2.f;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import z4.a;
import z4.d;
import z4.n;
import z4.t;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public List f2267a;

    /* renamed from: b  reason: collision with root package name */
    public int f2268b;

    /* renamed from: c  reason: collision with root package name */
    public List f2269c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2270d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final a f2271e;

    /* renamed from: f  reason: collision with root package name */
    public final f f2272f;

    /* renamed from: g  reason: collision with root package name */
    public final d f2273g;

    /* renamed from: h  reason: collision with root package name */
    public final n f2274h;

    public p(a aVar, f fVar, j jVar, n nVar) {
        o.m(aVar, "address");
        o.m(fVar, "routeDatabase");
        o.m(jVar, "call");
        o.m(nVar, "eventListener");
        this.f2271e = aVar;
        this.f2272f = fVar;
        this.f2273g = jVar;
        this.f2274h = nVar;
        g4.n nVar2 = g4.n.f2906d;
        this.f2267a = nVar2;
        this.f2269c = nVar2;
        Proxy proxy = aVar.f5954j;
        t tVar = aVar.f5945a;
        z4.f fVar2 = new z4.f(this, proxy, tVar, 2);
        o.m(tVar, "url");
        List b6 = fVar2.b();
        this.f2267a = b6;
        this.f2268b = 0;
        o.m(b6, "proxies");
    }

    public final boolean a() {
        return (this.f2268b < this.f2267a.size()) || (this.f2270d.isEmpty() ^ true);
    }
}
