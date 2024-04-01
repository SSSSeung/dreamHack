package com.google.android.material.datepicker;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import p1.o0;

public final class g implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1931d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f1932e;

    public g(l lVar, int i3) {
        this.f1932e = lVar;
        this.f1931d = i3;
    }

    public final void run() {
        RecyclerView recyclerView = this.f1932e.f1942c0;
        if (!recyclerView.f1466z) {
            o0 o0Var = recyclerView.f1447p;
            if (o0Var == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                o0Var.w0(recyclerView, this.f1931d);
            }
        }
    }
}
