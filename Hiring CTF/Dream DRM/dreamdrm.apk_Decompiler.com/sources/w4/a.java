package w4;

import androidx.compose.ui.platform.e;
import androidx.fragment.app.q;
import b1.o;
import b1.v;
import com.bumptech.glide.c;
import h5.l;
import i4.d;
import i4.h;

public abstract class a extends q0 implements d, o {

    /* renamed from: e  reason: collision with root package name */
    public final h f5472e;

    public a(h hVar, boolean z5) {
        super(z5);
        E((i0) hVar.l(e.f897n));
        this.f5472e = hVar.p(this);
    }

    public final void D(q qVar) {
        c.s(this.f5472e, qVar);
    }

    public String I() {
        return super.I();
    }

    public final void L(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            S(iVar.f5487a, iVar.a());
            return;
        }
        T(obj);
    }

    public void S(Throwable th, boolean z5) {
    }

    public void T(Object obj) {
    }

    public final void U(int i3, a aVar, o4.e eVar) {
        Object obj;
        h hVar;
        Object b02;
        if (i3 != 0) {
            int i6 = i3 - 1;
            f4.h hVar2 = f4.h.f2682a;
            if (i6 == 0) {
                try {
                    l.r(v.y(v.q(aVar, this, eVar)), hVar2, (o4.c) null);
                } catch (Throwable th) {
                    g(c.k(th));
                    throw th;
                }
            } else if (i6 == 1) {
            } else {
                if (i6 == 2) {
                    v.y(v.q(aVar, this, eVar)).g(hVar2);
                } else if (i6 == 3) {
                    try {
                        hVar = this.f5472e;
                        b02 = o.b0(hVar, (Object) null);
                        v.b(2, eVar);
                        obj = eVar.h(aVar, this);
                        o.U(hVar, b02);
                        if (obj == j4.a.f3845d) {
                            return;
                        }
                    } catch (Throwable th2) {
                        obj = c.k(th2);
                    }
                    g(obj);
                } else {
                    throw new q(0);
                }
            }
        } else {
            throw null;
        }
    }

    public boolean b() {
        return super.b();
    }

    public final h d() {
        return this.f5472e;
    }

    public final h f() {
        return this.f5472e;
    }

    public final void g(Object obj) {
        Throwable a6 = f4.e.a(obj);
        if (a6 != null) {
            obj = new i(a6, false);
        }
        Object H = H(obj);
        if (H != l.f3492k) {
            h(H);
        }
    }

    public final String o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
