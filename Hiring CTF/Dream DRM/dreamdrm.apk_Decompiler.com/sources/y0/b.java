package y0;

import android.view.accessibility.AccessibilityEvent;

public abstract class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i3) {
        accessibilityEvent.setContentChangeTypes(i3);
    }
}
