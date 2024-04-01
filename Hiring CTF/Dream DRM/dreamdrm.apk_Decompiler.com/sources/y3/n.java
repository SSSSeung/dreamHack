package y3;

import a2.m;
import a4.c;
import androidx.fragment.app.q;
import c4.a;
import h5.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class n extends l {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f5876e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f5877b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5878c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5879d = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f5876e = hashMap;
    }

    public n(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        d dVar = c.f208a;
        Constructor d6 = dVar.d(cls);
        this.f5877b = d6;
        c.e(d6);
        String[] e6 = dVar.e(cls);
        for (int i3 = 0; i3 < e6.length; i3++) {
            this.f5879d.put(e6[i3], Integer.valueOf(i3));
        }
        Class[] parameterTypes = this.f5877b.getParameterTypes();
        this.f5878c = new Object[parameterTypes.length];
        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
            this.f5878c[i6] = f5876e.get(parameterTypes[i6]);
        }
    }

    public final Object c() {
        return (Object[]) this.f5878c.clone();
    }

    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5877b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            d dVar = c.f208a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException | InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with args " + Arrays.toString(objArr), e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + c.b(constructor) + "' with args " + Arrays.toString(objArr), e8.getCause());
        }
    }

    public final void e(Object obj, a aVar, k kVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f5879d;
        String str = kVar.f5868c;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b6 = kVar.f5871f.b(aVar);
            if (b6 != null || !kVar.f5872g) {
                objArr[intValue] = b6;
                return;
            }
            StringBuilder k6 = m.k("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            k6.append(aVar.C(false));
            throw new q(k6.toString());
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + c.b(this.f5877b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
