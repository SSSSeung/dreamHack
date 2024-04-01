package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a(24);

    /* renamed from: d  reason: collision with root package name */
    public final Calendar f1964d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1965e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1966f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1967g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1968h;

    /* renamed from: i  reason: collision with root package name */
    public final long f1969i;

    /* renamed from: j  reason: collision with root package name */
    public String f1970j;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b6 = w.b(calendar);
        this.f1964d = b6;
        this.f1965e = b6.get(2);
        this.f1966f = b6.get(1);
        this.f1967g = b6.getMaximum(7);
        this.f1968h = b6.getActualMaximum(5);
        this.f1969i = b6.getTimeInMillis();
    }

    public static p a(int i3, int i6) {
        Calendar d6 = w.d((Calendar) null);
        d6.set(1, i3);
        d6.set(2, i6);
        return new p(d6);
    }

    public static p b(long j6) {
        Calendar d6 = w.d((Calendar) null);
        d6.setTimeInMillis(j6);
        return new p(d6);
    }

    public final String c() {
        if (this.f1970j == null) {
            this.f1970j = w.a("yMMMM", Locale.getDefault()).format(new Date(this.f1964d.getTimeInMillis()));
        }
        return this.f1970j;
    }

    public final int compareTo(Object obj) {
        return this.f1964d.compareTo(((p) obj).f1964d);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1965e == pVar.f1965e && this.f1966f == pVar.f1966f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1965e), Integer.valueOf(this.f1966f)});
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1966f);
        parcel.writeInt(this.f1965e);
    }
}
