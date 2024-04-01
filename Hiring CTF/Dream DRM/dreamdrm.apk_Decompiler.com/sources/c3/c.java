package c3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.n3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e1.b;

public final class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new n3(7);

    /* renamed from: f  reason: collision with root package name */
    public final int f1625f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1626g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1627h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1628i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1629j;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1625f = parcel.readInt();
        this.f1626g = parcel.readInt();
        boolean z5 = false;
        this.f1627h = parcel.readInt() == 1;
        this.f1628i = parcel.readInt() == 1;
        this.f1629j = parcel.readInt() == 1 ? true : z5;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeInt(this.f1625f);
        parcel.writeInt(this.f1626g);
        parcel.writeInt(this.f1627h ? 1 : 0);
        parcel.writeInt(this.f1628i ? 1 : 0);
        parcel.writeInt(this.f1629j ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1625f = bottomSheetBehavior.L;
        this.f1626g = bottomSheetBehavior.f1841e;
        this.f1627h = bottomSheetBehavior.f1835b;
        this.f1628i = bottomSheetBehavior.I;
        this.f1629j = bottomSheetBehavior.J;
    }
}
