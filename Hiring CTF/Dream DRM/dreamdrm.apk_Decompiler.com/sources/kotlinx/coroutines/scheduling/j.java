package kotlinx.coroutines.scheduling;

import androidx.fragment.app.n0;
import com.bumptech.glide.e;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.s;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f4034a = e.s("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f4035b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4036c = e.t("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d  reason: collision with root package name */
    public static final long f4037d = TimeUnit.SECONDS.toNanos(e.s("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: e  reason: collision with root package name */
    public static final f f4038e = f.f4029g;

    /* renamed from: f  reason: collision with root package name */
    public static final n0 f4039f = new n0(0);

    /* renamed from: g  reason: collision with root package name */
    public static final n0 f4040g = new n0(1);

    static {
        int i3 = s.f4004a;
        if (i3 < 2) {
            i3 = 2;
        }
        f4035b = e.t("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
    }
}
