package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(6);

    /* renamed from: d  reason: collision with root package name */
    public final Object f245d;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f245d = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = this.f245d;
        Object obj3 = ((MediaSessionCompat$Token) obj).f245d;
        if (obj2 == null) {
            return obj3 == null;
        }
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f245d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable((Parcelable) this.f245d, i3);
    }
}
