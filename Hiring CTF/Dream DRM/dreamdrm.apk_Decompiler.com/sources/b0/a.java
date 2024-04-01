package b0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f1482a;

    public a(int i3) {
        this.f1482a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1482a == ((a) obj).f1482a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1482a);
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f1482a + ')';
    }
}
