package l0;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class a {
    public a() {
    }

    public a(int i3) {
    }

    public boolean a(View view) {
        return false;
    }

    public void b(View view) {
    }

    public void c(d dVar) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public void e() {
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void j(View view, View view2, int i3, int[] iArr, int i6) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7, int[] iArr) {
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i3, int i6) {
        return false;
    }

    public void p(View view, View view2, int i3) {
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }
}