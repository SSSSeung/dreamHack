package y;

import b1.o;
import b1.v;
import g0.g;
import java.util.ArrayList;
import java.util.PriorityQueue;
import w2.a;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5773a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5774b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5775c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5776d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5777e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final Object f5778f;

    public i() {
        g gVar = new g(1, this);
        this.f5778f = gVar;
        this.f5775c = new PriorityQueue(120, gVar);
        this.f5774b = new PriorityQueue(120, gVar);
        this.f5776d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f5777e) {
            while (((PriorityQueue) this.f5775c).size() + ((PriorityQueue) this.f5774b).size() >= 120 && !((PriorityQueue) this.f5774b).isEmpty()) {
                ((a) ((PriorityQueue) this.f5774b).poll()).f5468c.recycle();
            }
            while (((PriorityQueue) this.f5775c).size() + ((PriorityQueue) this.f5774b).size() >= 120 && !((PriorityQueue) this.f5775c).isEmpty()) {
                ((a) ((PriorityQueue) this.f5775c).poll()).f5468c.recycle();
            }
        }
    }

    public final String toString() {
        switch (this.f5773a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                v vVar = (v) this.f5778f;
                v vVar2 = (v) this.f5777e;
                if (vVar != vVar2) {
                    while (true) {
                        if (!(vVar == null || vVar == vVar2)) {
                            sb.append(String.valueOf(vVar));
                            if (vVar2 != null) {
                                sb.append(",");
                                vVar = null;
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    o.l(sb2, "StringBuilder().apply(builderAction).toString()");
                    return sb2;
                }
                sb.append("]");
                String sb22 = sb.toString();
                o.l(sb22, "StringBuilder().apply(builderAction).toString()");
                return sb22;
            default:
                return super.toString();
        }
    }
}
