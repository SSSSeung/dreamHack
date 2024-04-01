package c5;

import b1.o;
import com.bumptech.glide.c;
import java.util.logging.Level;

public final class e implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f1677d;

    public e(f fVar) {
        this.f1677d = fVar;
    }

    public final void run() {
        a c6;
        long j6;
        while (true) {
            synchronized (this.f1677d) {
                c6 = this.f1677d.c();
            }
            if (c6 != null) {
                c cVar = c6.f1664a;
                o.k(cVar);
                boolean isLoggable = f.f1679i.isLoggable(Level.FINE);
                if (isLoggable) {
                    cVar.f1674e.f1686g.getClass();
                    j6 = System.nanoTime();
                    c.a(c6, cVar, "starting");
                } else {
                    j6 = -1;
                }
                try {
                    f.a(this.f1677d, c6);
                    if (isLoggable) {
                        cVar.f1674e.f1686g.getClass();
                        c.a(c6, cVar, "finished run in ".concat(c.n(System.nanoTime() - j6)));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        cVar.f1674e.f1686g.getClass();
                        c.a(c6, cVar, "failed a run in ".concat(c.n(System.nanoTime() - j6)));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
