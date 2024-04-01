package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: d  reason: collision with root package name */
    public final int f323d;

    /* renamed from: e  reason: collision with root package name */
    public final Intent f324e;

    public a(Intent intent, int i3) {
        this.f323d = i3;
        this.f324e = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f323d;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f324e);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f323d);
        Intent intent = this.f324e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    public a(Parcel parcel) {
        this.f323d = parcel.readInt();
        this.f324e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
