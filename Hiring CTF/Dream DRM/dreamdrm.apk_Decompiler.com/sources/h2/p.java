package h2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import androidx.activity.result.c;
import b1.o;
import b2.d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e2.d0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import r2.l;
import y1.b;
import y1.h;
import y1.i;
import y1.j;

public final class p {

    /* renamed from: f  reason: collision with root package name */
    public static final h f3417f = h.a(b.f5806d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final h f3418g = h.a(j.f5817d, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final h f3419h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f3420i;

    /* renamed from: j  reason: collision with root package name */
    public static final d0 f3421j = new d0(3);

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayDeque f3422k = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final d f3423a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f3424b;

    /* renamed from: c  reason: collision with root package name */
    public final b2.h f3425c;

    /* renamed from: d  reason: collision with root package name */
    public final List f3426d;

    /* renamed from: e  reason: collision with root package name */
    public final u f3427e = u.a();

    static {
        m mVar = n.f3410a;
        Boolean bool = Boolean.FALSE;
        f3419h = h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f3420i = h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = l.f4938a;
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, d dVar, b2.h hVar) {
        this.f3426d = arrayList;
        o.i(displayMetrics);
        this.f3424b = displayMetrics;
        o.i(dVar);
        this.f3423a = dVar;
        o.i(hVar);
        this.f3425c = hVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(androidx.activity.result.c r5, android.graphics.BitmapFactory.Options r6, h2.o r7, b2.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x0022
            r7.m()
            int r1 = r5.f326d
            switch(r1) {
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0022
        L_0x000f:
            java.lang.Object r1 = r5.f327e
            com.bumptech.glide.load.data.n r1 = (com.bumptech.glide.load.data.n) r1
            java.lang.Object r1 = r1.f1778b
            h2.w r1 = (h2.w) r1
            monitor-enter(r1)
            byte[] r2 = r1.f3442d     // Catch:{ all -> 0x001f }
            int r2 = r2.length     // Catch:{ all -> 0x001f }
            r1.f3444f = r2     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            goto L_0x0022
        L_0x001f:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L_0x0022:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = h2.y.f3449b
            r4.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch:{ IllegalArgumentException -> 0x0035 }
            r4.unlock()
            return r5
        L_0x0035:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x005a }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x005a }
        L_0x0046:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x005d
            r8.b(r0)     // Catch:{ IOException -> 0x005c }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x005c }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x005c }
            java.util.concurrent.locks.Lock r6 = h2.y.f3449b
            r6.unlock()
            return r5
        L_0x005a:
            r5 = move-exception
            goto L_0x005e
        L_0x005c:
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005d:
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005e:
            java.util.concurrent.locks.Lock r6 = h2.y.f3449b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.p.c(androidx.activity.result.c, android.graphics.BitmapFactory$Options, h2.o, b2.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i3, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i3 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(c cVar, int i3, int i6, i iVar, o oVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f3425c.c(65536, byte[].class);
        synchronized (p.class) {
            arrayDeque = f3422k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        b bVar = (b) iVar2.c(f3417f);
        j jVar = (j) iVar2.c(f3418g);
        n nVar = (n) iVar2.c(n.f3415f);
        boolean booleanValue = ((Boolean) iVar2.c(f3419h)).booleanValue();
        h hVar = f3420i;
        try {
            d e6 = d.e(b(cVar, options2, nVar, bVar, jVar, iVar2.c(hVar) != null && ((Boolean) iVar2.c(hVar)).booleanValue(), i3, i6, booleanValue, oVar), this.f3423a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f3425c.g(bArr);
            return e6;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f3422k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f3425c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:218:0x053b, code lost:
        r2.postScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x054a, code lost:
        r3 = new android.graphics.RectF(0.0f, 0.0f, (float) r0.getWidth(), (float) r0.getHeight());
        r2.mapRect(r3);
        r4 = java.lang.Math.round(r3.width());
        r5 = java.lang.Math.round(r3.height());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0571, code lost:
        if (r0.getConfig() == null) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0573, code lost:
        r6 = r0.getConfig();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0578, code lost:
        r6 = android.graphics.Bitmap.Config.ARGB_8888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x057a, code lost:
        r4 = r9.a(r4, r5, r6);
        r2.postTranslate(-r3.left, -r3.top);
        r4.setHasAlpha(r0.hasAlpha());
        h2.y.a(r0, r4, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[SYNTHETIC, Splitter:B:26:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(androidx.activity.result.c r41, android.graphics.BitmapFactory.Options r42, h2.n r43, y1.b r44, y1.j r45, boolean r46, int r47, int r48, boolean r49, h2.o r50) {
        /*
            r40 = this;
            r1 = r40
            r2 = r41
            r3 = r42
            r0 = r43
            r4 = r44
            r5 = r47
            r6 = r48
            r7 = r50
            int r8 = r2.f.f4927b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r10 = 1
            r3.inJustDecodeBounds = r10
            b2.d r11 = r1.f3423a
            c(r2, r3, r7, r11)
            r12 = 0
            r3.inJustDecodeBounds = r12
            int r13 = r3.outWidth
            int r14 = r3.outHeight
            java.lang.String r15 = r3.outMimeType
            r12 = -1
            if (r13 == r12) goto L_0x0030
            if (r14 != r12) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r17 = r46
            goto L_0x0032
        L_0x0030:
            r17 = 0
        L_0x0032:
            r18 = 0
            int r10 = r2.f326d
            java.lang.Object r12 = r2.f328f
            r20 = r8
            java.lang.Object r8 = r2.f327e
            java.lang.Object r9 = r2.f329g
            switch(r10) {
                case 7: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0056
        L_0x0042:
            java.util.List r9 = (java.util.List) r9
            com.bumptech.glide.load.data.n r8 = (com.bumptech.glide.load.data.n) r8
            java.lang.Object r8 = r8.f1778b
            h2.w r8 = (h2.w) r8
            r8.reset()
            b2.h r12 = (b2.h) r12
            int r8 = b1.o.z(r12, r8, r9)
            r22 = r15
            goto L_0x00ae
        L_0x0056:
            java.util.List r12 = (java.util.List) r12
            com.bumptech.glide.load.data.n r9 = (com.bumptech.glide.load.data.n) r9
            b2.h r8 = (b2.h) r8
            int r10 = r12.size()
            r22 = r15
            r15 = 0
        L_0x0063:
            if (r15 >= r10) goto L_0x00ab
            java.lang.Object r23 = r12.get(r15)
            r46 = r10
            r10 = r23
            y1.d r10 = (y1.d) r10
            r23 = r12
            h2.w r12 = new h2.w     // Catch:{ all -> 0x00a1 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00a1 }
            android.os.ParcelFileDescriptor r24 = r9.a()     // Catch:{ all -> 0x00a1 }
            java.io.FileDescriptor r1 = r24.getFileDescriptor()     // Catch:{ all -> 0x00a1 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a1 }
            r12.<init>(r4, r8)     // Catch:{ all -> 0x00a1 }
            int r1 = r10.c(r12, r8)     // Catch:{ all -> 0x009d }
            r12.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            r9.a()
            r4 = -1
            if (r1 == r4) goto L_0x0092
            r12 = r1
            goto L_0x00ad
        L_0x0092:
            int r15 = r15 + 1
            r1 = r40
            r4 = r44
            r10 = r46
            r12 = r23
            goto L_0x0063
        L_0x009d:
            r0 = move-exception
            r18 = r12
            goto L_0x00a2
        L_0x00a1:
            r0 = move-exception
        L_0x00a2:
            if (r18 == 0) goto L_0x00a7
            r18.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            r9.a()
            throw r0
        L_0x00ab:
            r4 = -1
            r12 = r4
        L_0x00ad:
            r8 = r12
        L_0x00ae:
            r1 = 270(0x10e, float:3.78E-43)
            r4 = 90
            switch(r8) {
                case 3: goto L_0x00bb;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00b7;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            r9 = 0
            goto L_0x00bd
        L_0x00b7:
            r9 = r1
            goto L_0x00bd
        L_0x00b9:
            r9 = r4
            goto L_0x00bd
        L_0x00bb:
            r9 = 180(0xb4, float:2.52E-43)
        L_0x00bd:
            switch(r8) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00c2;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            r10 = 0
            goto L_0x00c3
        L_0x00c2:
            r10 = 1
        L_0x00c3:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r12) goto L_0x00d5
            if (r9 == r4) goto L_0x00ce
            if (r9 != r1) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r15 = 0
            goto L_0x00cf
        L_0x00ce:
            r15 = 1
        L_0x00cf:
            if (r15 == 0) goto L_0x00d3
            r15 = r14
            goto L_0x00d6
        L_0x00d3:
            r15 = r13
            goto L_0x00d6
        L_0x00d5:
            r15 = r5
        L_0x00d6:
            if (r6 != r12) goto L_0x00e6
            if (r9 == r4) goto L_0x00df
            if (r9 != r1) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r12 = 0
            goto L_0x00e0
        L_0x00df:
            r12 = 1
        L_0x00e0:
            if (r12 == 0) goto L_0x00e4
            r12 = r13
            goto L_0x00e7
        L_0x00e4:
            r12 = r14
            goto L_0x00e7
        L_0x00e6:
            r12 = r6
        L_0x00e7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = r41.h()
            java.lang.String r4 = ", target density: "
            r25 = r8
            java.lang.String r8 = ", density: "
            java.lang.String r6 = "x"
            java.lang.String r5 = "Downsampler"
            r26 = r10
            java.lang.String r10 = "]"
            if (r13 <= 0) goto L_0x030d
            if (r14 > 0) goto L_0x010c
            r2 = r4
            r4 = r8
            r0 = r10
            r35 = r11
            r11 = r5
            r5 = 3
            r39 = r13
            r13 = r6
            r6 = r12
            r12 = r39
            goto L_0x031a
        L_0x010c:
            r27 = r10
            r10 = 90
            if (r9 == r10) goto L_0x0119
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 != r10) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r10 = 0
            goto L_0x011a
        L_0x0119:
            r10 = 1
        L_0x011a:
            r19 = r4
            r46 = r8
            if (r10 == 0) goto L_0x0123
            r8 = r13
            r10 = r14
            goto L_0x0125
        L_0x0123:
            r10 = r13
            r8 = r14
        L_0x0125:
            float r4 = r0.b(r10, r8, r15, r12)
            r23 = 0
            int r28 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r28 <= 0) goto L_0x02ca
            r28 = r9
            int r9 = r0.a(r10, r8, r15, r12)
            if (r9 == 0) goto L_0x02c2
            r29 = r14
            float r14 = (float) r10
            r30 = r6
            float r6 = r4 * r14
            r31 = r5
            double r5 = (double) r6
            r32 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 + r32
            int r5 = (int) r5
            float r6 = (float) r8
            r34 = r13
            float r13 = r4 * r6
            r35 = r12
            double r12 = (double) r13
            double r12 = r12 + r32
            int r12 = (int) r12
            int r5 = r10 / r5
            int r12 = r8 / r12
            r13 = 1
            if (r9 != r13) goto L_0x015d
            int r5 = java.lang.Math.max(r5, r12)
            goto L_0x0161
        L_0x015d:
            int r5 = java.lang.Math.min(r5, r12)
        L_0x0161:
            int r5 = java.lang.Integer.highestOneBit(r5)
            int r5 = java.lang.Math.max(r13, r5)
            if (r9 != r13) goto L_0x0176
            float r9 = (float) r5
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r12 / r4
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x0176
            int r5 = r5 << 1
        L_0x0176:
            r3.inSampleSize = r5
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            if (r1 != r9) goto L_0x0198
            r1 = 8
            int r1 = java.lang.Math.min(r5, r1)
            float r1 = (float) r1
            float r14 = r14 / r1
            double r8 = (double) r14
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r6 = r6 / r1
            double r9 = (double) r6
            double r9 = java.lang.Math.ceil(r9)
            int r1 = (int) r9
            int r6 = r5 / 8
            if (r6 <= 0) goto L_0x01e1
            int r8 = r8 / r6
            int r1 = r1 / r6
            goto L_0x01e1
        L_0x0198:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG
            if (r1 == r9) goto L_0x01d2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A
            if (r1 != r9) goto L_0x01a1
            goto L_0x01d2
        L_0x01a1:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP
            if (r1 == r9) goto L_0x01c6
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A
            if (r1 != r9) goto L_0x01aa
            goto L_0x01c6
        L_0x01aa:
            int r1 = r10 % r5
            if (r1 != 0) goto L_0x01b8
            int r1 = r8 % r5
            if (r1 == 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            int r10 = r10 / r5
            int r8 = r8 / r5
            r6 = r35
            goto L_0x01e5
        L_0x01b8:
            r1 = 1
            r3.inJustDecodeBounds = r1
            c(r2, r3, r7, r11)
            r1 = 0
            r3.inJustDecodeBounds = r1
            int r8 = r3.outWidth
            int r1 = r3.outHeight
            goto L_0x01e1
        L_0x01c6:
            float r1 = (float) r5
            float r14 = r14 / r1
            int r8 = java.lang.Math.round(r14)
            float r6 = r6 / r1
            int r1 = java.lang.Math.round(r6)
            goto L_0x01e1
        L_0x01d2:
            float r1 = (float) r5
            float r14 = r14 / r1
            double r8 = (double) r14
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            float r6 = r6 / r1
            double r9 = (double) r6
            double r9 = java.lang.Math.floor(r9)
            int r1 = (int) r9
        L_0x01e1:
            r10 = r8
            r6 = r35
            r8 = r1
        L_0x01e5:
            float r0 = r0.b(r10, r8, r15, r6)
            double r0 = (double) r0
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x01f3
            r35 = r0
            goto L_0x01f5
        L_0x01f3:
            double r35 = r12 / r0
        L_0x01f5:
            r37 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r35 = r35 * r37
            long r12 = java.lang.Math.round(r35)
            int r12 = (int) r12
            double r13 = (double) r12
            double r13 = r13 * r0
            double r13 = r13 + r32
            int r13 = (int) r13
            float r14 = (float) r13
            float r12 = (float) r12
            float r14 = r14 / r12
            r35 = r11
            double r11 = (double) r14
            double r11 = r0 / r11
            double r13 = (double) r13
            double r11 = r11 * r13
            double r11 = r11 + r32
            int r11 = (int) r11
            r3.inTargetDensity = r11
            if (r9 > 0) goto L_0x0219
            r12 = r0
            goto L_0x021d
        L_0x0219:
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r11 / r0
        L_0x021d:
            double r12 = r12 * r37
            long r11 = java.lang.Math.round(r12)
            int r9 = (int) r11
            r3.inDensity = r9
            int r11 = r3.inTargetDensity
            if (r11 <= 0) goto L_0x0230
            if (r9 <= 0) goto L_0x0230
            if (r11 == r9) goto L_0x0230
            r9 = 1
            goto L_0x0231
        L_0x0230:
            r9 = 0
        L_0x0231:
            if (r9 == 0) goto L_0x0237
            r9 = 1
            r3.inScaled = r9
            goto L_0x023c
        L_0x0237:
            r9 = 0
            r3.inTargetDensity = r9
            r3.inDensity = r9
        L_0x023c:
            r11 = r31
            r9 = 2
            boolean r12 = android.util.Log.isLoggable(r11, r9)
            if (r12 == 0) goto L_0x02b6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "Calculate scaling, source: ["
            r9.<init>(r12)
            r12 = r34
            r9.append(r12)
            r13 = r30
            r9.append(r13)
            r14 = r29
            r9.append(r14)
            java.lang.String r2 = "], degreesToRotate: "
            r9.append(r2)
            r2 = r28
            r9.append(r2)
            java.lang.String r2 = ", target: ["
            r9.append(r2)
            r9.append(r15)
            r9.append(r13)
            r9.append(r6)
            java.lang.String r2 = "], power of two scaled: ["
            r9.append(r2)
            r9.append(r10)
            r9.append(r13)
            r9.append(r8)
            java.lang.String r2 = "], exact scale factor: "
            r9.append(r2)
            r9.append(r4)
            java.lang.String r2 = ", power of 2 sample size: "
            r9.append(r2)
            r9.append(r5)
            java.lang.String r2 = ", adjusted scale factor: "
            r9.append(r2)
            r9.append(r0)
            r2 = r19
            r9.append(r2)
            int r0 = r3.inTargetDensity
            r9.append(r0)
            r4 = r46
            r9.append(r4)
            int r0 = r3.inDensity
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            android.util.Log.v(r11, r0)
            goto L_0x0342
        L_0x02b6:
            r4 = r46
            r2 = r19
            r14 = r29
            r13 = r30
            r12 = r34
            goto L_0x0342
        L_0x02c2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x02ca:
            r39 = r13
            r13 = r6
            r6 = r12
            r12 = r39
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot scale with factor: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " from: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", source: ["
            r2.append(r0)
            r2.append(r12)
            r2.append(r13)
            r2.append(r14)
            java.lang.String r0 = "], target: ["
            r2.append(r0)
            r2.append(r15)
            r2.append(r13)
            r2.append(r6)
            r0 = r27
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x030d:
            r2 = r4
            r4 = r8
            r0 = r10
            r35 = r11
            r11 = r5
            r39 = r13
            r13 = r6
            r6 = r12
            r12 = r39
            r5 = 3
        L_0x031a:
            boolean r8 = android.util.Log.isLoggable(r11, r5)
            if (r8 == 0) goto L_0x0342
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to determine dimensions for: "
            r5.<init>(r8)
            r5.append(r1)
            java.lang.String r1 = " with target ["
            r5.append(r1)
            r5.append(r15)
            r5.append(r13)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.d(r11, r0)
        L_0x0342:
            r1 = r40
            h2.u r0 = r1.f3427e
            r5 = r17
            r8 = r26
            boolean r0 = r0.b(r15, r6, r5, r8)
            if (r0 == 0) goto L_0x0358
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r5
            r5 = 0
            r3.inMutable = r5
            goto L_0x0359
        L_0x0358:
            r5 = 0
        L_0x0359:
            if (r0 == 0) goto L_0x035d
        L_0x035b:
            r8 = 1
            goto L_0x039c
        L_0x035d:
            y1.b r0 = y1.b.f5806d
            r8 = r44
            if (r8 == r0) goto L_0x0397
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r41.h()     // Catch:{ IOException -> 0x036c }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x036c }
            goto L_0x0386
        L_0x036c:
            r0 = move-exception
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r11, r9)
            if (r9 == 0) goto L_0x0385
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Cannot determine whether the image has alpha or not from header, format "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r11, r8, r0)
        L_0x0385:
            r0 = r5
        L_0x0386:
            if (r0 == 0) goto L_0x038b
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x038d
        L_0x038b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x038d:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r8) goto L_0x035b
            r8 = 1
            r3.inDither = r8
            goto L_0x039c
        L_0x0397:
            r8 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x039c:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r9 = r3.inSampleSize
            if (r12 < 0) goto L_0x03a8
            if (r14 < 0) goto L_0x03a8
            if (r49 == 0) goto L_0x03a8
            goto L_0x042f
        L_0x03a8:
            int r6 = r3.inTargetDensity
            if (r6 <= 0) goto L_0x03b4
            int r10 = r3.inDensity
            if (r10 <= 0) goto L_0x03b4
            if (r6 == r10) goto L_0x03b4
            r10 = r8
            goto L_0x03b5
        L_0x03b4:
            r10 = r5
        L_0x03b5:
            if (r10 == 0) goto L_0x03bd
            float r6 = (float) r6
            int r10 = r3.inDensity
            float r10 = (float) r10
            float r6 = r6 / r10
            goto L_0x03bf
        L_0x03bd:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x03bf:
            float r10 = (float) r12
            float r15 = (float) r9
            float r10 = r10 / r15
            r16 = r9
            double r8 = (double) r10
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r9 = (float) r14
            float r9 = r9 / r15
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            float r8 = (float) r8
            float r8 = r8 * r6
            int r15 = java.lang.Math.round(r8)
            float r8 = (float) r9
            float r8 = r8 * r6
            int r8 = java.lang.Math.round(r8)
            r9 = 2
            boolean r10 = android.util.Log.isLoggable(r11, r9)
            if (r10 == 0) goto L_0x042e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Calculated target ["
            r9.<init>(r10)
            r9.append(r15)
            r9.append(r13)
            r9.append(r8)
            java.lang.String r10 = "] for source ["
            r9.append(r10)
            r9.append(r12)
            r9.append(r13)
            r9.append(r14)
            java.lang.String r10 = "], sampleSize: "
            r9.append(r10)
            r10 = r16
            r9.append(r10)
            java.lang.String r10 = ", targetDensity: "
            r9.append(r10)
            int r10 = r3.inTargetDensity
            r9.append(r10)
            r9.append(r4)
            int r10 = r3.inDensity
            r9.append(r10)
            java.lang.String r10 = ", density multiplier: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            android.util.Log.v(r11, r6)
        L_0x042e:
            r6 = r8
        L_0x042f:
            if (r15 <= 0) goto L_0x0449
            if (r6 <= 0) goto L_0x0449
            android.graphics.Bitmap$Config r8 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r9) goto L_0x043a
            goto L_0x0449
        L_0x043a:
            android.graphics.Bitmap$Config r9 = r3.outConfig
            if (r9 != 0) goto L_0x043f
            goto L_0x0440
        L_0x043f:
            r8 = r9
        L_0x0440:
            r9 = r35
            android.graphics.Bitmap r6 = r9.h(r15, r6, r8)
            r3.inBitmap = r6
            goto L_0x044b
        L_0x0449:
            r9 = r35
        L_0x044b:
            r6 = 28
            if (r0 < r6) goto L_0x0467
            y1.j r0 = y1.j.f5818e
            r6 = r45
            if (r6 != r0) goto L_0x0461
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x0461
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0461
            r0 = 1
            goto L_0x0462
        L_0x0461:
            r0 = r5
        L_0x0462:
            if (r0 == 0) goto L_0x0467
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0469
        L_0x0467:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0469:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            r6 = r41
            android.graphics.Bitmap r0 = c(r6, r3, r7, r9)
            r7.c(r0, r9)
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r11, r6)
            if (r6 == 0) goto L_0x0503
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Decoded "
            r6.<init>(r7)
            java.lang.String r7 = d(r0)
            r6.append(r7)
            java.lang.String r7 = " from ["
            r6.append(r7)
            r6.append(r12)
            r6.append(r13)
            r6.append(r14)
            java.lang.String r7 = "] "
            r6.append(r7)
            r7 = r22
            r6.append(r7)
            java.lang.String r7 = " with inBitmap "
            r6.append(r7)
            android.graphics.Bitmap r7 = r3.inBitmap
            java.lang.String r7 = d(r7)
            r6.append(r7)
            java.lang.String r7 = " for ["
            r6.append(r7)
            r7 = r47
            r8 = r11
            r6.append(r7)
            r6.append(r13)
            r7 = r48
            r6.append(r7)
            java.lang.String r7 = "], sample size: "
            r6.append(r7)
            int r7 = r3.inSampleSize
            r6.append(r7)
            r6.append(r4)
            int r4 = r3.inDensity
            r6.append(r4)
            r6.append(r2)
            int r2 = r3.inTargetDensity
            r6.append(r2)
            java.lang.String r2 = ", thread: "
            r6.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r6.append(r2)
            java.lang.String r2 = ", duration: "
            r6.append(r2)
            double r2 = r2.f.a(r20)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.v(r8, r2)
        L_0x0503:
            if (r0 == 0) goto L_0x059c
            android.util.DisplayMetrics r2 = r1.f3424b
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            switch(r25) {
                case 2: goto L_0x0511;
                case 3: goto L_0x0511;
                case 4: goto L_0x0511;
                case 5: goto L_0x0511;
                case 6: goto L_0x0511;
                case 7: goto L_0x0511;
                case 8: goto L_0x0511;
                default: goto L_0x050f;
            }
        L_0x050f:
            r10 = r5
            goto L_0x0512
        L_0x0511:
            r10 = 1
        L_0x0512:
            if (r10 != 0) goto L_0x0517
            r4 = r0
            goto L_0x0591
        L_0x0517:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r25) {
                case 2: goto L_0x0545;
                case 3: goto L_0x0541;
                case 4: goto L_0x0538;
                case 5: goto L_0x0534;
                case 6: goto L_0x0530;
                case 7: goto L_0x052c;
                case 8: goto L_0x0528;
                default: goto L_0x0527;
            }
        L_0x0527:
            goto L_0x054a
        L_0x0528:
            r2.setRotate(r3)
            goto L_0x054a
        L_0x052c:
            r2.setRotate(r3)
            goto L_0x053b
        L_0x0530:
            r2.setRotate(r4)
            goto L_0x054a
        L_0x0534:
            r2.setRotate(r4)
            goto L_0x053b
        L_0x0538:
            r2.setRotate(r5)
        L_0x053b:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r6, r3)
            goto L_0x054a
        L_0x0541:
            r2.setRotate(r5)
            goto L_0x054a
        L_0x0545:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r6, r3)
        L_0x054a:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            if (r6 == 0) goto L_0x0578
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            goto L_0x057a
        L_0x0578:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x057a:
            android.graphics.Bitmap r4 = r9.a(r4, r5, r6)
            float r5 = r3.left
            float r5 = -r5
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r5, r3)
            boolean r3 = r0.hasAlpha()
            r4.setHasAlpha(r3)
            h2.y.a(r0, r4, r2)
        L_0x0591:
            boolean r2 = r0.equals(r4)
            if (r2 != 0) goto L_0x059a
            r9.b(r0)
        L_0x059a:
            r18 = r4
        L_0x059c:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.p.b(androidx.activity.result.c, android.graphics.BitmapFactory$Options, h2.n, y1.b, y1.j, boolean, int, int, boolean, h2.o):android.graphics.Bitmap");
    }
}
