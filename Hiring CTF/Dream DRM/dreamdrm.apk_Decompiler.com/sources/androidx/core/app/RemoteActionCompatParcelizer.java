package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import v1.a;
import v1.b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f959a;
        boolean z5 = true;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        remoteActionCompat.f959a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f960b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5383e);
        }
        remoteActionCompat.f960b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f961c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5383e);
        }
        remoteActionCompat.f961c = charSequence2;
        remoteActionCompat.f962d = (PendingIntent) aVar.g(remoteActionCompat.f962d, 4);
        boolean z6 = remoteActionCompat.f963e;
        if (aVar.e(5)) {
            z6 = ((b) aVar).f5383e.readInt() != 0;
        }
        remoteActionCompat.f963e = z6;
        boolean z7 = remoteActionCompat.f964f;
        if (aVar.e(6)) {
            if (((b) aVar).f5383e.readInt() == 0) {
                z5 = false;
            }
            z7 = z5;
        }
        remoteActionCompat.f964f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f959a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f960b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f5383e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f961c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f962d, 4);
        boolean z5 = remoteActionCompat.f963e;
        aVar.i(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f964f;
        aVar.i(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
