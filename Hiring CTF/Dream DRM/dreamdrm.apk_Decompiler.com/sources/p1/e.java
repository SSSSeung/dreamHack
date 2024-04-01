package p1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4465d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4466e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f4467f;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i3) {
        this.f4465d = i3;
        this.f4467f = kVar;
        this.f4466e = arrayList;
    }

    public final void run() {
        long j6;
        int i3 = this.f4465d;
        k kVar = this.f4467f;
        ArrayList arrayList = this.f4466e;
        switch (i3) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    f1 f1Var = jVar.f4528a;
                    kVar.getClass();
                    View view = f1Var.f4483a;
                    int i6 = jVar.f4531d - jVar.f4529b;
                    int i7 = jVar.f4532e - jVar.f4530c;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    kVar.f4550p.add(f1Var);
                    animate.setDuration(kVar.f4564e).setListener(new g(kVar, f1Var, i6, view, i7, animate)).start();
                }
                arrayList.clear();
                kVar.f4547m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    kVar.getClass();
                    f1 f1Var2 = iVar.f4520a;
                    View view2 = f1Var2 == null ? null : f1Var2.f4483a;
                    f1 f1Var3 = iVar.f4521b;
                    View view3 = f1Var3 != null ? f1Var3.f4483a : null;
                    ArrayList arrayList2 = kVar.f4552r;
                    long j7 = kVar.f4565f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j7);
                        arrayList2.add(iVar.f4520a);
                        duration.translationX((float) (iVar.f4524e - iVar.f4522c));
                        duration.translationY((float) (iVar.f4525f - iVar.f4523d));
                        ViewPropertyAnimator alpha = duration.alpha(0.0f);
                        h hVar = r4;
                        j6 = j7;
                        h hVar2 = new h(kVar, iVar, duration, view2, 0);
                        alpha.setListener(hVar).start();
                    } else {
                        j6 = j7;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList2.add(iVar.f4521b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new h(kVar, iVar, animate2, view3, 1)).start();
                    }
                }
                arrayList.clear();
                kVar.f4548n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    f1 f1Var4 = (f1) it3.next();
                    kVar.getClass();
                    View view4 = f1Var4.f4483a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    kVar.f4549o.add(f1Var4);
                    animate3.alpha(1.0f).setDuration(kVar.f4562c).setListener(new f(kVar, f1Var4, view4, animate3, 1)).start();
                }
                arrayList.clear();
                kVar.f4546l.remove(arrayList);
                return;
        }
    }
}
