package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

public final class m2 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o2 f684a;

    public m2(o2 o2Var) {
        this.f684a = o2Var;
    }

    public final void onScroll(AbsListView absListView, int i3, int i6, int i7) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        boolean z5 = true;
        if (i3 == 1) {
            o2 o2Var = this.f684a;
            if (o2Var.C.getInputMethodMode() != 2) {
                z5 = false;
            }
            if (!z5 && o2Var.C.getContentView() != null) {
                Handler handler = o2Var.f716y;
                h2 h2Var = o2Var.f713u;
                handler.removeCallbacks(h2Var);
                h2Var.run();
            }
        }
    }
}
