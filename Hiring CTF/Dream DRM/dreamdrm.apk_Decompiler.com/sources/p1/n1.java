package p1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4588a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f4589b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f4590c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f4591d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f4592e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4593f;

    public n1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f4593f = staggeredGridLayoutManager;
        this.f4592e = i3;
    }

    public static k1 h(View view) {
        return (k1) view.getLayoutParams();
    }

    public final void a() {
        ArrayList arrayList = this.f4588a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        k1 h6 = h(view);
        this.f4590c = this.f4593f.f1470r.b(view);
        h6.getClass();
    }

    public final void b() {
        this.f4588a.clear();
        this.f4589b = Integer.MIN_VALUE;
        this.f4590c = Integer.MIN_VALUE;
        this.f4591d = 0;
    }

    public final int c() {
        boolean z5 = this.f4593f.w;
        ArrayList arrayList = this.f4588a;
        return z5 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z5 = this.f4593f.w;
        ArrayList arrayList = this.f4588a;
        return z5 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i3, int i6) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4593f;
        int h6 = staggeredGridLayoutManager.f1470r.h();
        int f6 = staggeredGridLayoutManager.f1470r.f();
        int i7 = i6 > i3 ? 1 : -1;
        while (i3 != i6) {
            View view = (View) this.f4588a.get(i3);
            int d6 = staggeredGridLayoutManager.f1470r.d(view);
            int b6 = staggeredGridLayoutManager.f1470r.b(view);
            boolean z5 = false;
            boolean z6 = d6 <= f6;
            if (b6 >= h6) {
                z5 = true;
            }
            if (z6 && z5 && (d6 < h6 || b6 > f6)) {
                return o0.F(view);
            }
            i3 += i7;
        }
        return -1;
    }

    public final int f(int i3) {
        int i6 = this.f4590c;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (this.f4588a.size() == 0) {
            return i3;
        }
        a();
        return this.f4590c;
    }

    public final View g(int i3, int i6) {
        ArrayList arrayList = this.f4588a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4593f;
        View view = null;
        if (i6 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && o0.F(view2) >= i3) || ((!staggeredGridLayoutManager.w && o0.F(view2) <= i3) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                View view3 = (View) arrayList.get(i7);
                if ((staggeredGridLayoutManager.w && o0.F(view3) <= i3) || ((!staggeredGridLayoutManager.w && o0.F(view3) >= i3) || !view3.hasFocusable())) {
                    break;
                }
                i7++;
                view = view3;
            }
        }
        return view;
    }

    public final int i(int i3) {
        int i6 = this.f4589b;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        ArrayList arrayList = this.f4588a;
        if (arrayList.size() == 0) {
            return i3;
        }
        View view = (View) arrayList.get(0);
        k1 h6 = h(view);
        this.f4589b = this.f4593f.f1470r.d(view);
        h6.getClass();
        return this.f4589b;
    }
}
