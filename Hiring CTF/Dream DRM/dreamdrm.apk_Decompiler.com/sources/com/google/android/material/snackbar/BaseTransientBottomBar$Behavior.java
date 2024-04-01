package com.google.android.material.snackbar;

import a2.m;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e2.f;
import g.h;
import r3.b;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i  reason: collision with root package name */
    public final f f2016i = new f((SwipeDismissBehavior) this);

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar = this.f2016i;
        fVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (h.f2724e == null) {
                    h.f2724e = new h(6);
                }
                h hVar = h.f2724e;
                m.o(fVar.f2505e);
                synchronized (hVar.f2725a) {
                    m.o(hVar.f2727c);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (h.f2724e == null) {
                h.f2724e = new h(6);
            }
            h hVar2 = h.f2724e;
            m.o(fVar.f2505e);
            synchronized (hVar2.f2725a) {
                m.o(hVar2.f2727c);
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.f2016i.getClass();
        return view instanceof b;
    }
}
