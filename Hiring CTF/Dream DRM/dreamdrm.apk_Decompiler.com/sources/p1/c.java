package p1;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f4452a = 0;

    /* renamed from: b  reason: collision with root package name */
    public c f4453b;

    public final void a(int i3) {
        if (i3 >= 64) {
            c cVar = this.f4453b;
            if (cVar != null) {
                cVar.a(i3 - 64);
                return;
            }
            return;
        }
        this.f4452a &= ~(1 << i3);
    }

    public final int b(int i3) {
        long j6;
        c cVar = this.f4453b;
        if (cVar == null) {
            if (i3 >= 64) {
                j6 = this.f4452a;
            }
            j6 = this.f4452a & ((1 << i3) - 1);
        } else {
            if (i3 >= 64) {
                return Long.bitCount(this.f4452a) + cVar.b(i3 - 64);
            }
            j6 = this.f4452a & ((1 << i3) - 1);
        }
        return Long.bitCount(j6);
    }

    public final void c() {
        if (this.f4453b == null) {
            this.f4453b = new c();
        }
    }

    public final boolean d(int i3) {
        if (i3 < 64) {
            return (this.f4452a & (1 << i3)) != 0;
        }
        c();
        return this.f4453b.d(i3 - 64);
    }

    public final void e(int i3, boolean z5) {
        if (i3 >= 64) {
            c();
            this.f4453b.e(i3 - 64, z5);
            return;
        }
        long j6 = this.f4452a;
        boolean z6 = (Long.MIN_VALUE & j6) != 0;
        long j7 = (1 << i3) - 1;
        this.f4452a = ((j6 & (~j7)) << 1) | (j6 & j7);
        if (z5) {
            h(i3);
        } else {
            a(i3);
        }
        if (z6 || this.f4453b != null) {
            c();
            this.f4453b.e(0, z6);
        }
    }

    public final boolean f(int i3) {
        if (i3 >= 64) {
            c();
            return this.f4453b.f(i3 - 64);
        }
        long j6 = 1 << i3;
        long j7 = this.f4452a;
        boolean z5 = (j7 & j6) != 0;
        long j8 = j7 & (~j6);
        this.f4452a = j8;
        long j9 = j6 - 1;
        this.f4452a = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        c cVar = this.f4453b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f4453b.f(0);
        }
        return z5;
    }

    public final void g() {
        this.f4452a = 0;
        c cVar = this.f4453b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i3) {
        if (i3 >= 64) {
            c();
            this.f4453b.h(i3 - 64);
            return;
        }
        this.f4452a |= 1 << i3;
    }

    public final String toString() {
        if (this.f4453b == null) {
            return Long.toBinaryString(this.f4452a);
        }
        return this.f4453b.toString() + "xx" + Long.toBinaryString(this.f4452a);
    }
}
