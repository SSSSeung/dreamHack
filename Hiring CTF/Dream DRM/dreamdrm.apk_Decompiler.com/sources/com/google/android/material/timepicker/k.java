package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class k implements View.OnTouchListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2103d;

    public k(GestureDetector gestureDetector) {
        this.f2103d = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2103d.onTouchEvent(motionEvent);
        }
        return false;
    }
}
