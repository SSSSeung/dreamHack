package q3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.n3;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e1.b;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new n3(10);

    /* renamed from: f  reason: collision with root package name */
    public final int f4907f;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4907f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeInt(this.f4907f);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f4907f = sideSheetBehavior.f2001h;
    }
}
