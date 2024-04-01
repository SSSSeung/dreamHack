package f3;

import a2.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.view.View;

public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new a(21);

    /* renamed from: d  reason: collision with root package name */
    public int f2657d;

    public b(Parcel parcel) {
        super(parcel);
        this.f2657d = ((Integer) parcel.readValue(b.class.getClassLoader())).intValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i3 = this.f2657d;
        return m.j(sb, i3 != 1 ? i3 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Integer.valueOf(this.f2657d));
    }

    public b(Parcelable parcelable) {
        super(parcelable);
    }
}
