package p1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import x0.d0;
import x0.u0;

public final class e0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4468d;

    public /* synthetic */ e0(RecyclerView recyclerView) {
        this.f4468d = recyclerView;
    }

    public final void run() {
        boolean z5;
        ArrayList arrayList;
        long j6;
        RecyclerView recyclerView = this.f4468d;
        l0 l0Var = recyclerView.M;
        if (l0Var != null) {
            k kVar = (k) l0Var;
            ArrayList arrayList2 = kVar.f4542h;
            boolean z6 = !arrayList2.isEmpty();
            ArrayList arrayList3 = kVar.f4544j;
            boolean z7 = !arrayList3.isEmpty();
            ArrayList arrayList4 = kVar.f4545k;
            boolean z8 = !arrayList4.isEmpty();
            ArrayList arrayList5 = kVar.f4543i;
            boolean z9 = !arrayList5.isEmpty();
            if (z6 || z7 || z9 || z8) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = arrayList3;
                    j6 = kVar.f4563d;
                    if (!hasNext) {
                        break;
                    }
                    f1 f1Var = (f1) it.next();
                    View view = f1Var.f4483a;
                    ViewPropertyAnimator animate = view.animate();
                    kVar.f4551q.add(f1Var);
                    animate.setDuration(j6).alpha(0.0f).setListener(new f(kVar, f1Var, animate, view)).start();
                    arrayList3 = arrayList;
                }
                arrayList2.clear();
                if (z7) {
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = arrayList;
                    arrayList6.addAll(arrayList7);
                    kVar.f4547m.add(arrayList6);
                    arrayList7.clear();
                    e eVar = new e(kVar, arrayList6, 0);
                    if (z6) {
                        View view2 = ((j) arrayList6.get(0)).f4528a.f4483a;
                        WeakHashMap weakHashMap = u0.f5622a;
                        d0.n(view2, eVar, j6);
                    } else {
                        eVar.run();
                    }
                }
                if (z8) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.addAll(arrayList4);
                    kVar.f4548n.add(arrayList8);
                    arrayList4.clear();
                    e eVar2 = new e(kVar, arrayList8, 1);
                    if (z6) {
                        View view3 = ((i) arrayList8.get(0)).f4520a.f4483a;
                        WeakHashMap weakHashMap2 = u0.f5622a;
                        d0.n(view3, eVar2, j6);
                    } else {
                        eVar2.run();
                    }
                }
                if (z9) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList5);
                    kVar.f4546l.add(arrayList9);
                    arrayList5.clear();
                    e eVar3 = new e(kVar, arrayList9, 2);
                    if (z6 || z7 || z8) {
                        long j7 = 0;
                        if (!z6) {
                            j6 = 0;
                        }
                        long j8 = z7 ? kVar.f4564e : 0;
                        if (z8) {
                            j7 = kVar.f4565f;
                        }
                        long max = Math.max(j8, j7) + j6;
                        z5 = false;
                        View view4 = ((f1) arrayList9.get(0)).f4483a;
                        WeakHashMap weakHashMap3 = u0.f5622a;
                        d0.n(view4, eVar3, max);
                        recyclerView.f1444n0 = z5;
                    }
                    eVar3.run();
                }
            }
        }
        z5 = false;
        recyclerView.f1444n0 = z5;
    }
}
