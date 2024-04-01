package x0;

import android.view.View;
import android.view.ViewParent;

public abstract class c1 {
    public static boolean a(ViewParent viewParent, View view, float f6, float f7, boolean z5) {
        return viewParent.onNestedFling(view, f6, f7, z5);
    }

    public static boolean b(ViewParent viewParent, View view, float f6, float f7) {
        return viewParent.onNestedPreFling(view, f6, f7);
    }

    public static void c(ViewParent viewParent, View view, int i3, int i6, int[] iArr) {
        viewParent.onNestedPreScroll(view, i3, i6, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i3, int i6, int i7, int i8) {
        viewParent.onNestedScroll(view, i3, i6, i7, i8);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i3) {
        viewParent.onNestedScrollAccepted(view, view2, i3);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i3) {
        return viewParent.onStartNestedScroll(view, view2, i3);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
