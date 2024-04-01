package p0;

import android.content.res.Resources;
import w0.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f4403a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f4404b;

    public l(Resources resources, Resources.Theme theme) {
        this.f4403a = resources;
        this.f4404b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f4403a.equals(lVar.f4403a) && b.a(this.f4404b, lVar.f4404b);
    }

    public final int hashCode() {
        return b.b(this.f4403a, this.f4404b);
    }
}
