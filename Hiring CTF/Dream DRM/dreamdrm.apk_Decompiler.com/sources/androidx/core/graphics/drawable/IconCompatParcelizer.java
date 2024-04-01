package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import v1.a;
import v1.b;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(v1.a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f966a
            r2 = 1
            int r1 = r5.f(r1, r2)
            r0.f966a = r1
            byte[] r1 = r0.f968c
            r2 = 2
            boolean r3 = r5.e(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x002b
        L_0x0018:
            r1 = r5
            v1.b r1 = (v1.b) r1
            android.os.Parcel r1 = r1.f5383e
            int r3 = r1.readInt()
            if (r3 >= 0) goto L_0x0025
            r1 = 0
            goto L_0x002b
        L_0x0025:
            byte[] r3 = new byte[r3]
            r1.readByteArray(r3)
            r1 = r3
        L_0x002b:
            r0.f968c = r1
            android.os.Parcelable r1 = r0.f969d
            r3 = 3
            android.os.Parcelable r1 = r5.g(r1, r3)
            r0.f969d = r1
            int r1 = r0.f970e
            r4 = 4
            int r1 = r5.f(r1, r4)
            r0.f970e = r1
            int r1 = r0.f971f
            r4 = 5
            int r1 = r5.f(r1, r4)
            r0.f971f = r1
            android.content.res.ColorStateList r1 = r0.f972g
            r4 = 6
            android.os.Parcelable r1 = r5.g(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f972g = r1
            java.lang.String r1 = r0.f974i
            r4 = 7
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            r1 = r5
            v1.b r1 = (v1.b) r1
            android.os.Parcel r1 = r1.f5383e
            java.lang.String r1 = r1.readString()
        L_0x0066:
            r0.f974i = r1
            java.lang.String r1 = r0.f975j
            r4 = 8
            boolean r4 = r5.e(r4)
            if (r4 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            v1.b r5 = (v1.b) r5
            android.os.Parcel r5 = r5.f5383e
            java.lang.String r1 = r5.readString()
        L_0x007b:
            r0.f975j = r1
            java.lang.String r5 = r0.f974i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f973h = r5
            int r5 = r0.f966a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00c5;
                case 0: goto L_0x008b;
                case 1: goto L_0x00b4;
                case 2: goto L_0x0091;
                case 3: goto L_0x008c;
                case 4: goto L_0x0091;
                case 5: goto L_0x00b4;
                case 6: goto L_0x0091;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00d4
        L_0x008c:
            byte[] r5 = r0.f968c
            r0.f967b = r5
            goto L_0x00d4
        L_0x0091:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f968c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f967b = r5
            int r3 = r0.f966a
            if (r3 != r2) goto L_0x00d4
            java.lang.String r2 = r0.f975j
            if (r2 != 0) goto L_0x00d4
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.f975j = r5
            goto L_0x00d4
        L_0x00b4:
            android.os.Parcelable r5 = r0.f969d
            if (r5 == 0) goto L_0x00b9
            goto L_0x00c9
        L_0x00b9:
            byte[] r5 = r0.f968c
            r0.f967b = r5
            r0.f966a = r3
            r0.f970e = r1
            int r5 = r5.length
            r0.f971f = r5
            goto L_0x00d4
        L_0x00c5:
            android.os.Parcelable r5 = r0.f969d
            if (r5 == 0) goto L_0x00cc
        L_0x00c9:
            r0.f967b = r5
            goto L_0x00d4
        L_0x00cc:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(v1.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f974i = iconCompat.f973h.name();
        switch (iconCompat.f966a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f969d = (Parcelable) iconCompat.f967b;
                break;
            case 2:
                iconCompat.f968c = ((String) iconCompat.f967b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f968c = (byte[]) iconCompat.f967b;
                break;
            case 4:
            case 6:
                iconCompat.f968c = iconCompat.f967b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f966a;
        if (-1 != i3) {
            aVar.j(i3, 1);
        }
        byte[] bArr = iconCompat.f968c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f5383e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f969d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i6 = iconCompat.f970e;
        if (i6 != 0) {
            aVar.j(i6, 4);
        }
        int i7 = iconCompat.f971f;
        if (i7 != 0) {
            aVar.j(i7, 5);
        }
        ColorStateList colorStateList = iconCompat.f972g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f974i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f5383e.writeString(str);
        }
        String str2 = iconCompat.f975j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f5383e.writeString(str2);
        }
    }
}
