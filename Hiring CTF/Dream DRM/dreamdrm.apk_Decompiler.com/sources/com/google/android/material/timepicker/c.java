package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.theori.dreamdrm.R;
import y0.h;
import y0.n;
import y0.o;

public final class c extends x0.c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2091d;

    public c(ClockFaceView clockFaceView) {
        this.f2091d = clockFaceView;
    }

    public final void d(View view, o oVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5549a;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2091d.A.get(intValue - 1));
        }
        oVar.h(n.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        oVar.b(h.f5783e);
    }

    public final boolean g(View view, int i3, Bundle bundle) {
        if (i3 != 16) {
            return super.g(view, i3, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2091d;
        view.getHitRect(clockFaceView.f2071x);
        float centerX = (float) clockFaceView.f2071x.centerX();
        float centerY = (float) clockFaceView.f2071x.centerY();
        clockFaceView.w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
