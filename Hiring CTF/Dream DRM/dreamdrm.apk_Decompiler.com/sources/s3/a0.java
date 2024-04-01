package s3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.n3;
import e1.b;

public final class a0 extends b {
    public static final Parcelable.Creator<a0> CREATOR = new n3(11);

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4954f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4955g;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4954f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4955g = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f4954f + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        TextUtils.writeToParcel(this.f4954f, parcel, i3);
        parcel.writeInt(this.f4955g ? 1 : 0);
    }

    public a0(Parcelable parcelable) {
        super(parcelable);
    }
}
