package y0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class i {
    public static n a(int i3, int i6, int i7, int i8, boolean z5) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i6, i7, i8, z5));
    }

    public static Object b(int i3, float f6, float f7, float f8) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i3, f6, f7, f8);
    }

    public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
