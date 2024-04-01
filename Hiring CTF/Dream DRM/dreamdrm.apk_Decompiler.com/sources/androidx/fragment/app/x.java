package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import t0.d;

public final class x extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1314b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f1315c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f1316d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f1317e;

    public x(ViewGroup viewGroup, View view, r rVar, d0 d0Var, d dVar) {
        this.f1313a = viewGroup;
        this.f1314b = view;
        this.f1315c = rVar;
        this.f1316d = d0Var;
        this.f1317e = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1313a;
        View view = this.f1314b;
        viewGroup.endViewTransition(view);
        r rVar = this.f1315c;
        p pVar = rVar.K;
        Animator animator2 = pVar == null ? null : pVar.f1227b;
        rVar.f().f1227b = null;
        if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
            this.f1316d.c(rVar, this.f1317e);
        }
    }
}
