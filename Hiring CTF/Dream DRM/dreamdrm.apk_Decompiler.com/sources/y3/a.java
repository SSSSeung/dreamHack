package y3;

import b1.o;
import b4.b;
import b4.c;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import v3.a0;
import v3.b0;
import v3.n;

public final class a implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5845d;

    public /* synthetic */ a(int i3) {
        this.f5845d = i3;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        Class<Date> cls = Date.class;
        switch (this.f5845d) {
            case 0:
                Type type = typeToken.f2105b;
                boolean z5 = type instanceof GenericArrayType;
                if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(nVar, nVar.b(new TypeToken(genericComponentType)), o.A(genericComponentType));
            case 1:
                if (typeToken.f2104a == cls) {
                    return new e();
                }
                return null;
            case 2:
                Class<? super Enum> cls2 = typeToken.f2104a;
                Class<Enum> cls3 = Enum.class;
                if (!cls3.isAssignableFrom(cls2) || cls2 == cls3) {
                    return null;
                }
                if (!cls2.isEnum()) {
                    cls2 = cls2.getSuperclass();
                }
                return new q(cls2);
            case 3:
                if (typeToken.f2104a == java.sql.Date.class) {
                    return new b4.a();
                }
                return null;
            case 4:
                if (typeToken.f2104a == Time.class) {
                    return new b();
                }
                return null;
            default:
                if (typeToken.f2104a != Timestamp.class) {
                    return null;
                }
                nVar.getClass();
                return new c(nVar.b(new TypeToken(cls)));
        }
    }
}
