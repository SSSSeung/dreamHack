package v3;

import c4.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class l extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f5395b;

    public /* synthetic */ l(a0 a0Var, int i3) {
        this.f5394a = i3;
        this.f5395b = a0Var;
    }

    public final Object b(a aVar) {
        int i3 = this.f5394a;
        a0 a0Var = this.f5395b;
        switch (i3) {
            case 0:
                return new AtomicLong(((Number) a0Var.b(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.D()) {
                    arrayList.add(Long.valueOf(((Number) a0Var.b(aVar)).longValue()));
                }
                aVar.n();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i6 = 0; i6 < size; i6++) {
                    atomicLongArray.set(i6, ((Long) arrayList.get(i6)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.Q() != 9) {
                    return a0Var.b(aVar);
                }
                aVar.M();
                return null;
        }
    }
}
