package x0;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f5569a;

    public g1(View view) {
        this.f5569a = new WeakReference(view);
    }

    public final void a(float f6) {
        View view = (View) this.f5569a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = (View) this.f5569a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f5569a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(h1 h1Var) {
        View view = (View) this.f5569a.get();
        if (view == null) {
            return;
        }
        if (h1Var != null) {
            view.animate().setListener(new e1(this, h1Var, view, 0));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f6) {
        View view = (View) this.f5569a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
