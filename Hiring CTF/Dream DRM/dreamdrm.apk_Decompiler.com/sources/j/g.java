package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class g implements Iterable {

    /* renamed from: d  reason: collision with root package name */
    public c f3640d;

    /* renamed from: e  reason: collision with root package name */
    public c f3641e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f3642f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public int f3643g = 0;

    public c a(Object obj) {
        c cVar = this.f3640d;
        while (cVar != null && !cVar.f3631d.equals(obj)) {
            cVar = cVar.f3633f;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a6 = a(obj);
        if (a6 == null) {
            return null;
        }
        this.f3643g--;
        WeakHashMap weakHashMap = this.f3642f;
        if (!weakHashMap.isEmpty()) {
            for (f a7 : weakHashMap.keySet()) {
                a7.a(a6);
            }
        }
        c cVar = a6.f3634g;
        c cVar2 = a6.f3633f;
        if (cVar != null) {
            cVar.f3633f = cVar2;
        } else {
            this.f3640d = cVar2;
        }
        c cVar3 = a6.f3633f;
        if (cVar3 != null) {
            cVar3.f3634g = cVar;
        } else {
            this.f3641e = cVar;
        }
        a6.f3633f = null;
        a6.f3634g = null;
        return a6.f3632e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((j.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof j.g
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            j.g r7 = (j.g) r7
            int r1 = r6.f3643g
            int r3 = r7.f3643g
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            j.e r3 = (j.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            j.e r4 = (j.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            j.e r7 = (j.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        b bVar = new b(this.f3640d, this.f3641e, 0);
        this.f3642f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
