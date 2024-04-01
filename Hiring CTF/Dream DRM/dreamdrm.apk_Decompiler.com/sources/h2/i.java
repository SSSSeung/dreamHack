package h2;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import b2.d;
import java.security.MessageDigest;
import y1.f;

public final class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3406b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f5810a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3406b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i3, int i6) {
        Paint paint = y.f3448a;
        if (bitmap.getWidth() > i3 || bitmap.getHeight() > i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(dVar, bitmap, i3, i6);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
