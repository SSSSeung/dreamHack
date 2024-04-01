package x0;

import android.view.View;
import android.view.ViewTreeObserver;

public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d  reason: collision with root package name */
    public final View f5634d;

    /* renamed from: e  reason: collision with root package name */
    public ViewTreeObserver f5635e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f5636f;

    public v(View view, Runnable runnable) {
        this.f5634d = view;
        this.f5635e = view.getViewTreeObserver();
        this.f5636f = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            v vVar = new v(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(vVar);
            view.addOnAttachStateChangeListener(vVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f5635e.isAlive();
        View view = this.f5634d;
        (isAlive ? this.f5635e : view.getViewTreeObserver()).removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f5636f.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f5635e = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f5635e.isAlive();
        View view2 = this.f5634d;
        (isAlive ? this.f5635e : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
