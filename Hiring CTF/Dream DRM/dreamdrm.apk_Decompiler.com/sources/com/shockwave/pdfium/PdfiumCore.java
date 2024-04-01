package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d4.a;
import d4.b;
import d4.c;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class PdfiumCore {

    /* renamed from: b  reason: collision with root package name */
    public static final Class f2107b = FileDescriptor.class;

    /* renamed from: c  reason: collision with root package name */
    public static Field f2108c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f2109d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f2110a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e6) {
            Log.e("com.shockwave.pdfium.PdfiumCore", "Native libraries failed to load - " + e6);
        }
    }

    public PdfiumCore(Context context) {
        this.f2110a = context.getResources().getDisplayMetrics().densityDpi;
    }

    private native void nativeCloseDocument(long j6);

    private native void nativeClosePage(long j6);

    private native long nativeGetBookmarkDestIndex(long j6, long j7);

    private native String nativeGetBookmarkTitle(long j6);

    private native String nativeGetDocumentMetaText(long j6, String str);

    private native Long nativeGetFirstChildBookmark(long j6, Long l6);

    private native int nativeGetPageCount(long j6);

    private native int nativeGetPageHeightPixel(long j6, int i3);

    private native int nativeGetPageWidthPixel(long j6, int i3);

    private native Long nativeGetSiblingBookmark(long j6, long j7);

    private native long nativeLoadPage(long j6, int i3);

    private native long nativeOpenDocument(int i3, String str);

    private native void nativeRenderPageBitmap(long j6, Bitmap bitmap, int i3, int i6, int i7, int i8, int i9, boolean z5);

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d4.c r6) {
        /*
            r5 = this;
            java.lang.Object r0 = f2109d
            monitor-enter(r0)
            k.b r1 = r6.f2183c     // Catch:{ all -> 0x0041 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0041 }
            k.g r1 = (k.g) r1     // Catch:{ all -> 0x0041 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0041 }
        L_0x000f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0041 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0041 }
            k.b r4 = r6.f2183c     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r4.getOrDefault(r2, r3)     // Catch:{ all -> 0x0041 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0041 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0041 }
            r5.nativeClosePage(r2)     // Catch:{ all -> 0x0041 }
            goto L_0x000f
        L_0x002c:
            k.b r1 = r6.f2183c     // Catch:{ all -> 0x0041 }
            r1.clear()     // Catch:{ all -> 0x0041 }
            long r1 = r6.f2181a     // Catch:{ all -> 0x0041 }
            r5.nativeCloseDocument(r1)     // Catch:{ all -> 0x0041 }
            android.os.ParcelFileDescriptor r1 = r6.f2182b     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r6.f2182b = r3     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shockwave.pdfium.PdfiumCore.a(d4.c):void");
    }

    public final b b(c cVar) {
        b bVar;
        synchronized (f2109d) {
            bVar = new b();
            nativeGetDocumentMetaText(cVar.f2181a, "Title");
            nativeGetDocumentMetaText(cVar.f2181a, "Author");
            nativeGetDocumentMetaText(cVar.f2181a, "Subject");
            nativeGetDocumentMetaText(cVar.f2181a, "Keywords");
            nativeGetDocumentMetaText(cVar.f2181a, "Creator");
            nativeGetDocumentMetaText(cVar.f2181a, "Producer");
            nativeGetDocumentMetaText(cVar.f2181a, "CreationDate");
            nativeGetDocumentMetaText(cVar.f2181a, "ModDate");
        }
        return bVar;
    }

    public final int c(c cVar) {
        int nativeGetPageCount;
        synchronized (f2109d) {
            nativeGetPageCount = nativeGetPageCount(cVar.f2181a);
        }
        return nativeGetPageCount;
    }

    public final int d(c cVar, int i3) {
        synchronized (f2109d) {
            Long l6 = (Long) cVar.f2183c.getOrDefault(Integer.valueOf(i3), (Object) null);
            if (l6 == null) {
                return 0;
            }
            int nativeGetPageHeightPixel = nativeGetPageHeightPixel(l6.longValue(), this.f2110a);
            return nativeGetPageHeightPixel;
        }
    }

    public final int e(c cVar, int i3) {
        synchronized (f2109d) {
            Long l6 = (Long) cVar.f2183c.getOrDefault(Integer.valueOf(i3), (Object) null);
            if (l6 == null) {
                return 0;
            }
            int nativeGetPageWidthPixel = nativeGetPageWidthPixel(l6.longValue(), this.f2110a);
            return nativeGetPageWidthPixel;
        }
    }

    public final ArrayList f(c cVar) {
        ArrayList arrayList;
        synchronized (f2109d) {
            arrayList = new ArrayList();
            Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(cVar.f2181a, (Long) null);
            if (nativeGetFirstChildBookmark != null) {
                i(arrayList, cVar, nativeGetFirstChildBookmark.longValue());
            }
        }
        return arrayList;
    }

    public final c g(ParcelFileDescriptor parcelFileDescriptor, String str) {
        c cVar = new c();
        cVar.f2182b = parcelFileDescriptor;
        synchronized (f2109d) {
            int i3 = -1;
            try {
                if (f2108c == null) {
                    Field declaredField = f2107b.getDeclaredField("descriptor");
                    f2108c = declaredField;
                    declaredField.setAccessible(true);
                }
                i3 = f2108c.getInt(parcelFileDescriptor.getFileDescriptor());
            } catch (NoSuchFieldException e6) {
                e = e6;
                e.printStackTrace();
                cVar.f2181a = nativeOpenDocument(i3, str);
                return cVar;
            } catch (IllegalAccessException e7) {
                e = e7;
                e.printStackTrace();
                cVar.f2181a = nativeOpenDocument(i3, str);
                return cVar;
            }
            cVar.f2181a = nativeOpenDocument(i3, str);
        }
        return cVar;
    }

    public final void h(c cVar, int i3) {
        synchronized (f2109d) {
            cVar.f2183c.put(Integer.valueOf(i3), Long.valueOf(nativeLoadPage(cVar.f2181a, i3)));
        }
    }

    public final void i(ArrayList arrayList, c cVar, long j6) {
        a aVar = new a();
        nativeGetBookmarkTitle(j6);
        nativeGetBookmarkDestIndex(cVar.f2181a, j6);
        arrayList.add(aVar);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(cVar.f2181a, Long.valueOf(j6));
        if (nativeGetFirstChildBookmark != null) {
            i(aVar.f2180a, cVar, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(cVar.f2181a, j6);
        if (nativeGetSiblingBookmark != null) {
            i(arrayList, cVar, nativeGetSiblingBookmark.longValue());
        }
    }

    public final void j(c cVar, Bitmap bitmap, int i3, int i6, int i7, int i8, int i9, boolean z5) {
        String str;
        String str2;
        synchronized (f2109d) {
            try {
                try {
                    nativeRenderPageBitmap(((Long) cVar.f2183c.getOrDefault(Integer.valueOf(i3), (Object) null)).longValue(), bitmap, this.f2110a, i6, i7, i8, i9, z5);
                } catch (NullPointerException e6) {
                    e = e6;
                } catch (Exception e7) {
                    e = e7;
                    str = "com.shockwave.pdfium.PdfiumCore";
                    str2 = "Exception throw from native";
                    try {
                        Log.e(str, str2);
                        e.printStackTrace();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (NullPointerException e8) {
                e = e8;
                str = "com.shockwave.pdfium.PdfiumCore";
                str2 = "mContext may be null";
                Log.e(str, str2);
                e.printStackTrace();
            } catch (Exception e9) {
                e = e9;
                str = "com.shockwave.pdfium.PdfiumCore";
                str2 = "Exception throw from native";
                Log.e(str, str2);
                e.printStackTrace();
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
