package kotlinx.coroutines.scheduling;

public final class d extends g {

    /* renamed from: g  reason: collision with root package name */
    public static final d f4028g = new d();

    public d() {
        super(j.f4035b, j.f4036c, j.f4037d);
    }

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
