package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

public abstract class k2 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z5) {
        popupWindow.setIsClippedToScreen(z5);
    }
}
