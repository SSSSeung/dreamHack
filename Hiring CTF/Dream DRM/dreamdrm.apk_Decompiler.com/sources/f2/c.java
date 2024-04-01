package f2;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import e2.v;
import java.io.FileNotFoundException;
import y1.a;
import y1.i;

public final class c implements e {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f2640n = {"_data"};

    /* renamed from: d  reason: collision with root package name */
    public final Context f2641d;

    /* renamed from: e  reason: collision with root package name */
    public final v f2642e;

    /* renamed from: f  reason: collision with root package name */
    public final v f2643f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f2644g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2645h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2646i;

    /* renamed from: j  reason: collision with root package name */
    public final i f2647j;

    /* renamed from: k  reason: collision with root package name */
    public final Class f2648k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f2649l;

    /* renamed from: m  reason: collision with root package name */
    public volatile e f2650m;

    public c(Context context, v vVar, v vVar2, Uri uri, int i3, int i6, i iVar, Class cls) {
        this.f2641d = context.getApplicationContext();
        this.f2642e = vVar;
        this.f2643f = vVar2;
        this.f2644g = uri;
        this.f2645h = i3;
        this.f2646i = i6;
        this.f2647j = iVar;
        this.f2648k = cls;
    }

    public final Class a() {
        return this.f2648k;
    }

    public final void b() {
        e eVar = this.f2650m;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final a c() {
        return a.f5800d;
    }

    public final void cancel() {
        this.f2649l = true;
        e eVar = this.f2650m;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final void d(h hVar, d dVar) {
        try {
            e e6 = e();
            if (e6 == null) {
                dVar.h(new IllegalArgumentException("Failed to build fetcher for: " + this.f2644g));
                return;
            }
            this.f2650m = e6;
            if (this.f2649l) {
                cancel();
            } else {
                e6.d(hVar, dVar);
            }
        } catch (FileNotFoundException e7) {
            dVar.h(e7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.data.e e() {
        /*
            r14 = this;
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            r1 = 0
            y1.i r2 = r14.f2647j
            int r3 = r14.f2646i
            int r4 = r14.f2645h
            android.content.Context r5 = r14.f2641d
            if (r0 == 0) goto L_0x0078
            android.net.Uri r0 = r14.f2644g
            java.lang.String r12 = "File path was empty in media store for: "
            java.lang.String r13 = "Failed to media store entry for: "
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x0071 }
            java.lang.String[] r8 = f2640n     // Catch:{ all -> 0x0071 }
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r0
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
            if (r5 == 0) goto L_0x005c
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x006e }
            if (r6 == 0) goto L_0x005c
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x006e }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x006e }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x006e }
            if (r7 != 0) goto L_0x004a
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
            r0.<init>(r6)     // Catch:{ all -> 0x006e }
            r5.close()
            e2.v r5 = r14.f2642e
            e2.u r0 = r5.b(r0, r4, r3, r2)
            goto L_0x0091
        L_0x004a:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r2.<init>(r12)     // Catch:{ all -> 0x006e }
            r2.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
            r1.<init>(r0)     // Catch:{ all -> 0x006e }
            throw r1     // Catch:{ all -> 0x006e }
        L_0x005c:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r2.<init>(r13)     // Catch:{ all -> 0x006e }
            r2.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
            r1.<init>(r0)     // Catch:{ all -> 0x006e }
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            r1 = r5
            goto L_0x0072
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            throw r0
        L_0x0078:
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            int r0 = r5.checkSelfPermission(r0)
            if (r0 != 0) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            android.net.Uri r5 = r14.f2644g
            if (r0 == 0) goto L_0x008b
            android.net.Uri r5 = android.provider.MediaStore.setRequireOriginal(r5)
        L_0x008b:
            e2.v r0 = r14.f2643f
            e2.u r0 = r0.b(r5, r4, r3, r2)
        L_0x0091:
            if (r0 == 0) goto L_0x0095
            com.bumptech.glide.load.data.e r1 = r0.f2546c
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.c.e():com.bumptech.glide.load.data.e");
    }
}
