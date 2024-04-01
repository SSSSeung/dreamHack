package x3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class m extends AbstractSet {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5733d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f5734e;

    public /* synthetic */ m(p pVar, int i3) {
        this.f5733d = i3;
        this.f5734e = pVar;
    }

    public final void clear() {
        int i3 = this.f5733d;
        p pVar = this.f5734e;
        switch (i3) {
            case 0:
                pVar.clear();
                return;
            default:
                pVar.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i3 = this.f5733d;
        p pVar = this.f5734e;
        switch (i3) {
            case 0:
                return (obj instanceof Map.Entry) && pVar.b((Map.Entry) obj) != null;
            default:
                return pVar.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.f5733d) {
            case 0:
                return new l(this);
            default:
                return new l(this, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f5733d
            r1 = 1
            x3.p r2 = r4.f5734e
            r3 = 0
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001d
        L_0x000a:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            x3.o r5 = r2.b(r5)
            if (r5 != 0) goto L_0x0019
        L_0x0017:
            r1 = r3
            goto L_0x001c
        L_0x0019:
            r2.d(r5, r1)
        L_0x001c:
            return r1
        L_0x001d:
            r2.getClass()
            if (r5 == 0) goto L_0x0027
            x3.o r5 = r2.a(r5, r3)     // Catch:{ ClassCastException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 == 0) goto L_0x002d
            r2.d(r5, r1)
        L_0x002d:
            if (r5 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.remove(java.lang.Object):boolean");
    }

    public final int size() {
        int i3 = this.f5733d;
        p pVar = this.f5734e;
        switch (i3) {
            case 0:
                return pVar.f5752g;
            default:
                return pVar.f5752g;
        }
    }
}
