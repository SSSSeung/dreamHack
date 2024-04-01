package y0;

import a1.b;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import s3.k;
import x0.d0;
import x0.u0;

public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f5782a;

    public e(d dVar) {
        this.f5782a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f5782a.equals(((e) obj).f5782a);
    }

    public final int hashCode() {
        return this.f5782a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z5) {
        k kVar = (k) ((b) this.f5782a).f14a;
        AutoCompleteTextView autoCompleteTextView = kVar.f4976h;
        if (autoCompleteTextView != null) {
            int i3 = 1;
            if (!(autoCompleteTextView.getInputType() != 0)) {
                if (z5) {
                    i3 = 2;
                }
                WeakHashMap weakHashMap = u0.f5622a;
                d0.s(kVar.f5014d, i3);
            }
        }
    }
}
