package kotlinx.coroutines.internal;

import w4.s0;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f4001a;

    /* JADX WARNING: type inference failed for: r0v7, types: [u4.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.b();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006a */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = kotlinx.coroutines.internal.s.f4004a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean.parseBoolean(r0)
        L_0x0010:
            java.util.Iterator r0 = a2.m.l()     // Catch:{ all -> 0x007a }
            java.lang.String r2 = "<this>"
            b1.o.m(r0, r2)     // Catch:{ all -> 0x007a }
            x0.y0 r2 = new x0.y0     // Catch:{ all -> 0x007a }
            r3 = 3
            r2.<init>(r3, r0)     // Catch:{ all -> 0x007a }
            boolean r0 = r2 instanceof u4.a     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            u4.a r0 = new u4.a     // Catch:{ all -> 0x007a }
            r0.<init>(r2)     // Catch:{ all -> 0x007a }
            r2 = r0
        L_0x002a:
            java.util.List r0 = u4.h.i0(r2)     // Catch:{ all -> 0x007a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x007a }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007a }
            if (r3 != 0) goto L_0x003a
            r3 = r1
            goto L_0x0061
        L_0x003a:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007a }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 != 0) goto L_0x0045
            goto L_0x0061
        L_0x0045:
            r4 = r3
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4     // Catch:{ all -> 0x007a }
            int r4 = r4.a()     // Catch:{ all -> 0x007a }
        L_0x004c:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x007a }
            r6 = r5
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.l) r6     // Catch:{ all -> 0x007a }
            int r6 = r6.a()     // Catch:{ all -> 0x007a }
            if (r4 >= r6) goto L_0x005b
            r3 = r5
            r4 = r6
        L_0x005b:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x007a }
            if (r5 != 0) goto L_0x004c
        L_0x0061:
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.l) r3     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x0072
            w4.s0 r1 = r3.c(r0)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r3.b()     // Catch:{ all -> 0x007a }
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            f4001a = r1
            return
        L_0x0072:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.<clinit>():void");
    }
}
