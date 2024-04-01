package g5;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0[] f2947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2948b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2949c;

    public c0() {
        this.f2947a = new c0[256];
        this.f2948b = 0;
        this.f2949c = 0;
    }

    public c0(int i3, int i6) {
        this.f2947a = null;
        this.f2948b = i3;
        int i7 = i6 & 7;
        this.f2949c = i7 == 0 ? 8 : i7;
    }
}
