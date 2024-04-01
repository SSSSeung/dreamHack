package k;

import b1.o;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c implements Collection, Set {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f3857h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f3858i = new Object[0];

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f3859j;

    /* renamed from: k  reason: collision with root package name */
    public static int f3860k;

    /* renamed from: l  reason: collision with root package name */
    public static Object[] f3861l;

    /* renamed from: m  reason: collision with root package name */
    public static int f3862m;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3863d = f3857h;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f3864e = f3858i;

    /* renamed from: f  reason: collision with root package name */
    public int f3865f = 0;

    /* renamed from: g  reason: collision with root package name */
    public a f3866g;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f3862m < 10) {
                    objArr[0] = f3861l;
                    objArr[1] = iArr;
                    for (int i6 = i3 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f3861l = objArr;
                    f3862m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f3860k < 10) {
                    objArr[0] = f3859j;
                    objArr[1] = iArr;
                    for (int i7 = i3 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    f3859j = objArr;
                    f3860k++;
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (c.class) {
                Object[] objArr = f3861l;
                if (objArr != null) {
                    this.f3864e = objArr;
                    f3861l = (Object[]) objArr[0];
                    this.f3863d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3862m--;
                    return;
                }
            }
        } else if (i3 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f3859j;
                if (objArr2 != null) {
                    this.f3864e = objArr2;
                    f3859j = (Object[]) objArr2[0];
                    this.f3863d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3860k--;
                    return;
                }
            }
        }
        this.f3863d = new int[i3];
        this.f3864e = new Object[i3];
    }

    public final boolean add(Object obj) {
        int i3;
        int i6;
        if (obj == null) {
            i6 = d();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            i6 = c(hashCode, obj);
        }
        if (i6 >= 0) {
            return false;
        }
        int i7 = ~i6;
        int i8 = this.f3865f;
        int[] iArr = this.f3863d;
        if (i8 >= iArr.length) {
            int i9 = 8;
            if (i8 >= 8) {
                i9 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f3864e;
            a(i9);
            int[] iArr2 = this.f3863d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3864e, 0, objArr.length);
            }
            b(iArr, objArr, this.f3865f);
        }
        int i10 = this.f3865f;
        if (i7 < i10) {
            int[] iArr3 = this.f3863d;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr2 = this.f3864e;
            System.arraycopy(objArr2, i7, objArr2, i11, this.f3865f - i7);
        }
        this.f3863d[i7] = i3;
        this.f3864e[i7] = obj;
        this.f3865f++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3865f;
        int[] iArr = this.f3863d;
        boolean z5 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3864e;
            a(size);
            int i3 = this.f3865f;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f3863d, 0, i3);
                System.arraycopy(objArr, 0, this.f3864e, 0, this.f3865f);
            }
            b(iArr, objArr, this.f3865f);
        }
        for (Object add : collection) {
            z5 |= add(add);
        }
        return z5;
    }

    public final int c(int i3, Object obj) {
        int i6 = this.f3865f;
        if (i6 == 0) {
            return -1;
        }
        int d6 = o.d(i6, i3, this.f3863d);
        if (d6 < 0 || obj.equals(this.f3864e[d6])) {
            return d6;
        }
        int i7 = d6 + 1;
        while (i7 < i6 && this.f3863d[i7] == i3) {
            if (obj.equals(this.f3864e[i7])) {
                return i7;
            }
            i7++;
        }
        int i8 = d6 - 1;
        while (i8 >= 0 && this.f3863d[i8] == i3) {
            if (obj.equals(this.f3864e[i8])) {
                return i8;
            }
            i8--;
        }
        return ~i7;
    }

    public final void clear() {
        int i3 = this.f3865f;
        if (i3 != 0) {
            b(this.f3863d, this.f3864e, i3);
            this.f3863d = f3857h;
            this.f3864e = f3858i;
            this.f3865f = 0;
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i3 = this.f3865f;
        if (i3 == 0) {
            return -1;
        }
        int d6 = o.d(i3, 0, this.f3863d);
        if (d6 < 0 || this.f3864e[d6] == null) {
            return d6;
        }
        int i6 = d6 + 1;
        while (i6 < i3 && this.f3863d[i6] == 0) {
            if (this.f3864e[i6] == null) {
                return i6;
            }
            i6++;
        }
        int i7 = d6 - 1;
        while (i7 >= 0 && this.f3863d[i7] == 0) {
            if (this.f3864e[i7] == null) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public final void e(int i3) {
        Object[] objArr = this.f3864e;
        Object obj = objArr[i3];
        int i6 = this.f3865f;
        if (i6 <= 1) {
            b(this.f3863d, objArr, i6);
            this.f3863d = f3857h;
            this.f3864e = f3858i;
            this.f3865f = 0;
            return;
        }
        int[] iArr = this.f3863d;
        int i7 = 8;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            int i8 = i6 - 1;
            this.f3865f = i8;
            if (i3 < i8) {
                int i9 = i3 + 1;
                System.arraycopy(iArr, i9, iArr, i3, i8 - i3);
                Object[] objArr2 = this.f3864e;
                System.arraycopy(objArr2, i9, objArr2, i3, this.f3865f - i3);
            }
            this.f3864e[this.f3865f] = null;
            return;
        }
        if (i6 > 8) {
            i7 = i6 + (i6 >> 1);
        }
        a(i7);
        this.f3865f--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f3863d, 0, i3);
            System.arraycopy(objArr, 0, this.f3864e, 0, i3);
        }
        int i10 = this.f3865f;
        if (i3 < i10) {
            int i11 = i3 + 1;
            System.arraycopy(iArr, i11, this.f3863d, i3, i10 - i3);
            System.arraycopy(objArr, i11, this.f3864e, i3, this.f3865f - i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3865f != set.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f3865f) {
                try {
                    if (!set.contains(this.f3864e[i3])) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f3863d;
        int i3 = this.f3865f;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        return this.f3865f <= 0;
    }

    public final Iterator iterator() {
        if (this.f3866g == null) {
            this.f3866g = new a(1, this);
        }
        a aVar = this.f3866g;
        if (((g) aVar.f3099b) == null) {
            aVar.f3099b = new g(aVar, 1);
        }
        return ((g) aVar.f3099b).iterator();
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z5 = false;
        for (Object remove : collection) {
            z5 |= remove(remove);
        }
        return z5;
    }

    public final boolean retainAll(Collection collection) {
        boolean z5 = false;
        for (int i3 = this.f3865f - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f3864e[i3])) {
                e(i3);
                z5 = true;
            }
        }
        return z5;
    }

    public final int size() {
        return this.f3865f;
    }

    public final Object[] toArray() {
        int i3 = this.f3865f;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f3864e, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3865f * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f3865f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3864e[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3865f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3865f);
        }
        System.arraycopy(this.f3864e, 0, objArr, 0, this.f3865f);
        int length = objArr.length;
        int i3 = this.f3865f;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
