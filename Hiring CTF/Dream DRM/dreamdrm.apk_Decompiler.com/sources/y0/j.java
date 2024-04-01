package y0;

import a2.m;
import android.view.accessibility.AccessibilityNodeInfo;
import x0.f2;

public abstract class j {
    public static Object a(int i3, float f6, float f7, float f8) {
        m.q();
        return f2.e(i3, f6, f7, f8);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
