package androidx.fragment.app;

import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;
import q1.d;
import q1.e;
import q1.f;

public final class d1 implements h, f, n0 {

    /* renamed from: d  reason: collision with root package name */
    public final m0 f1122d;

    /* renamed from: e  reason: collision with root package name */
    public t f1123e = null;

    /* renamed from: f  reason: collision with root package name */
    public e f1124f = null;

    public d1(m0 m0Var) {
        this.f1122d = m0Var;
    }

    public final d b() {
        d();
        return this.f1124f.f4898b;
    }

    public final void c(l lVar) {
        this.f1123e.x(lVar);
    }

    public final void d() {
        if (this.f1123e == null) {
            this.f1123e = new t(this);
            this.f1124f = n0.i(this);
        }
    }

    public final m0 e() {
        d();
        return this.f1122d;
    }

    public final t h() {
        d();
        return this.f1123e;
    }
}
