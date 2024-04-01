package s4;

import java.util.Iterator;

public class a implements Iterable {

    /* renamed from: d  reason: collision with root package name */
    public final int f5073d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5074e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5075f;

    public a(int i3, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i7 != Integer.MIN_VALUE) {
            this.f5073d = i3;
            if (i7 > 0) {
                if (i3 < i6) {
                    int i8 = i6 % i7;
                    int i9 = i3 % i7;
                    int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                    i6 -= i10 < 0 ? i10 + i7 : i10;
                }
            } else if (i7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i3 > i6) {
                int i11 = -i7;
                int i12 = i3 % i11;
                int i13 = i6 % i11;
                int i14 = ((i12 < 0 ? i12 + i11 : i12) - (i13 < 0 ? i13 + i11 : i13)) % i11;
                i6 += i14 < 0 ? i14 + i11 : i14;
            }
            this.f5074e = i6;
            this.f5075f = i7;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (s4.a) r3;
        r0 = r3.f5073d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof s4.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            s4.a r0 = (s4.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            s4.a r3 = (s4.a) r3
            int r0 = r3.f5073d
            int r1 = r2.f5073d
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f5074e
            int r1 = r3.f5074e
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f5075f
            int r3 = r3.f5075f
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5073d * 31) + this.f5074e) * 31) + this.f5075f;
    }

    public boolean isEmpty() {
        int i3 = this.f5075f;
        int i6 = this.f5074e;
        int i7 = this.f5073d;
        if (i3 > 0) {
            if (i7 > i6) {
                return true;
            }
        } else if (i7 < i6) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this.f5073d, this.f5074e, this.f5075f);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f5074e;
        int i6 = this.f5073d;
        int i7 = this.f5075f;
        if (i7 > 0) {
            sb.append(i6);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i7);
        } else {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i7);
        }
        return sb.toString();
    }
}
