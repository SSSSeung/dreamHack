package h2;

import a2.f0;
import android.graphics.Bitmap;
import b2.d;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import r2.l;
import y1.m;

public abstract class e implements m {
    public final f0 b(g gVar, f0 f0Var, int i3, int i6) {
        if (l.g(i3, i6)) {
            d dVar = b.b(gVar).f1689d;
            Bitmap bitmap = (Bitmap) f0Var.get();
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getWidth();
            }
            if (i6 == Integer.MIN_VALUE) {
                i6 = bitmap.getHeight();
            }
            Bitmap c6 = c(dVar, bitmap, i3, i6);
            return bitmap.equals(c6) ? f0Var : d.e(c6, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i3 + " or height: " + i6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(d dVar, Bitmap bitmap, int i3, int i6);
}
