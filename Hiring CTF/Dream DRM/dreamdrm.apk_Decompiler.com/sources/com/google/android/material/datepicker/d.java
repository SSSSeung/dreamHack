package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Arrays;

public final class d implements b {
    public static final Parcelable.Creator<d> CREATOR = new a(23);

    /* renamed from: d  reason: collision with root package name */
    public final long f1924d;

    public d(long j6) {
        this.f1924d = j6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f1924d == ((d) obj).f1924d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1924d)});
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f1924d);
    }
}
