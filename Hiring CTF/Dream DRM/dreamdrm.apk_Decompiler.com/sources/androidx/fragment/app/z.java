package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import x0.v;

public final class z extends AnimationSet implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f1329d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1330e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1331f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1332g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1333h = true;

    public z(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1329d = viewGroup;
        this.f1330e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f1333h = true;
        if (this.f1331f) {
            return !this.f1332g;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f1331f = true;
            v.a(this.f1329d, this);
        }
        return true;
    }

    public final void run() {
        boolean z5 = this.f1331f;
        ViewGroup viewGroup = this.f1329d;
        if (z5 || !this.f1333h) {
            viewGroup.endViewTransition(this.f1330e);
            this.f1332g = true;
            return;
        }
        this.f1333h = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j6, Transformation transformation, float f6) {
        this.f1333h = true;
        if (this.f1331f) {
            return !this.f1332g;
        }
        if (!super.getTransformation(j6, transformation, f6)) {
            this.f1331f = true;
            v.a(this.f1329d, this);
        }
        return true;
    }
}
