package x3;

import b1.o;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

public final class c implements WildcardType, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Type f5713d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f5714e;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z5 = true;
        com.bumptech.glide.c.h(typeArr2.length <= 1);
        com.bumptech.glide.c.h(typeArr.length == 1);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            o.n(typeArr2[0]);
            Class<Object> cls = Object.class;
            com.bumptech.glide.c.h(typeArr[0] != cls ? false : z5);
            this.f5714e = o.g(typeArr2[0]);
            this.f5713d = cls;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        o.n(typeArr[0]);
        this.f5714e = null;
        this.f5713d = o.g(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && o.r(this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        Type type = this.f5714e;
        if (type == null) {
            return o.f1530q;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f5713d};
    }

    public final int hashCode() {
        Type type = this.f5714e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f5713d.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f5714e;
        if (type != null) {
            return "? super " + o.a0(type);
        }
        Class<Object> cls = Object.class;
        Type type2 = this.f5713d;
        if (type2 == cls) {
            return "?";
        }
        return "? extends " + o.a0(type2);
    }
}
