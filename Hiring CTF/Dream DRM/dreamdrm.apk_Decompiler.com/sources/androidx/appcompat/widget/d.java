package androidx.appcompat.widget;

import a2.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import f3.a;
import f3.c;
import java.util.ArrayList;
import r0.b;
import s3.k;
import t1.p;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f537b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f536a = i3;
        this.f537b = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.f536a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f537b;
                actionBarOverlayLayout.f431z = null;
                actionBarOverlayLayout.f420n = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f536a;
        Object obj = this.f537b;
        switch (i3) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f431z = null;
                actionBarOverlayLayout.f420n = false;
                return;
            case 1:
                ((p) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                u1.d dVar = (u1.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f5271h);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ColorStateList colorStateList = ((a) arrayList.get(i6)).f2656b.f2668r;
                    if (colorStateList != null) {
                        b.h(dVar, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f1824h = null;
                return;
            case 5:
                m.o(obj);
                throw null;
            case 6:
                k kVar = (k) obj;
                kVar.q();
                kVar.f4986r.start();
                return;
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        int i3 = this.f536a;
        Object obj = this.f537b;
        switch (i3) {
            case 2:
                u1.d dVar = (u1.d) obj;
                ArrayList arrayList = new ArrayList(dVar.f5271h);
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c cVar = ((a) arrayList.get(i6)).f2656b;
                    ColorStateList colorStateList = cVar.f2668r;
                    if (colorStateList != null) {
                        b.g(dVar, colorStateList.getColorForState(cVar.f2672v, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 5:
                m.o(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
