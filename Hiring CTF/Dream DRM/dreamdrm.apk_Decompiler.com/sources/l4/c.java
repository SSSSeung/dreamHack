package l4;

import b1.o;
import m4.b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4111a;

    static {
        b bVar;
        Object newInstance;
        b newInstance2;
        Object newInstance3;
        n4.b newInstance4;
        Class<b> cls = b.class;
        try {
            newInstance4 = n4.b.class.newInstance();
            o.l(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
            bVar = newInstance4;
        } catch (ClassCastException e6) {
            ClassLoader classLoader = newInstance4.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!o.c(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e6);
            }
            throw e6;
        } catch (ClassNotFoundException unused) {
            try {
                newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                o.l(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                bVar = (b) newInstance3;
            } catch (ClassCastException e7) {
                ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader4 = cls.getClassLoader();
                if (!o.c(classLoader3, classLoader4)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e7);
                }
                throw e7;
            } catch (ClassNotFoundException unused2) {
                try {
                    newInstance2 = b.class.newInstance();
                    o.l(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    bVar = newInstance2;
                } catch (ClassCastException e8) {
                    ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader6 = cls.getClassLoader();
                    if (!o.c(classLoader5, classLoader6)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e8);
                    }
                    throw e8;
                } catch (ClassNotFoundException unused3) {
                    try {
                        newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        o.l(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                        bVar = (b) newInstance;
                    } catch (ClassCastException e9) {
                        ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader8 = cls.getClassLoader();
                        if (!o.c(classLoader7, classLoader8)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e9);
                        }
                        throw e9;
                    } catch (ClassNotFoundException unused4) {
                        bVar = new b();
                    }
                }
            }
        }
        f4111a = bVar;
    }
}
