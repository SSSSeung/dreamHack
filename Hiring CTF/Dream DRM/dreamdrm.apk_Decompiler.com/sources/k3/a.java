package k3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;
import e1.b;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new n3(9);

    /* renamed from: f  reason: collision with root package name */
    public boolean f3910f;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3910f = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeInt(this.f3910f ? 1 : 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
    }
}
