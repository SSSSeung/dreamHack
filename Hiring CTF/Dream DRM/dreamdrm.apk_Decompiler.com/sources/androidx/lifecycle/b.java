package androidx.lifecycle;

import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1344a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f1345b;

    public b(int i3, Method method) {
        this.f1344a = i3;
        this.f1345b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1344a == bVar.f1344a && this.f1345b.getName().equals(bVar.f1345b.getName());
    }

    public final int hashCode() {
        return this.f1345b.getName().hashCode() + (this.f1344a * 31);
    }
}
