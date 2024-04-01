package p1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4481a;

    public /* synthetic */ f0(RecyclerView recyclerView) {
        this.f4481a = recyclerView;
    }

    public final void a(a aVar) {
        int i3 = aVar.f4425a;
        RecyclerView recyclerView = this.f4481a;
        if (i3 == 1) {
            recyclerView.f1447p.V(aVar.f4426b, aVar.f4428d);
        } else if (i3 == 2) {
            recyclerView.f1447p.Y(aVar.f4426b, aVar.f4428d);
        } else if (i3 == 4) {
            recyclerView.f1447p.Z(aVar.f4426b, aVar.f4428d);
        } else if (i3 == 8) {
            recyclerView.f1447p.X(aVar.f4426b, aVar.f4428d);
        }
    }

    public final f1 b(int i3) {
        RecyclerView recyclerView = this.f4481a;
        int h6 = recyclerView.f1433i.h();
        int i6 = 0;
        f1 f1Var = null;
        while (true) {
            if (i6 >= h6) {
                break;
            }
            f1 L = RecyclerView.L(recyclerView.f1433i.g(i6));
            if (L != null && !L.i() && L.f4485c == i3) {
                if (!recyclerView.f1433i.j(L.f4483a)) {
                    f1Var = L;
                    break;
                }
                f1Var = L;
            }
            i6++;
        }
        if (f1Var == null) {
            return null;
        }
        if (!recyclerView.f1433i.j(f1Var.f4483a)) {
            return f1Var;
        }
        if (RecyclerView.B0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public final int c() {
        return this.f4481a.getChildCount();
    }

    public final void d(int i3, int i6, Object obj) {
        int i7;
        int i8;
        RecyclerView recyclerView = this.f4481a;
        int h6 = recyclerView.f1433i.h();
        int i9 = i6 + i3;
        for (int i10 = 0; i10 < h6; i10++) {
            View g6 = recyclerView.f1433i.g(i10);
            f1 L = RecyclerView.L(g6);
            if (L != null && !L.o() && (i8 = L.f4485c) >= i3 && i8 < i9) {
                L.b(2);
                L.a(obj);
                ((p0) g6.getLayoutParams()).f4642c = true;
            }
        }
        v0 v0Var = recyclerView.f1428f;
        ArrayList arrayList = v0Var.f4691c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                f1 f1Var = (f1) arrayList.get(size);
                if (f1Var != null && (i7 = f1Var.f4485c) >= i3 && i7 < i9) {
                    f1Var.b(2);
                    v0Var.h(size);
                }
            } else {
                recyclerView.f1440l0 = true;
                return;
            }
        }
    }

    public final void e(int i3, int i6) {
        RecyclerView recyclerView = this.f4481a;
        int h6 = recyclerView.f1433i.h();
        for (int i7 = 0; i7 < h6; i7++) {
            f1 L = RecyclerView.L(recyclerView.f1433i.g(i7));
            if (L != null && !L.o() && L.f4485c >= i3) {
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i7 + " holder " + L + " now at position " + (L.f4485c + i6));
                }
                L.l(i6, false);
                recyclerView.f1432h0.f4443f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1428f.f4691c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            f1 f1Var = (f1) arrayList.get(i8);
            if (f1Var != null && f1Var.f4485c >= i3) {
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i8 + " holder " + f1Var + " now at position " + (f1Var.f4485c + i6));
                }
                f1Var.l(i6, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1438k0 = true;
    }

    public final void f(int i3, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i3;
        int i16 = i6;
        RecyclerView recyclerView = this.f4481a;
        int h6 = recyclerView.f1433i.h();
        if (i15 < i16) {
            i9 = i15;
            i8 = i16;
            i7 = -1;
        } else {
            i8 = i15;
            i9 = i16;
            i7 = 1;
        }
        boolean z5 = false;
        for (int i17 = 0; i17 < h6; i17++) {
            f1 L = RecyclerView.L(recyclerView.f1433i.g(i17));
            if (L != null && (i14 = L.f4485c) >= i9 && i14 <= i8) {
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i17 + " holder " + L);
                }
                if (L.f4485c == i15) {
                    L.l(i16 - i15, false);
                } else {
                    L.l(i7, false);
                }
                recyclerView.f1432h0.f4443f = true;
            }
        }
        v0 v0Var = recyclerView.f1428f;
        v0Var.getClass();
        if (i15 < i16) {
            i11 = i15;
            i10 = i16;
            i12 = -1;
        } else {
            i10 = i15;
            i11 = i16;
            i12 = 1;
        }
        ArrayList arrayList = v0Var.f4691c;
        int size = arrayList.size();
        int i18 = 0;
        while (i18 < size) {
            f1 f1Var = (f1) arrayList.get(i18);
            if (f1Var != null && (i13 = f1Var.f4485c) >= i11 && i13 <= i10) {
                if (i13 == i15) {
                    f1Var.l(i16 - i15, z5);
                } else {
                    f1Var.l(i12, z5);
                }
                if (RecyclerView.B0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i18 + " holder " + f1Var);
                }
            }
            i18++;
            z5 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1438k0 = true;
    }

    public final void g(int i3) {
        RecyclerView recyclerView = this.f4481a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            RecyclerView.L(childAt);
            g0 g0Var = recyclerView.f1445o;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}
