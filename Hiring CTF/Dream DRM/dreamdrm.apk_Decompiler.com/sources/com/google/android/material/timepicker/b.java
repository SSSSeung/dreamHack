package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2090d;

    public b(ClockFaceView clockFaceView) {
        this.f2090d = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2090d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.w.f2077g) - clockFaceView.E;
        if (height != clockFaceView.f2094u) {
            clockFaceView.f2094u = height;
            clockFaceView.f();
            int i3 = clockFaceView.f2094u;
            ClockHandView clockHandView = clockFaceView.w;
            clockHandView.f2085o = i3;
            clockHandView.invalidate();
        }
        return true;
    }
}
