package g5;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2973a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f2974b = new int[10];

    public final int a() {
        if ((this.f2973a & 128) != 0) {
            return this.f2974b[7];
        }
        return 65535;
    }

    public final void b(int i3, int i6) {
        if (i3 >= 0) {
            int[] iArr = this.f2974b;
            if (i3 < iArr.length) {
                this.f2973a = (1 << i3) | this.f2973a;
                iArr[i3] = i6;
            }
        }
    }
}
