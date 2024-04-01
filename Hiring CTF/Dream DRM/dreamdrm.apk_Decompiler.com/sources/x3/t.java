package x3;

import java.lang.reflect.AccessibleObject;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f5758a;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    static {
        /*
            int r0 = x3.j.f5730a
            r1 = 9
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x000a
            r0 = r2
            goto L_0x000b
        L_0x000a:
            r0 = r3
        L_0x000b:
            if (r0 == 0) goto L_0x0021
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r3] = r4     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0021 }
            x3.r r1 = new x3.r     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 != 0) goto L_0x0029
            x3.s r1 = new x3.s
            r1.<init>()
        L_0x0029:
            f5758a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.t.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
