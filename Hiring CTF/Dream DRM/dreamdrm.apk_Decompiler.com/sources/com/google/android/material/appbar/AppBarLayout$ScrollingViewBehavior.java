package com.google.android.material.appbar;

import a3.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l0.a;
import x0.u0;

public class AppBarLayout$ScrollingViewBehavior extends d {

    /* renamed from: c  reason: collision with root package name */
    public int f1813c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
        }
    }

    public final void b(View view) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a aVar = ((l0.d) view2.getLayoutParams()).f4053a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int bottom = (view2.getBottom() - view.getTop()) + 0 + 0;
            int i3 = this.f1813c;
            int e6 = bottom - (i3 == 0 ? 0 : com.bumptech.glide.d.e((int) (((float) i3) * 0.0f), 0, i3));
            WeakHashMap weakHashMap = u0.f5622a;
            view.offsetTopAndBottom(e6);
        }
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i6, int i7) {
        int i8 = view.getLayoutParams().height;
        if (i8 != -1 && i8 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i3);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y2.a.f5839t);
        this.f1813c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
