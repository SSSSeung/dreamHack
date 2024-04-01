package l0;

import android.util.Log;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n2.g;
import o2.d;
import o2.f;

public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4069d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4070e;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f4070e = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        boolean z5 = false;
        int i3 = this.f4069d;
        Object obj = this.f4070e;
        switch (i3) {
            case 0:
                ((CoordinatorLayout) obj).p(0);
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                f fVar = (f) ((WeakReference) obj).get();
                if (fVar != null) {
                    ArrayList arrayList = fVar.f4333b;
                    if (!arrayList.isEmpty()) {
                        int c6 = fVar.c();
                        int b6 = fVar.b();
                        if (c6 > 0 || c6 == Integer.MIN_VALUE) {
                            if (b6 > 0 || b6 == Integer.MIN_VALUE) {
                                z5 = true;
                            }
                        }
                        if (z5) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((g) ((d) it.next())).n(c6, b6);
                            }
                            ViewTreeObserver viewTreeObserver = fVar.f4332a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(fVar.f4334c);
                            }
                            fVar.f4334c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
        }
    }

    public e(f fVar) {
        this.f4070e = new WeakReference(fVar);
    }
}
