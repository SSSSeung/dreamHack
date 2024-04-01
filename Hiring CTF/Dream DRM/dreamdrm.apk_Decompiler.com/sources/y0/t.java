package y0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public abstract class t {
    public static void a(AccessibilityRecord accessibilityRecord, View view, int i3) {
        accessibilityRecord.setSource(view, i3);
    }
}
