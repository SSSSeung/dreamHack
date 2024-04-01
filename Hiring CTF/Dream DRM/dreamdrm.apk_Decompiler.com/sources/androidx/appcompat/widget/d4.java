package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import e1.b;

public final class d4 extends b {
    public static final Parcelable.Creator<d4> CREATOR = new n3(1);

    /* renamed from: f  reason: collision with root package name */
    public int f545f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f546g;

    public d4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f545f = parcel.readInt();
        this.f546g = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeInt(this.f545f);
        parcel.writeInt(this.f546g ? 1 : 0);
    }

    public d4(Parcelable parcelable) {
        super(parcelable);
    }
}
