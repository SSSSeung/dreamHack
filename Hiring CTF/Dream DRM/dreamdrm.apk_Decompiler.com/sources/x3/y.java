package x3;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l2.l;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f5764a;

    static {
        y yVar;
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new u(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                yVar = new v(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    yVar = new w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new x();
                }
            }
        }
        f5764a = yVar;
    }

    public static void a(Class cls) {
        String a6 = l.a(cls);
        if (a6 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a6));
        }
    }

    public abstract Object b(Class cls);
}
