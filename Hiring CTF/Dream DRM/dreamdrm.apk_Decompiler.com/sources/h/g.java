package h;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.c1;
import e.n0;

public final class g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3106d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3107e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3108f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3109g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3110h;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f3106d = i3;
        this.f3110h = obj;
        this.f3107e = obj2;
        this.f3108f = obj3;
        this.f3109g = obj4;
    }

    public final void run() {
        int i3 = this.f3106d;
        Object obj = this.f3109g;
        Object obj2 = this.f3108f;
        Object obj3 = this.f3107e;
        switch (i3) {
            case 0:
                h hVar = (h) obj3;
                if (hVar != null) {
                    n0 n0Var = (n0) this.f3110h;
                    ((i) n0Var.f2403e).D = true;
                    hVar.f3112b.c(false);
                    ((i) n0Var.f2403e).D = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj).q(menuItem, (c0) null, 4);
                    return;
                }
                return;
            default:
                ((c1) obj3).getClass();
                c1.g((View) obj2, (Rect) obj);
                return;
        }
    }
}
