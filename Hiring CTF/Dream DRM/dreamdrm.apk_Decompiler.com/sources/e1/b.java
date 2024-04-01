package e1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;

public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new n3(4);

    /* renamed from: e  reason: collision with root package name */
    public static final a f2482e = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Parcelable f2483d;

    public b() {
        this.f2483d = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2483d = readParcelable == null ? f2482e : readParcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2483d = parcelable == f2482e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
