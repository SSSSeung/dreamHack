package x3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import v3.q;

public final class f implements q {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5718d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Type f5719e;

    public /* synthetic */ f(Type type, int i3) {
        this.f5718d = i3;
        this.f5719e = type;
    }

    public final Object j() {
        int i3 = this.f5718d;
        Type type = this.f5719e;
        switch (i3) {
            case 0:
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new q("Invalid EnumSet type: " + type.toString());
                }
                throw new q("Invalid EnumSet type: " + type.toString());
            default:
                if (type instanceof ParameterizedType) {
                    Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return new EnumMap((Class) type3);
                    }
                    throw new q("Invalid EnumMap type: " + type.toString());
                }
                throw new q("Invalid EnumMap type: " + type.toString());
        }
    }
}
