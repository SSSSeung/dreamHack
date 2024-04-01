package s4;

public final class c extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final c f5080g = new c(1, 0);

    public c(int i3, int i6) {
        super(i3, i6, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (s4.c) r3;
        r0 = r3.f5073d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r3.f5074e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof s4.c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            s4.c r0 = (s4.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            s4.c r3 = (s4.c) r3
            int r0 = r3.f5073d
            int r1 = r2.f5073d
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f5074e
            int r0 = r2.f5074e
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f5073d * 31) + this.f5074e;
    }

    public final boolean isEmpty() {
        return this.f5073d > this.f5074e;
    }

    public final String toString() {
        return this.f5073d + ".." + this.f5074e;
    }
}
