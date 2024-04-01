package e;

public final class o0 {

    /* renamed from: d  reason: collision with root package name */
    public static o0 f2404d;

    /* renamed from: a  reason: collision with root package name */
    public long f2405a;

    /* renamed from: b  reason: collision with root package name */
    public long f2406b;

    /* renamed from: c  reason: collision with root package name */
    public int f2407c;

    public final void a(long j6, double d6, double d7) {
        float f6 = ((float) (j6 - 946728000000L)) / 8.64E7f;
        float f7 = (0.01720197f * f6) + 6.24006f;
        double d8 = (double) f7;
        double sin = (Math.sin((double) (f7 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f7)) * 3.4906598739326E-4d) + (Math.sin(d8) * 0.03341960161924362d) + d8 + 1.796593063d + 3.141592653589793d;
        double d9 = (-d7) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d8) * 0.0053d) + ((double) (((float) Math.round(((double) (f6 - 9.0E-4f)) - d9)) + 9.0E-4f)) + d9;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d6;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f2407c = 1;
        } else if (sin3 <= -1.0d) {
            this.f2407c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.f2405a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f2406b = round;
            if (round >= j6 || this.f2405a <= j6) {
                this.f2407c = 1;
                return;
            } else {
                this.f2407c = 0;
                return;
            }
        }
        this.f2405a = -1;
        this.f2406b = -1;
    }
}
