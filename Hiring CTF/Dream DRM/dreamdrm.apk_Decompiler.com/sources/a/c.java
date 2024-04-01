package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class c extends Binder implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3b;

    public c(e eVar) {
        this.f3b = eVar;
        attachInterface(this, b.f1a);
    }

    /* renamed from: a */
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i6) {
        String str = b.f1a;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i6);
        } else {
            int readInt = parcel.readInt();
            Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            e eVar = this.f3b;
            eVar.getClass();
            eVar.a(readInt, (Bundle) createFromParcel);
            return true;
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
