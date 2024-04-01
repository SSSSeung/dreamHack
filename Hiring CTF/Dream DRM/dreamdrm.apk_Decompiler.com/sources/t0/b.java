package t0;

import android.os.Build;

public abstract class b {
    static {
        int i3 = Build.VERSION.SDK_INT;
        a aVar = a.f5081a;
        if (i3 >= 30) {
            aVar.a(30);
        }
        if (i3 >= 30) {
            aVar.a(31);
        }
        if (i3 >= 30) {
            aVar.a(33);
        }
        if (i3 >= 30) {
            aVar.a(1000000);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 >= r1) goto L_0x003d
            r1 = 32
            r3 = 0
            if (r0 < r1) goto L_0x003c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            b1.o.l(r0, r1)
            java.lang.String r1 = "REL"
            boolean r1 = b1.o.c(r1, r0)
            if (r1 == 0) goto L_0x001c
            goto L_0x0038
        L_0x001c:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r4 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            b1.o.l(r0, r4)
            java.lang.String r5 = "Tiramisu"
            java.lang.String r1 = r5.toUpperCase(r1)
            b1.o.l(r1, r4)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.a():boolean");
    }
}
