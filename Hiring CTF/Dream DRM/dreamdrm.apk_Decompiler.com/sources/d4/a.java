package d4;

import java.util.ArrayList;
import java.util.Iterator;
import k2.b;
import m2.d;
import y1.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2180a;

    public a() {
        this.f2180a = new ArrayList();
    }

    public synchronized l a(Class cls) {
        int size = this.f2180a.size();
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) this.f2180a.get(i3);
            if (dVar.f4183a.isAssignableFrom(cls)) {
                return dVar.f4184b;
            }
        }
        return null;
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f2180a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f3907a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f3908b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public /* synthetic */ a(int i3) {
        if (i3 == 1) {
            this.f2180a = new ArrayList();
        } else if (i3 == 2) {
            this.f2180a = new ArrayList();
        } else if (i3 == 3) {
            this.f2180a = new ArrayList();
        } else if (i3 == 4) {
            this.f2180a = new ArrayList();
        } else if (i3 != 5) {
            this.f2180a = new ArrayList();
        } else {
            this.f2180a = new ArrayList();
        }
    }
}
