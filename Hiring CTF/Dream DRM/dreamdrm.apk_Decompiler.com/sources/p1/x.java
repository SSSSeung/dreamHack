package p1;

import android.view.View;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4701a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f4702b;

    /* renamed from: c  reason: collision with root package name */
    public int f4703c;

    /* renamed from: d  reason: collision with root package name */
    public int f4704d;

    /* renamed from: e  reason: collision with root package name */
    public int f4705e;

    /* renamed from: f  reason: collision with root package name */
    public int f4706f;

    /* renamed from: g  reason: collision with root package name */
    public int f4707g;

    /* renamed from: h  reason: collision with root package name */
    public int f4708h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4709i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4710j;

    /* renamed from: k  reason: collision with root package name */
    public List f4711k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4712l;

    public final void a(View view) {
        int a6;
        int size = this.f4711k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < size; i6++) {
            View view3 = ((f1) this.f4711k.get(i6)).f4483a;
            p0 p0Var = (p0) view3.getLayoutParams();
            if (view3 != view && !p0Var.c() && (a6 = (p0Var.a() - this.f4704d) * this.f4705e) >= 0 && a6 < i3) {
                view2 = view3;
                if (a6 == 0) {
                    break;
                }
                i3 = a6;
            }
        }
        this.f4704d = view2 == null ? -1 : ((p0) view2.getLayoutParams()).a();
    }

    public final View b(v0 v0Var) {
        List list = this.f4711k;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = ((f1) this.f4711k.get(i3)).f4483a;
                p0 p0Var = (p0) view.getLayoutParams();
                if (!p0Var.c() && this.f4704d == p0Var.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d6 = v0Var.d(this.f4704d);
        this.f4704d += this.f4705e;
        return d6;
    }
}
