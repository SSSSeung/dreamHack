package i2;

import a2.f0;
import android.content.Context;
import android.net.Uri;
import h2.d;
import x1.a;
import x1.e;
import y1.i;
import y1.k;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3599a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3600b;

    public c(Context context) {
        this.f3600b = context.getApplicationContext();
    }

    public final f0 a(Object obj, int i3, int i6, i iVar) {
        switch (this.f3599a) {
            case 0:
                return c((Uri) obj);
            default:
                return d.e(((e) ((a) obj)).b(), (b2.d) this.f3600b);
        }
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f3599a) {
            case 0:
                return ((Uri) obj).getScheme().equals("android.resource");
            default:
                a aVar = (a) obj;
                return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a2.f0 c(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            java.lang.Object r1 = r7.f3600b
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = r0.equals(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0015
            goto L_0x0027
        L_0x0015:
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r0 = r1.createPackageContext(r0, r4)     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0028
        L_0x001c:
            r1 = move-exception
            java.lang.String r3 = r2.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00bb
        L_0x0027:
            r0 = r2
        L_0x0028:
            java.util.List r1 = r8.getPathSegments()
            int r3 = r1.size()
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L_0x0073
            java.util.List r1 = r8.getPathSegments()
            java.lang.String r3 = r8.getAuthority()
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r6 = r0.getResources()
            int r3 = r6.getIdentifier(r1, r5, r3)
            if (r3 != 0) goto L_0x005c
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r6 = "android"
            int r3 = r3.getIdentifier(r1, r5, r6)
        L_0x005c:
            if (r3 == 0) goto L_0x005f
            goto L_0x0089
        L_0x005f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find resource id for: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0073:
            int r1 = r1.size()
            java.lang.String r3 = "Unrecognized Uri format: "
            if (r1 != r6) goto L_0x00a9
            java.util.List r1 = r8.getPathSegments()
            java.lang.Object r1 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0096 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0096 }
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0096 }
        L_0x0089:
            r8 = 0
            android.graphics.drawable.Drawable r0 = w4.p.o(r2, r0, r3, r8)
            if (r0 == 0) goto L_0x0095
            i2.b r8 = new i2.b
            r8.<init>(r0, r4)
        L_0x0095:
            return r8
        L_0x0096:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        L_0x00a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x00bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to obtain context or unrecognized Uri format for: "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.c(android.net.Uri):a2.f0");
    }

    public c(b2.d dVar) {
        this.f3600b = dVar;
    }
}
