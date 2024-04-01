package p1;

import androidx.recyclerview.widget.RecyclerView;

public final class i1 extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4526a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f4527b;

    public i1(d0 d0Var) {
        this.f4527b = d0Var;
    }

    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0 && this.f4526a) {
            this.f4526a = false;
            this.f4527b.e();
        }
    }

    public final void b(RecyclerView recyclerView, int i3, int i6) {
        if (i3 != 0 || i6 != 0) {
            this.f4526a = true;
        }
    }
}
