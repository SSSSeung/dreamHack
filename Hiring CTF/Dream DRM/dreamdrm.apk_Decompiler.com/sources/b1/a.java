package b1;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f1486a;

    /* renamed from: b  reason: collision with root package name */
    public int f1487b;

    /* renamed from: c  reason: collision with root package name */
    public float f1488c;

    /* renamed from: d  reason: collision with root package name */
    public float f1489d;

    /* renamed from: e  reason: collision with root package name */
    public long f1490e = Long.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public long f1491f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f1492g = -1;

    /* renamed from: h  reason: collision with root package name */
    public float f1493h;

    /* renamed from: i  reason: collision with root package name */
    public int f1494i;

    public final float a(long j6) {
        long j7 = this.f1490e;
        if (j6 < j7) {
            return 0.0f;
        }
        long j8 = this.f1492g;
        if (j8 < 0 || j6 < j8) {
            return g.b(((float) (j6 - j7)) / ((float) this.f1486a), 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f1493h;
        return (g.b(((float) (j6 - j8)) / ((float) this.f1494i), 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
