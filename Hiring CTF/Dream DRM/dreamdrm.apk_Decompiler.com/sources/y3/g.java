package y3;

import b1.o;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import l2.l;
import v3.a0;
import v3.b0;
import v3.n;

public final class g implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public final l f5859d;

    public g(l lVar) {
        this.f5859d = lVar;
    }

    public final a0 a(n nVar, TypeToken typeToken) {
        Type[] typeArr;
        Type type = typeToken.f2105b;
        Class<Map> cls = Map.class;
        Class cls2 = typeToken.f2104a;
        if (!cls.isAssignableFrom(cls2)) {
            return null;
        }
        if (type == Properties.class) {
            Class<String> cls3 = String.class;
            typeArr = new Type[]{cls3, cls3};
        } else {
            Type B = o.B(type, cls2, cls);
            if (B instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) B).getActualTypeArguments();
            } else {
                Class<Object> cls4 = Object.class;
                typeArr = new Type[]{cls4, cls4};
            }
        }
        Type type2 = typeArr[0];
        return new f(this, nVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? u.f5899c : nVar.b(new TypeToken(type2)), typeArr[1], nVar.b(new TypeToken(typeArr[1])), this.f5859d.d(typeToken));
    }
}
