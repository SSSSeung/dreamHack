package e2;

import androidx.fragment.app.n0;
import b1.o;
import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w0.c;

public final class b0 {

    /* renamed from: e  reason: collision with root package name */
    public static final n0 f2489e = new n0(27);

    /* renamed from: f  reason: collision with root package name */
    public static final i f2490f = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2491a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final n0 f2492b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f2493c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final c f2494d;

    public b0(androidx.activity.result.c cVar) {
        n0 n0Var = f2489e;
        this.f2494d = cVar;
        this.f2492b = n0Var;
    }

    public final synchronized v a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f2491a.iterator();
            boolean z5 = false;
            while (true) {
                boolean z6 = true;
                if (!it.hasNext()) {
                    break;
                }
                a0 a0Var = (a0) it.next();
                if (this.f2493c.contains(a0Var)) {
                    z5 = true;
                } else {
                    if (!a0Var.f2484a.isAssignableFrom(cls) || !a0Var.f2485b.isAssignableFrom(cls2)) {
                        z6 = false;
                    }
                    if (z6) {
                        this.f2493c.add(a0Var);
                        v d6 = a0Var.f2486c.d(this);
                        o.i(d6);
                        arrayList.add(d6);
                        this.f2493c.remove(a0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                n0 n0Var = this.f2492b;
                c cVar = this.f2494d;
                n0Var.getClass();
                return new z(arrayList, cVar);
            } else if (arrayList.size() == 1) {
                return (v) arrayList.get(0);
            } else if (z5) {
                return f2490f;
            } else {
                throw new j(cls, cls2);
            }
        } catch (Throwable th) {
            this.f2493c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f2491a.iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (!this.f2493c.contains(a0Var)) {
                    if (a0Var.f2484a.isAssignableFrom(cls)) {
                        this.f2493c.add(a0Var);
                        v d6 = a0Var.f2486c.d(this);
                        o.i(d6);
                        arrayList.add(d6);
                        this.f2493c.remove(a0Var);
                    }
                }
            }
        } catch (Throwable th) {
            this.f2493c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2491a.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!arrayList.contains(a0Var.f2485b) && a0Var.f2484a.isAssignableFrom(cls)) {
                arrayList.add(a0Var.f2485b);
            }
        }
        return arrayList;
    }
}
