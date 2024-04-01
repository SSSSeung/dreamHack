package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import v1.b;
import v1.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(20);

    /* renamed from: d  reason: collision with root package name */
    public final c f1479d;

    public ParcelImpl(Parcel parcel) {
        this.f1479d = new b(parcel).h();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).l(this.f1479d);
    }
}
