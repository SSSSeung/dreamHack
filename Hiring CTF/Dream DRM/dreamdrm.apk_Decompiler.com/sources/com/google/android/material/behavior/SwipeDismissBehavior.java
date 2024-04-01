package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e2.f;
import f1.d;
import java.util.WeakHashMap;
import l0.a;
import x0.d0;
import x0.u0;
import y0.h;

public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a  reason: collision with root package name */
    public d f1825a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1826b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1827c;

    /* renamed from: d  reason: collision with root package name */
    public int f1828d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final float f1829e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f1830f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f1831g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final b3.a f1832h = new b3.a(this);

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z5 = this.f1826b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z5 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1826b = z5;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1826b = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f1825a == null) {
            this.f1825a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f1832h);
        }
        return !this.f1827c && this.f1825a.r(motionEvent);
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        WeakHashMap weakHashMap = u0.f5622a;
        if (d0.c(view) == 0) {
            d0.s(view, 1);
            u0.i(view, 1048576);
            u0.g(view, 0);
            if (r(view)) {
                u0.j(view, h.f5788j, new f(9, this));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f1825a == null) {
            return false;
        }
        if (this.f1827c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1825a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
