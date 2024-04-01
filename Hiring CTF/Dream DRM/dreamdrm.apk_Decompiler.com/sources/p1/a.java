package p1;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f4425a;

    /* renamed from: b  reason: collision with root package name */
    public int f4426b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4427c;

    /* renamed from: d  reason: collision with root package name */
    public int f4428d;

    public a(Object obj, int i3, int i6, int i7) {
        this.f4425a = i3;
        this.f4426b = i6;
        this.f4428d = i7;
        this.f4427c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i3 = this.f4425a;
        if (i3 != aVar.f4425a) {
            return false;
        }
        if (i3 == 8 && Math.abs(this.f4428d - this.f4426b) == 1 && this.f4428d == aVar.f4426b && this.f4426b == aVar.f4428d) {
            return true;
        }
        if (this.f4428d != aVar.f4428d || this.f4426b != aVar.f4426b) {
            return false;
        }
        Object obj2 = this.f4427c;
        Object obj3 = aVar.f4427c;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4425a * 31) + this.f4426b) * 31) + this.f4428d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i3 = this.f4425a;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f4426b);
        sb.append("c:");
        sb.append(this.f4428d);
        sb.append(",p:");
        sb.append(this.f4427c);
        sb.append("]");
        return sb.toString();
    }
}
