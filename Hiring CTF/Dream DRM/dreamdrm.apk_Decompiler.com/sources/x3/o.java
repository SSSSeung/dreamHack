package x3;

import java.util.Map;

public final class o implements Map.Entry {

    /* renamed from: d  reason: collision with root package name */
    public o f5739d;

    /* renamed from: e  reason: collision with root package name */
    public o f5740e;

    /* renamed from: f  reason: collision with root package name */
    public o f5741f;

    /* renamed from: g  reason: collision with root package name */
    public o f5742g;

    /* renamed from: h  reason: collision with root package name */
    public o f5743h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f5744i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5745j;

    /* renamed from: k  reason: collision with root package name */
    public Object f5746k;

    /* renamed from: l  reason: collision with root package name */
    public int f5747l;

    public o(boolean z5) {
        this.f5744i = null;
        this.f5745j = z5;
        this.f5743h = this;
        this.f5742g = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f5744i
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x002e
            goto L_0x001c
        L_0x0012:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001c:
            java.lang.Object r0 = r3.f5746k
            java.lang.Object r4 = r4.getValue()
            if (r0 != 0) goto L_0x0027
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0027:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.o.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f5744i;
    }

    public final Object getValue() {
        return this.f5746k;
    }

    public final int hashCode() {
        int i3 = 0;
        Object obj = this.f5744i;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5746k;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i3 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        if (obj != null || this.f5745j) {
            Object obj2 = this.f5746k;
            this.f5746k = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        return this.f5744i + "=" + this.f5746k;
    }

    public o(boolean z5, o oVar, Object obj, o oVar2, o oVar3) {
        this.f5739d = oVar;
        this.f5744i = obj;
        this.f5745j = z5;
        this.f5747l = 1;
        this.f5742g = oVar2;
        this.f5743h = oVar3;
        oVar3.f5742g = this;
        oVar2.f5743h = this;
    }
}
