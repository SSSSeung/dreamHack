package e;

import android.content.Context;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f2401d;

    public /* synthetic */ n(Context context) {
        this.f2401d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r5 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L_0x0084
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r7.f2401d
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L_0x0084
            boolean r3 = t0.b.a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L_0x0059
            k.c r3 = e.q.f2416j
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r3.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e.q r5 = (e.q) r5
            if (r5 == 0) goto L_0x0028
            e.e0 r5 = (e.e0) r5
            android.content.Context r5 = r5.f2333n
            if (r5 == 0) goto L_0x0028
            java.lang.Object r3 = r5.getSystemService(r4)
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r3 == 0) goto L_0x005e
            android.os.LocaleList r3 = e.p.a(r3)
            t0.g r5 = new t0.g
            t0.i r6 = new t0.i
            r6.<init>(r3)
            r5.<init>(r6)
            goto L_0x0060
        L_0x0059:
            t0.g r5 = e.q.f2412f
            if (r5 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            t0.g r5 = t0.g.f5086b
        L_0x0060:
            t0.h r3 = r5.f5087a
            t0.i r3 = (t0.i) r3
            android.os.LocaleList r3 = r3.f5088a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x007d
            java.lang.String r3 = com.bumptech.glide.c.C(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L_0x007d
            android.os.LocaleList r3 = e.o.a(r3)
            e.p.b(r4, r3)
        L_0x007d:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L_0x0084:
            e.q.f2415i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.run():void");
    }
}
