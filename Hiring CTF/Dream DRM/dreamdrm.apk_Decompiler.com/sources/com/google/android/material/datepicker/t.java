package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theori.dreamdrm.R;
import e2.f;
import java.util.Calendar;
import p1.f1;
import p1.g0;
import p1.p0;

public final class t extends g0 {

    /* renamed from: d  reason: collision with root package name */
    public final c f1980d;

    /* renamed from: e  reason: collision with root package name */
    public final f f1981e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1982f;

    public t(ContextThemeWrapper contextThemeWrapper, c cVar, f fVar) {
        Calendar calendar = cVar.f1917d.f1964d;
        p pVar = cVar.f1920g;
        if (calendar.compareTo(pVar.f1964d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (pVar.f1964d.compareTo(cVar.f1918e.f1964d) <= 0) {
            int i3 = q.f1971g;
            int i6 = l.f1939h0;
            this.f1982f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + (n.M(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f1980d = cVar;
            this.f1981e = fVar;
            if (!this.f4508a.a()) {
                this.f4509b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f1980d.f1923j;
    }

    public final long b(int i3) {
        Calendar b6 = w.b(this.f1980d.f1917d.f1964d);
        b6.add(2, i3);
        return new p(b6).f1964d.getTimeInMillis();
    }

    public final void c(f1 f1Var, int i3) {
        s sVar = (s) f1Var;
        c cVar = this.f1980d;
        Calendar b6 = w.b(cVar.f1917d.f1964d);
        b6.add(2, i3);
        p pVar = new p(b6);
        sVar.f1978u.setText(pVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f1979v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !pVar.equals(materialCalendarGridView.getAdapter().f1973d)) {
            new q(pVar, cVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.getAdapter().getClass();
        throw null;
    }

    public final f1 d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!n.M(recyclerView.getContext())) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new p0(-1, this.f1982f));
        return new s(linearLayout, true);
    }
}
