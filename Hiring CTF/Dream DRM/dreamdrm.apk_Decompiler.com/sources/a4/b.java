package a4;

import h5.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b extends d {

    /* renamed from: g  reason: collision with root package name */
    public final Method f204g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f205h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f206i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f207j;

    public b() {
        super((Object) null);
        Class<Class> cls = Class.class;
        this.f204g = cls.getMethod("isRecord", new Class[0]);
        Method method = cls.getMethod("getRecordComponents", new Class[0]);
        this.f205h = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f206i = componentType.getMethod("getName", new Class[0]);
        this.f207j = componentType.getMethod("getType", new Class[0]);
    }

    public final Method c(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final Constructor d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f205h.invoke(cls, new Object[0]);
            Class[] clsArr = new Class[objArr.length];
            for (int i3 = 0; i3 < objArr.length; i3++) {
                clsArr[i3] = (Class) this.f207j.invoke(objArr[i3], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final String[] e(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f205h.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i3 = 0; i3 < objArr.length; i3++) {
                strArr[i3] = (String) this.f206i.invoke(objArr[i3], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final boolean f(Class cls) {
        try {
            return ((Boolean) this.f204g.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
