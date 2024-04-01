package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import x0.h0;
import x0.u0;

public final class a0 implements View.OnAttachStateChangeListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1085d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r0 f1086e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1087f;

    public a0(b0 b0Var, r0 r0Var) {
        this.f1087f = b0Var;
        this.f1086e = r0Var;
    }

    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f1085d;
        Object obj = this.f1087f;
        switch (i3) {
            case 0:
                r0 r0Var = this.f1086e;
                r rVar = r0Var.f1278c;
                r0Var.k();
                h1.f((ViewGroup) rVar.H.getParent(), ((b0) obj).f1102d.E()).e();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = u0.f5622a;
                h0.c(view2);
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public a0(r0 r0Var, View view) {
        this.f1086e = r0Var;
        this.f1087f = view;
    }
}
