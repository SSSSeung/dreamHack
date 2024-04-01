package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.a;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new a(5);

    /* renamed from: d  reason: collision with root package name */
    public final ResultReceiver f244d;

    public MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        this.f244d = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        this.f244d.writeToParcel(parcel, i3);
    }
}
