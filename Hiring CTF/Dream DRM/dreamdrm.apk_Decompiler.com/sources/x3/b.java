package x3;

import b1.o;
import com.bumptech.glide.c;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class b implements ParameterizedType, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final Type f5710d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f5711e;

    /* renamed from: f  reason: collision with root package name */
    public final Type[] f5712f;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z5 = true;
            boolean z6 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z6) {
                z5 = false;
            }
            c.h(z5);
        }
        this.f5710d = type == null ? null : o.g(type);
        this.f5711e = o.g(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f5712f = typeArr2;
        int length = typeArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            Objects.requireNonNull(this.f5712f[i3]);
            o.n(this.f5712f[i3]);
            Type[] typeArr3 = this.f5712f;
            typeArr3[i3] = o.g(typeArr3[i3]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && o.r(this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f5712f.clone();
    }

    public final Type getOwnerType() {
        return this.f5710d;
    }

    public final Type getRawType() {
        return this.f5711e;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f5712f) ^ this.f5711e.hashCode();
        Type type = this.f5710d;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f5712f;
        int length = typeArr.length;
        Type type = this.f5711e;
        if (length == 0) {
            return o.a0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(o.a0(type));
        sb.append("<");
        sb.append(o.a0(typeArr[0]));
        for (int i3 = 1; i3 < length; i3++) {
            sb.append(", ");
            sb.append(o.a0(typeArr[i3]));
        }
        sb.append(">");
        return sb.toString();
    }
}
