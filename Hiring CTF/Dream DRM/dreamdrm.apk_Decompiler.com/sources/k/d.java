package k;

import b1.o;

public final class d implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f3867h = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f3868d = false;

    /* renamed from: e  reason: collision with root package name */
    public long[] f3869e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f3870f;

    /* renamed from: g  reason: collision with root package name */
    public int f3871g;

    public d() {
        int i3;
        int i6 = 4;
        while (true) {
            i3 = 80;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (80 <= i7) {
                i3 = i7;
                break;
            }
            i6++;
        }
        int i8 = i3 / 8;
        this.f3869e = new long[i8];
        this.f3870f = new Object[i8];
    }

    public final void a() {
        int i3 = this.f3871g;
        Object[] objArr = this.f3870f;
        for (int i6 = 0; i6 < i3; i6++) {
            objArr[i6] = null;
        }
        this.f3871g = 0;
        this.f3868d = false;
    }

    /* renamed from: b */
    public final d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f3869e = (long[]) this.f3869e.clone();
            dVar.f3870f = (Object[]) this.f3870f.clone();
            return dVar;
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void c() {
        int i3 = this.f3871g;
        long[] jArr = this.f3869e;
        Object[] objArr = this.f3870f;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            Object obj = objArr[i7];
            if (obj != f3867h) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f3868d = false;
        this.f3871g = i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f3870f[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r3, java.lang.Long r5) {
        /*
            r2 = this;
            long[] r0 = r2.f3869e
            int r1 = r2.f3871g
            int r3 = b1.o.e(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f3870f
            r3 = r4[r3]
            java.lang.Object r4 = f3867h
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k.d.d(long, java.lang.Long):java.lang.Object");
    }

    public final void e(long j6, Object obj) {
        int e6 = o.e(this.f3869e, this.f3871g, j6);
        if (e6 >= 0) {
            this.f3870f[e6] = obj;
            return;
        }
        int i3 = ~e6;
        int i6 = this.f3871g;
        if (i3 < i6) {
            Object[] objArr = this.f3870f;
            if (objArr[i3] == f3867h) {
                this.f3869e[i3] = j6;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f3868d && i6 >= this.f3869e.length) {
            c();
            i3 = ~o.e(this.f3869e, this.f3871g, j6);
        }
        int i7 = this.f3871g;
        if (i7 >= this.f3869e.length) {
            int i8 = (i7 + 1) * 8;
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
            int i11 = i8 / 8;
            long[] jArr = new long[i11];
            Object[] objArr2 = new Object[i11];
            long[] jArr2 = this.f3869e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3870f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3869e = jArr;
            this.f3870f = objArr2;
        }
        int i12 = this.f3871g - i3;
        if (i12 != 0) {
            long[] jArr3 = this.f3869e;
            int i13 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i13, i12);
            Object[] objArr4 = this.f3870f;
            System.arraycopy(objArr4, i3, objArr4, i13, this.f3871g - i3);
        }
        this.f3869e[i3] = j6;
        this.f3870f[i3] = obj;
        this.f3871g++;
    }

    public final Object f(int i3) {
        if (this.f3868d) {
            c();
        }
        return this.f3870f[i3];
    }

    public final String toString() {
        if (this.f3868d) {
            c();
        }
        int i3 = this.f3871g;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i6 = 0; i6 < this.f3871g; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            if (this.f3868d) {
                c();
            }
            sb.append(this.f3869e[i6]);
            sb.append('=');
            Object f6 = f(i6);
            if (f6 != this) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
