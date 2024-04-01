package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new a(16);

    /* renamed from: d  reason: collision with root package name */
    public final String f1241d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1242e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1243f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1244g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1245h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1246i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1247j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1248k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1249l;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f1250m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1251n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1252o;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f1253p;

    public q0(Parcel parcel) {
        this.f1241d = parcel.readString();
        this.f1242e = parcel.readString();
        boolean z5 = true;
        this.f1243f = parcel.readInt() != 0;
        this.f1244g = parcel.readInt();
        this.f1245h = parcel.readInt();
        this.f1246i = parcel.readString();
        this.f1247j = parcel.readInt() != 0;
        this.f1248k = parcel.readInt() != 0;
        this.f1249l = parcel.readInt() != 0;
        this.f1250m = parcel.readBundle();
        this.f1251n = parcel.readInt() == 0 ? false : z5;
        this.f1253p = parcel.readBundle();
        this.f1252o = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1241d);
        sb.append(" (");
        sb.append(this.f1242e);
        sb.append(")}:");
        if (this.f1243f) {
            sb.append(" fromLayout");
        }
        int i3 = this.f1245h;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.f1246i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1247j) {
            sb.append(" retainInstance");
        }
        if (this.f1248k) {
            sb.append(" removing");
        }
        if (this.f1249l) {
            sb.append(" detached");
        }
        if (this.f1251n) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f1241d);
        parcel.writeString(this.f1242e);
        parcel.writeInt(this.f1243f ? 1 : 0);
        parcel.writeInt(this.f1244g);
        parcel.writeInt(this.f1245h);
        parcel.writeString(this.f1246i);
        parcel.writeInt(this.f1247j ? 1 : 0);
        parcel.writeInt(this.f1248k ? 1 : 0);
        parcel.writeInt(this.f1249l ? 1 : 0);
        parcel.writeBundle(this.f1250m);
        parcel.writeInt(this.f1251n ? 1 : 0);
        parcel.writeBundle(this.f1253p);
        parcel.writeInt(this.f1252o);
    }

    public q0(r rVar) {
        this.f1241d = rVar.getClass().getName();
        this.f1242e = rVar.f1258h;
        this.f1243f = rVar.f1266p;
        this.f1244g = rVar.f1274y;
        this.f1245h = rVar.f1275z;
        this.f1246i = rVar.A;
        this.f1247j = rVar.D;
        this.f1248k = rVar.f1265o;
        this.f1249l = rVar.C;
        this.f1250m = rVar.f1259i;
        this.f1251n = rVar.B;
        this.f1252o = rVar.O.ordinal();
    }
}
