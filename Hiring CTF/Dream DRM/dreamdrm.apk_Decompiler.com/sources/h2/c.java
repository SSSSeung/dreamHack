package h2;

import a2.f0;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.appcompat.widget.d1;
import androidx.compose.ui.platform.e;
import b2.d;
import y1.b;
import y1.h;
import y1.i;
import y1.j;
import y1.k;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final u f3387a = u.a();

    /* renamed from: b  reason: collision with root package name */
    public final e f3388b = new e();

    public final /* bridge */ /* synthetic */ f0 a(Object obj, int i3, int i6, i iVar) {
        return c(d1.f(obj), i3, i6, iVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        d1.w(obj);
        return true;
    }

    public final d c(ImageDecoder.Source source, int i3, int i6, i iVar) {
        b bVar = (b) iVar.c(p.f3417f);
        n nVar = (n) iVar.c(n.f3415f);
        h hVar = p.f3420i;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new g2.b(this, i3, i6, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), bVar, nVar, (j) iVar.c(p.f3418g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i3 + "x" + i6 + "]");
        }
        return new d(decodeBitmap, (d) this.f3388b);
    }
}
