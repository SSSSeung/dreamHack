package androidx.fragment.app;

import a2.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1109b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1110c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g1 f1111d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f1112e;

    public c(ViewGroup viewGroup, View view, boolean z5, g1 g1Var, g gVar) {
        this.f1108a = viewGroup;
        this.f1109b = view;
        this.f1110c = z5;
        this.f1111d = g1Var;
        this.f1112e = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1108a;
        View view = this.f1109b;
        viewGroup.endViewTransition(view);
        if (this.f1110c) {
            m.a(this.f1111d.f1146a, view);
        }
        this.f1112e.b();
    }
}
