package p1;

public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public int f4610a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f4611b;

    /* renamed from: c  reason: collision with root package name */
    public int f4612c;

    /* renamed from: d  reason: collision with root package name */
    public int f4613d;

    /* renamed from: e  reason: collision with root package name */
    public int f4614e;

    public final boolean a() {
        int i3 = this.f4610a;
        int i6 = 2;
        if ((i3 & 7) != 0) {
            int i7 = this.f4613d;
            int i8 = this.f4611b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 0) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 112) != 0) {
            int i9 = this.f4613d;
            int i10 = this.f4612c;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 1792) != 0) {
            int i11 = this.f4614e;
            int i12 = this.f4611b;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 8) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 28672) != 0) {
            int i13 = this.f4614e;
            int i14 = this.f4612c;
            if (i13 > i14) {
                i6 = 1;
            } else if (i13 != i14) {
                i6 = 4;
            }
            if ((i3 & (i6 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
