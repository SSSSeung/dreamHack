package w4;

import b1.o;
import com.bumptech.glide.c;
import i4.h;
import java.lang.Thread;
import java.util.List;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final List f5494a;

    /* JADX WARNING: type inference failed for: r0v3, types: [u4.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.util.Iterator r0 = a2.m.p()
            java.lang.String r1 = "<this>"
            b1.o.m(r0, r1)
            x0.y0 r1 = new x0.y0
            r2 = 3
            r1.<init>(r2, r0)
            boolean r0 = r1 instanceof u4.a
            if (r0 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            u4.a r0 = new u4.a
            r0.<init>(r1)
            r1 = r0
        L_0x001a:
            java.util.List r0 = u4.h.i0(r1)
            f5494a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.n.<clinit>():void");
    }

    public static final void a(h hVar, Throwable th) {
        Throwable th2;
        for (m i3 : f5494a) {
            try {
                i3.i(hVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    o.a(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            o.a(th, new t(hVar));
        } catch (Throwable th4) {
            c.k(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
