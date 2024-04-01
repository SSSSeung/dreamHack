package e2;

import a2.m;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f2532a;

    public p(String str) {
        this.f2532a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f2532a.equals(((p) obj).f2532a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2532a.hashCode();
    }

    public final String toString() {
        return m.j(new StringBuilder("StringHeaderFactory{value='"), this.f2532a, "'}");
    }
}
