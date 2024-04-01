package com.google.gson.reflect;

import b1.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class TypeToken<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f2104a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f2105b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2106c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Class<TypeToken> cls = TypeToken.class;
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                Type g6 = o.g(parameterizedType.getActualTypeArguments()[0]);
                this.f2105b = g6;
                this.f2104a = o.A(g6);
                this.f2106c = g6.hashCode();
                return;
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (o.r(this.f2105b, ((TypeToken) obj).f2105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2106c;
    }

    public final String toString() {
        return o.a0(this.f2105b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type g6 = o.g(type);
        this.f2105b = g6;
        this.f2104a = o.A(g6);
        this.f2106c = g6.hashCode();
    }
}
