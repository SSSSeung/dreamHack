package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1115a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1117c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1118d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1119e;

    public d(View view, ViewGroup viewGroup, g gVar, i iVar) {
        this.f1119e = iVar;
        this.f1116b = viewGroup;
        this.f1117c = view;
        this.f1118d = gVar;
    }

    public final void onAnimationEnd(Animation animation) {
        int i3 = this.f1115a;
        ViewGroup viewGroup = this.f1116b;
        switch (i3) {
            case 0:
                viewGroup.post(new w(1, this));
                return;
            default:
                viewGroup.post(new w(0, this));
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public d(ViewGroup viewGroup, r rVar, d0 d0Var, t0.d dVar) {
        this.f1116b = viewGroup;
        this.f1117c = rVar;
        this.f1118d = d0Var;
        this.f1119e = dVar;
    }
}
