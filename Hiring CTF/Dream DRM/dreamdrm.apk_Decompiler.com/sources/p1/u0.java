package p1;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f4681a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public int f4682b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Set f4683c = Collections.newSetFromMap(new IdentityHashMap());

    public final t0 a(int i3) {
        SparseArray sparseArray = this.f4681a;
        t0 t0Var = (t0) sparseArray.get(i3);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0();
        sparseArray.put(i3, t0Var2);
        return t0Var2;
    }
}
