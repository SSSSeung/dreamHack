package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p1.m0;

public final class j extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f1935a;

    public j(l lVar) {
        this.f1935a = lVar;
        w.d((Calendar) null);
        w.d((Calendar) null);
    }

    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            y yVar = (y) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            int i3 = l.f1939h0;
            this.f1935a.getClass();
            throw null;
        }
    }
}
