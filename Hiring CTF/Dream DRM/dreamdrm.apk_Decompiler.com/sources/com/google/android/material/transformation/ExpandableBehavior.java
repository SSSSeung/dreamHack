package com.google.android.material.transformation;

import a2.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l0.a;
import x0.g0;
import x0.u0;

@Deprecated
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    public abstract void b(View view);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m.o(view2);
        throw null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        WeakHashMap weakHashMap = u0.f5622a;
        if (!g0.c(view)) {
            ArrayList j6 = coordinatorLayout.j(view);
            int size = j6.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view2 = (View) j6.get(i6);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
