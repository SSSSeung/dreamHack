package android.support.v4.media;

import a.e;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.widget.u0;
import androidx.fragment.app.b;
import androidx.fragment.app.i0;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.versionedparcelable.ParcelImpl;
import b1.l;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.p;
import com.google.android.material.timepicker.g;
import p1.l1;
import p1.m1;
import p1.y;

public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f233a;

    public /* synthetic */ a(int i3) {
        this.f233a = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = r14.f233a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0145;
                case 1: goto L_0x00de;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00a2;
                case 10: goto L_0x009c;
                case 11: goto L_0x0096;
                case 12: goto L_0x0090;
                case 13: goto L_0x008a;
                case 14: goto L_0x0084;
                case 15: goto L_0x007e;
                case 16: goto L_0x0078;
                case 17: goto L_0x0072;
                case 18: goto L_0x006c;
                case 19: goto L_0x0066;
                case 20: goto L_0x0060;
                case 21: goto L_0x005a;
                case 22: goto L_0x001f;
                case 23: goto L_0x0015;
                case 24: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x014b
        L_0x0008:
            int r0 = r15.readInt()
            int r15 = r15.readInt()
            com.google.android.material.datepicker.p r15 = com.google.android.material.datepicker.p.a(r0, r15)
            return r15
        L_0x0015:
            com.google.android.material.datepicker.d r0 = new com.google.android.material.datepicker.d
            long r1 = r15.readLong()
            r0.<init>(r1)
            return r0
        L_0x001f:
            java.lang.Class<com.google.android.material.datepicker.p> r0 = com.google.android.material.datepicker.p.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r15.readParcelable(r1)
            r3 = r1
            com.google.android.material.datepicker.p r3 = (com.google.android.material.datepicker.p) r3
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r15.readParcelable(r1)
            r4 = r1
            com.google.android.material.datepicker.p r4 = (com.google.android.material.datepicker.p) r4
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            r6 = r0
            com.google.android.material.datepicker.p r6 = (com.google.android.material.datepicker.p) r6
            java.lang.Class<com.google.android.material.datepicker.b> r0 = com.google.android.material.datepicker.b.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r15.readParcelable(r0)
            r5 = r0
            com.google.android.material.datepicker.b r5 = (com.google.android.material.datepicker.b) r5
            int r7 = r15.readInt()
            com.google.android.material.datepicker.c r15 = new com.google.android.material.datepicker.c
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            return r15
        L_0x005a:
            f3.b r0 = new f3.b
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0060:
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r15)
            return r0
        L_0x0066:
            p1.m1 r0 = new p1.m1
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x006c:
            p1.l1 r0 = new p1.l1
            r0.<init>(r15)
            return r0
        L_0x0072:
            p1.y r0 = new p1.y
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0078:
            androidx.fragment.app.q0 r0 = new androidx.fragment.app.q0
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x007e:
            androidx.fragment.app.m0 r0 = new androidx.fragment.app.m0
            r0.<init>(r15)
            return r0
        L_0x0084:
            androidx.fragment.app.i0 r0 = new androidx.fragment.app.i0
            r0.<init>(r15)
            return r0
        L_0x008a:
            androidx.fragment.app.b r0 = new androidx.fragment.app.b
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0090:
            b1.l r0 = new b1.l
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x0096:
            androidx.appcompat.widget.u0 r0 = new androidx.appcompat.widget.u0
            r0.<init>((android.os.Parcel) r15)
            return r0
        L_0x009c:
            androidx.activity.result.a r0 = new androidx.activity.result.a
            r0.<init>(r15)
            return r0
        L_0x00a2:
            a.e r0 = new a.e
            r0.<init>(r15)
            return r0
        L_0x00a8:
            android.support.v4.media.session.PlaybackStateCompat r0 = new android.support.v4.media.session.PlaybackStateCompat
            r0.<init>(r15)
            return r0
        L_0x00ae:
            android.support.v4.media.session.ParcelableVolumeInfo r0 = new android.support.v4.media.session.ParcelableVolumeInfo
            r0.<init>(r15)
            return r0
        L_0x00b4:
            android.os.Parcelable r15 = r15.readParcelable(r1)
            android.support.v4.media.session.MediaSessionCompat$Token r0 = new android.support.v4.media.session.MediaSessionCompat$Token
            r0.<init>(r15)
            return r0
        L_0x00be:
            android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r0 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            r0.<init>(r15)
            return r0
        L_0x00c4:
            android.support.v4.media.session.MediaSessionCompat$QueueItem r0 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            r0.<init>(r15)
            return r0
        L_0x00ca:
            android.support.v4.media.RatingCompat r0 = new android.support.v4.media.RatingCompat
            int r1 = r15.readInt()
            float r15 = r15.readFloat()
            r0.<init>(r1, r15)
            return r0
        L_0x00d8:
            android.support.v4.media.MediaMetadataCompat r0 = new android.support.v4.media.MediaMetadataCompat
            r0.<init>(r15)
            return r0
        L_0x00de:
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r15 = r0.createFromParcel(r15)
            if (r15 == 0) goto L_0x0144
            r0 = r15
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.String r3 = r0.getMediaId()
            java.lang.CharSequence r4 = r0.getTitle()
            java.lang.CharSequence r5 = r0.getSubtitle()
            java.lang.CharSequence r6 = r0.getDescription()
            android.graphics.Bitmap r7 = r0.getIconBitmap()
            android.net.Uri r8 = r0.getIconUri()
            android.os.Bundle r2 = r0.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0119
            java.lang.Class<w4.p> r10 = w4.p.class
            java.lang.ClassLoader r10 = r10.getClassLoader()
            r2.setClassLoader(r10)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x011a
        L_0x0119:
            r10 = r1
        L_0x011a:
            if (r10 == 0) goto L_0x0133
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x012d
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x012d
            r9 = r1
            goto L_0x0134
        L_0x012d:
            r2.remove(r9)
            r2.remove(r11)
        L_0x0133:
            r9 = r2
        L_0x0134:
            if (r10 == 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            android.net.Uri r0 = r0.getMediaUri()
            r10 = r0
        L_0x013c:
            android.support.v4.media.MediaDescriptionCompat r1 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.f229l = r15
        L_0x0144:
            return r1
        L_0x0145:
            android.support.v4.media.MediaBrowserCompat$MediaItem r0 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r0.<init>(r15)
            return r0
        L_0x014b:
            com.google.android.material.timepicker.g r0 = new com.google.android.material.timepicker.g
            r0.<init>(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i3) {
        switch (this.f233a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i3];
            case 1:
                return new MediaDescriptionCompat[i3];
            case 2:
                return new MediaMetadataCompat[i3];
            case 3:
                return new RatingCompat[i3];
            case 4:
                return new MediaSessionCompat$QueueItem[i3];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 6:
                return new MediaSessionCompat$Token[i3];
            case 7:
                return new ParcelableVolumeInfo[i3];
            case 8:
                return new PlaybackStateCompat[i3];
            case 9:
                return new e[i3];
            case 10:
                return new androidx.activity.result.a[i3];
            case 11:
                return new u0[i3];
            case 12:
                return new l[i3];
            case 13:
                return new b[i3];
            case 14:
                return new i0[i3];
            case 15:
                return new m0[i3];
            case 16:
                return new q0[i3];
            case 17:
                return new y[i3];
            case 18:
                return new l1[i3];
            case 19:
                return new m1[i3];
            case 20:
                return new ParcelImpl[i3];
            case 21:
                return new f3.b[i3];
            case 22:
                return new c[i3];
            case 23:
                return new d[i3];
            case 24:
                return new p[i3];
            default:
                return new g[i3];
        }
    }
}
