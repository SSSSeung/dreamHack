package w4;

import b1.o;
import com.bumptech.glide.c;
import f4.b;
import i4.d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.scheduling.h;
import kotlinx.coroutines.scheduling.j;

public abstract class v extends h {

    /* renamed from: f  reason: collision with root package name */
    public int f5528f;

    public v(int i3) {
        super(0, j.f4039f);
        this.f5528f = i3;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract d b();

    public Throwable d(Object obj) {
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar != null) {
            return iVar.f5487a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                o.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            o.k(th);
            c.s(b().f(), new b("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[Catch:{ all -> 0x005b, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[Catch:{ all -> 0x005b, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC, Splitter:B:29:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[SYNTHETIC, Splitter:B:36:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            f4.h r0 = f4.h.f2682a
            androidx.fragment.app.n0 r1 = r13.f4032e
            i4.d r2 = r13.b()     // Catch:{ all -> 0x0082 }
            kotlinx.coroutines.internal.c r2 = (kotlinx.coroutines.internal.c) r2     // Catch:{ all -> 0x0082 }
            i4.d r3 = r2.f3980h     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f3982j     // Catch:{ all -> 0x0082 }
            i4.h r4 = r3.f()     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = b1.o.b0(r4, r2)     // Catch:{ all -> 0x0082 }
            kotlinx.coroutines.internal.r r5 = b1.o.f1523j     // Catch:{ all -> 0x0082 }
            r6 = 0
            if (r2 == r5) goto L_0x0020
            w4.c1 r5 = com.bumptech.glide.c.Q(r3, r4, r2)     // Catch:{ all -> 0x0082 }
            goto L_0x0021
        L_0x0020:
            r5 = r6
        L_0x0021:
            i4.h r7 = r3.f()     // Catch:{ all -> 0x005b }
            java.lang.Object r8 = r13.i()     // Catch:{ all -> 0x005b }
            java.lang.Throwable r9 = r13.d(r8)     // Catch:{ all -> 0x005b }
            if (r9 != 0) goto L_0x0044
            int r10 = r13.f5528f     // Catch:{ all -> 0x005b }
            r11 = 1
            if (r10 == r11) goto L_0x0039
            r12 = 2
            if (r10 != r12) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r11 = 0
        L_0x0039:
            if (r11 == 0) goto L_0x0044
            androidx.compose.ui.platform.e r10 = androidx.compose.ui.platform.e.f897n     // Catch:{ all -> 0x005b }
            i4.f r7 = r7.l(r10)     // Catch:{ all -> 0x005b }
            w4.i0 r7 = (w4.i0) r7     // Catch:{ all -> 0x005b }
            goto L_0x0045
        L_0x0044:
            r7 = r6
        L_0x0045:
            if (r7 == 0) goto L_0x005d
            boolean r10 = r7.b()     // Catch:{ all -> 0x005b }
            if (r10 != 0) goto L_0x005d
            w4.q0 r7 = (w4.q0) r7     // Catch:{ all -> 0x005b }
            java.util.concurrent.CancellationException r7 = r7.v()     // Catch:{ all -> 0x005b }
            r13.a(r8, r7)     // Catch:{ all -> 0x005b }
            f4.d r7 = com.bumptech.glide.c.k(r7)     // Catch:{ all -> 0x005b }
            goto L_0x0068
        L_0x005b:
            r3 = move-exception
            goto L_0x0084
        L_0x005d:
            if (r9 == 0) goto L_0x0064
            f4.d r7 = com.bumptech.glide.c.k(r9)     // Catch:{ all -> 0x005b }
            goto L_0x0068
        L_0x0064:
            java.lang.Object r7 = r13.e(r8)     // Catch:{ all -> 0x005b }
        L_0x0068:
            r3.g(r7)     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0081
            b1.o.U(r4, r2)     // Catch:{ all -> 0x0082 }
            r1.getClass()     // Catch:{ all -> 0x0074 }
            goto L_0x0079
        L_0x0074:
            r0 = move-exception
            f4.d r0 = com.bumptech.glide.c.k(r0)
        L_0x0079:
            java.lang.Throwable r0 = f4.e.a(r0)
            r13.h(r6, r0)
            goto L_0x009b
        L_0x0081:
            throw r6     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r2 = move-exception
            goto L_0x008b
        L_0x0084:
            if (r5 == 0) goto L_0x0087
            throw r6     // Catch:{ all -> 0x0082 }
        L_0x0087:
            b1.o.U(r4, r2)     // Catch:{ all -> 0x0082 }
            throw r3     // Catch:{ all -> 0x0082 }
        L_0x008b:
            r1.getClass()     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x008f:
            r0 = move-exception
            f4.d r0 = com.bumptech.glide.c.k(r0)
        L_0x0094:
            java.lang.Throwable r0 = f4.e.a(r0)
            r13.h(r2, r0)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v.run():void");
    }
}
