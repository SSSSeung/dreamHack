package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Arrays;

public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a(25);

    /* renamed from: d  reason: collision with root package name */
    public final int f2096d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2097e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2098f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2099g;

    public g(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f2097e = readInt;
        this.f2098f = readInt2;
        this.f2099g = readInt3;
        this.f2096d = readInt4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2097e == gVar.f2097e && this.f2098f == gVar.f2098f && this.f2096d == gVar.f2096d && this.f2099g == gVar.f2099g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2096d), Integer.valueOf(this.f2097e), Integer.valueOf(this.f2098f), Integer.valueOf(this.f2099g)});
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2097e);
        parcel.writeInt(this.f2098f);
        parcel.writeInt(this.f2099g);
        parcel.writeInt(this.f2096d);
    }
}
