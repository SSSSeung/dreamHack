package k;

import b1.o;

public final class k implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3896g = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int[] f3897d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f3898e;

    /* renamed from: f  reason: collision with root package name */
    public int f3899f;

    public k() {
        int i3;
        int i6 = 4;
        while (true) {
            i3 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i3 = i7;
                break;
            }
            i6++;
        }
        int i8 = i3 / 4;
        this.f3897d = new int[i8];
        this.f3898e = new Object[i8];
    }

    public final void a(int i3, Object obj) {
        int i6 = this.f3899f;
        if (i6 == 0 || i3 > this.f3897d[i6 - 1]) {
            if (i6 >= this.f3897d.length) {
                int i7 = (i6 + 1) * 4;
                int i8 = 4;
                while (true) {
                    if (i8 >= 32) {
                        break;
                    }
                    int i9 = (1 << i8) - 12;
                    if (i7 <= i9) {
                        i7 = i9;
                        break;
                    }
                    i8++;
                }
                int i10 = i7 / 4;
                int[] iArr = new int[i10];
                Object[] objArr = new Object[i10];
                int[] iArr2 = this.f3897d;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3898e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3897d = iArr;
                this.f3898e = objArr;
            }
            this.f3897d[i6] = i3;
            this.f3898e[i6] = obj;
            this.f3899f = i6 + 1;
            return;
        }
        d(i3, obj);
    }

    /* renamed from: b */
    public final k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f3897d = (int[]) this.f3897d.clone();
            kVar.f3898e = (Object[]) this.f3898e.clone();
            return kVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f3898e[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f3897d
            int r1 = r2.f3899f
            int r3 = b1.o.d(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f3898e
            r3 = r0[r3]
            java.lang.Object r0 = f3896g
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k.k.c(int, java.lang.Integer):java.lang.Object");
    }

    public final void d(int i3, Object obj) {
        int d6 = o.d(this.f3899f, i3, this.f3897d);
        if (d6 >= 0) {
            this.f3898e[d6] = obj;
            return;
        }
        int i6 = ~d6;
        int i7 = this.f3899f;
        if (i6 < i7) {
            Object[] objArr = this.f3898e;
            if (objArr[i6] == f3896g) {
                this.f3897d[i6] = i3;
                objArr[i6] = obj;
                return;
            }
        }
        if (i7 >= this.f3897d.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArr = new int[i11];
            Object[] objArr2 = new Object[i11];
            int[] iArr2 = this.f3897d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3898e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3897d = iArr;
            this.f3898e = objArr2;
        }
        int i12 = this.f3899f - i6;
        if (i12 != 0) {
            int[] iArr3 = this.f3897d;
            int i13 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i13, i12);
            Object[] objArr4 = this.f3898e;
            System.arraycopy(objArr4, i6, objArr4, i13, this.f3899f - i6);
        }
        this.f3897d[i6] = i3;
        this.f3898e[i6] = obj;
        this.f3899f++;
    }

    public final String toString() {
        int i3 = this.f3899f;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f3899f; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(this.f3897d[i6]);
            sb.append('=');
            Object obj = this.f3898e[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
