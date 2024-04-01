package p1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a(17);

    /* renamed from: d  reason: collision with root package name */
    public int f4714d;

    /* renamed from: e  reason: collision with root package name */
    public int f4715e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4716f;

    public y() {
    }

    public y(Parcel parcel) {
        this.f4714d = parcel.readInt();
        this.f4715e = parcel.readInt();
        this.f4716f = parcel.readInt() != 1 ? false : true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4714d);
        parcel.writeInt(this.f4715e);
        parcel.writeInt(this.f4716f ? 1 : 0);
    }

    public y(y yVar) {
        this.f4714d = yVar.f4714d;
        this.f4715e = yVar.f4715e;
        this.f4716f = yVar.f4716f;
    }
}
