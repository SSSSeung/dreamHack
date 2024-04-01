package b2;

import android.graphics.Bitmap;
import androidx.appcompat.widget.a0;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final c f1540a;

    /* renamed from: b  reason: collision with root package name */
    public int f1541b;

    /* renamed from: c  reason: collision with root package name */
    public int f1542c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap.Config f1543d;

    public b(c cVar) {
        this.f1540a = cVar;
    }

    public final void a() {
        this.f1540a.f(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1541b == bVar.f1541b && this.f1542c == bVar.f1542c && this.f1543d == bVar.f1543d;
    }

    public final int hashCode() {
        int i3 = ((this.f1541b * 31) + this.f1542c) * 31;
        Bitmap.Config config = this.f1543d;
        return i3 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return a0.o(this.f1541b, this.f1542c, this.f1543d);
    }
}
