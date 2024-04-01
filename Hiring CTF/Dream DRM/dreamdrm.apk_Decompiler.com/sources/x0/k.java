package x0;

import android.graphics.Rect;
import android.view.Gravity;

public abstract class k {
    public static void a(int i3, int i6, int i7, Rect rect, int i8, int i9, Rect rect2, int i10) {
        Gravity.apply(i3, i6, i7, rect, i8, i9, rect2, i10);
    }

    public static void b(int i3, int i6, int i7, Rect rect, Rect rect2, int i8) {
        Gravity.apply(i3, i6, i7, rect, rect2, i8);
    }

    public static void c(int i3, Rect rect, Rect rect2, int i6) {
        Gravity.applyDisplay(i3, rect, rect2, i6);
    }
}
