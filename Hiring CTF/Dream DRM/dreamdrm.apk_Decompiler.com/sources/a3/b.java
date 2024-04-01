package a3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;

public final class b extends e1.b {
    public static final Parcelable.Creator<b> CREATOR = new n3(6);

    /* renamed from: f  reason: collision with root package name */
    public boolean f188f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f189g;

    /* renamed from: h  reason: collision with root package name */
    public int f190h;

    /* renamed from: i  reason: collision with root package name */
    public float f191i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f192j;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z5 = true;
        this.f188f = parcel.readByte() != 0;
        this.f189g = parcel.readByte() != 0;
        this.f190h = parcel.readInt();
        this.f191i = parcel.readFloat();
        this.f192j = parcel.readByte() == 0 ? false : z5;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2483d, i3);
        parcel.writeByte(this.f188f ? (byte) 1 : 0);
        parcel.writeByte(this.f189g ? (byte) 1 : 0);
        parcel.writeInt(this.f190h);
        parcel.writeFloat(this.f191i);
        parcel.writeByte(this.f192j ? (byte) 1 : 0);
    }
}
