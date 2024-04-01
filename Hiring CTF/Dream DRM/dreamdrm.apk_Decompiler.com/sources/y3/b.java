package y3;

import c4.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import v3.a0;
import v3.n;

public final class b extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5846c = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final Class f5847a;

    /* renamed from: b  reason: collision with root package name */
    public final q f5848b;

    public b(n nVar, a0 a0Var, Class cls) {
        this.f5848b = new q(nVar, a0Var, cls);
        this.f5847a = cls;
    }

    public final Object b(a aVar) {
        if (aVar.Q() == 9) {
            aVar.M();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.D()) {
            arrayList.add(this.f5848b.b(aVar));
        }
        aVar.n();
        int size = arrayList.size();
        Class cls = this.f5847a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(cls, size));
        }
        Object newInstance = Array.newInstance(cls, size);
        for (int i3 = 0; i3 < size; i3++) {
            Array.set(newInstance, i3, arrayList.get(i3));
        }
        return newInstance;
    }
}
