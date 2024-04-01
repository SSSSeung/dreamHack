package p;

import androidx.appcompat.widget.a0;
import androidx.fragment.app.l;
import b1.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import x0.f;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f4374a = new a0(2);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4375b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final f f4376c = new f();

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f4377d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference f4378e;

    static {
        e eVar = e.f4364h;
        new ArrayList();
        b bVar = new b();
        eVar.b();
        AtomicReference atomicReference = new AtomicReference(bVar);
        f4378e = atomicReference;
        Object obj = atomicReference.get();
        o.l(obj, "currentGlobalSnapshot.get()");
        c cVar = (c) obj;
    }

    public static final l a(l lVar) {
        l c6;
        o.m(lVar, "r");
        c b6 = b();
        l c7 = c(lVar, b6.f4357b, b6.f4356a);
        if (c7 != null) {
            return c7;
        }
        synchronized (f4375b) {
            c b7 = b();
            c6 = c(lVar, b7.f4357b, b7.f4356a);
        }
        if (c6 != null) {
            return c6;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: p.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p.c b() {
        /*
            androidx.appcompat.widget.a0 r0 = f4374a
            java.lang.Object r0 = r0.f503e
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r0 = r0.get()
            n.b r0 = (n.b) r0
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            int r3 = r0.f4210a
            r4 = -1
            int r3 = r3 + r4
            if (r3 == r4) goto L_0x0045
            long[] r5 = r0.f4211b
            r6 = 0
            if (r3 == 0) goto L_0x003a
        L_0x001f:
            if (r6 > r3) goto L_0x0036
            int r4 = r6 + r3
            int r4 = r4 >>> 1
            r7 = r5[r4]
            long r7 = r7 - r1
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0031
            int r6 = r4 + 1
            goto L_0x001f
        L_0x0031:
            if (r7 <= 0) goto L_0x0045
            int r3 = r4 + -1
            goto L_0x001f
        L_0x0036:
            int r6 = r6 + 1
            int r4 = -r6
            goto L_0x0045
        L_0x003a:
            r7 = r5[r6]
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0042
            r4 = r6
            goto L_0x0045
        L_0x0042:
            if (r1 <= 0) goto L_0x0045
            r4 = -2
        L_0x0045:
            if (r4 < 0) goto L_0x004c
            java.lang.Object[] r0 = r0.f4212c
            r0 = r0[r4]
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            p.c r0 = (p.c) r0
            if (r0 != 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicReference r0 = f4378e
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "currentGlobalSnapshot.get()"
            b1.o.l(r0, r1)
            p.c r0 = (p.c) r0
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.b():p.c");
    }

    public static final l c(l lVar, int i3, e eVar) {
        l lVar2 = null;
        while (lVar != null) {
            int i6 = lVar.f1169a;
            if ((i6 != 0 && i6 <= i3 && !eVar.a(i6)) && (lVar2 == null || lVar2.f1169a < lVar.f1169a)) {
                lVar2 = lVar;
            }
            lVar.getClass();
            lVar = null;
        }
        if (lVar2 != null) {
            return lVar2;
        }
        return null;
    }
}
