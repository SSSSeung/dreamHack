package r2;

import android.os.SystemClock;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final double f4926a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4927b = 0;

    public static double a(long j6) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j6)) * f4926a;
    }
}
