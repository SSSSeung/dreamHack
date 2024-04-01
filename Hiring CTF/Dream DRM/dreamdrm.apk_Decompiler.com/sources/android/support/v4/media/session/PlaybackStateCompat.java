package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import java.util.ArrayList;
import w4.p;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(8);

    /* renamed from: d  reason: collision with root package name */
    public final int f251d;

    /* renamed from: e  reason: collision with root package name */
    public final long f252e;

    /* renamed from: f  reason: collision with root package name */
    public final long f253f;

    /* renamed from: g  reason: collision with root package name */
    public final float f254g;

    /* renamed from: h  reason: collision with root package name */
    public final long f255h;

    /* renamed from: i  reason: collision with root package name */
    public final int f256i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f257j;

    /* renamed from: k  reason: collision with root package name */
    public final long f258k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f259l;

    /* renamed from: m  reason: collision with root package name */
    public final long f260m;

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f261n;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public final String f262d;

        /* renamed from: e  reason: collision with root package name */
        public final CharSequence f263e;

        /* renamed from: f  reason: collision with root package name */
        public final int f264f;

        /* renamed from: g  reason: collision with root package name */
        public final Bundle f265g;

        public CustomAction(Parcel parcel) {
            this.f262d = parcel.readString();
            this.f263e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f264f = parcel.readInt();
            this.f265g = parcel.readBundle(p.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f263e + ", mIcon=" + this.f264f + ", mExtras=" + this.f265g;
        }

        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f262d);
            TextUtils.writeToParcel(this.f263e, parcel, i3);
            parcel.writeInt(this.f264f);
            parcel.writeBundle(this.f265g);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f251d = parcel.readInt();
        this.f252e = parcel.readLong();
        this.f254g = parcel.readFloat();
        this.f258k = parcel.readLong();
        this.f253f = parcel.readLong();
        this.f255h = parcel.readLong();
        this.f257j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f259l = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f260m = parcel.readLong();
        this.f261n = parcel.readBundle(p.class.getClassLoader());
        this.f256i = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f251d + ", position=" + this.f252e + ", buffered position=" + this.f253f + ", speed=" + this.f254g + ", updated=" + this.f258k + ", actions=" + this.f255h + ", error code=" + this.f256i + ", error message=" + this.f257j + ", custom actions=" + this.f259l + ", active item id=" + this.f260m + "}";
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f251d);
        parcel.writeLong(this.f252e);
        parcel.writeFloat(this.f254g);
        parcel.writeLong(this.f258k);
        parcel.writeLong(this.f253f);
        parcel.writeLong(this.f255h);
        TextUtils.writeToParcel(this.f257j, parcel, i3);
        parcel.writeTypedList(this.f259l);
        parcel.writeLong(this.f260m);
        parcel.writeBundle(this.f261n);
        parcel.writeInt(this.f256i);
    }
}
