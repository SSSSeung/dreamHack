package com.google.android.material.datepicker;

import java.util.Calendar;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final long f1910f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f1911g;

    /* renamed from: a  reason: collision with root package name */
    public final long f1912a = f1910f;

    /* renamed from: b  reason: collision with root package name */
    public final long f1913b = f1911g;

    /* renamed from: c  reason: collision with root package name */
    public Long f1914c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1915d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1916e = new d(Long.MIN_VALUE);

    static {
        p a6 = p.a(1900, 0);
        Calendar d6 = w.d((Calendar) null);
        d6.setTimeInMillis(a6.f1969i);
        f1910f = w.b(d6).getTimeInMillis();
        p a7 = p.a(2100, 11);
        Calendar d7 = w.d((Calendar) null);
        d7.setTimeInMillis(a7.f1969i);
        f1911g = w.b(d7).getTimeInMillis();
    }

    public a(c cVar) {
        this.f1912a = cVar.f1917d.f1969i;
        this.f1913b = cVar.f1918e.f1969i;
        this.f1914c = Long.valueOf(cVar.f1920g.f1969i);
        this.f1915d = cVar.f1921h;
        this.f1916e = cVar.f1919f;
    }
}
