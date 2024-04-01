package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.d;
import h.c0;
import h.i0;
import h.o;
import h.q;
import java.util.ArrayList;

public final class a4 implements c0 {

    /* renamed from: d  reason: collision with root package name */
    public o f508d;

    /* renamed from: e  reason: collision with root package name */
    public q f509e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Toolbar f510f;

    public a4(Toolbar toolbar) {
        this.f510f = toolbar;
    }

    public final void b(o oVar, boolean z5) {
    }

    public final void d(Context context, o oVar) {
        q qVar;
        o oVar2 = this.f508d;
        if (!(oVar2 == null || (qVar = this.f509e) == null)) {
            oVar2.d(qVar);
        }
        this.f508d = oVar;
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(q qVar) {
        Toolbar toolbar = this.f510f;
        toolbar.c();
        ViewParent parent = toolbar.f480k.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f480k);
            }
            toolbar.addView(toolbar.f480k);
        }
        View actionView = qVar.getActionView();
        toolbar.f481l = actionView;
        this.f509e = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f481l);
            }
            b4 b4Var = new b4();
            b4Var.f2275a = (toolbar.f486q & 112) | 8388611;
            b4Var.f528b = 2;
            toolbar.f481l.setLayoutParams(b4Var);
            toolbar.addView(toolbar.f481l);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((b4) childAt.getLayoutParams()).f528b == 2 || childAt == toolbar.f473d)) {
                toolbar.removeViewAt(childCount);
                toolbar.H.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f3209n.p(false);
        View view = toolbar.f481l;
        if (view instanceof d) {
            ((d) view).c();
        }
        toolbar.s();
        return true;
    }

    public final void h() {
        if (this.f509e != null) {
            o oVar = this.f508d;
            boolean z5 = false;
            if (oVar != null) {
                int size = oVar.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (this.f508d.getItem(i3) == this.f509e) {
                        z5 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (!z5) {
                i(this.f509e);
            }
        }
    }

    public final boolean i(q qVar) {
        Toolbar toolbar = this.f510f;
        View view = toolbar.f481l;
        if (view instanceof d) {
            ((d) view).e();
        }
        toolbar.removeView(toolbar.f481l);
        toolbar.removeView(toolbar.f480k);
        toolbar.f481l = null;
        ArrayList arrayList = toolbar.H;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f509e = null;
                toolbar.requestLayout();
                qVar.C = false;
                qVar.f3209n.p(false);
                toolbar.s();
                return true;
            }
        }
    }

    public final boolean k(i0 i0Var) {
        return false;
    }
}
