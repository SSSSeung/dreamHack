package p1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.Arrays;

public final class l1 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new a(18);

    /* renamed from: d  reason: collision with root package name */
    public int f4566d;

    /* renamed from: e  reason: collision with root package name */
    public int f4567e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4568f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4569g;

    public l1(Parcel parcel) {
        this.f4566d = parcel.readInt();
        this.f4567e = parcel.readInt();
        this.f4569g = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f4568f = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4566d + ", mGapDir=" + this.f4567e + ", mHasUnwantedGapAfter=" + this.f4569g + ", mGapPerSpan=" + Arrays.toString(this.f4568f) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4566d);
        parcel.writeInt(this.f4567e);
        parcel.writeInt(this.f4569g ? 1 : 0);
        int[] iArr = this.f4568f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f4568f);
    }
}
