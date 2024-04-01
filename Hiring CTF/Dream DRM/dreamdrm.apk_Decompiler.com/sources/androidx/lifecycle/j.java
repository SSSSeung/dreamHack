package androidx.lifecycle;

import b1.o;

public final class j {
    public static l a(m mVar) {
        o.m(mVar, "state");
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            return l.ON_CREATE;
        }
        if (ordinal == 2) {
            return l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return l.ON_RESUME;
    }
}
