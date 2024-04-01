package kotlinx.coroutines.scheduling;

import a2.m;
import com.bumptech.glide.e;
import i4.h;
import i4.i;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.d;
import kotlinx.coroutines.internal.s;
import w4.e0;

public final class c extends e0 implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public static final c f4026f = new c();

    /* renamed from: g  reason: collision with root package name */
    public static final d f4027g;

    static {
        k kVar = k.f4041f;
        int i3 = s.f4004a;
        if (64 >= i3) {
            i3 = 64;
        }
        boolean z5 = false;
        int t5 = e.t("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12);
        kVar.getClass();
        if (t5 >= 1) {
            z5 = true;
        }
        if (z5) {
            f4027g = new d(kVar, t5);
            return;
        }
        throw new IllegalArgumentException(m.g("Expected positive parallelism level, but got ", t5).toString());
    }

    public final void C(h hVar, Runnable runnable) {
        f4027g.C(hVar, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        C(i.f3606d, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
