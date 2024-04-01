package com.google.android.material.datepicker;

import android.content.Context;
import android.support.v4.media.b;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.theori.dreamdrm.R;
import java.util.Locale;
import p1.f1;
import p1.g0;

public final class y extends g0 {

    /* renamed from: d  reason: collision with root package name */
    public final l f1985d;

    public y(l lVar) {
        this.f1985d = lVar;
    }

    public final int a() {
        return this.f1985d.X.f1922i;
    }

    public final void c(f1 f1Var, int i3) {
        String str;
        l lVar = this.f1985d;
        int i6 = lVar.X.f1917d.f1966f + i3;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i6)});
        TextView textView = ((x) f1Var).f1984u;
        textView.setText(format);
        Context context = textView.getContext();
        if (w.c().get(1) == i6) {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i6)});
        } else {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i6)});
        }
        textView.setContentDescription(str);
        b bVar = lVar.f1940a0;
        if (w.c().get(1) == i6) {
            Object obj = bVar.f239f;
        } else {
            Object obj2 = bVar.f237d;
        }
        throw null;
    }

    public final f1 d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, recyclerView, false));
    }
}
