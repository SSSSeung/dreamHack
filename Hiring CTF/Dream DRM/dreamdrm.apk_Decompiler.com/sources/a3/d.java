package a3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import l0.a;

public abstract class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public e f198a;

    /* renamed from: b  reason: collision with root package name */
    public int f199b = 0;

    public d() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        r(coordinatorLayout, view, i3);
        if (this.f198a == null) {
            this.f198a = new e(view);
        }
        e eVar = this.f198a;
        View view2 = eVar.f200a;
        eVar.f201b = view2.getTop();
        eVar.f202c = view2.getLeft();
        this.f198a.a();
        int i6 = this.f199b;
        if (i6 == 0) {
            return true;
        }
        e eVar2 = this.f198a;
        if (eVar2.f203d != i6) {
            eVar2.f203d = i6;
            eVar2.a();
        }
        this.f199b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.q(view, i3);
    }

    public d(int i3) {
        super(0);
    }
}
