package y0;

import android.view.accessibility.AccessibilityManager;

public abstract class c {
    public static boolean a(AccessibilityManager accessibilityManager, d dVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new e(dVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, d dVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new e(dVar));
    }
}