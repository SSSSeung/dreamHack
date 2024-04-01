package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.theori.dreamdrm.R;
import x0.c;
import y0.o;

public final class h extends c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1933d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1934e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f1933d = i3;
        this.f1934e = obj;
    }

    public final void d(View view, o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        int i3 = this.f1933d;
        View.AccessibilityDelegate accessibilityDelegate = this.f5549a;
        switch (i3) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                l lVar = (l) this.f1934e;
                accessibilityNodeInfo.setHintText(lVar.D().getResources().getString(lVar.f1945g0.getVisibility() == 0 ? R.string.mtrl_picker_toggle_to_year_selection : R.string.mtrl_picker_toggle_to_day_selection));
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
        }
    }
}
