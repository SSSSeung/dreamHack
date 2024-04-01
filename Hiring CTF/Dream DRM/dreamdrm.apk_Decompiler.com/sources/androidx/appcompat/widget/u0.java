package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.view.View;

public final class u0 extends View.BaseSavedState {
    public static final Parcelable.Creator<u0> CREATOR = new a(11);

    /* renamed from: d  reason: collision with root package name */
    public boolean f803d;

    public u0(Parcel parcel) {
        super(parcel);
        this.f803d = parcel.readByte() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f803d ? (byte) 1 : 0);
    }

    public u0(Parcelable parcelable) {
        super(parcelable);
    }
}
