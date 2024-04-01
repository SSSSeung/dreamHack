package g5;

import c5.a;
import java.io.IOException;
import p4.i;

public final class o extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f2999e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3000f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f0 f3001g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, f0 f0Var) {
        super(str, true);
        this.f2999e = pVar;
        this.f3001g = f0Var;
    }

    public final long a() {
        int i3;
        long a6;
        a0[] a0VarArr;
        p pVar = this.f2999e;
        boolean z5 = this.f3000f;
        f0 f0Var = this.f3001g;
        pVar.getClass();
        b1.o.m(f0Var, "settings");
        i iVar = new i();
        synchronized (pVar.f3003e.B) {
            synchronized (pVar.f3003e) {
                try {
                    f0 f0Var2 = pVar.f3003e.f3036v;
                    if (!z5) {
                        f0 f0Var3 = new f0();
                        b1.o.m(f0Var2, "other");
                        int i6 = 0;
                        while (true) {
                            boolean z6 = true;
                            if (i6 >= 10) {
                                break;
                            }
                            if (((1 << i6) & f0Var2.f2973a) == 0) {
                                z6 = false;
                            }
                            if (z6) {
                                f0Var3.b(i6, f0Var2.f2974b[i6]);
                            }
                            i6++;
                        }
                        for (int i7 = 0; i7 < 10; i7++) {
                            if (((1 << i7) & f0Var.f2973a) != 0) {
                                f0Var3.b(i7, f0Var.f2974b[i7]);
                            }
                        }
                        f0Var = f0Var3;
                    }
                    iVar.f4865d = f0Var;
                    a6 = ((long) f0Var.a()) - ((long) f0Var2.a());
                    if (a6 != 0) {
                        if (!pVar.f3003e.f3020f.isEmpty()) {
                            Object[] array = pVar.f3003e.f3020f.values().toArray(new a0[0]);
                            if (array != null) {
                                a0VarArr = (a0[]) array;
                                u uVar = pVar.f3003e;
                                f0 f0Var4 = (f0) iVar.f4865d;
                                uVar.getClass();
                                b1.o.m(f0Var4, "<set-?>");
                                uVar.f3036v = f0Var4;
                                pVar.f3003e.f3028n.c(new l(pVar.f3003e.f3021g + " onSettings", pVar, iVar), 0);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    a0VarArr = null;
                    u uVar2 = pVar.f3003e;
                    f0 f0Var42 = (f0) iVar.f4865d;
                    uVar2.getClass();
                    b1.o.m(f0Var42, "<set-?>");
                    uVar2.f3036v = f0Var42;
                    pVar.f3003e.f3028n.c(new l(pVar.f3003e.f3021g + " onSettings", pVar, iVar), 0);
                } finally {
                }
            }
            try {
                pVar.f3003e.B.b((f0) iVar.f4865d);
            } catch (IOException e6) {
                pVar.f3003e.e(e6);
            }
        }
        if (a0VarArr == null) {
            return -1;
        }
        for (a0 a0Var : a0VarArr) {
            synchronized (a0Var) {
                a0Var.f2912d += a6;
                if (a6 > 0) {
                    a0Var.notifyAll();
                }
            }
        }
        return -1;
    }
}
