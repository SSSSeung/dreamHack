package kotlinx.coroutines.scheduling;

import androidx.fragment.app.n0;
import w4.p;

public final class i extends h {

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f4033f;

    public i(Runnable runnable, long j6, n0 n0Var) {
        super(j6, n0Var);
        this.f4033f = runnable;
    }

    public final void run() {
        try {
            this.f4033f.run();
        } finally {
            this.f4032e.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4033f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(p.p(runnable));
        sb.append(", ");
        sb.append(this.f4031d);
        sb.append(", ");
        sb.append(this.f4032e);
        sb.append(']');
        return sb.toString();
    }
}
