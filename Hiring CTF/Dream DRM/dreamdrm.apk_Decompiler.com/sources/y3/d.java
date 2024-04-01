package y3;

import b1.o;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import l2.l;
import v3.a0;
import v3.b0;
import v3.n;
import w3.a;

public final class d implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5852d;

    /* renamed from: e  reason: collision with root package name */
    public final l f5853e;

    public /* synthetic */ d(l lVar, int i3) {
        this.f5852d = i3;
        this.f5853e = lVar;
    }

    public static a0 b(l lVar, n nVar, TypeToken typeToken, a aVar) {
        a0 a0Var;
        Object j6 = lVar.d(new TypeToken(aVar.value())).j();
        boolean nullSafe = aVar.nullSafe();
        if (j6 instanceof a0) {
            a0Var = (a0) j6;
        } else if (j6 instanceof b0) {
            a0Var = ((b0) j6).a(nVar, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + j6.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return (a0Var == null || !nullSafe) ? a0Var : a0Var.a();
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        int i3 = this.f5852d;
        l lVar = this.f5853e;
        switch (i3) {
            case 0:
                Type type = typeToken.f2105b;
                Class<Collection> cls = Collection.class;
                Class cls2 = typeToken.f2104a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                Type B = o.B(type, cls2, cls);
                Class cls3 = B instanceof ParameterizedType ? ((ParameterizedType) B).getActualTypeArguments()[0] : Object.class;
                return new c(nVar, cls3, nVar.b(new TypeToken(cls3)), lVar.d(typeToken));
            default:
                a aVar = (a) typeToken.f2104a.getAnnotation(a.class);
                if (aVar == null) {
                    return null;
                }
                return b(lVar, nVar, typeToken, aVar);
        }
    }
}
