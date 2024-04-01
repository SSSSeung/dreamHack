package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a(14);

    /* renamed from: d  reason: collision with root package name */
    public final String f1162d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1163e;

    public i0(Parcel parcel) {
        this.f1162d = parcel.readString();
        this.f1163e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f1162d);
        parcel.writeInt(this.f1163e);
    }
}
