package e;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.s1;
import h.b0;
import h.o;
import java.util.WeakHashMap;
import q0.c;
import x0.h0;
import x0.h2;
import x0.u0;
import x0.u1;
import x0.w1;
import x0.x1;
import x0.y1;

public final class s implements x0.s, c2, s1, b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2428d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e0 f2429e;

    public /* synthetic */ s(e0 e0Var, int i3) {
        this.f2428d = i3;
        this.f2429e = e0Var;
    }

    public final void b(o oVar, boolean z5) {
        d0 d0Var;
        int i3 = this.f2428d;
        e0 e0Var = this.f2429e;
        switch (i3) {
            case 3:
                e0Var.s(oVar);
                return;
            default:
                o k6 = oVar.k();
                int i6 = 0;
                boolean z6 = k6 != oVar;
                if (z6) {
                    oVar = k6;
                }
                d0[] d0VarArr = e0Var.P;
                int length = d0VarArr != null ? d0VarArr.length : 0;
                while (true) {
                    if (i6 >= length) {
                        d0Var = null;
                    } else {
                        d0Var = d0VarArr[i6];
                        if (d0Var == null || d0Var.f2308h != oVar) {
                            i6++;
                        }
                    }
                }
                if (d0Var == null) {
                    return;
                }
                if (z6) {
                    e0Var.r(d0Var.f2301a, d0Var, k6);
                    e0Var.t(d0Var, true);
                    return;
                }
                e0Var.t(d0Var, z5);
                return;
        }
    }

    public final boolean i(o oVar) {
        Window.Callback B;
        int i3 = this.f2428d;
        e0 e0Var = this.f2429e;
        switch (i3) {
            case 3:
                Window.Callback B2 = e0Var.B();
                if (B2 != null) {
                    B2.onMenuOpened(108, oVar);
                }
                return true;
            default:
                if (oVar == oVar.k() && e0Var.J && (B = e0Var.B()) != null && !e0Var.U) {
                    B.onMenuOpened(108, oVar);
                }
                return true;
        }
    }

    public final h2 v(View view, h2 h2Var) {
        int e6 = h2Var.e();
        int K = this.f2429e.K(h2Var, (Rect) null);
        if (e6 != K) {
            int c6 = h2Var.c();
            int d6 = h2Var.d();
            int b6 = h2Var.b();
            int i3 = Build.VERSION.SDK_INT;
            y1 x1Var = i3 >= 30 ? new x1(h2Var) : i3 >= 29 ? new w1(h2Var) : new u1(h2Var);
            x1Var.g(c.b(c6, K, d6, b6));
            h2Var = x1Var.b();
        }
        WeakHashMap weakHashMap = u0.f5622a;
        WindowInsets g6 = h2Var.g();
        if (g6 == null) {
            return h2Var;
        }
        WindowInsets b7 = h0.b(view, g6);
        return !b7.equals(g6) ? h2.h(view, b7) : h2Var;
    }
}
