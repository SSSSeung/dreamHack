package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import java.util.ArrayList;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(13);

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1088d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1089e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1090f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1091g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1092h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1093i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1094j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1095k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f1096l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1097m;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f1098n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f1099o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f1100p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1101q;

    public b(Parcel parcel) {
        this.f1088d = parcel.createIntArray();
        this.f1089e = parcel.createStringArrayList();
        this.f1090f = parcel.createIntArray();
        this.f1091g = parcel.createIntArray();
        this.f1092h = parcel.readInt();
        this.f1093i = parcel.readString();
        this.f1094j = parcel.readInt();
        this.f1095k = parcel.readInt();
        this.f1096l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1097m = parcel.readInt();
        this.f1098n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1099o = parcel.createStringArrayList();
        this.f1100p = parcel.createStringArrayList();
        this.f1101q = parcel.readInt() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f1088d);
        parcel.writeStringList(this.f1089e);
        parcel.writeIntArray(this.f1090f);
        parcel.writeIntArray(this.f1091g);
        parcel.writeInt(this.f1092h);
        parcel.writeString(this.f1093i);
        parcel.writeInt(this.f1094j);
        parcel.writeInt(this.f1095k);
        TextUtils.writeToParcel(this.f1096l, parcel, 0);
        parcel.writeInt(this.f1097m);
        TextUtils.writeToParcel(this.f1098n, parcel, 0);
        parcel.writeStringList(this.f1099o);
        parcel.writeStringList(this.f1100p);
        parcel.writeInt(this.f1101q ? 1 : 0);
    }

    public b(a aVar) {
        int size = aVar.f1067a.size();
        this.f1088d = new int[(size * 5)];
        if (aVar.f1073g) {
            this.f1089e = new ArrayList(size);
            this.f1090f = new int[size];
            this.f1091g = new int[size];
            int i3 = 0;
            int i6 = 0;
            while (i3 < size) {
                t0 t0Var = (t0) aVar.f1067a.get(i3);
                int i7 = i6 + 1;
                this.f1088d[i6] = t0Var.f1286a;
                ArrayList arrayList = this.f1089e;
                r rVar = t0Var.f1287b;
                arrayList.add(rVar != null ? rVar.f1258h : null);
                int[] iArr = this.f1088d;
                int i8 = i7 + 1;
                iArr[i7] = t0Var.f1288c;
                int i9 = i8 + 1;
                iArr[i8] = t0Var.f1289d;
                int i10 = i9 + 1;
                iArr[i9] = t0Var.f1290e;
                iArr[i10] = t0Var.f1291f;
                this.f1090f[i3] = t0Var.f1292g.ordinal();
                this.f1091g[i3] = t0Var.f1293h.ordinal();
                i3++;
                i6 = i10 + 1;
            }
            this.f1092h = aVar.f1072f;
            this.f1093i = aVar.f1074h;
            this.f1094j = aVar.f1084r;
            this.f1095k = aVar.f1075i;
            this.f1096l = aVar.f1076j;
            this.f1097m = aVar.f1077k;
            this.f1098n = aVar.f1078l;
            this.f1099o = aVar.f1079m;
            this.f1100p = aVar.f1080n;
            this.f1101q = aVar.f1081o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
