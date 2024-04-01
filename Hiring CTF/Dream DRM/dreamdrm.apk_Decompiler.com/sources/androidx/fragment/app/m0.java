package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.ArrayList;

public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a(15);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1198d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1199e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f1200f;

    /* renamed from: g  reason: collision with root package name */
    public int f1201g;

    /* renamed from: h  reason: collision with root package name */
    public String f1202h = null;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1203i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f1204j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f1205k;

    public m0() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeTypedList(this.f1198d);
        parcel.writeStringList(this.f1199e);
        parcel.writeTypedArray(this.f1200f, i3);
        parcel.writeInt(this.f1201g);
        parcel.writeString(this.f1202h);
        parcel.writeStringList(this.f1203i);
        parcel.writeTypedList(this.f1204j);
        parcel.writeTypedList(this.f1205k);
    }

    public m0(Parcel parcel) {
        this.f1198d = parcel.createTypedArrayList(q0.CREATOR);
        this.f1199e = parcel.createStringArrayList();
        this.f1200f = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1201g = parcel.readInt();
        this.f1202h = parcel.readString();
        this.f1203i = parcel.createStringArrayList();
        this.f1204j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1205k = parcel.createTypedArrayList(i0.CREATOR);
    }
}
