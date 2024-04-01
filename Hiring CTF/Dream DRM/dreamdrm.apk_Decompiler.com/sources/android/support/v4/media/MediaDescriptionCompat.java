package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: d  reason: collision with root package name */
    public final String f221d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f222e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f223f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f224g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap f225h;

    /* renamed from: i  reason: collision with root package name */
    public final Uri f226i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f227j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f228k;

    /* renamed from: l  reason: collision with root package name */
    public Object f229l;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f221d = str;
        this.f222e = charSequence;
        this.f223f = charSequence2;
        this.f224g = charSequence3;
        this.f225h = bitmap;
        this.f226i = uri;
        this.f227j = bundle;
        this.f228k = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f222e + ", " + this.f223f + ", " + this.f224g;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        Object obj = this.f229l;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f221d);
            builder.setTitle(this.f222e);
            builder.setSubtitle(this.f223f);
            builder.setDescription(this.f224g);
            builder.setIconBitmap(this.f225h);
            builder.setIconUri(this.f226i);
            builder.setExtras(this.f227j);
            builder.setMediaUri(this.f228k);
            obj = builder.build();
            this.f229l = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i3);
    }
}
