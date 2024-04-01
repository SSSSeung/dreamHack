package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

public final class n2 implements View.OnTouchListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o2 f688d;

    public n2(o2 o2Var) {
        this.f688d = o2Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g0 g0Var;
        int action = motionEvent.getAction();
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        o2 o2Var = this.f688d;
        if (action == 0 && (g0Var = o2Var.C) != null && g0Var.isShowing() && x5 >= 0) {
            g0 g0Var2 = o2Var.C;
            if (x5 < g0Var2.getWidth() && y5 >= 0 && y5 < g0Var2.getHeight()) {
                o2Var.f716y.postDelayed(o2Var.f713u, 250);
                return false;
            }
        }
        if (action != 1) {
            return false;
        }
        o2Var.f716y.removeCallbacks(o2Var.f713u);
        return false;
    }
}
