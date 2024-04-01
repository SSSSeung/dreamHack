package x3;

import b1.o;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class a implements GenericArrayType, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Type f5709d;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f5709d = o.g(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && o.r(this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.f5709d;
    }

    public final int hashCode() {
        return this.f5709d.hashCode();
    }

    public final String toString() {
        return o.a0(this.f5709d) + "[]";
    }
}
