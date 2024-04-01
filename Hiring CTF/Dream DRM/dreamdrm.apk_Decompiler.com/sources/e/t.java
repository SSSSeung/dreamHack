package e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import x0.h0;
import x0.h1;
import x0.i1;
import x0.u0;

public final class t extends i1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2449a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2450b;

    public /* synthetic */ t(int i3, Object obj) {
        this.f2449a = i3;
        this.f2450b = obj;
    }

    public final void a() {
        int i3 = this.f2449a;
        Object obj = this.f2450b;
        switch (i3) {
            case 0:
                r rVar = (r) obj;
                rVar.f2422e.f2343y.setAlpha(1.0f);
                e0 e0Var = rVar.f2422e;
                e0Var.B.d((h1) null);
                e0Var.B = null;
                return;
            case 1:
                e0 e0Var2 = (e0) obj;
                e0Var2.f2343y.setAlpha(1.0f);
                e0Var2.B.d((h1) null);
                e0Var2.B = null;
                return;
            default:
                u uVar = (u) obj;
                uVar.f2452b.f2343y.setVisibility(8);
                e0 e0Var3 = uVar.f2452b;
                PopupWindow popupWindow = e0Var3.f2344z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (e0Var3.f2343y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    h0.c((View) e0Var3.f2343y.getParent());
                }
                e0Var3.f2343y.e();
                e0Var3.B.d((h1) null);
                e0Var3.B = null;
                ViewGroup viewGroup = e0Var3.E;
                WeakHashMap weakHashMap2 = u0.f5622a;
                h0.c(viewGroup);
                return;
        }
    }

    public final void c() {
        int i3 = this.f2449a;
        Object obj = this.f2450b;
        switch (i3) {
            case 0:
                ((r) obj).f2422e.f2343y.setVisibility(0);
                return;
            case 1:
                e0 e0Var = (e0) obj;
                e0Var.f2343y.setVisibility(0);
                if (e0Var.f2343y.getParent() instanceof View) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    h0.c((View) e0Var.f2343y.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
