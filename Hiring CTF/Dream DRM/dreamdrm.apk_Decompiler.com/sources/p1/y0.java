package p1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;
import e1.b;

public final class y0 extends b {
    public static final Parcelable.Creator<y0> CREATOR = new n3(5);

    /* renamed from: f  reason: collision with root package name */
    public Parcelable f4717f;

    public y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4717f = parcel.readParcelable(classLoader == null ? o0.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeParcelable(this.f4717f, 0);
    }

    public y0(Parcelable parcelable) {
        super(parcelable);
    }
}
