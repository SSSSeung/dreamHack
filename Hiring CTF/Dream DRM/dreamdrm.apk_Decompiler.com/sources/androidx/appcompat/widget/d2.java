package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class d2 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f541d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e2 f542e;

    public /* synthetic */ d2(e2 e2Var, int i3) {
        this.f541d = i3;
        this.f542e = e2Var;
    }

    public final void run() {
        int i3 = this.f541d;
        e2 e2Var = this.f542e;
        switch (i3) {
            case 0:
                ViewParent parent = e2Var.f555g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                e2Var.a();
                View view = e2Var.f555g;
                if (view.isEnabled() && !view.isLongClickable() && e2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    e2Var.f558j = true;
                    return;
                }
                return;
        }
    }
}
