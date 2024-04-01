package w4;

import i4.h;

public final class t extends RuntimeException {

    /* renamed from: d  reason: collision with root package name */
    public final h f5526d;

    public t(h hVar) {
        this.f5526d = hVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f5526d.toString();
    }
}
