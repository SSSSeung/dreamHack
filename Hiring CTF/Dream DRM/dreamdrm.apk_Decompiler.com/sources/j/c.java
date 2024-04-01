package j;

import java.util.Map;

public final class c implements Map.Entry {

    /* renamed from: d  reason: collision with root package name */
    public final Object f3631d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3632e;

    /* renamed from: f  reason: collision with root package name */
    public c f3633f;

    /* renamed from: g  reason: collision with root package name */
    public c f3634g;

    public c(Object obj, Object obj2) {
        this.f3631d = obj;
        this.f3632e = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3631d.equals(cVar.f3631d) && this.f3632e.equals(cVar.f3632e);
    }

    public final Object getKey() {
        return this.f3631d;
    }

    public final Object getValue() {
        return this.f3632e;
    }

    public final int hashCode() {
        return this.f3631d.hashCode() ^ this.f3632e.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3631d + "=" + this.f3632e;
    }
}
