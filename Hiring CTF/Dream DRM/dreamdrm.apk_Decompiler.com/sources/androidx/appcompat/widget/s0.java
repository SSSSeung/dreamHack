package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import h.e;

public final class s0 implements PopupWindow.OnDismissListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f767d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t0 f768e;

    public s0(t0 t0Var, e eVar) {
        this.f768e = t0Var;
        this.f767d = eVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f768e.J.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f767d);
        }
    }
}
