package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1976d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f1977e;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1977e = tVar;
        this.f1976d = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f1976d;
        q a6 = materialCalendarGridView.getAdapter();
        boolean z5 = true;
        if (i3 >= a6.a() && i3 <= (a6.a() + a6.f1973d.f1968h) + -1) {
            if (materialCalendarGridView.getAdapter().getItem(i3).longValue() < ((d) ((l) this.f1977e.f1981e.f2505e).X.f1919f).f1924d) {
                z5 = false;
            }
            if (z5) {
                throw null;
            }
        }
    }
}
