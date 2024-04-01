package u0;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.e;
import k.j;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5250a = new e(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f5251b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5252c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final j f5253d = new j();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5251b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u0.e a(java.lang.String r7, android.content.Context r8, androidx.appcompat.widget.r r9, int r10) {
        /*
            k.e r0 = f5250a
            java.lang.Object r1 = r0.a(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            u0.e r7 = new u0.e
            r7.<init>((android.graphics.Typeface) r1)
            return r7
        L_0x0010:
            e.h r9 = h5.l.g(r8, r9)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.f2375d
            r2 = 1
            r3 = -3
            java.lang.Object r9 = r9.f2376e
            if (r1 == 0) goto L_0x0021
            if (r1 == r2) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            r1 = -2
            goto L_0x0040
        L_0x0021:
            r1 = r9
            u0.g[] r1 = (u0.g[]) r1
            if (r1 == 0) goto L_0x003f
            int r4 = r1.length
            if (r4 != 0) goto L_0x002a
            goto L_0x003f
        L_0x002a:
            int r2 = r1.length
            r4 = 0
            r5 = r4
        L_0x002d:
            if (r5 >= r2) goto L_0x003e
            r6 = r1[r5]
            int r6 = r6.f5258e
            if (r6 == 0) goto L_0x003b
            if (r6 >= 0) goto L_0x0039
        L_0x0037:
            r1 = r3
            goto L_0x0040
        L_0x0039:
            r1 = r6
            goto L_0x0040
        L_0x003b:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x003e:
            r2 = r4
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 == 0) goto L_0x0048
            u0.e r7 = new u0.e
            r7.<init>((int) r1)
            return r7
        L_0x0048:
            u0.g[] r9 = (u0.g[]) r9
            e.n0 r1 = q0.g.f4876a
            android.graphics.Typeface r8 = r1.z(r8, r9, r10)
            if (r8 == 0) goto L_0x005b
            r0.b(r7, r8)
            u0.e r7 = new u0.e
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            u0.e r7 = new u0.e
            r7.<init>((int) r3)
            return r7
        L_0x0061:
            u0.e r7 = new u0.e
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.f.a(java.lang.String, android.content.Context, androidx.appcompat.widget.r, int):u0.e");
    }
}
