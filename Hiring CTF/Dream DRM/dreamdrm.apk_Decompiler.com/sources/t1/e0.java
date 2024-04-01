package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h5.d;

public final class e0 extends AnimatorListenerAdapter implements o {

    /* renamed from: a  reason: collision with root package name */
    public final View f5100a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5101b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f5102c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5103d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5104e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5105f = false;

    public e0(View view, int i3) {
        this.f5100a = view;
        this.f5101b = i3;
        this.f5102c = (ViewGroup) view.getParent();
        this.f5103d = true;
        f(true);
    }

    public final void a() {
    }

    public final void b(p pVar) {
        if (!this.f5105f) {
            x.f5173a.w(this.f5100a, this.f5101b);
            ViewGroup viewGroup = this.f5102c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        pVar.v(this);
    }

    public final void c() {
    }

    public final void d() {
        f(false);
    }

    public final void e() {
        f(true);
    }

    public final void f(boolean z5) {
        ViewGroup viewGroup;
        if (this.f5103d && this.f5104e != z5 && (viewGroup = this.f5102c) != null) {
            this.f5104e = z5;
            d.m(viewGroup, z5);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f5105f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f5105f) {
            x.f5173a.w(this.f5100a, this.f5101b);
            ViewGroup viewGroup = this.f5102c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f5105f) {
            x.f5173a.w(this.f5100a, this.f5101b);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f5105f) {
            x.f5173a.w(this.f5100a, 0);
        }
    }

    public final void onAnimationStart(Animator animator) {
    }
}
