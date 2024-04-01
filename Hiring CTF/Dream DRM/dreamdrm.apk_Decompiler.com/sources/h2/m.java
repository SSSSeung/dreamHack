package h2;

public final class m extends n {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3409h;

    public /* synthetic */ m(int i3) {
        this.f3409h = i3;
    }

    public final int a(int i3, int i6, int i7, int i8) {
        switch (this.f3409h) {
            case 2:
                if (b(i3, i6, i7, i8) == 1.0f) {
                    return 2;
                }
                return n.f3410a.a(i3, i6, i7, i8);
            case 3:
                return 2;
            case 4:
                return n.f3416g ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i3, int i6, int i7, int i8) {
        float f6 = 1.0f;
        switch (this.f3409h) {
            case 2:
                return Math.min(1.0f, n.f3410a.b(i3, i6, i7, i8));
            case 3:
                return Math.max(((float) i7) / ((float) i3), ((float) i8) / ((float) i6));
            case 4:
                if (n.f3416g) {
                    return Math.min(((float) i7) / ((float) i3), ((float) i8) / ((float) i6));
                }
                int max = Math.max(i6 / i8, i3 / i7);
                if (max != 0) {
                    f6 = 1.0f / ((float) Integer.highestOneBit(max));
                }
                return f6;
            default:
                return 1.0f;
        }
    }
}
