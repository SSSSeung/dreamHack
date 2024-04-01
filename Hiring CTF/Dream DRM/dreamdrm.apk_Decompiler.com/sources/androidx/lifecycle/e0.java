package androidx.lifecycle;

import android.os.Handler;
import androidx.activity.d;
import b1.o;

public final class e0 implements r {

    /* renamed from: l  reason: collision with root package name */
    public static final e0 f1351l = new e0();

    /* renamed from: d  reason: collision with root package name */
    public int f1352d;

    /* renamed from: e  reason: collision with root package name */
    public int f1353e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1354f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1355g = true;

    /* renamed from: h  reason: collision with root package name */
    public Handler f1356h;

    /* renamed from: i  reason: collision with root package name */
    public final t f1357i = new t(this);

    /* renamed from: j  reason: collision with root package name */
    public final d f1358j = new d(6, this);

    /* renamed from: k  reason: collision with root package name */
    public final d0 f1359k = new d0(this);

    public final void a() {
        int i3 = this.f1353e + 1;
        this.f1353e = i3;
        if (i3 != 1) {
            return;
        }
        if (this.f1354f) {
            this.f1357i.x(l.ON_RESUME);
            this.f1354f = false;
            return;
        }
        Handler handler = this.f1356h;
        o.k(handler);
        handler.removeCallbacks(this.f1358j);
    }

    public final t h() {
        return this.f1357i;
    }
}
