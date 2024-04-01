package r2;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Class f4934a;

    /* renamed from: b  reason: collision with root package name */
    public Class f4935b;

    /* renamed from: c  reason: collision with root package name */
    public Class f4936c;

    public j() {
    }

    public j(Class cls, Class cls2, Class cls3) {
        this.f4934a = cls;
        this.f4935b = cls2;
        this.f4936c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4934a.equals(jVar.f4934a) && this.f4935b.equals(jVar.f4935b) && l.a(this.f4936c, jVar.f4936c);
    }

    public final int hashCode() {
        int hashCode = (this.f4935b.hashCode() + (this.f4934a.hashCode() * 31)) * 31;
        Class cls = this.f4936c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f4934a + ", second=" + this.f4935b + '}';
    }
}
