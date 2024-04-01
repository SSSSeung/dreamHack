package p1;

import a2.m;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f4456a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4457b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4458c;

    /* renamed from: d  reason: collision with root package name */
    public int f4459d = 0;

    /* renamed from: e  reason: collision with root package name */
    public View f4460e;

    public d(f0 f0Var) {
        this.f4456a = f0Var;
        this.f4457b = new c();
        this.f4458c = new ArrayList();
    }

    public final void a(View view, int i3, boolean z5) {
        f0 f0Var = this.f4456a;
        int c6 = i3 < 0 ? f0Var.c() : f(i3);
        this.f4457b.e(c6, z5);
        if (z5) {
            i(view);
        }
        f0Var.f4481a.addView(view, c6);
        RecyclerView.L(view);
    }

    public final void b(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z5) {
        f0 f0Var = this.f4456a;
        int c6 = i3 < 0 ? f0Var.c() : f(i3);
        this.f4457b.e(c6, z5);
        if (z5) {
            i(view);
        }
        f0Var.getClass();
        f1 L = RecyclerView.L(view);
        RecyclerView recyclerView = f0Var.f4481a;
        if (L != null) {
            if (L.k() || L.o()) {
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "reAttach " + L);
                }
                L.f4492j &= -257;
            } else {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L);
                throw new IllegalArgumentException(m.f(recyclerView, sb));
            }
        } else if (RecyclerView.A0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(c6);
            throw new IllegalArgumentException(m.f(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, c6, layoutParams);
    }

    public final void c(int i3) {
        int f6 = f(i3);
        this.f4457b.f(f6);
        f0 f0Var = this.f4456a;
        View childAt = f0Var.f4481a.getChildAt(f6);
        RecyclerView recyclerView = f0Var.f4481a;
        if (childAt != null) {
            f1 L = RecyclerView.L(childAt);
            if (L != null) {
                if (!L.k() || L.o()) {
                    if (RecyclerView.B0) {
                        Log.d("RecyclerView", "tmpDetach " + L);
                    }
                    L.b(256);
                } else {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L);
                    throw new IllegalArgumentException(m.f(recyclerView, sb));
                }
            }
        } else if (RecyclerView.A0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f6);
            throw new IllegalArgumentException(m.f(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f6);
    }

    public final View d(int i3) {
        return this.f4456a.f4481a.getChildAt(f(i3));
    }

    public final int e() {
        return this.f4456a.c() - this.f4458c.size();
    }

    public final int f(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int c6 = this.f4456a.c();
        int i6 = i3;
        while (i6 < c6) {
            c cVar = this.f4457b;
            int b6 = i3 - (i6 - cVar.b(i6));
            if (b6 == 0) {
                while (cVar.d(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += b6;
        }
        return -1;
    }

    public final View g(int i3) {
        return this.f4456a.f4481a.getChildAt(i3);
    }

    public final int h() {
        return this.f4456a.c();
    }

    public final void i(View view) {
        this.f4458c.add(view);
        f0 f0Var = this.f4456a;
        f0Var.getClass();
        f1 L = RecyclerView.L(view);
        if (L != null) {
            int i3 = L.f4499q;
            View view2 = L.f4483a;
            if (i3 == -1) {
                WeakHashMap weakHashMap = u0.f5622a;
                i3 = d0.c(view2);
            }
            L.f4498p = i3;
            RecyclerView recyclerView = f0Var.f4481a;
            if (recyclerView.N()) {
                L.f4499q = 4;
                recyclerView.f1458u0.add(L);
                return;
            }
            WeakHashMap weakHashMap2 = u0.f5622a;
            d0.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f4458c.contains(view);
    }

    public final void k(View view) {
        if (this.f4458c.remove(view)) {
            f0 f0Var = this.f4456a;
            f0Var.getClass();
            f1 L = RecyclerView.L(view);
            if (L != null) {
                int i3 = L.f4498p;
                RecyclerView recyclerView = f0Var.f4481a;
                if (recyclerView.N()) {
                    L.f4499q = i3;
                    recyclerView.f1458u0.add(L);
                } else {
                    WeakHashMap weakHashMap = u0.f5622a;
                    d0.s(L.f4483a, i3);
                }
                L.f4498p = 0;
            }
        }
    }

    public final String toString() {
        return this.f4457b.toString() + ", hidden list:" + this.f4458c.size();
    }
}
