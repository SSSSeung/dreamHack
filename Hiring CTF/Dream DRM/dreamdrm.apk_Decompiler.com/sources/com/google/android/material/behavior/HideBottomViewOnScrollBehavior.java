package com.google.android.material.behavior;

import a2.m;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.c;
import com.theori.dreamdrm.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0.a;

public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f1817a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public int f1818b;

    /* renamed from: c  reason: collision with root package name */
    public int f1819c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f1820d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f1821e;

    /* renamed from: f  reason: collision with root package name */
    public int f1822f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1823g = 2;

    /* renamed from: h  reason: collision with root package name */
    public ViewPropertyAnimator f1824h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f1822f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1818b = c.D(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1819c = c.D(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1820d = c.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, z2.a.f5936d);
        this.f1821e = c.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, z2.a.f5935c);
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f1817a;
        boolean z5 = true;
        if (i3 > 0) {
            if (!(this.f1823g == 1)) {
                ViewPropertyAnimator viewPropertyAnimator = this.f1824h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f1823g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    r(view, this.f1822f + 0, (long) this.f1819c, this.f1821e);
                } else {
                    m.o(it.next());
                    throw null;
                }
            }
        } else if (i3 < 0) {
            if (this.f1823g != 2) {
                z5 = false;
            }
            if (!z5) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f1824h;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f1823g = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    r(view, 0, (long) this.f1818b, this.f1820d);
                } else {
                    m.o(it2.next());
                    throw null;
                }
            }
        }
    }

    public boolean o(View view, int i3, int i6) {
        return i3 == 2;
    }

    public final void r(View view, int i3, long j6, TimeInterpolator timeInterpolator) {
        this.f1824h = view.animate().translationY((float) i3).setInterpolator(timeInterpolator).setDuration(j6).setListener(new d(3, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
