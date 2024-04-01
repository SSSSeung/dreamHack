package androidx.compose.ui.platform;

import a2.m;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b1.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import y.f;

public final class g extends ViewGroup {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f898d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f899e = new HashMap();

    public g(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, f> getHolderToLayoutNode() {
        return this.f898d;
    }

    public final HashMap<f, Object> getLayoutNodeToHolder() {
        return this.f899e;
    }

    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public final void onDescendantInvalidated(View view, View view2) {
        o.m(view, "child");
        o.m(view2, "target");
    }

    public final void onLayout(boolean z5, int i3, int i6, int i7, int i8) {
        Set keySet = this.f898d.keySet();
        o.l(keySet, "holderToLayoutNode.keys");
        Iterator it = keySet.iterator();
        if (it.hasNext()) {
            m.o(it.next());
            throw null;
        }
    }

    public final void onMeasure(int i3, int i6) {
        boolean z5 = true;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            if (View.MeasureSpec.getMode(i6) != 1073741824) {
                z5 = false;
            }
            if (z5) {
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i6));
                Set keySet = this.f898d.keySet();
                o.l(keySet, "holderToLayoutNode.keys");
                Iterator it = keySet.iterator();
                if (it.hasNext()) {
                    m.o(it.next());
                    throw null;
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) this.f898d.get(childAt);
            if (childAt.isLayoutRequested() && fVar != null) {
                int i6 = f.f5772a;
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
