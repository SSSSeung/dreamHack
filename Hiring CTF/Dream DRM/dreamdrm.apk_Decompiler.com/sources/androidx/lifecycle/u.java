package androidx.lifecycle;

import a2.m;
import b1.o;
import b1.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import v4.i;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1386a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1387b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            o.l(newInstance, "{\n            constructo…tance(`object`)\n        }");
            m.r(newInstance);
            throw null;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        List list;
        boolean z5;
        HashMap hashMap = f1386a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                o.l(name, "fullPackage");
                if (!(name.length() == 0)) {
                    o.l(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    o.l(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                o.l(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = i.g0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (!(name.length() == 0)) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f1387b;
            if (constructor != null) {
                list = v.D(constructor);
            } else {
                c cVar = c.f1346c;
                HashMap hashMap3 = cVar.f1348b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z5 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z5 = false;
                                break;
                            } else if (((z) declaredMethods[i6].getAnnotation(z.class)) != null) {
                                cVar.a(cls, declaredMethods);
                                z5 = true;
                                break;
                            } else {
                                i6++;
                            }
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!z5) {
                    Class superclass = cls.getSuperclass();
                    Class<q> cls2 = q.class;
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        o.l(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            o.k(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    o.l(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length2) {
                            Class cls3 = interfaces[i7];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                o.l(cls3, "intrface");
                                if (b(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                o.k(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i7++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
