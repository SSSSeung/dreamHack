package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import e1.b;

public final class o3 extends b {
    public static final Parcelable.Creator<o3> CREATOR = new n3(0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f718f;

    public o3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f718f = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f718f + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeValue(Boolean.valueOf(this.f718f));
    }

    public o3(Parcelable parcelable) {
        super(parcelable);
    }
}
