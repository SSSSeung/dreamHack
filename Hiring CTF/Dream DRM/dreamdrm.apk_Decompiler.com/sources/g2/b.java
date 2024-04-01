package g2;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import h2.c;
import h2.n;
import y1.j;

public final class b implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2844a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2845b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2846c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y1.b f2847d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f2848e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f2849f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f2850g;

    public b(c cVar, int i3, int i6, boolean z5, y1.b bVar, n nVar, j jVar) {
        this.f2850g = cVar;
        this.f2844a = i3;
        this.f2845b = i6;
        this.f2846c = z5;
        this.f2847d = bVar;
        this.f2848e = nVar;
        this.f2849f = jVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z5 = false;
        if (this.f2850g.f3387a.b(this.f2844a, this.f2845b, this.f2846c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f2847d == y1.b.f5807e) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size p2 = imageInfo.getSize();
        int i3 = this.f2844a;
        if (i3 == Integer.MIN_VALUE) {
            i3 = p2.getWidth();
        }
        int i6 = this.f2845b;
        if (i6 == Integer.MIN_VALUE) {
            i6 = p2.getHeight();
        }
        float b6 = this.f2848e.b(p2.getWidth(), p2.getHeight(), i3, i6);
        int round = Math.round(((float) p2.getWidth()) * b6);
        int round2 = Math.round(((float) p2.getHeight()) * b6);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + p2.getWidth() + "x" + p2.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b6);
        }
        imageDecoder.setTargetSize(round, round2);
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.f2849f == j.f5818e && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z5 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            return;
        }
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }
}
