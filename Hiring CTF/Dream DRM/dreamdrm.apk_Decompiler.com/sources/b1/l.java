package b1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.view.View;

public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new a(12);

    /* renamed from: d  reason: collision with root package name */
    public int f1513d;

    public l(Parcel parcel) {
        super(parcel);
        this.f1513d = parcel.readInt();
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1513d + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f1513d);
    }

    public l(Parcelable parcelable) {
        super(parcelable);
    }
}
