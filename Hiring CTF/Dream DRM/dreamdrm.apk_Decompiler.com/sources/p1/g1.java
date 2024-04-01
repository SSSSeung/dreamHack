package p1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import e.n0;
import java.util.WeakHashMap;
import x0.c;
import y0.o;

public final class g1 extends c {

    /* renamed from: d  reason: collision with root package name */
    public final h1 f4511d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f4512e = new WeakHashMap();

    public g1(h1 h1Var) {
        this.f4511d = h1Var;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        c cVar = (c) this.f4512e.get(view);
        return cVar != null ? cVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
    }

    public final n0 b(View view) {
        c cVar = (c) this.f4512e.get(view);
        return cVar != null ? cVar.b(view) : super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        c cVar = (c) this.f4512e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, o oVar) {
        h1 h1Var = this.f4511d;
        RecyclerView recyclerView = h1Var.f4518d;
        if (!(!recyclerView.w || recyclerView.D || recyclerView.f1431h.g())) {
            RecyclerView recyclerView2 = h1Var.f4518d;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().T(view, oVar);
                c cVar = (c) this.f4512e.get(view);
                if (cVar != null) {
                    cVar.d(view, oVar);
                    return;
                }
            }
        }
        this.f5549a.onInitializeAccessibilityNodeInfo(view, oVar.f5796a);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        c cVar = (c) this.f4512e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        c cVar = (c) this.f4512e.get(viewGroup);
        return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i3, Bundle bundle) {
        h1 h1Var = this.f4511d;
        RecyclerView recyclerView = h1Var.f4518d;
        if (!(!recyclerView.w || recyclerView.D || recyclerView.f1431h.g())) {
            RecyclerView recyclerView2 = h1Var.f4518d;
            if (recyclerView2.getLayoutManager() != null) {
                c cVar = (c) this.f4512e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i3, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i3, bundle)) {
                    return true;
                }
                v0 v0Var = recyclerView2.getLayoutManager().f4596b.f1428f;
                return false;
            }
        }
        return super.g(view, i3, bundle);
    }

    public final void h(View view, int i3) {
        c cVar = (c) this.f4512e.get(view);
        if (cVar != null) {
            cVar.h(view, i3);
        } else {
            super.h(view, i3);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        c cVar = (c) this.f4512e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
