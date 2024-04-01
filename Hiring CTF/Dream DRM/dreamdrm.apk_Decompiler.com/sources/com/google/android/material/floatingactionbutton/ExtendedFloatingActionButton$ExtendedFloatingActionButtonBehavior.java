package com.google.android.material.floatingactionbutton;

import a2.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import l0.a;
import l0.d;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public final /* bridge */ /* synthetic */ boolean a(View view) {
        m.r(view);
        throw null;
    }

    public final void c(d dVar) {
        if (dVar.f4060h == 0) {
            dVar.f4060h = 80;
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m.r(view);
        throw null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        m.r(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.f5824e);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
