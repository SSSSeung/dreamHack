package y0;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.j;

public abstract class l {
    public static n a(boolean z5, int i3, int i6, int i7, int i8, boolean z6, String str, String str2) {
        j.t();
        return new n(j.g().setHeading(z5).setColumnIndex(i3).setRowIndex(i6).setColumnSpan(i7).setRowSpan(i8).setSelected(z6).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static o b(AccessibilityNodeInfo accessibilityNodeInfo, int i3, int i6) {
        AccessibilityNodeInfo m6 = accessibilityNodeInfo.getChild(i3, i6);
        if (m6 != null) {
            return new o(m6, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static o f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
        AccessibilityNodeInfo l6 = accessibilityNodeInfo.getParent(i3);
        if (l6 != null) {
            return new o(l6, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z5) {
        accessibilityNodeInfo.setTextSelectable(z5);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
