package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import h.a;

public final class c implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f529d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f530e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f531f;

    public c(ActionBarContextView actionBarContextView, g.c cVar) {
        this.f531f = actionBarContextView;
        this.f530e = cVar;
    }

    public final void onClick(View view) {
        int i3 = this.f529d;
        Object obj = this.f530e;
        switch (i3) {
            case 0:
                ((g.c) obj).a();
                return;
            default:
                e4 e4Var = (e4) this.f531f;
                Window.Callback callback = e4Var.f572k;
                if (callback != null && e4Var.f573l) {
                    callback.onMenuItemSelected(0, (a) obj);
                    return;
                }
                return;
        }
    }

    public c(e4 e4Var) {
        this.f531f = e4Var;
        this.f530e = new a(e4Var.f562a.getContext(), e4Var.f569h);
    }
}
