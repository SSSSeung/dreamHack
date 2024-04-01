package g4;

import b1.o;
import f4.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class q extends o {
    public static final Map g0(ArrayList arrayList) {
        o oVar = o.f2907d;
        int size = arrayList.size();
        if (size == 0) {
            return oVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(o.I(arrayList.size()));
            h0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        c cVar = (c) arrayList.get(0);
        o.m(cVar, "pair");
        Map singletonMap = Collections.singletonMap(cVar.f2676d, cVar.f2677e);
        o.l(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void h0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            linkedHashMap.put(cVar.f2676d, cVar.f2677e);
        }
    }
}
