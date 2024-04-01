package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.theori.dreamdrm.R;
import java.util.WeakHashMap;
import p1.f1;
import x0.u0;
import x0.z;

public final class s extends f1 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f1978u;

    /* renamed from: v  reason: collision with root package name */
    public final MaterialCalendarGridView f1979v;

    public s(LinearLayout linearLayout, boolean z5) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1978u = textView;
        WeakHashMap weakHashMap = u0.f5622a;
        new z(R.id.tag_accessibility_heading, 3).c(textView, Boolean.TRUE);
        this.f1979v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z5) {
            textView.setVisibility(8);
        }
    }
}
