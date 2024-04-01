package l;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.n3;
import b1.o;

public final class b extends d implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new n3(2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, e eVar) {
        super(obj, eVar);
        o.m(eVar, "policy");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int i6;
        o.m(parcel, "parcel");
        parcel.writeValue(a());
        a aVar = a.f4047a;
        e eVar = this.f4049d;
        if (o.c(eVar, aVar)) {
            i6 = 0;
        } else if (o.c(eVar, f.f4051a)) {
            i6 = 1;
        } else if (o.c(eVar, c.f4048a)) {
            i6 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i6);
    }
}
