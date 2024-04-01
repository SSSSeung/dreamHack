package y0;

import android.view.accessibility.AccessibilityNodeInfo;
import e.n0;

public abstract class q extends p {
    public q(n0 n0Var) {
        super(n0Var);
    }

    public final AccessibilityNodeInfo findFocus(int i3) {
        o E = this.f5799a.E(i3);
        if (E == null) {
            return null;
        }
        return E.f5796a;
    }
}
