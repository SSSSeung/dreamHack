package p;

import java.util.ArrayList;
import o4.c;

public final class b extends c {
    public b() {
        synchronized (g.f4375b) {
            ArrayList arrayList = g.f4377d;
            Object obj = null;
            ArrayList arrayList2 = arrayList.isEmpty() ^ true ? new ArrayList(arrayList) : null;
            if (arrayList2 != null) {
                if (((c) (arrayList2.size() == 1 ? arrayList2.get(0) : obj)) == null) {
                    new a(0, arrayList2);
                }
            }
        }
    }
}
