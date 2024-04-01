package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p1.s0;

public final class k extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f1936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1937b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1938c;

    public k(l lVar, t tVar, MaterialButton materialButton) {
        this.f1938c = lVar;
        this.f1936a = tVar;
        this.f1937b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0) {
            recyclerView.announceForAccessibility(this.f1937b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i3, int i6) {
        l lVar = this.f1938c;
        int J0 = i3 < 0 ? ((LinearLayoutManager) lVar.f1942c0.getLayoutManager()).J0() : ((LinearLayoutManager) lVar.f1942c0.getLayoutManager()).K0();
        t tVar = this.f1936a;
        Calendar b6 = w.b(tVar.f1980d.f1917d.f1964d);
        b6.add(2, J0);
        lVar.Y = new p(b6);
        Calendar b7 = w.b(tVar.f1980d.f1917d.f1964d);
        b7.add(2, J0);
        b7.set(5, 1);
        Calendar b8 = w.b(b7);
        b8.get(2);
        b8.get(1);
        b8.getMaximum(7);
        b8.getActualMaximum(5);
        b8.getTimeInMillis();
        this.f1937b.setText(w.a("yMMMM", Locale.getDefault()).format(new Date(b8.getTimeInMillis())));
    }
}
