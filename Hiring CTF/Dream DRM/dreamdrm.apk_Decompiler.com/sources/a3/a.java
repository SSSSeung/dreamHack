package a3;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import x0.c;
import y0.n;
import y0.o;

public final class a extends c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f186d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f187e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f186d = i3;
        this.f187e = obj;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f186d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f187e).isChecked());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, o oVar) {
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo = oVar.f5796a;
        int i6 = this.f186d;
        Object obj = this.f187e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5549a;
        switch (i6) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i7 = MaterialButtonToggleGroup.f1878n;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i8 = 0;
                    i3 = 0;
                    while (true) {
                        if (i8 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i8) != view) {
                                if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.d(i8)) {
                                    i3++;
                                }
                                i8++;
                            }
                        }
                    }
                    oVar.h(n.a(0, 1, i3, 1, ((MaterialButton) view).isChecked()));
                    return;
                }
                i3 = -1;
                oVar.h(n.a(0, 1, i3, 1, ((MaterialButton) view).isChecked()));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1989h);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).A);
                return;
        }
    }
}
