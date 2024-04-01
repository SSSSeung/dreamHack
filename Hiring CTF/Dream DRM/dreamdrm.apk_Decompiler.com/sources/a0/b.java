package a0;

import b1.o;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int[] f11a = o.f1516c;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12b = o.f1517d;

    /* renamed from: c  reason: collision with root package name */
    public int f13c = 0;

    public final int a(int i3, Object obj) {
        o.m(obj, "key");
        int i6 = this.f13c;
        if (i6 == 0) {
            return -1;
        }
        int f6 = o.f(i6, i3, this.f11a);
        if (f6 < 0 || o.c(obj, this.f12b[f6 << 1])) {
            return f6;
        }
        int i7 = f6 + 1;
        while (i7 < i6 && this.f11a[i7] == i3) {
            if (o.c(obj, this.f12b[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        int i8 = f6 - 1;
        while (i8 >= 0 && this.f11a[i8] == i3) {
            if (o.c(obj, this.f12b[i8 << 1])) {
                return i8;
            }
            i8--;
        }
        return ~i7;
    }

    public final int b() {
        int i3 = this.f13c;
        if (i3 == 0) {
            return -1;
        }
        int f6 = o.f(i3, 0, this.f11a);
        if (f6 < 0 || this.f12b[f6 << 1] == null) {
            return f6;
        }
        int i6 = f6 + 1;
        while (i6 < i3 && this.f11a[i6] == 0) {
            if (this.f12b[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        int i7 = f6 - 1;
        while (i7 >= 0 && this.f11a[i7] == 0) {
            if (this.f12b[i7 << 1] == null) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i3 = this.f13c;
                if (i3 != bVar.f13c) {
                    return false;
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    Object[] objArr = this.f12b;
                    int i7 = i6 << 1;
                    Object obj2 = objArr[i7];
                    Object obj3 = objArr[i7 + 1];
                    int b6 = obj2 == null ? bVar.b() : bVar.a(obj2.hashCode(), obj2);
                    Object obj4 = b6 >= 0 ? bVar.f12b[(b6 << 1) + 1] : null;
                    if (obj3 == null) {
                        if (obj4 == null) {
                            if (!((obj2 == null ? bVar.b() : bVar.a(obj2.hashCode(), obj2)) >= 0)) {
                            }
                        }
                        return false;
                    } else if (!o.c(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f13c != ((Map) obj).size()) {
                return false;
            } else {
                int i8 = this.f13c;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object[] objArr2 = this.f12b;
                    int i10 = i9 << 1;
                    Object obj5 = objArr2[i10];
                    Object obj6 = objArr2[i10 + 1];
                    Object obj7 = ((Map) obj).get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !((Map) obj).containsKey(obj5)) {
                            return false;
                        }
                    } else if (!o.c(obj6, obj7)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f11a;
        Object[] objArr = this.f12b;
        int i3 = this.f13c;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i3) {
            Object obj = objArr[i6];
            i8 += (obj != null ? obj.hashCode() : 0) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public final String toString() {
        int i3 = this.f13c;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i6 = this.f13c;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = i7 << 1;
            Object obj = this.f12b[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f12b[i8 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        o.l(sb2, "buffer.toString()");
        return sb2;
    }
}
