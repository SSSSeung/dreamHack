package v1;

import a2.m;
import android.os.Parcel;
import android.util.SparseIntArray;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f5382d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f5383e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5384f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5385g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5386h;

    /* renamed from: i  reason: collision with root package name */
    public int f5387i;

    /* renamed from: j  reason: collision with root package name */
    public int f5388j;

    /* renamed from: k  reason: collision with root package name */
    public int f5389k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k.b(), new k.b(), new k.b());
    }

    public final b a() {
        Parcel parcel = this.f5383e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f5388j;
        if (i3 == this.f5384f) {
            i3 = this.f5385g;
        }
        return new b(parcel, dataPosition, i3, m.j(new StringBuilder(), this.f5386h, "  "), this.f5379a, this.f5380b, this.f5381c);
    }

    public final boolean e(int i3) {
        while (this.f5388j < this.f5385g) {
            int i6 = this.f5389k;
            if (i6 == i3) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i7 = this.f5388j;
            Parcel parcel = this.f5383e;
            parcel.setDataPosition(i7);
            int readInt = parcel.readInt();
            this.f5389k = parcel.readInt();
            this.f5388j += readInt;
        }
        return this.f5389k == i3;
    }

    public final void i(int i3) {
        int i6 = this.f5387i;
        SparseIntArray sparseIntArray = this.f5382d;
        Parcel parcel = this.f5383e;
        if (i6 >= 0) {
            int i7 = sparseIntArray.get(i6);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(dataPosition - i7);
            parcel.setDataPosition(dataPosition);
        }
        this.f5387i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i6, String str, k.b bVar, k.b bVar2, k.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f5382d = new SparseIntArray();
        this.f5387i = -1;
        this.f5389k = -1;
        this.f5383e = parcel;
        this.f5384f = i3;
        this.f5385g = i6;
        this.f5388j = i3;
        this.f5386h = str;
    }
}
