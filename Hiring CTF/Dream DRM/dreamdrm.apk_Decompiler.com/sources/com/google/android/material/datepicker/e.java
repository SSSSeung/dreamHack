package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public final class e extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public final Calendar f1925d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1926e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1927f;

    public e() {
        Calendar d6 = w.d((Calendar) null);
        this.f1925d = d6;
        this.f1926e = d6.getMaximum(7);
        this.f1927f = d6.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f1926e;
    }

    public final Object getItem(int i3) {
        int i6 = this.f1926e;
        if (i3 >= i6) {
            return null;
        }
        int i7 = i3 + this.f1927f;
        if (i7 > i6) {
            i7 -= i6;
        }
        return Integer.valueOf(i7);
    }

    public final long getItemId(int i3) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131427405(0x7f0b004d, float:1.8476425E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            int r7 = r5.f1927f
            int r6 = r6 + r7
            int r7 = r5.f1926e
            if (r6 <= r7) goto L_0x0020
            int r6 = r6 - r7
        L_0x0020:
            java.util.Calendar r7 = r5.f1925d
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            r3 = 4
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r8 = 2131689603(0x7f0f0083, float:1.9008226E38)
            java.lang.String r6 = r6.getString(r8)
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getDisplayName(r2, r3, r4)
            r8[r1] = r7
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public e(int i3) {
        Calendar d6 = w.d((Calendar) null);
        this.f1925d = d6;
        this.f1926e = d6.getMaximum(7);
        this.f1927f = i3;
    }
}
