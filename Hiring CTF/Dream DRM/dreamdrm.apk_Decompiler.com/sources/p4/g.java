package p4;

import b1.o;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4863a;

    public g(Class cls) {
        o.m(cls, "jClass");
        this.f4863a = cls;
    }

    public final Class a() {
        return this.f4863a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (o.c(this.f4863a, ((g) obj).f4863a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4863a.hashCode();
    }

    public final String toString() {
        return this.f4863a.toString() + " (Kotlin reflection is not available)";
    }
}
