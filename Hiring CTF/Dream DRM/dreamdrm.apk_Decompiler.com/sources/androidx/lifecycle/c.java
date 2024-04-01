package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f1346c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1347a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1348b = new HashMap();

    public static void c(HashMap hashMap, b bVar, l lVar, Class cls) {
        l lVar2 = (l) hashMap.get(bVar);
        if (lVar2 != null && lVar != lVar2) {
            Method method = bVar.f1345b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
        } else if (lVar2 == null) {
            hashMap.put(bVar, lVar);
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1343b);
        }
        for (Class b6 : cls.getInterfaces()) {
            for (Map.Entry entry : b(b6).f1343b.entrySet()) {
                c(hashMap, (b) entry.getKey(), (l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else if (r.class.isAssignableFrom(parameterTypes[0])) {
                    i3 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                l value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == l.ON_ANY) {
                        i3 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i3, method), value, cls);
                    z5 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1347a.put(cls, aVar);
        this.f1348b.put(cls, Boolean.valueOf(z5));
        return aVar;
    }

    public final a b(Class cls) {
        a aVar = (a) this.f1347a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }
}
