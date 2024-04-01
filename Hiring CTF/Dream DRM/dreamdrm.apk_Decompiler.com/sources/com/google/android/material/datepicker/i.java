package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p1.b1;
import p1.c0;

public final class i extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(l lVar, int i3, int i6) {
        super(i3);
        this.F = lVar;
        this.E = i6;
    }

    public final void w0(RecyclerView recyclerView, int i3) {
        c0 c0Var = new c0(this, recyclerView.getContext(), 2);
        c0Var.f4718a = i3;
        x0(c0Var);
    }

    public final void z0(b1 b1Var, int[] iArr) {
        int i3 = this.E;
        l lVar = this.F;
        if (i3 == 0) {
            iArr[0] = lVar.f1942c0.getWidth();
            iArr[1] = lVar.f1942c0.getWidth();
            return;
        }
        iArr[0] = lVar.f1942c0.getHeight();
        iArr[1] = lVar.f1942c0.getHeight();
    }
}
