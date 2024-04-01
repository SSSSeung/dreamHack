package j2;

import a2.f0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.a0;
import b2.d;
import b2.h;
import c2.c;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e2.d0;
import i2.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r2.f;
import x1.e;
import y1.i;
import y1.k;

public final class a implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final d0 f3790f = new d0(8);

    /* renamed from: g  reason: collision with root package name */
    public static final c f3791g = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3792a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3793b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3794c = f3791g;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f3795d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f3796e;

    public a(Context context, ArrayList arrayList, d dVar, h hVar) {
        d0 d0Var = f3790f;
        this.f3792a = context.getApplicationContext();
        this.f3793b = arrayList;
        this.f3795d = d0Var;
        this.f3796e = new a0((Object) dVar, 21, (Object) hVar);
    }

    public static int d(x1.c cVar, int i3, int i6) {
        int min = Math.min(cVar.f5680g / i6, cVar.f5679f / i3);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i3 + "x" + i6 + "], actual dimens: [" + cVar.f5679f + "x" + cVar.f5680g + "]");
        }
        return max;
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        x1.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        c cVar = this.f3794c;
        synchronized (cVar) {
            x1.d dVar2 = (x1.d) cVar.f1608a.poll();
            if (dVar2 == null) {
                dVar2 = new x1.d();
            }
            dVar = dVar2;
            dVar.f5686b = null;
            Arrays.fill(dVar.f5685a, (byte) 0);
            dVar.f5687c = new x1.c();
            dVar.f5688d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f5686b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f5686b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            b c6 = c(byteBuffer, i3, i6, dVar, iVar);
            c cVar2 = this.f3794c;
            synchronized (cVar2) {
                dVar.f5686b = null;
                dVar.f5687c = null;
                cVar2.f1608a.offer(dVar);
            }
            return c6;
        } catch (Throwable th) {
            c cVar3 = this.f3794c;
            synchronized (cVar3) {
                dVar.f5686b = null;
                dVar.f5687c = null;
                cVar3.f1608a.offer(dVar);
                throw th;
            }
        }
    }

    public final boolean b(Object obj, i iVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) iVar.c(i.f3835b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
        } else {
            List list = this.f3793b;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser$ImageType a6 = ((y1.d) list.get(i3)).a(byteBuffer);
                if (a6 != ImageHeaderParser$ImageType.UNKNOWN) {
                    imageHeaderParser$ImageType = a6;
                    break;
                }
                i3++;
            }
        }
        return imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF;
    }

    public final b c(ByteBuffer byteBuffer, int i3, int i6, x1.d dVar, i iVar) {
        int i7 = f.f4927b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            x1.c b6 = dVar.b();
            if (b6.f5676c > 0) {
                if (b6.f5675b == 0) {
                    Bitmap.Config config = iVar.c(i.f3834a) == y1.b.f5807e ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d6 = d(b6, i3, i6);
                    d0 d0Var = this.f3795d;
                    a0 a0Var = this.f3796e;
                    d0Var.getClass();
                    e eVar = new e(a0Var, b6, byteBuffer, d6);
                    eVar.c(config);
                    eVar.f5699k = (eVar.f5699k + 1) % eVar.f5700l.f5676c;
                    Bitmap b7 = eVar.b();
                    if (b7 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
                        }
                        return null;
                    }
                    h hVar = r9;
                    h hVar2 = new h(com.bumptech.glide.b.b(this.f3792a), eVar, i3, i6, g2.c.f2851b, b7);
                    return new b(new c(new b(hVar)), 1);
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
        }
    }
}
