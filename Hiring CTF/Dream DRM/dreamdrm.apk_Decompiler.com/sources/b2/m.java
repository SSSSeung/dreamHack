package b2;

import android.graphics.Bitmap;
import r2.l;

public final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public final c f1570a;

    /* renamed from: b  reason: collision with root package name */
    public int f1571b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap.Config f1572c;

    public m(c cVar) {
        this.f1570a = cVar;
    }

    public final void a() {
        this.f1570a.f(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1571b == mVar.f1571b && l.a(this.f1572c, mVar.f1572c);
    }

    public final int hashCode() {
        int i3 = this.f1571b * 31;
        Bitmap.Config config = this.f1572c;
        return i3 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return n.e(this.f1571b, this.f1572c);
    }
}
