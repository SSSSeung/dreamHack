package h;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u2;
import androidx.appcompat.widget.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.g0;
import x0.u0;

public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3101d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3102e;

    public /* synthetic */ e(int i3, Object obj) {
        this.f3101d = i3;
        this.f3102e = obj;
    }

    public final void onGlobalLayout() {
        int i3 = this.f3101d;
        boolean z5 = false;
        Object obj = this.f3102e;
        switch (i3) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f3140l;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f3111a.B) {
                        View view = iVar.f3147s;
                        if (view == null || !view.isShown()) {
                            iVar.dismiss();
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).f3111a.f();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h0 h0Var = (h0) obj;
                if (h0Var.a()) {
                    u2 u2Var = h0Var.f3121l;
                    if (!u2Var.B) {
                        View view2 = h0Var.f3126q;
                        if (view2 == null || !view2.isShown()) {
                            h0Var.dismiss();
                            return;
                        } else {
                            u2Var.f();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                w0 w0Var = (w0) obj;
                if (!w0Var.getInternalPopup().a()) {
                    w0Var.f831i.d(o0.b(w0Var), o0.a(w0Var));
                }
                ViewTreeObserver viewTreeObserver = w0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    n0.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                w0 w0Var2 = t0Var.J;
                WeakHashMap weakHashMap = u0.f5622a;
                if (g0.b(w0Var2) && w0Var2.getGlobalVisibleRect(t0Var.H)) {
                    z5 = true;
                }
                if (!z5) {
                    t0Var.dismiss();
                    return;
                }
                t0Var.s();
                t0Var.f();
                return;
        }
    }
}
