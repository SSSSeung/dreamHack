package a2;

import androidx.activity.result.c;
import androidx.fragment.app.n0;
import com.bumptech.glide.e;
import s2.b;
import s2.d;

public final class e0 implements f0, b {

    /* renamed from: h  reason: collision with root package name */
    public static final c f43h = e.u(20, new n0(15));

    /* renamed from: d  reason: collision with root package name */
    public final d f44d = new d();

    /* renamed from: e  reason: collision with root package name */
    public f0 f45e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f47g;

    public final d a() {
        return this.f44d;
    }

    public final int b() {
        return this.f45e.b();
    }

    public final Class c() {
        return this.f45e.c();
    }

    public final synchronized void d() {
        this.f44d.a();
        this.f47g = true;
        if (!this.f46f) {
            this.f45e.d();
            this.f45e = null;
            f43h.a(this);
        }
    }

    public final synchronized void e() {
        this.f44d.a();
        if (this.f46f) {
            this.f46f = false;
            if (this.f47g) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Object get() {
        return this.f45e.get();
    }
}
