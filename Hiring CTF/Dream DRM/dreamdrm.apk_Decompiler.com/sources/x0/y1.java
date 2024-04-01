package x0;

import com.bumptech.glide.e;
import q0.c;

public abstract class y1 {

    /* renamed from: a  reason: collision with root package name */
    public final h2 f5643a;

    /* renamed from: b  reason: collision with root package name */
    public c[] f5644b;

    public y1() {
        this(new h2());
    }

    public final void a() {
        c[] cVarArr = this.f5644b;
        if (cVarArr != null) {
            c cVar = cVarArr[e.o(1)];
            c cVar2 = this.f5644b[e.o(2)];
            h2 h2Var = this.f5643a;
            if (cVar2 == null) {
                cVar2 = h2Var.a(2);
            }
            if (cVar == null) {
                cVar = h2Var.a(1);
            }
            g(c.a(cVar, cVar2));
            c cVar3 = this.f5644b[e.o(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            c cVar4 = this.f5644b[e.o(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            c cVar5 = this.f5644b[e.o(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract h2 b();

    public void c(int i3, c cVar) {
        if (this.f5644b == null) {
            this.f5644b = new c[9];
        }
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i3 & i6) != 0) {
                this.f5644b[e.o(i6)] = cVar;
            }
        }
    }

    public void d(c cVar) {
    }

    public abstract void e(c cVar);

    public void f(c cVar) {
    }

    public abstract void g(c cVar);

    public void h(c cVar) {
    }

    public y1(h2 h2Var) {
        this.f5643a = h2Var;
    }
}
