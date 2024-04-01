package p1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import t2.f;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public int f4644a;

    /* renamed from: b  reason: collision with root package name */
    public int f4645b;

    /* renamed from: c  reason: collision with root package name */
    public int f4646c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4647d;

    public q() {
    }

    public final void a(int i3, int i6) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i6 >= 0) {
            int i7 = this.f4646c * 2;
            Object obj = this.f4647d;
            if (((int[]) obj) == null) {
                int[] iArr = new int[4];
                this.f4647d = iArr;
                Arrays.fill(iArr, -1);
            } else if (i7 >= ((int[]) obj).length) {
                int[] iArr2 = (int[]) obj;
                int[] iArr3 = new int[(i7 * 2)];
                this.f4647d = iArr3;
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            }
            Object obj2 = this.f4647d;
            ((int[]) obj2)[i7] = i3;
            ((int[]) obj2)[i7 + 1] = i6;
            this.f4646c++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public final void b(RecyclerView recyclerView, boolean z5) {
        boolean z6 = false;
        this.f4646c = 0;
        int[] iArr = (int[]) this.f4647d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        o0 o0Var = recyclerView.f1447p;
        if (recyclerView.f1445o != null && o0Var != null && o0Var.f4603i) {
            if (!z5) {
                if (!recyclerView.w || recyclerView.D || recyclerView.f1431h.g()) {
                    z6 = true;
                }
                if (!z6) {
                    o0Var.h(this.f4644a, this.f4645b, recyclerView.f1432h0, this);
                }
            } else if (!recyclerView.f1431h.g()) {
                o0Var.i(recyclerView.f1445o.a(), this);
            }
            int i3 = this.f4646c;
            if (i3 > o0Var.f4604j) {
                o0Var.f4604j = i3;
                o0Var.f4605k = z5;
                recyclerView.f1428f.n();
            }
        }
    }

    public q(f fVar) {
        this.f4647d = fVar;
    }
}
