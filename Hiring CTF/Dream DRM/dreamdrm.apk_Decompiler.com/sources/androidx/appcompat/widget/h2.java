package androidx.appcompat.widget;

import java.util.WeakHashMap;
import x0.g0;
import x0.u0;

public final class h2 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f624d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o2 f625e;

    public /* synthetic */ h2(o2 o2Var, int i3) {
        this.f624d = i3;
        this.f625e = o2Var;
    }

    public final void run() {
        int i3 = this.f624d;
        o2 o2Var = this.f625e;
        switch (i3) {
            case 1:
                b2 b2Var = o2Var.f698f;
                if (b2Var != null) {
                    b2Var.setListSelectionHidden(true);
                    b2Var.requestLayout();
                    return;
                }
                return;
            default:
                b2 b2Var2 = o2Var.f698f;
                if (b2Var2 != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    if (g0.b(b2Var2) && o2Var.f698f.getCount() > o2Var.f698f.getChildCount() && o2Var.f698f.getChildCount() <= o2Var.f708p) {
                        o2Var.C.setInputMethodMode(2);
                        o2Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
