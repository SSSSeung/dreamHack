package h;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import s3.n;
import x0.g0;
import x0.u0;
import y0.c;
import y0.d;

public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3103d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3104e;

    public /* synthetic */ f(int i3, Object obj) {
        this.f3103d = i3;
        this.f3104e = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f3103d) {
            case 0:
            case 1:
                return;
            default:
                n nVar = (n) this.f3104e;
                int i3 = n.f4989z;
                if (nVar.f5009x != null && (accessibilityManager = nVar.w) != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    if (g0.b(nVar)) {
                        c.a(accessibilityManager, nVar.f5009x);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i3 = this.f3103d;
        Object obj = this.f3104e;
        switch (i3) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.B = view.getViewTreeObserver();
                    }
                    iVar.B.removeGlobalOnLayoutListener(iVar.f3141m);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                h0 h0Var = (h0) obj;
                ViewTreeObserver viewTreeObserver2 = h0Var.f3128s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h0Var.f3128s = view.getViewTreeObserver();
                    }
                    h0Var.f3128s.removeGlobalOnLayoutListener(h0Var.f3122m);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                n nVar = (n) obj;
                int i6 = n.f4989z;
                d dVar = nVar.f5009x;
                if (dVar != null && (accessibilityManager = nVar.w) != null) {
                    c.b(accessibilityManager, dVar);
                    return;
                }
                return;
        }
    }
}
