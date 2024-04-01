package y0;

import android.view.accessibility.AccessibilityNodeInfo;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5795a;

    public n(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f5795a = collectionItemInfo;
    }

    public static n a(int i3, int i6, int i7, int i8, boolean z5) {
        return new n(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i6, i7, i8, false, z5));
    }
}
