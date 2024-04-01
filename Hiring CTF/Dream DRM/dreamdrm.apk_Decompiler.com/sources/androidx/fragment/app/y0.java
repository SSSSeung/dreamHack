package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

public final class y0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1323b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1324c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1325d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1326e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1327f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a1 f1328g;

    public y0(a1 a1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1328g = a1Var;
        this.f1322a = obj;
        this.f1323b = arrayList;
        this.f1324c = obj2;
        this.f1325d = arrayList2;
        this.f1326e = obj3;
        this.f1327f = arrayList3;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        a1 a1Var = this.f1328g;
        Object obj = this.f1322a;
        if (obj != null) {
            a1Var.v(obj, this.f1323b, (ArrayList) null);
        }
        Object obj2 = this.f1324c;
        if (obj2 != null) {
            a1Var.v(obj2, this.f1325d, (ArrayList) null);
        }
        Object obj3 = this.f1326e;
        if (obj3 != null) {
            a1Var.v(obj3, this.f1327f, (ArrayList) null);
        }
    }
}
