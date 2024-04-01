package androidx.fragment.app;

import android.view.View;
import p.g;
import p1.o0;
import p1.p0;
import p1.p1;
import t0.c;

public final class l implements c, p1 {

    /* renamed from: a  reason: collision with root package name */
    public int f1169a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1170b;

    public /* synthetic */ l(int i3, Object obj) {
        this.f1169a = i3;
        this.f1170b = obj;
    }

    public int a(View view) {
        int bottom;
        int i3;
        int i6 = this.f1169a;
        Object obj = this.f1170b;
        switch (i6) {
            case 0:
                ((o0) obj).getClass();
                bottom = view.getRight() + ((p0) view.getLayoutParams()).f4641b.right;
                i3 = ((p0) view.getLayoutParams()).rightMargin;
                break;
            default:
                ((o0) obj).getClass();
                bottom = view.getBottom() + ((p0) view.getLayoutParams()).f4641b.bottom;
                i3 = ((p0) view.getLayoutParams()).bottomMargin;
                break;
        }
        return bottom + i3;
    }

    public int b(View view) {
        int top;
        int i3;
        int i6 = this.f1169a;
        Object obj = this.f1170b;
        switch (i6) {
            case 0:
                ((o0) obj).getClass();
                top = view.getLeft() - ((p0) view.getLayoutParams()).f4641b.left;
                i3 = ((p0) view.getLayoutParams()).leftMargin;
                break;
            default:
                ((o0) obj).getClass();
                top = view.getTop() - ((p0) view.getLayoutParams()).f4641b.top;
                i3 = ((p0) view.getLayoutParams()).topMargin;
                break;
        }
        return top - i3;
    }

    public int c() {
        int i3;
        int B;
        int i6 = this.f1169a;
        Object obj = this.f1170b;
        switch (i6) {
            case 0:
                o0 o0Var = (o0) obj;
                i3 = o0Var.f4608n;
                B = o0Var.D();
                break;
            default:
                o0 o0Var2 = (o0) obj;
                i3 = o0Var2.f4609o;
                B = o0Var2.B();
                break;
        }
        return i3 - B;
    }

    public void d() {
        int i3 = this.f1169a;
        Object obj = this.f1170b;
        switch (i3) {
            case 1:
                r rVar = (r) obj;
                p pVar = rVar.K;
                if ((pVar == null ? null : pVar.f1226a) != null) {
                    View view = pVar == null ? null : pVar.f1226a;
                    rVar.f().f1226a = null;
                    view.clearAnimation();
                }
                rVar.f().f1227b = null;
                return;
            default:
                ((g1) obj).a();
                return;
        }
    }

    public void e() {
        ((u) this.f1170b).f1297t.M();
    }

    public l(Object obj) {
        this.f1169a = g.b().f4357b;
        this.f1170b = obj;
    }
}
