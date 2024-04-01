package p1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import l0.g;
import t0.j;
import t0.k;

public final class s implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal f4660h = new ThreadLocal();

    /* renamed from: i  reason: collision with root package name */
    public static final g f4661i = new g(1);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f4662d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public long f4663e;

    /* renamed from: f  reason: collision with root package name */
    public long f4664f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4665g = new ArrayList();

    public static f1 c(RecyclerView recyclerView, int i3, long j6) {
        boolean z5;
        int h6 = recyclerView.f1433i.h();
        int i6 = 0;
        while (true) {
            if (i6 >= h6) {
                z5 = false;
                break;
            }
            f1 L = RecyclerView.L(recyclerView.f1433i.g(i6));
            if (L.f4485c == i3 && !L.g()) {
                z5 = true;
                break;
            }
            i6++;
        }
        if (z5) {
            return null;
        }
        v0 v0Var = recyclerView.f1428f;
        try {
            recyclerView.R();
            f1 l6 = v0Var.l(i3, j6);
            if (l6 != null) {
                if (!l6.f() || l6.g()) {
                    v0Var.a(l6, false);
                } else {
                    v0Var.i(l6.f4483a);
                }
            }
            return l6;
        } finally {
            recyclerView.S(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i6) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.A0 && !this.f4662d.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f4663e == 0) {
                this.f4663e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        q qVar = recyclerView.f1430g0;
        qVar.f4644a = i3;
        qVar.f4645b = i6;
    }

    public final void b(long j6) {
        r rVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        r rVar2;
        ArrayList arrayList = this.f4662d;
        int size = arrayList.size();
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                q qVar = recyclerView3.f1430g0;
                qVar.b(recyclerView3, false);
                i3 += qVar.f4646c;
            }
        }
        ArrayList arrayList2 = this.f4665g;
        arrayList2.ensureCapacity(i3);
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i8);
            if (recyclerView4.getWindowVisibility() == 0) {
                q qVar2 = recyclerView4.f1430g0;
                int abs = Math.abs(qVar2.f4645b) + Math.abs(qVar2.f4644a);
                for (int i9 = 0; i9 < qVar2.f4646c * 2; i9 += 2) {
                    if (i7 >= arrayList2.size()) {
                        rVar2 = new r();
                        arrayList2.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList2.get(i7);
                    }
                    int[] iArr = (int[]) qVar2.f4647d;
                    int i10 = iArr[i9 + 1];
                    rVar2.f4652a = i10 <= abs;
                    rVar2.f4653b = abs;
                    rVar2.f4654c = i10;
                    rVar2.f4655d = recyclerView4;
                    rVar2.f4656e = iArr[i9];
                    i7++;
                }
            }
        }
        Collections.sort(arrayList2, f4661i);
        for (int i11 = 0; i11 < arrayList2.size() && (recyclerView = rVar.f4655d) != null; i11++) {
            f1 c6 = c(recyclerView, (rVar = (r) arrayList2.get(i11)).f4656e, rVar.f4652a ? Long.MAX_VALUE : j6);
            if (!(c6 == null || c6.f4484b == null || !c6.f() || c6.g() || (recyclerView2 = (RecyclerView) c6.f4484b.get()) == null)) {
                if (recyclerView2.D && recyclerView2.f1433i.h() != 0) {
                    l0 l0Var = recyclerView2.M;
                    if (l0Var != null) {
                        l0Var.e();
                    }
                    o0 o0Var = recyclerView2.f1447p;
                    v0 v0Var = recyclerView2.f1428f;
                    if (o0Var != null) {
                        o0Var.f0(v0Var);
                        recyclerView2.f1447p.g0(v0Var);
                    }
                    v0Var.f4689a.clear();
                    v0Var.g();
                }
                q qVar3 = recyclerView2.f1430g0;
                qVar3.b(recyclerView2, true);
                if (qVar3.f4646c != 0) {
                    try {
                        int i12 = k.f5089a;
                        j.a("RV Nested Prefetch");
                        b1 b1Var = recyclerView2.f1432h0;
                        g0 g0Var = recyclerView2.f1445o;
                        b1Var.f4441d = 1;
                        b1Var.f4442e = g0Var.a();
                        b1Var.f4444g = false;
                        b1Var.f4445h = false;
                        b1Var.f4446i = false;
                        for (int i13 = 0; i13 < qVar3.f4646c * 2; i13 += 2) {
                            c(recyclerView2, ((int[]) qVar3.f4647d)[i13], j6);
                        }
                        long j7 = j6;
                        j.b();
                        rVar.f4652a = false;
                        rVar.f4653b = 0;
                        rVar.f4654c = 0;
                        rVar.f4655d = null;
                        rVar.f4656e = 0;
                    } catch (Throwable th) {
                        int i14 = k.f5089a;
                        j.b();
                        throw th;
                    }
                }
            }
            long j8 = j6;
            rVar.f4652a = false;
            rVar.f4653b = 0;
            rVar.f4654c = 0;
            rVar.f4655d = null;
            rVar.f4656e = 0;
        }
    }

    public final void run() {
        try {
            int i3 = k.f5089a;
            j.a("RV Prefetch");
            ArrayList arrayList = this.f4662d;
            if (arrayList.isEmpty()) {
                this.f4663e = 0;
                j.b();
                return;
            }
            int size = arrayList.size();
            long j6 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i6);
                if (recyclerView.getWindowVisibility() == 0) {
                    j6 = Math.max(recyclerView.getDrawingTime(), j6);
                }
            }
            if (j6 == 0) {
                this.f4663e = 0;
                j.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j6) + this.f4664f);
            this.f4663e = 0;
            j.b();
        } catch (Throwable th) {
            this.f4663e = 0;
            int i7 = k.f5089a;
            j.b();
            throw th;
        }
    }
}
