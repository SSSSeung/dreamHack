package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: d  reason: collision with root package name */
    public final int f231d;

    /* renamed from: e  reason: collision with root package name */
    public final float f232e;

    public RatingCompat(int i3, float f6) {
        this.f231d = i3;
        this.f232e = f6;
    }

    public final int describeContents() {
        return this.f231d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f231d);
        sb.append(" rating=");
        float f6 = this.f232e;
        sb.append(f6 < 0.0f ? "unrated" : String.valueOf(f6));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f231d);
        parcel.writeFloat(this.f232e);
    }
}
