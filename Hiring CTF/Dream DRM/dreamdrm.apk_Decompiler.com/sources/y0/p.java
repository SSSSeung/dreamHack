package y0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.n0;
import java.util.List;

public abstract class p extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f5799a;

    public p(n0 n0Var) {
        this.f5799a = n0Var;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        o x5 = this.f5799a.x(i3);
        if (x5 == null) {
            return null;
        }
        return x5.f5796a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i3) {
        this.f5799a.getClass();
        return null;
    }

    public final boolean performAction(int i3, int i6, Bundle bundle) {
        return this.f5799a.F(i3, i6, bundle);
    }
}
