package androidx.appcompat.widget;

import android.widget.AbsListView;

public abstract class y1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z5) {
        absListView.setSelectedChildViewEnabled(z5);
    }
}
