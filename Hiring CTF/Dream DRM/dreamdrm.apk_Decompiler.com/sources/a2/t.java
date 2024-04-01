package a2;

import java.util.concurrent.Executor;
import n2.f;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final f f145a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f146b;

    public t(f fVar, Executor executor) {
        this.f145a = fVar;
        this.f146b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f145a.equals(((t) obj).f145a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f145a.hashCode();
    }
}
