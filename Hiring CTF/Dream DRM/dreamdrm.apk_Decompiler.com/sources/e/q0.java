package e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import g.b;
import java.util.WeakHashMap;
import x0.h0;
import x0.i1;
import x0.u0;

public final class q0 extends i1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f2420b;

    public /* synthetic */ q0(s0 s0Var, int i3) {
        this.f2419a = i3;
        this.f2420b = s0Var;
    }

    public final void a() {
        View view;
        int i3 = this.f2419a;
        s0 s0Var = this.f2420b;
        switch (i3) {
            case 0:
                if (s0Var.f2444u && (view = s0Var.f2436m) != null) {
                    view.setTranslationY(0.0f);
                    s0Var.f2433j.setTranslationY(0.0f);
                }
                s0Var.f2433j.setVisibility(8);
                s0Var.f2433j.setTransitioning(false);
                s0Var.f2447y = null;
                b bVar = s0Var.f2440q;
                if (bVar != null) {
                    bVar.b(s0Var.f2439p);
                    s0Var.f2439p = null;
                    s0Var.f2440q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = s0Var.f2432i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = u0.f5622a;
                    h0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                s0Var.f2447y = null;
                s0Var.f2433j.requestLayout();
                return;
        }
    }
}
