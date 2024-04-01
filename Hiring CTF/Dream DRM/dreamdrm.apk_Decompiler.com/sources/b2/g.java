package b2;

public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final c f1550a;

    /* renamed from: b  reason: collision with root package name */
    public int f1551b;

    /* renamed from: c  reason: collision with root package name */
    public Class f1552c;

    public g(c cVar) {
        this.f1550a = cVar;
    }

    public final void a() {
        this.f1550a.f(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1551b == gVar.f1551b && this.f1552c == gVar.f1552c;
    }

    public final int hashCode() {
        int i3 = this.f1551b * 31;
        Class cls = this.f1552c;
        return i3 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f1551b + "array=" + this.f1552c + '}';
    }
}
