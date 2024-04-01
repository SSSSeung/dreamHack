package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import w0.b;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a(22);

    /* renamed from: d  reason: collision with root package name */
    public final p f1917d;

    /* renamed from: e  reason: collision with root package name */
    public final p f1918e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1919f;

    /* renamed from: g  reason: collision with root package name */
    public final p f1920g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1921h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1922i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1923j;

    public c(p pVar, p pVar2, b bVar, p pVar3, int i3) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f1917d = pVar;
        this.f1918e = pVar2;
        this.f1920g = pVar3;
        this.f1921h = i3;
        this.f1919f = bVar;
        Calendar calendar = pVar.f1964d;
        if (pVar3 != null && calendar.compareTo(pVar3.f1964d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (pVar3 != null && pVar3.f1964d.compareTo(pVar2.f1964d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i3 < 0 || i3 > w.d((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else if (calendar instanceof GregorianCalendar) {
            int i6 = pVar2.f1966f;
            int i7 = pVar.f1966f;
            this.f1923j = (pVar2.f1965e - pVar.f1965e) + ((i6 - i7) * 12) + 1;
            this.f1922i = (i6 - i7) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1917d.equals(cVar.f1917d) && this.f1918e.equals(cVar.f1918e) && b.a(this.f1920g, cVar.f1920g) && this.f1921h == cVar.f1921h && this.f1919f.equals(cVar.f1919f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1917d, this.f1918e, this.f1920g, Integer.valueOf(this.f1921h), this.f1919f});
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f1917d, 0);
        parcel.writeParcelable(this.f1918e, 0);
        parcel.writeParcelable(this.f1920g, 0);
        parcel.writeParcelable(this.f1919f, 0);
        parcel.writeInt(this.f1921h);
    }
}
