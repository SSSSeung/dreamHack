package w4;

import b1.o;
import java.util.concurrent.CancellationException;

public final class j0 extends CancellationException {

    /* renamed from: d  reason: collision with root package name */
    public final transient i0 f5490d;

    public j0(String str, Throwable th, i0 i0Var) {
        super(str);
        this.f5490d = i0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (!o.c(j0Var.getMessage(), getMessage()) || !o.c(j0Var.f5490d, this.f5490d) || !o.c(j0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        o.k(message);
        int hashCode = (this.f5490d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f5490d;
    }
}
