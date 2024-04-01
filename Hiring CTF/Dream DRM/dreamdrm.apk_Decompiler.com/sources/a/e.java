package a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a(9);

    /* renamed from: d  reason: collision with root package name */
    public b f8d;

    public e(Parcel parcel) {
        b bVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i3 = c.f2c;
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.f1a);
            bVar = (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(readStrongBinder) : (b) queryLocalInterface;
        }
        this.f8d = bVar;
    }

    public void a(int i3, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            if (this.f8d == null) {
                this.f8d = new c(this);
            }
            parcel.writeStrongBinder(this.f8d.asBinder());
        }
    }
}
