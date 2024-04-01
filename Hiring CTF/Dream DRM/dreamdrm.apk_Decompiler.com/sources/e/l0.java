package e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class l0 implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public final Object f2396d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f2397e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final Executor f2398f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f2399g;

    public l0(m0 m0Var) {
        this.f2398f = m0Var;
    }

    public final void a() {
        synchronized (this.f2396d) {
            Runnable runnable = (Runnable) this.f2397e.poll();
            this.f2399g = runnable;
            if (runnable != null) {
                this.f2398f.execute(runnable);
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f2396d) {
            this.f2397e.add(new k0(this, 0, runnable));
            if (this.f2399g == null) {
                a();
            }
        }
    }
}
