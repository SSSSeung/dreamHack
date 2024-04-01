package androidx.lifecycle;

public enum l {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;
    
    public static final j Companion = null;

    /* access modifiers changed from: public */
    static {
        Companion = new j();
    }

    /* access modifiers changed from: public */
    l() {
    }

    public final m a() {
        switch (k.f1367a[ordinal()]) {
            case 1:
            case 2:
                return m.f1372f;
            case 3:
            case 4:
                return m.f1373g;
            case 5:
                return m.f1374h;
            case 6:
                return m.f1370d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
