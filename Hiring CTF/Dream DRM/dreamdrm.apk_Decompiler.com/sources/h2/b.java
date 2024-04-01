package h2;

import y1.h;
import y1.i;
import y1.l;

public final class b implements l {

    /* renamed from: e  reason: collision with root package name */
    public static final h f3384e = h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: f  reason: collision with root package name */
    public static final h f3385f = new h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", (Object) null, h.f5811e);

    /* renamed from: d  reason: collision with root package name */
    public final b2.h f3386d;

    public b(b2.h hVar) {
        this.f3386d = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.bumptech.glide.load.data.c} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC, Splitter:B:41:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r9, java.io.File r10, y1.i r11) {
        /*
            r8 = this;
            a2.f0 r9 = (a2.f0) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            y1.h r1 = f3385f
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r3 = r2.f.f4927b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            y1.h r5 = f3384e
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005c }
            r7.<init>(r10)     // Catch:{ IOException -> 0x005c }
            b2.h r10 = r8.f3386d
            if (r10 == 0) goto L_0x004e
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            r6.<init>(r7, r10)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r9 = move-exception
            goto L_0x00b9
        L_0x004b:
            r10 = move-exception
            r6 = r7
            goto L_0x005d
        L_0x004e:
            r6 = r7
        L_0x004f:
            r9.compress(r2, r5, r6)     // Catch:{ IOException -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x0058, all -> 0x00bf }
        L_0x0058:
            r10 = 1
            goto L_0x006f
        L_0x005a:
            r9 = move-exception
            goto L_0x00b8
        L_0x005c:
            r10 = move-exception
        L_0x005d:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0069
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch:{ all -> 0x005a }
        L_0x0069:
            if (r6 == 0) goto L_0x006e
            r6.close()     // Catch:{ IOException -> 0x006e, all -> 0x00bf }
        L_0x006e:
            r10 = 0
        L_0x006f:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto L_0x00b7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = r2.l.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = r2.f.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        L_0x00b7:
            return r10
        L_0x00b8:
            r7 = r6
        L_0x00b9:
            if (r7 == 0) goto L_0x00c1
            r7.close()     // Catch:{ IOException -> 0x00c1, all -> 0x00bf }
            goto L_0x00c1
        L_0x00bf:
            r9 = move-exception
            throw r9
        L_0x00c1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.e(java.lang.Object, java.io.File, y1.i):boolean");
    }

    public final int k(i iVar) {
        return 2;
    }
}
