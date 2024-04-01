package d3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;

public final class b extends e1.b {
    public static final Parcelable.Creator<b> CREATOR = new n3(8);

    /* renamed from: f  reason: collision with root package name */
    public boolean f2154f;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f2154f = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeInt(this.f2154f ? 1 : 0);
    }

    public b(Parcelable parcelable) {
        super(parcelable);
    }
}
