package h2;

import a2.f0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import i2.b;
import java.io.File;
import y1.i;
import y1.k;

public final class a0 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3383a;

    public /* synthetic */ a0(int i3) {
        this.f3383a = i3;
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        switch (this.f3383a) {
            case 0:
                return new z((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new b(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f3383a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                return true;
            case 1:
                Drawable drawable = (Drawable) obj;
                return true;
            default:
                File file = (File) obj;
                return true;
        }
    }
}
