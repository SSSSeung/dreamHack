package kotlinx.coroutines.internal;

public abstract class e extends h {
    public final boolean n() {
        return false;
    }

    public final boolean o() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
