package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

    /* renamed from: d  reason: collision with root package name */
    public final int f219d;

    /* renamed from: e  reason: collision with root package name */
    public final MediaDescriptionCompat f220e;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f219d = parcel.readInt();
        this.f220e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f219d + ", mDescription=" + this.f220e + '}';
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f219d);
        this.f220e.writeToParcel(parcel, i3);
    }
}
