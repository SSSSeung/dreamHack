package l0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.n3;
import e1.b;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new n3(3);

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f4071f;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4071f = new SparseArray(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f4071f.append(iArr[i3], readParcelableArray[i3]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        SparseArray sparseArray = this.f4071f;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = this.f4071f.keyAt(i6);
            parcelableArr[i6] = (Parcelable) this.f4071f.valueAt(i6);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i3);
    }

    public f(Parcelable parcelable) {
        super(parcelable);
    }
}
