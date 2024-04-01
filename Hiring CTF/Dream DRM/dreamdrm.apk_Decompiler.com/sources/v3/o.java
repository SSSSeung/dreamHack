package v3;

import java.util.ArrayList;
import java.util.Iterator;

public final class o extends p implements Iterable {

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f5402d = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f5402d.equals(this.f5402d));
    }

    public final int hashCode() {
        return this.f5402d.hashCode();
    }

    public final Iterator iterator() {
        return this.f5402d.iterator();
    }
}
