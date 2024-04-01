package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.a;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(4);

    /* renamed from: d  reason: collision with root package name */
    public final MediaDescriptionCompat f242d;

    /* renamed from: e  reason: collision with root package name */
    public final long f243e;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f242d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f243e = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f242d + ", Id=" + this.f243e + " }";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        this.f242d.writeToParcel(parcel, i3);
        parcel.writeLong(this.f243e);
    }
}
