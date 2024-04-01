package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(7);

    /* renamed from: d  reason: collision with root package name */
    public final int f246d;

    /* renamed from: e  reason: collision with root package name */
    public final int f247e;

    /* renamed from: f  reason: collision with root package name */
    public final int f248f;

    /* renamed from: g  reason: collision with root package name */
    public final int f249g;

    /* renamed from: h  reason: collision with root package name */
    public final int f250h;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f246d = parcel.readInt();
        this.f248f = parcel.readInt();
        this.f249g = parcel.readInt();
        this.f250h = parcel.readInt();
        this.f247e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f246d);
        parcel.writeInt(this.f248f);
        parcel.writeInt(this.f249g);
        parcel.writeInt(this.f250h);
        parcel.writeInt(this.f247e);
    }
}
