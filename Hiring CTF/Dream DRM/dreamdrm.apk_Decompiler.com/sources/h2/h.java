package h2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import b2.d;
import java.security.MessageDigest;
import y1.f;

public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3405b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f5810a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3405b);
    }

    public final Bitmap c(d dVar, Bitmap bitmap, int i3, int i6) {
        float f6;
        float f7;
        Paint paint = y.f3448a;
        if (bitmap.getWidth() == i3 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f8 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i3) {
            f7 = ((float) i6) / ((float) bitmap.getHeight());
            f8 = (((float) i3) - (((float) bitmap.getWidth()) * f7)) * 0.5f;
            f6 = 0.0f;
        } else {
            f7 = ((float) i3) / ((float) bitmap.getWidth());
            f6 = (((float) i6) - (((float) bitmap.getHeight()) * f7)) * 0.5f;
        }
        matrix.setScale(f7, f7);
        matrix.postTranslate((float) ((int) (f8 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        Bitmap a6 = dVar.a(i3, i6, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        a6.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, a6, matrix);
        return a6;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
