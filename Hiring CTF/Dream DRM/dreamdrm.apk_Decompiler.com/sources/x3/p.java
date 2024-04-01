package x3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import l0.g;

public final class p extends AbstractMap implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final g f5748l = new g(3);

    /* renamed from: d  reason: collision with root package name */
    public final Comparator f5749d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5750e;

    /* renamed from: f  reason: collision with root package name */
    public o f5751f;

    /* renamed from: g  reason: collision with root package name */
    public int f5752g;

    /* renamed from: h  reason: collision with root package name */
    public int f5753h;

    /* renamed from: i  reason: collision with root package name */
    public final o f5754i;

    /* renamed from: j  reason: collision with root package name */
    public m f5755j;

    /* renamed from: k  reason: collision with root package name */
    public m f5756k;

    public p() {
        this(true);
    }

    public final o a(Object obj, boolean z5) {
        int i3;
        o oVar;
        o oVar2 = this.f5751f;
        g gVar = f5748l;
        Comparator comparator = this.f5749d;
        if (oVar2 != null) {
            Comparable comparable = comparator == gVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oVar2.f5744i;
                i3 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i3 == 0) {
                    return oVar2;
                }
                o oVar3 = i3 < 0 ? oVar2.f5740e : oVar2.f5741f;
                if (oVar3 == null) {
                    break;
                }
                oVar2 = oVar3;
            }
        } else {
            i3 = 0;
        }
        if (!z5) {
            return null;
        }
        o oVar4 = this.f5754i;
        if (oVar2 != null) {
            oVar = new o(this.f5750e, oVar2, obj, oVar4, oVar4.f5743h);
            if (i3 < 0) {
                oVar2.f5740e = oVar;
            } else {
                oVar2.f5741f = oVar;
            }
            c(oVar2, true);
        } else if (comparator != gVar || (obj instanceof Comparable)) {
            oVar = new o(this.f5750e, oVar2, obj, oVar4, oVar4.f5743h);
            this.f5751f = oVar;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.f5752g++;
        this.f5753h++;
        return oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x3.o b(java.util.Map.Entry r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            x3.o r0 = r4.a(r0, r1)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            if (r0 == 0) goto L_0x001d
            java.lang.Object r3 = r0.f5746k
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            r2 = r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.p.b(java.util.Map$Entry):x3.o");
    }

    public final void c(o oVar, boolean z5) {
        while (oVar != null) {
            o oVar2 = oVar.f5740e;
            o oVar3 = oVar.f5741f;
            int i3 = 0;
            int i6 = oVar2 != null ? oVar2.f5747l : 0;
            int i7 = oVar3 != null ? oVar3.f5747l : 0;
            int i8 = i6 - i7;
            if (i8 == -2) {
                o oVar4 = oVar3.f5740e;
                o oVar5 = oVar3.f5741f;
                int i9 = oVar5 != null ? oVar5.f5747l : 0;
                if (oVar4 != null) {
                    i3 = oVar4.f5747l;
                }
                int i10 = i3 - i9;
                if (i10 != -1 && (i10 != 0 || z5)) {
                    g(oVar3);
                }
                f(oVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 2) {
                o oVar6 = oVar2.f5740e;
                o oVar7 = oVar2.f5741f;
                int i11 = oVar7 != null ? oVar7.f5747l : 0;
                if (oVar6 != null) {
                    i3 = oVar6.f5747l;
                }
                int i12 = i3 - i11;
                if (i12 != 1 && (i12 != 0 || z5)) {
                    f(oVar2);
                }
                g(oVar);
                if (z5) {
                    return;
                }
            } else if (i8 == 0) {
                oVar.f5747l = i6 + 1;
                if (z5) {
                    return;
                }
            } else {
                oVar.f5747l = Math.max(i6, i7) + 1;
                if (!z5) {
                    return;
                }
            }
            oVar = oVar.f5739d;
        }
    }

    public final void clear() {
        this.f5751f = null;
        this.f5752g = 0;
        this.f5753h++;
        o oVar = this.f5754i;
        oVar.f5743h = oVar;
        oVar.f5742g = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0008
            x3.o r2 = r1.a(r2, r0)     // Catch:{ ClassCastException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.p.containsKey(java.lang.Object):boolean");
    }

    public final void d(o oVar, boolean z5) {
        o oVar2;
        int i3;
        o oVar3;
        if (z5) {
            o oVar4 = oVar.f5743h;
            oVar4.f5742g = oVar.f5742g;
            oVar.f5742g.f5743h = oVar4;
        }
        o oVar5 = oVar.f5740e;
        o oVar6 = oVar.f5741f;
        o oVar7 = oVar.f5739d;
        int i6 = 0;
        if (oVar5 == null || oVar6 == null) {
            if (oVar5 != null) {
                e(oVar, oVar5);
                oVar.f5740e = null;
            } else if (oVar6 != null) {
                e(oVar, oVar6);
                oVar.f5741f = null;
            } else {
                e(oVar, (o) null);
            }
            c(oVar7, false);
            this.f5752g--;
            this.f5753h++;
            return;
        }
        if (oVar5.f5747l > oVar6.f5747l) {
            do {
                oVar2 = oVar5;
                oVar5 = oVar5.f5741f;
            } while (oVar5 != null);
        } else {
            do {
                o oVar8 = oVar6;
                oVar6 = oVar6.f5740e;
                oVar3 = oVar8;
            } while (oVar6 != null);
            oVar2 = oVar3;
        }
        d(oVar2, false);
        o oVar9 = oVar.f5740e;
        if (oVar9 != null) {
            i3 = oVar9.f5747l;
            oVar2.f5740e = oVar9;
            oVar9.f5739d = oVar2;
            oVar.f5740e = null;
        } else {
            i3 = 0;
        }
        o oVar10 = oVar.f5741f;
        if (oVar10 != null) {
            i6 = oVar10.f5747l;
            oVar2.f5741f = oVar10;
            oVar10.f5739d = oVar2;
            oVar.f5741f = null;
        }
        oVar2.f5747l = Math.max(i3, i6) + 1;
        e(oVar, oVar2);
    }

    public final void e(o oVar, o oVar2) {
        o oVar3 = oVar.f5739d;
        oVar.f5739d = null;
        if (oVar2 != null) {
            oVar2.f5739d = oVar3;
        }
        if (oVar3 == null) {
            this.f5751f = oVar2;
        } else if (oVar3.f5740e == oVar) {
            oVar3.f5740e = oVar2;
        } else {
            oVar3.f5741f = oVar2;
        }
    }

    public final Set entrySet() {
        m mVar = this.f5755j;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.f5755j = mVar2;
        return mVar2;
    }

    public final void f(o oVar) {
        o oVar2 = oVar.f5740e;
        o oVar3 = oVar.f5741f;
        o oVar4 = oVar3.f5740e;
        o oVar5 = oVar3.f5741f;
        oVar.f5741f = oVar4;
        if (oVar4 != null) {
            oVar4.f5739d = oVar;
        }
        e(oVar, oVar3);
        oVar3.f5740e = oVar;
        oVar.f5739d = oVar3;
        int i3 = 0;
        int max = Math.max(oVar2 != null ? oVar2.f5747l : 0, oVar4 != null ? oVar4.f5747l : 0) + 1;
        oVar.f5747l = max;
        if (oVar5 != null) {
            i3 = oVar5.f5747l;
        }
        oVar3.f5747l = Math.max(max, i3) + 1;
    }

    public final void g(o oVar) {
        o oVar2 = oVar.f5740e;
        o oVar3 = oVar.f5741f;
        o oVar4 = oVar2.f5740e;
        o oVar5 = oVar2.f5741f;
        oVar.f5740e = oVar5;
        if (oVar5 != null) {
            oVar5.f5739d = oVar;
        }
        e(oVar, oVar2);
        oVar2.f5741f = oVar;
        oVar.f5739d = oVar2;
        int i3 = 0;
        int max = Math.max(oVar3 != null ? oVar3.f5747l : 0, oVar5 != null ? oVar5.f5747l : 0) + 1;
        oVar.f5747l = max;
        if (oVar4 != null) {
            i3 = oVar4.f5747l;
        }
        oVar2.f5747l = Math.max(max, i3) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            x3.o r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            java.lang.Object r0 = r3.f5746k
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.p.get(java.lang.Object):java.lang.Object");
    }

    public final Set keySet() {
        m mVar = this.f5756k;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f5756k = mVar2;
        return mVar2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f5750e) {
            o a6 = a(obj, true);
            Object obj3 = a6.f5746k;
            a6.f5746k = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            x3.o r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.d(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.f5746k
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.p.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f5752g;
    }

    public p(boolean z5) {
        g gVar = f5748l;
        this.f5752g = 0;
        this.f5753h = 0;
        this.f5749d = gVar;
        this.f5750e = z5;
        this.f5754i = new o(z5);
    }
}
