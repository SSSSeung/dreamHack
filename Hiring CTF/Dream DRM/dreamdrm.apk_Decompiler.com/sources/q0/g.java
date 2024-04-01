package q0;

import android.content.res.Resources;
import android.os.Build;
import e.n0;
import k.e;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f4876a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f4877b = new e(16);

    static {
        int i3 = Build.VERSION.SDK_INT;
        f4876a = i3 >= 29 ? new l() : i3 >= 28 ? new j() : new i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r3.equals(r5) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r15, p0.e r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, b1.v r22, boolean r23) {
        /*
            r0 = r15
            r1 = r16
            r7 = r21
            r2 = r22
            boolean r3 = r1 instanceof p0.h
            r8 = -3
            if (r3 == 0) goto L_0x017b
            p0.h r1 = (p0.h) r1
            java.lang.String r3 = r1.f4399d
            r9 = 0
            r4 = 0
            if (r3 == 0) goto L_0x002e
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r4)
            if (r3 == 0) goto L_0x002e
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = r9
        L_0x002f:
            if (r3 == 0) goto L_0x0037
            if (r2 == 0) goto L_0x0036
            r2.e(r3)
        L_0x0036:
            return r3
        L_0x0037:
            r10 = 1
            if (r23 == 0) goto L_0x003f
            int r3 = r1.f4398c
            if (r3 != 0) goto L_0x0043
            goto L_0x0041
        L_0x003f:
            if (r2 != 0) goto L_0x0043
        L_0x0041:
            r3 = r10
            goto L_0x0044
        L_0x0043:
            r3 = r4
        L_0x0044:
            r5 = -1
            if (r23 == 0) goto L_0x004b
            int r6 = r1.f4397b
            r11 = r6
            goto L_0x004c
        L_0x004b:
            r11 = r5
        L_0x004c:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r6.<init>(r12)
            e.n0 r12 = new e.n0
            r12.<init>((b1.v) r2)
            androidx.appcompat.widget.r r13 = r1.f4396a
            androidx.appcompat.widget.a0 r14 = new androidx.appcompat.widget.a0
            r1 = 6
            r14.<init>((java.lang.Object) r12, (int) r1, (java.lang.Object) r6)
            if (r3 == 0) goto L_0x00eb
            k.e r1 = u0.f.f5250a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r13.f753g
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = r1.toString()
            k.e r1 = u0.f.f5250a
            java.lang.Object r1 = r1.a(r2)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x009a
            java.lang.Object r0 = r14.f503e
            e.n0 r0 = (e.n0) r0
            java.lang.Object r2 = r14.f504f
            android.os.Handler r2 = (android.os.Handler) r2
            u0.a r3 = new u0.a
            r3.<init>(r14, r0, r1, r4)
            r2.post(r3)
            goto L_0x011f
        L_0x009a:
            if (r11 != r5) goto L_0x00a7
            u0.e r0 = u0.f.a(r2, r15, r13, r7)
            r14.x(r0)
            android.graphics.Typeface r9 = r0.f5248a
            goto L_0x0175
        L_0x00a7:
            u0.c r12 = new u0.c
            r6 = 0
            r1 = r12
            r3 = r15
            r4 = r13
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = u0.f.f5251b     // Catch:{ InterruptedException -> 0x00d9 }
            java.util.concurrent.Future r0 = r0.submit(r12)     // Catch:{ InterruptedException -> 0x00d9 }
            long r1 = (long) r11
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00d0, TimeoutException -> 0x00c8 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d2, InterruptedException -> 0x00d0, TimeoutException -> 0x00c8 }
            u0.e r0 = (u0.e) r0     // Catch:{ InterruptedException -> 0x00d9 }
            r14.x(r0)     // Catch:{ InterruptedException -> 0x00d9 }
            android.graphics.Typeface r9 = r0.f5248a     // Catch:{ InterruptedException -> 0x00d9 }
            goto L_0x0175
        L_0x00c8:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00d9 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00d9 }
            throw r0     // Catch:{ InterruptedException -> 0x00d9 }
        L_0x00d0:
            r0 = move-exception
            throw r0     // Catch:{ InterruptedException -> 0x00d9 }
        L_0x00d2:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00d9 }
            throw r1     // Catch:{ InterruptedException -> 0x00d9 }
        L_0x00d9:
            java.lang.Object r0 = r14.f503e
            e.n0 r0 = (e.n0) r0
            java.lang.Object r1 = r14.f504f
            android.os.Handler r1 = (android.os.Handler) r1
            a.d r2 = new a.d
            r2.<init>(r8, r10, r14, r0)
            r1.post(r2)
            goto L_0x0175
        L_0x00eb:
            k.e r1 = u0.f.f5250a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r13.f753g
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r8 = r1.toString()
            k.e r1 = u0.f.f5250a
            java.lang.Object r1 = r1.a(r8)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0121
            java.lang.Object r0 = r14.f503e
            e.n0 r0 = (e.n0) r0
            java.lang.Object r2 = r14.f504f
            android.os.Handler r2 = (android.os.Handler) r2
            u0.a r3 = new u0.a
            r3.<init>(r14, r0, r1, r4)
            r2.post(r3)
        L_0x011f:
            r9 = r1
            goto L_0x0175
        L_0x0121:
            u0.d r1 = new u0.d
            r1.<init>(r4, r14)
            java.lang.Object r3 = u0.f.f5252c
            monitor-enter(r3)
            k.j r2 = u0.f.f5253d     // Catch:{ all -> 0x0178 }
            java.lang.Object r4 = r2.getOrDefault(r8, r9)     // Catch:{ all -> 0x0178 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x0138
            r4.add(r1)     // Catch:{ all -> 0x0178 }
            monitor-exit(r3)     // Catch:{ all -> 0x0178 }
            goto L_0x0175
        L_0x0138:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0178 }
            r4.<init>()     // Catch:{ all -> 0x0178 }
            r4.add(r1)     // Catch:{ all -> 0x0178 }
            r2.put(r8, r4)     // Catch:{ all -> 0x0178 }
            monitor-exit(r3)     // Catch:{ all -> 0x0178 }
            u0.c r11 = new u0.c
            r6 = 1
            r1 = r11
            r2 = r8
            r3 = r15
            r4 = r13
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = u0.f.f5251b
            u0.d r1 = new u0.d
            r1.<init>(r10, r8)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x0167
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x016c
        L_0x0167:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x016c:
            u0.a r3 = new u0.a
            r4 = 2
            r3.<init>(r2, r11, r1, r4)
            r0.execute(r3)
        L_0x0175:
            r4 = r17
            goto L_0x0190
        L_0x0178:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0178 }
            throw r0
        L_0x017b:
            e.n0 r3 = f4876a
            p0.f r1 = (p0.f) r1
            r4 = r17
            android.graphics.Typeface r9 = r3.y(r15, r1, r4, r7)
            if (r2 == 0) goto L_0x0190
            if (r9 == 0) goto L_0x018d
            r2.e(r9)
            goto L_0x0190
        L_0x018d:
            r2.c(r8)
        L_0x0190:
            if (r9 == 0) goto L_0x019b
            k.e r0 = f4877b
            java.lang.String r1 = b(r17, r18, r19, r20, r21)
            r0.b(r1, r9)
        L_0x019b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.g.a(android.content.Context, p0.e, android.content.res.Resources, int, java.lang.String, int, int, b1.v, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i6, int i7) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i6 + '-' + i3 + '-' + i7;
    }
}
