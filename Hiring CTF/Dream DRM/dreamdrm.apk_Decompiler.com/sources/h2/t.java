package h2;

import android.graphics.Bitmap;
import b2.d;
import java.security.MessageDigest;
import y1.f;

public final class t extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3430b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f5810a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3430b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i3, int i6) {
        return y.b(dVar, bitmap, i3, i6);
    }

    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
