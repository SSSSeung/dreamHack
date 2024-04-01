package k;

import b1.o;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class j {

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f3889g;

    /* renamed from: h  reason: collision with root package name */
    public static int f3890h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f3891i;

    /* renamed from: j  reason: collision with root package name */
    public static int f3892j;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3893d = o.f1521h;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f3894e = o.f1522i;

    /* renamed from: f  reason: collision with root package name */
    public int f3895f = 0;

    private void a(int i3) {
        if (i3 == 8) {
            synchronized (j.class) {
                Object[] objArr = f3891i;
                if (objArr != null) {
                    this.f3894e = objArr;
                    f3891i = (Object[]) objArr[0];
                    this.f3893d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3892j--;
                    return;
                }
            }
        } else if (i3 == 4) {
            synchronized (j.class) {
                Object[] objArr2 = f3889g;
                if (objArr2 != null) {
                    this.f3894e = objArr2;
                    f3889g = (Object[]) objArr2[0];
                    this.f3893d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3890h--;
                    return;
                }
            }
        }
        this.f3893d = new int[i3];
        this.f3894e = new Object[(i3 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (j.class) {
                if (f3892j < 10) {
                    objArr[0] = f3891i;
                    objArr[1] = iArr;
                    for (int i6 = (i3 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f3891i = objArr;
                    f3892j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (j.class) {
                if (f3890h < 10) {
                    objArr[0] = f3889g;
                    objArr[1] = iArr;
                    for (int i7 = (i3 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f3889g = objArr;
                    f3890h++;
                }
            }
        }
    }

    public final void b(int i3) {
        int i6 = this.f3895f;
        int[] iArr = this.f3893d;
        if (iArr.length < i3) {
            Object[] objArr = this.f3894e;
            a(i3);
            if (this.f3895f > 0) {
                System.arraycopy(iArr, 0, this.f3893d, 0, i6);
                System.arraycopy(objArr, 0, this.f3894e, 0, i6 << 1);
            }
            c(iArr, objArr, i6);
        }
        if (this.f3895f != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i3 = this.f3895f;
        if (i3 > 0) {
            int[] iArr = this.f3893d;
            Object[] objArr = this.f3894e;
            this.f3893d = o.f1521h;
            this.f3894e = o.f1522i;
            this.f3895f = 0;
            c(iArr, objArr, i3);
        }
        if (this.f3895f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i3, Object obj) {
        int i6 = this.f3895f;
        if (i6 == 0) {
            return -1;
        }
        try {
            int d6 = o.d(i6, i3, this.f3893d);
            if (d6 < 0 || obj.equals(this.f3894e[d6 << 1])) {
                return d6;
            }
            int i7 = d6 + 1;
            while (i7 < i6 && this.f3893d[i7] == i3) {
                if (obj.equals(this.f3894e[i7 << 1])) {
                    return i7;
                }
                i7++;
            }
            int i8 = d6 - 1;
            while (i8 >= 0 && this.f3893d[i8] == i3) {
                if (obj.equals(this.f3894e[i8 << 1])) {
                    return i8;
                }
                i8--;
            }
            return ~i7;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3895f != jVar.f3895f) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f3895f) {
                try {
                    Object h6 = h(i3);
                    Object l6 = l(i3);
                    Object orDefault = jVar.getOrDefault(h6, (Object) null);
                    if (l6 == null) {
                        if (orDefault != null || !jVar.containsKey(h6)) {
                            return false;
                        }
                    } else if (!l6.equals(orDefault)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3895f != map.size()) {
                return false;
            }
            int i6 = 0;
            while (i6 < this.f3895f) {
                try {
                    Object h7 = h(i6);
                    Object l7 = l(i6);
                    Object obj2 = map.get(h7);
                    if (l7 == null) {
                        if (obj2 != null || !map.containsKey(h7)) {
                            return false;
                        }
                    } else if (!l7.equals(obj2)) {
                        return false;
                    }
                    i6++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i3 = this.f3895f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int d6 = o.d(i3, 0, this.f3893d);
            if (d6 < 0 || this.f3894e[d6 << 1] == null) {
                return d6;
            }
            int i6 = d6 + 1;
            while (i6 < i3 && this.f3893d[i6] == 0) {
                if (this.f3894e[i6 << 1] == null) {
                    return i6;
                }
                i6++;
            }
            int i7 = d6 - 1;
            while (i7 >= 0 && this.f3893d[i7] == 0) {
                if (this.f3894e[i7 << 1] == null) {
                    return i7;
                }
                i7--;
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i3 = this.f3895f * 2;
        Object[] objArr = this.f3894e;
        if (obj == null) {
            for (int i6 = 1; i6 < i3; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i3; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e6 = e(obj);
        return e6 >= 0 ? this.f3894e[(e6 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        return this.f3894e[i3 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f3893d;
        Object[] objArr = this.f3894e;
        int i3 = this.f3895f;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            Object obj = objArr[i6];
            i8 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public void i(b bVar) {
        int i3 = bVar.f3895f;
        b(this.f3895f + i3);
        if (this.f3895f != 0) {
            for (int i6 = 0; i6 < i3; i6++) {
                put(bVar.h(i6), bVar.l(i6));
            }
        } else if (i3 > 0) {
            System.arraycopy(bVar.f3893d, 0, this.f3893d, 0, i3);
            System.arraycopy(bVar.f3894e, 0, this.f3894e, 0, i3 << 1);
            this.f3895f = i3;
        }
    }

    public final boolean isEmpty() {
        return this.f3895f <= 0;
    }

    public Object j(int i3) {
        Object[] objArr = this.f3894e;
        int i6 = i3 << 1;
        Object obj = objArr[i6 + 1];
        int i7 = this.f3895f;
        int i8 = 0;
        if (i7 <= 1) {
            c(this.f3893d, objArr, i7);
            this.f3893d = o.f1521h;
            this.f3894e = o.f1522i;
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.f3893d;
            int i10 = 8;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i3 < i9) {
                    int i11 = i3 + 1;
                    int i12 = i9 - i3;
                    System.arraycopy(iArr, i11, iArr, i3, i12);
                    Object[] objArr2 = this.f3894e;
                    System.arraycopy(objArr2, i11 << 1, objArr2, i6, i12 << 1);
                }
                Object[] objArr3 = this.f3894e;
                int i13 = i9 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                if (i7 > 8) {
                    i10 = i7 + (i7 >> 1);
                }
                a(i10);
                if (i7 == this.f3895f) {
                    if (i3 > 0) {
                        System.arraycopy(iArr, 0, this.f3893d, 0, i3);
                        System.arraycopy(objArr, 0, this.f3894e, 0, i6);
                    }
                    if (i3 < i9) {
                        int i14 = i3 + 1;
                        int i15 = i9 - i3;
                        System.arraycopy(iArr, i14, this.f3893d, i3, i15);
                        System.arraycopy(objArr, i14 << 1, this.f3894e, i6, i15 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i8 = i9;
        }
        if (i7 == this.f3895f) {
            this.f3895f = i8;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object k(int i3, Object obj) {
        int i6 = (i3 << 1) + 1;
        Object[] objArr = this.f3894e;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final Object l(int i3) {
        return this.f3894e[(i3 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i3;
        int i6;
        int i7 = this.f3895f;
        if (obj == null) {
            i6 = f();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            i6 = d(hashCode, obj);
        }
        if (i6 >= 0) {
            int i8 = (i6 << 1) + 1;
            Object[] objArr = this.f3894e;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~i6;
        int[] iArr = this.f3893d;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            Object[] objArr2 = this.f3894e;
            a(i10);
            if (i7 == this.f3895f) {
                int[] iArr2 = this.f3893d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f3894e, 0, objArr2.length);
                }
                c(iArr, objArr2, i7);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr3 = this.f3893d;
            int i11 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i11, i7 - i9);
            Object[] objArr3 = this.f3894e;
            System.arraycopy(objArr3, i9 << 1, objArr3, i11 << 1, (this.f3895f - i9) << 1);
        }
        int i12 = this.f3895f;
        if (i7 == i12) {
            int[] iArr4 = this.f3893d;
            if (i9 < iArr4.length) {
                iArr4[i9] = i3;
                Object[] objArr4 = this.f3894e;
                int i13 = i9 << 1;
                objArr4[i13] = obj;
                objArr4[i13 + 1] = obj2;
                this.f3895f = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, (Object) null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return j(e6);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return k(e6, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f3895f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3895f * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3895f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object h6 = h(i3);
            if (h6 != this) {
                sb.append(h6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l6 = l(i3);
            if (l6 != this) {
                sb.append(l6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e6 = e(obj);
        if (e6 < 0) {
            return false;
        }
        Object l6 = l(e6);
        if (obj2 != l6 && (obj2 == null || !obj2.equals(l6))) {
            return false;
        }
        j(e6);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e6 = e(obj);
        if (e6 < 0) {
            return false;
        }
        Object l6 = l(e6);
        if (l6 != obj2 && (obj2 == null || !obj2.equals(l6))) {
            return false;
        }
        k(e6, obj3);
        return true;
    }
}
