package p1;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import java.util.List;

public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new a(19);

    /* renamed from: d  reason: collision with root package name */
    public int f4571d;

    /* renamed from: e  reason: collision with root package name */
    public int f4572e;

    /* renamed from: f  reason: collision with root package name */
    public int f4573f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f4574g;

    /* renamed from: h  reason: collision with root package name */
    public int f4575h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f4576i;

    /* renamed from: j  reason: collision with root package name */
    public List f4577j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4578k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4579l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4580m;

    public m1() {
    }

    public m1(Parcel parcel) {
        this.f4571d = parcel.readInt();
        this.f4572e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f4573f = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f4574g = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.f4575h = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f4576i = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z5 = false;
        this.f4578k = parcel.readInt() == 1;
        this.f4579l = parcel.readInt() == 1;
        this.f4580m = parcel.readInt() == 1 ? true : z5;
        this.f4577j = parcel.readArrayList(l1.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4571d);
        parcel.writeInt(this.f4572e);
        parcel.writeInt(this.f4573f);
        if (this.f4573f > 0) {
            parcel.writeIntArray(this.f4574g);
        }
        parcel.writeInt(this.f4575h);
        if (this.f4575h > 0) {
            parcel.writeIntArray(this.f4576i);
        }
        parcel.writeInt(this.f4578k ? 1 : 0);
        parcel.writeInt(this.f4579l ? 1 : 0);
        parcel.writeInt(this.f4580m ? 1 : 0);
        parcel.writeList(this.f4577j);
    }

    public m1(m1 m1Var) {
        this.f4573f = m1Var.f4573f;
        this.f4571d = m1Var.f4571d;
        this.f4572e = m1Var.f4572e;
        this.f4574g = m1Var.f4574g;
        this.f4575h = m1Var.f4575h;
        this.f4576i = m1Var.f4576i;
        this.f4578k = m1Var.f4578k;
        this.f4579l = m1Var.f4579l;
        this.f4580m = m1Var.f4580m;
        this.f4577j = m1Var.f4577j;
    }
}
