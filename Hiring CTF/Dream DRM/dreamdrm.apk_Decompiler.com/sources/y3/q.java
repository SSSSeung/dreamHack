package y3;

import c4.a;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import v3.a0;
import v3.n;
import w3.b;

public final class q extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5885a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5886b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5887c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5888d;

    public q(Class cls) {
        this.f5885a = 1;
        this.f5886b = new HashMap();
        this.f5887c = new HashMap();
        this.f5888d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new t(cls))) {
                Enum enumR = (Enum) field.get((Object) null);
                String name = enumR.name();
                String str = enumR.toString();
                b bVar = (b) field.getAnnotation(b.class);
                Object obj = this.f5886b;
                if (bVar != null) {
                    name = bVar.value();
                    for (String put : bVar.alternate()) {
                        ((Map) obj).put(put, enumR);
                    }
                }
                ((Map) obj).put(name, enumR);
                ((Map) this.f5887c).put(str, enumR);
                ((Map) this.f5888d).put(enumR, name);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }

    public final Object b(a aVar) {
        int i3 = this.f5885a;
        Object obj = this.f5887c;
        switch (i3) {
            case 0:
                return ((a0) obj).b(aVar);
            default:
                if (aVar.Q() == 9) {
                    aVar.M();
                    return null;
                }
                String O = aVar.O();
                Enum enumR = (Enum) ((Map) this.f5886b).get(O);
                return enumR == null ? (Enum) ((Map) obj).get(O) : enumR;
        }
    }

    public q(n nVar, a0 a0Var, Type type) {
        this.f5885a = 0;
        this.f5886b = nVar;
        this.f5887c = a0Var;
        this.f5888d = type;
    }
}
