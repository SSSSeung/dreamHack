package com.google.android.material.datepicker;

import android.support.v4.media.b;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class q extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1971g = w.d((Calendar) null).getMaximum(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f1972h = ((w.d((Calendar) null).getMaximum(7) + w.d((Calendar) null).getMaximum(5)) - 1);

    /* renamed from: d  reason: collision with root package name */
    public final p f1973d;

    /* renamed from: e  reason: collision with root package name */
    public b f1974e;

    /* renamed from: f  reason: collision with root package name */
    public final c f1975f;

    public q(p pVar, c cVar) {
        this.f1973d = pVar;
        this.f1975f = cVar;
        throw null;
    }

    public final int a() {
        int i3 = this.f1975f.f1921h;
        p pVar = this.f1973d;
        Calendar calendar = pVar.f1964d;
        int i6 = calendar.get(7);
        if (i3 <= 0) {
            i3 = calendar.getFirstDayOfWeek();
        }
        int i7 = i6 - i3;
        return i7 < 0 ? i7 + pVar.f1967g : i7;
    }

    /* renamed from: b */
    public final Long getItem(int i3) {
        if (i3 < a()) {
            return null;
        }
        int a6 = a();
        p pVar = this.f1973d;
        if (i3 > (a6 + pVar.f1968h) - 1) {
            return null;
        }
        Calendar b6 = w.b(pVar.f1964d);
        b6.set(5, (i3 - a()) + 1);
        return Long.valueOf(b6.getTimeInMillis());
    }

    public final int getCount() {
        return f1972h;
    }

    public final long getItemId(int i3) {
        return (long) (i3 / this.f1973d.f1967g);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.b r1 = r4.f1974e
            if (r1 != 0) goto L_0x000f
            android.support.v4.media.b r1 = new android.support.v4.media.b
            r1.<init>(r0)
            r4.f1974e = r1
        L_0x000f:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0027
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427404(0x7f0b004c, float:1.8476423E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L_0x005d
            com.google.android.material.datepicker.p r7 = r4.f1973d
            int r2 = r7.f1968h
            if (r6 < r2) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0065
        L_0x005d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L_0x0065:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r5.longValue()
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            return r0
        L_0x0072:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.w.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
