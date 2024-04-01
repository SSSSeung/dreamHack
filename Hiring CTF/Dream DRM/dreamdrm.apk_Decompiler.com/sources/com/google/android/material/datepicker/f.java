package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class f implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1928d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f1929e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1930f;

    public /* synthetic */ f(l lVar, t tVar, int i3) {
        this.f1928d = i3;
        this.f1930f = lVar;
        this.f1929e = tVar;
    }

    public final void onClick(View view) {
        int i3 = this.f1928d;
        t tVar = this.f1929e;
        l lVar = this.f1930f;
        switch (i3) {
            case 0:
                int K0 = ((LinearLayoutManager) lVar.f1942c0.getLayoutManager()).K0() - 1;
                if (K0 >= 0) {
                    Calendar b6 = w.b(tVar.f1980d.f1917d.f1964d);
                    b6.add(2, K0);
                    lVar.I(new p(b6));
                    return;
                }
                return;
            default:
                int J0 = ((LinearLayoutManager) lVar.f1942c0.getLayoutManager()).J0() + 1;
                if (J0 < lVar.f1942c0.getAdapter().a()) {
                    Calendar b7 = w.b(tVar.f1980d.f1917d.f1964d);
                    b7.add(2, J0);
                    lVar.I(new p(b7));
                    return;
                }
                return;
        }
    }
}
