package androidx.appcompat.widget;

import android.util.SparseIntArray;

public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f814a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f815b;

    /* renamed from: c  reason: collision with root package name */
    public Object f816c;

    /* renamed from: d  reason: collision with root package name */
    public Object f817d;

    public v3(int i3) {
        if (i3 == 1) {
            this.f816c = new SparseIntArray();
            this.f817d = new SparseIntArray();
            this.f814a = false;
            this.f815b = false;
        }
    }

    public final int a(int i3, int i6) {
        if (!this.f815b) {
            return c(i3, i6);
        }
        int i7 = ((SparseIntArray) this.f817d).get(i3, -1);
        if (i7 != -1) {
            return i7;
        }
        int c6 = c(i3, i6);
        ((SparseIntArray) this.f817d).put(i3, c6);
        return c6;
    }

    public final int b(int i3, int i6) {
        if (!this.f814a) {
            return i3 % i6;
        }
        int i7 = ((SparseIntArray) this.f816c).get(i3, -1);
        if (i7 != -1) {
            return i7;
        }
        int i8 = i3 % i6;
        ((SparseIntArray) this.f816c).put(i3, i8);
        return i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f815b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r8.f817d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r2
        L_0x0011:
            if (r5 > r3) goto L_0x0022
            int r6 = r5 + r3
            int r6 = r6 >>> r1
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L_0x001f
            int r5 = r6 + 1
            goto L_0x0011
        L_0x001f:
            int r3 = r6 + -1
            goto L_0x0011
        L_0x0022:
            int r5 = r5 + r4
            if (r5 < 0) goto L_0x0030
            int r3 = r0.size()
            if (r5 >= r3) goto L_0x0030
            int r0 = r0.keyAt(r5)
            goto L_0x0031
        L_0x0030:
            r0 = r4
        L_0x0031:
            if (r0 == r4) goto L_0x0048
            java.lang.Object r3 = r8.f817d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r8.b(r0, r10)
            int r0 = r0 + r1
            if (r0 != r10) goto L_0x004b
            int r3 = r3 + 1
            r0 = r2
            goto L_0x004b
        L_0x0048:
            r0 = r2
            r3 = r0
            r4 = r3
        L_0x004b:
            if (r4 >= r9) goto L_0x005d
            int r0 = r0 + 1
            if (r0 != r10) goto L_0x0055
            int r3 = r3 + 1
            r0 = r2
            goto L_0x005a
        L_0x0055:
            if (r0 <= r10) goto L_0x005a
            int r3 = r3 + 1
            r0 = r1
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x004b
        L_0x005d:
            int r0 = r0 + r1
            if (r0 <= r10) goto L_0x0062
            int r3 = r3 + 1
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v3.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.f816c).clear();
    }
}
