package t1;

import java.util.ArrayList;

public final class k extends q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5125a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5126b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5127c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5128d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5129e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5130f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l f5131g;

    public k(l lVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f5131g = lVar;
        this.f5125a = obj;
        this.f5126b = arrayList;
        this.f5127c = obj2;
        this.f5128d = arrayList2;
        this.f5129e = obj3;
        this.f5130f = arrayList3;
    }

    public final void b(p pVar) {
        pVar.v(this);
    }

    public final void c() {
        l lVar = this.f5131g;
        Object obj = this.f5125a;
        if (obj != null) {
            lVar.u(obj, this.f5126b, (ArrayList) null);
        }
        Object obj2 = this.f5127c;
        if (obj2 != null) {
            lVar.u(obj2, this.f5128d, (ArrayList) null);
        }
        Object obj3 = this.f5129e;
        if (obj3 != null) {
            lVar.u(obj3, this.f5130f, (ArrayList) null);
        }
    }
}
