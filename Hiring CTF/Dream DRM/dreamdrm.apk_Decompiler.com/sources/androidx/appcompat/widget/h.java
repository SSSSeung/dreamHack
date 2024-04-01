package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import e.n0;
import h.a0;
import h.i0;
import h.o;
import h.x;

public final class h extends a0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f618m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ m f619n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, o oVar, l lVar) {
        super(context, oVar, lVar, true);
        this.f619n = mVar;
        this.f3091g = 8388613;
        n0 n0Var = mVar.f677z;
        this.f3093i = n0Var;
        x xVar = this.f3094j;
        if (xVar != null) {
            xVar.c(n0Var);
        }
    }

    public final void c() {
        int i3 = this.f618m;
        m mVar = this.f619n;
        switch (i3) {
            case 0:
                mVar.w = null;
                super.c();
                return;
            default:
                o oVar = mVar.f658f;
                if (oVar != null) {
                    oVar.c(true);
                }
                mVar.f674v = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, i0 i0Var, View view) {
        super(context, i0Var, view, false);
        this.f619n = mVar;
        if (!i0Var.A.f()) {
            View view2 = mVar.f664l;
            this.f3090f = view2 == null ? (View) mVar.f663k : view2;
        }
        n0 n0Var = mVar.f677z;
        this.f3093i = n0Var;
        x xVar = this.f3094j;
        if (xVar != null) {
            xVar.c(n0Var);
        }
    }
}
