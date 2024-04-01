package h2;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import b2.d;
import e2.d0;
import java.nio.ByteBuffer;
import y1.h;
import y1.i;
import y1.k;

public final class f0 implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final h f3397d = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new c0(0));

    /* renamed from: e  reason: collision with root package name */
    public static final h f3398e = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new c0(1));

    /* renamed from: f  reason: collision with root package name */
    public static final d0 f3399f = new d0(6);

    /* renamed from: a  reason: collision with root package name */
    public final e0 f3400a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3401b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f3402c = f3399f;

    public f0(d dVar, d0 d0Var) {
        this.f3401b = dVar;
        this.f3400a = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, h2.n r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            h2.m r0 = h2.n.f3413d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            if (r13 == 0) goto L_0x006a
            return r13
        L_0x006a:
            androidx.fragment.app.q r9 = new androidx.fragment.app.q
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.c(android.media.MediaMetadataRetriever, long, int, int, int, h2.n):android.graphics.Bitmap");
    }

    public final a2.f0 a(Object obj, int i3, int i6, i iVar) {
        MediaMetadataRetriever mediaMetadataRetriever;
        i iVar2 = iVar;
        long longValue = ((Long) iVar2.c(f3397d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar2.c(f3398e);
            if (num == null) {
                num = 2;
            }
            n nVar = (n) iVar2.c(n.f3415f);
            if (nVar == null) {
                nVar = n.f3414e;
            }
            n nVar2 = nVar;
            this.f3402c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                switch (((d0) this.f3400a).f2499d) {
                    case 4:
                        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                        mediaMetadataRetriever2.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                        break;
                    case 5:
                        mediaMetadataRetriever2.setDataSource(new d0((ByteBuffer) obj));
                        break;
                    default:
                        mediaMetadataRetriever2.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                        break;
                }
                int intValue = num.intValue();
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    Bitmap c6 = c(mediaMetadataRetriever2, longValue, intValue, i3, i6, nVar2);
                    mediaMetadataRetriever.release();
                    return d.e(c6, this.f3401b);
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public final boolean b(Object obj, i iVar) {
        return true;
    }
}
