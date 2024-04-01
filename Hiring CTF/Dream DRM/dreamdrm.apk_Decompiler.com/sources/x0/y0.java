package x0;

import android.view.ViewGroup;
import b1.o;
import b1.v;
import java.util.Iterator;
import o4.e;
import u4.f;
import u4.g;

public final class y0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5642b;

    public /* synthetic */ y0(int i3, Object obj) {
        this.f5641a = i3;
        this.f5642b = obj;
    }

    public final Iterator iterator() {
        int i3 = this.f5641a;
        Object obj = this.f5642b;
        switch (i3) {
            case 0:
                return new a1(0, (ViewGroup) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                e eVar = (e) obj;
                o.m(eVar, "block");
                g gVar = new g();
                gVar.f5352g = v.q(gVar, gVar, eVar);
                return gVar;
            default:
                return (Iterator) obj;
        }
    }
}
